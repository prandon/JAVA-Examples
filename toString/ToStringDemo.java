package com.training;
class Complex{
    private int real;
    private int imag;
    public Complex(){
        System.out.println("Default constructor is called");
        real=imag=0;
    }
    public Complex(int real,int imag){
        System.out.println("Parameterised constructor is called");
        this.real=real;
        this.imag=imag;
    }
//    public void show(){
//        System.out.println("REAL "+real+"Imag"+imag);
//    }

    public String toString(){
        return "REAL "+real+"Imag "+imag;
    }
}
public class ToStringDemo {
    public static void main(String[] args) {
        Complex c1=new Complex(100,200);
        //c1.show();
        System.out.println(c1);

    }

}

