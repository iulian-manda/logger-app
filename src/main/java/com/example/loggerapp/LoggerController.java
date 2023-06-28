package com.example.loggerapp;

import com.example.logger.Logger;
import com.example.logger.LoggerFactory;
import com.example.logger.enums.Level;
import com.example.logger.enums.Target;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

  @GetMapping("/hello")
  public String hello() {
    Logger logger = LoggerFactory.getInstance();
    logger.setLevel(Target.CONSOLE, Level.DEBUG);
    logger.setLevel(Target.EMAIL, Level.WARNING);

    logger.debug("Test");
    logger.info("Test");
    logger.warning("Test");
    logger.error("Test");

    return "Hello World!";
  }
}
