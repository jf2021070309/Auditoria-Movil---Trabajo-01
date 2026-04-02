package e.d.d.w.c1;

import com.google.android.gms.internal.firebase_messaging.zzq;
/* loaded from: classes2.dex */
public final class a {
    public static final /* synthetic */ int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final long f7639b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7640c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7641d;

    /* renamed from: e  reason: collision with root package name */
    public final c f7642e;

    /* renamed from: f  reason: collision with root package name */
    public final d f7643f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7644g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7645h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7646i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7647j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7648k;

    /* renamed from: l  reason: collision with root package name */
    public final long f7649l;

    /* renamed from: m  reason: collision with root package name */
    public final b f7650m;

    /* renamed from: n  reason: collision with root package name */
    public final String f7651n;
    public final long o;
    public final String p;

    /* renamed from: e.d.d.w.c1.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0167a {
        public long a = 0;

        /* renamed from: b  reason: collision with root package name */
        public String f7652b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f7653c = "";

        /* renamed from: d  reason: collision with root package name */
        public c f7654d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        public d f7655e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        public String f7656f = "";

        /* renamed from: g  reason: collision with root package name */
        public String f7657g = "";

        /* renamed from: h  reason: collision with root package name */
        public int f7658h = 0;

        /* renamed from: i  reason: collision with root package name */
        public String f7659i = "";

        /* renamed from: j  reason: collision with root package name */
        public b f7660j = b.UNKNOWN_EVENT;

        /* renamed from: k  reason: collision with root package name */
        public String f7661k = "";

        /* renamed from: l  reason: collision with root package name */
        public String f7662l = "";

        public a a() {
            return new a(this.a, this.f7652b, this.f7653c, this.f7654d, this.f7655e, this.f7656f, this.f7657g, 0, this.f7658h, this.f7659i, 0L, this.f7660j, this.f7661k, 0L, this.f7662l);
        }
    }

    /* loaded from: classes2.dex */
    public enum b implements zzq {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        b(int i2) {
            this.number_ = i2;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum c implements zzq {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        c(int i2) {
            this.number_ = i2;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum d implements zzq {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        d(int i2) {
            this.number_ = i2;
        }

        @Override // com.google.android.gms.internal.firebase_messaging.zzq
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new C0167a().a();
    }

    public a(long j2, String str, String str2, c cVar, d dVar, String str3, String str4, int i2, int i3, String str5, long j3, b bVar, String str6, long j4, String str7) {
        this.f7639b = j2;
        this.f7640c = str;
        this.f7641d = str2;
        this.f7642e = cVar;
        this.f7643f = dVar;
        this.f7644g = str3;
        this.f7645h = str4;
        this.f7646i = i2;
        this.f7647j = i3;
        this.f7648k = str5;
        this.f7649l = j3;
        this.f7650m = bVar;
        this.f7651n = str6;
        this.o = j4;
        this.p = str7;
    }
}
