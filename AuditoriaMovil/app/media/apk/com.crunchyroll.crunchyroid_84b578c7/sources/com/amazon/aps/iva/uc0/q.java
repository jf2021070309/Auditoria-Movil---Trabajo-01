package com.amazon.aps.iva.uc0;

import java.lang.reflect.Method;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class q extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<Method, a0> {
    public static final q b = new q();

    public q() {
        super(1);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "<init>";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return com.amazon.aps.iva.yb0.e0.a(a0.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final a0 invoke(Method method) {
        Method method2 = method;
        com.amazon.aps.iva.yb0.j.f(method2, "p0");
        return new a0(method2);
    }
}
