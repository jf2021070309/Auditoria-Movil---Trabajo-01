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
import com.applovin.impl.sdk.a.g;
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
    private ViewGroup b;
    private com.applovin.impl.sdk.k c;
    private AppLovinAdServiceImpl d;
    private com.applovin.impl.sdk.r e;
    private AppLovinCommunicator f;
    private AppLovinAdSize g;
    private String h;
    private com.applovin.impl.sdk.d.d i;
    private e j;
    private c k;
    private d l;
    private Runnable m;
    private Runnable n;
    private i.a o;
    private volatile AppLovinAdLoadListener y;
    private volatile AppLovinAdDisplayListener z;
    private volatile com.applovin.impl.sdk.a.g p = null;
    private volatile AppLovinAd q = null;
    private m r = null;
    private m s = null;
    private final AtomicReference<AppLovinAd> t = new AtomicReference<>();
    private final AtomicBoolean u = new AtomicBoolean();
    private volatile boolean v = false;
    private volatile boolean w = false;
    private volatile boolean x = false;
    private volatile g C = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.l != null) {
                b.this.l.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.adview.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0010b implements Runnable {
        private RunnableC0010b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.p != null) {
                if (b.this.l == null) {
                    com.applovin.impl.sdk.r.i("AppLovinAdView", "Unable to render advertisement for ad #" + b.this.p.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    com.applovin.impl.sdk.utils.i.a(b.this.A, b.this.p, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                b.this.x();
                com.applovin.impl.sdk.r rVar = b.this.e;
                rVar.b("AppLovinAdView", "Rendering advertisement ad for #" + b.this.p.getAdIdNumber() + "...");
                b.b(b.this.l, b.this.p.getSize());
                b.this.l.a(b.this.p);
                if (b.this.p.getSize() != AppLovinAdSize.INTERSTITIAL && !b.this.w) {
                    b.this.i = new com.applovin.impl.sdk.d.d(b.this.p, b.this.c);
                    b.this.i.a();
                    b.this.l.setStatsManagerHelper(b.this.i);
                    b.this.p.setHasShown(true);
                }
                if (b.this.l.getStatsManagerHelper() != null) {
                    b.this.l.getStatsManagerHelper().a(b.this.p.z() ? 0L : 1L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements AppLovinAdLoadListener {
        private final b a;

        c(b bVar, com.applovin.impl.sdk.k kVar) {
            if (bVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
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
                com.applovin.impl.sdk.r.i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            b a = a();
            if (a != null) {
                a.a(i);
            }
        }
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.c = kVar;
        this.d = kVar.t();
        this.e = kVar.z();
        this.f = AppLovinCommunicator.getInstance(context);
        this.g = appLovinAdSize;
        this.h = str;
        this.a = context;
        this.b = appLovinAdView;
        this.j = new e(this, kVar);
        this.n = new a();
        this.m = new RunnableC0010b();
        this.k = new c(this, kVar);
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
        int applyDimension = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int applyDimension2 = appLovinAdSize.getLabel().equals(AppLovinAdSize.INTERSTITIAL.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
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
        com.applovin.impl.sdk.r rVar = this.e;
        if (rVar != null) {
            rVar.b("AppLovinAdView", "Destroying...");
        }
        d dVar = this.l;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.l);
            }
            this.l.removeAllViews();
            this.l.loadUrl("about:blank");
            this.l.onPause();
            this.l.destroyDrawingCache();
            this.l.destroy();
            this.l = null;
            this.c.aj().b(this.p);
        }
        this.w = true;
    }

    private void u() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.2
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.r != null) {
                    com.applovin.impl.sdk.r rVar = b.this.e;
                    rVar.b("AppLovinAdView", "Detaching expanded ad: " + b.this.r.a());
                    b bVar = b.this;
                    bVar.s = bVar.r;
                    b.this.r = null;
                    b bVar2 = b.this;
                    bVar2.a(bVar2.g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.8
            @Override // java.lang.Runnable
            public void run() {
                com.applovin.impl.sdk.a.a a2;
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
                com.applovin.impl.sdk.utils.i.b(b.this.A, a2, (AppLovinAdView) b.this.b);
            }
        });
    }

    private void w() {
        com.applovin.impl.sdk.d.d dVar = this.i;
        if (dVar != null) {
            dVar.c();
            this.i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        com.applovin.impl.sdk.a.g gVar = this.p;
        com.applovin.impl.sdk.utils.j jVar = new com.applovin.impl.sdk.utils.j();
        jVar.a().a(gVar).a(r());
        if (!Utils.isBML(gVar.getSize())) {
            jVar.a().a("Fullscreen Ad Properties").b(gVar);
        }
        jVar.a(this.c);
        jVar.a();
        com.applovin.impl.sdk.r.f("AppLovinAdView", jVar.toString());
    }

    public void a() {
        if (this.c == null || this.k == null || this.a == null || !this.v) {
            com.applovin.impl.sdk.r.g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
            return;
        }
        d dVar = this.l;
        if (dVar != null) {
            this.o.a("viewport_width", String.valueOf(AppLovinSdkUtils.pxToDp(this.a, dVar.getWidth()))).a("viewport_height", String.valueOf(AppLovinSdkUtils.pxToDp(this.a, this.l.getHeight())));
        }
        this.d.loadNextAd(this.h, this.g, this.o.a(), this.k);
    }

    void a(final int i) {
        if (!this.w) {
            a(this.n);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (b.this.y != null) {
                        b.this.y.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.r.c("AppLovinAdView", "Exception while running app load  callback", th);
                }
            }
        });
    }

    public void a(final PointF pointF) {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.r == null && (b.this.p instanceof com.applovin.impl.sdk.a.a) && b.this.l != null) {
                    com.applovin.impl.sdk.a.a aVar = (com.applovin.impl.sdk.a.a) b.this.p;
                    Activity retrieveParentActivity = b.this.a instanceof Activity ? (Activity) b.this.a : Utils.retrieveParentActivity(b.this.l, b.this.c);
                    if (retrieveParentActivity != null) {
                        if (b.this.b != null) {
                            b.this.b.removeView(b.this.l);
                        }
                        b.this.r = new m(aVar, b.this.l, retrieveParentActivity, b.this.c);
                        b.this.r.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.4.1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface) {
                                b.this.k();
                            }
                        });
                        b.this.r.show();
                        com.applovin.impl.sdk.utils.i.a(b.this.A, b.this.p, (AppLovinAdView) b.this.b);
                        if (b.this.i != null) {
                            b.this.i.d();
                            return;
                        }
                        return;
                    }
                    com.applovin.impl.sdk.r.i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    Uri j = aVar.j();
                    if (j != null) {
                        AppLovinAdServiceImpl appLovinAdServiceImpl = b.this.d;
                        AppLovinAdView r = b.this.r();
                        b bVar = b.this;
                        appLovinAdServiceImpl.trackAndLaunchClick(aVar, r, bVar, j, pointF, bVar.x);
                        if (b.this.i != null) {
                            b.this.i.b();
                        }
                    }
                    b.this.l.a("javascript:al_onFailedExpand();");
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
            com.applovin.impl.sdk.utils.i.a(this.z, this.p);
            this.c.aj().a(this.p);
            this.l.a("javascript:al_onAdViewRendered();");
        } catch (Throwable th) {
            com.applovin.impl.sdk.r.c("AppLovinAdView", "Exception while notifying ad display listener", th);
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.r.i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.applovin.impl.sdk.a.g gVar, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        com.applovin.impl.sdk.utils.i.a(this.B, gVar);
        if (appLovinAdView != null) {
            this.d.trackAndLaunchClick(gVar, appLovinAdView, this, uri, pointF, this.x);
        } else {
            this.e.e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
    }

    public void a(com.applovin.impl.sdk.d.d dVar) {
        d dVar2 = this.l;
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
        Utils.validateAdSdkKey(appLovinAd, this.c);
        if (!this.v) {
            com.applovin.impl.sdk.r.g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        com.applovin.impl.sdk.a.g gVar = (com.applovin.impl.sdk.a.g) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.c);
        if (gVar == null || gVar == this.p) {
            if (gVar == null) {
                this.e.d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                return;
            }
            com.applovin.impl.sdk.r rVar = this.e;
            rVar.d("AppLovinAdView", "Ad #" + gVar.getAdIdNumber() + " is already showing, ignoring");
            if (((Boolean) this.c.a(com.applovin.impl.sdk.c.b.bS)).booleanValue()) {
                throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
            }
            return;
        }
        com.applovin.impl.sdk.r rVar2 = this.e;
        rVar2.b("AppLovinAdView", "Rendering ad #" + gVar.getAdIdNumber() + " (" + gVar.getSize() + ")");
        com.applovin.impl.sdk.utils.i.b(this.z, this.p);
        this.c.aj().b(this.p);
        if (gVar.getSize() != AppLovinAdSize.INTERSTITIAL) {
            w();
        }
        this.t.set(null);
        this.q = null;
        this.p = gVar;
        if (!this.w && Utils.isBML(this.g)) {
            this.c.t().trackImpression(gVar);
        }
        if (this.r != null) {
            u();
        }
        a(this.m);
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

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            d dVar = new d(this.j, this.c, this.a);
            this.l = dVar;
            dVar.setBackgroundColor(0);
            this.l.setWillNotCacheDrawing(false);
            this.b.setBackgroundColor(0);
            this.b.addView(this.l);
            b(this.l, appLovinAdSize);
            if (!this.v) {
                a(this.n);
            }
            a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.l.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
                }
            });
            this.v = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.r.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.u.set(true);
        }
    }

    public AppLovinAdSize b() {
        return this.g;
    }

    void b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            this.e.e("AppLovinAdView", "No provided when to the view controller");
            a(-1);
            return;
        }
        if (this.w) {
            this.t.set(appLovinAd);
            this.e.b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
        } else {
            a(appLovinAd);
        }
        a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (b.this.u.compareAndSet(true, false)) {
                    b bVar = b.this;
                    bVar.a(bVar.g);
                }
                try {
                    if (b.this.y != null) {
                        b.this.y.adReceived(appLovinAd);
                    }
                } catch (Throwable th) {
                    com.applovin.impl.sdk.r.i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                }
            }
        });
    }

    public String c() {
        return this.h;
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
        if (this.l != null && this.r != null) {
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
        if (com.applovin.impl.sdk.utils.b.a(this.l)) {
            this.c.R().a(com.applovin.impl.sdk.d.f.m);
        }
    }

    public void j() {
        if (this.v) {
            com.applovin.impl.sdk.utils.i.b(this.z, this.p);
            this.c.aj().b(this.p);
            if (this.l == null || this.r == null) {
                this.e.b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                return;
            }
            this.e.b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            u();
        }
    }

    public void k() {
        a(new Runnable() { // from class: com.applovin.impl.adview.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.v();
                if (b.this.b == null || b.this.l == null || b.this.l.getParent() != null) {
                    return;
                }
                b.this.b.addView(b.this.l);
                b.b(b.this.l, b.this.p.getSize());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        if (this.r != null || this.s != null) {
            k();
            return;
        }
        com.applovin.impl.sdk.r rVar = this.e;
        rVar.b("AppLovinAdView", "Ad: " + this.p + " closed.");
        a(this.n);
        com.applovin.impl.sdk.utils.i.b(this.z, this.p);
        this.c.aj().b(this.p);
        this.p = null;
    }

    public void m() {
        this.x = true;
    }

    public void n() {
        this.x = false;
    }

    public void o() {
        if (!(this.a instanceof l) || this.p == null) {
            return;
        }
        if (this.p.I() == g.a.DISMISS) {
            ((l) this.a).dismiss();
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

    public com.applovin.impl.sdk.a.g p() {
        return this.p;
    }

    public com.applovin.impl.sdk.k q() {
        return this.c;
    }

    public AppLovinAdView r() {
        return (AppLovinAdView) this.b;
    }

    public d s() {
        return this.l;
    }
}
