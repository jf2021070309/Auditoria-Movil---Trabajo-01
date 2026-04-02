package com.amazon.aps.iva.wc;

import android.graphics.drawable.Drawable;
/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: classes.dex */
public final class h extends f<Drawable> {
    @Override // com.amazon.aps.iva.nc.w
    public final int a() {
        T t = this.b;
        return Math.max(1, t.getIntrinsicHeight() * t.getIntrinsicWidth() * 4);
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Class<Drawable> d() {
        return this.b.getClass();
    }

    @Override // com.amazon.aps.iva.nc.w
    public final void b() {
    }
}
