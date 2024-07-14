package org.kamtech;

import org.kamtech.service.WCServices;

/**
 * @author Dilane FOGUE KAMGA <dilanekamga777@gmail.com>
 */
public class Main {
  public static void main(String[] args) {
    if (args.length < 1) {
      System.out.println("Usage: ccwc [-c|-l|-w|-m] <filename>");
      return;
    }

    var option = args.length == 2 ? args[0] : "";
    var filePath = args.length == 2 ? args[1] : args[0];
    var myServices = new WCServices(option);
    myServices.myServices(filePath);
  }
}
