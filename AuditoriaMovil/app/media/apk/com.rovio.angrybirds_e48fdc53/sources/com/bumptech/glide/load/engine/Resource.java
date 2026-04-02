package com.bumptech.glide.load.engine;
/* loaded from: classes6.dex */
public interface Resource<Z> {
    Z get();

    Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
