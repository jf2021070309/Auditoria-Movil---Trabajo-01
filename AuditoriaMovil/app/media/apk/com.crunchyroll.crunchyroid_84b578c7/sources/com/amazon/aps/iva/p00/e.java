package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.sv.g2;
import com.amazon.aps.iva.u00.m;
import com.amazon.aps.iva.u00.n;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.ellation.crunchyroll.model.PlayableAssetVersion;
import java.util.List;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<com.amazon.aps.iva.hg.f, n, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.hg.f fVar, n nVar) {
        com.amazon.aps.iva.hg.f fVar2 = fVar;
        n nVar2 = nVar;
        com.amazon.aps.iva.yb0.j.f(fVar2, "statusData");
        com.amazon.aps.iva.yb0.j.f(nVar2, "action");
        com.amazon.aps.iva.u00.i iVar = this.h.g;
        iVar.getClass();
        boolean z = nVar2 instanceof n.c;
        com.amazon.aps.iva.tv.a aVar = iVar.e;
        g2 g2Var = iVar.b;
        com.amazon.aps.iva.hg.g gVar = fVar2.a;
        if (z) {
            g2Var.K0(gVar);
            aVar.b(gVar);
        } else if (nVar2 instanceof n.d) {
            g2Var.y(gVar);
            aVar.a(gVar);
        } else {
            boolean z2 = nVar2 instanceof n.e;
            com.amazon.aps.iva.v00.a aVar2 = iVar.c;
            if (z2) {
                aVar2.u0(gVar, new com.amazon.aps.iva.u00.e(iVar, gVar));
            } else if (nVar2 instanceof n.f) {
                aVar2.e1(gVar, new com.amazon.aps.iva.u00.g(iVar, gVar));
            } else if (nVar2 instanceof n.a) {
                m view = iVar.getView();
                List<PlayableAssetVersion> versions = ((PlayableAsset) x.t0(gVar.d)).getVersions();
                String str = fVar2.d;
                if (str == null) {
                    str = "";
                }
                view.Y9(versions, gVar, str);
            }
        }
        return q.a;
    }
}
