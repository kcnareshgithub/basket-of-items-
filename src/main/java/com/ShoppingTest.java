package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ShoppingTest {

  private Shopping shopping = new Shopping();

  @Test
  public void testBasketOfItems() throws ShoppingException {
    double expectedCost = 150;
    List<Item> items = getSampleItems();

    Item.printShopName();

    double actualCost = shopping.basketOfItems(items);

    assertEquals(actualCost, expectedCost);
  }

  @Test
  public void testBasketOfItems_Null() throws ShoppingException {

    ShoppingException shoppingException = assertThrows(
        ShoppingException.class,
        () -> shopping.basketOfItems(null),
        "Please try after some time!"
    );
  }


  private List<Item> getSampleItems() {
    List<Item> items = new ArrayList();

    Banana banana1 = new Banana();
    Orange orange1 = new Orange();
    Apple apple1 = new Apple();
    Lemon lemon1 = new Lemon();
    Peache peache1 = new Peache();

    items.add(banana1);
    items.add(orange1);
    items.add(apple1);
    items.add(lemon1);
    items.add(peache1);
    return items;
  }
}
