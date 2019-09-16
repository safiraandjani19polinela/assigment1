package com.enigma.model;
import java.util.Arrays;
public class Robot {
    private Integer postX;
    private Integer postY;
    private final String FORWARD = "F";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private final String BACKWARD = "B";
    private char[] commands;
    Directions directions;

    public Robot(Integer x, Integer y, Directions directions) {
        this.postX = x;
        this.postY = y;
        this.directions = directions;
    }

    public void commands(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            this.commands = commands.toCharArray();
        }
    }
//INI METHOD UNTUK MENENTUKAN ARAH FORWARD//
        public void forward() {
        if (directions.equals(Directions.NORTH)) {
            this.postY++;
            this.directions=Directions.NORTH;

        } else if (directions.equals(Directions.WEST)) {
            this.postX--;
            this.directions=Directions.WEST;

        } else if (directions.equals(Directions.SOUTH)) {
            this.postX++ ;
            this.directions=Directions.SOUTH;

        } else if (directions.equals(Directions.EAST)) {
            this.postY--;
            this.directions=Directions.EAST;
        }
            System.out.println("SALAH ARAH");
        }

    //    INI METHOD UNTUK KE KIRI//
         public void turnLeft() {
            this.directions = this.directions.getLeft();
             }
    //INI METHOD UNTUK KE KANAN//
         public  void turnRight() {
            this.directions = this.directions.getRight();
    }
//BARIS 58-67 MENENTUKAN GERAK ARAH//
        public void move(String movement,Directions directions){
        switch(movement){
            case FORWARD:
        forward();
        break;
        case RIGHT:
        turnRight();
        break;
        case LEFT:
        turnLeft();
        break;
        default :
        System.out.println("Invalid move");
        }
        }
    public void run(){
        for (int i = 0; i < this.commands.length; i++) {
            move(String.valueOf(this.commands[i]),this.directions);
            System.out.println(this.commands[i] + getPotition()+this.directions);
        }
    }
    public String getPotition(){
        return  "(" + this.postX + "," + this.postY+ ")";
    }
    public String print() {
        return "Robot{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", commands=" + Arrays.toString(commands) +
                ", direction=" + directions +
                '}';
    }
}

