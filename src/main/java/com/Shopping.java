package com;

import java.util.List;
import java.util.Optional;

/**
 * This class is used for shopping
 */
public class Shopping {

  /**
   * Its used to get the total cost of basket items
   *
   * @param items
   * @return double
   */
  public double basketOfItems(List<Item> items) throws ShoppingException {
    List<Item> items1 = Optional.ofNullable(items)
        .orElseThrow(() -> new ShoppingException("Please try after some time!"));
    return items1.stream().mapToDouble(Item::getPrice).sum();
  }
}
