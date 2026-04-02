package com.kwad.components.ad.splashscreen.c;

import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends e {
    private List<Integer> cr;
    private final com.kwad.components.core.video.k mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.splashscreen.c.d.1
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            d.this.kZ();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            d.this.c(j2);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            d.this.kY();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int ceil = (int) Math.ceil(((float) j) / 1000.0f);
        List<Integer> list = this.cr;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<Integer> it = this.cr.iterator();
        while (it.hasNext()) {
            if (ceil >= it.next().intValue()) {
                com.kwad.sdk.core.report.a.a(this.CS.mAdTemplate, ceil, (JSONObject) null);
                it.remove();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kY() {
        com.kwad.sdk.core.report.a.aD(this.CS.mAdTemplate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kZ() {
        com.kwad.sdk.core.report.a.aE(this.CS.mAdTemplate);
    }

    @Override // com.kwad.components.ad.splashscreen.c.e, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.cr = com.kwad.sdk.core.response.b.a.bd(com.kwad.sdk.core.response.b.d.ck(this.CS.mAdTemplate));
        if (this.CS.Ch != null) {
            this.CS.Ch.b(this.mVideoPlayStateListener);
        }
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        if (this.CS.Ch != null) {
            this.CS.Ch.a(this.mVideoPlayStateListener);
        }
    }
}
