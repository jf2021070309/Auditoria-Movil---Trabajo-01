package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.sv.e;
import com.amazon.aps.iva.sv.h;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.bulk.BulkDownloadsManager;
/* compiled from: DownloadsModule.kt */
/* loaded from: classes2.dex */
public final class c0 implements u {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(c0.class, "editViewModel", "getEditViewModel()Lcom/ellation/crunchyroll/edit/EditModeViewModel;", 0), com.amazon.aps.iva.k.q.a(c0.class, "downloadsViewModel", "getDownloadsViewModel()Lcom/ellation/crunchyroll/presentation/downloads/edit/DownloadsViewModel;", 0)};
    public final com.amazon.aps.iva.k50.a a;
    public final com.amazon.aps.iva.xh.b b;
    public final com.amazon.aps.iva.g10.e c;
    public final com.amazon.aps.iva.i10.i d;

    /* JADX WARN: Type inference failed for: r2v3, types: [com.amazon.aps.iva.d10.v] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.amazon.aps.iva.d10.w] */
    public c0(androidx.fragment.app.h hVar, com.amazon.aps.iva.i10.a aVar, com.amazon.aps.iva.i10.a aVar2, boolean z) {
        com.amazon.aps.iva.zv.e f = e.a.a().f();
        androidx.fragment.app.h requireActivity = aVar.requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "fragment.requireActivity()");
        this.a = f.c(requireActivity);
        final com.amazon.aps.iva.zv.a F = e.a.a().F();
        ?? r2 = new com.amazon.aps.iva.yb0.t(F) { // from class: com.amazon.aps.iva.d10.v
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).getHasPremiumBenefit());
            }
        };
        final com.amazon.aps.iva.zv.a F2 = e.a.a().F();
        com.amazon.aps.iva.h10.e eVar = new com.amazon.aps.iva.h10.e(r2, z, new com.amazon.aps.iva.yb0.t(F2) { // from class: com.amazon.aps.iva.d10.w
            @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
            public final Object get() {
                return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).r());
            }
        });
        com.amazon.aps.iva.sv.h hVar2 = h.a.a;
        if (hVar2 != null) {
            InternalDownloadsManager a = hVar2.a();
            com.ellation.crunchyroll.downloading.bulk.g gVar = k0.d;
            if (gVar != null) {
                BulkDownloadsManager a2 = gVar.a();
                com.amazon.aps.iva.wu.b bVar = com.amazon.aps.iva.wu.b.a;
                p pVar = new p(a, a2);
                a0 a0Var = new a0(hVar);
                com.amazon.aps.iva.ez.a aVar3 = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.g10.c.class, new b0(hVar), y.h);
                this.b = e.a.a().f().d(aVar, null);
                com.amazon.aps.iva.fc0.l<?>[] lVarArr = e;
                com.amazon.aps.iva.yb0.j.f(lVarArr[0], "property");
                com.amazon.aps.iva.uw.a aVar4 = (com.amazon.aps.iva.uw.a) com.amazon.aps.iva.ez.l.a(a0Var.invoke(), com.amazon.aps.iva.uw.b.class, z.h);
                com.amazon.aps.iva.g10.b bVar2 = (com.amazon.aps.iva.g10.b) aVar3.getValue(this, lVarArr[1]);
                com.ellation.crunchyroll.downloading.bulk.g gVar2 = k0.d;
                if (gVar2 != null) {
                    com.amazon.aps.iva.tv.a aVar5 = (com.amazon.aps.iva.tv.a) gVar2.d.getValue();
                    com.amazon.aps.iva.yb0.j.f(aVar5, "analytics");
                    this.c = new com.amazon.aps.iva.g10.e(aVar4, bVar2, pVar, aVar5, aVar2);
                    com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                    t tVar = new t(null, new x(aVar));
                    com.amazon.aps.iva.gx.c a3 = e.a.a().f().a(hVar);
                    com.amazon.aps.iva.gx.d b = e.a.a().f().b(hVar);
                    com.amazon.aps.iva.yb0.j.f(a3, "showPageRouter");
                    com.amazon.aps.iva.yb0.j.f(b, "watchScreenRouter");
                    this.d = new com.amazon.aps.iva.i10.i(pVar, tVar, eVar, a3, b, (com.amazon.aps.iva.g10.b) aVar3.getValue(this, lVarArr[1]), aVar);
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("instance");
        throw null;
    }

    @Override // com.amazon.aps.iva.d10.u
    public final com.amazon.aps.iva.xh.b a() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.d10.u
    public final com.amazon.aps.iva.k50.a b() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.d10.u
    public final com.amazon.aps.iva.i10.i c() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.d10.u
    public final com.amazon.aps.iva.g10.e d() {
        return this.c;
    }
}
