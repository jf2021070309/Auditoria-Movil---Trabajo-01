package com.facebook.ads.internal.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.j.a;
import com.facebook.ads.internal.r.a;
import com.facebook.ads.internal.view.e.c.d;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class l extends m {
    private boolean A;
    private final AudienceNetworkActivity.BackButtonInterceptor f;
    private final com.facebook.ads.internal.view.e.b.e g;
    private final com.facebook.ads.internal.view.e.b.k h;
    private final com.facebook.ads.internal.view.e.b.i i;
    private final com.facebook.ads.internal.view.e.b.c j;
    private final com.facebook.ads.internal.view.e.b.m k;
    private final com.facebook.ads.internal.view.e.b l;
    private final com.facebook.ads.internal.view.e.c.o m;
    private final com.facebook.ads.internal.view.e.c.f n;
    private final com.facebook.ads.internal.adapters.v o;
    private final com.facebook.ads.internal.adapters.d p;
    private final com.facebook.ads.internal.r.a q;
    private final a.AbstractC0116a r;
    private final com.facebook.ads.internal.q.a.s s;
    private final com.facebook.ads.internal.d.b t;
    private final AtomicBoolean u;
    private final AtomicBoolean v;
    private final com.facebook.ads.internal.view.e.d w;
    private AudienceNetworkActivity x;
    private com.facebook.ads.internal.view.e.a.a y;
    private long z;

    public l(Context context, com.facebook.ads.internal.m.c cVar, com.facebook.ads.internal.adapters.v vVar, com.facebook.ads.internal.d.b bVar) {
        super(context, cVar);
        this.f = new AudienceNetworkActivity.BackButtonInterceptor() { // from class: com.facebook.ads.internal.view.l.1
            @Override // com.facebook.ads.AudienceNetworkActivity.BackButtonInterceptor
            public boolean interceptBackButton() {
                return !l.this.c.a();
            }
        };
        this.g = new com.facebook.ads.internal.view.e.b.e() { // from class: com.facebook.ads.internal.view.l.2
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.d dVar) {
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("videoInterstitalEvent", dVar);
                }
                if (!l.this.A) {
                    l.this.l.f();
                    l.this.l.k();
                    l.this.A = true;
                }
                if (l.this.x != null) {
                    l.this.x.finish();
                }
            }
        };
        this.h = new com.facebook.ads.internal.view.e.b.k() { // from class: com.facebook.ads.internal.view.l.3
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.j jVar) {
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("videoInterstitalEvent", jVar);
                }
            }
        };
        this.i = new com.facebook.ads.internal.view.e.b.i() { // from class: com.facebook.ads.internal.view.l.4
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.h hVar) {
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("videoInterstitalEvent", hVar);
                }
            }
        };
        this.j = new com.facebook.ads.internal.view.e.b.c() { // from class: com.facebook.ads.internal.view.l.5
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar2) {
                l.this.u.set(true);
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("videoInterstitalEvent", bVar2);
                }
            }
        };
        this.k = new com.facebook.ads.internal.view.e.b.m() { // from class: com.facebook.ads.internal.view.l.6
            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.l lVar) {
                if (!l.this.A) {
                    l.this.v.set(l.this.l.j());
                    l.this.a();
                }
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("videoInterstitalEvent", lVar);
                }
            }
        };
        this.s = new com.facebook.ads.internal.q.a.s();
        this.u = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.A = false;
        this.l = new com.facebook.ads.internal.view.e.b(getContext());
        com.facebook.ads.internal.q.a.v.a(this.l);
        com.facebook.ads.internal.q.a.v.a(this.l, 0);
        this.o = vVar;
        this.p = this.o.d().get(0);
        this.t = bVar;
        this.m = new com.facebook.ads.internal.view.e.c.o(getContext());
        this.n = new com.facebook.ads.internal.view.e.c.f(context);
        this.l.getEventBus().a(this.h, this.i, this.j, this.g, this.k);
        setupPlugins(this.p);
        this.r = new a.AbstractC0116a() { // from class: com.facebook.ads.internal.view.l.7
            @Override // com.facebook.ads.internal.r.a.AbstractC0116a
            public void a() {
                if (l.this.s.b()) {
                    return;
                }
                l.this.s.a();
                HashMap hashMap = new HashMap();
                if (TextUtils.isEmpty(l.this.o.a())) {
                    return;
                }
                l.this.q.a(hashMap);
                hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(l.this.s.e()));
                l.this.b.a(l.this.o.a(), hashMap);
                if (l.this.getAudienceNetworkListener() != null) {
                    l.this.getAudienceNetworkListener().a("com.facebook.ads.interstitial.impression.logged");
                }
            }
        };
        this.q = new com.facebook.ads.internal.r.a(this.l, 1, this.r);
        this.q.a(vVar.j());
        this.q.b(vVar.k());
        this.w = new com.facebook.ads.internal.view.e.c(getContext(), this.b, this.l, this.o.a());
        this.l.setVideoURI(a(this.p.i()));
    }

    private String a(String str) {
        String str2 = "";
        if (this.t != null && str != null) {
            str2 = this.t.b(str);
        }
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.n.setVisibility(this.v.get() ? 0 : 8);
    }

    private void setUpContent(int i) {
        com.facebook.ads.internal.view.component.a.b a = com.facebook.ads.internal.view.component.a.c.a(getContext(), this.b, getAudienceNetworkListener(), this.l, this.d, this.e, a, i, this.p.g(), this.p.h(), this.m, this.n);
        a();
        a.a(this.p.b(), this.p.c(), this.p.d(), this.p.e(), this.o.a(), this.p.h() / this.p.g());
        a(a, a.a(), i);
    }

    private void setupPlugins(com.facebook.ads.internal.adapters.d dVar) {
        this.l.d();
        this.l.a(this.m);
        this.l.a(this.n);
        if (!TextUtils.isEmpty(dVar.f())) {
            com.facebook.ads.internal.view.e.c.g gVar = new com.facebook.ads.internal.view.e.c.g(getContext());
            this.l.a(gVar);
            gVar.setImage(dVar.f());
        }
        com.facebook.ads.internal.view.e.c.l lVar = new com.facebook.ads.internal.view.e.c.l(getContext(), true);
        this.l.a(lVar);
        this.l.a(new com.facebook.ads.internal.view.e.c.d(lVar, dVar.j() ? d.a.FADE_OUT_ON_PLAY : d.a.VISIBLE, true));
        this.l.a(new com.facebook.ads.internal.view.e.c.k(getContext()));
        this.l.a(this.c);
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        super.a(audienceNetworkActivity, this.o);
        this.x = audienceNetworkActivity;
        setUpContent(audienceNetworkActivity.getResources().getConfiguration().orientation);
        this.x.addBackButtonInterceptor(this.f);
        com.facebook.ads.internal.adapters.d dVar = this.o.d().get(0);
        if (dVar.j()) {
            this.l.setVolume(dVar.k() ? 1.0f : 0.0f);
            this.l.a(com.facebook.ads.internal.view.e.a.a.AUTO_STARTED);
        }
        this.z = System.currentTimeMillis();
    }

    @Override // com.facebook.ads.internal.view.a
    public void a(Bundle bundle) {
    }

    @Override // com.facebook.ads.internal.view.a
    public void i() {
        if (this.A || this.l.getState() != com.facebook.ads.internal.view.e.d.d.STARTED) {
            return;
        }
        this.y = this.l.getVideoStartReason();
        this.l.a(false);
    }

    @Override // com.facebook.ads.internal.view.a
    public void j() {
        if (this.A || this.y == null) {
            return;
        }
        this.l.a(this.y);
    }

    @Override // com.facebook.ads.internal.view.m, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        removeAllViews();
        com.facebook.ads.internal.q.a.v.b(this.l);
        com.facebook.ads.internal.q.a.v.b(this.m);
        com.facebook.ads.internal.q.a.v.b(this.n);
        setUpContent(configuration.orientation);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.internal.view.m, com.facebook.ads.internal.view.a
    public void onDestroy() {
        if (!this.A) {
            if (!this.u.get()) {
                this.l.e();
            }
            if (this.o != null) {
                com.facebook.ads.internal.j.b.a(com.facebook.ads.internal.j.a.a(this.z, a.EnumC0112a.XOUT, this.o.f()));
                if (!TextUtils.isEmpty(this.o.a())) {
                    HashMap hashMap = new HashMap();
                    this.q.a(hashMap);
                    hashMap.put("touch", com.facebook.ads.internal.q.a.j.a(this.s.e()));
                    this.b.h(this.o.a(), hashMap);
                }
            }
            this.l.f();
            this.l.k();
            this.A = true;
        }
        this.x = null;
        super.onDestroy();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.s.a(motionEvent, this, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.q != null) {
            if (i == 0) {
                this.q.a();
            } else if (i == 8) {
                this.q.b();
            }
        }
    }
}
