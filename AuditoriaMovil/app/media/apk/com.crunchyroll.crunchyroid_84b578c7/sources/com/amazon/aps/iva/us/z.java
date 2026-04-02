package com.amazon.aps.iva.us;

import com.amazon.aps.iva.js.n0;
import java.util.LinkedHashMap;
/* compiled from: UserSessionAnalytics.kt */
/* loaded from: classes2.dex */
public final class z implements w {
    public final com.amazon.aps.iva.bo.f a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.vs.b c;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ag.b> d;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fz.d> e;

    public z(com.amazon.aps.iva.bo.f fVar) {
        com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.vs.c cVar2 = com.amazon.aps.iva.vs.c.a;
        final com.amazon.aps.iva.ag.c cVar3 = com.amazon.aps.iva.ag.c.a;
        com.amazon.aps.iva.yb0.n nVar = new com.amazon.aps.iva.yb0.n(cVar3) { // from class: com.amazon.aps.iva.us.x
            @Override // com.amazon.aps.iva.fc0.m
            public final Object get() {
                ((com.amazon.aps.iva.ag.c) this.receiver).getClass();
                com.amazon.aps.iva.ag.b bVar = com.amazon.aps.iva.ag.c.b;
                if (bVar != null) {
                    return bVar;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }

            @Override // com.amazon.aps.iva.fc0.i
            public final void set(Object obj) {
                com.amazon.aps.iva.ag.b bVar = (com.amazon.aps.iva.ag.b) obj;
                ((com.amazon.aps.iva.ag.c) this.receiver).getClass();
                com.amazon.aps.iva.yb0.j.f(bVar, "<set-?>");
                com.amazon.aps.iva.ag.c.b = bVar;
            }
        };
        y yVar = y.h;
        com.amazon.aps.iva.yb0.j.f(yVar, "braze");
        this.a = fVar;
        this.b = cVar;
        this.c = cVar2;
        this.d = nVar;
        this.e = yVar;
    }

    @Override // com.amazon.aps.iva.us.w
    public final void a() {
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ag.b> aVar = this.d;
        aVar.invoke().a();
        aVar.invoke().d();
        this.b.a(null, this.c.d());
    }

    @Override // com.amazon.aps.iva.us.w
    public final void b() {
        n0 n0Var;
        LinkedHashMap a = this.c.a();
        Object obj = a.get("subStatus");
        String str = null;
        if (obj instanceof n0) {
            n0Var = (n0) obj;
        } else {
            n0Var = null;
        }
        com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ag.b> aVar = this.d;
        if (n0Var != null) {
            aVar.invoke().e("subStatus", n0Var.getValue());
        }
        com.amazon.aps.iva.bo.f fVar = this.a;
        aVar.invoke().c(fVar.b());
        this.b.a(fVar.b(), a);
        Object obj2 = a.get("phoneNumber");
        if (obj2 instanceof String) {
            str = (String) obj2;
        }
        if (str != null) {
            this.e.invoke().setPhoneNumber(str);
        }
    }

    @Override // com.amazon.aps.iva.us.w
    public final void c() {
        boolean z;
        if (this.a.b().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a();
        } else {
            b();
        }
    }

    @Override // com.amazon.aps.iva.us.w
    public final void d(String str) {
        this.b.a(this.a.b(), this.c.c(str));
    }
}
