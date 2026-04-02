package bo.app;

import android.app.AlarmManager;
import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class m6 implements r2 {
    private final h1 A;
    private final z B;
    private final f2 C;
    private final String a;
    private final String b;
    private final v4 c;
    private final r0 d;
    private final a5 e;
    public l6 f;
    public i0 g;
    private final x0 h;
    private final f i;
    private final k5 j;
    private final u0 k;
    private final w0 l;
    private final f0 m;
    private final t n;
    private final j5 o;
    private final y0 p;
    private final z0 q;
    private final c4 r;
    private final u4 s;
    private final p t;
    private final w4 u;
    private final r1 v;
    private final c6 w;
    private final BrazeGeofenceManager x;
    private final com.braze.managers.a y;
    private final c1 z;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        private /* synthetic */ Object c;

        /* renamed from: bo.app.m6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0080a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0080a b = new C0080a();

            public C0080a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "User cache was locked, waiting.";
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
                return "User cache notified. Continuing UserDependencyManager shutdown";
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
                return "Device cache was locked, waiting.";
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
                return "Device cache notified. Continuing UserDependencyManager shutdown";
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
                return "Exception while shutting down dispatch manager. Continuing.";
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
                return "Exception while stopping data sync. Continuing.";
            }
        }

        public a(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            a aVar = new a(dVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.c;
                try {
                    if (m6.this.g().b()) {
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, g0Var, BrazeLogger.Priority.I, (Throwable) null, C0080a.b, 2, (Object) null);
                        m6.this.g().c();
                        BrazeLogger.brazelog$default(brazeLogger, g0Var, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
                    }
                    if (m6.this.h().b()) {
                        BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger2, g0Var, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                        m6.this.h().c();
                        BrazeLogger.brazelog$default(brazeLogger2, g0Var, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
                    }
                    m6.this.e().a(m6.this.c());
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(g0Var, BrazeLogger.Priority.W, e2, e.b);
                }
                try {
                    m6.this.i().g();
                } catch (Exception e3) {
                    BrazeLogger.INSTANCE.brazelog(g0Var, BrazeLogger.Priority.W, e3, f.b);
                }
                m6.this.c().a(new v(), v.class);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m6(Context context, j3 j3Var, BrazeConfigurationProvider brazeConfigurationProvider, z1 z1Var, w1 w1Var, c2 c2Var, a4 a4Var, boolean z, boolean z2, v1 v1Var) {
        com.amazon.aps.iva.yb0.j.f(context, "applicationContext");
        com.amazon.aps.iva.yb0.j.f(j3Var, "offlineUserStorageProvider");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(z1Var, "externalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(w1Var, "deviceIdProvider");
        com.amazon.aps.iva.yb0.j.f(c2Var, "registrationDataProvider");
        com.amazon.aps.iva.yb0.j.f(a4Var, "pushDeliveryManager");
        com.amazon.aps.iva.yb0.j.f(v1Var, "deviceDataProvider");
        String a2 = j3Var.a();
        this.a = a2;
        String iVar = brazeConfigurationProvider.getBrazeApiKey().toString();
        this.b = iVar;
        v4 v4Var = new v4(context);
        this.c = v4Var;
        r0 r0Var = new r0(context);
        this.d = r0Var;
        this.e = new a5(context, iVar);
        this.h = new x0(v4Var);
        k5 k5Var = new k5(context, a2, iVar);
        this.j = k5Var;
        u0 u0Var = new u0(k5Var, c());
        this.k = u0Var;
        this.m = new f0(context, c(), new e0(context));
        x0 c = c();
        Object systemService = context.getSystemService("alarm");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        this.n = new t(context, u0Var, c, z1Var, (AlarmManager) systemService, brazeConfigurationProvider.getSessionTimeoutSeconds(), brazeConfigurationProvider.isSessionStartBasedTimeoutEnabled());
        j5 j5Var = new j5(context, a2, iVar);
        this.o = j5Var;
        y0 y0Var = new y0(j5Var, c());
        this.p = y0Var;
        this.q = new z0(y0Var);
        this.r = new c4(context, iVar, a2, c(), j());
        this.s = new u4(context, a2, iVar);
        this.t = new p(context, c(), j());
        w4 w4Var = new w4(context, a2, iVar);
        this.u = w4Var;
        this.v = new o(context, a2, iVar, t(), c(), brazeConfigurationProvider, j(), k(), z2, s(), v4Var, l(), a4Var);
        this.w = new c6(context, d(), c(), z1Var, brazeConfigurationProvider, a2, iVar);
        this.x = new BrazeGeofenceManager(context, iVar, d(), brazeConfigurationProvider, j(), c());
        this.y = new com.braze.managers.a(context, d(), brazeConfigurationProvider);
        this.z = new c1(context, iVar, a2, c(), j(), d());
        this.A = new h1(context, a2, d());
        this.B = new z(context, a2, iVar, d(), null, 16, null);
        m4 m4Var = new m4(n1.a(), c(), z1Var, b(), j(), o(), d(), r0Var, i());
        this.C = m4Var;
        if (com.amazon.aps.iva.yb0.j.a(a2, "")) {
            a(new l6(context, c2Var, v4Var, null, null, 24, null));
            a(new i0(context, null, null, 6, null));
        } else {
            a(new l6(context, c2Var, v4Var, a2, iVar));
            a(new i0(context, a2, iVar));
        }
        o0 o0Var = new o0(g(), v1Var, brazeConfigurationProvider, f(), w4Var, h(), w1Var, c());
        i().a(z2);
        this.i = new f(brazeConfigurationProvider, c(), m4Var, o0Var, z);
        this.l = new w0(context, m(), e(), d(), g(), h(), p(), p().d(), k(), n(), z1Var, brazeConfigurationProvider, o(), w4Var, j(), q(), a4Var);
    }

    public void a(l6 l6Var) {
        com.amazon.aps.iva.yb0.j.f(l6Var, "<set-?>");
        this.f = l6Var;
    }

    @Override // bo.app.r2
    public h1 b() {
        return this.A;
    }

    @Override // bo.app.r2
    public x0 c() {
        return this.h;
    }

    @Override // bo.app.r2
    public r1 d() {
        return this.v;
    }

    @Override // bo.app.r2
    public f e() {
        return this.i;
    }

    @Override // bo.app.r2
    public u4 f() {
        return this.s;
    }

    @Override // bo.app.r2
    public l6 g() {
        l6 l6Var = this.f;
        if (l6Var != null) {
            return l6Var;
        }
        com.amazon.aps.iva.yb0.j.m("userCache");
        throw null;
    }

    @Override // bo.app.r2
    public i0 h() {
        i0 i0Var = this.g;
        if (i0Var != null) {
            return i0Var;
        }
        com.amazon.aps.iva.yb0.j.m("deviceCache");
        throw null;
    }

    @Override // bo.app.r2
    public f0 i() {
        return this.m;
    }

    @Override // bo.app.r2
    public a5 j() {
        return this.e;
    }

    @Override // bo.app.r2
    public z0 k() {
        return this.q;
    }

    @Override // bo.app.r2
    public c4 l() {
        return this.r;
    }

    @Override // bo.app.r2
    public com.braze.managers.a m() {
        return this.y;
    }

    @Override // bo.app.r2
    public BrazeGeofenceManager n() {
        return this.x;
    }

    @Override // bo.app.r2
    public z o() {
        return this.B;
    }

    @Override // bo.app.r2
    public c6 p() {
        return this.w;
    }

    @Override // bo.app.r2
    public c1 q() {
        return this.z;
    }

    @Override // bo.app.r2
    public w0 r() {
        return this.l;
    }

    public p s() {
        return this.t;
    }

    public t t() {
        return this.n;
    }

    public void a(i0 i0Var) {
        com.amazon.aps.iva.yb0.j.f(i0Var, "<set-?>");
        this.g = i0Var;
    }

    @Override // bo.app.r2
    public void a() {
        com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new a(null), 3);
    }
}
