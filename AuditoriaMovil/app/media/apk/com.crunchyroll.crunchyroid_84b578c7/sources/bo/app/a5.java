package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class a5 {
    public static final b e = new b(null);
    private final SharedPreferences a;
    private final ReentrantLock b;
    private final com.amazon.aps.iva.ze0.c c;
    private y4 d;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Detected SDK update from '");
            sb.append(this.b);
            sb.append("' -> '");
            return defpackage.b.c(sb, this.c, "'. Clearing config update time.");
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final String a(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "apiKey");
            return "com.braze.storage.server_config.".concat(str);
        }

        private b() {
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
            return "Not allowing server config info unlock. Returning null.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.if0.a aVar) {
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
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l {
        final /* synthetic */ com.amazon.aps.iva.if0.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.if0.a aVar) {
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

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Experienced exception retrieving blocklisted strings from local storage. Returning null.";
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
            return "Attempting to unlock server config info.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Unlocking config info lock.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not persist server config to shared preferences.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ y4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(y4 y4Var) {
            super(0);
            this.b = y4Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Finishing updating server config to " + this.b;
        }
    }

    public a5(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "apiKey");
        SharedPreferences sharedPreferences = context.getSharedPreferences(e.a(str), 0);
        this.a = sharedPreferences;
        this.b = new ReentrantLock();
        this.c = com.amazon.aps.iva.gy.t.d();
        String string = sharedPreferences.getString("last_accessed_sdk_version", "");
        if (!com.amazon.aps.iva.yb0.j.a("27.0.1", string)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new a(string, "27.0.1"), 2, (Object) null);
            sharedPreferences.edit().putLong("config_time", 0L).putString("last_accessed_sdk_version", "27.0.1").apply();
        }
        u();
    }

    private final void u() {
        y4 y4Var = new y4(0L, null, null, null, 0, 0, 0, false, false, false, 0L, false, false, 0, false, 0, 0, false, 262143, null);
        y4Var.a(b());
        y4Var.b(c());
        y4Var.c(d());
        y4Var.a(e());
        y4Var.b(j());
        y4Var.f(l());
        y4Var.e(k());
        y4Var.d(i());
        y4Var.e(r());
        y4Var.f(s());
        y4Var.b(o());
        y4Var.c(p());
        y4Var.d(q());
        y4Var.c(h());
        y4Var.a(n());
        y4Var.a(f());
        y4Var.b(g());
        y4Var.g(t());
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = y4Var;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void a(y4 y4Var) {
        com.amazon.aps.iva.yb0.j.f(y4Var, "serverConfig");
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = y4Var;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            try {
                SharedPreferences.Editor edit = this.a.edit();
                if (y4Var.b() != null) {
                    edit.putString("blacklisted_events", new com.amazon.aps.iva.if0.a((Collection<?>) y4Var.b()).toString());
                }
                if (y4Var.a() != null) {
                    edit.putString("blacklisted_attributes", new com.amazon.aps.iva.if0.a((Collection<?>) y4Var.a()).toString());
                }
                if (y4Var.c() != null) {
                    edit.putString("blacklisted_purchases", new com.amazon.aps.iva.if0.a((Collection<?>) y4Var.c()).toString());
                }
                edit.putLong("config_time", y4Var.d()).putInt("geofences_min_time_since_last_request", y4Var.p()).putInt("geofences_min_time_since_last_report", y4Var.o()).putInt("geofences_max_num_to_register", y4Var.m()).putBoolean("geofences_enabled", y4Var.k()).putBoolean("geofences_enabled_set", y4Var.l()).putLong("messaging_session_timeout", y4Var.n()).putBoolean("ephemeral_events_enabled", y4Var.h()).putBoolean("feature_flags_enabled", y4Var.i()).putInt("feature_flags_refresh_rate_limit", y4Var.j()).putBoolean("content_cards_enabled", y4Var.r()).putBoolean("content_cards_rate_limit_enabled", y4Var.g()).putInt("content_cards_rate_capacity", y4Var.e()).putInt("content_cards_rate_refill_rate", y4Var.f()).putBoolean("push_max_enabled", y4Var.q());
                edit.apply();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, i.b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new j(y4Var), 2, (Object) null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set b() {
        Set a2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var == null || (a2 = y4Var.a()) == null) {
                a2 = a("blacklisted_attributes");
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set c() {
        Set a2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var == null || (a2 = y4Var.b()) == null) {
                a2 = a("blacklisted_events");
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Set d() {
        Set a2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var == null || (a2 = y4Var.c()) == null) {
                a2 = a("blacklisted_purchases");
            }
            return a2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long e() {
        long j2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                j2 = y4Var.d();
            } else {
                j2 = this.a.getLong("config_time", 0L);
            }
            return j2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int f() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.e();
            } else {
                i2 = this.a.getInt("content_cards_rate_capacity", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int g() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.f();
            } else {
                i2 = this.a.getInt("content_cards_rate_refill_rate", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int h() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.j();
            } else {
                i2 = this.a.getInt("feature_flags_refresh_rate_limit", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int i() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.m();
            } else {
                i2 = this.a.getInt("geofences_max_num_to_register", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long j() {
        long j2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                j2 = y4Var.n();
            } else {
                j2 = this.a.getLong("messaging_session_timeout", -1L);
            }
            return j2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int k() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.o();
            } else {
                i2 = this.a.getInt("geofences_min_time_since_last_report", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int l() {
        int i2;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                i2 = y4Var.p();
            } else {
                i2 = this.a.getInt("geofences_min_time_since_last_request", -1);
            }
            return i2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean m() {
        if (e() <= 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.g();
            } else {
                z = this.a.getBoolean("content_cards_rate_limit_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean o() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.r();
            } else {
                z = this.a.getBoolean("content_cards_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean p() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.h();
            } else {
                z = this.a.getBoolean("ephemeral_events_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean q() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.i();
            } else {
                z = this.a.getBoolean("feature_flags_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean r() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.k();
            } else {
                z = this.a.getBoolean("geofences_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean s() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.l();
            } else {
                z = this.a.getBoolean("geofences_enabled_set", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean t() {
        boolean z;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            y4 y4Var = this.d;
            if (y4Var != null) {
                z = y4Var.q();
            } else {
                z = this.a.getBoolean("push_max_enabled", false);
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void v() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, g.b, 2, (Object) null);
        if (this.c.c()) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            this.c.d(null);
        }
    }

    public final com.amazon.aps.iva.kb0.j a() {
        if (!this.c.b(null)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, c.b, 2, (Object) null);
            return null;
        }
        return new com.amazon.aps.iva.kb0.j(Long.valueOf(e()), Boolean.valueOf(m()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:4:0x0010, B:10:0x001c, B:11:0x0045, B:13:0x004b), top: B:18:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Set a(java.lang.String r5) {
        /*
            r4 = this;
            android.content.SharedPreferences r0 = r4.a     // Catch: java.lang.Exception -> L5b
            java.lang.String r1 = ""
            java.lang.String r5 = r0.getString(r5, r1)     // Catch: java.lang.Exception -> L5b
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Exception -> L5b
            r0.<init>()     // Catch: java.lang.Exception -> L5b
            r1 = 0
            if (r5 == 0) goto L19
            boolean r2 = com.amazon.aps.iva.oe0.m.b0(r5)     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L17
            goto L19
        L17:
            r2 = r1
            goto L1a
        L19:
            r2 = 1
        L1a:
            if (r2 != 0) goto L6a
            com.amazon.aps.iva.if0.a r2 = new com.amazon.aps.iva.if0.a     // Catch: java.lang.Exception -> L5b
            r2.<init>(r5)     // Catch: java.lang.Exception -> L5b
            int r5 = r2.e()     // Catch: java.lang.Exception -> L5b
            com.amazon.aps.iva.ec0.j r5 = com.amazon.aps.iva.aq.j.T(r1, r5)     // Catch: java.lang.Exception -> L5b
            com.amazon.aps.iva.lb0.v r5 = com.amazon.aps.iva.lb0.x.k0(r5)     // Catch: java.lang.Exception -> L5b
            bo.app.a5$d r1 = new bo.app.a5$d     // Catch: java.lang.Exception -> L5b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5b
            com.amazon.aps.iva.ne0.e r5 = com.amazon.aps.iva.ne0.s.V(r5, r1)     // Catch: java.lang.Exception -> L5b
            bo.app.a5$e r1 = new bo.app.a5$e     // Catch: java.lang.Exception -> L5b
            r1.<init>(r2)     // Catch: java.lang.Exception -> L5b
            com.amazon.aps.iva.ne0.u r5 = com.amazon.aps.iva.ne0.s.b0(r5, r1)     // Catch: java.lang.Exception -> L5b
            com.amazon.aps.iva.ne0.h<T> r1 = r5.a     // Catch: java.lang.Exception -> L5b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L5b
        L45:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L5b
            if (r2 == 0) goto L6a
            com.amazon.aps.iva.xb0.l<T, R> r2 = r5.b     // Catch: java.lang.Exception -> L5b
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L5b
            java.lang.Object r2 = r2.invoke(r3)     // Catch: java.lang.Exception -> L5b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L5b
            r0.add(r2)     // Catch: java.lang.Exception -> L5b
            goto L45
        L5b:
            r5 = move-exception
            com.braze.support.BrazeLogger r0 = com.braze.support.BrazeLogger.INSTANCE
            com.braze.support.BrazeLogger$Priority r1 = com.braze.support.BrazeLogger.Priority.E
            bo.app.a5$f r2 = bo.app.a5.f.b
            r0.brazelog(r4, r1, r5, r2)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.a5.a(java.lang.String):java.util.Set");
    }
}
