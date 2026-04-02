package com.amazon.aps.iva.ol;

import androidx.lifecycle.p;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.ml.f;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ChromecastAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<p, c> {
    public final /* synthetic */ androidx.fragment.app.h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.fragment.app.h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final c invoke(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.k kVar = n.d;
        if (kVar != null) {
            com.amazon.aps.iva.ye.f castStateProvider = kVar.a().getCastStateProvider();
            com.amazon.aps.iva.cj.k kVar2 = n.d;
            if (kVar2 != null) {
                com.amazon.aps.iva.ze.c chromecastAudioReader = kVar2.a().getChromecastAudioReader();
                com.amazon.aps.iva.kh.d dVar = t.a;
                if (dVar != null) {
                    com.amazon.aps.iva.jh.i b = dVar.b();
                    com.amazon.aps.iva.cj.k kVar3 = n.d;
                    if (kVar3 != null) {
                        com.amazon.aps.iva.nx.e k = kVar3.k();
                        androidx.fragment.app.h hVar = this.h;
                        com.amazon.aps.iva.yb0.j.f(hVar, "context");
                        com.amazon.aps.iva.yb0.j.f(castStateProvider, "castStateProvider");
                        com.amazon.aps.iva.yb0.j.f(chromecastAudioReader, "chromecastAudioReader");
                        com.amazon.aps.iva.yb0.j.f(k, "isUserPremium");
                        a aVar = new a(hVar, castStateProvider, chromecastAudioReader, b, k);
                        com.amazon.aps.iva.cj.k kVar4 = n.d;
                        if (kVar4 != null) {
                            com.amazon.aps.iva.ye.h versionsChromecastMessenger = kVar4.a().getVersionsChromecastMessenger();
                            com.amazon.aps.iva.cj.k kVar5 = n.d;
                            if (kVar5 != null) {
                                com.amazon.aps.iva.pm.b a = kVar5.b().a();
                                com.amazon.aps.iva.yb0.j.f(a, "userProfileInteractor");
                                com.amazon.aps.iva.ql.g gVar = com.amazon.aps.iva.ql.g.g;
                                if (gVar != null) {
                                    return new c(aVar, versionsChromecastMessenger, new com.amazon.aps.iva.ql.e(gVar, f.a.a(), a), z.j());
                                }
                                com.amazon.aps.iva.yb0.j.m("instance");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("dependencies");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("dependencies");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("instance");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
