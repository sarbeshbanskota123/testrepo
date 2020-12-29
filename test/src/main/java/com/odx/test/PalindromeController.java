package com.odx.test;
//import com.odx.test.dao.demorepository;

import com.odx.test.service.demoservice;
import com.odx.test.entity.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.tags.ThemeTag;

@RestController
public class PalindromeController {

    @Autowired
    demoservice service;
    
    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }

    @GetMapping("/getLongestPalindrome")
    public String getLongestPalindrom(@RequestParam(value="s") String s) {
        
        if (s.isEmpty()) {
            return null;
        }
     
        if (s.length() == 1) {
            return s;
        }
     
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            // get longest palindrome with center of i
            String tmp = helper(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
     
            // get longest palindrome with center of i, i+1
            tmp = helper(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
     
        demo palindrome = new demo(longest);
        service.save(palindrome);
        return longest;
    
    }
}
