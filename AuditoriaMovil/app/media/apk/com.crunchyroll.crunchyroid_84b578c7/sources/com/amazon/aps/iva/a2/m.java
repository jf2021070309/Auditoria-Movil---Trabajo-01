package com.amazon.aps.iva.a2;
/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsConfiguration.kt */
    /* loaded from: classes.dex */
    public static final class a<T> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<T> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(l lVar, b0<T> b0Var) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(b0Var, "key");
        com.amazon.aps.iva.yb0.j.f(a.h, "defaultValue");
        T t = (T) lVar.b.get(b0Var);
        if (t == null) {
            return null;
        }
        return t;
    }
}
