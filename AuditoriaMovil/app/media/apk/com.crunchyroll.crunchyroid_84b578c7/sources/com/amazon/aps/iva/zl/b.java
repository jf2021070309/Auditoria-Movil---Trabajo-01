package com.amazon.aps.iva.zl;

import com.amazon.aps.iva.am.e;
import com.amazon.aps.iva.am.h;
import com.amazon.aps.iva.bm.c;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.xe0.d;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.auth.RefreshTokenMonitor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProfilesRepository.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.dm.a {
    public final c a;

    public b(d dVar, com.amazon.aps.iva.am.c cVar, e eVar, h hVar, RefreshTokenMonitor refreshTokenMonitor) {
        j.f(refreshTokenMonitor, "tokenMonitor");
        c cVar2 = new c(eVar, refreshTokenMonitor, c.b.a, dVar);
        this.a = cVar2;
        new com.amazon.aps.iva.bm.j(dVar, hVar, cVar, new a(cVar2), refreshTokenMonitor);
    }

    @Override // com.amazon.aps.iva.dm.a
    public final com.amazon.aps.iva.bm.a a() {
        return this.a;
    }

    @Override // com.amazon.aps.iva.dm.a
    public final void b(long j) {
        this.a.d(TimeUnit.MINUTES.toMillis(j));
    }
}
