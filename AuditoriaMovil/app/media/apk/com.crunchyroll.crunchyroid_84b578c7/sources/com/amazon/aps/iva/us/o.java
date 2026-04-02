package com.amazon.aps.iva.us;

import com.amazon.aps.iva.es.d0;
import com.amazon.aps.iva.es.e0;
import com.amazon.aps.iva.es.f0;
import com.amazon.aps.iva.js.n;
import com.amazon.aps.iva.ks.a;
import com.ellation.crunchyroll.api.etp.auth.model.FunUser;
import com.ellation.crunchyroll.api.etp.auth.model.WatchDataStatus;
/* compiled from: LoginAnalytics.kt */
/* loaded from: classes2.dex */
public final class o implements n {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.co.d b;
    public final com.amazon.aps.iva.eo.a c;
    public final com.amazon.aps.iva.vw.a d;

    public o(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.co.d dVar, com.amazon.aps.iva.eo.a aVar2, com.amazon.aps.iva.vw.a aVar3) {
        this.a = aVar;
        this.b = dVar;
        this.c = aVar2;
        this.d = aVar3;
    }

    @Override // com.amazon.aps.iva.us.n
    public final void e(com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.ls.a aVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.vw.a aVar2 = this.d;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.a.e(new com.amazon.aps.iva.es.k(c, gVar));
    }

    @Override // com.amazon.aps.iva.us.n
    public final void f(String str, com.amazon.aps.iva.js.e eVar, String str2) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(eVar, "credentialTypeProperty");
        com.amazon.aps.iva.vw.a aVar = this.d;
        if (aVar != null) {
            gVar = aVar.y();
        } else {
            gVar = null;
        }
        this.a.e(new d0(str2, str, eVar, gVar));
    }

    @Override // com.amazon.aps.iva.us.n
    public final void g(com.amazon.aps.iva.ls.a aVar, com.amazon.aps.iva.fs.b bVar, com.amazon.aps.iva.js.e eVar, String str) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        com.amazon.aps.iva.yb0.j.f(eVar, "credentialTypeProperty");
        com.amazon.aps.iva.ks.a c = a.C0456a.c(aVar, bVar);
        com.amazon.aps.iva.vw.a aVar2 = this.d;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        this.a.e(new e0(str, c, eVar, gVar));
    }

    @Override // com.amazon.aps.iva.us.n
    public final void h(com.amazon.aps.iva.js.x xVar) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.yb0.j.f(xVar, "selectedTabProperty");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.LOGIN;
        com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[2];
        com.amazon.aps.iva.vw.a aVar2 = this.d;
        if (aVar2 != null) {
            gVar = aVar2.y();
        } else {
            gVar = null;
        }
        aVarArr[0] = gVar;
        aVarArr[1] = xVar;
        this.a.c(new com.amazon.aps.iva.es.j(aVar, aVarArr));
    }

    @Override // com.amazon.aps.iva.us.n
    public final void i(com.amazon.aps.iva.js.e eVar, String str, com.amazon.aps.iva.js.i iVar) {
        com.amazon.aps.iva.js.n nVar;
        com.amazon.aps.iva.js.n nVar2;
        com.amazon.aps.iva.yb0.j.f(eVar, "credentialTypeProperty");
        com.amazon.aps.iva.ks.g gVar = null;
        if (this.b.isEnabled()) {
            FunUser funUser = this.c.getFunUser();
            if (funUser != null) {
                if (!funUser.isFunLogin() && funUser.getWatchDataStatus() != WatchDataStatus.NOT_MIGRATED) {
                    nVar2 = n.a.a;
                } else {
                    nVar2 = n.b.a;
                }
            } else {
                nVar2 = n.a.a;
            }
            nVar = nVar2;
        } else {
            nVar = null;
        }
        com.amazon.aps.iva.vw.a aVar = this.d;
        if (aVar != null) {
            gVar = aVar.y();
        }
        this.a.e(new f0(str, nVar, eVar, gVar, iVar));
    }
}
