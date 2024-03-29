package com.client.demo.controllers;

import com.schemas.modelRest.TimerWebhookResponse;
import com.schemas.modelRest.WebhookTimerRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController implements com.schemas.timerRest.ApiRest {
    Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Override
    public ResponseEntity<TimerWebhookResponse> startNewTimerCountdown(WebhookTimerRequest webhookTimerRequest) {
        return new ResponseEntity<>(new TimerWebhookResponse().message("webhook created"),
                HttpStatus.OK);
    }
}
