package bo.app;

import bo.app.m0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class f implements x1 {
    public static final a i = new a(null);
    private static final String j = BrazeLogger.getBrazeLogTag(f.class);
    private final BrazeConfigurationProvider a;
    private final f2 b;
    private final o0 c;
    private final boolean d;
    private final ReentrantLock e;
    private final q0 f;
    private volatile boolean g;
    private volatile com.amazon.aps.iva.se0.j1 h;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m0.b.values().length];
            try {
                iArr[m0.b.ADD_PENDING_BRAZE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.b.ADD_BRAZE_EVENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.b.FLUSH_PENDING_BRAZE_EVENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.b.ADD_REQUEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        private /* synthetic */ Object c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Exception exc) {
                super(0);
                this.b = exc;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Automatic thread interrupted! This is usually the result of calling changeUser(). [" + this.b + ']';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            f.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            c cVar = new c(dVar);
            cVar.c = obj;
            return cVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:4|(3:5|6|7)|8|9|10|(6:12|(1:14)|8|9|10|(2:16|17)(0))(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0049, code lost:
            r8 = r0;
            r0 = r10;
            r10 = r3;
            r3 = r1;
            r1 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:44:0x002f A[Catch: Exception -> 0x0048, TRY_ENTER, TryCatch #0 {Exception -> 0x0048, blocks: (B:47:0x0040, B:44:0x002f), top: B:54:0x0040 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x003d -> B:54:0x0040). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r9.b
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r1 = r9.c
                com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
                com.amazon.aps.iva.ab.x.i0(r10)     // Catch: java.lang.Exception -> L13
                r3 = r10
                r10 = r9
                goto L40
            L13:
                r10 = move-exception
                r3 = r1
                r1 = r0
                r0 = r9
                goto L4e
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                com.amazon.aps.iva.ab.x.i0(r10)
                java.lang.Object r10 = r9.c
                com.amazon.aps.iva.se0.g0 r10 = (com.amazon.aps.iva.se0.g0) r10
                r1 = r10
                r10 = r9
            L29:
                boolean r3 = com.amazon.aps.iva.e.z.E(r1)
                if (r3 == 0) goto L62
                bo.app.f r3 = bo.app.f.this     // Catch: java.lang.Exception -> L48
                bo.app.o0 r3 = bo.app.f.a(r3)     // Catch: java.lang.Exception -> L48
                r10.c = r1     // Catch: java.lang.Exception -> L48
                r10.b = r2     // Catch: java.lang.Exception -> L48
                java.lang.Object r3 = r3.a(r10)     // Catch: java.lang.Exception -> L48
                if (r3 != r0) goto L40
                return r0
            L40:
                bo.app.s1 r3 = (bo.app.s1) r3     // Catch: java.lang.Exception -> L48
                bo.app.f r4 = bo.app.f.this     // Catch: java.lang.Exception -> L48
                bo.app.f.a(r4, r3)     // Catch: java.lang.Exception -> L48
                goto L29
            L48:
                r3 = move-exception
                r8 = r0
                r0 = r10
                r10 = r3
                r3 = r1
                r1 = r8
            L4e:
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
                java.lang.String r5 = bo.app.f.a()
                com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.V
                bo.app.f$c$a r7 = new bo.app.f$c$a
                r7.<init>(r10)
                r4.brazelog(r5, r6, r10, r7)
                r10 = r0
                r0 = r1
                r1 = r3
                goto L29
            L62:
                com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
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
            return "Automatic request execution start was previously requested, continuing without action.";
        }
    }

    public f(BrazeConfigurationProvider brazeConfigurationProvider, z1 z1Var, f2 f2Var, o0 o0Var, boolean z) {
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "appConfigurationProvider");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalIEventMessenger");
        com.amazon.aps.iva.yb0.j.f(f2Var, "requestExecutor");
        com.amazon.aps.iva.yb0.j.f(o0Var, "dispatchManager");
        this.a = brazeConfigurationProvider;
        this.b = f2Var;
        this.c = o0Var;
        this.d = z;
        this.e = new ReentrantLock();
        this.f = new q0(z1Var, z);
        z1Var.b(m0.class, new com.amazon.aps.iva.y9.f(0, this, z1Var));
    }

    private final com.amazon.aps.iva.se0.j1 c() {
        return com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new c(null), 3);
    }

    public final void d() {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (this.g) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, j, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) d.b, 6, (Object) null);
                return;
            }
            this.h = c();
            this.g = true;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final g0 b() {
        return new g0(this.a.getBaseUrlForRequests(), null, 2, null);
    }

    public void b(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        this.c.b(p1Var);
    }

    public static final void a(f fVar, z1 z1Var, m0 m0Var) {
        com.amazon.aps.iva.yb0.j.f(fVar, "this$0");
        com.amazon.aps.iva.yb0.j.f(z1Var, "$internalIEventMessenger");
        com.amazon.aps.iva.yb0.j.f(m0Var, "<name for destructuring parameter 0>");
        m0.b a2 = m0Var.a();
        p1 b2 = m0Var.b();
        e5 c2 = m0Var.c();
        s1 d2 = m0Var.d();
        int i2 = b.a[a2.ordinal()];
        if (i2 == 1) {
            if (b2 != null) {
                fVar.b(b2);
            }
        } else if (i2 == 2) {
            if (b2 != null) {
                fVar.a(b2);
            }
        } else if (i2 == 3) {
            if (c2 != null) {
                fVar.a(c2);
            }
        } else if (i2 == 4 && d2 != null) {
            fVar.a(z1Var, d2);
        }
    }

    private final void b(s1 s1Var) {
        if (!s1Var.c() && !this.d) {
            this.b.b(s1Var);
        } else {
            this.f.b(s1Var);
        }
    }

    @Override // bo.app.x1
    public void a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        this.c.a(p1Var);
    }

    public void a(z1 z1Var, s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        this.c.a(z1Var, s1Var);
    }

    public void a(e5 e5Var) {
        com.amazon.aps.iva.yb0.j.f(e5Var, "sessionId");
        this.c.a(e5Var);
    }

    public final void a(z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventMessenger");
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            com.amazon.aps.iva.se0.j1 j1Var = this.h;
            if (j1Var != null) {
                j1Var.a(null);
            }
            this.h = null;
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            reentrantLock.unlock();
            if (!this.c.b()) {
                this.c.a(z1Var, b());
            }
            s1 d2 = this.c.d();
            if (d2 != null) {
                b(d2);
            }
            z1Var.a();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void a(s1 s1Var) {
        if (!s1Var.c() && !this.d) {
            this.b.a(s1Var);
        } else {
            this.f.a(s1Var);
        }
    }
}
