package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.Collection;
import java.util.Set;
/* loaded from: classes.dex */
public final class y0 implements q1 {
    private final q1 a;
    private final z1 b;
    private boolean c;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1 p1Var) {
            super(0);
            this.c = p1Var;
        }

        public final void a() {
            y0.this.a.a(this.c);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
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
            return "Storage provider is closed. Not getting all events.";
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
            return "Failed to get all events from storage.";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Set c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set set) {
            super(0);
            this.c = set;
        }

        public final void a() {
            y0.this.a.a(this.c);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
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
            return "Storage provider is closed. Failed to " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        private /* synthetic */ Object c;
        final /* synthetic */ com.amazon.aps.iva.xb0.a d;
        final /* synthetic */ y0 e;
        final /* synthetic */ String f;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.amazon.aps.iva.xb0.a aVar, y0 y0Var, String str, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.d = aVar;
            this.e = y0Var;
            this.f = str;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            f fVar = new f(this.d, this.e, this.f, dVar);
            fVar.c = obj;
            return fVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.c;
                try {
                    this.d.invoke();
                } catch (Exception e) {
                    BrazeLogger.INSTANCE.brazelog(g0Var, BrazeLogger.Priority.E, e, new a(this.f));
                    this.e.a(e);
                }
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            return "Failed to log storage exception";
        }
    }

    public y0(q1 q1Var, z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(q1Var, "storage");
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventPublisher");
        this.a = q1Var;
        this.b = z1Var;
    }

    @Override // bo.app.q1
    public Collection a() {
        boolean z = this.c;
        com.amazon.aps.iva.lb0.b0 b0Var = com.amazon.aps.iva.lb0.b0.b;
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return b0Var;
        }
        try {
            return this.a.a();
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
            a(e2);
            return b0Var;
        }
    }

    @Override // bo.app.q1
    public void a(p1 p1Var) {
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        a("add event " + p1Var, new a(p1Var));
    }

    @Override // bo.app.q1
    public void a(Set set) {
        com.amazon.aps.iva.yb0.j.f(set, "events");
        a("delete events " + set, new d(set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Throwable th) {
        try {
            this.b.a(new l5("A storage exception has occurred!", th), l5.class);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
        }
    }

    private final void a(String str, com.amazon.aps.iva.xb0.a aVar) {
        if (this.c) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new e(str), 2, (Object) null);
        } else {
            com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new f(aVar, this, str, null), 3);
        }
    }
}
