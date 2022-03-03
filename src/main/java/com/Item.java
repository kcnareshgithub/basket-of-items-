package com;

public interface Item {

  default double getPrice() {
    return 0;
  }

  static void printShopName() {
    System.out.println("Welcome To Indian Shopping!");
  }
}
