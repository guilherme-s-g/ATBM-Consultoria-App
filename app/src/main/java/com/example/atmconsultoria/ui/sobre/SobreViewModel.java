package com.example.atmconsultoria.ui.sobre;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SobreViewModel extends ViewModel
{
    private final MutableLiveData<String> mText;

    public SobreViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Essa é a tela de serviços");
    }

    public LiveData<String> getText()
    {
        return mText;
    }
}