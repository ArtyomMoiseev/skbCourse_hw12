package com.lab.skbcourse_hw12;

import com.lab.skbcourse_hw12.message.SimpleMessageSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class SkbCourseHw12Application {

    public static void main(String[] args) throws InterruptedException {

        var context = SpringApplication.run(SkbCourseHw12Application.class, args);
        var sender = context.getBean(SimpleMessageSender.class);
        var random = new Random();
        while (true) {
          var number = random.nextInt();
          System.out.println(String.format("Generate and send string: %s", number));
          sender.SendNumberMessage(Integer.toString(number));
          Thread.sleep(1000);
        }
    }


}
