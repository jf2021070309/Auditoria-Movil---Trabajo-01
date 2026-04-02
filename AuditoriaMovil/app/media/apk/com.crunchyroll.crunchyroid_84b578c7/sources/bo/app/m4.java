package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
/* loaded from: classes.dex */
public final class m4 implements f2 {
    private final a2 a;
    private final z1 b;
    private final z1 c;
    private final h1 d;
    private final a5 e;
    private final z f;
    private final r1 g;
    private final r0 h;
    private final f0 i;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Request is null. Cannot execute request.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ s1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s1 s1Var, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.d = s1Var;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new b(this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                m4.this.a(this.d);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return "Request is null. Cannot execute request.";
        }
    }

    public m4(a2 a2Var, z1 z1Var, z1 z1Var2, h1 h1Var, a5 a5Var, z zVar, r1 r1Var, r0 r0Var, f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(a2Var, "httpConnector");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(h1Var, "feedStorageProvider");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(zVar, "contentCardsStorageProvider");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(r0Var, "endpointMetadataProvider");
        com.amazon.aps.iva.yb0.j.f(f0Var, "dataSyncPolicyProvider");
        this.a = a2Var;
        this.b = z1Var;
        this.c = z1Var2;
        this.d = h1Var;
        this.e = a5Var;
        this.f = zVar;
        this.g = r1Var;
        this.h = r0Var;
        this.i = f0Var;
    }

    @Override // bo.app.f2
    public void b(e2 e2Var) {
        s1 s1Var;
        com.amazon.aps.iva.yb0.j.f(e2Var, "request");
        if (e2Var instanceof s1) {
            s1Var = (s1) e2Var;
        } else {
            s1Var = null;
        }
        if (s1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
        } else {
            a(s1Var);
        }
    }

    @Override // bo.app.f2
    public void a(e2 e2Var) {
        com.amazon.aps.iva.yb0.j.f(e2Var, "request");
        s1 s1Var = e2Var instanceof s1 ? (s1) e2Var : null;
        if (s1Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
        } else {
            com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new b(s1Var, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(s1 s1Var) {
        new s(s1Var, this.a, this.b, this.c, this.d, this.g, this.e, this.f, this.h, this.i).c();
    }
}
