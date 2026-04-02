package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.i;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.h;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.j;
import com.applovin.impl.sdk.utils.n;
import com.applovin.impl.sdk.utils.p;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class a implements b.a {
    public final com.applovin.impl.sdk.ad.e a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3166b;

    /* renamed from: c  reason: collision with root package name */
    public final v f3167c;

    /* renamed from: d  reason: collision with root package name */
    public final com.applovin.impl.sdk.d.d f3168d;

    /* renamed from: e  reason: collision with root package name */
    public Activity f3169e;

    /* renamed from: f  reason: collision with root package name */
    public AppLovinAdView f3170f;

    /* renamed from: g  reason: collision with root package name */
    public final com.applovin.impl.adview.m f3171g;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3177m;

    /* renamed from: n  reason: collision with root package name */
    public AppLovinAdClickListener f3178n;
    public AppLovinAdDisplayListener o;
    public AppLovinAdVideoPlaybackListener p;
    public final com.applovin.impl.sdk.b.b q;
    public n r;
    public n s;
    private final com.applovin.impl.sdk.utils.a u;
    private final AppLovinBroadcastManager.Receiver v;
    private final h.a w;
    private long z;
    private final Handler t = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public final long f3172h = SystemClock.elapsedRealtime();
    private final AtomicBoolean x = new AtomicBoolean();
    private final AtomicBoolean y = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public long f3173i = -1;
    private int A = 0;
    private final ArrayList<Long> B = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public int f3174j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f3175k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f3176l = h.a;

    /* renamed from: com.applovin.impl.adview.activity.b.a$7  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass7 implements Runnable {
        public final /* synthetic */ com.applovin.impl.adview.m a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f3183b;

        public AnonymousClass7(com.applovin.impl.adview.m mVar, Runnable runnable) {
            this.a = mVar;
            this.f3183b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1
                @Override // java.lang.Runnable
                public void run() {
                    p.a(AnonymousClass7.this.a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass7.this.a.bringToFront();
                            AnonymousClass7.this.f3183b.run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0069a {
        void a(a aVar);

        void a(String str, Throwable th);
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener, AppLovinAdClickListener {
        private b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a.this.f3167c.b("AppLovinFullscreenActivity", "Clicking through graphic");
            j.a(a.this.f3178n, appLovinAd);
            a.this.f3168d.b();
            a.this.f3175k++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (view != aVar.f3171g || !((Boolean) aVar.f3166b.a(com.applovin.impl.sdk.c.b.cs)).booleanValue()) {
                v vVar = a.this.f3167c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                return;
            }
            a.c(a.this);
            if (a.this.a.Q()) {
                a aVar2 = a.this;
                StringBuilder y = e.a.d.a.a.y("javascript:al_onCloseButtonTapped(");
                y.append(a.this.A);
                y.append(",");
                y.append(a.this.f3174j);
                y.append(",");
                y.append(a.this.f3175k);
                y.append(");");
                aVar2.b(y.toString());
            }
            List<Integer> r = a.this.a.r();
            v vVar2 = a.this.f3167c;
            StringBuilder y2 = e.a.d.a.a.y("Handling close button tap ");
            y2.append(a.this.A);
            y2.append(" with multi close delay: ");
            y2.append(r);
            vVar2.b("AppLovinFullscreenActivity", y2.toString());
            if (r == null || r.size() <= a.this.A) {
                a.this.h();
                return;
            }
            a.this.B.add(Long.valueOf(SystemClock.elapsedRealtime() - a.this.f3173i));
            List<i.a> t = a.this.a.t();
            if (t != null && t.size() > a.this.A) {
                a aVar3 = a.this;
                aVar3.f3171g.a(t.get(aVar3.A));
            }
            v vVar3 = a.this.f3167c;
            StringBuilder y3 = e.a.d.a.a.y("Scheduling next close button with delay: ");
            y3.append(r.get(a.this.A));
            vVar3.b("AppLovinFullscreenActivity", y3.toString());
            a.this.f3171g.setVisibility(8);
            a aVar4 = a.this;
            aVar4.a(aVar4.f3171g, r.get(aVar4.A).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3173i = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public a(final com.applovin.impl.sdk.ad.e eVar, Activity activity, final m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.a = eVar;
        this.f3166b = mVar;
        this.f3167c = mVar.B();
        this.f3169e = activity;
        this.f3178n = appLovinAdClickListener;
        this.o = appLovinAdDisplayListener;
        this.p = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(activity, mVar);
        this.q = bVar;
        bVar.a(this);
        com.applovin.impl.sdk.d.d dVar = new com.applovin.impl.sdk.d.d(eVar, mVar);
        this.f3168d = dVar;
        b bVar2 = new b();
        com.applovin.impl.adview.n nVar = new com.applovin.impl.adview.n(mVar.Y(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f3170f = nVar;
        nVar.setAdClickListener(bVar2);
        this.f3170f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                a.this.f3167c.b("AppLovinFullscreenActivity", "Web content rendered");
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                a.this.f3167c.b("AppLovinFullscreenActivity", "Closing from WebView");
                a.this.h();
            }
        });
        com.applovin.impl.adview.b controller = this.f3170f.getController();
        controller.a(dVar);
        controller.s().setIsShownOutOfContext(eVar.ah());
        mVar.u().trackImpression(eVar);
        List<Integer> r = eVar.r();
        if (eVar.q() >= 0 || r != null) {
            com.applovin.impl.adview.m mVar2 = new com.applovin.impl.adview.m(eVar.s(), activity);
            this.f3171g = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(bVar2);
        } else {
            this.f3171g = null;
        }
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cu)).booleanValue()) {
            AppLovinBroadcastManager.Receiver receiver = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.2
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    mVar.u().trackAppKilled(eVar);
                    mVar.aj().unregisterReceiver(this);
                }
            };
            this.v = receiver;
            mVar.aj().registerReceiver(receiver, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        } else {
            this.v = null;
        }
        if (eVar.ag()) {
            h.a aVar = new h.a() { // from class: com.applovin.impl.adview.activity.b.a.3
                @Override // com.applovin.impl.sdk.h.a
                public void a(int i2) {
                    String str;
                    a aVar2 = a.this;
                    if (aVar2.f3176l != h.a) {
                        aVar2.f3177m = true;
                    }
                    com.applovin.impl.adview.d s = aVar2.f3170f.getController().s();
                    if (!h.a(i2) || h.a(a.this.f3176l)) {
                        str = i2 == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOff();";
                        a.this.f3176l = i2;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.a(str);
                    a.this.f3176l = i2;
                }
            };
            this.w = aVar;
            mVar.ai().a(aVar);
        } else {
            this.w = null;
        }
        if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eG)).booleanValue()) {
            this.u = null;
            return;
        }
        com.applovin.impl.sdk.utils.a aVar2 = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.4
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity2, Bundle bundle) {
                if (a.this.y.get()) {
                    return;
                }
                if (activity2.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity2.getApplicationContext()))) {
                    mVar.S().a(new z(mVar, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            v.i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                            a.this.h();
                        }
                    }), o.a.MAIN);
                }
            }
        };
        this.u = aVar2;
        mVar.ae().a(aVar2);
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, m mVar, Activity activity, InterfaceC0069a interfaceC0069a) {
        StringBuilder sb;
        String str;
        a bVar;
        boolean z = eVar.aD() && Utils.checkExoPlayerEligibility(mVar);
        if (eVar instanceof com.applovin.impl.a.a) {
            if (!z) {
                try {
                    bVar = new d(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    interfaceC0069a.a(bVar);
                    return;
                } catch (Throwable th) {
                    th = th;
                    sb = new StringBuilder();
                    sb.append("Failed to create FullscreenVastVideoAdPresenter with sdk: ");
                    sb.append(mVar);
                    sb.append(" and throwable: ");
                    sb.append(th.getMessage());
                    interfaceC0069a.a(sb.toString(), th);
                }
            }
            try {
                bVar = new c(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                mVar.B().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th2);
                Utils.isExoPlayerEligible = Boolean.FALSE;
                try {
                    bVar = new d(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    th = th3;
                    sb = new StringBuilder();
                    sb.append("Failed to create FullscreenVastVideoAdPresenter with sdk: ");
                    sb.append(mVar);
                    sb.append(" and throwable: ");
                    sb.append(th.getMessage());
                    interfaceC0069a.a(sb.toString(), th);
                }
            }
            interfaceC0069a.a(bVar);
            return;
        } else if (!eVar.hasVideoUrl()) {
            try {
                bVar = new com.applovin.impl.adview.activity.b.b(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                interfaceC0069a.a(bVar);
                return;
            } catch (Throwable th4) {
                th = th4;
                sb = new StringBuilder();
                str = "Failed to create FullscreenGraphicAdPresenter with sdk: ";
                sb.append(str);
                sb.append(mVar);
                sb.append(" and throwable: ");
                sb.append(th.getMessage());
                interfaceC0069a.a(sb.toString(), th);
            }
        } else if (eVar.aH()) {
            try {
                bVar = new g(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                interfaceC0069a.a(bVar);
                return;
            } catch (Throwable th5) {
                th = th5;
                sb = new StringBuilder();
                str = "Failed to create FullscreenWebVideoAdPresenter with sdk: ";
                sb.append(str);
                sb.append(mVar);
                sb.append(" and throwable: ");
                sb.append(th.getMessage());
                interfaceC0069a.a(sb.toString(), th);
            }
        } else if (!z) {
            try {
                bVar = new f(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                interfaceC0069a.a(bVar);
                return;
            } catch (Throwable th6) {
                th = th6;
                sb = new StringBuilder();
                str = "Failed to create FullscreenVideoAdPresenter with sdk: ";
                sb.append(str);
                sb.append(mVar);
                sb.append(" and throwable: ");
                sb.append(th.getMessage());
                interfaceC0069a.a(sb.toString(), th);
            }
        } else {
            try {
                bVar = new e(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th7) {
                mVar.B().a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th7);
                Utils.isExoPlayerEligible = Boolean.FALSE;
                try {
                    bVar = new f(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th8) {
                    th = th8;
                    sb = new StringBuilder();
                    str = "Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: ";
                    sb.append(str);
                    sb.append(mVar);
                    sb.append(" and throwable: ");
                    sb.append(th.getMessage());
                    interfaceC0069a.a(sb.toString(), th);
                }
            }
            interfaceC0069a.a(bVar);
            return;
        }
        sb.append(mVar);
        sb.append(" and throwable: ");
        sb.append(th.getMessage());
        interfaceC0069a.a(sb.toString(), th);
    }

    public static /* synthetic */ int c(a aVar) {
        int i2 = aVar.A;
        aVar.A = i2 + 1;
        return i2;
    }

    public void a(int i2, KeyEvent keyEvent) {
        v vVar = this.f3167c;
        if (vVar != null) {
            vVar.c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i2 + ", " + keyEvent);
        }
    }

    public void a(int i2, boolean z, boolean z2, long j2) {
        if (this.x.compareAndSet(false, true)) {
            if (this.a.hasVideoUrl() || t()) {
                j.a(this.p, this.a, i2, z2);
            }
            if (this.a.hasVideoUrl()) {
                this.f3168d.c(i2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3172h;
            this.f3166b.u().trackVideoEnd(this.a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i2, z);
            long elapsedRealtime2 = this.f3173i != -1 ? SystemClock.elapsedRealtime() - this.f3173i : -1L;
            this.f3166b.u().trackFullScreenAdClosed(this.a, elapsedRealtime2, this.B, j2, this.f3177m, this.f3176l);
            v vVar = this.f3167c;
            StringBuilder sb = new StringBuilder();
            sb.append("Video ad ended at percent: ");
            sb.append(i2);
            sb.append("%, elapsedTime: ");
            sb.append(elapsedRealtime);
            e.a.d.a.a.K(sb, "ms, skipTimeMillis: ", j2, "ms, closeTimeMillis: ");
            vVar.b("AppLovinFullscreenActivity", e.a.d.a.a.q(sb, elapsedRealtime2, "ms"));
        }
    }

    public abstract void a(long j2);

    public void a(Configuration configuration) {
        v vVar = this.f3167c;
        vVar.c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
    }

    public abstract void a(ViewGroup viewGroup);

    public void a(com.applovin.impl.adview.m mVar, long j2, Runnable runnable) {
        if (j2 >= ((Long) this.f3166b.a(com.applovin.impl.sdk.c.b.cr)).longValue()) {
            return;
        }
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(mVar, runnable);
        if (((Boolean) this.f3166b.a(com.applovin.impl.sdk.c.b.cK)).booleanValue()) {
            this.s = n.a(TimeUnit.SECONDS.toMillis(j2), this.f3166b, anonymousClass7);
        } else {
            this.f3166b.S().a((com.applovin.impl.sdk.e.a) new z(this.f3166b, anonymousClass7), o.a.MAIN, TimeUnit.SECONDS.toMillis(j2), true);
        }
    }

    public void a(Runnable runnable, long j2) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j2, this.t);
    }

    public void a(String str) {
        if (this.a.R()) {
            a(str, 0L);
        }
    }

    public void a(final String str, long j2) {
        if (j2 >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.d s;
                    if (!StringUtils.isValidString(str) || (s = a.this.f3170f.getController().s()) == null) {
                        return;
                    }
                    s.a(str);
                }
            }, j2);
        }
    }

    public void a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.a, this.f3166b, this.f3169e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f3166b.a(com.applovin.impl.sdk.c.b.eK)).booleanValue()) {
            this.a.a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    public void a(boolean z, long j2) {
        if (this.a.P()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j2);
        }
    }

    public void b(long j2) {
        v vVar = this.f3167c;
        StringBuilder y = e.a.d.a.a.y("Scheduling report reward in ");
        y.append(TimeUnit.MILLISECONDS.toSeconds(j2));
        y.append(" seconds...");
        vVar.b("AppLovinFullscreenActivity", y.toString());
        this.r = n.a(j2, this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a.ab().getAndSet(true)) {
                    return;
                }
                a aVar = a.this;
                a.this.f3166b.S().a(new com.applovin.impl.sdk.e.v(aVar.a, aVar.f3166b), o.a.REWARD);
            }
        });
    }

    public void b(String str) {
        a(str, 0L);
    }

    public void b(boolean z) {
        a(z, ((Long) this.f3166b.a(com.applovin.impl.sdk.c.b.cH)).longValue());
        j.a(this.o, this.a);
        this.f3166b.ad().a(this.a);
        this.f3166b.al().a(this.a);
        if (this.a.hasVideoUrl() || t()) {
            j.a(this.p, this.a);
        }
        new com.applovin.impl.adview.activity.b(this.f3169e).a(this.a);
        this.f3168d.a();
        this.a.setHasShown(true);
    }

    public void c(boolean z) {
        v vVar = this.f3167c;
        vVar.c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        a("javascript:al_onWindowFocusChanged( " + z + " );");
        n nVar = this.s;
        if (nVar != null) {
            if (z) {
                nVar.c();
            } else {
                nVar.b();
            }
        }
    }

    public abstract void d();

    public abstract void e();

    public void f() {
        this.f3167c.c("AppLovinFullscreenActivity", "onResume()");
        this.f3168d.d(SystemClock.elapsedRealtime() - this.z);
        a("javascript:al_onAppResumed();");
        q();
        if (this.q.c()) {
            this.q.a();
        }
    }

    public void g() {
        this.f3167c.c("AppLovinFullscreenActivity", "onPause()");
        this.z = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        this.q.a();
        p();
    }

    public void h() {
        this.f3167c.c("AppLovinFullscreenActivity", "dismiss()");
        this.t.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.a.O());
        n();
        this.f3168d.c();
        if (this.v != null) {
            n.a(TimeUnit.SECONDS.toMillis(2L), this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.f3169e.stopService(new Intent(a.this.f3169e.getApplicationContext(), AppKilledService.class));
                    a.this.f3166b.aj().unregisterReceiver(a.this.v);
                }
            });
        }
        if (this.w != null) {
            this.f3166b.ai().b(this.w);
        }
        if (this.u != null) {
            this.f3166b.ae().b(this.u);
        }
        if (o()) {
            this.f3169e.finish();
            return;
        }
        this.f3166b.B().b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        j();
    }

    public void i() {
        this.f3167c.c("AppLovinFullscreenActivity", "onStop()");
    }

    public void j() {
        AppLovinAdView appLovinAdView = this.f3170f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f3170f.destroy();
            this.f3170f = null;
            if ((parent instanceof ViewGroup) && o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        n();
        this.f3178n = null;
        this.o = null;
        this.p = null;
        this.f3169e = null;
    }

    public void k() {
        v.i("AppLovinFullscreenActivity", "---low memory detected - running garbage collection---");
        System.gc();
    }

    public void l() {
        this.f3167c.c("AppLovinFullscreenActivity", "onBackPressed()");
        if (this.a.Q()) {
            b("javascript:onBackPressed();");
        }
    }

    public abstract void m();

    public void n() {
        if (this.y.compareAndSet(false, true)) {
            j.b(this.o, this.a);
            this.f3166b.ad().b(this.a);
            this.f3166b.al().a();
        }
    }

    public boolean o() {
        return this.f3169e instanceof AppLovinFullscreenActivity;
    }

    public void p() {
        n nVar = this.r;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void q() {
        n nVar = this.r;
        if (nVar != null) {
            nVar.c();
        }
    }

    public abstract boolean r();

    public abstract boolean s();

    public boolean t() {
        return AppLovinAdType.INCENTIVIZED == this.a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.a.getType();
    }

    public abstract void u();
}
