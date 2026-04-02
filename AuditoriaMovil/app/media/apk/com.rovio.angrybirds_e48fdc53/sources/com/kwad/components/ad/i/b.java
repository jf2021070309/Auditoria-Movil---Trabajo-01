package com.kwad.components.ad.i;

import com.kwad.sdk.core.network.f;
import com.kwad.sdk.core.network.g;
import com.kwad.sdk.core.network.i;
import com.kwad.sdk.internal.api.SceneImpl;
/* loaded from: classes.dex */
public class b implements i.a {
    private static volatile b GR;

    private b() {
    }

    public static b lT() {
        if (GR == null) {
            synchronized (b.class) {
                if (GR == null) {
                    GR = new b();
                }
            }
        }
        return GR;
    }

    @Override // com.kwad.sdk.core.network.i.a
    public final void a(g gVar, int i) {
        if ((gVar instanceof com.kwad.components.core.request.a) && i != f.aoZ.errorCode) {
            int i2 = 21004;
            SceneImpl scene = gVar.getScene();
            if (scene != null) {
                long posId = scene.getPosId();
                if (i == f.aoU.errorCode) {
                    i2 = 21001;
                } else if (i == f.aoY.errorCode) {
                    i2 = 21003;
                } else if (i > 0 && i < 1000) {
                    i2 = 21002;
                }
                com.kwad.components.core.p.a.pC().a(posId, i2);
            }
        }
    }

    public final void init() {
        i.Bf().a(this);
    }
}
