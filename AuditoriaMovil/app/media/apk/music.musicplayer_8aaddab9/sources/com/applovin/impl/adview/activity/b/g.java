package com.applovin.impl.adview.activity.b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private AtomicBoolean A;
    private AtomicBoolean B;
    private boolean C;
    private long D;
    private long E;
    private final com.applovin.impl.adview.activity.a.d t;
    private final m u;
    private final ImageView v;
    private final com.applovin.impl.adview.a w;
    private final boolean x;
    private double y;
    private double z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == g.this.u) {
                if (!g.this.s()) {
                    g.this.v();
                    return;
                }
                g.this.p();
                g.this.q.b();
            } else if (view == g.this.v) {
                g.this.x();
            } else {
                v vVar = g.this.f3167c;
                vVar.e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public g(com.applovin.impl.sdk.ad.e eVar, Activity activity, com.applovin.impl.sdk.m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.t = new com.applovin.impl.adview.activity.a.d(this.a, this.f3169e, this.f3166b);
        boolean e2 = this.a.e();
        this.x = e2;
        this.A = new AtomicBoolean();
        this.B = new AtomicBoolean();
        this.C = Utils.isVideoMutedInitially(this.f3166b);
        this.D = -2L;
        this.E = 0L;
        a aVar = new a();
        if (eVar.o() >= 0) {
            m mVar2 = new m(eVar.u(), activity);
            this.u = mVar2;
            mVar2.setVisibility(8);
            mVar2.setOnClickListener(aVar);
        } else {
            this.u = null;
        }
        if (a(this.C, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.v = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setClickable(true);
            imageView.setOnClickListener(aVar);
            d(this.C);
        } else {
            this.v = null;
        }
        if (!e2) {
            this.w = null;
            return;
        }
        com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(activity, ((Integer) mVar.a(com.applovin.impl.sdk.c.b.cG)).intValue(), 16842874);
        this.w = aVar2;
        aVar2.setColor(Color.parseColor("#75FFFFFF"));
        aVar2.setBackgroundColor(Color.parseColor("#00000000"));
        aVar2.setVisibility(8);
    }

    private static boolean a(boolean z, com.applovin.impl.sdk.m mVar) {
        if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cv)).booleanValue()) {
            if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cw)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.cy)).booleanValue();
        }
        return false;
    }

    private void d(boolean z) {
        if (com.applovin.impl.sdk.utils.g.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f3169e.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.v.setScaleType(ImageView.ScaleType.FIT_XY);
                this.v.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri ay = z ? this.a.ay() : this.a.az();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.v.setImageURI(ay);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.B.compareAndSet(false, true)) {
            a(this.u, this.a.o(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.D = -1L;
                    g.this.E = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.f3167c.b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d2) {
        StringBuilder y = e.a.d.a.a.y("javascript:al_setVideoMuted(");
        y.append(this.C);
        y.append(");");
        b(y.toString());
        com.applovin.impl.adview.a aVar = this.w;
        if (aVar != null) {
            aVar.b();
        }
        if (this.u != null) {
            y();
        }
        this.f3170f.getController().m();
        this.z = d2;
        u();
        if (this.a.ai()) {
            this.q.a(this.a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j2) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.t.a(this.v, this.u, this.f3171g, this.w, this.f3170f, viewGroup);
        this.f3170f.getController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
        this.f3170f.renderAd(this.a);
        if (this.u != null) {
            this.f3166b.S().a((com.applovin.impl.sdk.e.a) new z(this.f3166b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.y();
                }
            }), o.a.MAIN, this.a.p(), true);
        }
        super.b(this.C);
    }

    @Override // com.applovin.impl.adview.g
    public void a_() {
        w();
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        this.f3167c.b("AppLovinFullscreenActivity", "Skipping video from prompt");
        v();
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d2) {
        this.y = d2;
    }

    @Override // com.applovin.impl.adview.g
    public void b_() {
        com.applovin.impl.adview.a aVar = this.w;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.w;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        super.a((int) this.y, this.x, r(), this.D);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        return this.y >= ((double) this.a.L());
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return t() && !r();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void u() {
        long j2;
        int k2;
        if (this.a.Y() >= 0 || this.a.Z() >= 0) {
            int i2 = (this.a.Y() > 0L ? 1 : (this.a.Y() == 0L ? 0 : -1));
            com.applovin.impl.sdk.ad.e eVar = this.a;
            if (i2 >= 0) {
                j2 = eVar.Y();
            } else {
                com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                double d2 = this.z;
                long millis = d2 > 0.0d ? 0 + TimeUnit.SECONDS.toMillis((long) d2) : 0L;
                if (aVar.aa() && ((k2 = (int) ((com.applovin.impl.sdk.ad.a) this.a).k()) > 0 || (k2 = (int) aVar.q()) > 0)) {
                    millis += TimeUnit.SECONDS.toMillis(k2);
                }
                double d3 = millis;
                double Z = this.a.Z();
                Double.isNaN(Z);
                Double.isNaN(d3);
                j2 = (long) ((Z / 100.0d) * d3);
            }
            b(j2);
        }
    }

    public void v() {
        this.D = SystemClock.elapsedRealtime() - this.E;
        this.f3167c.b("AppLovinFullscreenActivity", e.a.d.a.a.q(e.a.d.a.a.y("Skipping video with skip time: "), this.D, "ms"));
        this.f3168d.f();
        this.f3174j++;
        if (this.a.v()) {
            h();
        } else {
            w();
        }
    }

    public void w() {
        if (this.A.compareAndSet(false, true)) {
            this.f3167c.b("AppLovinFullscreenActivity", "Showing postitial...");
            b("javascript:al_showPostitial();");
            m mVar = this.u;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.v;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.w;
            if (aVar != null) {
                aVar.b();
            }
            if (this.f3171g != null) {
                if (this.a.q() >= 0) {
                    a(this.f3171g, this.a.q(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.f3173i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f3171g.setVisibility(0);
                }
            }
            this.f3170f.getController().n();
        }
    }

    public void x() {
        this.C = !this.C;
        StringBuilder y = e.a.d.a.a.y("javascript:al_setVideoMuted(");
        y.append(this.C);
        y.append(");");
        b(y.toString());
        d(this.C);
        a(this.C, 0L);
    }
}
