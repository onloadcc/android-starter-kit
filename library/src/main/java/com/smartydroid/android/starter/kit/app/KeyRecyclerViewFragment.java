/**
 * Created by YuGang Yang on September 29, 2015.
 * Copyright 2007-2015 Laputapp.com. All rights reserved.
 */
package com.smartydroid.android.starter.kit.app;

import com.smartydroid.android.starter.kit.contracts.Pagination.IdEmitter;
import com.smartydroid.android.starter.kit.contracts.Pagination.Paginator;
import com.smartydroid.android.starter.kit.network.KeyPaginator;

public abstract class KeyRecyclerViewFragment<E> extends RecyclerViewFragment<E>
    implements IdEmitter<E> {

  @Override public Paginator buildPaginator() {
    return new KeyPaginator.Builder<E>()
        .setEmitter(this)
        .setPageCallback(this)
        .build();
  }

  @Override public E register(E item) {
    return item;
  }

  @Override public void beforeRefresh() {
  }

  @Override public void beforeLoadMore() {
  }
}