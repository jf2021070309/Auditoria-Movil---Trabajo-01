package com.amazon.aps.iva.x4;

import android.content.Context;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.f1.x;
import com.amazon.aps.iva.yb0.j;
/* compiled from: ColorProvider.kt */
/* loaded from: classes.dex */
public final class b implements a {
    public final long a(Context context, boolean z, boolean z2) {
        j.f(context, "context");
        if (z2) {
            c b = b(null, context, z2);
            if (z) {
                return b.b;
            }
            return b.a;
        }
        c b2 = b(null, context, z2);
        if (z) {
            return b2.b;
        }
        return b2.a;
    }

    public final c b(com.amazon.aps.iva.b5.a aVar, Context context, boolean z) {
        if (aVar instanceof c) {
            return (c) aVar;
        }
        if (aVar instanceof com.amazon.aps.iva.b5.d) {
            long j = ((com.amazon.aps.iva.b5.d) aVar).a;
            return new c(j, j);
        }
        if (aVar != null) {
            aVar.toString();
        }
        x k = k0.k(context, 0, z, Boolean.FALSE);
        j.c(k);
        x k2 = k0.k(context, 0, z, Boolean.TRUE);
        j.c(k2);
        return new c(k.a, k2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        if (!j.a(null, null)) {
            return false;
        }
        bVar.getClass();
        if (!j.a(null, null)) {
            return false;
        }
        bVar.getClass();
        if (!j.a(null, null)) {
            return false;
        }
        bVar.getClass();
        return true;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckedUncheckedColorProvider(source=");
        sb.append((String) null);
        sb.append(", checked=");
        sb.append((Object) null);
        sb.append(", unchecked=");
        sb.append((Object) null);
        sb.append(", fallback=");
        return b2.b(sb, 0, ')');
    }
}
