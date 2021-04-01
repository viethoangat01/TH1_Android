package com.example.th1_android.utils;

public class Function {
    public static boolean checkEmpty(String a, String b){
        if(a.length()==0||b.length()==0) return true;
        else return false;
    }
    public static boolean isFloat(float value){
        if(value==Math.round(value)){
            return false;
        }else {
            return true;
        }
    }
    public static float calAdd(String a,String b){
        float numberA=Float.parseFloat(a);
        float numberB=Float.parseFloat(b);
        return numberA+numberB;
    }
    public static float calSub(String numberA,String numberB){
        float a=Float.parseFloat(numberA);
        float b=Float.parseFloat(numberB);
        return a-b;
    }
    public static float calMul(String numberA,String numberB){
        float a=Float.parseFloat(numberA);
        float b=Float.parseFloat(numberB);
        return a*b;
    }
    public static float calDiv(String numberA,String numberB){
        float a=Float.parseFloat(numberA);
        float b=Float.parseFloat(numberB);
        if(b!=0){
            return a/b;
        }
        return 0;
    }
}
