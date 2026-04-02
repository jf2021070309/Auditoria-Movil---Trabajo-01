package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements b.a {
    private final a a;
    private final com.applovin.impl.sdk.b b;
    private final com.applovin.impl.mediation.b c;
    private m d;
    private final Object e;
    private com.applovin.impl.mediation.a.c f;
    private c g;
    private final AtomicBoolean h;
    protected final b listenerWrapper;

    /* loaded from: classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0014a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            i.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.b.a();
                    MaxFullscreenAdImpl.this.a();
                    MaxFullscreenAdImpl.this.sdk.D().b((com.applovin.impl.mediation.a.a) maxAd);
                    MaxFullscreenAdImpl.this.a("ad failed to display");
                    i.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.b.a();
            i.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a();
                    MaxFullscreenAdImpl.this.sdk.D().b((com.applovin.impl.mediation.a.a) maxAd);
                    MaxFullscreenAdImpl.this.a("ad was hidden");
                    i.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.b();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    i.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (MaxFullscreenAdImpl.this.h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.loadRequestBuilder.a("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        i.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            i.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            i.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            i.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            i.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, k kVar) {
        super(str, maxAdFormat, str2, kVar);
        this.e = new Object();
        this.f = null;
        this.g = c.IDLE;
        this.h = new AtomicBoolean();
        this.a = aVar;
        this.listenerWrapper = new b();
        this.b = new com.applovin.impl.sdk.b(kVar, this);
        this.c = new com.applovin.impl.mediation.b(kVar, this.listenerWrapper);
        r.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.e) {
            cVar = this.f;
            this.f = null;
        }
        this.sdk.C().destroyAd(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        long q = cVar.q() - (SystemClock.elapsedRealtime() - cVar.m());
        if (q <= TimeUnit.SECONDS.toMillis(2L)) {
            this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
            onAdExpired();
            return;
        }
        this.f = cVar;
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Handle ad loaded for regular ad: " + cVar);
        r rVar2 = this.logger;
        String str2 = this.tag;
        rVar2.b(str2, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(q) + " seconds from now for " + getAdUnitId() + "...");
        this.b.a(q);
    }

    private void a(com.applovin.impl.mediation.a.c cVar, Context context, final Runnable runnable) {
        if (!cVar.C() || g.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(cVar.D()).setMessage(cVar.E()).setPositiveButton(cVar.F(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z;
        r rVar;
        String str;
        String str2;
        String str3;
        String str4;
        c cVar2 = this.g;
        synchronized (this.e) {
            z = true;
            if (cVar2 == c.IDLE) {
                if (cVar != c.LOADING && cVar != c.DESTROYED) {
                    if (cVar == c.SHOWING) {
                        str3 = this.tag;
                        str4 = "No ad is loading or loaded";
                        r.i(str3, str4);
                        z = false;
                    } else {
                        rVar = this.logger;
                        str = this.tag;
                        str2 = "Unable to transition to: " + cVar;
                        rVar.e(str, str2);
                        z = false;
                    }
                }
            } else if (cVar2 == c.LOADING) {
                if (cVar != c.IDLE) {
                    if (cVar == c.LOADING) {
                        str3 = this.tag;
                        str4 = "An ad is already loading";
                    } else if (cVar != c.READY) {
                        if (cVar == c.SHOWING) {
                            str3 = this.tag;
                            str4 = "An ad is not ready to be shown yet";
                        } else if (cVar != c.DESTROYED) {
                            rVar = this.logger;
                            str = this.tag;
                            str2 = "Unable to transition to: " + cVar;
                            rVar.e(str, str2);
                            z = false;
                        }
                    }
                    r.i(str3, str4);
                    z = false;
                }
            } else if (cVar2 != c.READY) {
                if (cVar2 == c.SHOWING) {
                    if (cVar != c.IDLE) {
                        if (cVar == c.LOADING) {
                            str3 = this.tag;
                            str4 = "Can not load another ad while the ad is showing";
                        } else {
                            if (cVar == c.READY) {
                                rVar = this.logger;
                                str = this.tag;
                                str2 = "An ad is already showing, ignoring";
                            } else if (cVar == c.SHOWING) {
                                str3 = this.tag;
                                str4 = "The ad is already showing, not showing another one";
                            } else if (cVar != c.DESTROYED) {
                                rVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                            }
                            rVar.e(str, str2);
                        }
                        r.i(str3, str4);
                    }
                } else if (cVar2 == c.DESTROYED) {
                    str3 = this.tag;
                    str4 = "No operations are allowed on a destroyed instance";
                    r.i(str3, str4);
                } else {
                    rVar = this.logger;
                    str = this.tag;
                    str2 = "Unknown state: " + this.g;
                    rVar.e(str, str2);
                }
                z = false;
            } else if (cVar != c.IDLE) {
                if (cVar == c.LOADING) {
                    str3 = this.tag;
                    str4 = "An ad is already loaded";
                    r.i(str3, str4);
                    z = false;
                } else {
                    if (cVar == c.READY) {
                        rVar = this.logger;
                        str = this.tag;
                        str2 = "An ad is already marked as ready";
                    } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                        rVar = this.logger;
                        str = this.tag;
                        str2 = "Unable to transition to: " + cVar;
                    }
                    rVar.e(str, str2);
                    z = false;
                }
            }
            if (z) {
                this.logger.b(this.tag, "Transitioning from " + this.g + " to " + cVar + "...");
                this.g = cVar;
            } else {
                this.logger.d(this.tag, "Not allowed transition from " + this.g + " to " + cVar);
            }
        }
        if (!z || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str) {
        final long intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.a.y)).intValue();
        if (intValue > 0) {
            this.d = m.a(TimeUnit.SECONDS.toMillis(intValue), this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    String str2 = MaxFullscreenAdImpl.this.tag;
                    r.h(str2, intValue + " second(s) elapsed without an ad load attempt after " + MaxFullscreenAdImpl.this.adFormat.getDisplayName().toLowerCase() + " " + str + ". Please ensure that you are re-loading ads correctly! (Ad Unit ID: " + MaxFullscreenAdImpl.this.adUnitId + ")");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.h.compareAndSet(true, false)) {
            synchronized (this.e) {
                cVar = this.f;
                this.f = null;
            }
            this.sdk.C().destroyAd(cVar);
            this.loadRequestBuilder.a("expired_ad_ad_unit_id");
        }
    }

    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.e) {
                    if (MaxFullscreenAdImpl.this.f != null) {
                        r rVar = MaxFullscreenAdImpl.this.logger;
                        String str = MaxFullscreenAdImpl.this.tag;
                        rVar.b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f + "...");
                        MaxFullscreenAdImpl.this.sdk.C().destroyAd(MaxFullscreenAdImpl.this.f);
                    }
                }
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.e) {
            z = this.f != null && this.f.d() && this.g == c.READY;
        }
        return z;
    }

    public void loadAd(final Activity activity) {
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Loading ad for '" + this.adUnitId + "'...");
        m mVar = this.d;
        if (mVar != null) {
            mVar.d();
        }
        if (!isReady()) {
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    Activity activity2 = activity;
                    if (activity2 == null) {
                        activity2 = MaxFullscreenAdImpl.this.sdk.al();
                    }
                    MaxFullscreenAdImpl.this.sdk.C().loadAd(MaxFullscreenAdImpl.this.adUnitId, MaxFullscreenAdImpl.this.adFormat, MaxFullscreenAdImpl.this.loadRequestBuilder.a(), activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
            return;
        }
        r rVar2 = this.logger;
        String str2 = this.tag;
        rVar2.b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
        i.a(this.adListener, (MaxAd) this.f, true);
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        r rVar = this.logger;
        String str = this.tag;
        rVar.b(str, "Ad expired " + getAdUnitId());
        this.h.set(true);
        Activity activity = this.a.getActivity();
        if (activity == null && (activity = this.sdk.ad().a()) == null) {
            b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, new MaxErrorImpl(-5601, "No Activity found"));
            return;
        }
        this.loadRequestBuilder.a("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.C().loadAd(this.adUnitId, this.adFormat, this.loadRequestBuilder.a(), activity, this.listenerWrapper);
    }

    public void showAd(final String str, final Activity activity) {
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            r.i(this.tag, str2);
            i.a(this.adListener, (MaxAd) this.f, (MaxError) new MaxErrorImpl(-24, str2), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.al();
        }
        if (activity == null) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0) {
            if (Utils.isPubInDebugMode(activity)) {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
            r.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            i.a(this.adListener, (MaxAd) this.f, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
        } else if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.C)).booleanValue() && (this.sdk.ac().a() || this.sdk.ac().b())) {
            r.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
            i.a(this.adListener, (MaxAd) this.f, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
        } else if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.D)).booleanValue() || g.a(activity)) {
            a(this.f, activity, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaxFullscreenAdImpl.this.c.b(MaxFullscreenAdImpl.this.f);
                            r rVar = MaxFullscreenAdImpl.this.logger;
                            String str3 = MaxFullscreenAdImpl.this.tag;
                            rVar.b(str3, "Showing ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; loaded ad: " + MaxFullscreenAdImpl.this.f + "...");
                            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.a) MaxFullscreenAdImpl.this.f);
                            MaxFullscreenAdImpl.this.sdk.C().showFullscreenAd(MaxFullscreenAdImpl.this.f, str, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                        }
                    });
                }
            });
        } else {
            r.i(this.tag, "Attempting to show ad with no internet connection");
            i.a(this.adListener, (MaxAd) this.f, (MaxError) new MaxErrorImpl(-1009), true);
        }
    }

    public String toString() {
        return this.tag + "{adUnitId='" + this.adUnitId + "', adListener=" + this.adListener + ", revenueListener=" + this.revenueListener + ", isReady=" + isReady() + '}';
    }
}
