package com.applovin.impl.adview;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.a.a;
import com.applovin.impl.adview.k;
import com.vungle.warren.analytics.AnalyticsEvent;
import com.vungle.warren.ui.JavascriptBridge;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class t extends p {
    private final Set<com.applovin.impl.a.g> a = new HashSet();

    private void a() {
        if (!isFullyWatched() || this.a.isEmpty()) {
            return;
        }
        com.applovin.impl.sdk.r rVar = this.logger;
        rVar.d("InterstitialActivity", "Firing " + this.a.size() + " un-fired video progress trackers when video was completed.");
        a(this.a);
    }

    private void a(a.c cVar) {
        a(cVar, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, com.applovin.impl.a.d dVar) {
        a(cVar, "", dVar);
    }

    private void a(a.c cVar, String str) {
        a(cVar, str, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(a.c cVar, String str, com.applovin.impl.a.d dVar) {
        if (isVastAd()) {
            a(((com.applovin.impl.a.a) this.currentAd).a(cVar, str), dVar);
        }
    }

    private void a(Set<com.applovin.impl.a.g> set) {
        a(set, com.applovin.impl.a.d.UNSPECIFIED);
    }

    private void a(Set<com.applovin.impl.a.g> set, com.applovin.impl.a.d dVar) {
        if (!isVastAd() || set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.videoView.getCurrentPosition());
        com.applovin.impl.a.k m = b().m();
        Uri a = m != null ? m.a() : null;
        com.applovin.impl.sdk.r rVar = this.logger;
        rVar.b("InterstitialActivity", "Firing " + set.size() + " tracker(s): " + set);
        com.applovin.impl.a.i.a(set, seconds, a, dVar, this.sdk);
    }

    private com.applovin.impl.a.a b() {
        if (this.currentAd instanceof com.applovin.impl.a.a) {
            return (com.applovin.impl.a.a) this.currentAd;
        }
        return null;
    }

    @Override // com.applovin.impl.adview.p
    public void clickThroughFromVideo(PointF pointF) {
        super.clickThroughFromVideo(pointF);
        a(a.c.VIDEO_CLICK);
    }

    @Override // com.applovin.impl.adview.p, com.applovin.impl.adview.l
    public void dismiss() {
        if (isVastAd()) {
            a(a.c.VIDEO, JavascriptBridge.MraidHandler.CLOSE_ACTION);
            a(a.c.COMPANION, JavascriptBridge.MraidHandler.CLOSE_ACTION);
        }
        super.dismiss();
    }

    public void handleCountdownStep() {
        if (isVastAd()) {
            long seconds = this.computedLengthSeconds - TimeUnit.MILLISECONDS.toSeconds(this.videoView.getDuration() - this.videoView.getCurrentPosition());
            HashSet hashSet = new HashSet();
            for (com.applovin.impl.a.g gVar : new HashSet(this.a)) {
                if (gVar.a(seconds, getVideoPercentViewed())) {
                    hashSet.add(gVar);
                    this.a.remove(gVar);
                }
            }
            a(hashSet);
        }
    }

    @Override // com.applovin.impl.adview.p
    public void handleMediaError(String str) {
        a(a.c.ERROR, com.applovin.impl.a.d.MEDIA_FILE_ERROR);
        super.handleMediaError(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isVastAd()) {
            this.a.addAll(b().a(a.c.VIDEO, com.applovin.impl.a.h.a));
            a(a.c.IMPRESSION);
            a(a.c.VIDEO, "creativeView");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.p, android.app.Activity
    public void onPause() {
        super.onPause();
        a(this.postitialWasDisplayed ? a.c.COMPANION : a.c.VIDEO, "pause");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.adview.p, android.app.Activity
    public void onResume() {
        super.onResume();
        a(this.postitialWasDisplayed ? a.c.COMPANION : a.c.VIDEO, "resume");
    }

    @Override // com.applovin.impl.adview.p
    public void playVideo() {
        this.countdownManager.a("PROGRESS_TRACKING", ((Long) this.sdk.a(com.applovin.impl.sdk.c.b.eg)).longValue(), new k.a() { // from class: com.applovin.impl.adview.t.1
            @Override // com.applovin.impl.adview.k.a
            public void a() {
                t.this.handleCountdownStep();
            }

            @Override // com.applovin.impl.adview.k.a
            public boolean b() {
                return t.this.shouldContinueFullLengthVideoCountdown();
            }
        });
        super.playVideo();
    }

    @Override // com.applovin.impl.adview.p
    public void showPostitial() {
        if (isVastAd()) {
            a();
            if (!com.applovin.impl.a.i.c(b())) {
                dismiss();
                return;
            } else if (this.postitialWasDisplayed) {
                return;
            } else {
                a(a.c.COMPANION, "creativeView");
            }
        }
        super.showPostitial();
    }

    @Override // com.applovin.impl.adview.p
    public void skipVideo() {
        a(a.c.VIDEO, "skip");
        super.skipVideo();
    }

    @Override // com.applovin.impl.adview.p
    public void toggleMute() {
        super.toggleMute();
        a(a.c.VIDEO, this.videoMuted ? AnalyticsEvent.Ad.mute : AnalyticsEvent.Ad.unmute);
    }
}
