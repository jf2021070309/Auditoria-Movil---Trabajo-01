package com.amazon.aps.iva.se0;

import java.util.concurrent.CancellationException;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes4.dex */
public final class v {
    public final Object a;
    public final k b;
    public final com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public v(Object obj, k kVar, com.amazon.aps.iva.xb0.l<? super Throwable, com.amazon.aps.iva.kb0.q> lVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = kVar;
        this.c = lVar;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static v a(v vVar, k kVar, CancellationException cancellationException, int i) {
        Object obj;
        com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> lVar;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = vVar.a;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            kVar = vVar.b;
        }
        k kVar2 = kVar;
        if ((i & 4) != 0) {
            lVar = vVar.c;
        } else {
            lVar = null;
        }
        if ((i & 8) != 0) {
            obj2 = vVar.d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = vVar.e;
        }
        vVar.getClass();
        return new v(obj, kVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, vVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, vVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, vVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, vVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, vVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        k kVar = this.b;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> lVar = this.c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ v(Object obj, k kVar, com.amazon.aps.iva.xb0.l lVar, Object obj2, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : kVar, (i & 4) != 0 ? null : lVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : cancellationException);
    }
}
