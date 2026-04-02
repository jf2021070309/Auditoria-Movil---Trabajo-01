package com.amazon.aps.iva.d6;

import com.amazon.aps.iva.e6.j;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q6.l;
import com.amazon.aps.iva.w5.i;
import com.amazon.aps.iva.x6.n;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.List;
/* compiled from: DashUtil.java */
/* loaded from: classes.dex */
public final class e {
    public static i a(j jVar, String str, com.amazon.aps.iva.e6.i iVar, int i, ImmutableMap immutableMap) {
        i.a aVar = new i.a();
        aVar.a = iVar.b(str);
        aVar.d = iVar.a;
        aVar.e = iVar.b;
        String h = jVar.h();
        if (h == null) {
            h = iVar.b(jVar.c.get(0).a).toString();
        }
        aVar.d(h);
        aVar.b(i);
        aVar.c(immutableMap);
        return aVar.a();
    }

    public static j b(com.amazon.aps.iva.e6.g gVar, int i) {
        List<com.amazon.aps.iva.e6.a> list = gVar.c;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (list.get(i2).b == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return null;
        }
        List<j> list2 = gVar.c.get(i2).c;
        if (list2.isEmpty()) {
            return null;
        }
        return list2.get(0);
    }

    public static void c(com.amazon.aps.iva.q6.d dVar, com.amazon.aps.iva.w5.f fVar, j jVar, boolean z) throws IOException {
        com.amazon.aps.iva.e6.i n = jVar.n();
        com.amazon.aps.iva.cq.b.z(n);
        if (z) {
            com.amazon.aps.iva.e6.i m = jVar.m();
            if (m == null) {
                return;
            }
            com.amazon.aps.iva.e6.i a = n.a(m, jVar.c.get(0).a);
            if (a == null) {
                d(fVar, jVar, dVar, n);
                n = m;
            } else {
                n = a;
            }
        }
        d(fVar, jVar, dVar, n);
    }

    public static void d(com.amazon.aps.iva.w5.f fVar, j jVar, com.amazon.aps.iva.q6.d dVar, com.amazon.aps.iva.e6.i iVar) throws IOException {
        new l(fVar, a(jVar, jVar.c.get(0).a, iVar, 0, ImmutableMap.of()), jVar.b, 0, null, dVar).a();
    }

    public static com.amazon.aps.iva.q6.d e(int i, v vVar) {
        boolean z;
        n eVar;
        String str = vVar.l;
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm"))) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            eVar = new com.amazon.aps.iva.m7.d(0);
        } else {
            eVar = new com.amazon.aps.iva.o7.e(0);
        }
        return new com.amazon.aps.iva.q6.d(eVar, i, vVar);
    }
}
