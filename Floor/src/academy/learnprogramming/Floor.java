package academy.learnprogramming;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        if(width < 0){
            width = 0d;
        }
        if(length < 0){
            length = 0d;
        }
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

}

