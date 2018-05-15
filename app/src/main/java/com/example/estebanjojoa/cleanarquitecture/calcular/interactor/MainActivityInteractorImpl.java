package com.example.estebanjojoa.cleanarquitecture.calcular.interactor;

import com.example.estebanjojoa.cleanarquitecture.calcular.presenter.MainActivityPresenter;

/**
 * Created by ESTEBAN JOJOA on 15/05/2018.
 */

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }



    @Override
    public void sumar(String numero1, String numero2) {
        if(numero1.isEmpty() || numero2.isEmpty()){
            presenter.showError("DIGITE NUMEROS CORECTAMENTE");
        }
        Integer result= Integer.valueOf(numero1) + Integer.valueOf(numero2);
        presenter.showResultado(String.valueOf(result));
    }
}
