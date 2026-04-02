package com.amazon.aps.iva.se0;
/* compiled from: CompletionState.kt */
/* loaded from: classes4.dex */
public final class x {
    public final Object a;
    public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(Object obj, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar) {
        this.a = obj;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, xVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, xVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
