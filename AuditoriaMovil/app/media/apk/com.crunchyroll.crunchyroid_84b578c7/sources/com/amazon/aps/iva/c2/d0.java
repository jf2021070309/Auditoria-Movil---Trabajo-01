package com.amazon.aps.iva.c2;

import com.amazon.aps.iva.o0.t1;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: UrlAnnotation.kt */
/* loaded from: classes.dex */
public final class d0 {
    public final String a;

    public d0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        if (com.amazon.aps.iva.yb0.j.a(this.a, ((d0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return t1.b(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
