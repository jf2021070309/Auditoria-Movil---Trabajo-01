package com.amazon.aps.iva.h4;

import android.util.FloatProperty;
/* compiled from: FloatPropertyCompat.java */
/* loaded from: classes.dex */
public abstract class c<T> {
    final String mPropertyName;

    /* compiled from: FloatPropertyCompat.java */
    /* loaded from: classes.dex */
    public static class a extends c<T> {
        public final /* synthetic */ FloatProperty a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.a = floatProperty;
        }

        @Override // com.amazon.aps.iva.h4.c
        public final float getValue(T t) {
            return ((Float) this.a.get(t)).floatValue();
        }

        @Override // com.amazon.aps.iva.h4.c
        public final void setValue(T t, float f) {
            this.a.setValue(t, f);
        }
    }

    public c(String str) {
        this.mPropertyName = str;
    }

    public static <T> c<T> createFloatPropertyCompat(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
