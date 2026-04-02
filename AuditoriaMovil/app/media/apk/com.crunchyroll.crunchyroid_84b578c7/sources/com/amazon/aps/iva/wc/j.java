package com.amazon.aps.iva.wc;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.nc.w;
import java.io.IOException;
/* compiled from: UnitDrawableDecoder.java */
/* loaded from: classes.dex */
public final class j implements com.amazon.aps.iva.kc.j<Drawable, Drawable> {
    @Override // com.amazon.aps.iva.kc.j
    public final w<Drawable> a(Drawable drawable, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new h(drawable2);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final /* bridge */ /* synthetic */ boolean b(Drawable drawable, com.amazon.aps.iva.kc.h hVar) throws IOException {
        return true;
    }
}
