package com.amazon.aps.iva.uc;
/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class m {
    public static final e a;
    public static final c b;
    public static final d c;
    public static final f d;
    public static final d e;
    public static final com.amazon.aps.iva.kc.g<m> f;
    public static final boolean g;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class a extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class b extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / (max << i5);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            if (b(i, i2, i3, i4) == 1.0f) {
                return g.QUALITY;
            }
            return m.a.a(i, i2, i3, i4);
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, m.a.b(i, i2, i3, i4));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class d extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class e extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            if (m.g) {
                return g.QUALITY;
            }
            return g.MEMORY;
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            if (m.g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class f extends m {
        @Override // com.amazon.aps.iva.uc.m
        public final g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.amazon.aps.iva.uc.m
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        new a();
        new b();
        a = new e();
        b = new c();
        d dVar = new d();
        c = dVar;
        d = new f();
        e = dVar;
        f = com.amazon.aps.iva.kc.g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
