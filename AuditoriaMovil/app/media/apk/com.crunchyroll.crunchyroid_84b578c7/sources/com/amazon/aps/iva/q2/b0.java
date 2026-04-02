package com.amazon.aps.iva.q2;
/* compiled from: SecureFlagPolicy.android.kt */
/* loaded from: classes.dex */
public final class b0 {

    /* compiled from: SecureFlagPolicy.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a0.values().length];
            try {
                iArr[a0.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final boolean a(a0 a0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(a0Var, "<this>");
        int i = a.a[a0Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                throw new com.amazon.aps.iva.kb0.h();
            }
            return z;
        }
        return false;
    }
}
