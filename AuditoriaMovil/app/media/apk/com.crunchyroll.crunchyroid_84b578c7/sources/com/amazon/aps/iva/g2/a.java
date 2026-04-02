package com.amazon.aps.iva.g2;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.h0;
import com.amazon.aps.iva.yb0.j;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: LruCache.kt */
/* loaded from: classes.dex */
public final class a<K, V> {
    public int d;
    public int f;
    public int g;
    public final com.amazon.aps.iva.u0.b a = new com.amazon.aps.iva.u0.b(1);
    public final int e = 16;
    public final HashMap<K, V> b = new HashMap<>(0, 0.75f);
    public final LinkedHashSet<K> c = new LinkedHashSet<>();

    public final V a(K k) {
        synchronized (this.a) {
            V v = this.b.get(k);
            if (v != null) {
                this.c.remove(k);
                this.c.add(k);
                this.f++;
                return v;
            }
            this.g++;
            return null;
        }
    }

    public final V b(K k, V v) {
        V put;
        Object obj;
        V v2;
        if (k != null && v != null) {
            synchronized (this.a) {
                this.d = d() + 1;
                put = this.b.put(k, v);
                if (put != null) {
                    this.d = d() - 1;
                }
                if (this.c.contains(k)) {
                    this.c.remove(k);
                }
                this.c.add(k);
            }
            int i = this.e;
            while (true) {
                synchronized (this.a) {
                    if (d() < 0 || ((this.b.isEmpty() && d() != 0) || this.b.isEmpty() != this.c.isEmpty())) {
                        break;
                    }
                    if (d() > i && !this.b.isEmpty()) {
                        obj = x.s0(this.c);
                        v2 = this.b.get(obj);
                        if (v2 != null) {
                            HashMap<K, V> hashMap = this.b;
                            h0.c(hashMap);
                            hashMap.remove(obj);
                            LinkedHashSet<K> linkedHashSet = this.c;
                            h0.a(linkedHashSet);
                            linkedHashSet.remove(obj);
                            int d = d();
                            j.c(obj);
                            this.d = d - 1;
                        } else {
                            throw new IllegalStateException("inconsistent state");
                        }
                    } else {
                        obj = null;
                        v2 = null;
                    }
                    q qVar = q.a;
                }
                if (obj == null && v2 == null) {
                    return put;
                }
                j.c(obj);
                j.c(v2);
            }
            throw new IllegalStateException("map/keySet size inconsistency");
        }
        throw null;
    }

    public final V c(K k) {
        V remove;
        k.getClass();
        synchronized (this.a) {
            remove = this.b.remove(k);
            this.c.remove(k);
            if (remove != null) {
                this.d = d() - 1;
            }
            q qVar = q.a;
        }
        return remove;
    }

    public final int d() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    public final String toString() {
        int i;
        String str;
        synchronized (this.a) {
            int i2 = this.f;
            int i3 = this.g + i2;
            if (i3 != 0) {
                i = (i2 * 100) / i3;
            } else {
                i = 0;
            }
            str = "LruCache[maxSize=" + this.e + ",hits=" + this.f + ",misses=" + this.g + ",hitRate=" + i + "%]";
        }
        return str;
    }
}
