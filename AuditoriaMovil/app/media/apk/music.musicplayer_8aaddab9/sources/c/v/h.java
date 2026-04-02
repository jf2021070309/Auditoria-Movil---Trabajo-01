package c.v;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class h implements c.x.a.e, c.x.a.d {
    public static final TreeMap<Integer, h> a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    public volatile String f2788b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f2789c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f2790d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f2791e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f2792f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2793g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2794h;

    /* renamed from: i  reason: collision with root package name */
    public int f2795i;

    public h(int i2) {
        this.f2794h = i2;
        int i3 = i2 + 1;
        this.f2793g = new int[i3];
        this.f2789c = new long[i3];
        this.f2790d = new double[i3];
        this.f2791e = new String[i3];
        this.f2792f = new byte[i3];
    }

    public static h h(String str, int i2) {
        TreeMap<Integer, h> treeMap = a;
        synchronized (treeMap) {
            Map.Entry<Integer, h> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry == null) {
                h hVar = new h(i2);
                hVar.f2788b = str;
                hVar.f2795i = i2;
                return hVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            h value = ceilingEntry.getValue();
            value.f2788b = str;
            value.f2795i = i2;
            return value;
        }
    }

    @Override // c.x.a.e
    public String a() {
        return this.f2788b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c.x.a.e
    public void f(c.x.a.d dVar) {
        for (int i2 = 1; i2 <= this.f2795i; i2++) {
            int i3 = this.f2793g[i2];
            if (i3 == 1) {
                ((c.x.a.f.e) dVar).a.bindNull(i2);
            } else if (i3 == 2) {
                ((c.x.a.f.e) dVar).a.bindLong(i2, this.f2789c[i2]);
            } else if (i3 == 3) {
                ((c.x.a.f.e) dVar).a.bindDouble(i2, this.f2790d[i2]);
            } else if (i3 == 4) {
                ((c.x.a.f.e) dVar).a.bindString(i2, this.f2791e[i2]);
            } else if (i3 == 5) {
                ((c.x.a.f.e) dVar).a.bindBlob(i2, this.f2792f[i2]);
            }
        }
    }

    public void i(int i2, long j2) {
        this.f2793g[i2] = 2;
        this.f2789c[i2] = j2;
    }

    public void m(int i2) {
        this.f2793g[i2] = 1;
    }

    public void r(int i2, String str) {
        this.f2793g[i2] = 4;
        this.f2791e[i2] = str;
    }

    public void release() {
        TreeMap<Integer, h> treeMap = a;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f2794h), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }
}
