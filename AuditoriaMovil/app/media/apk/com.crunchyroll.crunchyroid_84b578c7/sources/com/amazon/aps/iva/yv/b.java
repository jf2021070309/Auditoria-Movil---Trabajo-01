package com.amazon.aps.iva.yv;

import com.amazon.aps.iva.q00.d;
import com.amazon.aps.iva.q00.e;
import com.amazon.aps.iva.sv.i;
import com.amazon.aps.iva.x50.k;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.downloading.DownloadsManagerImpl;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
/* compiled from: ConnectionChangeManager.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.mf.a {
    public final InternalDownloadsManager b;
    public final d c;
    public final com.amazon.aps.iva.xb0.a<Boolean> d;
    public final k<Boolean> e;

    public b(DownloadsManagerImpl downloadsManagerImpl, e eVar, i.a aVar, i.b bVar) {
        j.f(bVar, "createDebouncer");
        this.b = downloadsManagerImpl;
        this.c = eVar;
        this.d = aVar;
        this.e = bVar.invoke(new a(this));
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionLost() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRefresh(boolean z) {
        boolean z2;
        if (z && this.d.invoke().booleanValue() && !this.c.a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.b.Y0();
        } else {
            this.e.setValue(Boolean.TRUE);
        }
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionRestored() {
    }

    @Override // com.amazon.aps.iva.mf.a
    public final void onConnectionUpdated(boolean z) {
    }
}
