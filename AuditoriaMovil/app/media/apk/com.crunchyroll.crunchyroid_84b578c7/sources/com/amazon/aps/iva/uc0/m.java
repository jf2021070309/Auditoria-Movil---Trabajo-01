package com.amazon.aps.iva.uc0;

import java.lang.reflect.Field;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class m extends com.amazon.aps.iva.yb0.h implements com.amazon.aps.iva.xb0.l<Field, x> {
    public static final m b = new m();

    public m() {
        super(1);
    }

    @Override // com.amazon.aps.iva.yb0.b, com.amazon.aps.iva.fc0.c
    public final String getName() {
        return "<init>";
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final com.amazon.aps.iva.fc0.f getOwner() {
        return com.amazon.aps.iva.yb0.e0.a(x.class);
    }

    @Override // com.amazon.aps.iva.yb0.b
    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final x invoke(Field field) {
        Field field2 = field;
        com.amazon.aps.iva.yb0.j.f(field2, "p0");
        return new x(field2);
    }
}
