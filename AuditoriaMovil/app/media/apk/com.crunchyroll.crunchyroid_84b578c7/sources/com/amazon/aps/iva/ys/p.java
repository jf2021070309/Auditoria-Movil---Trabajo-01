package com.amazon.aps.iva.ys;

import com.amazon.aps.iva.us.w;
import com.ellation.crunchyroll.api.etp.index.EtpIndexProvider;
import com.ellation.crunchyroll.cast.ChromecastUserStatusInteractor;
/* compiled from: SignOutDelegate.kt */
/* loaded from: classes2.dex */
public final class p implements o {
    public final com.amazon.aps.iva.bo.f a;
    public final com.amazon.aps.iva.ct.l b;
    public final com.amazon.aps.iva.ve.l c;
    public final EtpIndexProvider d;
    public final com.amazon.aps.iva.sv.k e;
    public final com.amazon.aps.iva.q30.e f;
    public final com.amazon.aps.iva.pm.e g;
    public final c h;
    public final com.amazon.aps.iva.ds.a i;
    public final w j;
    public final ChromecastUserStatusInteractor k;
    public final com.amazon.aps.iva.zg.p l;
    public final com.amazon.aps.iva.rd.f m;
    public final com.amazon.aps.iva.vn.b n;
    public final com.amazon.aps.iva.jd.d o;

    public p(com.amazon.aps.iva.bo.f fVar, com.amazon.aps.iva.ct.l lVar, com.amazon.aps.iva.ve.l lVar2, EtpIndexProvider etpIndexProvider, com.amazon.aps.iva.sv.k kVar, com.amazon.aps.iva.q30.e eVar, c cVar, com.amazon.aps.iva.ds.a aVar, w wVar, ChromecastUserStatusInteractor chromecastUserStatusInteractor, com.amazon.aps.iva.zg.p pVar, com.amazon.aps.iva.rd.f fVar2, com.amazon.aps.iva.vn.b bVar) {
        com.amazon.aps.iva.m30.b bVar2 = com.amazon.aps.iva.m30.b.a;
        com.amazon.aps.iva.oz.a aVar2 = com.amazon.aps.iva.oz.a.a;
        this.a = fVar;
        this.b = lVar;
        this.c = lVar2;
        this.d = etpIndexProvider;
        this.e = kVar;
        this.f = eVar;
        this.g = bVar2;
        this.h = cVar;
        this.i = aVar;
        this.j = wVar;
        this.k = chromecastUserStatusInteractor;
        this.l = pVar;
        this.m = fVar2;
        this.n = bVar;
        this.o = aVar2;
    }

    @Override // com.amazon.aps.iva.ys.o
    public final void d() {
        this.a.n0();
        this.b.H5();
        this.c.a();
        this.e.onSignOut();
        this.f.onSignOut();
        this.d.invalidate();
        this.i.d();
        this.j.a();
        this.h.h2();
        this.k.onSignOut();
        this.g.a();
        this.l.onSignOut();
        this.m.onSignOut();
        this.n.onSignOut();
        this.o.a();
    }
}
