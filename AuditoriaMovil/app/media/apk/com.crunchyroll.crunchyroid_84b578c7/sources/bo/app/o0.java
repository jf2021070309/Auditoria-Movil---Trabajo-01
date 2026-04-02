package bo.app;

import com.amazon.aps.iva.ue0.i;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class o0 implements x1 {
    public static final a l = new a(null);
    private final l6 a;
    private final v1 b;
    private final BrazeConfigurationProvider c;
    private final u4 d;
    private final w4 e;
    private final i0 f;
    private final w1 g;
    private final com.amazon.aps.iva.ue0.f h;
    private final ConcurrentHashMap i;
    private final ConcurrentHashMap j;
    private final AtomicInteger k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.o0$a$a */
        /* loaded from: classes.dex */
        public static final class C0082a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ u4 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0082a(u4 u4Var) {
                super(0);
                this.b = u4Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Adding SDK Auth token to request '" + this.b.a() + '\'';
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
                return "SDK Auth is disabled, not adding signature to request";
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final void a(BrazeConfigurationProvider brazeConfigurationProvider, u4 u4Var, s1 s1Var, String str) {
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            com.amazon.aps.iva.yb0.j.f(u4Var, "sdkAuthenticationCache");
            com.amazon.aps.iva.yb0.j.f(s1Var, "brazeRequest");
            com.amazon.aps.iva.yb0.j.f(str, "deviceId");
            s1Var.c(str);
            s1Var.g(brazeConfigurationProvider.getBrazeApiKey().toString());
            s1Var.b("27.0.1");
            s1Var.a(Long.valueOf(DateTimeUtils.nowInSeconds()));
            if (brazeConfigurationProvider.isSdkAuthenticationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new C0082a(u4Var), 2, (Object) null);
                s1Var.e(u4Var.a());
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, b.b, 2, (Object) null);
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
            return "Network requests are offline, not adding request to queue.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ s1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s1 s1Var) {
            super(0);
            this.b = s1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected after dropping this request " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Added request to dispatcher with parameters: \n" + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not add request to dispatcher as queue is full or closed. Marking as complete. Incoming Request: \n" + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Event dispatched: " + this.b.forJsonPut() + " with uid: " + this.b.t();
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
            return "Max number of events per dispatch reached: 32 . No more events will be included in this dispatch";
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
            return "Flushing pending events to dispatcher map";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.qb0.c {
        Object b;
        /* synthetic */ Object c;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.amazon.aps.iva.ob0.d dVar) {
            super(dVar);
            o0.this = r1;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return o0.this.a(this);
        }
    }

    public o0(l6 l6Var, v1 v1Var, BrazeConfigurationProvider brazeConfigurationProvider, u4 u4Var, w4 w4Var, i0 i0Var, w1 w1Var, z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(l6Var, "userCache");
        com.amazon.aps.iva.yb0.j.f(v1Var, "deviceDataProvider");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(u4Var, "sdkAuthenticationCache");
        com.amazon.aps.iva.yb0.j.f(w4Var, "sdkMetadataCache");
        com.amazon.aps.iva.yb0.j.f(i0Var, "deviceCache");
        com.amazon.aps.iva.yb0.j.f(w1Var, "deviceIdProvider");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        this.a = l6Var;
        this.b = v1Var;
        this.c = brazeConfigurationProvider;
        this.d = u4Var;
        this.e = w4Var;
        this.f = i0Var;
        this.g = w1Var;
        this.h = com.amazon.aps.iva.dg.b.c(1000, null, 6);
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.k = new AtomicInteger(0);
        z1Var.b(y2.class, new com.amazon.aps.iva.y9.e(this, 1));
    }

    public static final void a(o0 o0Var, y2 y2Var) {
        com.amazon.aps.iva.yb0.j.f(o0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(y2Var, "it");
        o0Var.k.incrementAndGet();
    }

    public final boolean c() {
        return Braze.Companion.getOutboundNetworkRequestsOffline();
    }

    public final s1 d() {
        s1 s1Var = (s1) com.amazon.aps.iva.ue0.i.a(this.h.q());
        if (s1Var != null) {
            b(s1Var);
            return s1Var;
        }
        return null;
    }

    public final synchronized k a() {
        LinkedHashSet linkedHashSet;
        Collection values = this.i.values();
        com.amazon.aps.iva.yb0.j.e(values, "brazeEventMap.values");
        linkedHashSet = new LinkedHashSet();
        Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p1 p1Var = (p1) it.next();
            com.amazon.aps.iva.yb0.j.e(p1Var, "event");
            linkedHashSet.add(p1Var);
            values.remove(p1Var);
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new f(p1Var), 3, (Object) null);
            if (linkedHashSet.size() >= 32) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, g.b, 2, (Object) null);
                break;
            }
        }
        return new k(linkedHashSet);
    }

    public synchronized void b(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        this.j.putIfAbsent(p1Var.t(), p1Var);
    }

    public final boolean b() {
        return !this.h.isEmpty();
    }

    public final synchronized s1 b(s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "brazeRequest");
        l.a(this.c, this.d, s1Var, this.g.getDeviceId());
        if (s1Var.h()) {
            a(s1Var);
        }
        if (s1Var instanceof b4) {
            s1Var.a(this.b.b());
        }
        return s1Var;
    }

    public synchronized void a(e5 e5Var) {
        com.amazon.aps.iva.yb0.j.f(e5Var, "sessionId");
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
        Collection<p1> values = concurrentHashMap.values();
        com.amazon.aps.iva.yb0.j.e(values, "events.values");
        for (p1 p1Var : values) {
            p1Var.a(e5Var);
        }
        this.i.putAll(concurrentHashMap);
        Set<String> keySet = concurrentHashMap.keySet();
        com.amazon.aps.iva.yb0.j.e(keySet, "events.keys");
        for (String str : keySet) {
            this.j.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bo.app.o0.i
            if (r0 == 0) goto L13
            r0 = r5
            bo.app.o0$i r0 = (bo.app.o0.i) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            bo.app.o0$i r0 = new bo.app.o0$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.b
            bo.app.o0 r0 = (bo.app.o0) r0
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.amazon.aps.iva.ue0.f r5 = r4.h
            r0.b = r4
            r0.e = r3
            java.lang.Object r5 = r5.o(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            bo.app.s1 r5 = (bo.app.s1) r5
            bo.app.s1 r5 = r0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.o0.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // bo.app.x1
    public synchronized void a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        this.i.putIfAbsent(p1Var.t(), p1Var);
    }

    public void a(z1 z1Var, s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        if (c()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
        } else if (this.k.get() >= 5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(s1Var), 2, (Object) null);
        } else {
            String prettyPrintedString = JsonUtils.getPrettyPrintedString(s1Var.e());
            s1Var.a(z1Var);
            if (!(this.h.h(s1Var) instanceof i.b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(prettyPrintedString), 2, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, new e(prettyPrintedString), 2, (Object) null);
            s1Var.b(z1Var);
        }
    }

    public final synchronized void a(s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "brazeRequest");
        s1Var.d(this.b.a());
        s1Var.a(this.c.getSdkFlavor());
        s1Var.f(this.b.c());
        h0 a2 = this.b.a(this.f);
        s1Var.a(a2);
        boolean z = false;
        if (a2 != null && a2.w()) {
            this.a.b(NotificationSubscriptionType.OPTED_IN);
        }
        if (a2 != null && a2.u()) {
            z = true;
        }
        if (z) {
            this.a.g();
        }
        s1Var.a((p3) this.a.a());
        k a3 = a();
        s1Var.a(a3);
        if (a3.a()) {
            s1Var.a(this.e.b(this.c.getSdkMetadata()));
        }
    }
}
