package ua.univer.lesson08;

import ua.univer.lesson08.controller.LogController;
import ua.univer.lesson08.model.RoundAble;
import ua.univer.lesson08.model.impl.Round;
import ua.univer.lesson08.model.impl.RoundHole;
import ua.univer.lesson08.model.impl.Square;
import ua.univer.lesson08.service.FitService;
import ua.univer.lesson08.util.SquareToRoundAdapter;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        Round rpeg = new Round(5);
        LogController.logTxtFile(FitService.fitRound(hole, rpeg));

        Square smallSqPeg = new Square(2);
        Square largeSqPeg = new Square(20);

        LogController.logConsole(FitService.fitRound(hole, new SquareToRoundAdapter(smallSqPeg)));
        LogController.logConsole(FitService.fitRound(hole, new SquareToRoundAdapter(largeSqPeg)));

        RoundAble[] roundAbles = new RoundAble[3];
        roundAbles[0]=hole;
        roundAbles[1]=rpeg;
        roundAbles[2]= new SquareToRoundAdapter(smallSqPeg);


        int[] mas ={23,54,1,67};
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));

        RoundAble[] roundAbles1 = {hole,rpeg, new SquareToRoundAdapter(smallSqPeg)};
        Arrays.sort(roundAbles1);
        System.out.println(Arrays.toString(roundAbles1));

    }


}
