package com.amazon.aps.iva.oa0;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* compiled from: SingularLifecycleCallbacks.java */
/* loaded from: classes4.dex */
public final class z0 implements InvocationHandler {
    public static final /* synthetic */ int c = 0;
    public final m0 b;

    static {
        new com.amazon.aps.iva.b30.j(z0.class.getSimpleName());
    }

    public z0(m0 m0Var) {
        this.b = m0Var;
        m0Var.c = true;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean equals = "onActivityResumed".equals(method.getName());
        m0 m0Var = this.b;
        if (equals) {
            int i = f1.b;
            long currentTimeMillis = System.currentTimeMillis();
            m0Var.getClass();
            if (!u0.p.d.j) {
                m0Var.a.c.a().post(new l0(m0Var, currentTimeMillis));
                return null;
            }
            return null;
        } else if ("onActivityPaused".equals(method.getName())) {
            l lVar = l.m;
            if (lVar != null) {
                lVar.d();
            }
            int i2 = f1.b;
            long currentTimeMillis2 = System.currentTimeMillis();
            m0Var.getClass();
            m0Var.a.c.a().post(new k0(m0Var, currentTimeMillis2));
            return null;
        } else {
            return null;
        }
    }
}
