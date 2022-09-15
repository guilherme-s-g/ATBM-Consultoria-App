package com.example.atmconsultoria.ui.contato;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContatoViewModel extends ViewModel
{
    private final MutableLiveData<String> mText;

    public ContatoViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Essa é a tela de contato!");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}