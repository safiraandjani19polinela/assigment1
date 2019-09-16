    package com.enigma.model;
    public enum Directions {
    NORTH ,
    EAST,
    SOUTH,
    WEST ;
        //INI UNTUK ARAH GERAK KE KIRI//
        public Directions getLeft() {
            return Directions.values()[(ordinal()+3) % 4];
        }
        //INI UNTUK ARAH GERAK KE KANAN//
        public Directions getRight(){
            return  Directions.values()[(ordinal()+1)%4];
            }

            }


