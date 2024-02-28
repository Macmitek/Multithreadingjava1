package com.revision;
//nested els eif conition
public class nestedIf {
    public static void main(String[] args) {
        int age = 23;
        if(age <50){
            System.out.println("Nice your age is less than 50 but are you young girl or women");
            if(age>=18 && age < 45){
                System.out.println("Okay nice you are prodh stree");
            }
            if(age<18) {
                System.out.println("Your are teen girl");
            }
        }
    }
}

