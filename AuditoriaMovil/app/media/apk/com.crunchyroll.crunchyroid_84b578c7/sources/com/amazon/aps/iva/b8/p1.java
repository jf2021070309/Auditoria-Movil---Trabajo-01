package com.amazon.aps.iva.b8;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.amazon.aps.iva.b8.e;
import com.amazon.aps.iva.b8.j;
import com.amazon.aps.iva.b8.p1;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.b8.r1;
import com.amazon.aps.iva.n5.b;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.d0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.u0;
import com.amazon.aps.iva.q5.v0;
import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* compiled from: MediaSessionStub.java */
/* loaded from: classes.dex */
public final class p1 extends j.a {
    public static final /* synthetic */ int i = 0;
    public final WeakReference<t> a;
    public final com.amazon.aps.iva.n5.b b;
    public final com.amazon.aps.iva.b8.e<IBinder> e;
    public final Set<q.d> f = Collections.synchronizedSet(new HashSet());
    public ImmutableBiMap<com.amazon.aps.iva.q5.s0, String> g = ImmutableBiMap.of();
    public int h;

    /* compiled from: MediaSessionStub.java */
    /* loaded from: classes.dex */
    public static final class a implements q.c {
        public final h a;

        public a(h hVar) {
            this.a = hVar;
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void a(int i) throws RemoteException {
            this.a.a(i);
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void d() throws RemoteException {
            this.a.d();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                return com.amazon.aps.iva.t5.g0.a(this.a.asBinder(), ((a) obj).a.asBinder());
            }
            return false;
        }

        public final int hashCode() {
            return com.amazon.aps.iva.o3.b.b(this.a.asBinder());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void r(int i, a2 a2Var) throws RemoteException {
            this.a.N(i, a2Var.toBundle());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void s(int i, l0.a aVar) throws RemoteException {
            this.a.b0(i, aVar.toBundle());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void u(int i, k<?> kVar) throws RemoteException {
            this.a.z(i, kVar.toBundle());
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void y(int i, r1 r1Var, l0.a aVar, boolean z, boolean z2, int i2) throws RemoteException {
            boolean z3;
            boolean z4;
            boolean z5 = false;
            if (i2 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.amazon.aps.iva.cq.b.C(z3);
            if (!z && aVar.a(17)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z2 || !aVar.a(30)) {
                z5 = true;
            }
            h hVar = this.a;
            if (i2 >= 2) {
                hVar.d0(i, r1Var.c(aVar, z, z2), new r1.b(z4, z5).toBundle());
            } else {
                hVar.k0(i, r1Var.c(aVar, z, true), z4);
            }
        }

        @Override // com.amazon.aps.iva.b8.q.c
        public final void z(int i, z1 z1Var, boolean z, boolean z2) throws RemoteException {
            this.a.c0(i, z1Var.a(z, z2));
        }
    }

    /* compiled from: MediaSessionStub.java */
    /* loaded from: classes.dex */
    public interface b {
        void c(q.d dVar, v1 v1Var);
    }

    /* compiled from: MediaSessionStub.java */
    /* loaded from: classes.dex */
    public interface c {
        void b(v1 v1Var, q.d dVar, List<com.amazon.aps.iva.q5.b0> list);
    }

    /* compiled from: MediaSessionStub.java */
    /* loaded from: classes.dex */
    public interface d {
        void d(v1 v1Var, q.e eVar);
    }

    /* compiled from: MediaSessionStub.java */
    /* loaded from: classes.dex */
    public interface e<T, K extends t> {
        T e(K k, q.d dVar, int i);
    }

    public p1(t tVar) {
        this.a = new WeakReference<>(tVar);
        this.b = com.amazon.aps.iva.n5.b.a(tVar.d);
        this.e = new com.amazon.aps.iva.b8.e<>(tVar);
    }

    public static void A0(q.d dVar, int i2, a2 a2Var) {
        try {
            q.c cVar = dVar.d;
            com.amazon.aps.iva.cq.b.D(cVar);
            cVar.r(i2, a2Var);
        } catch (RemoteException e2) {
            com.amazon.aps.iva.t5.p.h("Failed to send result to controller " + dVar, e2);
        }
    }

    public static com.amazon.aps.iva.g1.r B0(com.amazon.aps.iva.t5.g gVar) {
        return new com.amazon.aps.iva.g1.r(new com.amazon.aps.iva.n4.f0(gVar, 4));
    }

    public static com.amazon.aps.iva.f1.c0 C0(e eVar) {
        return new com.amazon.aps.iva.f1.c0(eVar, 8);
    }

    public static com.amazon.aps.iva.b6.d u0(e eVar, c cVar) {
        return new com.amazon.aps.iva.b6.d(6, eVar, cVar);
    }

    public static <T, K extends t> ListenableFuture<Void> v0(K k, q.d dVar, int i2, e<ListenableFuture<T>, K> eVar, com.amazon.aps.iva.t5.g<ListenableFuture<T>> gVar) {
        if (k.g()) {
            return Futures.immediateVoidFuture();
        }
        ListenableFuture<T> e2 = eVar.e(k, dVar, i2);
        SettableFuture create = SettableFuture.create();
        e2.addListener(new com.amazon.aps.iva.a6.d1(k, create, gVar, e2, 1), MoreExecutors.directExecutor());
        return create;
    }

    public static com.amazon.aps.iva.g1.p z0(e eVar) {
        return new com.amazon.aps.iva.g1.p(eVar, 6);
    }

    public final void D0(h hVar, int i2, Bundle bundle, boolean z) {
        if (hVar != null && bundle != null) {
            try {
                y0(hVar, i2, 31, C0(new com.amazon.aps.iva.b6.p(new com.amazon.aps.iva.b6.d0((com.amazon.aps.iva.q5.b0) com.amazon.aps.iva.q5.b0.o.e(bundle), z), new com.amazon.aps.iva.g1.f(7))));
            } catch (RuntimeException e2) {
                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void E0(h hVar, int i2, IBinder iBinder, final boolean z) {
        if (hVar != null && iBinder != null) {
            try {
                final ImmutableList a2 = com.amazon.aps.iva.t5.c.a(com.amazon.aps.iva.q5.b0.o, com.amazon.aps.iva.q5.j.a(iBinder));
                y0(hVar, i2, 20, C0(new com.amazon.aps.iva.b6.p(new e() { // from class: com.amazon.aps.iva.b8.j1
                    @Override // com.amazon.aps.iva.b8.p1.e
                    public final Object e(t tVar, q.d dVar, int i3) {
                        int K0;
                        long a3;
                        boolean z2 = z;
                        if (z2) {
                            K0 = -1;
                        } else {
                            K0 = tVar.o.K0();
                        }
                        if (z2) {
                            a3 = -9223372036854775807L;
                        } else {
                            a3 = tVar.o.a();
                        }
                        return tVar.j(a2, K0, a3);
                    }
                }, new com.amazon.aps.iva.q5.p(8))));
            } catch (RuntimeException e2) {
                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for MediaItem", e2);
            }
        }
    }

    public final void F0(h hVar, int i2, String str, Bundle bundle) {
        l lVar;
        if (hVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.amazon.aps.iva.t5.p.g();
            return;
        }
        if (bundle == null) {
            lVar = null;
        } else {
            lVar = (l) l.j.e(bundle);
        }
        p0(hVar, i2, 50001, z0(new com.amazon.aps.iva.b6.g0(str, lVar)));
    }

    public final void o0(h hVar, int i2, int i3, String str, int i4, int i5) {
        b.C0529b c0529b = new b.C0529b(str, i4, i5);
        q.d dVar = new q.d(c0529b, i3, this.b.a.a(c0529b.a), new a(hVar));
        t tVar = this.a.get();
        if (tVar != null && !tVar.g()) {
            this.f.add(dVar);
            com.amazon.aps.iva.t5.g0.U(tVar.j, new com.amazon.aps.iva.a6.c1(this, dVar, tVar, hVar, 2));
            return;
        }
        try {
            hVar.d();
        } catch (RemoteException unused) {
        }
    }

    public final <K extends t> void p0(h hVar, int i2, int i3, e<ListenableFuture<Void>, K> eVar) {
        q0(hVar, i2, null, i3, eVar);
    }

    public final <K extends t> void q0(h hVar, final int i2, final x1 x1Var, final int i3, final e<ListenableFuture<Void>, K> eVar) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final t tVar = this.a.get();
            if (tVar != null && !tVar.g()) {
                final q.d e2 = this.e.e(hVar.asBinder());
                if (e2 == null) {
                    return;
                }
                com.amazon.aps.iva.t5.g0.U(tVar.j, new Runnable() { // from class: com.amazon.aps.iva.b8.d1
                    @Override // java.lang.Runnable
                    public final void run() {
                        e<IBinder> eVar2 = p1.this.e;
                        q.d dVar = e2;
                        if (eVar2.g(dVar)) {
                            x1 x1Var2 = x1Var;
                            int i4 = i2;
                            if (x1Var2 != null) {
                                if (!eVar2.j(dVar, x1Var2)) {
                                    p1.A0(dVar, i4, new a2(-4));
                                    return;
                                }
                            } else if (!eVar2.i(i3, dVar)) {
                                p1.A0(dVar, i4, new a2(-4));
                                return;
                            }
                            eVar.e(tVar, dVar, i4);
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public final r1 r0(r1 r1Var) {
        ImmutableList<v0.a> a2 = r1Var.E.a();
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableBiMap.Builder builder2 = ImmutableBiMap.builder();
        for (int i2 = 0; i2 < a2.size(); i2++) {
            v0.a aVar = a2.get(i2);
            com.amazon.aps.iva.q5.s0 b2 = aVar.b();
            String str = this.g.get(b2);
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                int i3 = this.h;
                this.h = i3 + 1;
                sb.append(com.amazon.aps.iva.t5.g0.L(i3));
                sb.append("-");
                sb.append(b2.c);
                str = sb.toString();
            }
            builder2.put((ImmutableBiMap.Builder) b2, (com.amazon.aps.iva.q5.s0) str);
            builder.add((ImmutableList.Builder) aVar.a(str));
        }
        this.g = builder2.buildOrThrow();
        r1 a3 = r1Var.a(new com.amazon.aps.iva.q5.v0(builder.build()));
        com.amazon.aps.iva.q5.u0 u0Var = a3.F;
        if (u0Var.z.isEmpty()) {
            return a3;
        }
        u0.a c2 = u0Var.a().c();
        UnmodifiableIterator<com.amazon.aps.iva.q5.t0> it = u0Var.z.values().iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.q5.t0 next = it.next();
            com.amazon.aps.iva.q5.s0 s0Var = next.b;
            String str2 = this.g.get(s0Var);
            if (str2 != null) {
                c2.a(new com.amazon.aps.iva.q5.t0(s0Var.a(str2), next.c));
            } else {
                c2.a(next);
            }
        }
        return a3.b(c2.b());
    }

    public final void s0(h hVar, int i2, final String str, final int i3, final int i4, Bundle bundle) throws RuntimeException {
        final l lVar;
        if (hVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.amazon.aps.iva.t5.p.g();
        } else if (i3 < 0) {
            com.amazon.aps.iva.t5.p.g();
        } else if (i4 < 1) {
            com.amazon.aps.iva.t5.p.g();
        } else {
            if (bundle == null) {
                lVar = null;
            } else {
                lVar = (l) l.j.e(bundle);
            }
            p0(hVar, i2, 50003, z0(new e(str, i3, i4, lVar) { // from class: com.amazon.aps.iva.b8.u0
                public final /* synthetic */ String b;
                public final /* synthetic */ l c;

                {
                    this.c = lVar;
                }

                @Override // com.amazon.aps.iva.b8.p1.e
                public final Object e(t tVar, q.d dVar, int i5) {
                    l lVar2 = this.c;
                    o oVar = (o) tVar;
                    oVar.getClass();
                    if (Objects.equals(this.b, "androidx.media3.session.recent.root")) {
                        if (!oVar.f.j) {
                            return Futures.immediateFuture(k.a(-6));
                        }
                        if (oVar.o.h() != 1) {
                            b0.b bVar = new b0.b();
                            bVar.a = "androidx.media3.session.recent.item";
                            d0.a aVar = new d0.a();
                            aVar.p = Boolean.FALSE;
                            aVar.q = Boolean.TRUE;
                            bVar.k = new com.amazon.aps.iva.q5.d0(aVar);
                            ImmutableList<com.amazon.aps.iva.q5.b0> of = ImmutableList.of(bVar.a());
                            String str2 = k.g;
                            for (com.amazon.aps.iva.q5.b0 b0Var : of) {
                                k.b(b0Var);
                            }
                            return Futures.immediateFuture(new k(0, SystemClock.elapsedRealtime(), lVar2, ImmutableList.copyOf((Collection) of), 3));
                        }
                        SettableFuture.create();
                        throw null;
                    }
                    throw null;
                }
            }));
        }
    }

    public final void t0(h hVar, int i2, String str, int i3, int i4, Bundle bundle) {
        l lVar;
        if (hVar == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.amazon.aps.iva.t5.p.g();
        } else if (i3 < 0) {
            com.amazon.aps.iva.t5.p.g();
        } else if (i4 < 1) {
            com.amazon.aps.iva.t5.p.g();
        } else {
            if (bundle == null) {
                lVar = null;
            } else {
                lVar = (l) l.j.e(bundle);
            }
            p0(hVar, i2, 50006, z0(new l1(str, i3, i4, lVar)));
        }
    }

    public final int w0(int i2, q.d dVar, v1 v1Var) {
        if (v1Var.V(17)) {
            com.amazon.aps.iva.b8.e<IBinder> eVar = this.e;
            if (!eVar.h(17, dVar) && eVar.h(16, dVar)) {
                return v1Var.K0() + i2;
            }
        }
        return i2;
    }

    public final void x0(h hVar, int i2, Bundle bundle, Bundle bundle2) {
        if (hVar != null && bundle != null && bundle2 != null) {
            try {
                x1 x1Var = (x1) x1.j.e(bundle);
                q0(hVar, i2, x1Var, 0, C0(new com.amazon.aps.iva.b6.i(2, x1Var, bundle2)));
            } catch (RuntimeException e2) {
                com.amazon.aps.iva.t5.p.h("Ignoring malformed Bundle for SessionCommand", e2);
            }
        }
    }

    public final <K extends t> void y0(h hVar, final int i2, final int i3, final e<ListenableFuture<Void>, K> eVar) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            final t tVar = this.a.get();
            if (tVar != null && !tVar.g()) {
                final q.d e2 = this.e.e(hVar.asBinder());
                if (e2 == null) {
                    return;
                }
                com.amazon.aps.iva.t5.g0.U(tVar.j, new Runnable() { // from class: com.amazon.aps.iva.b8.c1
                    @Override // java.lang.Runnable
                    public final void run() {
                        p1 p1Var = p1.this;
                        final q.d dVar = e2;
                        int i4 = i3;
                        final int i5 = i2;
                        final t tVar2 = tVar;
                        final p1.e eVar2 = eVar;
                        if (!p1Var.e.h(i4, dVar)) {
                            p1.A0(dVar, i5, new a2(-4));
                            return;
                        }
                        tVar2.c.b(tVar2.i, dVar, i4);
                        if (i4 == 27) {
                            tVar2.a(dVar, new a0(eVar2, tVar2, dVar, i5)).run();
                            return;
                        }
                        e<IBinder> eVar3 = p1Var.e;
                        e.a aVar = new e.a() { // from class: com.amazon.aps.iva.b8.f1
                            @Override // com.amazon.aps.iva.b8.e.a
                            public final ListenableFuture run() {
                                return (ListenableFuture) p1.e.this.e(tVar2, dVar, i5);
                            }
                        };
                        synchronized (eVar3.a) {
                            e.b<IBinder> orDefault = eVar3.c.getOrDefault(dVar, null);
                            if (orDefault != null) {
                                orDefault.c.add(aVar);
                            }
                        }
                    }
                });
            }
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}
