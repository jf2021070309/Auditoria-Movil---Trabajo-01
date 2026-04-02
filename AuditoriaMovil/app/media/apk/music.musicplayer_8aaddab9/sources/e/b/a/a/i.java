package e.b.a.a;

import java.util.Set;
/* loaded from: classes.dex */
public class i {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5333b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5334c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f5335d;

    /* renamed from: e  reason: collision with root package name */
    public final transient h f5336e;

    /* renamed from: f  reason: collision with root package name */
    public int f5337f;

    /* renamed from: g  reason: collision with root package name */
    public q f5338g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5339h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f5340i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f5341j;

    /* renamed from: k  reason: collision with root package name */
    public long f5342k;

    /* renamed from: l  reason: collision with root package name */
    public long f5343l;

    /* renamed from: m  reason: collision with root package name */
    public long f5344m;

    /* renamed from: n  reason: collision with root package name */
    public Long f5345n;
    public int o;
    public int p;
    public long q;
    public Throwable r;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public long f5346b;

        /* renamed from: e  reason: collision with root package name */
        public String f5349e;

        /* renamed from: f  reason: collision with root package name */
        public String f5350f;

        /* renamed from: g  reason: collision with root package name */
        public Long f5351g;

        /* renamed from: h  reason: collision with root package name */
        public h f5352h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5353i;

        /* renamed from: j  reason: collision with root package name */
        public int f5354j;

        /* renamed from: l  reason: collision with root package name */
        public int f5356l;

        /* renamed from: n  reason: collision with root package name */
        public long f5358n;
        public Set<String> o;
        public boolean a = false;

        /* renamed from: c  reason: collision with root package name */
        public long f5347c = Long.MAX_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public long f5348d = Long.MIN_VALUE;

        /* renamed from: k  reason: collision with root package name */
        public int f5355k = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f5357m = 0;

        public i a() {
            i iVar;
            h hVar = this.f5352h;
            if (hVar != null) {
                int i2 = this.f5355k & 2047;
                if (i2 != 2047) {
                    StringBuilder y = e.a.d.a.a.y("must provide all required fields. your result:");
                    y.append(Long.toBinaryString(i2));
                    throw new IllegalArgumentException(y.toString());
                }
                String str = this.f5350f;
                boolean z = this.f5353i;
                int i3 = this.f5354j;
                String str2 = this.f5349e;
                int i4 = this.f5357m;
                long j2 = this.f5346b;
                long j3 = this.f5348d;
                long j4 = this.f5358n;
                Set<String> set = this.o;
                i iVar2 = new i(str, z, i3, str2, i4, hVar, j2, j3, j4, set, this.f5356l, this.f5347c, this.a, null);
                Long l2 = this.f5351g;
                if (l2 != null) {
                    iVar = iVar2;
                    iVar.b(l2.longValue());
                } else {
                    iVar = iVar2;
                }
                h hVar2 = this.f5352h;
                if (hVar2.f5332k) {
                    throw new IllegalStateException("Cannot set a Job from JobHolder after it is sealed.");
                }
                hVar2.f5329h = str;
                hVar2.f5328g = str2;
                hVar2.f5323b = iVar.o;
                hVar2.f5330i = z;
                hVar2.f5331j = set;
                hVar2.f5324c = iVar.f5337f;
                hVar2.f5332k = true;
                return iVar;
            }
            throw new IllegalArgumentException("must provide a job");
        }
    }

    public i(String str, boolean z, int i2, String str2, int i3, h hVar, long j2, long j3, long j4, Set set, int i4, long j5, boolean z2, a aVar) {
        this.f5333b = str;
        this.f5334c = z;
        this.o = i2;
        this.a = str2;
        this.p = i3;
        this.f5342k = j2;
        this.f5344m = j3;
        this.f5336e = hVar;
        this.q = j4;
        this.f5337f = i4;
        this.f5335d = set;
        this.f5343l = j5;
        this.f5339h = z2;
    }

    public void a() {
        this.f5340i = true;
        this.f5336e.a = true;
    }

    public void b(long j2) {
        this.f5345n = Long.valueOf(j2);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f5333b.equals(((i) obj).f5333b);
        }
        return false;
    }

    public int hashCode() {
        return this.f5333b.hashCode();
    }
}
