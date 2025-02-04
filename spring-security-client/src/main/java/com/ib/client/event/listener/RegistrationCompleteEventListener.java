package com.ib.client.event.listener;

import com.ib.client.entity.User;
import com.ib.client.event.RegistrationCompleteEvent;
import com.ib.client.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Slf4j
@Component
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {

    @Autowired
    private UserService userService;

    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        //Create the Verification Token for the User with Link
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        userService.saveVerificationTokenForUser(token, user);
        //Send Mail to User
        String url = event.getApplicationUrl() + "/verifyRegistration?token="+token;

        //sendVerificationEmailMethod()
     log.info("Click the link to verify your account: {}",url);
    }
}
