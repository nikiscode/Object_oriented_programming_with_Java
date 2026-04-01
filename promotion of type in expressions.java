package com.dataflair.typeconversion;
public class TypePromotionExpression {
public static void main(String[] args) {
System.out.println("This program will illustrate the automatic type promotion of Java");
int a=76;
long l=65123l;
float f = 70.26f;
double d=98.9898d;
char c='z';
System.out.println(a+c/d-f+l);
}
}
