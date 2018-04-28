import java.util.ArrayList;
import  java.util.Random;

/**
 * @author Osipov Ivan, student
 */
public class Task5 {
    public static float weightOfGift; //общий вес
    public static double costOfGift;  //общая стоимость

    /**
     * Method, which return weight of the gift.
     * @return weightOfGift;
     */
    public static String getWeightOfGift() {
        return "Общий вес подарка составляет: "+ weightOfGift+" грамм";
    }

    /**
     * Method, which return costing of the gift.
     * @return costOfGift;
     */
    public static String getCostOfGift() {
        return "Общая стоимость подарка составляет: "+ costOfGift+"$";
    }

    /***
     * Часть подарка/сладость.
     */
    public static class PartOfGift {
            public float weight;    //вес сладости
            public double cost$;    //стоимость сладости
            public String specialProp;  //особое свойство сладости

            public PartOfGift(){ //конструктор по умолчанию
            }

            public PartOfGift(float weight,double cost$, String specialProp){   //конструктор с параметрами
                weightOfGift = weightOfGift +weight;
                costOfGift = costOfGift+cost$;
                this.weight = weight;
                this.cost$=cost$;
                this.specialProp=specialProp;
            }

        /**
         * Method, which return string value of part of gift(specialproperty,weight,costing)
         * @return String value;
         */
        @Override
        public String toString() {
            return "В подарок входит сладость: "+this.specialProp+"\n"+"Ее вес(грамм): "+this.weight+"\n"+"Цена: "+this.cost$+"\n";
        }
    }
    /***
     * Мармелад
     */
    public static class Jelly extends PartOfGift{
        public Jelly(){ } //конструктор по умолчанию
        public Jelly(float weight, double cost$, String specialProp){ //конструктор с параметрами
            super(weight,cost$,specialProp);

        }
    }
    /***
     * Конфеты
     */
    public static class Candy extends PartOfGift{
        public Candy(){ }   //конструктор по умолчанию
        public Candy(float weight, double cost$, String specialProp){   //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Леденец
     */
    public static class Lollipop extends PartOfGift{
        public Lollipop(){ }    //конструктор по умолчанию
        public Lollipop(float weight, double cost$, String specialProp){    //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Жвачка
     */
    public static class Gum extends PartOfGift{
        public Gum(){ } //конструктор по умолчанию
        public Gum(float weight, double cost$, String specialProp){ //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }
    /***
     * Шоколадка
     */
    public static class Chocolate extends PartOfGift{
        public Chocolate(){ }   //конструктор по умолчанию
        public Chocolate(float weight, double cost$, String specialProp){   //конструктор с параметрами
            super(weight,cost$,specialProp);
        }
    }

    /***
     * main method
     */
    public static void main(String[] args) {
        //1 вариант: Заполняем подарок в ручную

        ArrayList<PartOfGift> podarok = new ArrayList<>();
         PartOfGift first = new Jelly(100,2,"Вкусный малиновый мармелад");
        PartOfGift second = new Gum(40,1,"Тянущаяся фруктовая жвачка");
        PartOfGift third = new Lollipop(25,0.5,"Вредный для зубов леденец");
        PartOfGift fourth = new Candy(120,1.8,"Конфеты в глазури с карамельной начинкой");
        PartOfGift fifth = new Chocolate(220,5,"Плитка белого бельгийского щоколада с орехами");
        podarok.add(first);
        podarok.add(second);
        podarok.add(third);
        podarok.add(fourth);
        podarok.add(fifth);


        //2 вариант: Заполняем подарок рандомно
        Random random =  new Random();
        for(int i=0;i<5;i++){                //в цикле из пяти итераций, в зависимости от значений полученных рандомно, создаем объекты сладостей и добавляем в подарок.
            switch(random.nextInt(5)+1){
                case (1): podarok.add(new Jelly(100,2,"Вкусный малиновый мармелад")); continue;
                case (2): podarok.add(new Gum(40,1,"Тянущаяся фруктовая жвачка")); continue;
                case (3): podarok.add(new Lollipop(25,0.5,"Вредный для зубов леденец")); continue;
                case (4): podarok.add(new Candy(120,1.8,"Конфеты в глазури с карамельной начинкой")); continue;
                case (5): podarok.add(new Chocolate(220,5,"Плитка белого бельгийского щоколада с орехами")); continue;
            }
        }
        //пробегаем по каждой сладости в подарке и выводим информацию о каждой конкретной
        for(PartOfGift x: podarok){
            System.out.println(x.toString());
        }
        //общая стоимость и вес подарка
        System.out.println(getWeightOfGift()+"\n"+getCostOfGift());

    }
}
