package com.ais.service;

import com.ais.captcha.Captcha;
import com.ais.captcha.Randomizer;
import com.ais.log.FileLogger;
import com.ais.log.Logger;

import java.io.IOException;
import java.util.Date;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class CaptchaService {
    private Randomizer randomizer;

    private Logger logger;

    public CaptchaService() throws IOException {
        this.randomizer = new Randomizer();
    }

    public Randomizer getRandomizer() {
        return randomizer;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public String getCaptcha() throws Exception {
        int pattern = randomizer.getPattern();
        int leftOperand = randomizer.getOperand();
        int operator = randomizer.getOperator();
        int rightOperand = randomizer.getOperand();

        Captcha captcha = new Captcha(pattern, leftOperand, operator,rightOperand);

        logger.persist("WIFI",new Date().toString());

        return captcha.getCaptcha();
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
