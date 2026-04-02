package com.amazon.aps.iva.z7;

import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.z7.e0;
import java.util.List;
/* compiled from: UserDataReader.java */
/* loaded from: classes.dex */
public final class f0 {
    public final List<com.amazon.aps.iva.q5.v> a;
    public final com.amazon.aps.iva.x6.f0[] b;

    public f0(List<com.amazon.aps.iva.q5.v> list) {
        this.a = list;
        this.b = new com.amazon.aps.iva.x6.f0[list.size()];
    }

    public final void a(long j, com.amazon.aps.iva.t5.v vVar) {
        if (vVar.c - vVar.b < 9) {
            return;
        }
        int e = vVar.e();
        int e2 = vVar.e();
        int u = vVar.u();
        if (e == 434 && e2 == 1195456820 && u == 3) {
            com.amazon.aps.iva.x6.f.b(j, vVar, this.b);
        }
    }

    public final void b(com.amazon.aps.iva.x6.p pVar, e0.d dVar) {
        boolean z;
        int i = 0;
        while (true) {
            com.amazon.aps.iva.x6.f0[] f0VarArr = this.b;
            if (i < f0VarArr.length) {
                dVar.a();
                dVar.b();
                com.amazon.aps.iva.x6.f0 r = pVar.r(dVar.d, 3);
                com.amazon.aps.iva.q5.v vVar = this.a.get(i);
                String str = vVar.m;
                if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                    z = false;
                } else {
                    z = true;
                }
                com.amazon.aps.iva.cq.b.v(z, "Invalid closed caption MIME type provided: " + str);
                v.a aVar = new v.a();
                dVar.b();
                aVar.a = dVar.e;
                aVar.k = str;
                aVar.d = vVar.e;
                aVar.c = vVar.d;
                aVar.C = vVar.E;
                aVar.m = vVar.o;
                r.c(new com.amazon.aps.iva.q5.v(aVar));
                f0VarArr[i] = r;
                i++;
            } else {
                return;
            }
        }
    }
}
