package com.amazon.aps.iva.ed;

import android.graphics.drawable.Drawable;
/* compiled from: BaseTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class a<Z> implements h<Z> {
    private com.amazon.aps.iva.dd.d request;

    @Override // com.amazon.aps.iva.ed.h
    public com.amazon.aps.iva.dd.d getRequest() {
        return this.request;
    }

    @Override // com.amazon.aps.iva.ed.h
    public void setRequest(com.amazon.aps.iva.dd.d dVar) {
        this.request = dVar;
    }

    @Override // com.amazon.aps.iva.ad.h
    public void onDestroy() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public void onStart() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public void onStop() {
    }

    @Override // com.amazon.aps.iva.ed.h
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public void onLoadStarted(Drawable drawable) {
    }
}
