package com.example.atmconsultoria.ui.sobre;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.atmconsultoria.R;
import com.example.atmconsultoria.databinding.FragmentSobreBinding;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment
{
    private FragmentSobreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        String descricao = "De fato, inserir qualquer texto de fantasia ou um texto famoso, " +
                "seja um poema, um discurso, uma passagem literária, o texto de uma música, " +
                "etc., nosso gerador de texto fornecerá a extração aleatória de termos e " +
                "etapas para compor o seu exclusivo Lorem Ipsum.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("sabino-91@hotmail.com","Envie um e-mail")
                .addWebsite("https://www.loremipzum.com/pt/gerador-de-texto","Acesse nosso site")
                .addGroup("Redes sociais")
                .addFacebook("Google","Facebook")
                .addInstagram("google","Instagram")
                .addTwitter("google","Twitter")
                .addYoutube("ProgrameparaAndroid","YouTube")
                .addGitHub("guilhermesabinoqueiroz","GitHub")
                .addPlayStore("com.supercell.clashroyale","Download")
                .addItem(versao)
                .create();



//        SobreViewModel sobreViewModel = new ViewModelProvider(this).get(SobreViewModel.class);
//        binding = FragmentSobreBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
//        return root;
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }

}