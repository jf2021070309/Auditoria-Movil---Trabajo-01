package com.amazon.aps.iva.g6;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.a;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.f;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: DefaultDrmSessionManager.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.g6.f {
    public final UUID b;
    public final m.c c;
    public final t d;
    public final HashMap<String, String> e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final e i;
    public final com.amazon.aps.iva.t6.j j;
    public final f k;
    public final long l;
    public final ArrayList m;
    public final Set<d> n;
    public final Set<com.amazon.aps.iva.g6.a> o;
    public int p;
    public m q;
    public com.amazon.aps.iva.g6.a r;
    public com.amazon.aps.iva.g6.a s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public p1 x;
    public volatile HandlerC0290b y;

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes.dex */
    public class a implements m.b {
        public a() {
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.amazon.aps.iva.g6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class HandlerC0290b extends Handler {
        public HandlerC0290b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = b.this.m.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.g6.a aVar = (com.amazon.aps.iva.g6.a) it.next();
                aVar.p();
                if (Arrays.equals(aVar.v, bArr)) {
                    if (message.what == 2 && aVar.e == 0 && aVar.p == 4) {
                        int i = g0.a;
                        aVar.j(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes.dex */
    public static final class c extends Exception {
        public c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes.dex */
    public class d implements f.b {
        public final e.a b;
        public com.amazon.aps.iva.g6.d c;
        public boolean d;

        public d(e.a aVar) {
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.g6.f.b
        public final void release() {
            Handler handler = b.this.u;
            handler.getClass();
            g0.U(handler, new com.amazon.aps.iva.e.d(this, 5));
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes.dex */
    public class e implements a.InterfaceC0289a {
        public final HashSet a = new HashSet();
        public com.amazon.aps.iva.g6.a b;

        public final void a(Exception exc, boolean z) {
            int i;
            this.b = null;
            HashSet hashSet = this.a;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) hashSet);
            hashSet.clear();
            UnmodifiableIterator it = copyOf.iterator();
            while (it.hasNext()) {
                com.amazon.aps.iva.g6.a aVar = (com.amazon.aps.iva.g6.a) it.next();
                aVar.getClass();
                if (z) {
                    i = 1;
                } else {
                    i = 3;
                }
                aVar.l(i, exc);
            }
        }
    }

    /* compiled from: DefaultDrmSessionManager.java */
    /* loaded from: classes.dex */
    public class f implements a.b {
        public f() {
        }
    }

    public b(UUID uuid, m.c cVar, t tVar, HashMap hashMap, boolean z, int[] iArr, boolean z2, com.amazon.aps.iva.t6.i iVar, long j) {
        uuid.getClass();
        com.amazon.aps.iva.cq.b.v(!com.amazon.aps.iva.q5.l.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.b = uuid;
        this.c = cVar;
        this.d = tVar;
        this.e = hashMap;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = iVar;
        this.i = new e();
        this.k = new f();
        this.v = 0;
        this.m = new ArrayList();
        this.n = Sets.newIdentityHashSet();
        this.o = Sets.newIdentityHashSet();
        this.l = j;
    }

    public static boolean f(com.amazon.aps.iva.g6.a aVar) {
        aVar.p();
        if (aVar.p == 1) {
            if (g0.a < 19) {
                return true;
            }
            d.a error = aVar.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(com.amazon.aps.iva.q5.r rVar, UUID uuid, boolean z) {
        boolean z2;
        ArrayList arrayList = new ArrayList(rVar.e);
        for (int i = 0; i < rVar.e; i++) {
            r.b bVar = rVar.b[i];
            if (!bVar.a(uuid) && (!com.amazon.aps.iva.q5.l.c.equals(uuid) || !bVar.a(com.amazon.aps.iva.q5.l.b))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2 && (bVar.f != null || z)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.g6.f
    public final void a(Looper looper, p1 p1Var) {
        boolean z;
        synchronized (this) {
            Looper looper2 = this.t;
            if (looper2 == null) {
                this.t = looper;
                this.u = new Handler(looper);
            } else {
                if (looper2 == looper) {
                    z = true;
                } else {
                    z = false;
                }
                com.amazon.aps.iva.cq.b.C(z);
                this.u.getClass();
            }
        }
        this.x = p1Var;
    }

    @Override // com.amazon.aps.iva.g6.f
    public final com.amazon.aps.iva.g6.d b(e.a aVar, com.amazon.aps.iva.q5.v vVar) {
        boolean z = false;
        m(false);
        if (this.p > 0) {
            z = true;
        }
        com.amazon.aps.iva.cq.b.C(z);
        com.amazon.aps.iva.cq.b.D(this.t);
        return e(this.t, aVar, vVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.g6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(com.amazon.aps.iva.q5.v r7) {
        /*
            r6 = this;
            r0 = 0
            r6.m(r0)
            com.amazon.aps.iva.g6.m r1 = r6.q
            r1.getClass()
            int r1 = r1.f()
            com.amazon.aps.iva.q5.r r2 = r7.p
            if (r2 != 0) goto L2b
            java.lang.String r7 = r7.m
            int r7 = com.amazon.aps.iva.q5.g0.i(r7)
            r2 = r0
        L18:
            int[] r3 = r6.g
            int r4 = r3.length
            r5 = -1
            if (r2 >= r4) goto L26
            r3 = r3[r2]
            if (r3 != r7) goto L23
            goto L27
        L23:
            int r2 = r2 + 1
            goto L18
        L26:
            r2 = r5
        L27:
            if (r2 == r5) goto L2a
            r0 = r1
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.w
            r3 = 1
            if (r7 == 0) goto L31
            goto L80
        L31:
            java.util.UUID r7 = r6.b
            java.util.ArrayList r4 = j(r2, r7, r3)
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L53
            int r4 = r2.e
            if (r4 != r3) goto L81
            com.amazon.aps.iva.q5.r$b[] r4 = r2.b
            r4 = r4[r0]
            java.util.UUID r5 = com.amazon.aps.iva.q5.l.b
            boolean r4 = r4.a(r5)
            if (r4 == 0) goto L81
            java.util.Objects.toString(r7)
            com.amazon.aps.iva.t5.p.g()
        L53:
            java.lang.String r7 = r2.d
            if (r7 == 0) goto L80
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L60
            goto L80
        L60:
            java.lang.String r2 = "cbcs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6f
            int r7 = com.amazon.aps.iva.t5.g0.a
            r2 = 25
            if (r7 < r2) goto L81
            goto L80
        L6f:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L81
            java.lang.String r2 = "cens"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L80
            goto L81
        L80:
            r0 = r3
        L81:
            if (r0 == 0) goto L84
            goto L85
        L84:
            r1 = r3
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g6.b.c(com.amazon.aps.iva.q5.v):int");
    }

    @Override // com.amazon.aps.iva.g6.f
    public final f.b d(e.a aVar, com.amazon.aps.iva.q5.v vVar) {
        boolean z;
        if (this.p > 0) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        com.amazon.aps.iva.cq.b.D(this.t);
        d dVar = new d(aVar);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new com.amazon.aps.iva.c6.f(1, dVar, vVar));
        return dVar;
    }

    public final com.amazon.aps.iva.g6.d e(Looper looper, e.a aVar, com.amazon.aps.iva.q5.v vVar, boolean z) {
        ArrayList arrayList;
        boolean z2;
        if (this.y == null) {
            this.y = new HandlerC0290b(looper);
        }
        com.amazon.aps.iva.q5.r rVar = vVar.p;
        int i = 0;
        com.amazon.aps.iva.g6.a aVar2 = null;
        if (rVar == null) {
            int i2 = com.amazon.aps.iva.q5.g0.i(vVar.m);
            m mVar = this.q;
            mVar.getClass();
            if (mVar.f() == 2 && n.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            int[] iArr = this.g;
            while (true) {
                if (i < iArr.length) {
                    if (iArr[i] == i2) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1 || mVar.f() == 1) {
                return null;
            }
            com.amazon.aps.iva.g6.a aVar3 = this.r;
            if (aVar3 == null) {
                com.amazon.aps.iva.g6.a i3 = i(ImmutableList.of(), true, null, z);
                this.m.add(i3);
                this.r = i3;
            } else {
                aVar3.f(null);
            }
            return this.r;
        }
        if (this.w == null) {
            arrayList = j(rVar, this.b, false);
            if (arrayList.isEmpty()) {
                c cVar = new c(this.b);
                com.amazon.aps.iva.t5.p.d("DRM error", cVar);
                if (aVar != null) {
                    aVar.f(cVar);
                }
                return new l(new d.a(6003, cVar));
            }
        } else {
            arrayList = null;
        }
        if (!this.f) {
            aVar2 = this.s;
        } else {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.amazon.aps.iva.g6.a aVar4 = (com.amazon.aps.iva.g6.a) it.next();
                if (g0.a(aVar4.a, arrayList)) {
                    aVar2 = aVar4;
                    break;
                }
            }
        }
        if (aVar2 == null) {
            aVar2 = i(arrayList, false, aVar, z);
            if (!this.f) {
                this.s = aVar2;
            }
            this.m.add(aVar2);
        } else {
            aVar2.f(aVar);
        }
        return aVar2;
    }

    @Override // com.amazon.aps.iva.g6.f
    public final void g() {
        m(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            m a2 = this.c.a(this.b);
            this.q = a2;
            a2.i(new a());
        } else if (this.l != -9223372036854775807L) {
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.m;
                if (i2 < arrayList.size()) {
                    ((com.amazon.aps.iva.g6.a) arrayList.get(i2)).f(null);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public final com.amazon.aps.iva.g6.a h(List<r.b> list, boolean z, e.a aVar) {
        this.q.getClass();
        UUID uuid = this.b;
        m mVar = this.q;
        e eVar = this.i;
        f fVar = this.k;
        int i = this.v;
        byte[] bArr = this.w;
        HashMap<String, String> hashMap = this.e;
        t tVar = this.d;
        Looper looper = this.t;
        looper.getClass();
        com.amazon.aps.iva.t6.j jVar = this.j;
        p1 p1Var = this.x;
        p1Var.getClass();
        com.amazon.aps.iva.g6.a aVar2 = new com.amazon.aps.iva.g6.a(uuid, mVar, eVar, fVar, list, i, this.h | z, z, bArr, hashMap, tVar, looper, jVar, p1Var);
        aVar2.f(aVar);
        if (this.l != -9223372036854775807L) {
            aVar2.f(null);
        }
        return aVar2;
    }

    public final com.amazon.aps.iva.g6.a i(List<r.b> list, boolean z, e.a aVar, boolean z2) {
        com.amazon.aps.iva.g6.a h = h(list, z, aVar);
        boolean f2 = f(h);
        long j = this.l;
        Set<com.amazon.aps.iva.g6.a> set = this.o;
        if (f2 && !set.isEmpty()) {
            UnmodifiableIterator it = ImmutableSet.copyOf((Collection) set).iterator();
            while (it.hasNext()) {
                ((com.amazon.aps.iva.g6.d) it.next()).e(null);
            }
            h.e(aVar);
            if (j != -9223372036854775807L) {
                h.e(null);
            }
            h = h(list, z, aVar);
        }
        if (f(h) && z2) {
            Set<d> set2 = this.n;
            if (!set2.isEmpty()) {
                UnmodifiableIterator it2 = ImmutableSet.copyOf((Collection) set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    UnmodifiableIterator it3 = ImmutableSet.copyOf((Collection) set).iterator();
                    while (it3.hasNext()) {
                        ((com.amazon.aps.iva.g6.d) it3.next()).e(null);
                    }
                }
                h.e(aVar);
                if (j != -9223372036854775807L) {
                    h.e(null);
                }
                return h(list, z, aVar);
            }
            return h;
        }
        return h;
    }

    public final void k() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            m mVar = this.q;
            mVar.getClass();
            mVar.release();
            this.q = null;
        }
    }

    public final void l(int i, byte[] bArr) {
        com.amazon.aps.iva.cq.b.C(this.m.isEmpty());
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.v = i;
        this.w = bArr;
    }

    public final void m(boolean z) {
        if (z && this.t == null) {
            com.amazon.aps.iva.t5.p.h("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            com.amazon.aps.iva.t5.p.h("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // com.amazon.aps.iva.g6.f
    public final void release() {
        m(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((com.amazon.aps.iva.g6.a) arrayList.get(i2)).e(null);
            }
        }
        UnmodifiableIterator it = ImmutableSet.copyOf((Collection) this.n).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        k();
    }
}
