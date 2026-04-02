package com.amazon.aps.iva.g6;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.amazon.aps.iva.b6.p1;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.g6.e;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.q.i1;
import com.amazon.aps.iva.q5.r;
import com.amazon.aps.iva.t5.g0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
/* compiled from: DefaultDrmSession.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.g6.d {
    public final List<r.b> a;
    public final m b;
    public final InterfaceC0289a c;
    public final b d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap<String, String> h;
    public final com.amazon.aps.iva.t5.h<e.a> i;
    public final com.amazon.aps.iva.t6.j j;
    public final p1 k;
    public final t l;
    public final UUID m;
    public final Looper n;
    public final e o;
    public int p;
    public int q;
    public HandlerThread r;
    public c s;
    public com.amazon.aps.iva.z5.b t;
    public d.a u;
    public byte[] v;
    public byte[] w;
    public m.a x;
    public m.d y;

    /* compiled from: DefaultDrmSession.java */
    /* renamed from: com.amazon.aps.iva.g6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0289a {
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {
        public boolean a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r14) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.g6.a.c.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final long a;
        public final boolean b;
        public final Object c;
        public int d;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = obj;
        }
    }

    /* compiled from: DefaultDrmSession.java */
    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<e.a> set;
            Set<e.a> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    a aVar = a.this;
                    if (obj == aVar.x && aVar.k()) {
                        aVar.x = null;
                        if (obj2 instanceof Exception) {
                            aVar.m((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (aVar.e == 3) {
                                m mVar = aVar.b;
                                byte[] bArr2 = aVar.w;
                                int i2 = g0.a;
                                mVar.k(bArr2, bArr);
                                com.amazon.aps.iva.t5.h<e.a> hVar = aVar.i;
                                synchronized (hVar.b) {
                                    set2 = hVar.d;
                                }
                                for (e.a aVar2 : set2) {
                                    aVar2.c();
                                }
                                return;
                            }
                            byte[] k = aVar.b.k(aVar.v, bArr);
                            int i3 = aVar.e;
                            if ((i3 == 2 || (i3 == 0 && aVar.w != null)) && k != null && k.length != 0) {
                                aVar.w = k;
                            }
                            aVar.p = 4;
                            com.amazon.aps.iva.t5.h<e.a> hVar2 = aVar.i;
                            synchronized (hVar2.b) {
                                set = hVar2.d;
                            }
                            for (e.a aVar3 : set) {
                                aVar3.b();
                            }
                            return;
                        } catch (Exception e) {
                            aVar.m(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            a aVar4 = a.this;
            if (obj == aVar4.y) {
                if (aVar4.p == 2 || aVar4.k()) {
                    aVar4.y = null;
                    boolean z = obj2 instanceof Exception;
                    InterfaceC0289a interfaceC0289a = aVar4.c;
                    if (z) {
                        ((b.e) interfaceC0289a).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        aVar4.b.e((byte[]) obj2);
                        b.e eVar = (b.e) interfaceC0289a;
                        eVar.b = null;
                        HashSet hashSet = eVar.a;
                        ImmutableList copyOf = ImmutableList.copyOf((Collection) hashSet);
                        hashSet.clear();
                        UnmodifiableIterator it = copyOf.iterator();
                        while (it.hasNext()) {
                            a aVar5 = (a) it.next();
                            if (aVar5.n()) {
                                aVar5.j(true);
                            }
                        }
                    } catch (Exception e2) {
                        ((b.e) interfaceC0289a).a(e2, true);
                    }
                }
            }
        }
    }

    /* compiled from: DefaultDrmSession.java */
    /* loaded from: classes.dex */
    public static final class f extends IOException {
    }

    public a(UUID uuid, m mVar, b.e eVar, b.f fVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, t tVar, Looper looper, com.amazon.aps.iva.t6.j jVar, p1 p1Var) {
        if (i == 1 || i == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = eVar;
        this.d = fVar;
        this.b = mVar;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = tVar;
        this.i = new com.amazon.aps.iva.t5.h<>();
        this.j = jVar;
        this.k = p1Var;
        this.p = 2;
        this.n = looper;
        this.o = new e(looper);
    }

    @Override // com.amazon.aps.iva.g6.d
    public final UUID a() {
        p();
        return this.m;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final boolean b() {
        p();
        return this.f;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final byte[] c() {
        p();
        return this.w;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final com.amazon.aps.iva.z5.b d() {
        p();
        return this.t;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final void e(e.a aVar) {
        p();
        int i = this.q;
        if (i <= 0) {
            com.amazon.aps.iva.t5.p.c();
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = 0;
            e eVar = this.o;
            int i3 = g0.a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.s;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.a = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.j(bArr);
                this.v = null;
            }
        }
        if (aVar != null) {
            com.amazon.aps.iva.t5.h<e.a> hVar = this.i;
            synchronized (hVar.b) {
                Integer num = (Integer) hVar.c.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(hVar.e);
                    arrayList.remove(aVar);
                    hVar.e = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        hVar.c.remove(aVar);
                        HashSet hashSet = new HashSet(hVar.d);
                        hashSet.remove(aVar);
                        hVar.d = Collections.unmodifiableSet(hashSet);
                    } else {
                        hVar.c.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.i.count(aVar) == 0) {
                aVar.g();
            }
        }
        b bVar = this.d;
        int i4 = this.q;
        com.amazon.aps.iva.g6.b bVar2 = com.amazon.aps.iva.g6.b.this;
        if (i4 == 1 && bVar2.p > 0 && bVar2.l != -9223372036854775807L) {
            bVar2.o.add(this);
            Handler handler = bVar2.u;
            handler.getClass();
            handler.postAtTime(new i1(this, 2), this, SystemClock.uptimeMillis() + bVar2.l);
        } else if (i4 == 0) {
            bVar2.m.remove(this);
            if (bVar2.r == this) {
                bVar2.r = null;
            }
            if (bVar2.s == this) {
                bVar2.s = null;
            }
            b.e eVar2 = bVar2.i;
            HashSet hashSet2 = eVar2.a;
            hashSet2.remove(this);
            if (eVar2.b == this) {
                eVar2.b = null;
                if (!hashSet2.isEmpty()) {
                    a aVar2 = (a) hashSet2.iterator().next();
                    eVar2.b = aVar2;
                    m.d b2 = aVar2.b.b();
                    aVar2.y = b2;
                    c cVar2 = aVar2.s;
                    int i5 = g0.a;
                    b2.getClass();
                    cVar2.getClass();
                    cVar2.obtainMessage(0, new d(com.amazon.aps.iva.o6.q.a(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                }
            }
            if (bVar2.l != -9223372036854775807L) {
                Handler handler2 = bVar2.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                bVar2.o.remove(this);
            }
        }
        bVar2.k();
    }

    @Override // com.amazon.aps.iva.g6.d
    public final void f(e.a aVar) {
        int i;
        p();
        boolean z = false;
        if (this.q < 0) {
            com.amazon.aps.iva.t5.p.c();
            this.q = 0;
        }
        if (aVar != null) {
            com.amazon.aps.iva.t5.h<e.a> hVar = this.i;
            synchronized (hVar.b) {
                ArrayList arrayList = new ArrayList(hVar.e);
                arrayList.add(aVar);
                hVar.e = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) hVar.c.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(hVar.d);
                    hashSet.add(aVar);
                    hVar.d = Collections.unmodifiableSet(hashSet);
                }
                HashMap hashMap = hVar.c;
                if (num != null) {
                    i = num.intValue() + 1;
                } else {
                    i = 1;
                }
                hashMap.put(aVar, Integer.valueOf(i));
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            com.amazon.aps.iva.cq.b.C(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new c(this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (aVar != null && k() && this.i.count(aVar) == 1) {
            aVar.e(this.p);
        }
        com.amazon.aps.iva.g6.b bVar = com.amazon.aps.iva.g6.b.this;
        if (bVar.l != -9223372036854775807L) {
            bVar.o.remove(this);
            Handler handler = bVar.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.amazon.aps.iva.g6.d
    public final d.a getError() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final int getState() {
        p();
        return this.p;
    }

    @Override // com.amazon.aps.iva.g6.d
    public final Map<String, String> h() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    @Override // com.amazon.aps.iva.g6.d
    public final boolean i(String str) {
        p();
        byte[] bArr = this.v;
        com.amazon.aps.iva.cq.b.D(bArr);
        return this.b.m(str, bArr);
    }

    public final void j(boolean z) {
        long min;
        Set<e.a> set;
        if (this.g) {
            return;
        }
        byte[] bArr = this.v;
        int i = g0.a;
        int i2 = this.e;
        boolean z2 = false;
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.w.getClass();
                    this.v.getClass();
                    o(3, this.w, z);
                    return;
                }
                return;
            }
            byte[] bArr2 = this.w;
            if (bArr2 != null) {
                try {
                    this.b.d(bArr, bArr2);
                    z2 = true;
                } catch (Exception e2) {
                    l(1, e2);
                }
                if (!z2) {
                    return;
                }
            }
            o(2, bArr, z);
            return;
        }
        byte[] bArr3 = this.w;
        if (bArr3 == null) {
            o(1, bArr, z);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.d(bArr, bArr3);
                z2 = true;
            } catch (Exception e3) {
                l(1, e3);
            }
            if (!z2) {
                return;
            }
        }
        if (!com.amazon.aps.iva.q5.l.d.equals(this.m)) {
            min = Long.MAX_VALUE;
        } else {
            Pair U = com.amazon.aps.iva.cq.b.U(this);
            U.getClass();
            min = Math.min(((Long) U.first).longValue(), ((Long) U.second).longValue());
        }
        if (this.e == 0 && min <= 60) {
            com.amazon.aps.iva.t5.p.b();
            o(2, bArr, z);
        } else if (min <= 0) {
            l(2, new r());
        } else {
            this.p = 4;
            com.amazon.aps.iva.t5.h<e.a> hVar = this.i;
            synchronized (hVar.b) {
                set = hVar.d;
            }
            for (e.a aVar : set) {
                aVar.d();
            }
        }
    }

    public final boolean k() {
        int i = this.p;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final void l(int i, Exception exc) {
        int i2;
        Set<e.a> set;
        int i3 = g0.a;
        if (i3 >= 21 && i.a(exc)) {
            i2 = i.b(exc);
        } else {
            if (i3 < 23 || !j.a(exc)) {
                if (i3 < 18 || !h.b(exc)) {
                    if (i3 >= 18 && h.a(exc)) {
                        i2 = 6007;
                    } else if (exc instanceof y) {
                        i2 = 6001;
                    } else if (exc instanceof b.c) {
                        i2 = 6003;
                    } else if (exc instanceof r) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new d.a(i2, exc);
        com.amazon.aps.iva.t5.p.d("DRM session error", exc);
        com.amazon.aps.iva.t5.h<e.a> hVar = this.i;
        synchronized (hVar.b) {
            set = hVar.d;
        }
        for (e.a aVar : set) {
            aVar.f(exc);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void m(Exception exc, boolean z) {
        int i;
        if (exc instanceof NotProvisionedException) {
            b.e eVar = (b.e) this.c;
            eVar.a.add(this);
            if (eVar.b == null) {
                eVar.b = this;
                m.d b2 = this.b.b();
                this.y = b2;
                c cVar = this.s;
                int i2 = g0.a;
                b2.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(com.amazon.aps.iva.o6.q.a(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
                return;
            }
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        l(i, exc);
    }

    public final boolean n() {
        Set<e.a> set;
        if (k()) {
            return true;
        }
        try {
            byte[] c2 = this.b.c();
            this.v = c2;
            this.b.g(c2, this.k);
            this.t = this.b.h(this.v);
            this.p = 3;
            com.amazon.aps.iva.t5.h<e.a> hVar = this.i;
            synchronized (hVar.b) {
                set = hVar.d;
            }
            for (e.a aVar : set) {
                aVar.e(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            b.e eVar = (b.e) this.c;
            eVar.a.add(this);
            if (eVar.b == null) {
                eVar.b = this;
                m.d b2 = this.b.b();
                this.y = b2;
                c cVar = this.s;
                int i = g0.a;
                b2.getClass();
                cVar.getClass();
                cVar.obtainMessage(0, new d(com.amazon.aps.iva.o6.q.a(), true, SystemClock.elapsedRealtime(), b2)).sendToTarget();
            }
            return false;
        } catch (Exception e2) {
            l(1, e2);
            return false;
        }
    }

    public final void o(int i, byte[] bArr, boolean z) {
        try {
            m.a l = this.b.l(bArr, this.a, i, this.h);
            this.x = l;
            c cVar = this.s;
            int i2 = g0.a;
            l.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(com.amazon.aps.iva.o6.q.a(), z, SystemClock.elapsedRealtime(), l)).sendToTarget();
        } catch (Exception e2) {
            m(e2, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            com.amazon.aps.iva.t5.p.h("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
