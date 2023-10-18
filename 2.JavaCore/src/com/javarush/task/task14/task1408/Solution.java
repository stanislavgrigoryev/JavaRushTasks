package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        System.out.println(hen1.getDescription());
        Hen hen2 = HenFactory.getHen(Country.MOLDOVA);
        System.out.println(hen2.getDescription());
        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        System.out.println(hen3.getDescription());


    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();

            }
            return hen;
        }

    }
}


