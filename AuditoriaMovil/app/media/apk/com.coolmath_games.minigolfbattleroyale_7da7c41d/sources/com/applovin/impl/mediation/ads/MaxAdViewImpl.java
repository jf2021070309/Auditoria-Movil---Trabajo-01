package com.applovin.impl.mediation.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.o;
import com.applovin.impl.sdk.w;
import com.applovin.impl.sdk.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements d.a, x.a {
    private final Activity a;
    private final MaxAdView b;
    private final View c;
    private long d;
    private com.applovin.impl.mediation.a.b e;
    private String f;
    private final a g;
    private final c h;
    private final d i;
    private final w j;
    private final x k;
    private final Object l;
    private com.applovin.impl.mediation.a.b m;
    private boolean n;
    private boolean o;
    private boolean p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ com.applovin.impl.mediation.a.b a;

        AnonymousClass2(com.applovin.impl.mediation.a.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MaxErrorImpl maxErrorImpl;
            final View s = this.a.s();
            if (s != null) {
                final MaxAdView maxAdView = MaxAdViewImpl.this.b;
                if (maxAdView != null) {
                    MaxAdViewImpl.this.a(new AnimatorListenerAdapter() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            MaxAdViewImpl.this.a();
                            MaxAdViewImpl.this.a((com.applovin.impl.mediation.a.a) AnonymousClass2.this.a);
                            MaxAdViewImpl.this.sdk.aj().a(AnonymousClass2.this.a);
                            if (AnonymousClass2.this.a.y()) {
                                MaxAdViewImpl.this.k.a(AnonymousClass2.this.a);
                            }
                            MaxAdViewImpl.this.a(AnonymousClass2.this.a, s, maxAdView);
                            synchronized (MaxAdViewImpl.this.l) {
                                MaxAdViewImpl.this.m = AnonymousClass2.this.a;
                            }
                            MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Scheduling impression for ad manually...");
                            MaxAdViewImpl.this.sdk.C().processRawAdImpressionPostback(AnonymousClass2.this.a, MaxAdViewImpl.this.g);
                            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    long a = MaxAdViewImpl.this.j.a(AnonymousClass2.this.a);
                                    if (!AnonymousClass2.this.a.y()) {
                                        MaxAdViewImpl.this.a(AnonymousClass2.this.a, a);
                                    }
                                    MaxAdViewImpl.this.a(a);
                                }
                            }, AnonymousClass2.this.a.t());
                        }
                    });
                    return;
                } else {
                    MaxAdViewImpl.this.logger.e(MaxAdViewImpl.this.tag, "MaxAdView does not have a parent view");
                    maxErrorImpl = new MaxErrorImpl(-1, "MaxAdView does not have a parent view");
                }
            } else {
                MaxAdViewImpl.this.logger.e(MaxAdViewImpl.this.tag, "MaxAdView does not have a loaded ad view");
                maxErrorImpl = new MaxErrorImpl(-1, "MaxAdView does not have a loaded ad view");
            }
            i.a(MaxAdViewImpl.this.g, this.a, maxErrorImpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            i.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.p) {
                r rVar = MaxAdViewImpl.this.logger;
                String str = MaxAdViewImpl.this.tag;
                rVar.b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                MaxAdViewImpl.this.sdk.C().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.c(MaxAdViewImpl.this.f);
            MaxAdViewImpl.this.a(bVar);
            if (bVar.A()) {
                long B = bVar.B();
                r z = MaxAdViewImpl.this.sdk.z();
                String str2 = MaxAdViewImpl.this.tag;
                z.b(str2, "Scheduling banner ad refresh " + B + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                MaxAdViewImpl.this.i.a(B);
            }
            i.a(MaxAdViewImpl.this.adListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    private abstract class b implements a.InterfaceC0014a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                i.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                if (MaxAdViewImpl.this.m.C()) {
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                i.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                i.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                i.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                if (MaxAdViewImpl.this.m.C()) {
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                i.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.m)) {
                i.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            i.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    private class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            r rVar = MaxAdViewImpl.this.logger;
            String str2 = MaxAdViewImpl.this.tag;
            rVar.b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.p) {
                MaxAdViewImpl.this.logger.b(MaxAdViewImpl.this.tag, "Successfully pre-cached ad for refresh");
                MaxAdViewImpl.this.a(maxAd);
                return;
            }
            r rVar = MaxAdViewImpl.this.logger;
            String str = MaxAdViewImpl.this.tag;
            rVar.b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            MaxAdViewImpl.this.sdk.C().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, k kVar, Activity activity) {
        super(str, maxAdFormat, "MaxAdView", kVar);
        this.d = LongCompanionObject.MAX_VALUE;
        this.l = new Object();
        this.m = null;
        this.p = false;
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.a = activity;
        this.b = maxAdView;
        this.c = view;
        this.g = new a();
        this.h = new c();
        this.i = new d(kVar, this);
        this.j = new w(maxAdView, kVar);
        this.k = new x(maxAdView, kVar, this);
        r rVar = this.logger;
        String str2 = this.tag;
        rVar.b(str2, "Created new MaxAdView (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.b.a(maxAdView, this.c);
        }
        this.k.a();
        synchronized (this.l) {
            bVar = this.m;
        }
        if (bVar != null) {
            this.sdk.aj().b(bVar);
            this.sdk.C().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (!Utils.bitMaskContainsFlag(j, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.z)).longValue())) {
            this.logger.b(this.tag, "No undesired viewability flags matched - scheduling viewability");
            this.n = false;
            b();
            return;
        }
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
        this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
        this.n = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnimatorListenerAdapter animatorListenerAdapter) {
        com.applovin.impl.mediation.a.b bVar = this.m;
        if (bVar == null || bVar.s() == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        View s = this.m.s();
        s.animate().alpha(0.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.v)).longValue()).setListener(animatorListenerAdapter).start();
    }

    private void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int q = bVar.q();
        int r = bVar.r();
        int dpToPx = q == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), q);
        int dpToPx2 = r != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), r) : -1;
        int height = this.b.getHeight();
        int width = this.b.getWidth();
        if ((height > 0 && height < dpToPx2) || (width > 0 && width < dpToPx)) {
            int pxToDp = AppLovinSdkUtils.pxToDp(view.getContext(), height);
            r.h("AppLovinSdk", "\n**************************************************\n`MaxAdView` size " + AppLovinSdkUtils.pxToDp(view.getContext(), width) + "x" + pxToDp + " dp smaller than required size: " + q + "x" + r + " dp\n**************************************************\n");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            this.logger.b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : o.a(this.b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new AnonymousClass2(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j) {
        this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        this.sdk.C().processViewabilityAdImpressionPostback(bVar, j, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, View view, MaxAdView maxAdView) {
        View view2;
        int i;
        view.setAlpha(0.0f);
        if (bVar.D() != LongCompanionObject.MAX_VALUE) {
            view2 = this.c;
            i = (int) bVar.D();
        } else {
            long j = this.d;
            if (j != LongCompanionObject.MAX_VALUE) {
                this.c.setBackgroundColor((int) j);
                maxAdView.addView(view);
                a(view, bVar);
                view.animate().alpha(1.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.u)).longValue()).start();
            }
            view2 = this.c;
            i = 0;
        }
        view2.setBackgroundColor(i);
        maxAdView.addView(view);
        a(view, bVar);
        view.animate().alpha(1.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.u)).longValue()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final a.InterfaceC0014a interfaceC0014a) {
        if (!d()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.m != null) {
                        MaxAdViewImpl.this.loadRequestBuilder.a("visible_ad_ad_unit_id", MaxAdViewImpl.this.m.getAdUnitId()).a("viewability_flags", String.valueOf(MaxAdViewImpl.this.j.a(MaxAdViewImpl.this.m)));
                    } else {
                        MaxAdViewImpl.this.loadRequestBuilder.a("visible_ad_ad_unit_id").a("viewability_flags");
                    }
                    MaxAdViewImpl.this.loadRequestBuilder.a("viewport_width", String.valueOf(AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.b.getContext(), MaxAdViewImpl.this.b.getWidth()))).a("viewport_height", String.valueOf(AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.b.getContext(), MaxAdViewImpl.this.b.getHeight())));
                    r rVar = MaxAdViewImpl.this.logger;
                    String str = MaxAdViewImpl.this.tag;
                    rVar.b(str, "Loading banner ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + interfaceC0014a + "...");
                    MaxAdViewImpl.this.sdk.C().loadAd(MaxAdViewImpl.this.adUnitId, MaxAdViewImpl.this.adFormat, MaxAdViewImpl.this.loadRequestBuilder.a(), MaxAdViewImpl.this.a, interfaceC0014a);
                }
            });
            return;
        }
        r.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        i.a(this.adListener, this.adUnitId, new MaxErrorImpl(-1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.aj().a(maxAd);
        if (!this.o) {
            this.e = (com.applovin.impl.mediation.a.b) maxAd;
            return;
        }
        this.o = false;
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
        this.g.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.o).contains(String.valueOf(maxError.getCode()))) {
            r z = this.sdk.z();
            String str = this.tag;
            z.b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            return;
        }
        this.n = true;
        long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.n)).longValue();
        if (longValue >= 0) {
            r z2 = this.sdk.z();
            String str2 = this.tag;
            z2.b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
            this.i.a(longValue);
        }
    }

    private void b() {
        if (c()) {
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.A)).longValue();
            r rVar = this.logger;
            String str = this.tag;
            rVar.b(str, "Scheduling refresh precache request in " + TimeUnit.MICROSECONDS.toSeconds(longValue) + " seconds...");
            this.sdk.Q().a(new y(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.a(maxAdViewImpl.h);
                }
            }), com.applovin.impl.mediation.c.c.a(this.adFormat), longValue);
        }
    }

    private boolean c() {
        return ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.A)).longValue() > 0;
    }

    private boolean d() {
        boolean z;
        synchronized (this.l) {
            z = this.p;
        }
        return z;
    }

    public void destroy() {
        a();
        if (this.e != null) {
            this.sdk.aj().b(this.e);
            this.sdk.C().destroyAd(this.e);
        }
        synchronized (this.l) {
            this.p = true;
        }
        this.i.c();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f;
    }

    public void loadAd() {
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "" + this + " Loading ad for " + this.adUnitId + "...");
        if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.B)).booleanValue() || !this.i.a()) {
            a(this.g);
            return;
        }
        String str2 = this.tag;
        r.i(str2, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.i.b()) + " seconds.");
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        r rVar;
        String str;
        String str2;
        this.o = false;
        if (this.e != null) {
            r rVar2 = this.logger;
            String str3 = this.tag;
            rVar2.b(str3, "Refreshing for cached ad: " + this.e.getAdUnitId() + "...");
            this.g.onAdLoaded(this.e);
            this.e = null;
            return;
        }
        if (!c()) {
            rVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network...";
        } else if (!this.n) {
            this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            this.o = true;
            return;
        } else {
            rVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
        }
        rVar.b(str, str2);
        loadAd();
    }

    @Override // com.applovin.impl.sdk.x.a
    public void onLogVisibilityImpression() {
        a(this.m, this.j.a(this.m));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.s)).booleanValue() && this.i.a()) {
            if (o.a(i)) {
                this.logger.b(this.tag, "Ad view visible");
                this.i.g();
                return;
            }
            this.logger.b(this.tag, "Ad view hidden");
            this.i.f();
        }
    }

    public void setPlacement(String str) {
        if (this.m != null) {
            String str2 = this.tag;
            r.i(str2, "Placement for ad unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.d = i;
    }

    public void startAutoRefresh() {
        this.i.e();
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Resumed auto-refresh with remaining time: " + this.i.b());
    }

    public void stopAutoRefresh() {
        if (this.m == null) {
            r.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
            return;
        }
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Pausing auto-refresh with remaining time: " + this.i.b());
        this.i.d();
    }

    public String toString() {
        return "MaxAdView{adUnitId='" + this.adUnitId + "', adListener=" + this.adListener + ", isDestroyed=" + d() + '}';
    }
}
