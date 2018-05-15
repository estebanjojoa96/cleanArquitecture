package com.example.estebanjojoa.cleanarquitecture.calcular.presenter;

import com.example.estebanjojoa.cleanarquitecture.calcular.interactor.MainActivityInteractor;
import com.example.estebanjojoa.cleanarquitecture.calcular.view.MainActivity;
import com.example.estebanjojoa.cleanarquitecture.calcular.view.MainActivityView;

/**
 * Created by ESTEBAN JOJOA on 15/05/2018.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {
    private MainActivityInteractor interactor;
    private MainActivityView view;

    public MainActivityPresenterImpl(MainActivityInteractor interactor) {
        this.interactor = interactor;
        view = new MainActivity();
    }



    @Override
    public void showResultado(String result) {
            view.showResult(result);
    }

    @Override
    public void showError(String error) {
        view.showError(error);
    }

    @Override
    public void suma(String num1, String num2) {
        interactor.sumar(num1,num2);
    }
}
