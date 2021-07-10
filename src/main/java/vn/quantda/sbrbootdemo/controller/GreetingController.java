package vn.quantda.sbrbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.quantda.sbrbootdemo.domain.Greeting;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
  private final Greeting greeting;

  public GreetingController(Greeting greeting) {
    this.greeting = greeting;
  }

  @GetMapping
  String getGreeting() {
    return greeting.getName();
  }

  @GetMapping("/coffee")
  String getCoffee() {
    return greeting.getCoffee();
  }
}
