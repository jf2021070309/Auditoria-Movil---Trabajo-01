package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class c6 implements m2 {
    public static final a o = new a(null);
    private static final long p = TimeUnit.SECONDS.toMillis(30);
    private static final String q = BrazeLogger.getBrazeLogTag(c6.class);
    private final Context a;
    private final r1 b;
    private final z1 c;
    private z1 d;
    private final long e;
    private final SharedPreferences f;
    private final j2 g;
    private final p2 h;
    private final AtomicInteger i;
    private final Queue j;
    private final Map k;
    private volatile long l;
    private final ReentrantLock m;
    private final ReentrantLock n;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.c6$a$a */
        /* loaded from: classes.dex */
        public static final class C0069a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0069a b = new C0069a();

            public C0069a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Ignoring minimum time interval between triggered actions because the trigger event is a test.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(0);
                this.b = i;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Using override minimum display interval: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ long b;
            final /* synthetic */ long c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(long j, long j2) {
                super(0);
                this.b = j;
                this.c = j2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement met for matched trigger. Action display time: " + this.b + " . Next viable display time: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ long b;
            final /* synthetic */ long c;
            final /* synthetic */ long d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(long j, long j2, long j3) {
                super(0);
                this.b = j;
                this.c = j2;
                this.d = j3;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Minimum time interval requirement and triggered action override time interval requirement of " + this.b + " not met for matched trigger. Returning null. Next viable display time: " + this.c + ". Action display time: " + this.d;
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final boolean a(l2 l2Var, q2 q2Var, long j, long j2) {
            long j3;
            com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
            com.amazon.aps.iva.yb0.j.f(q2Var, "action");
            if (l2Var instanceof s5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c6.q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) C0069a.b, 6, (Object) null);
                return true;
            }
            long nowInSeconds = DateTimeUtils.nowInSeconds() + q2Var.n().o();
            int r = q2Var.n().r();
            if (r != -1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c6.q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new b(r), 6, (Object) null);
                j3 = j + r;
            } else {
                j3 = j + j2;
            }
            long j4 = j3;
            if (nowInSeconds >= j4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c6.q, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) new c(nowInSeconds, j4), 4, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c6.q, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) new d(j2, j4, nowInSeconds), 4, (Object) null);
            return false;
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
            return "In flight trigger requests is empty. Executing any pending trigger events.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l2 l2Var) {
            super(0);
            this.b = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "New incoming <" + this.b.d() + ">. Searching for matching triggers.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l2 l2Var) {
            super(0);
            this.b = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "No action found for " + this.b.d() + " event, publishing NoMatchingTriggerEvent";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Found potential triggered action for incoming trigger event. Action id " + this.b.getId() + '.';
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(l2 l2Var) {
            super(0);
            this.b = l2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to match triggered action for incoming <" + this.b.d() + ">.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ l2 b;
        final /* synthetic */ com.amazon.aps.iva.yb0.d0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l2 l2Var, com.amazon.aps.iva.yb0.d0 d0Var) {
            super(0);
            this.b = l2Var;
            this.c = d0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            String str;
            StringBuilder sb = new StringBuilder("\n     Found best triggered action for incoming trigger event ");
            if (this.b.a() != null) {
                str = JsonUtils.getPrettyPrintedString((com.amazon.aps.iva.if0.c) this.b.a().forJsonPut());
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(".\n     Matched Action id: ");
            sb.append(((q2) this.c.b).getId());
            sb.append(".\n                ");
            return com.amazon.aps.iva.oe0.i.T(sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l {
        int b;
        final /* synthetic */ q2 c;
        final /* synthetic */ c6 d;
        final /* synthetic */ l2 e;
        final /* synthetic */ long f;
        final /* synthetic */ long g;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j) {
                super(0);
                this.b = j;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return com.amazon.aps.iva.c.b.b(new StringBuilder("Performing triggered action after a delay of "), this.b, " ms.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q2 q2Var, c6 c6Var, l2 l2Var, long j, long j2, com.amazon.aps.iva.ob0.d dVar) {
            super(1, dVar);
            this.c = q2Var;
            this.d = c6Var;
            this.e = l2Var;
            this.f = j;
            this.g = j2;
        }

        @Override // com.amazon.aps.iva.xb0.l
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.ob0.d dVar) {
            return ((h) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(com.amazon.aps.iva.ob0.d dVar) {
            return new h(this.c, this.d, this.e, this.f, this.g, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, c6.q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new a(this.g), 6, (Object) null);
                this.c.a(this.d.a, this.d.c, this.e, this.f);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List list) {
            super(0);
            this.b = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Registering " + this.b.size() + " new triggered actions.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Registering triggered action id " + this.b.getId() + ' ';
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Test triggered actions found, triggering test event.";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "No test triggered actions found.";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("Received null or blank serialized triggered action string for action id "), this.b, " from shared preferences. Not parsing.");
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Retrieving templated triggered action id " + this.b.getId() + " from local storage.";
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
            return "Encountered unexpected exception while parsing stored triggered actions.";
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Trigger manager received failed triggered action with id: <" + this.b.getId() + ">. Will attempt to perform fallback triggered actions, if present.";
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
            return "Triggered action has no trigger metadata and cannot fallback. Doing nothing.";
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
            return "Triggered action has no fallback action to perform. Doing nothing.";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Fallback trigger has expired. Trigger id: " + this.b.getId();
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(q2 q2Var, long j) {
            super(0);
            this.b = q2Var;
            this.c = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Performing fallback triggered action with id: <");
            sb.append(this.b.getId());
            sb.append("> with a delay: ");
            return com.amazon.aps.iva.c.b.b(sb, this.c, " ms");
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l {
        int b;
        final /* synthetic */ q2 c;
        final /* synthetic */ c6 d;
        final /* synthetic */ l2 e;
        final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(q2 q2Var, c6 c6Var, l2 l2Var, long j, com.amazon.aps.iva.ob0.d dVar) {
            super(1, dVar);
            this.c = q2Var;
            this.d = c6Var;
            this.e = l2Var;
            this.f = j;
        }

        @Override // com.amazon.aps.iva.xb0.l
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.ob0.d dVar) {
            return ((u) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(com.amazon.aps.iva.ob0.d dVar) {
            return new u(this.c, this.d, this.e, this.f, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.c.a(this.d.a, this.d.c, this.e, this.f);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final v b = new v();

        public v() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Subscribing to trigger dispatch events.";
        }
    }

    public c6(Context context, r1 r1Var, z1 z1Var, z1 z1Var2, BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        this.m = new ReentrantLock();
        this.n = new ReentrantLock();
        Context applicationContext = context.getApplicationContext();
        com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
        this.a = applicationContext;
        this.b = r1Var;
        this.c = z1Var;
        this.d = z1Var2;
        this.e = brazeConfigurationProvider.getTriggerActionMinimumTimeIntervalInSeconds();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.actions" + StringUtils.getCacheFileSuffix(context, str, str2), 0);
        com.amazon.aps.iva.yb0.j.e(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f = sharedPreferences;
        this.g = new u5(context, str2);
        this.h = new f6(context, str, str2);
        this.k = e();
        this.i = new AtomicInteger(0);
        this.j = new ArrayDeque();
        f();
    }

    private final void f() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, BrazeLogger.Priority.V, (Throwable) null, (com.amazon.aps.iva.xb0.a) v.b, 4, (Object) null);
        this.c.b(x5.class, new com.amazon.aps.iva.y9.e(this, 0));
        this.c.b(w5.class, new com.amazon.aps.iva.y9.h(this, 2));
    }

    public p2 d() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map e() {
        /*
            r14 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r14.f
            java.util.Map r1 = r1.getAll()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L16
            goto L18
        L16:
            r4 = r2
            goto L19
        L18:
            r4 = r3
        L19:
            if (r4 == 0) goto L1c
            return r0
        L1c:
            java.util.Set r1 = r1.keySet()
            java.util.Set r1 = com.amazon.aps.iva.lb0.x.c1(r1)
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L82
        L28:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L82
            if (r4 == 0) goto L8e
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L82
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L82
            android.content.SharedPreferences r5 = r14.f     // Catch: java.lang.Exception -> L82
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)     // Catch: java.lang.Exception -> L82
            if (r5 == 0) goto L46
            boolean r6 = com.amazon.aps.iva.oe0.m.b0(r5)     // Catch: java.lang.Exception -> L82
            if (r6 == 0) goto L44
            goto L46
        L44:
            r6 = r2
            goto L47
        L46:
            r6 = r3
        L47:
            if (r6 == 0) goto L5b
            com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L82
            java.lang.String r8 = bo.app.c6.q     // Catch: java.lang.Exception -> L82
            com.braze.support.BrazeLogger$Priority r9 = com.braze.support.BrazeLogger.Priority.W     // Catch: java.lang.Exception -> L82
            r10 = 0
            bo.app.c6$m r11 = new bo.app.c6$m     // Catch: java.lang.Exception -> L82
            r11.<init>(r4)     // Catch: java.lang.Exception -> L82
            r12 = 4
            r13 = 0
            com.braze.support.BrazeLogger.brazelog$default(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L82
            goto L28
        L5b:
            bo.app.e6 r4 = bo.app.e6.a     // Catch: java.lang.Exception -> L82
            com.amazon.aps.iva.if0.c r6 = new com.amazon.aps.iva.if0.c     // Catch: java.lang.Exception -> L82
            r6.<init>(r5)     // Catch: java.lang.Exception -> L82
            bo.app.r1 r5 = r14.b     // Catch: java.lang.Exception -> L82
            bo.app.q2 r4 = r4.b(r6, r5)     // Catch: java.lang.Exception -> L82
            if (r4 == 0) goto L28
            com.braze.support.BrazeLogger r5 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Exception -> L82
            java.lang.String r6 = bo.app.c6.q     // Catch: java.lang.Exception -> L82
            r7 = 0
            r8 = 0
            bo.app.c6$n r9 = new bo.app.c6$n     // Catch: java.lang.Exception -> L82
            r9.<init>(r4)     // Catch: java.lang.Exception -> L82
            r10 = 6
            r11 = 0
            com.braze.support.BrazeLogger.brazelog$default(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L82
            java.lang.String r5 = r4.getId()     // Catch: java.lang.Exception -> L82
            r0.put(r5, r4)     // Catch: java.lang.Exception -> L82
            goto L28
        L82:
            r1 = move-exception
            com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
            java.lang.String r3 = bo.app.c6.q
            com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.E
            bo.app.c6$o r5 = bo.app.c6.o.b
            r2.brazelog(r3, r4, r1, r5)
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.c6.e():java.util.Map");
    }

    public long c() {
        return this.l;
    }

    @Override // bo.app.m2
    public void a(long j2) {
        this.l = j2;
    }

    public final void b(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new c(l2Var), 6, (Object) null);
        q2 c2 = c(l2Var);
        if (c2 != null) {
            b(l2Var, c2);
            return;
        }
        String d2 = l2Var.d();
        if (d2 != null) {
            int hashCode = d2.hashCode();
            if (hashCode != 3417674) {
                if (hashCode != 717572172) {
                    if (hashCode != 1743324417 || !d2.equals(FirebaseAnalytics.Event.PURCHASE)) {
                        return;
                    }
                } else if (!d2.equals("custom_event")) {
                    return;
                }
            } else if (!d2.equals("open")) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new d(l2Var), 3, (Object) null);
            z1 z1Var = this.d;
            String d3 = l2Var.d();
            com.amazon.aps.iva.yb0.j.e(d3, "triggerEvent.triggerEventType");
            z1Var.a(new NoMatchingTriggerEvent(d3), NoMatchingTriggerEvent.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, bo.app.q2, java.lang.Object] */
    public final q2 c(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "event");
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            com.amazon.aps.iva.yb0.d0 d0Var = new com.amazon.aps.iva.yb0.d0();
            ArrayList arrayList = new ArrayList();
            int i2 = Integer.MIN_VALUE;
            for (?? r5 : this.k.values()) {
                if (r5.b(l2Var) && d().b(r5) && o.a(l2Var, r5, c(), this.e)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new e(r5), 6, (Object) null);
                    int j2 = r5.n().j();
                    if (j2 > i2) {
                        d0Var.b = r5;
                        i2 = j2;
                    }
                    arrayList.add(r5);
                }
            }
            Object obj = d0Var.b;
            if (obj == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new f(l2Var), 6, (Object) null);
                reentrantLock.unlock();
                return null;
            }
            arrayList.remove(obj);
            ((q2) d0Var.b).a(new d6(arrayList));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new g(l2Var, d0Var), 6, (Object) null);
            return (q2) d0Var.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.o2
    public void a(List list) {
        com.amazon.aps.iva.yb0.j.f(list, "triggeredActions");
        s5 s5Var = new s5();
        ReentrantLock reentrantLock = this.m;
        reentrantLock.lock();
        try {
            this.k.clear();
            SharedPreferences.Editor clear = this.f.edit().clear();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new i(list), 6, (Object) null);
            Iterator it = list.iterator();
            boolean z = false;
            while (it.hasNext()) {
                q2 q2Var = (q2) it.next();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new j(q2Var), 6, (Object) null);
                this.k.put(q2Var.getId(), q2Var);
                clear.putString(q2Var.getId(), String.valueOf(q2Var.forJsonPut()));
                if (q2Var.b(s5Var)) {
                    z = true;
                }
            }
            clear.apply();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            reentrantLock.unlock();
            d().a(list);
            this.g.a(list);
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) k.b, 4, (Object) null);
                a(s5Var);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) l.b, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b() {
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            if (this.i.get() > 0) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, q, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) b.b, 6, (Object) null);
            while (!this.j.isEmpty()) {
                l2 l2Var = (l2) this.j.poll();
                if (l2Var != null) {
                    b(l2Var);
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(l2 l2Var, q2 q2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "event");
        com.amazon.aps.iva.yb0.j.f(q2Var, "action");
        q2Var.a(this.g.a(q2Var));
        h2 n2 = q2Var.n();
        long e2 = n2.k() != -1 ? l2Var.e() + n2.k() : -1L;
        long millis = TimeUnit.SECONDS.toMillis(n2.o());
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(millis), null, new h(q2Var, this, l2Var, e2, millis, null), 2, null);
    }

    @Override // bo.app.m2
    public void a(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        ReentrantLock reentrantLock = this.n;
        reentrantLock.lock();
        try {
            this.j.add(l2Var);
            if (this.i.get() == 0) {
                b();
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.m2
    public void a(l2 l2Var, q2 q2Var) {
        h2 n2;
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        com.amazon.aps.iva.yb0.j.f(q2Var, "failedAction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = q;
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new p(q2Var), 6, (Object) null);
        d6 b2 = q2Var.b();
        if (b2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) q.b, 6, (Object) null);
            return;
        }
        q2 a2 = b2.a();
        if (a2 == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) r.b, 6, (Object) null);
            return;
        }
        a2.a(b2);
        a2.a(this.g.a(a2));
        long e2 = l2Var.e();
        long k2 = a2.n().k();
        long millis = TimeUnit.SECONDS.toMillis(n2.o());
        long j2 = k2 != -1 ? k2 + e2 : e2 + millis + p;
        if (j2 < DateTimeUtils.nowInMilliseconds()) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new s(a2), 6, (Object) null);
            a(l2Var, a2);
            return;
        }
        long max = Math.max(0L, (millis + e2) - DateTimeUtils.nowInMilliseconds());
        BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new t(a2, max), 6, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(max), null, new u(a2, this, l2Var, j2, null), 2, null);
    }

    public static final void a(c6 c6Var, x5 x5Var) {
        com.amazon.aps.iva.yb0.j.f(c6Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(x5Var, "it");
        c6Var.i.incrementAndGet();
    }

    public static final void a(c6 c6Var, w5 w5Var) {
        com.amazon.aps.iva.yb0.j.f(c6Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(w5Var, "it");
        c6Var.i.decrementAndGet();
        c6Var.b();
    }
}
