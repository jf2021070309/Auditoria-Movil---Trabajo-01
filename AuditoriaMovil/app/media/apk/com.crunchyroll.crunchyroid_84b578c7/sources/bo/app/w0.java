package bo.app;

import android.content.Context;
import bo.app.o3;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.FeatureFlagsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.EnumSet;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class w0 {
    private final Context a;
    private final b2 b;
    private final x1 c;
    public final r1 d;
    private final l6 e;
    private final i0 f;
    private final m2 g;
    private final p2 h;
    private final z0 i;
    private final BrazeGeofenceManager j;
    private final z1 k;
    private final BrazeConfigurationProvider l;
    private final z m;
    private final w4 n;
    private a5 o;
    private final c1 p;
    private final a4 q;
    public final AtomicBoolean r;
    private final AtomicBoolean s;
    private y5 t;
    private com.amazon.aps.iva.se0.j1 u;
    private final AtomicBoolean v;
    private final AtomicBoolean w;
    private final AtomicBoolean x;
    private final AtomicBoolean y;

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log error.";
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
            return "Requesting Content Card refresh on session created event due to configuration.";
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
            return "Content Cards already initialized. Not retrieving.";
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
            return "Requesting Feature Flags refresh on session created event due to configuration.";
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
            return "Feature Flags already initialized. Not retrieving.";
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
            return "Requesting Push Max request on session created event due to configuration.";
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
            return "Push Max already requested for this session. Not requesting again.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ q2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q2 q2Var) {
            super(0);
            this.b = q2Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Could not publish in-app message with trigger action id: " + this.b.getId();
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
            return "Performing push delivery event flush";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger refresh.";
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, int i) {
            super(0);
            this.b = j;
            this.c = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "ContentCardRetryEvent received. timeInMS: " + this.b + ", retryCount: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l {
        int b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i, com.amazon.aps.iva.ob0.d dVar) {
            super(1, dVar);
            w0.this = r1;
            this.d = i;
        }

        @Override // com.amazon.aps.iva.xb0.l
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.ob0.d dVar) {
            return ((l) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(com.amazon.aps.iva.ob0.d dVar) {
            return new l(this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                com.amazon.aps.iva.ab.x.i0(obj);
                w0 w0Var = w0.this;
                r1.a(w0Var.d, w0Var.m.e(), w0.this.m.f(), this.d, false, 8, null);
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final m b = new m();

        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Session created event for new session received.";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n b = new n();

        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Requesting Braze Geofence refresh on session created event due to configuration.";
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
            return "Not automatically requesting Braze Geofence refresh on session created event due to configuration.";
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
            return "Session start event for new session received.";
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
            return "Not automatically requesting Content Card refresh on session created event due to server configuration.";
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
            return "Not automatically requesting Feature Flags refresh on session created event due to server configuration.";
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
            return "Not automatically requesting Push Max on session created event due to server configuration.";
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final t b = new t();

        public t() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log the storage exception.";
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final u b = new u();

        public u() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Requesting trigger update due to trigger-eligible push click event";
        }
    }

    public w0(Context context, b2 b2Var, x1 x1Var, r1 r1Var, l6 l6Var, i0 i0Var, m2 m2Var, p2 p2Var, z0 z0Var, BrazeGeofenceManager brazeGeofenceManager, z1 z1Var, BrazeConfigurationProvider brazeConfigurationProvider, z zVar, w4 w4Var, a5 a5Var, c1 c1Var, a4 a4Var) {
        com.amazon.aps.iva.yb0.j.f(context, "applicationContext");
        com.amazon.aps.iva.yb0.j.f(b2Var, "locationManager");
        com.amazon.aps.iva.yb0.j.f(x1Var, "dispatchManager");
        com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
        com.amazon.aps.iva.yb0.j.f(l6Var, "userCache");
        com.amazon.aps.iva.yb0.j.f(i0Var, "deviceCache");
        com.amazon.aps.iva.yb0.j.f(m2Var, "triggerManager");
        com.amazon.aps.iva.yb0.j.f(p2Var, "triggerReEligibilityManager");
        com.amazon.aps.iva.yb0.j.f(z0Var, "eventStorageManager");
        com.amazon.aps.iva.yb0.j.f(brazeGeofenceManager, "geofenceManager");
        com.amazon.aps.iva.yb0.j.f(z1Var, "externalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(zVar, "contentCardsStorageProvider");
        com.amazon.aps.iva.yb0.j.f(w4Var, "sdkMetadataCache");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(c1Var, "featureFlagsManager");
        com.amazon.aps.iva.yb0.j.f(a4Var, "pushDeliveryManager");
        this.a = context;
        this.b = b2Var;
        this.c = x1Var;
        this.d = r1Var;
        this.e = l6Var;
        this.f = i0Var;
        this.g = m2Var;
        this.h = p2Var;
        this.i = z0Var;
        this.j = brazeGeofenceManager;
        this.k = z1Var;
        this.l = brazeConfigurationProvider;
        this.m = zVar;
        this.n = w4Var;
        this.o = a5Var;
        this.p = c1Var;
        this.q = a4Var;
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.v = new AtomicBoolean(false);
        this.w = new AtomicBoolean(false);
        this.x = new AtomicBoolean(false);
        this.y = new AtomicBoolean(false);
    }

    private final void t() {
        if (this.y.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f.b, 3, (Object) null);
            this.d.f();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, g.b, 3, (Object) null);
    }

    private final void u() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
        r1.a(this.d, 0L, 1, (Object) null);
    }

    public final void v() {
        y5 y5Var;
        if (this.s.compareAndSet(true, false) && (y5Var = this.t) != null) {
            this.g.a(new x3(y5Var.a(), y5Var.b()));
            this.t = null;
        }
    }

    public final void w() {
        if (this.r.compareAndSet(true, false)) {
            this.g.a(new l3());
        }
    }

    public final void x() {
        if (this.d.b()) {
            this.r.set(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, j.b, 3, (Object) null);
            this.d.a(new o3.a(null, null, null, null, 15, null).c());
            this.d.a(false);
        }
    }

    public static final void a(w0 w0Var, p0 p0Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(p0Var, "<name for destructuring parameter 0>");
        s1 a2 = p0Var.a();
        h0 b2 = a2.b();
        boolean z = true;
        if (b2 != null) {
            w0Var.f.a((Object) b2, true);
        }
        p3 d2 = a2.d();
        if (d2 != null) {
            w0Var.e.a((Object) d2, true);
        }
        bo.app.k g2 = a2.g();
        if (g2 != null) {
            w0Var.i.a(g2.b());
        }
        o3 f2 = a2.f();
        if (f2 != null && f2.x()) {
            w0Var.d.a(false);
        }
        EnumSet j2 = a2.j();
        if (j2 != null) {
            w0Var.n.a(j2);
        }
        o3 f3 = a2.f();
        if (f3 == null || !f3.v()) {
            z = false;
        }
        if (z) {
            w0Var.o.v();
        }
        if (a2 instanceof b4) {
            w0Var.q.a(((b4) a2).t());
        }
    }

    private final IEventSubscriber g() {
        return new com.amazon.aps.iva.y9.o(this, 0);
    }

    private final IEventSubscriber h() {
        return new com.amazon.aps.iva.y9.l(this, 1);
    }

    private final IEventSubscriber m() {
        return new com.amazon.aps.iva.y9.l(this, 0);
    }

    private final IEventSubscriber o() {
        return new com.amazon.aps.iva.y9.o(this, 1);
    }

    private final IEventSubscriber p() {
        return new com.amazon.aps.iva.y9.n(this, 0);
    }

    private final void r() {
        if (this.w.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
            r1.a(this.d, this.m.e(), this.m.f(), 0, false, 12, null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
    }

    private final void s() {
        if (this.x.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, d.b, 3, (Object) null);
            this.p.a();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e.b, 3, (Object) null);
    }

    public final IEventSubscriber b() {
        return new com.amazon.aps.iva.y9.k(this, 1);
    }

    public final IEventSubscriber c() {
        return new com.amazon.aps.iva.y9.k(this, 0);
    }

    public final IEventSubscriber d() {
        return new com.amazon.aps.iva.y9.m(this, 0);
    }

    public final IEventSubscriber e() {
        return new com.amazon.aps.iva.y9.i(this, 0);
    }

    public final IEventSubscriber f() {
        return new com.amazon.aps.iva.y9.p(this, 1);
    }

    public final IEventSubscriber i() {
        return new com.amazon.aps.iva.y9.m(this, 1);
    }

    public final IEventSubscriber j() {
        return new com.amazon.aps.iva.y9.p(this, 0);
    }

    public final IEventSubscriber k() {
        return new com.amazon.aps.iva.y9.h(this, 0);
    }

    public final IEventSubscriber l() {
        return new com.amazon.aps.iva.y9.h(this, 1);
    }

    public final IEventSubscriber n() {
        return new com.amazon.aps.iva.y9.j(this, 0);
    }

    public final IEventSubscriber q() {
        return new com.amazon.aps.iva.y9.i(this, 1);
    }

    public static final void a(w0 w0Var, n0 n0Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(n0Var, "<name for destructuring parameter 0>");
        s1 a2 = n0Var.a();
        o3 f2 = a2.f();
        boolean z = false;
        if (f2 != null && f2.x()) {
            w0Var.w();
            w0Var.v();
            w0Var.d.a(true);
        }
        h0 b2 = a2.b();
        if (b2 != null) {
            w0Var.f.a((Object) b2, false);
        }
        p3 d2 = a2.d();
        if (d2 != null) {
            w0Var.e.a((Object) d2, false);
            if (d2.v().has("push_token")) {
                w0Var.e.g();
                w0Var.f.e();
            }
        }
        bo.app.k g2 = a2.g();
        if (g2 != null) {
            for (p1 p1Var : g2.b()) {
                w0Var.c.a(p1Var);
            }
        }
        o3 f3 = a2.f();
        if (f3 != null && f3.v()) {
            z = true;
        }
        if (z) {
            w0Var.o.v();
        }
        if (a2 instanceof b4) {
            w0Var.q.b(((b4) a2).t());
        }
    }

    public static final void a(w0 w0Var, d5 d5Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(d5Var, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
        p1 a2 = bo.app.j.h.a(d5Var.a().s());
        if (a2 != null) {
            a2.a(d5Var.a().s());
        }
        if (a2 != null) {
            w0Var.d.a(a2);
        }
        w0Var.b.a();
        w0Var.d.a(true);
        w0Var.e.g();
        w0Var.f.e();
        w0Var.x();
        w0Var.u();
        if (w0Var.l.isAutomaticGeofenceRequestsEnabled()) {
            BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
            BrazeInternal.requestGeofenceRefresh(w0Var.a, false);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
        }
        w0Var.p.h();
    }

    public static final void a(w0 w0Var, g5 g5Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(g5Var, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, p.b, 3, (Object) null);
        w0Var.v.set(true);
        if (w0Var.o.o()) {
            w0Var.r();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
        }
        if (w0Var.o.q()) {
            w0Var.s();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, r.b, 3, (Object) null);
        }
        if (w0Var.o.t()) {
            w0Var.t();
        } else {
            BrazeLogger.brazelog$default(brazeLogger, w0Var, (BrazeLogger.Priority) null, (Throwable) null, s.b, 3, (Object) null);
        }
    }

    public static final void a(w0 w0Var, d3 d3Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(d3Var, "it");
        w0Var.d.a(true);
        w0Var.x();
    }

    public static final void a(w0 w0Var, f5 f5Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(f5Var, "message");
        w0Var.a(f5Var);
        Braze.Companion.getInstance(w0Var.a).requestImmediateDataFlush();
        w0Var.u();
    }

    public static final void a(w0 w0Var, z4 z4Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(z4Var, "<name for destructuring parameter 0>");
        y4 a2 = z4Var.a();
        w0Var.j.configureFromServerConfig(a2);
        if (w0Var.v.get()) {
            if (a2.r()) {
                w0Var.r();
            }
            if (a2.i()) {
                w0Var.s();
            }
            if (a2.q()) {
                w0Var.t();
            }
        }
    }

    public static final void a(w0 w0Var, l1 l1Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(l1Var, "<name for destructuring parameter 0>");
        w0Var.j.registerGeofences(l1Var.a());
    }

    public static final void a(w0 w0Var, d1 d1Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(d1Var, "<name for destructuring parameter 0>");
        w0Var.k.a(w0Var.p.a(d1Var.a()), FeatureFlagsUpdatedEvent.class);
    }

    public static final void a(w0 w0Var, y5 y5Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(y5Var, "message");
        w0Var.s.set(true);
        w0Var.t = y5Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0Var, BrazeLogger.Priority.I, (Throwable) null, u.b, 2, (Object) null);
        w0Var.d.a(new o3.a(null, null, null, null, 15, null).c());
    }

    public static final void a(w0 w0Var, j6 j6Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(j6Var, "<name for destructuring parameter 0>");
        w0Var.g.a(j6Var.a());
        w0Var.w();
        w0Var.v();
    }

    public static final void a(w0 w0Var, a6 a6Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(a6Var, "<name for destructuring parameter 0>");
        w0Var.g.a(a6Var.a());
    }

    public static final void a(w0 w0Var, u2 u2Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(u2Var, "<name for destructuring parameter 0>");
        l2 a2 = u2Var.a();
        q2 b2 = u2Var.b();
        IInAppMessage c2 = u2Var.c();
        String d2 = u2Var.d();
        synchronized (w0Var.h) {
            if (w0Var.h.b(b2)) {
                w0Var.k.a(new InAppMessageEvent(a2, b2, c2, d2), InAppMessageEvent.class);
                w0Var.h.a(b2, DateTimeUtils.nowInSeconds());
                w0Var.g.a(DateTimeUtils.nowInSeconds());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0Var, (BrazeLogger.Priority) null, (Throwable) null, new h(b2), 3, (Object) null);
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        }
    }

    public static final void a(w0 w0Var, h6 h6Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(h6Var, "<name for destructuring parameter 0>");
        w0Var.g.a(h6Var.a(), h6Var.b());
    }

    public static final void a(w0 w0Var, w wVar) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(wVar, "<name for destructuring parameter 0>");
        long a2 = wVar.a();
        int b2 = wVar.b();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, w0Var, BrazeLogger.Priority.V, (Throwable) null, new k(a2, b2), 2, (Object) null);
        com.amazon.aps.iva.se0.j1 j1Var = w0Var.u;
        if (j1Var != null) {
            j1Var.a(null);
        }
        w0Var.u = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(a2), null, new l(b2, null), 2, null);
    }

    private final IEventSubscriber a() {
        return new com.amazon.aps.iva.y9.n(this, 1);
    }

    public static final void a(w0 w0Var, v vVar) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(vVar, "it");
        com.amazon.aps.iva.se0.j1 j1Var = w0Var.u;
        if (j1Var != null) {
            j1Var.a(null);
        }
        w0Var.u = null;
    }

    public static final void a(w0 w0Var, l5 l5Var) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        com.amazon.aps.iva.yb0.j.f(l5Var, "storageException");
        try {
            w0Var.d.b(l5Var);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(w0Var, BrazeLogger.Priority.E, e2, t.b);
        }
    }

    public final void a(z1 z1Var) {
        com.amazon.aps.iva.yb0.j.f(z1Var, "eventMessenger");
        z1Var.b(n0.class, b());
        z1Var.b(p0.class, c());
        z1Var.b(d5.class, j());
        z1Var.b(g5.class, l());
        z1Var.b(f5.class, k());
        z1Var.b(y5.class, n());
        z1Var.b(z4.class, i());
        z1Var.b(Throwable.class, a((Semaphore) null));
        z1Var.b(l5.class, m());
        z1Var.b(j6.class, q());
        z1Var.b(d3.class, g());
        z1Var.b(l1.class, e());
        z1Var.b(d1.class, d());
        z1Var.b(a6.class, o());
        z1Var.b(u2.class, f());
        z1Var.b(h6.class, p());
        z1Var.b(w.class, h());
        z1Var.b(v.class, a());
    }

    public final IEventSubscriber a(Semaphore semaphore) {
        return new com.amazon.aps.iva.y9.f(1, this, semaphore);
    }

    public static final void a(w0 w0Var, Semaphore semaphore, Throwable th) {
        com.amazon.aps.iva.yb0.j.f(w0Var, "this$0");
        if (th != null) {
            try {
                try {
                    w0Var.d.a(th);
                } catch (Exception e2) {
                    BrazeLogger.INSTANCE.brazelog(w0Var, BrazeLogger.Priority.E, e2, a.b);
                    if (semaphore == null) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (semaphore != null) {
                    semaphore.release();
                }
                throw th2;
            }
        }
        if (semaphore == null) {
            return;
        }
        semaphore.release();
    }

    private final void a(f5 f5Var) {
        c5 a2 = f5Var.a();
        p1 a3 = bo.app.j.h.a(a2.v());
        if (a3 != null) {
            a3.a(a2.s());
            this.d.a(a3);
        }
    }
}
