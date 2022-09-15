package com.example.atmconsultoria.ui.clientes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClientesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ClientesViewModel()
    {
        mText = new MutableLiveData<>();
        mText.setValue("Essa é a tela de clientes");
    }

    public LiveData<String> getText() {
        return mText;
    }
}