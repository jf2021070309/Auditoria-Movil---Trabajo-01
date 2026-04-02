package com.amazon.aps.iva.uc0;
/* compiled from: ReflectJavaClass.kt */
/* loaded from: classes4.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Class<?>, Boolean> {
    public static final n h = new n();

    public n() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Class<?> cls) {
        boolean z;
        if (cls.getSimpleName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
