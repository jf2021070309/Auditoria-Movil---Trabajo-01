package com.amazon.aps.iva.ka;

import com.amazon.aps.iva.la.c;
import java.io.IOException;
import java.util.ArrayList;
/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public final class u {
    public static final c.a a = c.a.a("k");

    public static ArrayList a(com.amazon.aps.iva.la.c cVar, com.amazon.aps.iva.z9.h hVar, float f, l0 l0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.t() == c.b.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.k()) {
            if (cVar.x(a) != 0) {
                cVar.A();
            } else if (cVar.t() == c.b.BEGIN_ARRAY) {
                cVar.a();
                if (cVar.t() == c.b.NUMBER) {
                    arrayList.add(t.b(cVar, hVar, f, l0Var, false, z));
                } else {
                    while (cVar.k()) {
                        arrayList.add(t.b(cVar, hVar, f, l0Var, true, z));
                    }
                }
                cVar.f();
            } else {
                arrayList.add(t.b(cVar, hVar, f, l0Var, false, z));
            }
        }
        cVar.h();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            com.amazon.aps.iva.na.a aVar = (com.amazon.aps.iva.na.a) arrayList.get(i2);
            i2++;
            com.amazon.aps.iva.na.a aVar2 = (com.amazon.aps.iva.na.a) arrayList.get(i2);
            aVar.h = Float.valueOf(aVar2.g);
            if (aVar.c == 0 && (t = aVar2.b) != 0) {
                aVar.c = t;
                if (aVar instanceof com.amazon.aps.iva.ca.i) {
                    ((com.amazon.aps.iva.ca.i) aVar).d();
                }
            }
        }
        com.amazon.aps.iva.na.a aVar3 = (com.amazon.aps.iva.na.a) arrayList.get(i);
        if ((aVar3.b == 0 || aVar3.c == 0) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
