package com.facebook.ads.internal.view.e;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.internal.j.f;
import com.facebook.ads.internal.view.e.b.h;
import com.facebook.ads.internal.view.e.b.j;
import com.facebook.ads.internal.view.e.b.l;
import com.facebook.ads.internal.view.e.b.m;
import com.facebook.ads.internal.view.e.b.n;
import com.facebook.ads.internal.view.e.b.p;
import com.facebook.ads.internal.view.e.b.r;
import com.facebook.ads.internal.view.e.b.s;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;
import com.facebook.ads.internal.view.e.b.x;
import com.facebook.ads.internal.view.e.b.y;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class c extends d {
    public int a;
    private final w b;
    private final f<r> c;
    private final f<h> d;
    private final f<j> e;
    private final f<n> f;
    private final f<com.facebook.ads.internal.view.e.b.b> g;
    private final f<p> h;
    private final f<x> i;
    private final f<y> j;
    private final f<s> k;
    private final m l;
    private final b m;
    private boolean n;

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, String str) {
        this(context, cVar, bVar, new ArrayList(), str);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, String str, Bundle bundle) {
        this(context, cVar, bVar, new ArrayList(), str, bundle);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, List<com.facebook.ads.internal.b.b> list, String str) {
        super(context, cVar, bVar, list, str);
        this.b = new w() { // from class: com.facebook.ads.internal.view.e.c.1
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.e();
            }
        };
        this.c = new f<r>() { // from class: com.facebook.ads.internal.view.e.c.4
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<r> a() {
                return r.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(r rVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.i();
            }
        };
        this.d = new f<h>() { // from class: com.facebook.ads.internal.view.e.c.5
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<h> a() {
                return h.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.j();
            }
        };
        this.e = new f<j>() { // from class: com.facebook.ads.internal.view.e.c.6
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<j> a() {
                return j.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                if (c.this.n) {
                    c.this.k();
                } else {
                    c.this.n = true;
                }
            }
        };
        this.f = new f<n>() { // from class: com.facebook.ads.internal.view.e.c.7
            @Override // com.facebook.ads.internal.j.f
            public Class<n> a() {
                return n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(n nVar) {
                if (c.this.a <= 0 || c.this.m.getCurrentPosition() != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.a) {
                    c.this.a(c.this.m.getCurrentPosition());
                }
            }
        };
        this.g = new f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.view.e.c.8
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.b> a() {
                return com.facebook.ads.internal.view.e.b.b.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar2) {
                int currentPosition = c.this.m.getCurrentPosition();
                if (c.this.a <= 0 || currentPosition != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.a) {
                    if (!(currentPosition == 0 && c.this.m.g()) && c.this.m.getDuration() >= currentPosition + TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT) {
                        c.this.b(currentPosition);
                    } else if (c.this.m.getDuration() == 0) {
                        c.this.b(c.this.a);
                    } else {
                        c.this.b(c.this.m.getDuration());
                    }
                }
            }
        };
        this.h = new f<p>() { // from class: com.facebook.ads.internal.view.e.c.9
            @Override // com.facebook.ads.internal.j.f
            public Class<p> a() {
                return p.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                c.this.a(pVar.a(), pVar.b());
            }
        };
        this.i = new f<x>() { // from class: com.facebook.ads.internal.view.e.c.10
            @Override // com.facebook.ads.internal.j.f
            public Class<x> a() {
                return x.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(x xVar) {
                c.this.b();
            }
        };
        this.j = new f<y>() { // from class: com.facebook.ads.internal.view.e.c.11
            @Override // com.facebook.ads.internal.j.f
            public Class<y> a() {
                return y.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(y yVar) {
                c.this.c();
            }
        };
        this.k = new f<s>() { // from class: com.facebook.ads.internal.view.e.c.2
            @Override // com.facebook.ads.internal.j.f
            public Class<s> a() {
                return s.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(s sVar) {
                c.this.a(c.this.l(), c.this.l());
            }
        };
        this.l = new m() { // from class: com.facebook.ads.internal.view.e.c.3
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                c.this.a = c.this.m.getDuration();
            }
        };
        this.n = false;
        this.m = bVar;
        this.m.getEventBus().a(this.b, this.f, this.c, this.e, this.d, this.g, this.h, this.i, this.j, this.l, this.k);
    }

    public c(Context context, com.facebook.ads.internal.m.c cVar, b bVar, List<com.facebook.ads.internal.b.b> list, String str, Bundle bundle) {
        super(context, cVar, bVar, list, str, bundle);
        this.b = new w() { // from class: com.facebook.ads.internal.view.e.c.1
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.e();
            }
        };
        this.c = new f<r>() { // from class: com.facebook.ads.internal.view.e.c.4
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<r> a() {
                return r.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(r rVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.i();
            }
        };
        this.d = new f<h>() { // from class: com.facebook.ads.internal.view.e.c.5
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<h> a() {
                return h.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(h hVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                c.this.j();
            }
        };
        this.e = new f<j>() { // from class: com.facebook.ads.internal.view.e.c.6
            static final /* synthetic */ boolean a;

            static {
                a = !c.class.desiredAssertionStatus();
            }

            @Override // com.facebook.ads.internal.j.f
            public Class<j> a() {
                return j.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(j jVar) {
                if (!a && c.this == null) {
                    throw new AssertionError();
                }
                if (c.this == null) {
                    return;
                }
                if (c.this.n) {
                    c.this.k();
                } else {
                    c.this.n = true;
                }
            }
        };
        this.f = new f<n>() { // from class: com.facebook.ads.internal.view.e.c.7
            @Override // com.facebook.ads.internal.j.f
            public Class<n> a() {
                return n.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(n nVar) {
                if (c.this.a <= 0 || c.this.m.getCurrentPosition() != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.a) {
                    c.this.a(c.this.m.getCurrentPosition());
                }
            }
        };
        this.g = new f<com.facebook.ads.internal.view.e.b.b>() { // from class: com.facebook.ads.internal.view.e.c.8
            @Override // com.facebook.ads.internal.j.f
            public Class<com.facebook.ads.internal.view.e.b.b> a() {
                return com.facebook.ads.internal.view.e.b.b.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(com.facebook.ads.internal.view.e.b.b bVar2) {
                int currentPosition = c.this.m.getCurrentPosition();
                if (c.this.a <= 0 || currentPosition != c.this.m.getDuration() || c.this.m.getDuration() <= c.this.a) {
                    if (!(currentPosition == 0 && c.this.m.g()) && c.this.m.getDuration() >= currentPosition + TTAdConstant.SHOW_POLL_TIME_SPLASH_DEFAULT) {
                        c.this.b(currentPosition);
                    } else if (c.this.m.getDuration() == 0) {
                        c.this.b(c.this.a);
                    } else {
                        c.this.b(c.this.m.getDuration());
                    }
                }
            }
        };
        this.h = new f<p>() { // from class: com.facebook.ads.internal.view.e.c.9
            @Override // com.facebook.ads.internal.j.f
            public Class<p> a() {
                return p.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(p pVar) {
                c.this.a(pVar.a(), pVar.b());
            }
        };
        this.i = new f<x>() { // from class: com.facebook.ads.internal.view.e.c.10
            @Override // com.facebook.ads.internal.j.f
            public Class<x> a() {
                return x.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(x xVar) {
                c.this.b();
            }
        };
        this.j = new f<y>() { // from class: com.facebook.ads.internal.view.e.c.11
            @Override // com.facebook.ads.internal.j.f
            public Class<y> a() {
                return y.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(y yVar) {
                c.this.c();
            }
        };
        this.k = new f<s>() { // from class: com.facebook.ads.internal.view.e.c.2
            @Override // com.facebook.ads.internal.j.f
            public Class<s> a() {
                return s.class;
            }

            @Override // com.facebook.ads.internal.j.f
            public void a(s sVar) {
                c.this.a(c.this.l(), c.this.l());
            }
        };
        this.l = new m() { // from class: com.facebook.ads.internal.view.e.c.3
            @Override // com.facebook.ads.internal.j.f
            public void a(l lVar) {
                c.this.a = c.this.m.getDuration();
            }
        };
        this.n = false;
        this.m = bVar;
        this.m.getEventBus().a(this.b, this.f, this.c, this.e, this.d, this.g, this.i, this.j, this.k);
    }

    public void a() {
        this.m.getEventBus().b(this.b, this.f, this.c, this.e, this.d, this.g, this.i, this.j, this.l, this.k);
    }
}
