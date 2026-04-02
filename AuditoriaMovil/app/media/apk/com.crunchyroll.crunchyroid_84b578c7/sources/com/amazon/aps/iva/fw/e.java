package com.amazon.aps.iva.fw;

import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.j;
/* compiled from: KalturaUnfinishedDownloadsCleaner.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.ys.d {
    public final com.amazon.aps.iva.gw.a b;
    public final g0 c;

    public e(com.amazon.aps.iva.gw.a aVar, com.ellation.crunchyroll.application.d dVar) {
        com.amazon.aps.iva.xe0.d j = z.j();
        j.f(dVar, "appLifecycle");
        this.b = aVar;
        this.c = j;
        dVar.Lf(this);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppCreate() {
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppResume(boolean z) {
        i.d(this.c, null, null, new d(this, null), 3);
    }

    @Override // com.amazon.aps.iva.ys.d
    public final void onAppStop() {
    }
}
