package ua.univer.lesson08.service;

import ua.univer.lesson08.model.RoundAble;

public class FitService {

    public static String fitRound(RoundAble hole, RoundAble rpeg) {
        if (hole.getRadius() >= rpeg.getRadius()) {
           return rpeg.getRadius()+" fits round hole "+hole.getRadius();
        }
        else{
           return rpeg.getRadius()+" not fits hole "+hole.getRadius();
        }
    }
}
