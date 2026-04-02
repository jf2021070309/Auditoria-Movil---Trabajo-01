package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.xc0.d0;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes4.dex */
public final class y {
    public static final f a;
    public static final f b;

    /* compiled from: typeEnhancement.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    static {
        com.amazon.aps.iva.nd0.c cVar = d0.p;
        com.amazon.aps.iva.yb0.j.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new f(cVar);
        com.amazon.aps.iva.nd0.c cVar2 = d0.q;
        com.amazon.aps.iva.yb0.j.e(cVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new f(cVar2);
    }
}
