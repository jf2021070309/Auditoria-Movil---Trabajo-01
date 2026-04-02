package com.kwad.components.ad.reward.presenter.c;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.kwad.components.ad.reward.model.EcOrderCardStyle;
import com.kwad.components.ad.reward.n;
import com.kwad.components.core.t.b;
import com.kwad.components.core.video.i;
import com.kwad.components.core.video.l;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.b.d;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.ad.reward.presenter.a {
    private List<Integer> cr;
    private AdInfo mAdInfo;
    private AdTemplate mAdTemplate;
    private l sv;
    private final i tW = new i();
    private long mPlayTime = 0;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean tX = true;
    private volatile boolean cs = false;
    private Runnable tY = new Runnable() { // from class: com.kwad.components.ad.reward.presenter.c.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (a.this.tW.rf()) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - a.this.tW.rh();
                int ri = a.this.tW.rg().ri();
                a.this.qB.a(elapsedRealtime, a.this.tW.rg().rj(), ri);
            } else if (a.this.tX) {
                a.this.qB.a(PushUIConfig.dismissTime, PushUIConfig.dismissTime, 1);
            }
            com.kwad.components.core.p.a.pC().Z(a.this.mAdTemplate);
        }
    };
    private l sw = new l() { // from class: com.kwad.components.ad.reward.presenter.c.a.2
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            super.onMediaPlayCompleted();
            a.this.hG();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayPaused() {
            super.onMediaPlayPaused();
            a.this.tW.re();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            super.onMediaPlayProgress(j, j2);
            a.this.c(j2);
            a.this.mPlayTime = j2;
            a.this.tW.re();
            a.a(a.this, false);
            if (a.this.cs) {
                return;
            }
            a.b(a.this, true);
            com.kwad.components.core.p.a.pC().a(a.this.mAdTemplate, System.currentTimeMillis(), 1);
            com.kwad.components.ad.reward.monitor.a.b(a.this.qB.pn, a.this.mAdTemplate, a.this.qB.mPageEnterTime);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            a.this.hZ();
        }
    };
    private l mVideoPlayStateListener = new l() { // from class: com.kwad.components.ad.reward.presenter.c.a.3
        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayCompleted() {
            a.this.hG();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayError(int i, int i2) {
            super.onMediaPlayError(i, i2);
            com.kwad.components.ad.reward.monitor.a.a(a.this.qB.pn, a.this.qB.mAdTemplate, a.this.qB.pJ, i, i2);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayPaused() {
            super.onMediaPlayPaused();
            a.this.tW.re();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayProgress(long j, long j2) {
            a.this.c(j2);
            a.this.mPlayTime = j2;
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlayStart() {
            super.onMediaPlayStart();
            a.this.hZ();
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.h
        public final void onMediaPlaying() {
            super.onMediaPlaying();
            a.this.tW.re();
            a.a(a.this, false);
            if (a.this.cs) {
                return;
            }
            a.b(a.this, true);
            com.kwad.components.core.p.a.pC().a(a.this.mAdTemplate, System.currentTimeMillis(), 1);
            com.kwad.components.ad.reward.monitor.a.b(a.this.qB.pn, a.this.mAdTemplate, a.this.qB.mPageEnterTime);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.k
        public final void onVideoPlayBufferingPaused() {
            super.onVideoPlayBufferingPaused();
            a.this.tW.rd();
            a.this.mHandler.removeCallbacks(a.this.tY);
            a.this.mHandler.postDelayed(a.this.tY, PushUIConfig.dismissTime);
        }

        @Override // com.kwad.components.core.video.l, com.kwad.components.core.video.k
        public final void onVideoPlayBufferingPlaying() {
            super.onVideoPlayBufferingPlaying();
            a.this.tW.rd();
            a.this.mHandler.removeCallbacks(a.this.tY);
            a.this.mHandler.postDelayed(a.this.tY, PushUIConfig.dismissTime);
        }
    };

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.tX = false;
        return false;
    }

    static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.cs = true;
        return true;
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
                com.kwad.sdk.core.report.a.a(this.mAdTemplate, ceil, this.qB.mReportExtData);
                this.cr.remove(num);
                return;
            }
        }
    }

    private void checkExposure() {
        long j = this.mAdInfo.adRewardInfo.callBackStrategyInfo.impressionCheckMs;
        if (j <= 0 || com.kwad.sdk.core.response.b.a.Y(this.mAdInfo) <= PushUIConfig.dismissTime) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.kwad.components.ad.reward.presenter.c.a.4
            @Override // java.lang.Runnable
            public final void run() {
                n.a(1, a.this.qB);
            }
        }, j);
    }

    @Override // com.kwad.components.ad.reward.presenter.a, com.kwad.sdk.mvp.Presenter
    public final void ah() {
        super.ah();
        AdTemplate adTemplate = this.qB.mAdTemplate;
        this.mAdTemplate = adTemplate;
        AdInfo ck = d.ck(adTemplate);
        this.mAdInfo = ck;
        this.cr = com.kwad.sdk.core.response.b.a.bd(ck);
        this.sv = this.qB.oZ.jT() ? this.sw : this.mVideoPlayStateListener;
        this.qB.oZ.a(this.sv);
        this.mHandler.postDelayed(this.tY, PushUIConfig.dismissTime);
    }

    public final void hG() {
        if (!this.qB.pn || !this.qB.ps) {
            com.kwad.sdk.core.report.a.h(this.mAdTemplate, this.qB.mReportExtData);
        }
        this.tW.re();
    }

    public final void hZ() {
        this.cs = false;
        EcOrderCardStyle createFromAdInfo = EcOrderCardStyle.createFromAdInfo(this.mAdInfo);
        j jVar = new j();
        if (createFromAdInfo != null) {
            z.a aVar = new z.a();
            aVar.asR = String.valueOf(createFromAdInfo.getValue());
            jVar.a(aVar);
        }
        if (!this.mAdTemplate.mPvReported) {
            checkExposure();
        }
        b.ql().a(this.mAdTemplate, null, jVar);
        com.kwad.sdk.core.report.a.g(this.mAdTemplate, this.qB.mReportExtData);
    }

    @Override // com.kwad.sdk.mvp.Presenter
    public final void onUnbind() {
        super.onUnbind();
        this.mHandler.removeCallbacksAndMessages(null);
        this.qB.oZ.b(this.sv);
        i.a rg = this.tW.rg();
        com.kwad.components.core.p.a.pC().a(this.qB.mAdTemplate, this.mPlayTime, rg.rj(), rg.ri());
    }
}
