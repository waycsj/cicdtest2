package org.example.cicdtest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  @GetMapping("/")
  public String main() {
    return "This is ciditest-02 자동배포";
  }
  }

