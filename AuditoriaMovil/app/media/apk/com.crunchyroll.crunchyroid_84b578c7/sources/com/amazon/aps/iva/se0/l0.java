package com.amazon.aps.iva.se0;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes4.dex */
public final class l0 {
    public static final o0 a;

    static {
        String str;
        boolean z;
        o0 o0Var;
        int i = com.amazon.aps.iva.xe0.t.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            o0Var = k0.i;
        } else {
            com.amazon.aps.iva.ye0.c cVar = r0.a;
            t1 t1Var = com.amazon.aps.iva.xe0.k.a;
            t1Var.C();
            if (!(t1Var instanceof o0)) {
                o0Var = k0.i;
            } else {
                o0Var = (o0) t1Var;
            }
        }
        a = o0Var;
    }
}
