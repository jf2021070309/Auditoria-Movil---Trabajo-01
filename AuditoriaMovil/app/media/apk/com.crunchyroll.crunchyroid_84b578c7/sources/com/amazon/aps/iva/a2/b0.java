package com.amazon.aps.iva.a2;
/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class b0<T> {
    public final String a;
    public final com.amazon.aps.iva.xb0.p<T, T, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(String str, com.amazon.aps.iva.xb0.p<? super T, ? super T, ? extends T> pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "mergePolicy");
        this.a = str;
        this.b = pVar;
    }

    public final void a(c0 c0Var, com.amazon.aps.iva.fc0.l<?> lVar, T t) {
        com.amazon.aps.iva.yb0.j.f(c0Var, "thisRef");
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        c0Var.b(this, t);
    }

    public final String toString() {
        return "SemanticsPropertyKey: " + this.a;
    }
}
