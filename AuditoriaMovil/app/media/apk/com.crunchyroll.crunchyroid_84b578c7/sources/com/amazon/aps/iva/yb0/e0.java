package com.amazon.aps.iva.yb0;

import com.amazon.aps.iva.ic0.q0;
/* compiled from: Reflection.java */
/* loaded from: classes4.dex */
public final class e0 {
    public static final f0 a;
    public static final com.amazon.aps.iva.fc0.d[] b;

    static {
        f0 f0Var = null;
        try {
            f0Var = (f0) q0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (f0Var == null) {
            f0Var = new f0();
        }
        a = f0Var;
        b = new com.amazon.aps.iva.fc0.d[0];
    }

    public static com.amazon.aps.iva.fc0.d a(Class cls) {
        return a.b(cls);
    }

    public static com.amazon.aps.iva.fc0.j b(o oVar) {
        return a.e(oVar);
    }

    public static com.amazon.aps.iva.fc0.n c(u uVar) {
        return a.g(uVar);
    }
}
