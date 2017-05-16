package myproject.services;

import myproject.aspects.InvocationLogged;

public interface Calculator {

    @InvocationLogged
    String sum(double a, double b);

    String sub(double a, double b);

    String div(double a, double b);

    @InvocationLogged
    String mul(double a, double b);

}
