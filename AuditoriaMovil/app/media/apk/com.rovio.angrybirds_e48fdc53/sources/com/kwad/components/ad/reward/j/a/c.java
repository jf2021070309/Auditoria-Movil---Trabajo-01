package com.kwad.components.ad.reward.j.a;

import android.text.TextUtils;
import com.kwad.components.ad.reward.c.f;
import com.kwad.components.core.webview.b.h;
import com.kwad.components.core.webview.jshandler.j;
import com.kwad.sdk.components.l;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.core.webview.b.c.c implements e {
    private a xO;

    public final void a(com.kwad.components.ad.reward.c.b bVar) {
        a aVar = this.xO;
        if (aVar != null) {
            aVar.b(bVar);
        }
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void a(l lVar, com.kwad.sdk.core.webview.b bVar) {
        super.a(lVar, bVar);
        lVar.c(new f(new com.kwad.components.ad.reward.c.d() { // from class: com.kwad.components.ad.reward.j.a.c.1
            @Override // com.kwad.components.ad.reward.c.d
            public final void a(com.kwad.components.ad.reward.c.b bVar2) {
                com.kwad.sdk.core.e.c.d("RewardTKDialogFragmentPresenter", "onUpdateExtraReward : " + bVar2.hb());
                c.this.a(bVar2);
            }
        }));
        lVar.c(new com.kwad.components.core.webview.jshandler.f(new j() { // from class: com.kwad.components.ad.reward.j.a.c.2
            @Override // com.kwad.components.core.webview.jshandler.j
            public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
                if (TextUtils.equals(str, "getExtraReward")) {
                    fVar.a(com.kwad.components.ad.reward.c.a.gY().gZ());
                    com.kwad.components.ad.reward.c.a.gY().a(fVar);
                }
            }
        }));
    }

    @Override // com.kwad.components.core.webview.b.c.a, com.kwad.components.core.webview.b.i
    public final void a(com.kwad.sdk.core.webview.d.b.a aVar) {
        super.a(aVar);
        a aVar2 = this.xO;
        if (aVar2 == null || aVar2.jq() == null) {
            return;
        }
        this.xO.jq().mAdOpenInteractionListener.bF();
    }

    @Override // com.kwad.components.core.webview.b.c.a
    public final h hW() {
        this.xO = (a) this.Xr;
        return new d(this.xO.jq(), this.xO.xM, getContext());
    }
}
