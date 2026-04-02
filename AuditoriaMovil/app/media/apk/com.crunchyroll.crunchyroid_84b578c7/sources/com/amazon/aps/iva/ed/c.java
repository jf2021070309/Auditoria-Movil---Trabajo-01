package com.amazon.aps.iva.ed;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.hd.l;
/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {
    public final int b;
    public final int c;
    public com.amazon.aps.iva.dd.d d;

    public c() {
        if (l.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // com.amazon.aps.iva.ed.h
    public final com.amazon.aps.iva.dd.d getRequest() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void getSize(g gVar) {
        gVar.b(this.b, this.c);
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void setRequest(com.amazon.aps.iva.dd.d dVar) {
        this.d = dVar;
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onDestroy() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStart() {
    }

    @Override // com.amazon.aps.iva.ad.h
    public final void onStop() {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadFailed(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // com.amazon.aps.iva.ed.h
    public final void removeCallback(g gVar) {
    }
}
