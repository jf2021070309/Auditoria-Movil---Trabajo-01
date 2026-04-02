package com.amazon.aps.iva.us;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.es.k0;
import com.amazon.aps.iva.js.e;
import com.amazon.aps.iva.ks.a;
import java.io.IOException;
/* compiled from: RegistrationAnalytics.kt */
/* loaded from: classes2.dex */
public final class q implements p {
    public final w a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.vw.a c;

    public q(w wVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.vw.a aVar2) {
        this.a = wVar;
        this.b = aVar;
        this.c = aVar2;
    }

    @Override // com.amazon.aps.iva.us.p
    public final void b(IOException iOException, com.amazon.aps.iva.es.w wVar) {
        l1.L(this.b, iOException, wVar);
    }

    @Override // com.amazon.aps.iva.us.p
    public final void c(String str, boolean z, e.a aVar, String str2) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(str, "userId");
        com.amazon.aps.iva.yb0.j.f(aVar, "credentialTypeProperty");
        this.a.b();
        Boolean valueOf = Boolean.valueOf(z);
        com.amazon.aps.iva.vw.a aVar2 = this.c;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.b.e(new k0(str2, str, valueOf, aVar, gVar));
    }

    @Override // com.amazon.aps.iva.us.p
    public final void e(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.vw.a aVar2 = this.c;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.b.e(new com.amazon.aps.iva.es.h(c, gVar));
    }

    @Override // com.amazon.aps.iva.us.p
    public final void f(String str, com.amazon.aps.iva.js.e eVar, String str2) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(eVar, "credentialTypeProperty");
        com.amazon.aps.iva.vw.a aVar = this.c;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.b.e(new com.amazon.aps.iva.es.f(str2, str, eVar, gVar));
    }

    @Override // com.amazon.aps.iva.us.p
    public final void g(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.js.e eVar, String str) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.yb0.j.f(eVar, "credentialTypeProperty");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.vw.a aVar2 = this.c;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.b.e(new com.amazon.aps.iva.es.g(str, c, eVar, gVar));
    }

    @Override // com.amazon.aps.iva.us.p
    public final void h(com.amazon.aps.iva.js.x xVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(xVar, "selectedTabProperty");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.REGISTRATION;
        com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[2];
        com.amazon.aps.iva.vw.a aVar2 = this.c;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        aVarArr[0] = gVar;
        aVarArr[1] = xVar;
        this.b.c(new com.amazon.aps.iva.es.j(aVar, aVarArr));
    }
}
