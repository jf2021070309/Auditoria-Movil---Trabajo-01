package com.kwad.components.ad.reward.j;

import com.kwad.components.core.webview.jshandler.ae;
import com.kwad.sdk.utils.bj;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p extends ae {
    private WeakReference<com.kwad.components.ad.reward.j> qu;
    private long xG;
    private String xH;

    public p(com.kwad.components.ad.reward.j jVar, String str, long j, com.kwad.sdk.core.webview.b bVar) {
        super(bVar);
        this.xG = -1L;
        this.xH = str;
        this.xG = j;
        if (jVar != null) {
            this.qu = new WeakReference<>(jVar);
        }
    }

    private static boolean U(String str) {
        try {
            return new JSONObject(str).optInt("elementType") == 18;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean b(ae.b bVar) {
        WeakReference<com.kwad.components.ad.reward.j> weakReference;
        if (bVar.getActionType() == 140 && com.kwad.sdk.core.config.d.xM() && U(bVar.rz()) && (weakReference = this.qu) != null && weakReference.get() != null) {
            final com.kwad.components.ad.reward.j jVar = this.qu.get();
            bj.runOnUiThreadDelay(new Runnable() { // from class: com.kwad.components.ad.reward.j.p.1
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.G(p.this.xH);
                }
            }, 1500L);
            return true;
        }
        return false;
    }

    @Override // com.kwad.components.core.webview.jshandler.ae
    public final void a(ae.b bVar) {
        if (b(bVar)) {
            return;
        }
        super.a(bVar);
    }

    @Override // com.kwad.components.core.webview.jshandler.ae
    public final void a(com.kwad.sdk.core.report.j jVar) {
        super.a(jVar);
        WeakReference<com.kwad.components.ad.reward.j> weakReference = this.qu;
        if (weakReference != null && weakReference.get() != null) {
            jVar.ae(this.qu.get().oZ.getPlayDuration());
            return;
        }
        long j = this.xG;
        if (j > 0) {
            jVar.ae(j);
        }
    }
}
