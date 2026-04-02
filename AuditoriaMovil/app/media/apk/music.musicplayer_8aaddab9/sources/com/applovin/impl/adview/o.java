package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class o implements AppLovinInterstitialAdDialog {
    public final com.applovin.impl.sdk.m a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f3238b;

    /* renamed from: c  reason: collision with root package name */
    private volatile AppLovinAdLoadListener f3239c;

    /* renamed from: d  reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f3240d;

    /* renamed from: e  reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f3241e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AppLovinAdClickListener f3242f;

    /* renamed from: g  reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f3243g;

    /* renamed from: h  reason: collision with root package name */
    private volatile e.b f3244h;

    /* renamed from: i  reason: collision with root package name */
    private ViewGroup f3245i;

    /* renamed from: j  reason: collision with root package name */
    private AppLovinFullscreenAdViewObserver f3246j;

    /* renamed from: k  reason: collision with root package name */
    private com.applovin.impl.adview.activity.b.a f3247k;

    /* renamed from: com.applovin.impl.adview.o$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Context a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f3248b;

        public AnonymousClass3(Context context, long j2) {
            this.a = context;
            this.f3248b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.o.3.1
                @Override // java.lang.Runnable
                public void run() {
                    if (o.this.f3245i == null || o.this.f3246j == null) {
                        o.this.a.B().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        o.this.a(anonymousClass3.a);
                        return;
                    }
                    com.applovin.impl.sdk.v B = o.this.a.B();
                    StringBuilder y = e.a.d.a.a.y("Presenting ad in a containerView(");
                    y.append(o.this.f3245i);
                    y.append(")");
                    B.b("InterstitialAdDialogWrapper", y.toString());
                    o.this.f3245i.setBackgroundColor(-16777216);
                    com.applovin.impl.sdk.ad.e eVar = o.this.f3243g;
                    AppLovinAdClickListener appLovinAdClickListener = o.this.f3242f;
                    AppLovinAdDisplayListener appLovinAdDisplayListener = o.this.f3240d;
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = o.this.f3241e;
                    o oVar = o.this;
                    com.applovin.impl.adview.activity.b.a.a(eVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener, oVar.a, (Activity) oVar.f(), new a.InterfaceC0069a() { // from class: com.applovin.impl.adview.o.3.1.1
                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                        public void a(com.applovin.impl.adview.activity.b.a aVar) {
                            o.this.f3247k = aVar;
                            o.this.f3246j.setPresenter(aVar);
                            aVar.a(o.this.f3245i);
                        }

                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                        public void a(String str, Throwable th) {
                            o.a(o.this.f3243g, o.this.f3240d, str, th, null);
                        }
                    });
                }
            }, this.f3248b);
        }
    }

    public o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.a = appLovinSdk.coreSdk;
        this.f3238b = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i2) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.6
            @Override // java.lang.Runnable
            public void run() {
                if (o.this.f3239c != null) {
                    o.this.f3239c.failedToReceiveAd(i2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.a.z());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context) {
        if (this.a.ae().b() == null) {
            eVar.b(true);
            this.a.T().a(com.applovin.impl.sdk.d.f.f4006m);
        }
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eL)).booleanValue()) {
            this.a.S().b().execute(new Runnable() { // from class: com.applovin.impl.adview.o.2
                @Override // java.lang.Runnable
                public void run() {
                    System.gc();
                }
            });
        }
        this.f3243g = eVar;
        this.f3244h = this.f3243g.n();
        long max = Math.max(0L, ((Long) this.a.a(com.applovin.impl.sdk.c.b.cq)).longValue());
        com.applovin.impl.sdk.v B = this.a.B();
        B.b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        a(eVar, context, new AnonymousClass3(context, max));
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.I()) || !eVar.ac() || com.applovin.impl.sdk.utils.h.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.ad()).setMessage(eVar.ae()).setPositiveButton(eVar.af(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.o.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.v.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.g) {
            com.applovin.impl.sdk.utils.j.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.j.b(appLovinAdDisplayListener, eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.f3240d != null) {
            this.f3240d.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.5
            @Override // java.lang.Runnable
            public void run() {
                if (o.this.f3239c != null) {
                    o.this.f3239c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context f() {
        return this.f3238b.get();
    }

    public com.applovin.impl.sdk.ad.e a() {
        return this.f3243g;
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.u().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    public AppLovinAdVideoPlaybackListener b() {
        return this.f3241e;
    }

    public AppLovinAdDisplayListener c() {
        return this.f3240d;
    }

    public AppLovinAdClickListener d() {
        return this.f3242f;
    }

    public void e() {
        this.f3245i = null;
        this.f3246j = null;
        this.f3242f = null;
        this.f3239c = null;
        this.f3241e = null;
        this.f3240d = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f3242f = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f3240d = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f3239c = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f3241e = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.o.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                o.this.b(appLovinAd);
                o.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i2) {
                o.this.a(i2);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        String str;
        Context f2 = f();
        if (f2 == null) {
            str = "Failed to show interstitial: stale activity reference provided";
        } else {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.a);
            if (maybeRetrieveNonDummyAd != null) {
                if (((AppLovinAdImpl) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.ce)).booleanValue()) {
                    throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                }
                if (maybeRetrieveNonDummyAd instanceof com.applovin.impl.sdk.ad.e) {
                    a((com.applovin.impl.sdk.ad.e) maybeRetrieveNonDummyAd, f2);
                    return;
                }
                this.a.B().e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
                a(maybeRetrieveNonDummyAd);
                return;
            }
            str = "Failed to show ad: " + appLovinAd;
        }
        com.applovin.impl.sdk.v.i("InterstitialAdDialogWrapper", str);
        a(appLovinAd);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, c.p.j jVar) {
        if (viewGroup == null || jVar == null) {
            com.applovin.impl.sdk.v.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null containerView or lifecycle");
            a(appLovinAd);
            return;
        }
        this.f3245i = viewGroup;
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(jVar, this, this.a);
        this.f3246j = appLovinFullscreenAdViewObserver;
        jVar.a(appLovinFullscreenAdViewObserver);
        showAndRender(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
