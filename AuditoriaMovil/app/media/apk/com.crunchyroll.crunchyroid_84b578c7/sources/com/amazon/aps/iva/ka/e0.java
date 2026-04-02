package com.amazon.aps.iva.ka;

import com.amazon.aps.iva.la.c;
import java.io.IOException;
/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public final class e0 implements l0<com.amazon.aps.iva.na.d> {
    public static final e0 a = new e0();

    @Override // com.amazon.aps.iva.ka.l0
    public final com.amazon.aps.iva.na.d a(com.amazon.aps.iva.la.c cVar, float f) throws IOException {
        boolean z;
        if (cVar.t() == c.b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar.a();
        }
        float n = (float) cVar.n();
        float n2 = (float) cVar.n();
        while (cVar.k()) {
            cVar.A();
        }
        if (z) {
            cVar.f();
        }
        return new com.amazon.aps.iva.na.d((n / 100.0f) * f, (n2 / 100.0f) * f);
    }
}
