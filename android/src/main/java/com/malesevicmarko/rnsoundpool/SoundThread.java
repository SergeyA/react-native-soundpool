package com.malesevicmarko.rnsoundpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import android.media.SoundPool;

/**
 * Thread for playing sounds
 *
 * @author soh#zolex
 *
 */
public class SoundThread extends Thread {
    private SoundPool soundPool;
    public BlockingQueue<SoundItem> sounds = new LinkedBlockingQueue<SoundItem>();

    public SoundThread(SoundPool soundPool) {
        this.soundPool = soundPool;
    }

    @Override
    /**
     * Wait for sounds to play
     */
    public void run() {
        try {
            SoundItem item;
            while (true) {
                item = this.sounds.take();
                this.soundPool.play(item.soundID, item.volume, item.volume, 0, 0, 1);
            }
        } catch (InterruptedException e) {}
    }
}