package ru.stqa.pft.sandbox;

/**
 * Created by sgorbut on 01.11.2016.
 */
public class Square {
    public double l;

    public Square (double l){
        this.l=l;
    }

    public double area(){
        return this.l * this.l;
    }
}
