package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone this is someone
   * @return greeting this is what gets returned
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
