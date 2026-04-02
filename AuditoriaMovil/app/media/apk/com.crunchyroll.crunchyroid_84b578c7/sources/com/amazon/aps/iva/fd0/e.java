package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.t0;
import java.util.Map;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes4.dex */
public final class e implements com.amazon.aps.iva.pc0.c {
    public static final e a = new e();

    @Override // com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.nd0.c c() {
        com.amazon.aps.iva.oc0.e d = com.amazon.aps.iva.ud0.b.d(this);
        if (d == null) {
            return null;
        }
        if (com.amazon.aps.iva.ge0.k.f(d)) {
            d = null;
        }
        if (d == null) {
            return null;
        }
        return com.amazon.aps.iva.ud0.b.c(d);
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final t0 g() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final e0 getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
