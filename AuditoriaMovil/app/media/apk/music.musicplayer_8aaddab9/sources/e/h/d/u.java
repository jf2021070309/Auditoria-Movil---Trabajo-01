package e.h.d;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.jrtstudio.audio.Bookmark;
import e.a.c.j6;
import e.a.c.o6;
import e.a.c.z6;
import e.h.b.r;
import e.h.d.m0;
import e.h.d.u;
import e.h.d.v0;
import e.h.d.z0;
import e.h.g.j0;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes2.dex */
public class u {
    public static final BlockingQueue<c> a = new LinkedBlockingQueue();

    /* renamed from: b  reason: collision with root package name */
    public b f8202b;

    /* renamed from: c  reason: collision with root package name */
    public b f8203c;

    /* renamed from: d  reason: collision with root package name */
    public s0 f8204d;

    /* loaded from: classes.dex */
    public static class b {
        public long a;

        /* renamed from: b  reason: collision with root package name */
        public t f8205b;

        /* renamed from: c  reason: collision with root package name */
        public m0.l f8206c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f8207d;

        /* renamed from: e  reason: collision with root package name */
        public int f8208e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8209f;

        /* renamed from: g  reason: collision with root package name */
        public w0 f8210g;

        public b(t tVar, m0.l lVar, Bookmark bookmark, long j2, v0 v0Var, w0 w0Var, Bundle bundle) {
            v0.a aVar;
            if (v0Var != null && v0Var.f8212b.ordinal() == 1 && (aVar = v0Var.f8213c) != null) {
                q0 q0Var = aVar.f8222c;
            }
            this.f8205b = tVar;
            this.f8206c = lVar;
            if (bookmark != null) {
                this.a = bookmark.a;
            }
            this.f8210g = w0Var;
            Objects.requireNonNull(c.i.g.b.f2069b);
            this.f8209f = c.i.g.h.q() == 1;
            Objects.requireNonNull(c.i.g.b.f2069b);
            this.f8208e = c.i.g.h.o();
            Objects.requireNonNull(c.i.g.b.f());
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public b a;

        /* renamed from: b  reason: collision with root package name */
        public t f8211b;

        public c() {
        }

        public c(a aVar) {
        }
    }

    static {
        e.h.g.j0.c(new j0.b() { // from class: e.h.d.g
            @Override // e.h.g.j0.b
            public final void a() {
                Uri uri;
                String str;
                BlockingQueue<u.c> blockingQueue = u.a;
                while (true) {
                    try {
                        u.c take = u.a.take();
                        if (take instanceof u.c) {
                            u.c cVar = take;
                            t tVar = cVar.f8211b;
                            u.b bVar = cVar.a;
                            r.b a2 = e.h.b.r.a(e.h.g.x0.f8405d);
                            int i2 = 1;
                            if ((a2 == null || (str = a2.f8091b) == null || str.length() <= 0) ? false : true) {
                                e.h.b.s sVar = new e.h.b.s();
                                sVar.put("s", e.h.b.s.c(tVar.getTitle()));
                                String e2 = tVar.e();
                                if (e2 != null) {
                                    sVar.put("a", e2);
                                }
                                String d2 = tVar.d();
                                if (d2 != null) {
                                    sVar.put("h", d2);
                                }
                                sVar.put("c", tVar.A());
                                sVar.put(e.c.a.l.e.a, bVar.a);
                                String path = tVar.getPath();
                                if (path == null || path.length() <= 0 || path.equals("!^!")) {
                                    sVar.remove("f");
                                } else {
                                    sVar.put("f", path);
                                }
                                Objects.requireNonNull((j6) c.i.g.b.f());
                                if (tVar instanceof o6) {
                                    o6 o6Var = (o6) tVar;
                                    uri = z6.p(o6Var.f5145b, o6Var.b());
                                    if (uri == null) {
                                        z6.l(e.h.g.x0.f8405d, o6Var.f5145b, o6Var.b());
                                        uri = z6.p(o6Var.f5145b, o6Var.b());
                                    }
                                } else {
                                    uri = null;
                                }
                                if (uri != null) {
                                    sVar.put("b", uri.toString());
                                }
                                if (bVar.f8206c.ordinal() == 0) {
                                    i2 = 5;
                                }
                                sVar.put(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, i2);
                                z0.c cVar2 = z0.a;
                                z0.b bVar2 = new z0.b(null);
                                c.i.g.b.c();
                                sVar.put("q", "music.musicplayer");
                                bVar2.a = 6;
                                bVar2.f8229b = sVar;
                                z0.a.b(bVar2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        });
    }

    public u(s0 s0Var) {
        this.f8204d = s0Var;
    }
}
