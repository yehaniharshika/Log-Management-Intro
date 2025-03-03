package lk.ijse.logmanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

    @GetMapping("/log")
    String getLog(){
        logger.debug("This is a DEBUG log message");
        logger.info("This is a INFO log message");
        logger.error("This is a ERROR log message");
        logger.warn("This is a WARNING log message");

        try {
            throw  new RuntimeException("Hello,I'm exception");
        }catch (RuntimeException e){
            logger.error("you have RuntimeException : {}",e.getMessage());
        }
        return "Log messages generated!";
    }

}
