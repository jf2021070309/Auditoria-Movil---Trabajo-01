package com.applovin.impl.mediation.ads;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.aa;
import com.applovin.impl.sdk.ab;
import com.applovin.impl.sdk.d;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class MaxAdViewImpl extends com.applovin.impl.mediation.ads.a implements ab.a, d.a {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxAdView f3345b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3346c;

    /* renamed from: d  reason: collision with root package name */
    private final View f3347d;

    /* renamed from: e  reason: collision with root package name */
    private long f3348e;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f3349f;

    /* renamed from: g  reason: collision with root package name */
    private String f3350g;

    /* renamed from: h  reason: collision with root package name */
    private final a f3351h;

    /* renamed from: i  reason: collision with root package name */
    private final c f3352i;

    /* renamed from: j  reason: collision with root package name */
    private final d f3353j;

    /* renamed from: k  reason: collision with root package name */
    private final aa f3354k;

    /* renamed from: l  reason: collision with root package name */
    private final ab f3355l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f3356m;

    /* renamed from: n  reason: collision with root package name */
    private com.applovin.impl.mediation.a.b f3357n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ com.applovin.impl.mediation.a.b a;

        public AnonymousClass2(com.applovin.impl.mediation.a.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            final View x = this.a.x();
            String str = x == null ? "MaxAdView does not have a loaded ad view" : null;
            final MaxAdView maxAdView = MaxAdViewImpl.this.f3345b;
            if (maxAdView == null) {
                str = "MaxAdView does not have a parent view";
            }
            if (str == null) {
                MaxAdViewImpl.this.a(new AnimatorListenerAdapter() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        MaxAdViewImpl.this.a();
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        MaxAdViewImpl.this.a((com.applovin.impl.mediation.a.a) anonymousClass2.a);
                        MaxAdViewImpl.this.sdk.ak().a(AnonymousClass2.this.a);
                        if (AnonymousClass2.this.a.H()) {
                            MaxAdViewImpl.this.f3355l.a(AnonymousClass2.this.a);
                        }
                        maxAdView.setDescendantFocusability(393216);
                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                        MaxAdViewImpl.this.a(anonymousClass22.a, x, maxAdView);
                        synchronized (MaxAdViewImpl.this.f3356m) {
                            AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                            MaxAdViewImpl.this.f3357n = anonymousClass23.a;
                        }
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Scheduling impression for ad manually...");
                        MediationServiceImpl E = MaxAdViewImpl.this.sdk.E();
                        AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                        E.processRawAdImpressionPostback(anonymousClass24.a, MaxAdViewImpl.this.f3351h);
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                long a = MaxAdViewImpl.this.f3354k.a(AnonymousClass2.this.a);
                                if (!AnonymousClass2.this.a.H()) {
                                    AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                                    MaxAdViewImpl.this.a(anonymousClass25.a, a);
                                }
                                MaxAdViewImpl.this.a(a);
                            }
                        }, AnonymousClass2.this.a.y());
                    }
                });
                return;
            }
            MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
            maxAdViewImpl.logger.e(maxAdViewImpl.tag, str);
            j.a(MaxAdViewImpl.this.adListener, this.a, new MaxErrorImpl(-1, str));
        }
    }

    /* loaded from: classes.dex */
    public class a extends b {
        private a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            j.a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.s) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                v vVar = maxAdViewImpl.logger;
                String str = maxAdViewImpl.tag;
                StringBuilder y = e.a.d.a.a.y("Precache ad with ad unit ID '");
                y.append(MaxAdViewImpl.this.adUnitId);
                y.append("' loaded after MaxAdView was destroyed. Destroying the ad.");
                vVar.b(str, y.toString());
                MaxAdViewImpl.this.sdk.E().destroyAd(maxAd);
                return;
            }
            com.applovin.impl.mediation.a.b bVar = (com.applovin.impl.mediation.a.b) maxAd;
            bVar.d(MaxAdViewImpl.this.f3350g);
            bVar.e(MaxAdViewImpl.this.customPostbackData);
            if (bVar.x() == null) {
                MaxAdViewImpl.this.sdk.E().destroyAd(bVar);
                onAdLoadFailed(bVar.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            MaxAdViewImpl.this.a(bVar);
            if (bVar.z()) {
                long A = bVar.A();
                v B = MaxAdViewImpl.this.sdk.B();
                String str2 = MaxAdViewImpl.this.tag;
                B.b(str2, "Scheduling banner ad refresh " + A + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                MaxAdViewImpl.this.f3353j.a(A);
                if (MaxAdViewImpl.this.f3353j.f() || MaxAdViewImpl.this.p) {
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.logger.b(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    MaxAdViewImpl.this.f3353j.d();
                }
            }
            j.a(MaxAdViewImpl.this.adListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    public abstract class b implements a.InterfaceC0074a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                j.d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                if (MaxAdViewImpl.this.f3357n.B()) {
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                j.h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                j.a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                j.b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                if (MaxAdViewImpl.this.f3357n.B()) {
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                j.g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f3357n)) {
                j.c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* loaded from: classes.dex */
    public class c extends b {
        private c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
            v vVar = maxAdViewImpl.logger;
            String str2 = maxAdViewImpl.tag;
            StringBuilder y = e.a.d.a.a.y("Failed to precache ad for refresh with error code: ");
            y.append(maxError.getCode());
            vVar.b(str2, y.toString());
            MaxAdViewImpl.this.a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.s) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Successfully pre-cached ad for refresh");
                MaxAdViewImpl.this.a(maxAd);
                return;
            }
            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
            v vVar = maxAdViewImpl2.logger;
            String str = maxAdViewImpl2.tag;
            StringBuilder y = e.a.d.a.a.y("Ad with ad unit ID '");
            y.append(MaxAdViewImpl.this.adUnitId);
            y.append("' loaded after MaxAdView was destroyed. Destroying the ad.");
            vVar.b(str, y.toString());
            MaxAdViewImpl.this.sdk.E().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, m mVar, Context context) {
        super(str, maxAdFormat, "MaxAdView", mVar);
        this.f3346c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f3348e = Long.MAX_VALUE;
        this.f3356m = new Object();
        this.f3357n = null;
        this.s = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.a = context.getApplicationContext();
        this.f3345b = maxAdView;
        this.f3347d = view;
        this.f3351h = new a();
        this.f3352i = new c();
        this.f3353j = new d(mVar, this);
        this.f3354k = new aa(maxAdView, mVar);
        this.f3355l = new ab(maxAdView, mVar, this);
        v vVar = this.logger;
        String str2 = this.tag;
        vVar.b(str2, "Created new MaxAdView (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.b bVar;
        MaxAdView maxAdView = this.f3345b;
        if (maxAdView != null) {
            com.applovin.impl.sdk.utils.b.a(maxAdView, this.f3347d);
        }
        this.f3355l.a();
        synchronized (this.f3356m) {
            bVar = this.f3357n;
        }
        if (bVar != null) {
            this.sdk.ak().b(bVar);
            this.sdk.E().destroyAd(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j2) {
        if (!Utils.bitMaskContainsFlag(j2, ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.D)).longValue())) {
            this.logger.b(this.tag, "No undesired viewability flags matched - scheduling viewability");
            this.o = false;
            b();
            return;
        }
        v vVar = this.logger;
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Undesired flags matched - current: ");
        y.append(Long.toBinaryString(j2));
        y.append(", undesired: ");
        y.append(Long.toBinaryString(j2));
        vVar.b(str, y.toString());
        this.logger.b(this.tag, "Waiting for refresh timer to manually fire request");
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnimatorListenerAdapter animatorListenerAdapter) {
        com.applovin.impl.mediation.a.b bVar = this.f3357n;
        if (bVar == null || bVar.x() == null || !((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.z)).booleanValue()) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        View x = this.f3357n.x();
        x.animate().alpha(0.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.y)).longValue()).setListener(animatorListenerAdapter).start();
    }

    private void a(View view, com.applovin.impl.mediation.a.b bVar) {
        int v = bVar.v();
        int w = bVar.w();
        int dpToPx = v == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), v);
        int dpToPx2 = w != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), w) : -1;
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
            for (int i2 : p.a(this.f3345b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i2);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar) {
        AppLovinSdkUtils.runOnUiThread(new AnonymousClass2(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, long j2) {
        this.logger.b(this.tag, "Scheduling viewability impression for ad...");
        this.sdk.E().processViewabilityAdImpressionPostback(bVar, j2, this.f3351h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.b bVar, View view, MaxAdView maxAdView) {
        view.setAlpha(0.0f);
        if (bVar.C() != Long.MAX_VALUE) {
            this.f3347d.setBackgroundColor((int) bVar.C());
        } else {
            long j2 = this.f3348e;
            if (j2 != Long.MAX_VALUE) {
                this.f3347d.setBackgroundColor((int) j2);
            } else {
                this.f3347d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(view);
        a(view, bVar);
        b(bVar);
        view.animate().alpha(1.0f).setDuration(((Long) this.sdk.a(com.applovin.impl.sdk.c.a.x)).longValue()).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final a.InterfaceC0074a interfaceC0074a) {
        if (f()) {
            v.i(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.f3357n != null) {
                        long a2 = MaxAdViewImpl.this.f3354k.a(MaxAdViewImpl.this.f3357n);
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.loadRequestBuilder.a("visible_ad_ad_unit_id", maxAdViewImpl.f3357n.getAdUnitId()).a("viewability_flags", String.valueOf(a2));
                    } else {
                        MaxAdViewImpl.this.loadRequestBuilder.c("visible_ad_ad_unit_id").c("viewability_flags");
                    }
                    MaxAdViewImpl.this.loadRequestBuilder.a("viewport_width", String.valueOf(AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f3345b.getContext(), MaxAdViewImpl.this.f3345b.getWidth()))).a("viewport_height", String.valueOf(AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f3345b.getContext(), MaxAdViewImpl.this.f3345b.getHeight())));
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    v vVar = maxAdViewImpl2.logger;
                    String str = maxAdViewImpl2.tag;
                    StringBuilder y = e.a.d.a.a.y("Loading ");
                    y.append(MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH));
                    y.append(" ad for '");
                    y.append(MaxAdViewImpl.this.adUnitId);
                    y.append("' and notifying ");
                    y.append(interfaceC0074a);
                    y.append("...");
                    vVar.b(str, y.toString());
                    MediationServiceImpl E = MaxAdViewImpl.this.sdk.E();
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    String str2 = maxAdViewImpl3.adUnitId;
                    String str3 = maxAdViewImpl3.f3346c;
                    MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                    E.loadAd(str2, str3, maxAdViewImpl4.adFormat, maxAdViewImpl4.localExtraParameters, maxAdViewImpl4.loadRequestBuilder.a(), MaxAdViewImpl.this.a, interfaceC0074a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.r = false;
        this.sdk.ak().a(maxAd);
        if (!this.q) {
            this.logger.b(this.tag, "Saving pre-cache ad...");
            this.f3349f = (com.applovin.impl.mediation.a.b) maxAd;
            return;
        }
        this.q = false;
        v vVar = this.logger;
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Rendering precache request ad: ");
        y.append(maxAd.getAdUnitId());
        y.append("...");
        vVar.b(str, y.toString());
        this.f3351h.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxError maxError) {
        if (this.sdk.b(com.applovin.impl.sdk.c.a.o).contains(String.valueOf(maxError.getCode()))) {
            v B = this.sdk.B();
            String str = this.tag;
            StringBuilder y = e.a.d.a.a.y("Ignoring banner ad refresh for error code ");
            y.append(maxError.getCode());
            B.b(str, y.toString());
            return;
        }
        this.o = true;
        long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.f3927n)).longValue();
        if (longValue >= 0) {
            v B2 = this.sdk.B();
            String str2 = this.tag;
            B2.b(str2, "Scheduling failed banner ad refresh " + longValue + " milliseconds from now for '" + this.adUnitId + "'...");
            this.f3353j.a(longValue);
        }
    }

    private void b() {
        if (e()) {
            long longValue = ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.E)).longValue();
            v vVar = this.logger;
            String str = this.tag;
            StringBuilder y = e.a.d.a.a.y("Scheduling refresh precache request in ");
            y.append(TimeUnit.MILLISECONDS.toSeconds(longValue));
            y.append(" seconds...");
            vVar.b(str, y.toString());
            this.r = true;
            this.sdk.S().a(new z(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.b(maxAdViewImpl.tag, "Loading ad for pre-cache request...");
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.a(maxAdViewImpl2.f3352i);
                }
            }), com.applovin.impl.mediation.c.c.a(this.adFormat), longValue);
        }
    }

    private void b(com.applovin.impl.mediation.a.b bVar) {
        int height = this.f3345b.getHeight();
        int width = this.f3345b.getWidth();
        if (height > 0 || width > 0) {
            int pxToDp = AppLovinSdkUtils.pxToDp(this.a, height);
            int pxToDp2 = AppLovinSdkUtils.pxToDp(this.a, width);
            MaxAdFormat format = bVar.getFormat();
            boolean c2 = c();
            int height2 = (c2 ? format.getAdaptiveSize(pxToDp2, this.a) : format.getSize()).getHeight();
            int width2 = format.getSize().getWidth();
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder sb = new StringBuilder();
                sb.append("\n**************************************************\n`MaxAdView` size ");
                sb.append(pxToDp2);
                sb.append("x");
                sb.append(pxToDp);
                sb.append(" dp smaller than required ");
                sb.append(c2 ? "adaptive " : "");
                sb.append("size: ");
                sb.append(width2);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\n**************************************************\n");
                v.h("AppLovinSdk", sb.toString());
            }
        }
    }

    private boolean c() {
        return "true".equalsIgnoreCase(this.loadRequestBuilder.b("adaptive_banner"));
    }

    private void d() {
        v vVar = this.logger;
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Refreshing for cached ad: ");
        y.append(this.f3349f);
        y.append("...");
        vVar.b(str, y.toString());
        this.f3351h.onAdLoaded(this.f3349f);
        this.f3349f = null;
    }

    private boolean e() {
        return ((Long) this.sdk.a(com.applovin.impl.sdk.c.a.E)).longValue() > 0;
    }

    private boolean f() {
        boolean z;
        synchronized (this.f3356m) {
            z = this.s;
        }
        return z;
    }

    public void destroy() {
        a();
        if (this.f3349f != null) {
            this.sdk.ak().b(this.f3349f);
            this.sdk.E().destroyAd(this.f3349f);
        }
        synchronized (this.f3356m) {
            this.s = true;
        }
        this.f3353j.c();
        this.adListener = null;
        this.revenueListener = null;
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f3350g;
    }

    public void loadAd() {
    }

    @Override // com.applovin.impl.sdk.d.a
    public void onAdRefresh() {
        v vVar;
        String str;
        String str2;
        this.q = false;
        if (this.f3349f != null) {
            d();
            return;
        }
        if (!e()) {
            vVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network...";
        } else if (!this.o) {
            this.logger.e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            this.q = true;
            return;
        } else {
            vVar = this.logger;
            str = this.tag;
            str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
        }
        vVar.b(str, str2);
    }

    @Override // com.applovin.impl.sdk.ab.a
    public void onLogVisibilityImpression() {
        a(this.f3357n, this.f3354k.a(this.f3357n));
    }

    public void onWindowVisibilityChanged(int i2) {
        if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.s)).booleanValue() && this.f3353j.a()) {
            if (p.a(i2)) {
                this.logger.b(this.tag, "Ad view visible");
                this.f3353j.h();
                return;
            }
            this.logger.b(this.tag, "Ad view hidden");
            this.f3353j.g();
        }
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void setExtraParameter(String str, String str2) {
        if (!"allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            super.setExtraParameter(str, str2);
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(str2);
        this.t = parseBoolean;
        this.f3353j.a(parseBoolean);
    }

    public void setPlacement(String str) {
        if (this.f3357n != null) {
            String str2 = this.tag;
            StringBuilder y = e.a.d.a.a.y("Placement for Ad Unit ID (");
            y.append(this.adUnitId);
            y.append(") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the ");
            y.append(this.adFormat.getLabel());
            y.append(".");
            v.i(str2, y.toString());
        }
        this.f3350g = str;
    }

    public void setPublisherBackgroundColor(int i2) {
        this.f3348e = i2;
    }

    public void startAutoRefresh() {
        v vVar;
        String str;
        String str2;
        this.p = false;
        if (this.f3353j.f()) {
            this.f3353j.e();
            vVar = this.logger;
            str = this.tag;
            StringBuilder y = e.a.d.a.a.y("Resumed auto-refresh with remaining time: ");
            y.append(this.f3353j.b());
            y.append("ms");
            str2 = y.toString();
        } else {
            vVar = this.logger;
            str = this.tag;
            str2 = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        }
        vVar.b(str, str2);
    }

    public void stopAutoRefresh() {
        if (this.f3357n == null) {
            if (this.t || ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.w)).booleanValue()) {
                this.p = true;
                return;
            } else {
                v.h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        v vVar = this.logger;
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Pausing auto-refresh with remaining time: ");
        y.append(this.f3353j.b());
        y.append("ms");
        vVar.b(str, y.toString());
        this.f3353j.d();
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("MaxAdView{adUnitId='");
        e.a.d.a.a.J(y, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", adListener=");
        y.append(this.adListener);
        y.append(", isDestroyed=");
        y.append(f());
        y.append('}');
        return y.toString();
    }
}
