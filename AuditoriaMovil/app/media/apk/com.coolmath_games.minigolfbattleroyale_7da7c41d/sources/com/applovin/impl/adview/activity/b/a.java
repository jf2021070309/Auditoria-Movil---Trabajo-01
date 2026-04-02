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
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.m;
import com.applovin.impl.sdk.utils.o;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class a implements b.a {
    protected final com.applovin.impl.sdk.a.g a;
    protected final k b;
    protected final r c;
    protected final AppLovinFullscreenActivity d;
    protected final com.applovin.impl.sdk.d.d e;
    protected final AppLovinAdView f;
    protected final n g;
    protected boolean k;
    protected final AppLovinAdClickListener l;
    protected final AppLovinAdDisplayListener m;
    protected final AppLovinAdVideoPlaybackListener n;
    protected final com.applovin.impl.sdk.b.b o;
    protected m p;
    protected m q;
    private final com.applovin.impl.sdk.utils.a s;
    private final AppLovinBroadcastManager.Receiver t;
    private final f.a u;
    private long x;
    private final Handler r = new Handler(Looper.getMainLooper());
    protected final long h = SystemClock.elapsedRealtime();
    private final AtomicBoolean v = new AtomicBoolean();
    private final AtomicBoolean w = new AtomicBoolean();
    protected long i = -1;
    protected int j = com.applovin.impl.sdk.f.a;

    /* renamed from: com.applovin.impl.adview.activity.b.a$7  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass7 implements Runnable {
        final /* synthetic */ n a;
        final /* synthetic */ Runnable b;

        AnonymousClass7(n nVar, Runnable runnable) {
            this.a = nVar;
            this.b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1
                @Override // java.lang.Runnable
                public void run() {
                    o.a(AnonymousClass7.this.a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass7.this.a.bringToFront();
                            AnonymousClass7.this.b.run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class View$OnClickListenerC0009a implements View.OnClickListener, AppLovinAdClickListener {
        private View$OnClickListenerC0009a() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a.this.c.b("InterActivityV2", "Clicking through graphic");
            i.a(a.this.l, appLovinAd);
            a.this.e.b();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == a.this.g) {
                if (a.this.a.U()) {
                    a.this.b("javascript:al_onCloseButtonTapped();");
                }
                a.this.g();
                return;
            }
            r rVar = a.this.c;
            rVar.e("InterActivityV2", "Unhandled click on widget: " + view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(final com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, final k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.a = gVar;
        this.b = kVar;
        this.c = kVar.z();
        this.d = appLovinFullscreenActivity;
        this.l = appLovinAdClickListener;
        this.m = appLovinAdDisplayListener;
        this.n = appLovinAdVideoPlaybackListener;
        com.applovin.impl.sdk.b.b bVar = new com.applovin.impl.sdk.b.b(appLovinFullscreenActivity, kVar);
        this.o = bVar;
        bVar.a(this);
        this.e = new com.applovin.impl.sdk.d.d(gVar, kVar);
        View$OnClickListenerC0009a view$OnClickListenerC0009a = new View$OnClickListenerC0009a();
        com.applovin.impl.adview.o oVar = new com.applovin.impl.adview.o(kVar.W(), AppLovinAdSize.INTERSTITIAL, appLovinFullscreenActivity);
        this.f = oVar;
        oVar.setAdClickListener(view$OnClickListenerC0009a);
        this.f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                a.this.c.b("InterActivityV2", "Web content rendered");
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                a.this.c.b("InterActivityV2", "Closing from WebView");
                a.this.g();
            }
        });
        com.applovin.impl.adview.b adViewController = this.f.getAdViewController();
        adViewController.a(this.e);
        adViewController.s().setIsShownOutOfContext(gVar.al());
        kVar.t().trackImpression(gVar);
        if (gVar.u() >= 0) {
            n nVar = new n(gVar.v(), appLovinFullscreenActivity);
            this.g = nVar;
            nVar.setVisibility(8);
            this.g.setOnClickListener(view$OnClickListenerC0009a);
        } else {
            this.g = null;
        }
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cq)).booleanValue()) {
            this.t = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.2
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent, Map<String, Object> map) {
                    kVar.t().trackAppKilled(gVar);
                    kVar.ai().unregisterReceiver(this);
                }
            };
            kVar.ai().registerReceiver(this.t, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        } else {
            this.t = null;
        }
        if (gVar.ak()) {
            this.u = new f.a() { // from class: com.applovin.impl.adview.activity.b.a.3
                @Override // com.applovin.impl.sdk.f.a
                public void onRingerModeChanged(int i) {
                    String str;
                    if (a.this.j != com.applovin.impl.sdk.f.a) {
                        a.this.k = true;
                    }
                    com.applovin.impl.adview.d s = a.this.f.getAdViewController().s();
                    if (!com.applovin.impl.sdk.f.a(i) || com.applovin.impl.sdk.f.a(a.this.j)) {
                        str = i == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOff();";
                        a.this.j = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    s.a(str);
                    a.this.j = i;
                }
            };
            kVar.ah().a(this.u);
        } else {
            this.u = null;
        }
        if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.eB)).booleanValue()) {
            this.s = null;
            return;
        }
        this.s = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.adview.activity.b.a.4
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (a.this.w.get()) {
                    return;
                }
                if (activity.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity.getApplicationContext()))) {
                    kVar.Q().a(new y(kVar, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            r.i("InterActivityV2", "Dismissing on-screen ad due to app relaunched via launcher.");
                            a.this.g();
                        }
                    }), o.a.MAIN);
                }
            }
        };
        kVar.ad().a(this.s);
    }

    public void a(int i, KeyEvent keyEvent) {
        r rVar = this.c;
        if (rVar != null) {
            rVar.c("InterActivityV2", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, boolean z, boolean z2, long j) {
        if (this.v.compareAndSet(false, true)) {
            if (this.a.hasVideoUrl() || r()) {
                i.a(this.n, this.a, i, z2);
            }
            if (this.a.hasVideoUrl()) {
                this.e.c(i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.h;
            this.b.t().trackVideoEnd(this.a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long elapsedRealtime2 = this.i != -1 ? SystemClock.elapsedRealtime() - this.i : -1L;
            this.b.t().trackFullScreenAdClosed(this.a, elapsedRealtime2, j, this.k, this.j);
            r rVar = this.c;
            rVar.b("InterActivityV2", "Video ad ended at percent: " + i + "%, elapsedTime: " + elapsedRealtime + "ms, skipTimeMillis: " + j + "ms, closeTimeMillis: " + elapsedRealtime2 + "ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(long j) {
        r rVar = this.c;
        rVar.b("InterActivityV2", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        this.p = m.a(j, this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (a.this.a.af().getAndSet(true)) {
                    return;
                }
                a.this.b.Q().a(new u(a.this.a, a.this.b), o.a.REWARD);
            }
        });
    }

    public void a(Configuration configuration) {
        r rVar = this.c;
        rVar.c("InterActivityV2", "onConfigurationChanged(Configuration) -  " + configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(n nVar, long j, Runnable runnable) {
        AnonymousClass7 anonymousClass7 = new AnonymousClass7(nVar, runnable);
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cK)).booleanValue()) {
            this.q = m.a(TimeUnit.SECONDS.toMillis(j), this.b, anonymousClass7);
        } else {
            this.b.Q().a((com.applovin.impl.sdk.e.a) new y(this.b, anonymousClass7), o.a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.r);
    }

    protected void a(String str) {
        if (this.a.V()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final String str, long j) {
        if (j >= 0) {
            a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // java.lang.Runnable
                public void run() {
                    com.applovin.impl.adview.d s;
                    if (!StringUtils.isValidString(str) || (s = a.this.f.getAdViewController().s()) == null) {
                        return;
                    }
                    s.a(str);
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.a, this.b, this.d);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.b.a(com.applovin.impl.sdk.c.b.eF)).booleanValue()) {
            this.a.a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(boolean z, long j) {
        if (this.a.T()) {
            a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str) {
        a(str, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(boolean z) {
        a(z, ((Long) this.b.a(com.applovin.impl.sdk.c.b.cH)).longValue());
        i.a(this.m, this.a);
        this.b.ac().a(this.a);
        this.b.ak().a(this.a);
        if (this.a.hasVideoUrl() || r()) {
            i.a(this.n, this.a);
        }
        new com.applovin.impl.adview.activity.b(this.d).a(this.a);
        this.e.a();
        this.a.setHasShown(true);
    }

    public void c(boolean z) {
        r rVar = this.c;
        rVar.c("InterActivityV2", "onWindowFocusChanged(boolean) - " + z);
        a("javascript:al_onWindowFocusChanged( " + z + " );");
        m mVar = this.q;
        if (mVar != null) {
            if (z) {
                mVar.c();
            } else {
                mVar.b();
            }
        }
    }

    public abstract void d();

    public void e() {
        this.c.c("InterActivityV2", "onResume()");
        this.e.d(SystemClock.elapsedRealtime() - this.x);
        a("javascript:al_onAppResumed();");
        o();
        if (this.o.d()) {
            this.o.a();
        }
    }

    public void f() {
        this.c.c("InterActivityV2", "onPause()");
        this.x = SystemClock.elapsedRealtime();
        a("javascript:al_onAppPaused();");
        this.o.a();
        n();
    }

    public void g() {
        this.c.c("InterActivityV2", "dismiss()");
        this.r.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.a.S());
        m();
        this.e.c();
        if (this.t != null) {
            m.a(TimeUnit.SECONDS.toMillis(2L), this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // java.lang.Runnable
                public void run() {
                    a.this.d.stopService(new Intent(a.this.d.getApplicationContext(), AppKilledService.class));
                    a.this.b.ai().unregisterReceiver(a.this.t);
                }
            });
        }
        if (this.u != null) {
            this.b.ah().b(this.u);
        }
        if (this.s != null) {
            this.b.ad().b(this.s);
        }
        this.d.finish();
    }

    public void h() {
        this.c.c("InterActivityV2", "onStop()");
    }

    public void i() {
        AppLovinAdView appLovinAdView = this.f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeAllViews();
            }
            this.f.destroy();
        }
        l();
        m();
    }

    public void j() {
        r.i("InterActivityV2", "---low memory detected - running garbage collection---");
        System.gc();
    }

    public void k() {
        this.c.c("InterActivityV2", "onBackPressed()");
        if (this.a.U()) {
            b("javascript:onBackPressed();");
        }
    }

    protected abstract void l();

    protected void m() {
        if (this.w.compareAndSet(false, true)) {
            i.b(this.m, this.a);
            this.b.ac().b(this.a);
            this.b.ak().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n() {
        m mVar = this.p;
        if (mVar != null) {
            mVar.b();
        }
    }

    protected void o() {
        m mVar = this.p;
        if (mVar != null) {
            mVar.c();
        }
    }

    protected abstract boolean p();

    protected abstract boolean q();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r() {
        return AppLovinAdType.INCENTIVIZED == this.a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.a.getType();
    }

    protected abstract void s();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean t() {
        return ((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cv)).booleanValue() ? this.b.p().isMuted() : ((Boolean) this.b.a(com.applovin.impl.sdk.c.b.ct)).booleanValue();
    }
}
