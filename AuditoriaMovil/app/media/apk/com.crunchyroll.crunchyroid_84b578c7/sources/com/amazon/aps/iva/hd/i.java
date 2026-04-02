package com.amazon.aps.iva.hd;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: LruCache.java */
/* loaded from: classes.dex */
public class i<T, Y> {
    public final LinkedHashMap a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;

    /* compiled from: LruCache.java */
    /* loaded from: classes.dex */
    public static final class a<Y> {
        public final Y a;
        public final int b;

        public a(Y y, int i) {
            this.a = y;
            this.b = i;
        }
    }

    public i(long j) {
        this.b = j;
    }

    public final synchronized Y a(T t) {
        Y y;
        a aVar = (a) this.a.get(t);
        if (aVar != null) {
            y = aVar.a;
        } else {
            y = null;
        }
        return y;
    }

    public int b(Y y) {
        return 1;
    }

    public final synchronized Y d(T t, Y y) {
        a aVar;
        int b = b(y);
        long j = b;
        Y y2 = null;
        if (j >= this.b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.c += j;
        }
        LinkedHashMap linkedHashMap = this.a;
        if (y == null) {
            aVar = null;
        } else {
            aVar = new a(y, b);
        }
        a aVar2 = (a) linkedHashMap.put(t, aVar);
        if (aVar2 != null) {
            this.c -= aVar2.b;
            if (!aVar2.a.equals(y)) {
                c(t, aVar2.a);
            }
        }
        e(this.b);
        if (aVar2 != null) {
            y2 = aVar2.a;
        }
        return y2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void e(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.c -= aVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, aVar.a);
        }
    }

    public void c(T t, Y y) {
    }
}
