package myproject.services;

import myproject.aspects.InvocationLogged;
import org.springframework.stereotype.Service;


@Service
public class SimpleCalculator implements Calculator{

    @InvocationLogged
    public String sum(double a, double b) {
        if (String.valueOf(a+b).endsWith(".0")){
            return String.valueOf(a+b).replace(".0", "") ;
        }
        return String.valueOf(a+b) ;
    }

    public String sub(double a, double b) {
        if (String.valueOf(a-b).endsWith(".0")){
            return String.valueOf(a-b).replace(".0", "") ;
        }
        return String.valueOf(a-b) ;
    }

    public String div(double a, double b) {
        if (String.valueOf(a/b).endsWith(".0")){
            return String.valueOf(a/b).replace(".0", "") ;
        }
        return String.valueOf(a/b) ;
    }

    @InvocationLogged
    public String mul(double a, double b) {
        if (String.valueOf(a*b).endsWith(".0")){
            return String.valueOf(a*b).replace(".0", "") ;
        }
        return String.valueOf(a*b) ;
    }

}
