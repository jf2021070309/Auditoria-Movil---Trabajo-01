package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
/* loaded from: classes.dex */
public final class p {
    public static final a e = new a(null);
    private final z1 a;
    private final a5 b;
    public final SharedPreferences c;
    public boolean d;

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
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2, long j3) {
            super(0);
            this.b = j;
            this.c = j2;
            this.d = j3;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Messaging session timeout: " + this.b + ", current diff: " + (this.c - this.d);
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
            return "Publishing new messaging session event.";
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
            return "Messaging session not started.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Messaging session stopped. Adding new messaging session timestamp: " + this.b;
        }
    }

    public p(Context context, z1 z1Var, a5 a5Var) {
        com.amazon.aps.iva.yb0.j.f(context, "applicationContext");
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventPublisher");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        this.a = z1Var;
        this.b = a5Var;
        this.c = context.getSharedPreferences("com.appboy.storage.sessions.messaging_session", 0);
    }

    public final boolean a() {
        long j = this.b.j();
        if (j == -1 || this.d) {
            return false;
        }
        long j2 = this.c.getLong("messaging_session_timestamp", -1L);
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(j, nowInSeconds, j2), 3, (Object) null);
        if (j2 + j >= nowInSeconds) {
            return false;
        }
        return true;
    }

    public final void b() {
        if (a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            this.a.a(d3.b, d3.class);
            this.d = true;
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
    }

    public final void c() {
        long nowInSeconds = DateTimeUtils.nowInSeconds();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(nowInSeconds), 3, (Object) null);
        this.c.edit().putLong("messaging_session_timestamp", nowInSeconds).apply();
        this.d = false;
    }
}
