package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.drive.DriveFile;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
/* loaded from: classes.dex */
public class q implements AppLovinInterstitialAdDialog {
    protected final com.applovin.impl.sdk.k a;
    private final String e;
    private final WeakReference<Context> f;
    private volatile AppLovinAdLoadListener g;
    private volatile AppLovinAdDisplayListener h;
    private volatile AppLovinAdVideoPlaybackListener i;
    private volatile AppLovinAdClickListener j;
    private volatile com.applovin.impl.sdk.a.g k;
    private volatile g.b l;
    private volatile l m;
    private static final Map<String, q> d = Collections.synchronizedMap(new HashMap());
    public static volatile boolean b = false;
    public static volatile boolean c = false;

    public q(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.a = appLovinSdk.coreSdk;
        this.e = UUID.randomUUID().toString();
        this.f = new WeakReference<>(context);
        b = true;
        c = false;
    }

    public static q a(String str) {
        return d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.q.6
            @Override // java.lang.Runnable
            public void run() {
                if (q.this.g != null) {
                    q.this.g.failedToReceiveAd(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, this.k.p() ? AppLovinFullscreenActivity.class : AppLovinInterstitialActivity.class);
        intent.putExtra("com.applovin.interstitial.wrapper_id", this.e);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.a.x());
        p.lastKnownWrapper = this;
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(DriveFile.MODE_READ_ONLY);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void a(com.applovin.impl.sdk.a.g gVar, final Context context) {
        if (this.a.ad().b() == null) {
            gVar.b(true);
            this.a.R().a(com.applovin.impl.sdk.d.f.m);
        }
        d.put(this.e, this);
        if (((Boolean) this.a.a(com.applovin.impl.sdk.c.b.eG)).booleanValue()) {
            this.a.Q().b().execute(new Runnable() { // from class: com.applovin.impl.adview.q.2
                @Override // java.lang.Runnable
                public void run() {
                    System.gc();
                }
            });
        }
        this.k = gVar;
        this.l = this.k.q();
        final long max = Math.max(0L, ((Long) this.a.a(com.applovin.impl.sdk.c.b.cl)).longValue());
        com.applovin.impl.sdk.r z = this.a.z();
        z.b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        a(gVar, context, new Runnable() { // from class: com.applovin.impl.adview.q.3
            @Override // java.lang.Runnable
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.q.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        q.this.a(context);
                    }
                }, max);
            }
        });
    }

    private void a(com.applovin.impl.sdk.a.g gVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(gVar.M()) || !gVar.ag() || com.applovin.impl.sdk.utils.g.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(gVar.ah()).setMessage(gVar.ai()).setPositiveButton(gVar.aj(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.q.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.h != null) {
            this.h.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.q.5
            @Override // java.lang.Runnable
            public void run() {
                if (q.this.g != null) {
                    q.this.g.adReceived(appLovinAd);
                }
            }
        });
    }

    private Context h() {
        WeakReference<Context> weakReference = this.f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public com.applovin.impl.sdk.k a() {
        return this.a;
    }

    public void a(l lVar) {
        this.m = lVar;
    }

    protected void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.a.t().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    public com.applovin.impl.sdk.a.g b() {
        return this.k;
    }

    public AppLovinAdVideoPlaybackListener c() {
        return this.i;
    }

    public AppLovinAdDisplayListener d() {
        return this.h;
    }

    public AppLovinAdClickListener e() {
        return this.j;
    }

    public g.b f() {
        return this.l;
    }

    public void g() {
        b = false;
        c = true;
        d.remove(this.e);
        if (this.k != null) {
            this.m = null;
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public boolean isAdReadyToDisplay() {
        return this.a.t().hasPreloadedAd(AppLovinAdSize.INTERSTITIAL);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.j = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.h = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.g = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.i = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.q.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                q.this.b(appLovinAd);
                q.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                q.this.a(i);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        com.applovin.impl.sdk.r z;
        String str;
        Context h = h();
        if (h != null) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.a);
            if (maybeRetrieveNonDummyAd != null) {
                if (((AppLovinAdBase) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.a.a(com.applovin.impl.sdk.c.b.bS)).booleanValue()) {
                    throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
                }
                if (maybeRetrieveNonDummyAd instanceof com.applovin.impl.sdk.a.g) {
                    a((com.applovin.impl.sdk.a.g) maybeRetrieveNonDummyAd, h);
                    return;
                }
                this.a.z().e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
                a(maybeRetrieveNonDummyAd);
                return;
            }
            z = this.a.z();
            str = "Failed to show ad: " + appLovinAd;
        } else {
            z = this.a.z();
            str = "Failed to show interstitial: stale activity reference provided";
        }
        z.e("InterstitialAdDialogWrapper", str);
        a(appLovinAd);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
