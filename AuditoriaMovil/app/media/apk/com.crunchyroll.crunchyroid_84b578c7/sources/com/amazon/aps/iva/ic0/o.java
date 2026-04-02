package com.amazon.aps.iva.ic0;

import java.lang.reflect.Type;
/* compiled from: KClassImpl.kt */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Type> {
    public final /* synthetic */ com.amazon.aps.iva.ee0.e0 h;
    public final /* synthetic */ n<Object>.a i;
    public final /* synthetic */ n<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.amazon.aps.iva.ee0.e0 e0Var, n<Object>.a aVar, n<Object> nVar) {
        super(0);
        this.h = e0Var;
        this.i = aVar;
        this.j = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Type invoke() {
        com.amazon.aps.iva.oc0.h k = this.h.I0().k();
        if (k instanceof com.amazon.aps.iva.oc0.e) {
            Class<?> j = v0.j((com.amazon.aps.iva.oc0.e) k);
            n<Object>.a aVar = this.i;
            if (j != null) {
                n<Object> nVar = this.j;
                boolean a = com.amazon.aps.iva.yb0.j.a(nVar.c.getSuperclass(), j);
                Class<Object> cls = nVar.c;
                if (a) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    com.amazon.aps.iva.yb0.j.e(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                com.amazon.aps.iva.yb0.j.e(interfaces, "jClass.interfaces");
                int T = com.amazon.aps.iva.lb0.o.T(interfaces, j);
                if (T >= 0) {
                    Type type = cls.getGenericInterfaces()[T];
                    com.amazon.aps.iva.yb0.j.e(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new com.amazon.aps.iva.wb0.a("No superclass of " + aVar + " in Java reflection for " + k);
            }
            throw new com.amazon.aps.iva.wb0.a("Unsupported superclass of " + aVar + ": " + k);
        }
        throw new com.amazon.aps.iva.wb0.a("Supertype not a class: " + k);
    }
}
