package j.i0.e;

import j.d0;
import j.i0.g.f;
import j.r;
import j.t;
import j.x;
import j.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class a implements t {
    public a(c cVar) {
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static d0 d(d0 d0Var) {
        if (d0Var == null || d0Var.f9212g == null) {
            return d0Var;
        }
        d0.a aVar = new d0.a(d0Var);
        aVar.f9223g = null;
        return aVar.a();
    }

    @Override // j.t
    public d0 a(t.a aVar) throws IOException {
        System.currentTimeMillis();
        f fVar = (f) aVar;
        z zVar = fVar.f9329f;
        b bVar = new b(zVar, null);
        if (zVar != null && zVar.a().f9203j) {
            bVar = new b(null, null);
        }
        z zVar2 = bVar.a;
        d0 d0Var = bVar.f9283b;
        if (zVar2 == null && d0Var == null) {
            d0.a aVar2 = new d0.a();
            aVar2.a = fVar.f9329f;
            aVar2.f9218b = x.HTTP_1_1;
            aVar2.f9219c = 504;
            aVar2.f9220d = "Unsatisfiable Request (only-if-cached)";
            aVar2.f9223g = j.i0.c.f9270c;
            aVar2.f9227k = -1L;
            aVar2.f9228l = System.currentTimeMillis();
            return aVar2.a();
        } else if (zVar2 == null) {
            Objects.requireNonNull(d0Var);
            d0.a aVar3 = new d0.a(d0Var);
            aVar3.b(d(d0Var));
            return aVar3.a();
        } else {
            f fVar2 = (f) aVar;
            d0 b2 = fVar2.b(zVar2, fVar2.f9325b, fVar2.f9326c, fVar2.f9327d);
            if (d0Var != null) {
                if (b2.f9208c == 304) {
                    d0.a aVar4 = new d0.a(d0Var);
                    r rVar = d0Var.f9211f;
                    r rVar2 = b2.f9211f;
                    ArrayList arrayList = new ArrayList(20);
                    int g2 = rVar.g();
                    for (int i2 = 0; i2 < g2; i2++) {
                        String d2 = rVar.d(i2);
                        String h2 = rVar.h(i2);
                        if ((!"Warning".equalsIgnoreCase(d2) || !h2.startsWith("1")) && (b(d2) || !c(d2) || rVar2.c(d2) == null)) {
                            arrayList.add(d2);
                            arrayList.add(h2.trim());
                        }
                    }
                    int g3 = rVar2.g();
                    for (int i3 = 0; i3 < g3; i3++) {
                        String d3 = rVar2.d(i3);
                        if (!b(d3) && c(d3)) {
                            String h3 = rVar2.h(i3);
                            arrayList.add(d3);
                            arrayList.add(h3.trim());
                        }
                    }
                    r.a aVar5 = new r.a();
                    Collections.addAll(aVar5.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    aVar4.f9222f = aVar5;
                    aVar4.f9227k = b2.f9216k;
                    aVar4.f9228l = b2.f9217l;
                    aVar4.b(d(d0Var));
                    d0 d4 = d(b2);
                    if (d4 != null) {
                        aVar4.c("networkResponse", d4);
                    }
                    aVar4.f9224h = d4;
                    aVar4.a();
                    b2.f9212g.close();
                    throw null;
                }
                j.i0.c.e(d0Var.f9212g);
            }
            d0.a aVar6 = new d0.a(b2);
            aVar6.b(d(d0Var));
            d0 d5 = d(b2);
            if (d5 != null) {
                aVar6.c("networkResponse", d5);
            }
            aVar6.f9224h = d5;
            return aVar6.a();
        }
    }
}
