package bo.app;

import com.amazon.aps.iva.ne0.u;
import com.braze.support.BrazeLogger;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okhttp3.internal.http2.Http2;
/* loaded from: classes.dex */
public final class y4 {
    public static final a s = new a(null);
    private long a;
    private Set b;
    private Set c;
    private Set d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required content cards fields. Using defaults.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting Content Card rate limit fields. Using defaults.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required ephemeral events fields. Using defaults.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required feature flag fields. Disabling feature flags.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required geofence fields. Using defaults.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error getting required push max fields. Disabling push max.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Boolean a(int i) {
            return Boolean.valueOf(this.b.f(i) instanceof String);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.if0.a aVar) {
            super(1);
            this.b = aVar;
        }

        public final Object a(int i) {
            return (String) this.b.get(i);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public y4(long j, Set set, Set set2, Set set3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i5, boolean z6, int i6, int i7, boolean z7) {
        this.a = j;
        this.b = set;
        this.c = set2;
        this.d = set3;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = j2;
        this.l = z4;
        this.m = z5;
        this.n = i5;
        this.o = z6;
        this.p = i6;
        this.q = i7;
        this.r = z7;
    }

    public final void a(long j) {
        this.a = j;
    }

    public final Set b() {
        return this.b;
    }

    public final Set c() {
        return this.d;
    }

    public final long d() {
        return this.a;
    }

    public final void e(int i2) {
        this.f = i2;
    }

    public final void f(int i2) {
        this.e = i2;
    }

    public final boolean g() {
        return this.o;
    }

    public final boolean h() {
        return this.l;
    }

    public final boolean i() {
        return this.m;
    }

    public final int j() {
        return this.n;
    }

    public final boolean k() {
        return this.i;
    }

    public final boolean l() {
        return this.h;
    }

    public final int m() {
        return this.g;
    }

    public final long n() {
        return this.k;
    }

    public final int o() {
        return this.f;
    }

    public final int p() {
        return this.e;
    }

    public final boolean q() {
        return this.r;
    }

    public final boolean r() {
        return this.j;
    }

    public final Set a() {
        return this.c;
    }

    public final void b(Set set) {
        this.b = set;
    }

    public final void c(Set set) {
        this.d = set;
    }

    public final void d(int i2) {
        this.g = i2;
    }

    public final void e(boolean z) {
        this.i = z;
    }

    public final void f(boolean z) {
        this.h = z;
    }

    public final void g(boolean z) {
        this.r = z;
    }

    public final void a(Set set) {
        this.c = set;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final void c(boolean z) {
        this.l = z;
    }

    public final void d(boolean z) {
        this.m = z;
    }

    public final int e() {
        return this.q;
    }

    public final int f() {
        return this.p;
    }

    private final void d(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("feature_flags");
        if (optJSONObject != null) {
            try {
                this.m = optJSONObject.optBoolean("enabled");
                this.n = optJSONObject.getInt("refresh_rate_limit");
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
                this.m = false;
            }
        }
    }

    private final void e(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("geofences");
        if (optJSONObject != null) {
            try {
                this.e = optJSONObject.getInt("min_time_since_last_request");
                this.f = optJSONObject.getInt("min_time_since_last_report");
                this.i = optJSONObject.getBoolean("enabled");
                this.h = true;
                this.g = optJSONObject.optInt("max_num_to_register", 20);
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f.b);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                this.i = false;
                this.h = false;
            }
        }
    }

    private final void f(com.amazon.aps.iva.if0.c cVar) {
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("push_max");
        if (optJSONObject != null) {
            try {
                this.r = optJSONObject.optBoolean("enabled");
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
                this.r = false;
            }
        }
    }

    public final void a(boolean z) {
        this.o = z;
    }

    public final void b(long j) {
        this.k = j;
    }

    public final void c(int i2) {
        this.n = i2;
    }

    private final void c(com.amazon.aps.iva.if0.c cVar) {
        boolean z;
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("ephemeral_events");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, d.b);
                z = false;
            }
            this.l = z;
        }
    }

    public final void a(int i2) {
        this.q = i2;
    }

    public final void b(int i2) {
        this.p = i2;
    }

    private final void a(com.amazon.aps.iva.if0.c cVar) {
        this.b = a(cVar, "events_blacklist");
        this.c = a(cVar, "attributes_blacklist");
        this.d = a(cVar, "purchases_blacklist");
    }

    private final void b(com.amazon.aps.iva.if0.c cVar) {
        boolean z;
        com.amazon.aps.iva.if0.c optJSONObject = cVar.optJSONObject("content_cards");
        if (optJSONObject != null) {
            try {
                z = optJSONObject.getBoolean("enabled");
            } catch (com.amazon.aps.iva.if0.b e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
                z = false;
            }
            this.j = z;
            com.amazon.aps.iva.if0.c optJSONObject2 = optJSONObject.optJSONObject("rate_limit");
            if (optJSONObject2 != null) {
                try {
                    this.o = optJSONObject2.getBoolean("enabled");
                    this.p = optJSONObject2.getInt("refill_rate");
                    this.q = optJSONObject2.getInt("capacity");
                } catch (com.amazon.aps.iva.if0.b e3) {
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, c.b);
                    this.o = false;
                    this.p = -1;
                    this.q = -1;
                }
            }
        }
    }

    private final Set a(com.amazon.aps.iva.if0.c cVar, String str) {
        Iterator aVar;
        HashSet hashSet = new HashSet();
        if (cVar.has(str)) {
            com.amazon.aps.iva.if0.a optJSONArray = cVar.optJSONArray(str);
            if (optJSONArray == null) {
                aVar = com.amazon.aps.iva.lb0.y.b;
            } else {
                aVar = new u.a(com.amazon.aps.iva.ne0.s.b0(com.amazon.aps.iva.ne0.s.V(com.amazon.aps.iva.lb0.x.k0(com.amazon.aps.iva.aq.j.T(0, optJSONArray.e())), new h(optJSONArray)), new i(optJSONArray)));
            }
            while (aVar.hasNext()) {
                hashSet.add((String) aVar.next());
            }
        }
        return hashSet;
    }

    public /* synthetic */ y4(long j, Set set, Set set2, Set set3, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i5, boolean z6, int i6, int i7, boolean z7, int i8, com.amazon.aps.iva.yb0.e eVar) {
        this((i8 & 1) != 0 ? 0L : j, (i8 & 2) != 0 ? null : set, (i8 & 4) != 0 ? null : set2, (i8 & 8) == 0 ? set3 : null, (i8 & 16) != 0 ? -1 : i2, (i8 & 32) != 0 ? -1 : i3, (i8 & 64) != 0 ? -1 : i4, (i8 & 128) != 0 ? false : z, (i8 & 256) != 0 ? false : z2, (i8 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z3, (i8 & 1024) != 0 ? -1L : j2, (i8 & 2048) != 0 ? false : z4, (i8 & 4096) != 0 ? false : z5, (i8 & 8192) != 0 ? -1 : i5, (i8 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z6, (i8 & 32768) != 0 ? -1 : i6, (i8 & Cast.MAX_MESSAGE_LENGTH) != 0 ? -1 : i7, (i8 & 131072) != 0 ? false : z7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y4(com.amazon.aps.iva.if0.c cVar) {
        this(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 0, false, 0, 0, false, 262143, null);
        com.amazon.aps.iva.yb0.j.f(cVar, "jsonObject");
        this.a = cVar.optLong("time", 0L);
        this.k = cVar.optLong("messaging_session_timeout", -1L);
        a(cVar);
        b(cVar);
        e(cVar);
        c(cVar);
        d(cVar);
        f(cVar);
    }
}
