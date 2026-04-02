package com.facebook.ads.internal.view;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Pair;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.adapters.ad;
import com.facebook.ads.internal.r.a;
import com.facebook.ads.internal.view.a;
import com.facebook.ads.internal.view.d.b;
import com.facebook.ads.internal.view.e.b.z;
import com.facebook.ads.internal.view.e.c.d;
import com.facebook.ads.internal.view.e.c.j;
import com.facebook.ads.internal.view.g;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class q implements a {
    static final /* synthetic */ boolean a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final RelativeLayout.LayoutParams j;
    private final com.facebook.ads.internal.adapters.j A;
    private Context C;
    private com.facebook.ads.internal.view.e.b D;
    private a.InterfaceC0118a E;
    private com.facebook.ads.internal.view.d.a F;
    private com.facebook.ads.internal.view.e.c.d G;
    private com.facebook.ads.internal.view.e.c.l H;
    private com.facebook.ads.internal.view.e.c.j I;
    private g J;
    private com.facebook.ads.internal.view.d.b K;
    private final ad q;
    private final com.facebook.ads.internal.m.c r;
    private final com.facebook.ads.internal.r.a s;
    private final a.AbstractC0116a t;
    private final com.facebook.ads.internal.view.e.c.o v;
    private final com.facebook.ads.internal.view.e.c w;
    private final RelativeLayout x;
    private final RelativeLayout y;
    private final com.facebook.ads.internal.view.e.c.f z;
    private final AudienceNetworkActivity.BackButtonInterceptor k = new AudienceNetworkActivity.BackButtonInterceptor() { // from class: com.facebook.ads.internal.view.q.1
        @Override // com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor
        public boolean interceptBackButton() {
            return !q.this.L;
        }
    };
    private final com.facebook.ads.internal.view.e.b.c l = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.q.3
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.b bVar) {
            if (q.this.E != null) {
                q.this.K.d();
                q.this.e();
                q.this.E.a(z.REWARDED_VIDEO_COMPLETE.a(), bVar);
            }
        }
    };
    private final com.facebook.ads.internal.view.e.b.e m = new com.facebook.ads.internal.view.e.b.e() { // from class: com.facebook.ads.internal.view.q.4
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.d dVar) {
            if (q.this.E != null) {
                q.this.E.a(z.REWARDED_VIDEO_ERROR.a());
            }
            q.this.c();
        }
    };
    private final com.facebook.ads.internal.view.e.b.m n = new com.facebook.ads.internal.view.e.b.m() { // from class: com.facebook.ads.internal.view.q.5
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.l lVar) {
            if (q.this.D != null) {
                q.this.D.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
                q.this.s.a();
                q.this.B.set(q.this.D.j());
                q.this.h();
            }
        }
    };
    private final com.facebook.ads.internal.view.e.b.u o = new com.facebook.ads.internal.view.e.b.u() { // from class: com.facebook.ads.internal.view.q.6
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.t tVar) {
            q.this.u.a(tVar.b(), q.this.D, tVar.a());
        }
    };
    private final com.facebook.ads.internal.view.e.b.o p = new com.facebook.ads.internal.view.e.b.o() { // from class: com.facebook.ads.internal.view.q.7
        @Override // com.facebook.ads.internal.j.f
        public void a(com.facebook.ads.internal.view.e.b.n nVar) {
            if (q.this.D == null || q.this.G == null || q.this.D.getDuration() - q.this.D.getCurrentPosition() > 3000 || !q.this.G.a()) {
                return;
            }
            q.this.G.b();
        }
    };
    private final com.facebook.ads.internal.q.a.s u = new com.facebook.ads.internal.q.a.s();
    private final AtomicBoolean B = new AtomicBoolean(false);
    private boolean L = false;

    static {
        a = !q.class.desiredAssertionStatus();
        b = (int) (12.0f * com.facebook.ads.internal.q.a.v.b);
        c = (int) (18.0f * com.facebook.ads.internal.q.a.v.b);
        d = (int) (16.0f * com.facebook.ads.internal.q.a.v.b);
        e = (int) (72.0f * com.facebook.ads.internal.q.a.v.b);
        f = (int) (com.facebook.ads.internal.q.a.v.b * 56.0f);
        g = (int) (com.facebook.ads.internal.q.a.v.b * 56.0f);
        h = (int) (28.0f * com.facebook.ads.internal.q.a.v.b);
        i = (int) (20.0f * com.facebook.ads.internal.q.a.v.b);
        j = new RelativeLayout.LayoutParams(-1, -1);
    }

    public q(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.view.e.b bVar, a.InterfaceC0118a interfaceC0118a, ad adVar) {
        this.C = context;
        this.E = interfaceC0118a;
        this.D = bVar;
        this.r = cVar;
        this.q = adVar;
        this.A = this.q.n();
        this.x = new RelativeLayout(context);
        this.y = new RelativeLayout(context);
        this.v = new com.facebook.ads.internal.view.e.c.o(this.C);
        this.z = new com.facebook.ads.internal.view.e.c.f(this.C);
        this.K = new com.facebook.ads.internal.view.d.b(this.C, this.r, this.q, this.E);
        new com.facebook.ads.internal.view.b.d(this.y, i).a().a(com.facebook.ads.internal.l.a.e(this.C)).a(this.q.j());
        this.t = new a.AbstractC0116a() { // from class: com.facebook.ads.internal.view.q.8
            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void a() {
                if (q.this.u.b()) {
                    return;
                }
                q.this.u.a();
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(q.this.q.b())) {
                    q.this.s.a(hashMap);
                    hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(q.this.u.e()));
                    q.this.r.a(q.this.q.b(), hashMap);
                }
                if (q.this.E != null) {
                    q.this.E.a(z.REWARDED_VIDEO_IMPRESSION.a());
                }
            }
        };
        this.s = new com.facebook.ads.internal.r.a(this.D, 1, this.t);
        this.s.a(250);
        this.w = new com.facebook.ads.internal.view.e.c(this.C, this.r, this.D, this.q.b());
        if (!a && this.D == null) {
            throw new AssertionError();
        }
        this.D.h();
        this.D.setIsFullScreen(true);
        this.D.setBackgroundColor(-16777216);
        this.D.getEventBus().a(this.l, this.m, this.n, this.o, this.p);
    }

    private void a(int i2) {
        this.y.removeAllViews();
        this.y.addView(this.D, j);
        if (this.F != null) {
            com.facebook.ads.internal.q.a.v.a(this.F);
            this.F.a(i2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            this.F.setPadding(d, d, d, d);
            this.y.addView(this.F, layoutParams);
        }
        if (this.I != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(f, f);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.I.setPadding(d, d, d, d);
            this.y.addView(this.I, layoutParams2);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(h, h);
        layoutParams3.addRule(10);
        layoutParams3.addRule(11);
        layoutParams3.setMargins(b, b + g, b, c);
        this.y.addView(this.z, layoutParams3);
        h();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(12);
        this.y.addView(this.v, layoutParams4);
    }

    private void d() {
        if (this.D == null) {
            return;
        }
        this.D.d();
        this.D.a(new com.facebook.ads.internal.view.e.c.k(this.C));
        this.D.a(this.z);
        this.D.a(this.v);
        this.H = new com.facebook.ads.internal.view.e.c.l(this.C, true);
        com.facebook.ads.internal.view.e.c.d dVar = new com.facebook.ads.internal.view.e.c.d(this.H, d.a.FADE_OUT_ON_PLAY, true);
        this.D.a(this.H);
        this.D.a(dVar);
        this.F = new com.facebook.ads.internal.view.d.a(this.C, e, this.A, this.r, this.E, this.K.b() == b.a.INFO, this.K.b() == b.a.INFO);
        this.F.setInfo(this.q);
        this.G = new com.facebook.ads.internal.view.e.c.d(this.F, d.a.FADE_OUT_ON_PLAY, true);
        this.D.a(this.G);
        if (this.K.a() && this.q.k() > 0) {
            this.I = new com.facebook.ads.internal.view.e.c.j(this.C, this.q.k(), -12286980);
            this.I.setButtonMode(j.a.SKIP_BUTTON_MODE);
            this.I.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.q.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (q.this.I == null || !q.this.I.a() || q.this.I.getSkipSeconds() == 0 || q.this.D == null) {
                        return;
                    }
                    q.this.D.e();
                }
            });
            this.D.a(this.I);
        } else if (this.K.a()) {
        } else {
            this.J = new g(this.C);
            this.J.a(this.q.e(), this.q.i(), this.q.t(), this.q.r(), this.q.b(), this.q.k());
            if (this.q.k() <= 0) {
                this.J.b();
            }
            if (this.K.b() != b.a.INFO) {
                this.J.c();
            }
            this.J.setToolbarListener(new g.a() { // from class: com.facebook.ads.internal.view.q.10
                @Override // com.facebook.ads.internal.view.g.a
                public void a() {
                    if (!q.this.L && q.this.D != null) {
                        q.this.L = true;
                        q.this.D.e();
                    } else if (!q.this.L || q.this.E == null) {
                    } else {
                        q.this.E.a(z.REWARDED_VIDEO_END_ACTIVITY.a());
                    }
                }
            });
            this.D.a(this.J);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.L = true;
        g();
        f();
        if (this.D != null) {
            this.D.d();
            this.D.setVisibility(4);
        }
        if (this.J != null) {
            this.J.a(true);
            this.J.c();
        }
        com.facebook.ads.internal.q.a.v.a(this.D, this.I, this.z, this.v);
        Pair<b.a, View> c2 = this.K.c();
        switch ((b.a) c2.first) {
            case MARKUP:
                com.facebook.ads.internal.q.a.v.a(this.F);
                this.y.addView((View) c2.second, j);
                return;
            case SCREENSHOTS:
                if (this.F != null) {
                    this.F.setVisibility(0);
                    this.F.a();
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, g, 0, 0);
                layoutParams.addRule(2, this.F.getId());
                this.y.addView((View) c2.second, layoutParams);
                return;
            case INFO:
                com.facebook.ads.internal.q.a.v.a(this.F);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(15);
                layoutParams2.setMargins(d, d, d, d);
                this.y.addView((View) c2.second, layoutParams2);
                return;
            default:
                return;
        }
    }

    private void f() {
        if (Build.VERSION.SDK_INT > 19) {
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.setDuration(200L);
            autoTransition.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            TransitionManager.beginDelayedTransition(this.y, autoTransition);
        }
    }

    private void g() {
        if (this.C == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this.C);
        frameLayout.setLayoutParams(j);
        com.facebook.ads.internal.q.a.v.a(frameLayout, -1509949440);
        this.y.addView(frameLayout, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.z.setVisibility(this.B.get() ? 0 : 8);
    }

    public void a() {
        if (this.D != null) {
            this.D.a(true);
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        if (this.D == null || this.E == null) {
            return;
        }
        d();
        audienceNetworkActivity.addBackButtonInterceptor(this.k);
        if (!TextUtils.isEmpty(this.q.a())) {
            this.D.setVideoURI(!TextUtils.isEmpty(this.q.s()) ? this.q.s() : this.q.a());
        }
        a(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.x.addView(this.y, j);
        if (this.J != null) {
            com.facebook.ads.internal.q.a.v.a(this.J);
            this.J.a(this.A, true);
            this.x.addView(this.J, new RelativeLayout.LayoutParams(-1, g));
        }
        this.x.setLayoutParams(j);
        this.E.a(this.x);
        this.D.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
    }

    public void a(Configuration configuration) {
        if (this.F != null) {
            this.F.a(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    public boolean b() {
        return this.D == null || this.D.getState() == com.facebook.ads.internal.view.e.d.d.PAUSED;
    }

    public void c() {
        if (this.D != null) {
            this.D.f();
            this.D.k();
        }
        if (this.s != null) {
            this.s.b();
        }
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        a();
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (!b() || this.D == null || this.E == null) {
            return;
        }
        this.D.a(this.D.getCurrentPosition());
        this.D.a(com.facebook.ads.internal.view.e.a.a.USER_STARTED);
    }

    @Override // com.facebook.ads.internal.view.a
    public void onDestroy() {
        c();
        if (this.D != null) {
            this.D.getEventBus().b(this.l, this.m, this.n, this.o, this.p);
        }
        if (!TextUtils.isEmpty(this.q.b())) {
            HashMap hashMap = new HashMap();
            this.s.a(hashMap);
            hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(this.u.e()));
            this.r.h(this.q.b(), hashMap);
        }
        if (this.J != null) {
            this.J.setToolbarListener(null);
        }
        this.w.a();
        this.D = null;
        this.K.e();
        this.I = null;
        this.F = null;
        this.G = null;
        this.E = null;
        this.C = null;
        this.v.a();
    }

    @Override // com.facebook.ads.internal.view.a
    public void setListener(a.InterfaceC0118a interfaceC0118a) {
    }
}
