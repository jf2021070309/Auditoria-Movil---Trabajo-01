package com.amazon.aps.iva.f1;

import java.util.List;
/* compiled from: Brush.kt */
/* loaded from: classes.dex */
public abstract class s {

    /* compiled from: Brush.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static j0 a(List list) {
            return new j0(list, null, com.amazon.aps.iva.e1.d.d(0.0f, 0.0f), com.amazon.aps.iva.e1.d.d(Float.POSITIVE_INFINITY, 0.0f), 0);
        }

        public static j0 b(List list) {
            return new j0(list, null, com.amazon.aps.iva.e1.d.d(0.0f, 0.0f), com.amazon.aps.iva.e1.d.d(0.0f, Float.POSITIVE_INFINITY), 0);
        }
    }

    static {
        new a();
    }

    public s() {
        int i = com.amazon.aps.iva.e1.g.d;
    }

    public abstract void a(float f, long j, l0 l0Var);
}
