package com.amazon.aps.iva.xl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.se0.g0;
import java.util.List;
/* compiled from: ChromecastSubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.ez.b implements i {
    public final com.amazon.aps.iva.ye.h b;
    public final com.amazon.aps.iva.ql.d c;
    public final g0 d;
    public final androidx.lifecycle.c e;
    public final androidx.lifecycle.c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(e eVar, com.amazon.aps.iva.ye.h hVar, com.amazon.aps.iva.ql.e eVar2, com.amazon.aps.iva.xe0.d dVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(hVar, "chromecastMessage");
        this.b = hVar;
        this.c = eVar2;
        this.d = dVar;
        this.e = com.amazon.aps.iva.i5.j.b(eVar.f, w.D(this).getCoroutineContext());
        this.f = com.amazon.aps.iva.i5.j.b(eVar.g, w.D(this).getCoroutineContext());
        eVar.b(w.D(this));
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void C3(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "language");
        com.amazon.aps.iva.ye.h hVar = this.b;
        if (z) {
            hVar.sendMessage(new a(str));
        } else {
            hVar.sendMessage(new b(str));
        }
        com.amazon.aps.iva.se0.i.d(this.d, null, null, new j(this, str, z, null), 3);
    }

    @Override // com.amazon.aps.iva.wl.o
    public final void O(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "newLanguage");
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData<List<com.amazon.aps.iva.jh.f>> S2() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.wl.o
    public final LiveData<com.amazon.aps.iva.jh.f> w() {
        return this.f;
    }
}
