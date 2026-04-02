package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class s {
    public static final a l = new a(null);
    private static final String m = BrazeLogger.getBrazeLogTag(s.class);
    private final s1 a;
    private final a2 b;
    private final z1 c;
    private final z1 d;
    private final h1 e;
    private final r1 f;
    private final a5 g;
    private final z h;
    private final r0 i;
    private final f0 j;
    private final Map k;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: bo.app.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0083a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ Object b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0083a(Object obj) {
                super(0);
                this.b = obj;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Encountered exception while parsing server response for " + this.b;
            }
        }

        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a(Object obj, com.amazon.aps.iva.xb0.a aVar) {
            try {
                aVar.invoke();
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(obj, BrazeLogger.Priority.E, e, new C0083a(obj));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q4 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q4 q4Var) {
            super(0);
            this.b = q4Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not parse request parameters for POST request to " + this.b + ", cancelling request.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(0);
            this.b = exc;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Experienced network communication exception processing API response. Sending network error event. " + this.b.getMessage();
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
            return "Experienced exception processing API response. Failing task.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ y c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(y yVar, String str) {
            super(0);
            this.c = yVar;
            this.d = str;
        }

        public final void a() {
            ContentCardsUpdatedEvent a = s.this.h.a(this.c, this.d);
            if (a != null) {
                s.this.d.a(a, ContentCardsUpdatedEvent.class);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.if0.a aVar) {
            super(0);
            this.c = aVar;
        }

        public final void a() {
            s.this.c.a(new d1(this.c), d1.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ com.amazon.aps.iva.if0.a c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.amazon.aps.iva.if0.a aVar, String str) {
            super(0);
            this.c = aVar;
            this.d = str;
        }

        public final void a() {
            FeedUpdatedEvent a = s.this.e.a(this.c, this.d);
            if (a != null) {
                s.this.d.a(a, FeedUpdatedEvent.class);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List list) {
            super(0);
            this.c = list;
        }

        public final void a() {
            s.this.c.a(new l1(this.c), l1.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ y4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y4 y4Var) {
            super(0);
            this.c = y4Var;
        }

        public final void a() {
            s.this.g.a(this.c);
            s.this.c.a(new z4(this.c), z4.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ IInAppMessage c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(IInAppMessage iInAppMessage, String str) {
            super(0);
            this.c = iInAppMessage;
            this.d = str;
        }

        public final void a() {
            if (s.this.a instanceof p5) {
                this.c.setExpirationTimestamp(((p5) s.this.a).u());
                s.this.c.a(new u2(((p5) s.this.a).v(), ((p5) s.this.a).w(), this.c, this.d), u2.class);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ List c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(List list) {
            super(0);
            this.c = list;
        }

        public final void a() {
            s.this.c.a(new j6(this.c), j6.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Processing server response payload for user with id: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ g2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(g2 g2Var) {
            super(0);
            this.b = g2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Received server error from request: " + this.b.a();
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(int i) {
            super(0);
            this.c = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Retrying request: ");
            sb.append(s.this.a);
            sb.append(" after delay of ");
            return defpackage.e.f(sb, this.c, " ms");
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ int c;
        final /* synthetic */ s d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ s b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(s sVar) {
                super(0);
                this.b = sVar;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Adding retried request to dispatch: " + this.b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(int i, s sVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = i;
            this.d = sVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((o) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new o(this.c, this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                this.b = 1;
                if (com.amazon.aps.iva.ab.t.l(this.c, this) == aVar) {
                    return aVar;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, s.m, BrazeLogger.Priority.V, (Throwable) null, (com.amazon.aps.iva.xb0.a) new a(this.d), 4, (Object) null);
            this.d.f.a(this.d.a);
            return com.amazon.aps.iva.kb0.q.a;
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
            return "Api response was null, failing task.";
        }
    }

    public s(s1 s1Var, a2 a2Var, z1 z1Var, z1 z1Var2, h1 h1Var, r1 r1Var, a5 a5Var, z zVar, r0 r0Var, f0 f0Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        com.amazon.aps.iva.yb0.j.f(a2Var, "httpConnector");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalPublisher");
        com.amazon.aps.iva.yb0.j.f(h1Var, "feedStorageProvider");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorage");
        com.amazon.aps.iva.yb0.j.f(zVar, "contentCardsStorage");
        com.amazon.aps.iva.yb0.j.f(r0Var, "endpointMetadataProvider");
        com.amazon.aps.iva.yb0.j.f(f0Var, "dataSyncPolicyProvider");
        this.a = s1Var;
        this.b = a2Var;
        this.c = z1Var;
        this.d = z1Var2;
        this.e = h1Var;
        this.f = r1Var;
        this.g = a5Var;
        this.h = zVar;
        this.i = r0Var;
        this.j = f0Var;
        Map a2 = n4.a();
        this.k = a2;
        s1Var.a(a2);
    }

    public final bo.app.d b() {
        try {
            q4 i2 = this.a.i();
            com.amazon.aps.iva.if0.c e2 = this.a.e();
            if (e2 == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new b(i2), 2, (Object) null);
                return null;
            }
            this.k.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(this.i.a(i2)));
            if ((this.a instanceof g0) && !this.j.c()) {
                this.k.put("X-Braze-Req-Attempt", "1");
            } else {
                this.k.put("X-Braze-Req-Attempt", String.valueOf(this.i.a(i2, this.a instanceof g0)));
            }
            return new bo.app.d(this.b.a(i2, this.k, e2), this.a, this.f);
        } catch (Exception e3) {
            if (e3 instanceof f3) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, new c(e3));
                this.c.a(new o4(this.a), o4.class);
                this.d.a(new BrazeNetworkFailureEvent(e3, this.a), BrazeNetworkFailureEvent.class);
            }
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e3, d.b);
            return null;
        }
    }

    public final void c() {
        bo.app.d b2 = b();
        if (b2 != null) {
            a(b2);
            this.c.a(new p4(this.a), p4.class);
            if (b2.b() instanceof t4) {
                this.c.a(new n0(this.a), n0.class);
            } else {
                this.c.a(new p0(this.a), p0.class);
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
            g3 g3Var = new g3("An error occurred during request processing, resulting in no valid response being received. Check the error log for more details.", this.a);
            this.a.a(this.c, this.d, g3Var);
            this.c.a(new n0(this.a), n0.class);
            a(g3Var);
        }
        this.a.b(this.c);
    }

    public final void a(bo.app.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "apiResponse");
        if (dVar.b() == null) {
            this.i.b(this.a.i(), this.a instanceof g0);
            this.a.a(this.c, this.d, dVar);
        } else {
            a(dVar.b());
            this.a.a(this.c, this.d, dVar.b());
        }
        b(dVar);
    }

    public final void a(g2 g2Var) {
        com.amazon.aps.iva.yb0.j.f(g2Var, "responseError");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new m(g2Var), 2, (Object) null);
        this.c.a(new b5(g2Var), b5.class);
        if (this.a.a(g2Var)) {
            int a2 = this.a.m().a();
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new n(a2), 3, (Object) null);
            com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new o(a2, this, null), 3);
            return;
        }
        s1 s1Var = this.a;
        if (s1Var instanceof p5) {
            z1 z1Var = this.d;
            String d2 = ((p5) s1Var).v().d();
            com.amazon.aps.iva.yb0.j.e(d2, "request.triggerEvent.triggerEventType");
            z1Var.a(new NoMatchingTriggerEvent(d2), NoMatchingTriggerEvent.class);
        }
    }

    private final void a(com.amazon.aps.iva.if0.a aVar, String str) {
        if (aVar != null) {
            l.a(aVar, new g(aVar, str));
        }
    }

    private final void a(y yVar, String str) {
        if (yVar != null) {
            l.a(yVar, new e(yVar, str));
        }
    }

    public final void b(bo.app.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "apiResponse");
        String a2 = this.f.a();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new l(a2), 2, (Object) null);
        a(dVar.d(), a2);
        a(dVar.a(), a2);
        a(dVar.h());
        b(dVar.j());
        a(dVar.e());
        a(dVar.c());
        a(dVar.i(), a2);
    }

    private final void a(y4 y4Var) {
        if (y4Var != null) {
            l.a(y4Var, new i(y4Var));
        }
    }

    private final void a(List list) {
        if (list != null) {
            l.a(list, new h(list));
        }
    }

    private final void a(com.amazon.aps.iva.if0.a aVar) {
        if (aVar != null) {
            l.a(aVar, new f(aVar));
        }
    }

    private final void a(IInAppMessage iInAppMessage, String str) {
        if (iInAppMessage != null) {
            l.a(iInAppMessage, new j(iInAppMessage, str));
        }
    }

    private final void b(List list) {
        if (list != null) {
            l.a(list, new k(list));
        }
    }
}
