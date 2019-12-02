package com.annotation;

class Hewan {
    public void Pemakan(){}
}

class Harimau extends Hewan {
    @Override
    public void Pemakan(){
        System.out.println("Pemakan Daging");
    }
}

class Domba extends Hewan {
    @Override
    public void Pemakan(){
        System.out.println("Pemakan Tumbuhan");
    }
}

class Annotation_Override{
    public static void main(String[] args) {
        Harimau hewan_harimau = new Harimau();
        Domba hewan_domba = new Domba();

        hewan_harimau.Pemakan();
        hewan_domba.Pemakan();
    }
}