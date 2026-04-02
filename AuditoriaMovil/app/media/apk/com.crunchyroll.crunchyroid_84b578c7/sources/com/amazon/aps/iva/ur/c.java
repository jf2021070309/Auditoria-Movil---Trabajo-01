package com.amazon.aps.iva.ur;

import com.amazon.aps.iva.bs.g;
import com.amazon.aps.iva.fb0.d;
import com.amazon.aps.iva.hc.m;
import com.amazon.aps.iva.ur.e;
import com.amazon.aps.iva.xr.g;
import com.amazon.aps.iva.xr.h;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
/* compiled from: DDTracer.java */
/* loaded from: classes2.dex */
public class c implements com.amazon.aps.iva.fb0.d, Closeable {
    public static final BigInteger p = BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
    public static final BigInteger q = BigInteger.ZERO;
    public final String b;
    public final com.amazon.aps.iva.cs.a c;
    public final g d;
    public final com.amazon.aps.iva.fb0.a e;
    public final Map<String, String> f;
    public final Map<String, String> g;
    public final Map<String, String> h;
    public final int i;
    public final C0772c j;
    public final ConcurrentHashMap k;
    public final ConcurrentSkipListSet l;
    public final g.d m;
    public final g.c n;
    public final Random o;

    /* compiled from: DDTracer.java */
    /* loaded from: classes2.dex */
    public class a implements Comparator<com.amazon.aps.iva.as.b> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(com.amazon.aps.iva.as.b bVar, com.amazon.aps.iva.as.b bVar2) {
            return Integer.compare(bVar.a(), bVar2.a());
        }
    }

    /* compiled from: DDTracer.java */
    /* loaded from: classes2.dex */
    public class b implements d.a {
        public final com.amazon.aps.iva.fb0.a b;
        public final LinkedHashMap d;
        public com.amazon.aps.iva.fb0.c e;
        public String f;
        public String g;
        public d h = new m();
        public final String c = "okhttp.request";

        public b(com.amazon.aps.iva.fb0.a aVar) {
            this.d = new LinkedHashMap(c.this.g);
            this.b = aVar;
        }

        @Override // com.amazon.aps.iva.fb0.d.a
        public final d.a a(com.amazon.aps.iva.fb0.c cVar) {
            this.e = cVar;
            return this;
        }

        public final void b(String str, String str2) {
            LinkedHashMap linkedHashMap = this.d;
            if (str2 != null && !str2.isEmpty()) {
                linkedHashMap.put(str, str2);
            } else {
                linkedHashMap.remove(str);
            }
        }

        @Override // com.amazon.aps.iva.fb0.d.a
        public final com.amazon.aps.iva.fb0.b start() {
            f fVar;
            f fVar2;
            int i;
            BigInteger bigInteger;
            BigInteger bigInteger2;
            Map<String, String> map;
            String str;
            String str2;
            ConcurrentHashMap concurrentHashMap;
            int i2;
            e eVar;
            String str3;
            com.amazon.aps.iva.fb0.b b;
            do {
                synchronized (c.this.o) {
                    fVar = new f(c.this.o);
                }
            } while (fVar.signum() == 0);
            com.amazon.aps.iva.fb0.c cVar = this.e;
            if (cVar == null && (b = this.b.b()) != null) {
                cVar = b.c();
            }
            if (cVar instanceof com.amazon.aps.iva.ur.b) {
                com.amazon.aps.iva.ur.b bVar = (com.amazon.aps.iva.ur.b) cVar;
                BigInteger bigInteger3 = bVar.d;
                bigInteger2 = bVar.e;
                ConcurrentHashMap concurrentHashMap2 = bVar.c;
                e eVar2 = bVar.b;
                if (this.f == null) {
                    this.f = bVar.h;
                }
                i2 = Integer.MIN_VALUE;
                concurrentHashMap = concurrentHashMap2;
                eVar = eVar2;
                str2 = null;
                bigInteger = bigInteger3;
            } else {
                if (cVar instanceof com.amazon.aps.iva.xr.d) {
                    com.amazon.aps.iva.xr.d dVar = (com.amazon.aps.iva.xr.d) cVar;
                    bigInteger = dVar.c;
                    bigInteger2 = dVar.d;
                    i = dVar.e;
                    map = dVar.f;
                } else {
                    while (true) {
                        synchronized (c.this.o) {
                            fVar2 = new f(c.this.o);
                        }
                        if (fVar2.signum() != 0) {
                            break;
                        }
                    }
                    i = Integer.MIN_VALUE;
                    bigInteger = fVar2;
                    bigInteger2 = BigInteger.ZERO;
                    map = null;
                }
                if (cVar instanceof h) {
                    h hVar = (h) cVar;
                    this.d.putAll(hVar.b);
                    str = hVar.a;
                } else {
                    str = this.g;
                }
                this.d.putAll(c.this.f);
                str2 = str;
                concurrentHashMap = map;
                i2 = i;
                eVar = new e(c.this, bigInteger);
            }
            if (this.f == null) {
                this.f = c.this.b;
            }
            String str4 = this.c;
            if (str4 != null) {
                str3 = str4;
            } else {
                str3 = null;
            }
            String str5 = this.f;
            LinkedHashMap linkedHashMap = this.d;
            c cVar2 = c.this;
            com.amazon.aps.iva.ur.b bVar2 = new com.amazon.aps.iva.ur.b(bigInteger, fVar, bigInteger2, str5, str3, i2, str2, concurrentHashMap, linkedHashMap, eVar, cVar2, cVar2.h);
            for (Map.Entry entry : this.d.entrySet()) {
                if (entry.getValue() == null) {
                    bVar2.i(null, (String) entry.getKey());
                } else {
                    List<com.amazon.aps.iva.vr.a> list = (List) c.this.k.get((String) entry.getKey());
                    boolean z = true;
                    if (list != null) {
                        for (com.amazon.aps.iva.vr.a aVar : list) {
                            try {
                                z &= aVar.a(bVar2, (String) entry.getKey(), entry.getValue());
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    if (!z) {
                        bVar2.i(null, (String) entry.getKey());
                    }
                }
            }
            return new com.amazon.aps.iva.ur.a(bVar2, this.h);
        }
    }

    /* compiled from: DDTracer.java */
    /* renamed from: com.amazon.aps.iva.ur.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0772c extends Thread {
        public final WeakReference<c> b;

        public C0772c(c cVar) {
            super("dd-tracer-shutdown-hook");
            this.b = new WeakReference<>(cVar);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            c cVar = this.b.get();
            if (cVar != null) {
                cVar.close();
            }
        }
    }

    public c() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0203 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(com.amazon.aps.iva.zr.a r13, com.amazon.aps.iva.cs.a r14, java.security.SecureRandom r15) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ur.c.<init>(com.amazon.aps.iva.zr.a, com.amazon.aps.iva.cs.a, java.security.SecureRandom):void");
    }

    public final void a(Collection<com.amazon.aps.iva.ur.a> collection) {
        ArrayList arrayList;
        if (collection.isEmpty()) {
            return;
        }
        ConcurrentSkipListSet concurrentSkipListSet = this.l;
        if (concurrentSkipListSet.isEmpty()) {
            arrayList = new ArrayList(collection);
        } else {
            Collection<com.amazon.aps.iva.as.a> arrayList2 = new ArrayList(collection);
            Iterator it = concurrentSkipListSet.iterator();
            while (it.hasNext()) {
                arrayList2 = ((com.amazon.aps.iva.as.b) it.next()).b();
            }
            arrayList = new ArrayList(arrayList2.size());
            for (com.amazon.aps.iva.as.a aVar : arrayList2) {
                if (aVar instanceof com.amazon.aps.iva.ur.a) {
                    arrayList.add((com.amazon.aps.iva.ur.a) aVar);
                }
            }
        }
        com.amazon.aps.iva.cs.a aVar2 = this.c;
        aVar2.d0();
        if (!arrayList.isEmpty()) {
            com.amazon.aps.iva.ur.a f = ((com.amazon.aps.iva.ur.a) arrayList.get(0)).b.b.f();
            com.amazon.aps.iva.bs.g gVar = this.d;
            if ((gVar instanceof com.amazon.aps.iva.bs.d) && f != null && f.b.d() == Integer.MIN_VALUE) {
                ((com.amazon.aps.iva.bs.d) gVar).b(f);
            }
            if (f == null) {
                f = (com.amazon.aps.iva.ur.a) arrayList.get(0);
            }
            if (gVar.c(f)) {
                aVar2.p0(arrayList);
            }
        }
    }

    @Override // com.amazon.aps.iva.fb0.d
    public final com.amazon.aps.iva.fb0.c b(com.amazon.aps.iva.hb0.a aVar) {
        return this.n.b(aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e.a andSet = e.l.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
        this.c.close();
    }

    @Override // com.amazon.aps.iva.fb0.d
    public d.a e0() {
        return new b(this.e);
    }

    public final void finalize() {
        try {
            Runtime runtime = Runtime.getRuntime();
            C0772c c0772c = this.j;
            runtime.removeShutdownHook(c0772c);
            c0772c.run();
        } catch (Exception unused) {
        }
    }

    @Override // com.amazon.aps.iva.fb0.d
    public final void l(com.amazon.aps.iva.fb0.c cVar, com.amazon.aps.iva.kr.c cVar2) {
        com.amazon.aps.iva.ur.b bVar = (com.amazon.aps.iva.ur.b) cVar;
        com.amazon.aps.iva.ur.a f = bVar.b.f();
        com.amazon.aps.iva.bs.g gVar = this.d;
        if ((gVar instanceof com.amazon.aps.iva.bs.d) && f != null && f.b.d() == Integer.MIN_VALUE) {
            ((com.amazon.aps.iva.bs.d) gVar).b(f);
        }
        this.m.a(bVar, cVar2);
    }

    public final String toString() {
        return "DDTracer-" + Integer.toHexString(hashCode()) + "{ serviceName=" + this.b + ", writer=" + this.c + ", sampler=" + this.d + ", defaultSpanTags=" + this.g + '}';
    }
}
