package com.kwad.components.ad.f.b;

import android.view.View;
import com.kwad.components.core.video.l;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends com.kwad.components.ad.f.a.a {
    private List<Integer> cr;
    private volatile boolean cs = false;

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int ceil = (int) Math.ceil(((float) j) / 1000.0f);
        List<Integer> list = this.cr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Integer num : this.cr) {
            if (ceil >= num.intValue()) {
                com.kwad.sdk.core.report.a.a(this.mZ.mAdTemplate, ceil, (JSONObject) null);
                this.cr.remove(num);
                return;
            }
        }
    }

    @Override // com.kwad.components.ad.f.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        this.cr = com.kwad.sdk.core.response.b.a.bd(com.kwad.sdk.core.response.b.d.ck(this.mZ.mAdTemplate));
        this.mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.f.b.c.1
            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayCompleted() {
                com.kwad.sdk.core.report.a.aE(c.this.mZ.mAdTemplate);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayProgress(long j, long j2) {
                c.this.c(j2);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlayStart() {
                c.this.cs = false;
                if (!c.this.mZ.mAdTemplate.mPvReported) {
                    c.this.mZ.mI.eL();
                }
                com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
                View view = (View) c.this.mZ.mU.getParent();
                if (view != null) {
                    jVar.t(view.getHeight(), view.getWidth());
                }
                com.kwad.components.core.t.b.ql().a(c.this.mZ.mAdTemplate, null, jVar);
                com.kwad.sdk.core.report.a.aD(c.this.mZ.mAdTemplate);
            }

            @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
            public final void onMediaPlaying() {
                if (c.this.cs) {
                    return;
                }
                c.this.cs = true;
                com.kwad.components.core.p.a.pC().a(c.this.mZ.mAdTemplate, System.currentTimeMillis(), 1);
            }
        };
        this.mZ.na.b(this.mVideoPlayStateListener);
    }
}
