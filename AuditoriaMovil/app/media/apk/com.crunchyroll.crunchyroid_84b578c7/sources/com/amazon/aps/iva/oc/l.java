package com.amazon.aps.iva.oc;

import android.graphics.Bitmap;
import com.amazon.aps.iva.ga.m;
import com.amazon.aps.iva.hd.l;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: SizeConfigStrategy.java */
/* loaded from: classes.dex */
public final class l implements j {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;
    public final c a = new c();
    public final f<b, Bitmap> b = new f<>();
    public final HashMap c = new HashMap();

    /* compiled from: SizeConfigStrategy.java */
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

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static final class b implements k {
        public final c a;
        public int b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // com.amazon.aps.iva.oc.k
        public final void a() {
            this.a.g(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || !com.amazon.aps.iva.hd.l.b(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i;
            int i2 = this.b * 31;
            Bitmap.Config config = this.c;
            if (config != null) {
                i = config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public final String toString() {
            return l.c(this.b, this.c);
        }
    }

    /* compiled from: SizeConfigStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends m {
        @Override // com.amazon.aps.iva.ga.m
        public final k b() {
            return new b(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num2 = d2.get(num);
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

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        int i3;
        Bitmap.Config[] configArr;
        char[] cArr = com.amazon.aps.iva.hd.l.a;
        int i4 = i * i2;
        if (config == null) {
            config2 = Bitmap.Config.ARGB_8888;
        } else {
            config2 = config;
        }
        int i5 = l.a.a[config2.ordinal()];
        if (i5 != 1) {
            if (i5 != 2 && i5 != 3) {
                if (i5 != 4) {
                    i3 = 4;
                } else {
                    i3 = 8;
                }
            } else {
                i3 = 2;
            }
        } else {
            i3 = 1;
        }
        int i6 = i3 * i4;
        c cVar = this.a;
        b bVar = (b) cVar.f();
        bVar.b = i6;
        bVar.c = config;
        int i7 = 0;
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i8 = a.a[config.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        configArr = i8 != 4 ? new Bitmap.Config[]{config} : h;
                    } else {
                        configArr = g;
                    }
                } else {
                    configArr = f;
                }
            } else {
                configArr = d;
            }
        }
        int length = configArr.length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            Bitmap.Config config3 = configArr[i7];
            Integer ceilingKey = d(config3).ceilingKey(Integer.valueOf(i6));
            if (ceilingKey != null && ceilingKey.intValue() <= i6 * 8) {
                if (ceilingKey.intValue() != i6 || (config3 != null ? !config3.equals(config) : config != null)) {
                    cVar.g(bVar);
                    int intValue = ceilingKey.intValue();
                    bVar = (b) cVar.f();
                    bVar.b = intValue;
                    bVar.c = config3;
                }
            } else {
                i7++;
            }
        }
        Bitmap a2 = this.b.a(bVar);
        if (a2 != null) {
            a(Integer.valueOf(bVar.b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    public final NavigableMap<Integer, Integer> d(Bitmap.Config config) {
        HashMap hashMap = this.c;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final String e(Bitmap bitmap) {
        return c(com.amazon.aps.iva.hd.l.c(bitmap), bitmap.getConfig());
    }

    public final void f(Bitmap bitmap) {
        int c2 = com.amazon.aps.iva.hd.l.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        b bVar = (b) this.a.f();
        bVar.b = c2;
        bVar.c = config;
        this.b.b(bVar, bitmap);
        NavigableMap<Integer, Integer> d2 = d(bitmap.getConfig());
        Integer num = d2.get(Integer.valueOf(bVar.b));
        Integer valueOf = Integer.valueOf(bVar.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        d2.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder b2 = defpackage.c.b("SizeConfigStrategy{groupedMap=");
        b2.append(this.b);
        b2.append(", sortedSizes=(");
        HashMap hashMap = this.c;
        for (Map.Entry entry : hashMap.entrySet()) {
            b2.append(entry.getKey());
            b2.append('[');
            b2.append(entry.getValue());
            b2.append("], ");
        }
        if (!hashMap.isEmpty()) {
            b2.replace(b2.length() - 2, b2.length(), "");
        }
        b2.append(")}");
        return b2.toString();
    }
}
