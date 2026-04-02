package com.amazon.aps.iva.hc;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: GlideImage.kt */
/* loaded from: classes.dex */
public abstract class j {

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class a extends j {
    }

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class b extends j {
        public final Drawable a;

        public b(ColorDrawable colorDrawable) {
            this.a = colorDrawable;
        }
    }

    /* compiled from: GlideImage.kt */
    /* loaded from: classes.dex */
    public static final class c extends j {
    }

    public final <T> com.amazon.aps.iva.ec.f<T> a(com.amazon.aps.iva.xb0.l<? super Integer, ? extends com.amazon.aps.iva.ec.f<T>> lVar, com.amazon.aps.iva.xb0.l<? super Drawable, ? extends com.amazon.aps.iva.ec.f<T>> lVar2) {
        if (this instanceof b) {
            return lVar2.invoke(((b) this).a);
        }
        if (this instanceof c) {
            c cVar = (c) this;
            return lVar.invoke(0);
        }
        return lVar2.invoke(null);
    }
}
