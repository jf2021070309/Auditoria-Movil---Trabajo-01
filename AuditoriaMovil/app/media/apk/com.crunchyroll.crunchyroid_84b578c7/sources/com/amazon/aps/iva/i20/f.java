package com.amazon.aps.iva.i20;

import com.amazon.aps.iva.es.q0;
import com.amazon.aps.iva.es.r0;
import com.amazon.aps.iva.es.s0;
import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.js.i;
import com.amazon.aps.iva.js.j0;
import com.amazon.aps.iva.js.q;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.r;
import com.amazon.aps.iva.ks.s;
import com.amazon.aps.iva.ks.t;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrPlusSubscriptionAnalytics.kt */
/* loaded from: classes2.dex */
public final class f implements e {
    public final com.amazon.aps.iva.ls.a a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.vw.a c;
    public com.amazon.aps.iva.fs.c d;
    public String e;

    public f(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.vw.a aVar2, com.amazon.aps.iva.fs.c cVar) {
        com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
        j.f(aVar, "screen");
        this.a = aVar;
        this.b = cVar2;
        this.c = aVar2;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void a(com.amazon.aps.iva.fs.b bVar, String str, String str2, com.amazon.aps.iva.js.f fVar, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar) {
        com.amazon.aps.iva.ks.g gVar;
        j.f(bVar, "analyticsClickedView");
        j.f(iVar, "eventSourceProperty");
        s sVar = new s(str, str2);
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new s0(sVar, c, fVar, jVar, qVar, gVar, iVar));
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void b(String str, String str2, j0 j0Var, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar) {
        j.f(str, "sku");
        j.f(str2, "skuTitle");
        j.f(j0Var, "subFlowType");
        h(str, str2, j0Var, iVar, qVar, jVar);
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void c(String str, String str2, j0 j0Var, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar) {
        j.f(str, "sku");
        j.f(str2, "skuTitle");
        j.f(j0Var, "subFlowType");
        h(str, str2, j0Var, iVar, qVar, jVar);
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void d(Throwable th) {
        if (th instanceof com.amazon.aps.iva.f20.a) {
            com.amazon.aps.iva.f20.a aVar = (com.amazon.aps.iva.f20.a) th;
            s sVar = new s(aVar.b, aVar.c);
            com.amazon.aps.iva.ks.g gVar = null;
            com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, null);
            Throwable cause = th.getCause();
            String str = (cause == null || (str = cause.getMessage()) == null) ? "" : "";
            com.amazon.aps.iva.vw.a aVar2 = this.c;
            if (aVar2 != null) {
                gVar = aVar2.y();
            }
            this.b.e(new q0(sVar, c, str, gVar));
            return;
        }
        g(th);
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void e() {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.ks.a b = a.C0456a.b(this.a);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new z(b, gVar));
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void f(com.amazon.aps.iva.fs.b bVar, String str, String str2) {
        com.amazon.aps.iva.ks.g gVar;
        j.f(bVar, "analyticsClickedView");
        s sVar = new s(str, str2);
        com.amazon.aps.iva.ks.a c = a.C0456a.c(this.a, bVar);
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new r0(sVar, c, gVar));
    }

    @Override // com.amazon.aps.iva.i20.e
    public final void g(Throwable th) {
        String str;
        String message = th.getMessage();
        com.amazon.aps.iva.ks.g gVar = null;
        if (message != null) {
            str = com.amazon.aps.iva.oe0.q.O0(message).toString();
        } else {
            str = null;
        }
        if (!j.a(str, "1")) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            String concat = "Google Billing error ".concat(message2);
            com.amazon.aps.iva.ls.a aVar = this.a;
            com.amazon.aps.iva.vw.a aVar2 = this.c;
            if (aVar2 != null) {
                gVar = aVar2.y();
            }
            this.b.e(new w(concat, aVar, null, gVar, null, 44));
        }
    }

    public final void h(String str, String str2, j0 j0Var, i iVar, q qVar, com.amazon.aps.iva.ks.j jVar) {
        float f;
        com.amazon.aps.iva.ks.g gVar;
        if (!j.a(this.e, str)) {
            com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[6];
            i iVar2 = i.d;
            com.amazon.aps.iva.fs.c cVar = this.d;
            if (cVar != null) {
                f = cVar.a();
            } else {
                f = 0.0f;
            }
            r t = i.t(iVar2, f, null, null, null, iVar, 30);
            boolean z = false;
            aVarArr[0] = t;
            aVarArr[1] = new s(str, str2);
            aVarArr[2] = new t(j0Var);
            aVarArr[3] = qVar;
            aVarArr[4] = jVar;
            com.amazon.aps.iva.vw.a aVar = this.c;
            if (aVar != null) {
                gVar = aVar.y();
            } else {
                gVar = null;
            }
            com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.SUBSCRIPTION_TIERS_MENU;
            com.amazon.aps.iva.ls.a aVar3 = this.a;
            if (aVar3 == aVar2 && j0Var == j0.DOWNGRADE) {
                z = true;
            }
            if (z) {
                gVar = null;
            }
            aVarArr[5] = gVar;
            this.b.c(new com.amazon.aps.iva.es.j(aVar3, aVarArr));
            this.e = str;
            this.d = null;
        }
    }
}
