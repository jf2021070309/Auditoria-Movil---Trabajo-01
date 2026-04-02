package com.amazon.aps.iva.ka;

import java.io.IOException;
/* compiled from: AnimatableValueParser.java */
/* loaded from: classes.dex */
public final class d {
    public static com.amazon.aps.iva.ga.a a(com.amazon.aps.iva.la.d dVar, com.amazon.aps.iva.z9.h hVar) throws IOException {
        return new com.amazon.aps.iva.ga.a(u.a(dVar, hVar, 1.0f, g.a, false));
    }

    public static com.amazon.aps.iva.ga.b b(com.amazon.aps.iva.la.c cVar, com.amazon.aps.iva.z9.h hVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = com.amazon.aps.iva.ma.g.c();
        } else {
            f = 1.0f;
        }
        return new com.amazon.aps.iva.ga.b(u.a(cVar, hVar, f, l.a, false));
    }

    public static com.amazon.aps.iva.ga.d c(com.amazon.aps.iva.la.d dVar, com.amazon.aps.iva.z9.h hVar) throws IOException {
        return new com.amazon.aps.iva.ga.d(u.a(dVar, hVar, 1.0f, r.a, false));
    }

    public static com.amazon.aps.iva.ga.e d(com.amazon.aps.iva.la.d dVar, com.amazon.aps.iva.z9.h hVar) throws IOException {
        return new com.amazon.aps.iva.ga.e(u.a(dVar, hVar, com.amazon.aps.iva.ma.g.c(), z.a, true));
    }
}
