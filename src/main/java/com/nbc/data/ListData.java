package com.nbc.data;

import java.util.List;

/**
 * ListData
 *
 * @author <a href="mailto:nbccong@inetcloud.vn">Chi Cong Nguyen</a>
 * @version $Id: ListData.java Jan 13, 2017 23:19:37 nbccong $
 * @since 1.0
 */
public class ListData<T> {
  private List<T> items;
  private int total;

  public ListData(List<T> items) {
    this.items = items;
    this.total = items.size();
  }

  public List<T> getItems() {
    return items;
  }

  public void setItems(List<T> items) {
    this.items = items;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }
}
