package com.amazon.aps.iva.uc0;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, com.amazon.aps.iva.nd0.f> {
    public static final o h = new o();

    public o() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.nd0.f invoke(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        if (!com.amazon.aps.iva.nd0.f.i(simpleName)) {
            simpleName = null;
        }
        if (simpleName == null) {
            return null;
        }
        return com.amazon.aps.iva.nd0.f.h(simpleName);
    }
}
