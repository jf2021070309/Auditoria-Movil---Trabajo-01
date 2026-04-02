package com.amazon.aps.iva.uc0;
/* compiled from: ReflectJavaAnnotationArguments.kt */
/* loaded from: classes4.dex */
public final class w extends f implements com.amazon.aps.iva.ed0.m {
    public final Enum<?> b;

    public w(com.amazon.aps.iva.nd0.f fVar, Enum<?> r2) {
        super(fVar);
        this.b = r2;
    }

    @Override // com.amazon.aps.iva.ed0.m
    public final com.amazon.aps.iva.nd0.b d() {
        Class<?> cls = this.b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        com.amazon.aps.iva.yb0.j.e(cls, "enumClass");
        return d.a(cls);
    }

    @Override // com.amazon.aps.iva.ed0.m
    public final com.amazon.aps.iva.nd0.f e() {
        return com.amazon.aps.iva.nd0.f.h(this.b.name());
    }
}
