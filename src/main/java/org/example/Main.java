package org.example;
interface car {
    public void drive();
}
class benz implements car{
    public void drive() {
        System.out.println("Driving");
    }
}
class Main{
    public static void main(String[] args) {
        benz obj=new benz();
        obj.drive();
    }
}