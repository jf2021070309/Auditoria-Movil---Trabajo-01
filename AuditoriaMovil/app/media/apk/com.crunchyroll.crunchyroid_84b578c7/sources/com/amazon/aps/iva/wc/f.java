package com.amazon.aps.iva.wc;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.nc.s;
import com.amazon.aps.iva.nc.w;
/* compiled from: DrawableResource.java */
/* loaded from: classes.dex */
public abstract class f<T extends Drawable> implements w<T>, s {
    public final T b;

    public f(T t) {
        defpackage.i.l(t);
        this.b = t;
    }

    @Override // com.amazon.aps.iva.nc.w
    public final Object get() {
        T t = this.b;
        Drawable.ConstantState constantState = t.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return t;
    }

    @Override // com.amazon.aps.iva.nc.s
    public void initialize() {
        T t = this.b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof com.amazon.aps.iva.yc.c) {
            ((com.amazon.aps.iva.yc.c) t).b.a.l.prepareToDraw();
        }
    }
}
