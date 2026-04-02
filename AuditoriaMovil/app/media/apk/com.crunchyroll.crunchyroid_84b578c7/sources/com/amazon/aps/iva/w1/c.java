package com.amazon.aps.iva.w1;

import com.amazon.aps.iva.a2.m;
import com.amazon.aps.iva.a2.r;
import com.amazon.aps.iva.a2.v;
import com.amazon.aps.iva.e1.d;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import java.util.ArrayList;
/* compiled from: CollectionInfo.kt */
/* loaded from: classes.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean a(ArrayList arrayList) {
        ?? r0;
        long j;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() != 0 && arrayList.size() != 1) {
            r0 = new ArrayList();
            Object obj = arrayList.get(0);
            int B = f1.B(arrayList);
            int i = 0;
            while (i < B) {
                i++;
                Object obj2 = arrayList.get(i);
                r rVar = (r) obj2;
                r rVar2 = (r) obj;
                r0.add(new com.amazon.aps.iva.e1.c(d.d(Math.abs(com.amazon.aps.iva.e1.c.c(rVar2.e().a()) - com.amazon.aps.iva.e1.c.c(rVar.e().a())), Math.abs(com.amazon.aps.iva.e1.c.d(rVar2.e().a()) - com.amazon.aps.iva.e1.c.d(rVar.e().a())))));
                obj = obj2;
            }
        } else {
            r0 = z.b;
        }
        if (r0.size() == 1) {
            j = ((com.amazon.aps.iva.e1.c) x.t0(r0)).a;
        } else if (!r0.isEmpty()) {
            Object t0 = x.t0(r0);
            int B2 = f1.B(r0);
            if (1 <= B2) {
                int i2 = 1;
                while (true) {
                    t0 = new com.amazon.aps.iva.e1.c(com.amazon.aps.iva.e1.c.f(((com.amazon.aps.iva.e1.c) t0).a, ((com.amazon.aps.iva.e1.c) r0.get(i2)).a));
                    if (i2 == B2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((com.amazon.aps.iva.e1.c) t0).a;
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (com.amazon.aps.iva.e1.c.d(j) < com.amazon.aps.iva.e1.c.c(j)) {
            return true;
        }
        return false;
    }

    public static final boolean b(r rVar) {
        if (m.a(rVar.h(), v.f) == null && m.a(rVar.h(), v.e) == null) {
            return false;
        }
        return true;
    }
}
