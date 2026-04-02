package com.amazon.aps.iva.ur;

import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DDSpanContext.java */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.fb0.c {
    public static final Map<String, Number> p = Collections.emptyMap();
    public final c a;
    public final e b;
    public final ConcurrentHashMap c;
    public final BigInteger d;
    public final BigInteger e;
    public final BigInteger f;
    public final ConcurrentHashMap g;
    public volatile String h;
    public volatile String i;
    public volatile String j;
    public volatile boolean k;
    public boolean l;
    public final String m;
    public final AtomicReference<Map<String, Number>> n;
    public final Map<String, String> o;

    public b(BigInteger bigInteger, f fVar, BigInteger bigInteger2, String str, String str2, int i, String str3, Map map, LinkedHashMap linkedHashMap, e eVar, c cVar, Map map2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.g = concurrentHashMap;
        this.l = false;
        this.n = new AtomicReference<>();
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        this.a = cVar;
        this.b = eVar;
        this.d = bigInteger;
        this.e = fVar;
        this.f = bigInteger2;
        if (map == null) {
            this.c = new ConcurrentHashMap(0);
        } else {
            this.c = new ConcurrentHashMap(map);
        }
        if (linkedHashMap != null) {
            concurrentHashMap.putAll(linkedHashMap);
        }
        this.o = map2;
        h(str);
        this.j = str2;
        this.i = null;
        this.k = false;
        this.m = str3;
        if (i != Integer.MIN_VALUE) {
            g(i);
        }
        if (str3 != null) {
            concurrentHashMap.put("_dd.origin", str3);
        }
        concurrentHashMap.put("thread.name", name);
        concurrentHashMap.put("thread.id", Long.valueOf(id));
    }

    @Override // com.amazon.aps.iva.fb0.c
    public final String a() {
        return this.d.toString();
    }

    @Override // com.amazon.aps.iva.fb0.c
    public final String b() {
        return this.e.toString();
    }

    public final Map<String, Number> c() {
        Map<String, Number> map = this.n.get();
        if (map == null) {
            return p;
        }
        return map;
    }

    public final int d() {
        b bVar;
        a f = this.b.f();
        if (f != null && (bVar = f.b) != this) {
            return bVar.d();
        }
        Number number = c().get("_sampling_priority_v1");
        if (number == null) {
            return Integer.MIN_VALUE;
        }
        return number.intValue();
    }

    public final boolean e() {
        boolean z;
        b bVar;
        a f = this.b.f();
        if (f != null && (bVar = f.b) != this) {
            return bVar.e();
        }
        synchronized (this) {
            if (c().get("_sampling_priority_v1") != null && !this.l) {
                this.l = true;
            }
            z = this.l;
        }
        return z;
    }

    public final void f(String str, Number number) {
        AtomicReference<Map<String, Number>> atomicReference = this.n;
        if (atomicReference.get() == null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            while (!atomicReference.compareAndSet(null, concurrentHashMap) && atomicReference.get() == null) {
            }
        }
        if (number instanceof Float) {
            atomicReference.get().put(str, Double.valueOf(number.doubleValue()));
        } else {
            atomicReference.get().put(str, number);
        }
    }

    public final boolean g(int i) {
        a f;
        b bVar;
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        e eVar = this.b;
        if (eVar != null && (f = eVar.f()) != null && (bVar = f.b) != this) {
            return bVar.g(i);
        }
        synchronized (this) {
            if (this.l) {
                return false;
            }
            f("_sampling_priority_v1", Integer.valueOf(i));
            return true;
        }
    }

    public final void h(String str) {
        if (this.o.containsKey(str)) {
            this.h = this.o.get(str);
        } else {
            this.h = str;
        }
    }

    public final synchronized void i(Object obj, String str) {
        if (obj != null) {
            if (!(obj instanceof String) || !((String) obj).isEmpty()) {
                List<com.amazon.aps.iva.vr.a> list = (List) this.a.k.get(str);
                boolean z = true;
                if (list != null) {
                    for (com.amazon.aps.iva.vr.a aVar : list) {
                        try {
                            z &= aVar.a(this, str, obj);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (z) {
                    this.g.put(str, obj);
                }
                return;
            }
        }
        this.g.remove(str);
    }

    public final String toString() {
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder("DDSpan [ t_id=");
        sb.append(this.d);
        sb.append(", s_id=");
        sb.append(this.e);
        sb.append(", p_id=");
        sb.append(this.f);
        sb.append("] trace=");
        sb.append(this.h);
        sb.append("/");
        sb.append(this.j);
        sb.append("/");
        if (this.i != null && !this.i.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = this.i;
        } else {
            str = this.j;
        }
        sb.append(str);
        sb.append(" metrics=");
        sb.append(new TreeMap(c()));
        if (this.k) {
            sb.append(" *errored*");
        }
        sb.append(" tags=");
        sb.append(new TreeMap(this.g));
        return sb.toString();
    }
}
