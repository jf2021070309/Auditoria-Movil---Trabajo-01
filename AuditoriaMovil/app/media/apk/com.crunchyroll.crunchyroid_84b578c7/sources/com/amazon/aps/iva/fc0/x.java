package com.amazon.aps.iva.fc0;
/* compiled from: TypesJVM.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class x extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Class<?>, Class<?>> {
    public static final x b = new x();

    public x() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Class<?> invoke(Class<?> cls) {
        Class<?> cls2 = cls;
        com.amazon.aps.iva.yb0.j.f(cls2, "p0");
        return cls2.getComponentType();
    }
}
