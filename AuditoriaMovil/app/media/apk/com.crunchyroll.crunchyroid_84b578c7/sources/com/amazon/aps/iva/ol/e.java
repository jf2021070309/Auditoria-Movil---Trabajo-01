package com.amazon.aps.iva.ol;

import androidx.lifecycle.p;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.gy.t;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerAudioSettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<p, j> {
    public final /* synthetic */ androidx.fragment.app.h h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.h hVar) {
        super(1);
        this.h = hVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final j invoke(p pVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "it");
        com.amazon.aps.iva.cj.h hVar = n.e;
        if (hVar != null) {
            com.amazon.aps.iva.kh.d dVar = t.a;
            if (dVar != null) {
                com.amazon.aps.iva.kh.f a = dVar.a(this.h);
                com.amazon.aps.iva.cj.p pVar2 = n.f;
                if (pVar2 != null) {
                    com.amazon.aps.iva.tl.b b = pVar2.b();
                    com.amazon.aps.iva.cj.k kVar = n.d;
                    if (kVar != null) {
                        return new j(hVar, a, b, kVar.k());
                    }
                    com.amazon.aps.iva.yb0.j.m("dependencies");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("feature");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("instance");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("player");
        throw null;
    }
}
