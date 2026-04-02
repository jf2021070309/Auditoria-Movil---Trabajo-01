package e.c.a.m.s.c0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class m implements k {
    public static final Bitmap.Config[] a;

    /* renamed from: b  reason: collision with root package name */
    public static final Bitmap.Config[] f5619b;

    /* renamed from: c  reason: collision with root package name */
    public static final Bitmap.Config[] f5620c;

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f5621d;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f5622e;

    /* renamed from: f  reason: collision with root package name */
    public final c f5623f = new c();

    /* renamed from: g  reason: collision with root package name */
    public final g<b, Bitmap> f5624g = new g<>();

    /* renamed from: h  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f5625h = new HashMap();

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements l {
        public final c a;

        /* renamed from: b  reason: collision with root package name */
        public int f5626b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f5627c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // e.c.a.m.s.c0.l
        public void a() {
            this.a.c(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f5626b == bVar.f5626b && e.c.a.s.j.b(this.f5627c, bVar.f5627c);
            }
            return false;
        }

        public int hashCode() {
            int i2 = this.f5626b * 31;
            Bitmap.Config config = this.f5627c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.c(this.f5626b, this.f5627c);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e.c.a.m.s.c0.c<b> {
        @Override // e.c.a.m.s.c0.c
        public b a() {
            return new b(this);
        }

        public b d(int i2, Bitmap.Config config) {
            b b2 = b();
            b2.f5626b = i2;
            b2.f5627c = config;
            return b2;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        a = configArr;
        f5619b = configArr;
        f5620c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f5621d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f5622e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int c2 = e.c.a.s.j.c(i2, i3, config);
        b b2 = this.f5623f.b();
        b2.f5626b = c2;
        b2.f5627c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i5 = a.a[config.ordinal()];
            configArr = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? new Bitmap.Config[]{config} : f5622e : f5621d : f5620c : a;
        } else {
            configArr = f5619b;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = d(config2).ceilingKey(Integer.valueOf(c2));
            if (ceilingKey == null || ceilingKey.intValue() > c2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != c2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.f5623f.c(b2);
                b2 = this.f5623f.d(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a2 = this.f5624g.a(b2);
        if (a2 != null) {
            a(Integer.valueOf(b2.f5626b), a2);
            a2.reconfigure(i2, i3, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f5625h.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f5625h.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public String e(Bitmap bitmap) {
        return c(e.c.a.s.j.d(bitmap), bitmap.getConfig());
    }

    public void f(Bitmap bitmap) {
        b d2 = this.f5623f.d(e.c.a.s.j.d(bitmap), bitmap.getConfig());
        this.f5624g.b(d2, bitmap);
        NavigableMap<Integer, Integer> d3 = d(bitmap.getConfig());
        Integer num = (Integer) d3.get(Integer.valueOf(d2.f5626b));
        d3.put(Integer.valueOf(d2.f5626b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public String toString() {
        StringBuilder y = e.a.d.a.a.y("SizeConfigStrategy{groupedMap=");
        y.append(this.f5624g);
        y.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f5625h.entrySet()) {
            y.append(entry.getKey());
            y.append('[');
            y.append(entry.getValue());
            y.append("], ");
        }
        if (!this.f5625h.isEmpty()) {
            y.replace(y.length() - 2, y.length(), "");
        }
        y.append(")}");
        return y.toString();
    }
}
