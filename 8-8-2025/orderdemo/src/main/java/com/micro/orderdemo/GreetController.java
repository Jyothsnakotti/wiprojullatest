package com.micro.orderdemo; 
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RestController; 
@RestController 
public class GreetController { 
    private static final Logger logger = LoggerFactory.getLogger(GreetController.class); 
 
    @GetMapping("/greet") 
    public String greet() { 
        logger.trace("TRACE: entering greet()"); 
        logger.debug("DEBUG: preparing greeting"); 
        logger.info("INFO: about to return greeting"); 
        logger.warn("WARN: this is a sample warn message"); 
        logger.error("ERROR: this is a sample error message"); 
        return "Hello — check the console and logs/logdemo.log for log lines!"; 
    } 
} 