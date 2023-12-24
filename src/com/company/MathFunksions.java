package com.company;

public class MathFunksions {

    public int add(int num1,int num2){return num1+num2;}

    public float add(float num1,float num2){return num1+num2;}

    public int sub(int num1,int num2){return num1-num2;}

    public double sub(double num1,double num2){return num1-num2;}

    public int multiply(int num1,int num2){return num1*num2;}

    public float multiply(float num1,float num2){return num1*num2;}

    public int div(int num1,int num2){return num1/num2;}

    public double div(double num1,double num2){return num1/num2;}

    public float abs(float num){
        if(num<0){
            return num*(-1);
        }else{
            return num;
        }
    }

    public int abs(int num){
        if(num<0){
            return num*(-1);
        }else{
            return num;
        }
    }

    public double pow(double num){return num*num;}

    public int pow(int num){return num*num;}
}
