package com.nbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * TestController
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: TestController.java Dec 30, 2016 13:29:58 nbccong $
 * @since 1.0
 */

@Controller
public class TestController {
  @RequestMapping("/test")
  public String test() {
    return "test";
  }
}
