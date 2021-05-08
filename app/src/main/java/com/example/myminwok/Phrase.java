package com.example.myminwok;

public class Phrase {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mAudioResourceId;

    public Phrase(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getAudioResourceId(){ return mAudioResourceId;}
}
