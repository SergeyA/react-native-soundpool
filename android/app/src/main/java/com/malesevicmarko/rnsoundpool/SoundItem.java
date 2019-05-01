package com.malesevicmarko.rnsoundpool;

/**
 * SoundItem will be passed to the SoundThread which
 * will handle the playing of sounds
 *
 * @author soh#zolex
 *
 */
public class SoundItem {
    public soundID;
    public volume;

    /**
     * Default constructor
     *
     * @param soundID
     * @param volume
     */
    public SoundItem(int soundID, float volume) {

        this.soundID = soundID;
        this.volume = volume;
    }
}