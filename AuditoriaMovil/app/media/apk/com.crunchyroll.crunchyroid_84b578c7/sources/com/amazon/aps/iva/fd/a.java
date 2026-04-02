package com.amazon.aps.iva.fd;

import android.graphics.drawable.Drawable;
/* compiled from: DrawableCrossFadeFactory.java */
/* loaded from: classes.dex */
public final class a implements e<Drawable> {
    public final int a;
    public b b;

    public a(int i) {
        this.a = i;
    }

    @Override // com.amazon.aps.iva.fd.e
    public final d a(com.amazon.aps.iva.kc.a aVar) {
        if (aVar == com.amazon.aps.iva.kc.a.MEMORY_CACHE) {
            return c.a;
        }
        if (this.b == null) {
            this.b = new b(this.a, false);
        }
        return this.b;
    }
}
