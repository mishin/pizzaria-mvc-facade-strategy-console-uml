package com.company.Controllers;

import com.company.Models.Subject;
import com.company.Views.View;

/**
 * Created by denis on 21/09/15.
 */
public class ReservaDuasPessoas implements Reserva {
    private Subject subject;
    private View view;

    public ReservaDuasPessoas(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    @Override
    public void reservar(int num, String cliente) {
        subject.reservarDuasPessoas(num,cliente);

    }
}
