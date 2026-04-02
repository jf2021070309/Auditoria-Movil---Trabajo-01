package com.amazon.aps.iva.he0;

import com.amazon.aps.iva.ee0.v1;
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes4.dex */
public final class o {

    /* compiled from: TypeSystemContext.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[v1.values().length];
            try {
                iArr[v1.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v1.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v1.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final r a(v1 v1Var) {
        int i = a.a[v1Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return r.OUT;
                }
                throw new com.amazon.aps.iva.kb0.h();
            }
            return r.IN;
        }
        return r.INV;
    }
}
