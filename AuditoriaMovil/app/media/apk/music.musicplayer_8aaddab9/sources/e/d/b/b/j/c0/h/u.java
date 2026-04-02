package e.d.b.b.j.c0.h;

import android.content.Context;
import e.d.b.b.j.a0.a.c;
import e.d.b.b.j.c0.i.a0;
import e.d.b.b.j.c0.i.g0;
import e.d.b.b.j.c0.i.z;
import e.d.b.b.j.d0.b;
import e.d.b.b.j.n;
import e.d.b.b.j.y.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class u {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e.d.b.b.j.y.e f6184b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f6185c;

    /* renamed from: d  reason: collision with root package name */
    public final y f6186d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f6187e;

    /* renamed from: f  reason: collision with root package name */
    public final e.d.b.b.j.d0.b f6188f;

    /* renamed from: g  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6189g;

    /* renamed from: h  reason: collision with root package name */
    public final e.d.b.b.j.e0.a f6190h;

    /* renamed from: i  reason: collision with root package name */
    public final z f6191i;

    public u(Context context, e.d.b.b.j.y.e eVar, a0 a0Var, y yVar, Executor executor, e.d.b.b.j.d0.b bVar, e.d.b.b.j.e0.a aVar, e.d.b.b.j.e0.a aVar2, z zVar) {
        this.a = context;
        this.f6184b = eVar;
        this.f6185c = a0Var;
        this.f6186d = yVar;
        this.f6187e = executor;
        this.f6188f = bVar;
        this.f6189g = aVar;
        this.f6190h = aVar2;
        this.f6191i = zVar;
    }

    public void a(final e.d.b.b.j.r rVar, int i2) {
        e.d.b.b.j.y.g a;
        e.d.b.b.j.y.m mVar = this.f6184b.get(rVar.b());
        final long j2 = 0;
        while (((Boolean) this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.e
            @Override // e.d.b.b.j.d0.b.a
            public final Object a() {
                u uVar = u.this;
                return Boolean.valueOf(uVar.f6185c.V(rVar));
            }
        })).booleanValue()) {
            final Iterable<g0> iterable = (Iterable) this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.g
                @Override // e.d.b.b.j.d0.b.a
                public final Object a() {
                    u uVar = u.this;
                    return uVar.f6185c.l(rVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (mVar == null) {
                c.t.m.g("Uploader", "Unknown backend for %s, deleting event batch for it...", rVar);
                a = e.d.b.b.j.y.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (g0 g0Var : iterable) {
                    arrayList.add(g0Var.a());
                }
                if (rVar.c() != null) {
                    e.d.b.b.j.d0.b bVar = this.f6188f;
                    final z zVar = this.f6191i;
                    Objects.requireNonNull(zVar);
                    e.d.b.b.j.a0.a.a aVar = (e.d.b.b.j.a0.a.a) bVar.f(new b.a() { // from class: e.d.b.b.j.c0.h.o
                        @Override // e.d.b.b.j.d0.b.a
                        public final Object a() {
                            return z.this.h();
                        }
                    });
                    n.a a2 = e.d.b.b.j.n.a();
                    a2.e(this.f6189g.a());
                    a2.g(this.f6190h.a());
                    a2.f("GDT_CLIENT_METRICS");
                    e.d.b.b.b bVar2 = new e.d.b.b.b("proto");
                    Objects.requireNonNull(aVar);
                    e.d.d.p.k.h hVar = e.d.b.b.j.p.a;
                    Objects.requireNonNull(hVar);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        hVar.a(aVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    a2.d(new e.d.b.b.j.m(bVar2, byteArrayOutputStream.toByteArray()));
                    arrayList.add(mVar.b(a2.b()));
                }
                a = mVar.a(new e.d.b.b.j.y.a(arrayList, rVar.c(), null));
            }
            if (a.c() == g.a.TRANSIENT_ERROR) {
                this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.h
                    @Override // e.d.b.b.j.d0.b.a
                    public final Object a() {
                        u uVar = u.this;
                        Iterable<g0> iterable2 = iterable;
                        e.d.b.b.j.r rVar2 = rVar;
                        long j3 = j2;
                        uVar.f6185c.X(iterable2);
                        uVar.f6185c.n(rVar2, uVar.f6189g.a() + j3);
                        return null;
                    }
                });
                this.f6186d.b(rVar, i2 + 1, true);
                return;
            }
            this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.j
                @Override // e.d.b.b.j.d0.b.a
                public final Object a() {
                    u uVar = u.this;
                    uVar.f6185c.e(iterable);
                    return null;
                }
            });
            if (a.c() == g.a.OK) {
                j2 = Math.max(j2, a.b());
                if (rVar.c() != null) {
                    this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.l
                        @Override // e.d.b.b.j.d0.b.a
                        public final Object a() {
                            u.this.f6191i.a();
                            return null;
                        }
                    });
                }
            } else if (a.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                for (g0 g0Var2 : iterable) {
                    String h2 = g0Var2.a().h();
                    if (hashMap.containsKey(h2)) {
                        hashMap.put(h2, Integer.valueOf(((Integer) hashMap.get(h2)).intValue() + 1));
                    } else {
                        hashMap.put(h2, 1);
                    }
                }
                this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.f
                    @Override // e.d.b.b.j.d0.b.a
                    public final Object a() {
                        u uVar = u.this;
                        Map map = hashMap;
                        Objects.requireNonNull(uVar);
                        for (Map.Entry entry : map.entrySet()) {
                            uVar.f6191i.i(((Integer) entry.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
        }
        this.f6188f.f(new b.a() { // from class: e.d.b.b.j.c0.h.i
            @Override // e.d.b.b.j.d0.b.a
            public final Object a() {
                u uVar = u.this;
                uVar.f6185c.n(rVar, uVar.f6189g.a() + j2);
                return null;
            }
        });
    }
}
