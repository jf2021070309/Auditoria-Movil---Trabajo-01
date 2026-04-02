package com.amazon.aps.iva.ed;

import android.graphics.drawable.Drawable;
/* compiled from: Target.java */
/* loaded from: classes.dex */
public interface h<R> extends com.amazon.aps.iva.ad.h {
    com.amazon.aps.iva.dd.d getRequest();

    void getSize(g gVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, com.amazon.aps.iva.fd.d<? super R> dVar);

    void removeCallback(g gVar);

    void setRequest(com.amazon.aps.iva.dd.d dVar);
}
