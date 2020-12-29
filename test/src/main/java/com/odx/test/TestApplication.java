/*
 * ©  2019 Optum, Inc. - All Rights Reserved. Your use of this product is
 *  governed by the terms of your company's agreement. You may not use or
 *  disclose this product, or allow others to use it or disclose it, except as
 *  permitted by your agreement with Optum.
 */
package com.odx.test;

import javax.swing.Spring;

//import com.apple.eawt.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.ThemeTag;

/**
 *
 **/
@SpringBootApplication
public class TestApplication{
        public static void main(String[] args) {
            SpringApplication.run(TestApplication.class, args);
        }
}


