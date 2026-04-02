package com.kwad.components.ad.reward;

import android.text.TextUtils;
import com.kwad.components.core.playable.PlayableSource;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class l extends com.kwad.components.ad.k.b {
    private com.kwad.components.ad.reward.c.d qt;
    private WeakReference<j> qu;

    public l(j jVar, JSONObject jSONObject, String str) {
        super(jSONObject, null);
        this.qu = new WeakReference<>(jVar);
    }

    public final void a(com.kwad.components.ad.reward.c.d dVar) {
        this.qt = dVar;
    }

    @Override // com.kwad.components.ad.k.b
    public final void a(com.kwad.components.core.webview.a aVar) {
        super.a(aVar);
        aVar.a(new com.kwad.components.ad.reward.h.b(this.cB.getContext(), this.mAdTemplate, PlayableSource.ENDCARD_CLICK));
        aVar.a(new com.kwad.components.ad.reward.c.f(new com.kwad.components.ad.reward.c.d() { // from class: com.kwad.components.ad.reward.l.1
            @Override // com.kwad.components.ad.reward.c.d
            public final void a(com.kwad.components.ad.reward.c.b bVar) {
                if (l.this.qt != null) {
                    l.this.qt.a(bVar);
                }
            }
        }));
        aVar.a(new com.kwad.components.core.webview.jshandler.f(new com.kwad.components.core.webview.jshandler.j() { // from class: com.kwad.components.ad.reward.l.2
            @Override // com.kwad.components.core.webview.jshandler.j
            public final void a(com.kwad.components.core.webview.jshandler.f fVar, String str) {
                if (TextUtils.equals(str, "getExtraReward")) {
                    fVar.a(com.kwad.components.ad.reward.c.a.gY().gZ());
                }
            }
        }));
        WeakReference<j> weakReference = this.qu;
        aVar.b(new com.kwad.components.ad.reward.j.p(weakReference != null ? weakReference.get() : null, "native_id", -1L, this.cE));
    }

    @Override // com.kwad.components.ad.k.b
    public final void fF() {
        WeakReference<j> weakReference = this.qu;
        com.kwad.components.ad.reward.monitor.a.a((weakReference != null ? weakReference.get() : null) != null, "end_card");
    }

    @Override // com.kwad.components.ad.k.b
    public final void fG() {
        WeakReference<j> weakReference = this.qu;
        com.kwad.components.ad.reward.monitor.a.a((weakReference != null ? weakReference.get() : null) != null, "end_card", q(this.mAdTemplate));
    }

    @Override // com.kwad.components.ad.k.b
    public final void fH() {
        WeakReference<j> weakReference = this.qu;
        com.kwad.components.ad.reward.monitor.a.a((weakReference != null ? weakReference.get() : null) != null, "end_card", q(this.mAdTemplate), System.currentTimeMillis() - getLoadTime());
    }
}
