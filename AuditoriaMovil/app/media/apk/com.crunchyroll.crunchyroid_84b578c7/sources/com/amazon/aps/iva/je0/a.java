package com.amazon.aps.iva.je0;

import com.amazon.aps.iva.yb0.j;
/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes4.dex */
public final class a<T> {
    public final T a;
    public final T b;

    public a(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && j.a(this.b, aVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        T t = this.a;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        int i2 = hashCode * 31;
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApproximationBounds(lower=");
        sb.append(this.a);
        sb.append(", upper=");
        return defpackage.b.b(sb, this.b, ')');
    }
}
