package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 */
@RestController
public class TestController {
  @GetMapping("/test")
  public String test() {
    return "Hello World!";
  }
}