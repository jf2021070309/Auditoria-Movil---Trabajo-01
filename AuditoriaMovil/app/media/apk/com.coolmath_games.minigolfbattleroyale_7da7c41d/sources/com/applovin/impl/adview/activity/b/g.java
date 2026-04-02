package com.applovin.impl.adview.activity.b;

import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.n;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.y;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.R;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class g extends com.applovin.impl.adview.activity.b.a implements com.applovin.impl.adview.g {
    private boolean A;
    private long B;
    private long C;
    private final com.applovin.impl.adview.activity.a.d r;
    private final n s;
    private final ImageView t;
    private final com.applovin.impl.adview.a u;
    private final boolean v;
    private double w;
    private double x;
    private AtomicBoolean y;
    private AtomicBoolean z;

    /* loaded from: classes.dex */
    private class a implements View.OnClickListener {
        private a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view == g.this.s) {
                if (!g.this.q()) {
                    g.this.u();
                    return;
                }
                g.this.n();
                g.this.o.b();
            } else if (view == g.this.t) {
                g.this.w();
            } else {
                r rVar = g.this.c;
                rVar.e("InterActivityV2", "Unhandled click on widget: " + view);
            }
        }
    }

    public g(com.applovin.impl.sdk.a.g gVar, AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(gVar, appLovinFullscreenActivity, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.r = new com.applovin.impl.adview.activity.a.d(this.a, this.d, this.b);
        this.v = this.a.f();
        this.y = new AtomicBoolean();
        this.z = new AtomicBoolean();
        this.A = t();
        this.B = -2L;
        this.C = 0L;
        a aVar = new a();
        if (gVar.s() >= 0) {
            n nVar = new n(gVar.w(), appLovinFullscreenActivity);
            this.s = nVar;
            nVar.setVisibility(8);
            this.s.setOnClickListener(aVar);
        } else {
            this.s = null;
        }
        if (a(this.A, kVar)) {
            ImageView imageView = new ImageView(appLovinFullscreenActivity);
            this.t = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.t.setClickable(true);
            this.t.setOnClickListener(aVar);
            d(this.A);
        } else {
            this.t = null;
        }
        if (!this.v) {
            this.u = null;
            return;
        }
        com.applovin.impl.adview.a aVar2 = new com.applovin.impl.adview.a(appLovinFullscreenActivity, ((Integer) kVar.a(com.applovin.impl.sdk.c.b.cF)).intValue(), 16842874);
        this.u = aVar2;
        aVar2.setColor(Color.parseColor("#75FFFFFF"));
        this.u.setBackgroundColor(Color.parseColor("#00000000"));
        this.u.setVisibility(8);
    }

    private static boolean a(boolean z, k kVar) {
        if (((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cr)).booleanValue()) {
            if (!((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cs)).booleanValue() || z) {
                return true;
            }
            return ((Boolean) kVar.a(com.applovin.impl.sdk.c.b.cu)).booleanValue();
        }
        return false;
    }

    private void d(boolean z) {
        if (com.applovin.impl.sdk.utils.f.d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.d.getDrawable(z ? R.drawable.unmute_to_mute : R.drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.t.setScaleType(ImageView.ScaleType.FIT_XY);
                this.t.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aE = z ? this.a.aE() : this.a.aF();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.t.setImageURI(aE);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.z.compareAndSet(false, true)) {
            a(this.s, this.a.s(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.B = -1L;
                    g.this.C = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
        this.c.b("InterActivityV2", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
    }

    @Override // com.applovin.impl.adview.g
    public void a(double d) {
        b("javascript:al_setVideoMuted(" + this.A + ");");
        com.applovin.impl.adview.a aVar = this.u;
        if (aVar != null) {
            aVar.b();
        }
        if (this.s != null) {
            x();
        }
        this.f.getAdViewController().m();
        this.x = d;
        s();
        if (this.a.am()) {
            this.o.a(this.a, (Runnable) null);
        }
    }

    @Override // com.applovin.impl.adview.g
    public void a_() {
        v();
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
        this.c.b("InterActivityV2", "Skipping video from prompt");
        u();
    }

    @Override // com.applovin.impl.adview.g
    public void b(double d) {
        this.w = d;
    }

    @Override // com.applovin.impl.adview.g
    public void b_() {
        com.applovin.impl.adview.a aVar = this.u;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.applovin.impl.adview.g
    public void c() {
        com.applovin.impl.adview.a aVar = this.u;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        this.r.a(this.t, this.s, this.g, this.u, this.f);
        this.f.getAdViewController().a(this);
        a(false);
        com.applovin.impl.adview.a aVar = this.u;
        if (aVar != null) {
            aVar.a();
        }
        this.f.renderAd(this.a);
        if (this.s != null) {
            this.b.Q().a((com.applovin.impl.sdk.e.a) new y(this.b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.1
                @Override // java.lang.Runnable
                public void run() {
                    g.this.x();
                }
            }), o.a.MAIN, this.a.t(), true);
        }
        super.b(this.A);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void g() {
        l();
        super.g();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void l() {
        super.a((int) this.w, this.v, p(), this.B);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean p() {
        return this.w >= ((double) this.a.P());
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected boolean q() {
        return r() && !p();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    protected void s() {
        long ad;
        long millis;
        if (this.a.ac() >= 0 || this.a.ad() >= 0) {
            if (this.a.ac() >= 0) {
                ad = this.a.ac();
            } else {
                com.applovin.impl.sdk.a.a aVar = (com.applovin.impl.sdk.a.a) this.a;
                long millis2 = this.x > 0.0d ? 0 + TimeUnit.SECONDS.toMillis((long) this.x) : 0L;
                if (aVar.ae()) {
                    int l = (int) ((com.applovin.impl.sdk.a.a) this.a).l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l);
                    } else {
                        int u = (int) aVar.u();
                        if (u > 0) {
                            millis = TimeUnit.SECONDS.toMillis(u);
                        }
                    }
                    millis2 += millis;
                }
                ad = (long) (millis2 * (this.a.ad() / 100.0d));
            }
            a(ad);
        }
    }

    public void u() {
        this.B = SystemClock.elapsedRealtime() - this.C;
        r rVar = this.c;
        rVar.b("InterActivityV2", "Skipping video with skip time: " + this.B + "ms");
        this.e.f();
        if (this.a.x()) {
            g();
        } else {
            v();
        }
    }

    public void v() {
        if (this.y.compareAndSet(false, true)) {
            this.c.b("InterActivityV2", "Showing postitial...");
            b("javascript:al_showPostitial();");
            n nVar = this.s;
            if (nVar != null) {
                nVar.setVisibility(8);
            }
            ImageView imageView = this.t;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            com.applovin.impl.adview.a aVar = this.u;
            if (aVar != null) {
                aVar.b();
            }
            if (this.g != null) {
                if (this.a.u() >= 0) {
                    a(this.g, this.a.u(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.g.3
                        @Override // java.lang.Runnable
                        public void run() {
                            g.this.i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.g.setVisibility(0);
                }
            }
            this.f.getAdViewController().n();
        }
    }

    protected void w() {
        this.A = !this.A;
        b("javascript:al_setVideoMuted(" + this.A + ");");
        d(this.A);
        a(this.A, 0L);
    }
}
