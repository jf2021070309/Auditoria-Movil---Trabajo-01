package com.kwad.components.ad.reward.j;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class q extends com.kwad.components.core.webview.jshandler.r {
    private long vC;
    private WeakReference<com.kwad.components.ad.reward.j> xJ;

    public q(com.kwad.sdk.core.webview.b bVar, com.kwad.components.core.e.d.c cVar, com.kwad.components.ad.reward.j jVar, long j, com.kwad.sdk.core.webview.d.a.a aVar, DialogInterface.OnDismissListener onDismissListener) {
        super(bVar, cVar, aVar, onDismissListener);
        this.vC = -1L;
        this.vC = j;
        if (jVar != null) {
            this.xJ = new WeakReference<>(jVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r0 > 0) goto L6;
     */
    @Override // com.kwad.components.core.webview.jshandler.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.kwad.sdk.core.report.z.b a(com.kwad.sdk.core.webview.d.b.a r5, com.kwad.sdk.core.response.model.AdTemplate r6) {
        /*
            r4 = this;
            com.kwad.sdk.core.report.z$b r5 = super.a(r5, r6)
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.j> r6 = r4.xJ
            if (r6 == 0) goto L1d
            java.lang.Object r6 = r6.get()
            if (r6 == 0) goto L1d
            java.lang.ref.WeakReference<com.kwad.components.ad.reward.j> r6 = r4.xJ
            java.lang.Object r6 = r6.get()
            com.kwad.components.ad.reward.j r6 = (com.kwad.components.ad.reward.j) r6
            com.kwad.components.ad.reward.l.d r6 = r6.oZ
            long r0 = r6.getPlayDuration()
            goto L25
        L1d:
            long r0 = r4.vC
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L27
        L25:
            r5.vC = r0
        L27:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.components.ad.reward.j.q.a(com.kwad.sdk.core.webview.d.b.a, com.kwad.sdk.core.response.model.AdTemplate):com.kwad.sdk.core.report.z$b");
    }

    @Override // com.kwad.components.core.webview.jshandler.r
    public final void jp() {
        super.jp();
        if (this.TO != null) {
            com.kwad.components.ad.reward.c.a.gY().d(this.TO.getAdTemplate(), com.kwad.components.ad.reward.c.b.STATUS_NONE);
        }
    }
}
