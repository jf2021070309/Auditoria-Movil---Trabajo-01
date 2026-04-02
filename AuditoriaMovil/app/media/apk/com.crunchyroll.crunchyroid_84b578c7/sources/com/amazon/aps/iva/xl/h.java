package com.amazon.aps.iva.xl;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.ml.f;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.GsonHolder;
import com.google.gson.Gson;
/* compiled from: ChromecastSubtitlesSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class h extends l implements com.amazon.aps.iva.xb0.l<p, k> {
    public final /* synthetic */ Fragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment) {
        super(1);
        this.h = fragment;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final k invoke(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        Fragment fragment = this.h;
        Context requireContext = fragment.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "fragment.requireContext()");
        com.amazon.aps.iva.cj.k kVar = n.d;
        if (kVar != null) {
            com.amazon.aps.iva.ye.f castStateProvider = kVar.a().getCastStateProvider();
            com.amazon.aps.iva.cj.k kVar2 = n.d;
            if (kVar2 != null) {
                com.amazon.aps.iva.ye.j sessionManagerProvider = kVar2.getSessionManagerProvider();
                Gson gsonHolder = GsonHolder.getInstance();
                com.amazon.aps.iva.yb0.j.f(sessionManagerProvider, "sessionManagerProvider");
                com.amazon.aps.iva.yb0.j.f(gsonHolder, "gson");
                g gVar = new g(sessionManagerProvider, gsonHolder);
                com.amazon.aps.iva.lh.c cVar = com.amazon.aps.iva.lh.f.a;
                if (cVar != null) {
                    Context requireContext2 = fragment.requireContext();
                    com.amazon.aps.iva.yb0.j.e(requireContext2, "fragment.requireContext()");
                    com.amazon.aps.iva.lh.b a = com.amazon.aps.iva.lh.f.a(requireContext2);
                    com.amazon.aps.iva.yb0.j.f(castStateProvider, "castStateProvider");
                    e eVar = new e(requireContext, castStateProvider, gVar, cVar, a);
                    com.amazon.aps.iva.cj.k kVar3 = n.d;
                    if (kVar3 != null) {
                        com.amazon.aps.iva.ye.h subtitleChromecastMessenger = kVar3.a().getSubtitleChromecastMessenger();
                        com.amazon.aps.iva.cj.k kVar4 = n.d;
                        if (kVar4 != null) {
                            com.amazon.aps.iva.pm.b a2 = kVar4.b().a();
                            com.amazon.aps.iva.yb0.j.f(a2, "userProfileInteractor");
                            com.amazon.aps.iva.ql.g gVar2 = com.amazon.aps.iva.ql.g.g;
                            if (gVar2 != null) {
                                return new k(eVar, subtitleChromecastMessenger, new com.amazon.aps.iva.ql.e(gVar2, f.a.a(), a2), z.j());
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
                com.amazon.aps.iva.yb0.j.m("store");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
