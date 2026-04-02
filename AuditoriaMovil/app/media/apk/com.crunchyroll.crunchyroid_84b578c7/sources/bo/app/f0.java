package bo.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class f0 {
    public static final c n = new c(null);
    private final Context a;
    private final e0 b;
    private BroadcastReceiver c;
    private ConnectivityManager.NetworkCallback d;
    private final b1 e;
    private h5 f;
    private long g;
    private volatile boolean h;
    private final ConnectivityManager i;
    private h3 j;
    private com.amazon.aps.iva.se0.j1 k;
    private int l;
    private boolean m;

    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
            f0.this = r1;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            com.amazon.aps.iva.yb0.j.f(network, "network");
            com.amazon.aps.iva.yb0.j.f(networkCapabilities, "networkCapabilities");
            super.onCapabilitiesChanged(network, networkCapabilities);
            f0.this.a(networkCapabilities);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            com.amazon.aps.iva.yb0.j.f(network, "network");
            super.onLost(network);
            Network activeNetwork = f0.this.i.getActiveNetwork();
            f0 f0Var = f0.this;
            f0Var.a(f0Var.i.getNetworkCapabilities(activeNetwork));
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        final /* synthetic */ z1 b;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ f0 d;
            final /* synthetic */ Intent e;
            final /* synthetic */ z1 f;
            final /* synthetic */ BroadcastReceiver.PendingResult g;

            /* renamed from: bo.app.f0$b$a$a */
            /* loaded from: classes.dex */
            public static final class C0071a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
                public static final C0071a b = new C0071a();

                public C0071a() {
                    super(0);
                }

                @Override // com.amazon.aps.iva.xb0.a
                /* renamed from: a */
                public final String invoke() {
                    return "Retrieving connectivity event data in background";
                }
            }

            /* renamed from: bo.app.f0$b$a$b */
            /* loaded from: classes.dex */
            public static final class C0072b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
                public static final C0072b b = new C0072b();

                public C0072b() {
                    super(0);
                }

                @Override // com.amazon.aps.iva.xb0.a
                /* renamed from: a */
                public final String invoke() {
                    return "Failed to process connectivity event.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var, Intent intent, z1 z1Var, BroadcastReceiver.PendingResult pendingResult, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.d = f0Var;
                this.e = intent;
                this.f = z1Var;
                this.g = pendingResult;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                a aVar = new a(this.d, this.e, this.f, this.g, dVar);
                aVar.c = obj;
                return aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.c;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g0Var, BrazeLogger.Priority.V, (Throwable) null, C0071a.b, 2, (Object) null);
                    try {
                        f0 f0Var = this.d;
                        f0Var.j = com.braze.support.a.a(this.e, f0Var.i);
                        this.d.d();
                    } catch (Exception e) {
                        BrazeLogger.INSTANCE.brazelog(g0Var, BrazeLogger.Priority.E, e, C0072b.b);
                        this.d.a(this.f, e);
                    }
                    this.g.finish();
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public b(z1 z1Var) {
            f0.this = r1;
            this.b = z1Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.yb0.j.f(intent, "intent");
            com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new a(f0.this, intent, this.b, goAsync(), null), 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public /* synthetic */ c(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private c() {
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h3.values().length];
            try {
                iArr[h3.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h3.BAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h3.GREAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h3.GOOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            f0.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Received successful request flush. Default flush interval reset to " + f0.this.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ f0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, f0 f0Var) {
            super(0);
            this.b = j;
            this.c = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Kicking off the Sync Job. initialDelaysMs: " + this.b + ": currentIntervalMs " + this.c.b() + " ms";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        long b;
        int c;
        private /* synthetic */ Object d;
        final /* synthetic */ long f;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush from automatic sync policy";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            f0.this = r1;
            this.f = j;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((g) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            g gVar = new g(this.f, dVar);
            gVar.d = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0068 -> B:31:0x0016). Please submit an issue!!! */
        @Override // com.amazon.aps.iva.qb0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                int r1 = r12.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                long r3 = r12.b
                java.lang.Object r1 = r12.d
                com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
                com.amazon.aps.iva.ab.x.i0(r13)
                r13 = r12
            L16:
                r10 = r3
                goto L6b
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                long r3 = r12.b
                java.lang.Object r1 = r12.d
                com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
                com.amazon.aps.iva.ab.x.i0(r13)
                goto L48
            L2a:
                com.amazon.aps.iva.ab.x.i0(r13)
                java.lang.Object r13 = r12.d
                r1 = r13
                com.amazon.aps.iva.se0.g0 r1 = (com.amazon.aps.iva.se0.g0) r1
                bo.app.f0 r13 = bo.app.f0.this
                long r4 = r13.b()
                long r6 = r12.f
                r12.d = r1
                r12.b = r4
                r12.c = r3
                java.lang.Object r13 = com.amazon.aps.iva.ab.t.l(r6, r12)
                if (r13 != r0) goto L47
                return r0
            L47:
                r3 = r4
            L48:
                com.braze.Braze$Companion r13 = com.braze.Braze.Companion
                bo.app.f0 r5 = bo.app.f0.this
                android.content.Context r5 = bo.app.f0.b(r5)
                com.braze.Braze r13 = r13.getInstance(r5)
                r13.requestImmediateDataFlush()
                r13 = r12
            L58:
                boolean r5 = com.amazon.aps.iva.e.z.E(r1)
                if (r5 == 0) goto L89
                r13.d = r1
                r13.b = r3
                r13.c = r2
                java.lang.Object r5 = com.amazon.aps.iva.ab.t.l(r3, r13)
                if (r5 != r0) goto L16
                return r0
            L6b:
                com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.V
                bo.app.f0$g$a r7 = bo.app.f0.g.a.b
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)
                com.braze.Braze$Companion r3 = com.braze.Braze.Companion
                bo.app.f0 r4 = bo.app.f0.this
                android.content.Context r4 = bo.app.f0.b(r4)
                com.braze.Braze r3 = r3.getInstance(r4)
                r3.requestImmediateDataFlush()
                r3 = r10
                goto L58
            L89:
                com.amazon.aps.iva.kb0.q r13 = com.amazon.aps.iva.kb0.q.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.f0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h() {
            super(0);
            f0.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval is " + f0.this.b() + " ms. Not scheduling a proceeding data flush.";
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
            return "Failed to log throwable.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j() {
            super(0);
            f0.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "recalculateDispatchState called with session state: " + f0.this.f + " lastNetworkLevel: " + f0.this.j;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k() {
            super(0);
            f0.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Flush interval was too low (" + f0.this.b() + "), moving to minimum of 1000 ms";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l() {
            super(0);
            f0.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "currentIntervalMs: " + f0.this.b();
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ f0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j, f0 f0Var) {
            super(0);
            this.b = j;
            this.c = f0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Data flush interval has changed from " + this.b + " ms to " + this.c.b() + " ms after connectivity state change to: " + this.c.j + " and session state: " + this.c.f;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Posting new sync runnable with delay "), this.b, " ms");
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final o b = new o();

        public o() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is already running. Ignoring request.";
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final p b = new p();

        public p() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Data sync started";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final q b = new q();

        public q() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The data sync policy is not running. Ignoring request.";
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final r b = new r();

        public r() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Data sync stopped";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final s b = new s();

        public s() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to unregister Connectivity callback";
        }
    }

    public f0(Context context, z1 z1Var, e0 e0Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventPublisher");
        com.amazon.aps.iva.yb0.j.f(e0Var, "dataSyncConfigurationProvider");
        this.a = context;
        this.b = e0Var;
        this.e = new b1((int) TimeUnit.MINUTES.toMillis(5L), 0, 2, null);
        this.f = h5.NO_SESSION;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.i = (ConnectivityManager) systemService;
        this.j = h3.NONE;
        if (Build.VERSION.SDK_INT >= 30) {
            this.d = new a();
        } else {
            this.c = new b(z1Var);
        }
        a(z1Var);
    }

    public final synchronized boolean g() {
        if (!this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, r.b, 3, (Object) null);
        a();
        h();
        this.h = false;
        return true;
    }

    public final void h() {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.i;
                ConnectivityManager.NetworkCallback networkCallback = this.d;
                if (networkCallback != null) {
                    connectivityManager.unregisterNetworkCallback(networkCallback);
                    return;
                } else {
                    com.amazon.aps.iva.yb0.j.m("connectivityNetworkCallback");
                    throw null;
                }
            }
            this.a.unregisterReceiver(this.c);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, s.b);
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.i;
            ConnectivityManager.NetworkCallback networkCallback = this.d;
            if (networkCallback != null) {
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
                a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
                return;
            }
            com.amazon.aps.iva.yb0.j.m("connectivityNetworkCallback");
            throw null;
        }
        this.a.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final synchronized boolean f() {
        if (this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
        e();
        b(this.g);
        this.h = true;
        return true;
    }

    public final long b() {
        return this.g;
    }

    public final boolean c() {
        return this.e.b();
    }

    public final void d() {
        long j2;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new j(), 2, (Object) null);
        long j3 = this.g;
        if (this.f != h5.NO_SESSION && !this.m && this.l < 50) {
            int i2 = d.a[this.j.ordinal()];
            if (i2 == 1) {
                j2 = -1;
            } else if (i2 == 2) {
                j2 = this.b.a();
            } else if (i2 == 3) {
                j2 = this.b.c();
            } else if (i2 != 4) {
                throw new com.amazon.aps.iva.kb0.h();
            } else {
                j2 = this.b.b();
            }
            this.g = j2;
            if (j2 != -1 && j2 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new k(), 2, (Object) null);
                this.g = 1000L;
            }
        } else {
            this.g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new l(), 2, (Object) null);
        if (j3 != this.g) {
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new m(j3, this), 3, (Object) null);
            b(this.g);
        }
    }

    private final void b(long j2) {
        a();
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(j2), 3, (Object) null);
            this.k = a(j2);
        }
    }

    public final synchronized void a(boolean z) {
        this.m = z;
        d();
        if (z) {
            g();
        } else {
            f();
        }
    }

    private final com.amazon.aps.iva.se0.j1 a(long j2) {
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(j2, this), 2, (Object) null);
            return com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new g(j2, null), 3);
        }
        Braze.Companion.getInstance(this.a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(), 3, (Object) null);
        return null;
    }

    private final void a() {
        com.amazon.aps.iva.se0.j1 j1Var = this.k;
        if (j1Var != null) {
            j1Var.a(null);
        }
        this.k = null;
    }

    public final void a(z1 z1Var, Throwable th) {
        try {
            z1Var.a(th, Throwable.class);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, i.b);
        }
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        this.j = com.braze.support.a.a(networkCapabilities);
        d();
    }

    public final void a(z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventManager");
        z1Var.b(g5.class, new com.amazon.aps.iva.y9.g(this, 0));
        z1Var.b(i5.class, new com.amazon.aps.iva.y9.a(this, 1));
        z1Var.b(o4.class, new com.amazon.aps.iva.y9.b(this, 1));
        z1Var.b(p4.class, new com.amazon.aps.iva.y9.c(this, 1));
        z1Var.b(b5.class, new com.amazon.aps.iva.y9.d(this, 1));
    }

    public static final void a(f0 f0Var, g5 g5Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(g5Var, "it");
        f0Var.f = h5.OPEN_SESSION;
        f0Var.l = 0;
        f0Var.d();
    }

    public static final void a(f0 f0Var, i5 i5Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(i5Var, "it");
        f0Var.f = h5.NO_SESSION;
        f0Var.d();
    }

    public static final void a(f0 f0Var, o4 o4Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(o4Var, "it");
        long j2 = f0Var.g;
        f0Var.b(j2 + f0Var.e.a((int) j2));
    }

    public static final void a(f0 f0Var, p4 p4Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(p4Var, "it");
        if (f0Var.e.b()) {
            f0Var.e.c();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f0Var, (BrazeLogger.Priority) null, (Throwable) null, new e(), 3, (Object) null);
            f0Var.b(f0Var.g);
        }
        f0Var.l = 0;
    }

    public static final void a(f0 f0Var, b5 b5Var) {
        com.amazon.aps.iva.yb0.j.f(f0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(b5Var, "<name for destructuring parameter 0>");
        if (b5Var.a() instanceof t4) {
            f0Var.l++;
            f0Var.d();
        }
    }
}
