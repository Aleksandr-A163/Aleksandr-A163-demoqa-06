package Anosov;


public class FirstJavaCode {
  public static void main(String... args) {

      // Работа с типом byte
      byte aByte = -120;
      byte bByte = 50;
      byte xByte = (byte) (aByte+bByte);
      System.out.println(xByte);

      // Работа с типом целочисленный
      int aInt = 4000000;
      int xInt = (int) (aInt*1000);
      System.out.println(xInt);

      // Работа с числами с плавающей точкой
      float aFloat = (float) (3.4 * Math.pow(10,38));
      float aFloat1 = aFloat + aFloat;
      System.out.println(aFloat1);

      //Работа с логическим типом данных и операторами сравнения
      boolean boleanA = true;
      boolean boleanB = false;
      System.out.println("true && false = " + (boleanA && boleanB) );
      System.out.println("true || false = " + (boleanA || boleanB) );
      System.out.println("!true = " + (!boleanA) );

      // Работа с числами с разными типами данных
      int a = 9;
      double b = 4.4;
      System.out.println(a / b);
  }
}
