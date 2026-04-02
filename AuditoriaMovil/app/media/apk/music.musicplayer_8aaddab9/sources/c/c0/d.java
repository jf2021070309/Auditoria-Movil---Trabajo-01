package c.c0;

import android.os.Build;
/* loaded from: classes.dex */
public final class d {
    public static final d a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    public s f1324b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1325c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1326d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1327e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1328f;

    /* renamed from: g  reason: collision with root package name */
    public long f1329g;

    /* renamed from: h  reason: collision with root package name */
    public long f1330h;

    /* renamed from: i  reason: collision with root package name */
    public e f1331i;

    /* loaded from: classes.dex */
    public static final class a {
        public s a = s.NOT_REQUIRED;

        /* renamed from: b  reason: collision with root package name */
        public long f1332b = -1;

        /* renamed from: c  reason: collision with root package name */
        public long f1333c = -1;

        /* renamed from: d  reason: collision with root package name */
        public e f1334d = new e();

        public d a() {
            return new d(this);
        }
    }

    public d() {
        this.f1324b = s.NOT_REQUIRED;
        this.f1329g = -1L;
        this.f1330h = -1L;
        this.f1331i = new e();
    }

    public d(a aVar) {
        this.f1324b = s.NOT_REQUIRED;
        this.f1329g = -1L;
        this.f1330h = -1L;
        this.f1331i = new e();
        this.f1325c = false;
        int i2 = Build.VERSION.SDK_INT;
        this.f1326d = false;
        this.f1324b = aVar.a;
        this.f1327e = false;
        this.f1328f = false;
        if (i2 >= 24) {
            this.f1331i = aVar.f1334d;
            this.f1329g = aVar.f1332b;
            this.f1330h = aVar.f1333c;
        }
    }

    public d(d dVar) {
        this.f1324b = s.NOT_REQUIRED;
        this.f1329g = -1L;
        this.f1330h = -1L;
        this.f1331i = new e();
        this.f1325c = dVar.f1325c;
        this.f1326d = dVar.f1326d;
        this.f1324b = dVar.f1324b;
        this.f1327e = dVar.f1327e;
        this.f1328f = dVar.f1328f;
        this.f1331i = dVar.f1331i;
    }

    public boolean a() {
        return this.f1331i.a() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1325c == dVar.f1325c && this.f1326d == dVar.f1326d && this.f1327e == dVar.f1327e && this.f1328f == dVar.f1328f && this.f1329g == dVar.f1329g && this.f1330h == dVar.f1330h && this.f1324b == dVar.f1324b) {
            return this.f1331i.equals(dVar.f1331i);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f1329g;
        long j3 = this.f1330h;
        return this.f1331i.hashCode() + (((((((((((((this.f1324b.hashCode() * 31) + (this.f1325c ? 1 : 0)) * 31) + (this.f1326d ? 1 : 0)) * 31) + (this.f1327e ? 1 : 0)) * 31) + (this.f1328f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }
}
