package bo.app;

import bo.app.o3;
import com.braze.support.BrazeLogger;
import java.util.Map;
/* loaded from: classes.dex */
public final class g0 extends r {
    public static final a u = new a(null);
    private o3 s;
    private final boolean t;

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
            return "DataSyncRequest executed successfully.";
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
            return "Experienced JSONException while retrieving parameters. Returning null.";
        }
    }

    public /* synthetic */ g0(String str, o3 o3Var, int i, com.amazon.aps.iva.yb0.e eVar) {
        this(str, (i & 2) != 0 ? new o3.a(null, null, null, null, 15, null).a() : o3Var);
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, d dVar) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        boolean z;
        o3 f = f();
        if (f != null && f.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !super.c()) {
            return false;
        }
        return true;
    }

    @Override // bo.app.r, bo.app.s1
    public com.amazon.aps.iva.if0.c e() {
        com.amazon.aps.iva.if0.c cVar;
        com.amazon.aps.iva.if0.c e = super.e();
        if (e == null) {
            return null;
        }
        try {
            o3 f = f();
            if (f != null) {
                cVar = f.forJsonPut();
            } else {
                cVar = null;
            }
            e.put("respond_with", cVar);
            return e;
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, c.b);
            return null;
        }
    }

    @Override // bo.app.r, bo.app.s1
    public o3 f() {
        return this.s;
    }

    @Override // bo.app.r, bo.app.s1
    public boolean h() {
        return this.t;
    }

    @Override // bo.app.r, bo.app.s1
    public void a(Map map) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(map, "existingHeaders");
        super.a(map);
        o3 f = f();
        boolean z2 = false;
        boolean z3 = true;
        if (f != null && f.isEmpty()) {
            return;
        }
        o3 f2 = f();
        if (f2 != null && f2.w()) {
            map.put("X-Braze-FeedRequest", "true");
            z = true;
        } else {
            z = false;
        }
        o3 f3 = f();
        if (f3 != null && f3.x()) {
            z2 = true;
        }
        if (z2) {
            map.put("X-Braze-TriggersRequest", "true");
        } else {
            z3 = z;
        }
        if (z3) {
            map.put("X-Braze-DataRequest", "true");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String str, o3 o3Var) {
        super(new q4(str.concat("data")), null, 2, null);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        this.s = o3Var;
        this.t = true;
    }
}
