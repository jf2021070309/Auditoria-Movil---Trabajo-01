package com.amazon.aps.iva.uc0;

import java.lang.reflect.Constructor;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class k extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<Constructor<?>, u> {
    public static final k b = new k();

    public k() {
        super(1);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "<init>";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return com.amazon.aps.iva.yb0.e0.a(u.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final u invoke(Constructor<?> constructor) {
        Constructor<?> constructor2 = constructor;
        com.amazon.aps.iva.yb0.j.f(constructor2, "p0");
        return new u(constructor2);
    }
}
