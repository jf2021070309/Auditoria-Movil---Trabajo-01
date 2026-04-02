package com.amazon.aps.iva.kb0;

import java.io.Serializable;
/* compiled from: Result.kt */
/* loaded from: classes4.dex */
public final class k<T> implements Serializable {
    public final Object b;

    /* compiled from: Result.kt */
    /* loaded from: classes4.dex */
    public static final class a implements Serializable {
        public final Throwable b;

        public a(Throwable th) {
            com.amazon.aps.iva.yb0.j.f(th, "exception");
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                if (com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.b + ')';
        }
    }

    public /* synthetic */ k(Object obj) {
        this.b = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).b;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (!com.amazon.aps.iva.yb0.j.a(this.b, ((k) obj).b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
