package com.amazon.aps.iva.ka;

import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public final class a {
    public static final c.a a = c.a.a("k", "x", "y");

    public static com.amazon.aps.iva.k.w a(com.amazon.aps.iva.la.d dVar, com.amazon.aps.iva.z9.h hVar) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (dVar.t() == c.b.BEGIN_ARRAY) {
            dVar.a();
            while (dVar.k()) {
                if (dVar.t() == c.b.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new com.amazon.aps.iva.ca.i(hVar, t.b(dVar, hVar, com.amazon.aps.iva.ma.g.c(), y.a, z, false)));
            }
            dVar.f();
            u.b(arrayList);
        } else {
            arrayList.add(new com.amazon.aps.iva.na.a(s.b(dVar, com.amazon.aps.iva.ma.g.c())));
        }
        return new com.amazon.aps.iva.k.w(arrayList);
    }

    public static com.amazon.aps.iva.ga.l b(com.amazon.aps.iva.la.d dVar, com.amazon.aps.iva.z9.h hVar) throws IOException {
        dVar.c();
        com.amazon.aps.iva.k.w wVar = null;
        com.amazon.aps.iva.ga.b bVar = null;
        boolean z = false;
        com.amazon.aps.iva.ga.b bVar2 = null;
        while (dVar.t() != c.b.END_OBJECT) {
            int x = dVar.x(a);
            if (x != 0) {
                if (x != 1) {
                    if (x != 2) {
                        dVar.y();
                        dVar.A();
                    } else if (dVar.t() == c.b.STRING) {
                        dVar.A();
                        z = true;
                    } else {
                        bVar = d.b(dVar, hVar, true);
                    }
                } else if (dVar.t() == c.b.STRING) {
                    dVar.A();
                    z = true;
                } else {
                    bVar2 = d.b(dVar, hVar, true);
                }
            } else {
                wVar = a(dVar, hVar);
            }
        }
        dVar.h();
        if (z) {
            hVar.a("Lottie doesn't support expressions.");
        }
        if (wVar != null) {
            return wVar;
        }
        return new com.amazon.aps.iva.ga.h(bVar2, bVar);
    }
}
