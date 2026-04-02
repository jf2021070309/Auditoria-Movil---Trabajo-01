package com.kwad.components.ad.draw.b.a;

import android.view.View;
import com.kwad.components.core.t.b;
import com.kwad.components.core.video.k;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBasePvFrameLayout;
import com.kwad.sdk.utils.l;
import com.kwad.sdk.widget.j;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.draw.a.a {
    private List<Integer> cr;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private boolean bH = false;
    private volatile boolean cs = false;
    private j ct = new j() { // from class: com.kwad.components.ad.draw.b.a.a.1
        @Override // com.kwad.sdk.widget.j
        public final void am() {
            l.cF(a.this.mAdTemplate);
        }
    };
    private k mVideoPlayStateListener = new com.kwad.components.core.video.l() { // from class: com.kwad.components.ad.draw.b.a.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            com.kwad.sdk.core.report.a.aE(a.this.mAdTemplate);
            if (a.this.bE.bD != null) {
                try {
                    a.this.bE.bD.onVideoPlayEnd();
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            super.onMediaPlayError(i, i2);
            if (a.this.bE.bD != null) {
                try {
                    a.this.bE.bD.onVideoPlayError();
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
            }
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayPaused() {
            super.onMediaPlayPaused();
            if (a.this.bE.bD != null) {
                try {
                    a.this.bE.bD.onVideoPlayPause();
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
            }
            a.this.bH = true;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            a.this.c(j2);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            a.this.cs = false;
            if (!a.this.mAdTemplate.mPvReported && a.this.bE.bD != null) {
                a.this.bE.bD.onAdShow();
            }
            if (a.this.bE.bD != null) {
                try {
                    a.this.bE.bD.onVideoPlayStart();
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
                a.this.bH = false;
            }
            b.ql().a(a.this.mAdTemplate, null, null);
            com.kwad.sdk.core.report.a.aD(a.this.mAdTemplate);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            super.onMediaPlaying();
            if (!a.this.bH) {
                if (a.this.cs) {
                    return;
                }
                a.this.cs = true;
                com.kwad.components.core.p.a.pC().a(a.this.mAdTemplate, System.currentTimeMillis(), 1);
                return;
            }
            a.this.bH = false;
            if (a.this.bE.bD != null) {
                try {
                    a.this.bE.bD.onVideoPlayResume();
                } catch (Throwable th) {
                    c.printStackTraceOnly(th);
                }
            }
        }
    };

    private void a(j jVar) {
        View rootView = getRootView();
        if (rootView instanceof AdBasePvFrameLayout) {
            ((AdBasePvFrameLayout) rootView).setVisibleListener(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        int ceil = (int) Math.ceil(((float) j) / 1000.0f);
        List<Integer> list = this.cr;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Integer num : this.cr) {
            if (ceil >= num.intValue()) {
                com.kwad.sdk.core.report.a.a(this.mAdTemplate, ceil, (JSONObject) null);
                this.cr.remove(num);
                return;
            }
        }
    }

    @Override // com.kwad.components.ad.draw.a.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.bE.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo ck = d.ck(adTemplate);
        this.mAdInfo = ck;
        this.cr = com.kwad.sdk.core.response.b.a.bd(ck);
        this.bE.bF.b(this.mVideoPlayStateListener);
        a(this.ct);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.bE.bF.a(this.mVideoPlayStateListener);
        a((j) null);
    }
}
