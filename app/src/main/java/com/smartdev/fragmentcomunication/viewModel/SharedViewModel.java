package com.smartdev.fragmentcomunication.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    /*Definisanje promenjivog objekta koji predstavlja tekst*/
    private MutableLiveData<String> mText = new MutableLiveData<>();

    /*dobijanje reference na promenjiv objekat*/
    public LiveData<String> getTextLiveDataObject() {
        return mText;
    }

    /*definisanje vrednosti objekta*/
    public void setUnos(String text) {
        this.mText.setValue(text);
    }
}