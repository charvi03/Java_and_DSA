package OOPS;

public class getters_and_setters {
    public static void main(String[] args) {
        Pens p1 = new Pens(); //constructor
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class Pens {
    private String color;
    private int tip;

    //getters
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    //setters
    void setColor(String newColor) {
        color = newColor;
        //this.color=newColor
    }

    void setTip(int newTip) { //external variable
        tip = newTip;

    }
}
