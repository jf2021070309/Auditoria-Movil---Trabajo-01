package e.c.a.s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class g<T, Y> {
    public final Map<T, Y> a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f6027b;

    /* renamed from: c  reason: collision with root package name */
    public long f6028c;

    public g(long j2) {
        this.f6027b = j2;
    }

    public synchronized Y a(T t) {
        return this.a.get(t);
    }

    public int b(Y y) {
        return 1;
    }

    public void c(T t, Y y) {
    }

    public synchronized Y d(T t, Y y) {
        long b2 = b(y);
        if (b2 >= this.f6027b) {
            c(t, y);
            return null;
        }
        if (y != null) {
            this.f6028c += b2;
        }
        Y put = this.a.put(t, y);
        if (put != null) {
            this.f6028c -= b(put);
            if (!put.equals(y)) {
                c(t, put);
            }
        }
        e(this.f6027b);
        return put;
    }

    public synchronized void e(long j2) {
        while (this.f6028c > j2) {
            Iterator<Map.Entry<T, Y>> it = this.a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f6028c -= b(value);
            T key = next.getKey();
            it.remove();
            c(key, value);
        }
    }
}
