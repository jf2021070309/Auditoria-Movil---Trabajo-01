package e.c.a.m.u.c;
/* loaded from: classes.dex */
public abstract class l {
    public static final l a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final l f5862b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final l f5863c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final l f5864d;

    /* renamed from: e  reason: collision with root package name */
    public static final l f5865e;

    /* renamed from: f  reason: collision with root package name */
    public static final l f5866f;

    /* renamed from: g  reason: collision with root package name */
    public static final e.c.a.m.l<l> f5867g;

    /* renamed from: h  reason: collision with root package name */
    public static final boolean f5868h;

    /* loaded from: classes.dex */
    public static class a extends l {
        @Override // e.c.a.m.u.c.l
        public f a(int i2, int i3, int i4, int i5) {
            return f.MEMORY;
        }

        @Override // e.c.a.m.u.c.l
        public float b(int i2, int i3, int i4, int i5) {
            int ceil = (int) Math.ceil(Math.max(i3 / i5, i2 / i4));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return 1.0f / (max << (max >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l {
        @Override // e.c.a.m.u.c.l
        public f a(int i2, int i3, int i4, int i5) {
            if (b(i2, i3, i4, i5) != 1.0f && !l.f5868h) {
                return f.MEMORY;
            }
            return f.QUALITY;
        }

        @Override // e.c.a.m.u.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.min(1.0f, l.f5862b.b(i2, i3, i4, i5));
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l {
        @Override // e.c.a.m.u.c.l
        public f a(int i2, int i3, int i4, int i5) {
            return f.QUALITY;
        }

        @Override // e.c.a.m.u.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return Math.max(i4 / i2, i5 / i3);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l {
        @Override // e.c.a.m.u.c.l
        public f a(int i2, int i3, int i4, int i5) {
            return l.f5868h ? f.QUALITY : f.MEMORY;
        }

        @Override // e.c.a.m.u.c.l
        public float b(int i2, int i3, int i4, int i5) {
            if (l.f5868h) {
                return Math.min(i4 / i2, i5 / i3);
            }
            int max = Math.max(i3 / i5, i2 / i4);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends l {
        @Override // e.c.a.m.u.c.l
        public f a(int i2, int i3, int i4, int i5) {
            return f.QUALITY;
        }

        @Override // e.c.a.m.u.c.l
        public float b(int i2, int i3, int i4, int i5) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        MEMORY,
        QUALITY
    }

    static {
        c cVar = new c();
        f5864d = cVar;
        f5865e = new e();
        f5866f = cVar;
        f5867g = e.c.a.m.l.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", cVar);
        f5868h = true;
    }

    public abstract f a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
