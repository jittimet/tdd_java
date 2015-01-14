package com.ais.controller;

import com.ais.service.CaptchaService;

/**
 * Created by enterprise on 1/14/15 AD.
 */
public class CaptchaController {
    private CaptchaService captchaService;
    public String getCaptcha() throws Exception {

        return captchaService.getCaptcha();
    }

    public void setCaptchaService(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }
}
