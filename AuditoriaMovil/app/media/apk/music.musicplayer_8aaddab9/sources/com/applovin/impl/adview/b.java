package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private volatile AppLovinAdViewEventListener A;
    private volatile AppLovinAdClickListener B;
    private Context a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f3189b;

    /* renamed from: c  reason: collision with root package name */
    private com.applovin.impl.sdk.m f3190c;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinAdServiceImpl f3191d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.sdk.v f3192e;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinCommunicator f3193f;

    /* renamed from: g  reason: collision with root package name */
    private AppLovinAdSize f3194g;

    /* renamed from: h  reason: collision with root package name */
    private String f3195h;

    /* renamed from: i  reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f3196i;

    /* renamed from: j  reason: collision with root package name */
    private e f3197j;

    /* renamed from: k  reason: collision with root package name */
    private c f3198k;

    /* renamed from: l  reason: collision with root package name */
    private d f3199l;

    /* renamed from: m  reason: collision with root package name */
    private Runnable f3200m;

    /* renamed from: n  reason: collision with root package name */
    private Runnable f3201n;
    private i.a o;
    private volatile AppLovinAdLoadListener y;
    private volatile AppLovinAdDisplayListener z;
    private volatile com.applovin.impl.sdk.ad.e p = null;
    private volatile AppLovinAd q = null;
    private l r = null;
    private l s = null;
    private final AtomicReference<AppLovinAd> t = new AtomicReference<>();
    private final AtomicBoolean u = new AtomicBoolean();
    private volatile boolean v = false;
    private volatile boolean w = false;
    private volatile boolean x = false;
    private volatile g C = null;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f3199l != null) {
                b.this.f3199l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0070b implements Runnable {
        private RunnableC0070b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.p != null) {
                if (b.this.f3199l == null) {
                    StringBuilder y = e.a.d.a.a.y("Unable to render advertisement for ad #");
                    y.append(b.this.p.getAdIdNumber());
                    y.append(". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    com.applovin.impl.sdk.v.i("AppLovinAdView", y.toString());
                    com.applovin.impl.sdk.utils.j.a(b.this.A, b.this.p, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                b.this.x();
                com.applovin.impl.sdk.v vVar = b.this.f3192e;
                StringBuilder y2 = e.a.d.a.a.y("Rendering advertisement ad for #");
                y2.append(b.this.p.getAdIdNumber());
                y2.append("...");
                vVar.b("AppLovinAdView", y2.toString());
                b.b(b.this.f3199l, b.this.p.getSize());
                b.this.f3199l.a(b.this.p);
                if (b.this.p.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.w) {
                    b bVar = b.this;
                    bVar.f3196i = new com.applovin.impl.sdk.d.d(bVar.p, b.this.f3190c);
                    b.this.f3196i.a();
                    b.this.f3199l.setStatsManagerHelper(b.this.f3196i);
                    b.this.p.setHasShown(true);
                }
                if (b.this.f3199l.getStatsManagerHelper() != null) {
                    b.this.f3199l.getStatsManagerHelper().a(b.this.p.x() ? 0L : 1L);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements AppLovinAdLoadListener {
        private final b a;

        public c(b bVar, com.applovin.impl.sdk.m mVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (mVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.a = bVar;
        }

        private b a() {
            return this.a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            b a = a();
            if (a != null) {
                a.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.v.i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i2) {
            b a = a();
            if (a != null) {
                a.a(i2);
            }
        }
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.m mVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f3190c = mVar;
        this.f3191d = mVar.u();
        this.f3192e = mVar.B();
        this.f3193f = AppLovinCommunicator.getInstance(context);
        this.f3194g = appLovinAdSize;
        this.f3195h = str;
        this.a = context;
        this.f3189b = appLovinAdView;
        this.f3197j = new e(this, mVar);
        this.f3201n = new a();
        this.f3200m = new RunnableC0070b();
        this.f3198k = new c(this, mVar);
        this.o = new i.a();
        a(appLovinAdSize);
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int applyDimension = label.equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int applyDimension2 = appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    private void t() {
        com.applovin.impl.sdk.v vVar = this.f3192e;
        if (vVar != null) {
            vVar.b("AppLovinAdView", "Destroying...");
        }
        d dVar = this.f3199l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f3199l);
            }
            this.f3199l.removeAllViews();
            this.f3199l.loadUrl("about:blank");
            this.f3199l.onPause();
            this.f3199l.destroyDrawingCache();
            this.f3199l.destroy();
            this.f3199l = null;
            this.f3190c.ak().b(this.p);
        }
        this.w = true;
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.r != null) {
                    com.applovin.impl.sdk.v vVar = b.this.f3192e;
                    StringBuilder y = e.a.d.a.a.y("Detaching expanded ad: ");
                    y.append(b.this.r.a());
                    vVar.b("AppLovinAdView", y.toString());
                    b bVar = b.this;
                    bVar.s = bVar.r;
                    b.this.r = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.f3194g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.8
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.ad.a a2;
                if (b.this.s == null && b.this.r == null) {
                    return;
                }
                if (b.this.s != null) {
                    a2 = b.this.s.a();
                    b.this.s.dismiss();
                    b.this.s = null;
                } else {
                    a2 = b.this.r.a();
                    b.this.r.dismiss();
                    b.this.r = null;
                }
                com.applovin.impl.sdk.utils.j.b(b.this.A, a2, (AppLovinAdView) b.this.f3189b);
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.f3196i;
        if (dVar != null) {
            dVar.c();
            this.f3196i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.applovin.impl.sdk.ad.e eVar = this.p;
        com.applovin.impl.sdk.utils.k kVar = new com.applovin.impl.sdk.utils.k();
        kVar.a().a(eVar).a(r());
        if (!Utils.isBML(eVar.getSize())) {
            kVar.a().a("Fullscreen Ad Properties").b(eVar);
        }
        kVar.a(this.f3190c);
        kVar.a();
        com.applovin.impl.sdk.v.f("AppLovinAdView", kVar.toString());
    }

    public void a() {
        if (this.f3190c == null || this.f3198k == null || this.a == null || !this.v) {
            com.applovin.impl.sdk.v.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
            return;
        }
        d dVar = this.f3199l;
        if (dVar != null) {
            this.o.a("viewport_width", String.valueOf(AppLovinSdkUtils.pxToDp(this.a, dVar.getWidth()))).a("viewport_height", String.valueOf(AppLovinSdkUtils.pxToDp(this.a, this.f3199l.getHeight())));
        }
        this.f3191d.loadNextAd(this.f3195h, this.f3194g, this.o.a(), this.f3198k);
    }

    public void a(final int i2) {
        if (!this.w) {
            a(this.f3201n);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.y != null) {
                        b.this.y.failedToReceiveAd(i2);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.v.c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.r == null && (b.this.p instanceof com.applovin.impl.sdk.ad.a) && b.this.f3199l != null) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) b.this.p;
                    Activity retrieveParentActivity = b.this.a instanceof Activity ? (Activity) b.this.a : Utils.retrieveParentActivity(b.this.f3199l, b.this.f3190c);
                    if (retrieveParentActivity == null) {
                        com.applovin.impl.sdk.v.i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                        Uri i2 = aVar.i();
                        if (i2 != null) {
                            AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.f3191d;
                            AppLovinAdView r = b.this.r();
                            b bVar = b.this;
                            appLovinAdServiceImpl.trackAndLaunchClick(aVar, r, bVar, i2, pointF, bVar.x);
                            if (b.this.f3196i != null) {
                                b.this.f3196i.b();
                            }
                        }
                        b.this.f3199l.a("javascript:al_onFailedExpand();");
                        return;
                    }
                    if (b.this.f3189b != null) {
                        b.this.f3189b.removeView(b.this.f3199l);
                    }
                    b.this.r = new l(aVar, b.this.f3199l, retrieveParentActivity, b.this.f3190c);
                    b.this.r.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.4.1
                        @Override // android.content.DialogInterface.OnDismissListener
                        public void onDismiss(DialogInterface dialogInterface) {
                            b.this.k();
                        }
                    });
                    b.this.r.show();
                    com.applovin.impl.sdk.utils.j.a(b.this.A, b.this.p, (AppLovinAdView) b.this.f3189b);
                    if (b.this.f3196i != null) {
                        b.this.f3196i.d();
                    }
                    if (b.this.p.isOpenMeasurementEnabled()) {
                        b.this.p.getAdEventTracker().a((View) b.this.r.b());
                    }
                }
            }
        });
    }

    public void a(final WebView webView) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.p == this.q || this.z == null) {
                return;
            }
            this.q = this.p;
            com.applovin.impl.sdk.utils.j.a(this.z, this.p);
            this.f3190c.ak().a(this.p);
            this.f3199l.a("javascript:al_onAdViewRendered();");
        } catch (Throwable th) {
            com.applovin.impl.sdk.v.c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.v.i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = com.applovin.impl.sdk.utils.b.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk == null || appLovinSdk.hasCriticalErrors()) {
            return;
        }
        a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
        if (com.applovin.impl.sdk.utils.b.b(attributeSet)) {
            a();
        }
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.A = appLovinAdViewEventListener;
    }

    public void a(g gVar) {
        this.C = gVar;
    }

    public void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        com.applovin.impl.sdk.utils.j.a(this.B, eVar);
        if (appLovinAdView != null) {
            this.f3191d.trackAndLaunchClick(eVar, appLovinAdView, this, uri, pointF, this.x);
        } else {
            this.f3192e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.f3199l;
        if (dVar2 != null) {
            dVar2.setStatsManagerHelper(dVar);
        }
    }

    public void a(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        Utils.validateAdSdkKey(appLovinAd, this.f3190c);
        if (!this.v) {
            com.applovin.impl.sdk.v.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        com.applovin.impl.sdk.ad.e eVar = (com.applovin.impl.sdk.ad.e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f3190c);
        if (eVar == null || eVar == this.p) {
            if (eVar == null) {
                this.f3192e.d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                return;
            }
            com.applovin.impl.sdk.v vVar = this.f3192e;
            StringBuilder y = e.a.d.a.a.y("Ad #");
            y.append(eVar.getAdIdNumber());
            y.append(" is already showing, ignoring");
            vVar.d("AppLovinAdView", y.toString());
            if (((Boolean) this.f3190c.a(com.applovin.impl.sdk.c.b.ce)).booleanValue()) {
                throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
            }
            return;
        }
        com.applovin.impl.sdk.v vVar2 = this.f3192e;
        StringBuilder y2 = e.a.d.a.a.y("Rendering ad #");
        y2.append(eVar.getAdIdNumber());
        y2.append(" (");
        y2.append(eVar.getSize());
        y2.append(")");
        vVar2.b("AppLovinAdView", y2.toString());
        com.applovin.impl.sdk.utils.j.b(this.z, this.p);
        this.f3190c.ak().b(this.p);
        if (eVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
            w();
        }
        if (this.p != null && this.p.isOpenMeasurementEnabled()) {
            this.p.getAdEventTracker().e();
        }
        this.t.set(null);
        this.q = null;
        this.p = eVar;
        if (!this.w && Utils.isBML(this.f3194g)) {
            this.f3190c.u().trackImpression(eVar);
        }
        if (this.r != null) {
            u();
        }
        a(this.f3200m);
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.B = appLovinAdClickListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.z = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.y = appLovinAdLoadListener;
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.f3197j, this.f3190c, this.a);
            this.f3199l = dVar;
            dVar.setBackgroundColor(0);
            this.f3199l.setWillNotCacheDrawing(false);
            this.f3189b.setBackgroundColor(0);
            this.f3189b.addView(this.f3199l);
            b(this.f3199l, appLovinAdSize);
            if (!this.v) {
                a(this.f3201n);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f3199l.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
                }
            });
            this.v = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.v.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.u.set(true);
        }
    }

    public AppLovinAdSize b() {
        return this.f3194g;
    }

    public void b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            this.f3192e.e("AppLovinAdView", "No provided when to the view controller");
            a(-1);
            return;
        }
        if (this.w) {
            this.t.set(appLovinAd);
            this.f3192e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
        } else {
            a(appLovinAd);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.u.compareAndSet(true, false)) {
                    b bVar = b.this;
                    bVar.a(bVar.f3194g);
                }
                try {
                    if (b.this.y != null) {
                        b.this.y.adReceived(appLovinAd);
                    }
                } catch (Throwable th) {
                    StringBuilder y = e.a.d.a.a.y("Exception while running ad load callback: ");
                    y.append(th.getMessage());
                    com.applovin.impl.sdk.v.i("AppLovinAdView", y.toString());
                }
            }
        });
    }

    public String c() {
        return this.f3195h;
    }

    public void d() {
        if (!this.v || this.w) {
            return;
        }
        this.w = true;
    }

    public void e() {
        if (this.v) {
            AppLovinAd andSet = this.t.getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
            this.w = false;
        }
    }

    public void f() {
        if (this.f3199l != null && this.r != null) {
            k();
        }
        t();
    }

    public AppLovinAdViewEventListener g() {
        return this.A;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return b.class.getSimpleName();
    }

    public g h() {
        return this.C;
    }

    public void i() {
        if (com.applovin.impl.sdk.utils.b.a(this.f3199l)) {
            this.f3190c.T().a(com.applovin.impl.sdk.d.f.f4006m);
        }
    }

    public void j() {
        if (this.v) {
            com.applovin.impl.sdk.utils.j.b(this.z, this.p);
            this.f3190c.ak().b(this.p);
            if (this.p != null && this.p.isOpenMeasurementEnabled()) {
                this.p.getAdEventTracker().e();
            }
            if (this.f3199l == null || this.r == null) {
                this.f3192e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                return;
            }
            this.f3192e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            u();
        }
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.f3189b == null || b.this.f3199l == null || b.this.f3199l.getParent() != null) {
                    return;
                }
                b.this.f3189b.addView(b.this.f3199l);
                b.b(b.this.f3199l, b.this.p.getSize());
                if (b.this.p.isOpenMeasurementEnabled()) {
                    b.this.p.getAdEventTracker().a((View) b.this.f3199l);
                }
            }
        });
    }

    public void l() {
        if (this.r != null || this.s != null) {
            k();
            return;
        }
        com.applovin.impl.sdk.v vVar = this.f3192e;
        StringBuilder y = e.a.d.a.a.y("Ad: ");
        y.append(this.p);
        y.append(" closed.");
        vVar.b("AppLovinAdView", y.toString());
        a(this.f3201n);
        com.applovin.impl.sdk.utils.j.b(this.z, this.p);
        this.f3190c.ak().b(this.p);
        this.p = null;
    }

    public void m() {
        this.x = true;
    }

    public void n() {
        this.x = false;
    }

    public void o() {
        if (!(this.a instanceof k) || this.p == null) {
            return;
        }
        if (this.p.D() == e.a.DISMISS) {
            ((k) this.a).dismiss();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new Runnable() { // from class: com.applovin.impl.adview.b.9
                @Override // java.lang.Runnable
                public void run() {
                    b.this.s().loadUrl("chrome://crash");
                }
            });
        }
    }

    public com.applovin.impl.sdk.ad.e p() {
        return this.p;
    }

    public com.applovin.impl.sdk.m q() {
        return this.f3190c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.f3189b;
    }

    public d s() {
        return this.f3199l;
    }
}
