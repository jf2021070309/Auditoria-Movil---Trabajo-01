package bo.app;

import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class u0 implements i2 {
    private final i2 a;
    private final z1 b;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to delete the sealed session from the storage.";
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
            return "Error occured while publishing exception.";
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
            return "Failed to get the active session from the storage.";
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
            return "Failed to upsert active session in the storage.";
        }
    }

    public u0(i2 i2Var, z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(i2Var, "sessionStorageManager");
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventPublisher");
        this.a = i2Var;
        this.b = z1Var;
    }

    @Override // bo.app.i2
    public c5 a() {
        try {
            return this.a.a();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, c.b);
            a(this.b, e);
            return null;
        }
    }

    @Override // bo.app.i2
    public void a(c5 c5Var) {
        com.amazon.aps.iva.yb0.j.f(c5Var, "session");
        try {
            this.a.a(c5Var);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
            a(this.b, e);
        }
    }

    @Override // bo.app.i2
    public void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "sessionId");
        try {
            this.a.a(str);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, a.b);
            a(this.b, e);
        }
    }

    public final void a(z1 z1Var, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventPublisher");
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        try {
            z1Var.a(new l5("A storage exception has occurred. Please view the stack trace for more details.", th), l5.class);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
    }
}
