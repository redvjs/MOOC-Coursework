/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vico Schot
 */
public class Fitbyte {
    private int age;
    private int rHR;
    
    public Fitbyte (int age, int rHR){
        this.age = age;
        this.rHR = rHR;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return ((206.3 - (0.711 * this.age)) - this.rHR) * percentageOfMaximum +  rHR;
    }
}
