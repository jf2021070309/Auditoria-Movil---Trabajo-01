package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.n;
import com.applovin.impl.sdk.v;
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

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.sdk.b f3363b;

    /* renamed from: c  reason: collision with root package name */
    private final com.applovin.impl.mediation.b f3364c;

    /* renamed from: d  reason: collision with root package name */
    private n f3365d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f3366e;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.mediation.a.c f3367f;

    /* renamed from: g  reason: collision with root package name */
    private c f3368g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f3369h;
    public final b listenerWrapper;

    /* loaded from: classes.dex */
    public interface a {
        Activity getActivity();
    }

    /* loaded from: classes.dex */
    public class b implements a.InterfaceC0074a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            j.d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.f3363b.a();
                    MaxFullscreenAdImpl.this.a();
                    MaxFullscreenAdImpl.this.sdk.F().b((com.applovin.impl.mediation.a.a) maxAd);
                    MaxFullscreenAdImpl.this.b("ad failed to display");
                    j.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f3363b.a();
            j.b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f3364c.a(maxAd);
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a();
                    MaxFullscreenAdImpl.this.sdk.F().b((com.applovin.impl.mediation.a.a) maxAd);
                    MaxFullscreenAdImpl.this.b("ad was hidden");
                    j.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.b();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    j.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a((com.applovin.impl.mediation.a.c) maxAd);
            if (MaxFullscreenAdImpl.this.f3369h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.loadRequestBuilder.c("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        j.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            j.a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            j.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            j.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            j.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
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

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, m mVar) {
        super(str, maxAdFormat, str2, mVar);
        this.f3366e = new Object();
        this.f3367f = null;
        this.f3368g = c.IDLE;
        this.f3369h = new AtomicBoolean();
        this.a = aVar;
        b bVar = new b();
        this.listenerWrapper = bVar;
        this.f3363b = new com.applovin.impl.sdk.b(mVar, this);
        this.f3364c = new com.applovin.impl.mediation.b(mVar, bVar);
        v.f(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.mediation.a.c cVar;
        synchronized (this.f3366e) {
            cVar = this.f3367f;
            this.f3367f = null;
        }
        this.sdk.E().destroyAd(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.mediation.a.c cVar) {
        long v = cVar.v() - (SystemClock.elapsedRealtime() - cVar.r());
        if (v <= TimeUnit.SECONDS.toMillis(2L)) {
            this.logger.b(this.tag, "Loaded an expired ad, running expire logic...");
            onAdExpired();
            return;
        }
        this.f3367f = cVar;
        v vVar = this.logger;
        String str = this.tag;
        vVar.b(str, "Handle ad loaded for regular ad: " + cVar);
        v vVar2 = this.logger;
        String str2 = this.tag;
        StringBuilder y = e.a.d.a.a.y("Scheduling ad expiration ");
        y.append(TimeUnit.MILLISECONDS.toSeconds(v));
        y.append(" seconds from now for ");
        y.append(getAdUnitId());
        y.append("...");
        vVar2.b(str2, y.toString());
        this.f3363b.a(v);
    }

    private void a(com.applovin.impl.mediation.a.c cVar, Context context, final Runnable runnable) {
        if (!cVar.H() || h.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(cVar.I()).setMessage(cVar.J()).setPositiveButton(cVar.K(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.5
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
        v vVar;
        String str;
        String str2;
        String str3;
        String str4;
        c cVar2 = this.f3368g;
        synchronized (this.f3366e) {
            c cVar3 = c.IDLE;
            z = true;
            if (cVar2 != cVar3) {
                c cVar4 = c.LOADING;
                if (cVar2 != cVar4) {
                    c cVar5 = c.READY;
                    if (cVar2 != cVar5) {
                        c cVar6 = c.SHOWING;
                        if (cVar2 == cVar6) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    str3 = this.tag;
                                    str4 = "Can not load another ad while the ad is showing";
                                } else {
                                    if (cVar == cVar5) {
                                        vVar = this.logger;
                                        str = this.tag;
                                        str2 = "An ad is already showing, ignoring";
                                    } else if (cVar == cVar6) {
                                        str3 = this.tag;
                                        str4 = "The ad is already showing, not showing another one";
                                    } else if (cVar != c.DESTROYED) {
                                        vVar = this.logger;
                                        str = this.tag;
                                        str2 = "Unable to transition to: " + cVar;
                                    }
                                    vVar.e(str, str2);
                                }
                                v.i(str3, str4);
                            }
                        } else if (cVar2 == c.DESTROYED) {
                            str3 = this.tag;
                            str4 = "No operations are allowed on a destroyed instance";
                            v.i(str3, str4);
                        } else {
                            vVar = this.logger;
                            str = this.tag;
                            str2 = "Unknown state: " + this.f3368g;
                            vVar.e(str, str2);
                        }
                        z = false;
                    } else if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            str3 = this.tag;
                            str4 = "An ad is already loaded";
                            v.i(str3, str4);
                            z = false;
                        } else {
                            if (cVar == cVar5) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "An ad is already marked as ready";
                            } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                vVar = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + cVar;
                            }
                            vVar.e(str, str2);
                            z = false;
                        }
                    }
                } else if (cVar != cVar3) {
                    if (cVar == cVar4) {
                        str3 = this.tag;
                        str4 = "An ad is already loading";
                    } else if (cVar != c.READY) {
                        if (cVar == c.SHOWING) {
                            str3 = this.tag;
                            str4 = "An ad is not ready to be shown yet";
                        } else if (cVar != c.DESTROYED) {
                            vVar = this.logger;
                            str = this.tag;
                            str2 = "Unable to transition to: " + cVar;
                            vVar.e(str, str2);
                            z = false;
                        }
                    }
                    v.i(str3, str4);
                    z = false;
                }
            } else if (cVar != c.LOADING && cVar != c.DESTROYED) {
                if (cVar == c.SHOWING) {
                    str3 = this.tag;
                    str4 = "No ad is loading or loaded";
                    v.i(str3, str4);
                    z = false;
                } else {
                    vVar = this.logger;
                    str = this.tag;
                    str2 = "Unable to transition to: " + cVar;
                    vVar.e(str, str2);
                    z = false;
                }
            }
            if (z) {
                this.logger.b(this.tag, "Transitioning from " + this.f3368g + " to " + cVar + "...");
                this.f3368g = cVar;
            } else {
                this.logger.d(this.tag, "Not allowed transition from " + this.f3368g + " to " + cVar);
            }
        }
        if (!z || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        this.f3364c.b(this.f3367f);
        this.f3367f.d(str);
        this.f3367f.e(this.customPostbackData);
        v vVar = this.logger;
        String str2 = this.tag;
        StringBuilder y = e.a.d.a.a.y("Showing ad for '");
        y.append(this.adUnitId);
        y.append("'; loaded ad: ");
        y.append(this.f3367f);
        y.append("...");
        vVar.b(str2, y.toString());
        a((com.applovin.impl.mediation.a.a) this.f3367f);
    }

    private boolean a(Activity activity) {
        if (activity != null) {
            if (!isReady()) {
                String r = e.a.d.a.a.r(e.a.d.a.a.y("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
                v.i(this.tag, r);
                j.a(this.adListener, (MaxAd) this.f3367f, (MaxError) new MaxErrorImpl(-24, r), true);
                return false;
            }
            if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0) {
                if (Utils.isPubInDebugMode(activity)) {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                }
                if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.Z)).booleanValue()) {
                    v.i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                    j.a(this.adListener, (MaxAd) this.f3367f, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                    return false;
                }
            }
            if (((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.F)).booleanValue() && (this.sdk.ad().a() || this.sdk.ad().b())) {
                v.i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                j.a(this.adListener, (MaxAd) this.f3367f, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (!((Boolean) this.sdk.a(com.applovin.impl.sdk.c.a.G)).booleanValue() || h.a(activity)) {
                return true;
            } else {
                v.i(this.tag, "Attempting to show ad with no internet connection");
                j.a(this.adListener, (MaxAd) this.f3367f, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            }
        }
        throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.applovin.impl.mediation.a.c cVar;
        if (this.f3369h.compareAndSet(true, false)) {
            synchronized (this.f3366e) {
                cVar = this.f3367f;
                this.f3367f = null;
            }
            this.sdk.E().destroyAd(cVar);
            this.loadRequestBuilder.c("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        final long intValue = ((Integer) this.sdk.a(com.applovin.impl.sdk.c.a.C)).intValue();
        if (intValue > 0) {
            this.f3365d = n.a(TimeUnit.SECONDS.toMillis(intValue), this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    String str2 = MaxFullscreenAdImpl.this.tag;
                    v.h(str2, intValue + " second(s) elapsed without an ad load attempt after " + MaxFullscreenAdImpl.this.adFormat.getDisplayName().toLowerCase() + " " + str + ". Please ensure that you are re-loading ads correctly! (Ad Unit ID: " + MaxFullscreenAdImpl.this.adUnitId + ")");
                }
            });
        }
    }

    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f3366e) {
                    if (MaxFullscreenAdImpl.this.f3367f != null) {
                        MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                        v vVar = maxFullscreenAdImpl.logger;
                        String str = maxFullscreenAdImpl.tag;
                        vVar.b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f3367f + "...");
                        MaxFullscreenAdImpl.this.sdk.E().destroyAd(MaxFullscreenAdImpl.this.f3367f);
                    }
                }
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.adListener = null;
                maxFullscreenAdImpl2.revenueListener = null;
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f3366e) {
            com.applovin.impl.mediation.a.c cVar = this.f3367f;
            z = cVar != null && cVar.e() && this.f3368g == c.READY;
        }
        return z;
    }

    public void loadAd(Activity activity) {
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        v vVar = this.logger;
        String str = this.tag;
        StringBuilder y = e.a.d.a.a.y("Ad expired ");
        y.append(getAdUnitId());
        vVar.b(str, y.toString());
        this.f3369h.set(true);
        Activity activity = this.a.getActivity();
        if (activity == null && (activity = this.sdk.ae().a()) == null) {
            b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, new MaxErrorImpl(-5601, "No Activity found"));
            return;
        }
        this.loadRequestBuilder.a("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.E().loadAd(this.adUnitId, null, this.adFormat, this.localExtraParameters, this.loadRequestBuilder.a(), activity, this.listenerWrapper);
    }

    public void showAd(final ViewGroup viewGroup, final c.p.j jVar, final Activity activity) {
        if (viewGroup == null || jVar == null) {
            v.i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            j.a(this.adListener, (MaxAd) this.f3367f, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.ao();
        }
        if (a(activity)) {
            a(this.f3367f, activity, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            MaxFullscreenAdImpl.this.a((String) null);
                            MediationServiceImpl E = MaxFullscreenAdImpl.this.sdk.E();
                            com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f3367f;
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            E.showFullscreenAd(cVar, viewGroup, jVar, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                        }
                    });
                }
            });
        }
    }

    public void showAd(final String str, final Activity activity) {
        if (activity == null) {
            activity = this.sdk.ao();
        }
        if (a(activity)) {
            a(this.f3367f, activity, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            MaxFullscreenAdImpl.this.a(str);
                            MediationServiceImpl E = MaxFullscreenAdImpl.this.sdk.E();
                            com.applovin.impl.mediation.a.c cVar = MaxFullscreenAdImpl.this.f3367f;
                            AnonymousClass3 anonymousClass32 = AnonymousClass3.this;
                            E.showFullscreenAd(cVar, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                        }
                    });
                }
            });
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        e.a.d.a.a.J(sb, this.adUnitId, CoreConstants.SINGLE_QUOTE_CHAR, ", adListener=");
        sb.append(this.adListener);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
