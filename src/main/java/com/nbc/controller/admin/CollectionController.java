package com.nbc.controller.admin;

import com.nbc.controller.AbstractController;
import com.nbc.model.Collections;
import com.nbc.services.CollectionServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * CollectionController
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: CollectionController.java Jan 13, 2017 23:47:29 nbccong $
 * @since 1.0
 */
@Controller("CollectionController")
@Transactional
public class CollectionController extends AbstractController<Collections> {

  @Autowired
  private CollectionServiceImpl collectionService;

  @RequestMapping(value = "/collection/add", method = RequestMethod.POST)
  public @ResponseBody Collections addCollection(HttpServletRequest request) {
    logger.debug("Adding new item");
    final Collections item = new Collections();
    item.setName(getString(request, "name"));
    item.setIconCls(getString(request, "iconCls"));
    item.setParentId(getObjectId(request, "parentId"));
    item.setId(collectionService.add(item));
    return item;
  }

  @RequestMapping(value = "/collection/update", method = RequestMethod.POST)
  public @ResponseBody Collections updateCollection(HttpServletRequest request) {
    final ObjectId id = getObjectId(request, "id");
    Collections item = getModel(request, Collections.class);
    logger.debug(item);
    final Collections model = collectionService.get(id);
    if (model != null) {
      model.setName(getString(request, "name"));
      model.setIconCls(getString(request, "iconCls"));
      model.setParentId(getObjectId(request, "parentId"));
      collectionService.update(id, model);
      return model;
    }
    return null;
  }

}
