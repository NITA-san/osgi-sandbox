package com.example;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorldService implements BundleActivator {
  public void start(BundleContext ctx) {
    System.out.println("Hello world.");
  }
  public void stop(BundleContext bundleContext) {
    System.out.println("Goodbye world.");
  }
}
