package bo.app;

import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public final class j1 extends r {
    public static final a u = new a(null);
    private final p1 s;
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
            return "GeofenceRefreshRequest executed successfully.";
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
            return "Experienced JSONException while creating geofence refresh request. Returning null.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(String str, IBrazeLocation iBrazeLocation) {
        super(new q4(str.concat("geofence/request")), null, 2, null);
        com.amazon.aps.iva.yb0.j.f(str, "urlBase");
        com.amazon.aps.iva.yb0.j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
        this.s = j.h.a(iBrazeLocation);
    }

    @Override // bo.app.e2
    public void a(z1 z1Var, z1 z1Var2, d dVar) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
    }

    @Override // bo.app.r, bo.app.s1
    public boolean c() {
        return this.t;
    }

    @Override // bo.app.r, bo.app.s1
    public com.amazon.aps.iva.if0.c e() {
        com.amazon.aps.iva.if0.c e = super.e();
        if (e == null) {
            return null;
        }
        try {
            p1 p1Var = this.s;
            if (p1Var != null) {
                e.put("location_event", p1Var.forJsonPut());
            }
            return e;
        } catch (com.amazon.aps.iva.if0.b e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, c.b);
            return null;
        }
    }
}
