package com.nbc.controller;

import com.nbc.model.LogItem;
import com.nbc.services.LogItemServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * LogItemController
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: LogItemController.java Dec 29, 2016 00:19:59 nbccong $
 * @since 1.0
 */
@Controller
@Transactional
public class LogItemController extends AbstractController {
  private static final Logger logger = Logger.getLogger(LogItemController.class);
  @Autowired
  private LogItemServiceImpl service;

  @RequestMapping(value = "/add/item", method = RequestMethod.GET)
  public String addItem(HttpServletRequest request) {
    logger.debug("Adding new item");
    service.add(new LogItem(getString(request, "message")));
    return "test";
  }
}
