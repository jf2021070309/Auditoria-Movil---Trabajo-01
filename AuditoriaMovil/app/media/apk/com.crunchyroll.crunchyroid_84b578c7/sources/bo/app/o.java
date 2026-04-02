package bo.app;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import bo.app.c4;
import bo.app.o3;
import com.braze.BrazeFlushPushDeliveryReceiver;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class o implements r1 {
    public static final a v = new a(null);
    private static final String[] w = {"android.os.deadsystemexception"};
    private final Context a;
    private final String b;
    private final bo.app.t c;
    private final z1 d;
    private final BrazeConfigurationProvider e;
    private final a5 f;
    private final z0 g;
    private boolean h;
    private final bo.app.p i;
    private final v4 j;
    private final c4 k;
    private final a4 l;
    private final AtomicInteger m;
    private final AtomicInteger n;
    private final ReentrantLock o;
    private com.amazon.aps.iva.se0.j1 p;
    private final v0 q;
    private final t5 r;
    private volatile String s;
    private final AtomicBoolean t;
    private Class u;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }

        public final boolean a(boolean z, p1 p1Var) {
            if (z) {
                if (p1Var.c() == a1.PUSH_ACTION_BUTTON_CLICKED) {
                    return !((v3) p1Var).x();
                }
                return p1Var.c() == a1.PUSH_CLICKED || p1Var.c() == a1.PUSH_STORY_PAGE_CLICK;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a0 b = new a0();

        public a0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Posting feature flags refresh request.";
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
            return "SDK is disabled. Not adding request to dispatch.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b0 b = new b0();

        public b0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Disallowing Content Cards sync due to Content Cards not being enabled.";
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
            return "SDK is disabled. Not closing session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0() {
            super(0);
            o.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Content card sync proceeding: " + o.this.r;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Closed session with activity: " + this.b.getLocalClassName();
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0() {
            super(0);
            o.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Content card sync being throttled: " + o.this.r;
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
            return "SDK is disabled. Not force closing session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e0 b = new e0();

        public e0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Posting geofence request for location.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not logging duplicate error: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f0 b = new f0();

        public f0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Sending Push Max data";
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
            return "Failed to log error.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0() {
            super(0);
            o.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Updated shouldRequestTriggersInNextRequest to: " + o.this.t;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not logging event: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not processing event after validation failed: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not adding user id to event: " + JsonUtils.getPrettyPrintedString((com.amazon.aps.iva.if0.c) this.b.forJsonPut());
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Attempting to log event: " + JsonUtils.getPrettyPrintedString((com.amazon.aps.iva.if0.c) this.b.forJsonPut());
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
            return "Publishing an internal push body clicked event for any awaiting triggers.";
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
            return "Adding push click to dispatcher pending list";
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            o.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((n) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new n(dVar);
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
                if (com.amazon.aps.iva.ab.t.l(1000L, this) == aVar) {
                    return aVar;
                }
            }
            o.this.c();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* renamed from: bo.app.o$o */
    /* loaded from: classes.dex */
    public static final class C0081o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ p1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0081o(p1 p1Var) {
            super(0);
            this.b = p1Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not adding session id to event: " + JsonUtils.getPrettyPrintedString((com.amazon.aps.iva.if0.c) this.b.forJsonPut());
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Logging push delivery event for campaign id: " + this.b;
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
            return "Logging push max campaign";
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
            return "SDK is disabled. Not opening session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s() {
            super(0);
            o.this = r1;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Completed the openSession call. Starting or continuing session " + o.this.c.g();
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
            return "SDK is disabled. Not opening session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Activity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(Activity activity) {
            super(0);
            this.b = activity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Opened session with activity: " + this.b.getLocalClassName();
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
            return "Failed to get local class name for activity when opening session";
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final w b = new w();

        public w() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Flushing Push Delivery Events now";
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final x b = new x();

        public x() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Attempted to flush Push Delivery events, but no events are available";
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Scheduling Push Delivery Events Flush in "), this.b, " ms");
        }
    }

    public o(Context context, String str, String str2, bo.app.t tVar, z1 z1Var, BrazeConfigurationProvider brazeConfigurationProvider, a5 a5Var, z0 z0Var, boolean z, bo.app.p pVar, v4 v4Var, c4 c4Var, a4 a4Var) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str2, "apiKey");
        com.amazon.aps.iva.yb0.j.f(tVar, "sessionManager");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
        com.amazon.aps.iva.yb0.j.f(a5Var, "serverConfigStorageProvider");
        com.amazon.aps.iva.yb0.j.f(z0Var, "eventStorageManager");
        com.amazon.aps.iva.yb0.j.f(pVar, "messagingSessionManager");
        com.amazon.aps.iva.yb0.j.f(v4Var, "sdkEnablementProvider");
        com.amazon.aps.iva.yb0.j.f(c4Var, "pushMaxManager");
        com.amazon.aps.iva.yb0.j.f(a4Var, "pushDeliveryManager");
        this.a = context;
        this.b = str;
        this.c = tVar;
        this.d = z1Var;
        this.e = brazeConfigurationProvider;
        this.f = a5Var;
        this.g = z0Var;
        this.h = z;
        this.i = pVar;
        this.j = v4Var;
        this.k = c4Var;
        this.l = a4Var;
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new ReentrantLock();
        this.p = com.amazon.aps.iva.a60.b.f();
        this.q = new v0(context, a(), str2);
        this.r = new t5(a5Var.f(), a5Var.g());
        this.s = "";
        this.t = new AtomicBoolean(false);
        z1Var.b(s4.class, new com.amazon.aps.iva.y9.d(this, 2));
    }

    @Override // bo.app.r1
    public void closeSession(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
        } else if (this.u != null && !com.amazon.aps.iva.yb0.j.a(activity.getClass(), this.u)) {
        } else {
            this.i.c();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(activity), 2, (Object) null);
            this.c.n();
        }
    }

    @Override // bo.app.r1
    public void d() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, r.b, 2, (Object) null);
            return;
        }
        this.c.l();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new s(), 2, (Object) null);
    }

    @Override // bo.app.r1
    public void e() {
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e.b, 2, (Object) null);
            return;
        }
        this.u = null;
        this.c.k();
    }

    @Override // bo.app.r1
    public void f() {
        if (this.f.t()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, f0.b, 3, (Object) null);
            String baseUrlForRequests = this.e.getBaseUrlForRequests();
            String a2 = a();
            List<c4.a> a3 = this.k.a();
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(a3));
            for (c4.a aVar : a3) {
                arrayList.add(aVar.a());
            }
            a(new e4(baseUrlForRequests, a2, arrayList, this.k.b()));
        }
    }

    public e5 g() {
        return this.c.g();
    }

    @Override // bo.app.r1
    public void openSession(Activity activity) {
        com.amazon.aps.iva.yb0.j.f(activity, "activity");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, t.b, 2, (Object) null);
            return;
        }
        d();
        this.u = activity.getClass();
        this.i.b();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new u(activity), 2, (Object) null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, v.b);
        }
    }

    @Override // bo.app.r1
    public void refreshFeatureFlags() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, a0.b, 3, (Object) null);
        a(new f1(this.e.getBaseUrlForRequests(), a()));
    }

    @Override // bo.app.r1
    public String a() {
        return this.b;
    }

    @Override // bo.app.r1
    public void c() {
        a(new o3.a(null, null, null, null, 15, null));
    }

    public static final void a(o oVar, s4 s4Var) {
        com.amazon.aps.iva.yb0.j.f(oVar, "this$0");
        com.amazon.aps.iva.yb0.j.f(s4Var, "it");
        oVar.a(s4Var.a());
    }

    @Override // bo.app.r1
    public void b(boolean z) {
        this.h = z;
    }

    private final boolean c(Throwable th) {
        ReentrantLock reentrantLock = this.o;
        reentrantLock.lock();
        try {
            this.m.getAndIncrement();
            if (com.amazon.aps.iva.yb0.j.a(this.s, th.getMessage()) && this.n.get() > 3 && this.m.get() < 100) {
                reentrantLock.unlock();
                return true;
            }
            if (com.amazon.aps.iva.yb0.j.a(this.s, th.getMessage())) {
                this.n.getAndIncrement();
            } else {
                this.n.set(0);
            }
            if (this.m.get() >= 100) {
                this.m.set(0);
            }
            this.s = th.getMessage();
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // bo.app.r1
    public void a(boolean z) {
        this.t.set(z);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g0(), 2, (Object) null);
    }

    @Override // bo.app.r1
    public boolean b() {
        return this.t.get();
    }

    @Override // bo.app.r1
    public void b(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        a(th, false);
    }

    @Override // bo.app.r1
    public boolean a(p1 p1Var) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(p1Var, "event");
        boolean z2 = false;
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new h(p1Var), 2, (Object) null);
            return false;
        } else if (!this.q.a(p1Var)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new i(p1Var), 2, (Object) null);
            return false;
        } else {
            if (!this.c.i() && this.c.g() != null) {
                p1Var.a(this.c.g());
                z = false;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new C0081o(p1Var), 3, (Object) null);
                z = true;
            }
            String a2 = a();
            if (a2 == null || a2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                p1Var.a(a());
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(p1Var), 3, (Object) null);
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new k(p1Var), 2, (Object) null);
            if (p1Var.c() == a1.PUSH_CLICKED) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, l.b, 3, (Object) null);
                a((y3) p1Var);
            }
            if (!p1Var.m()) {
                this.g.a(p1Var);
            }
            if (v.a(z, p1Var)) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, m.b, 3, (Object) null);
                this.d.a(m0.e.b(p1Var), m0.class);
            } else {
                this.d.a(m0.e.a(p1Var), m0.class);
            }
            if (p1Var.c() == a1.SESSION_START) {
                this.d.a(m0.e.a(p1Var.s()), m0.class);
            }
            if (z) {
                this.p.a(null);
                this.p = com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new n(null), 3);
            }
            return true;
        }
    }

    @Override // bo.app.r1
    public void b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, q.b, 3, (Object) null);
        if (this.f.t()) {
            this.k.a(str);
        }
    }

    @Override // bo.app.r1
    public void a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        a(th, true);
    }

    @Override // bo.app.r1
    public void a(o3.a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "respondWithBuilder");
        com.amazon.aps.iva.kb0.j a2 = this.f.a();
        if (a2 != null) {
            aVar.a(new n3(((Number) a2.b).longValue(), ((Boolean) a2.c).booleanValue()));
        }
        if (this.t.get()) {
            aVar.c();
        }
        aVar.a(a());
        a(new bo.app.g0(this.e.getBaseUrlForRequests(), aVar.a()));
        this.t.set(false);
    }

    @Override // bo.app.r1
    public void a(IBrazeLocation iBrazeLocation) {
        com.amazon.aps.iva.yb0.j.f(iBrazeLocation, FirebaseAnalytics.Param.LOCATION);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, e0.b, 3, (Object) null);
        a(new j1(this.e.getBaseUrlForRequests(), iBrazeLocation));
    }

    @Override // bo.app.r1
    public void a(s1 s1Var) {
        com.amazon.aps.iva.yb0.j.f(s1Var, "request");
        if (this.j.a()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return;
        }
        s1Var.a(a());
        this.d.a(m0.e.a(s1Var), m0.class);
    }

    @Override // bo.app.r1
    public void a(q5 q5Var, l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(q5Var, "templatedTriggeredAction");
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        a(new p5(this.e.getBaseUrlForRequests(), q5Var, l2Var, a()));
    }

    @Override // bo.app.r1
    public void a(l2 l2Var) {
        com.amazon.aps.iva.yb0.j.f(l2Var, "triggerEvent");
        this.d.a(new a6(l2Var), a6.class);
    }

    @Override // bo.app.r1
    public void a(long j2, long j3, int i2, boolean z) {
        if (!this.f.o()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b0.b, 2, (Object) null);
            return;
        }
        if ((z && this.f.n()) ? this.r.a() : true) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c0(), 2, (Object) null);
            a(new bo.app.a0(this.e.getBaseUrlForRequests(), j2, j3, a(), i2));
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d0(), 2, (Object) null);
    }

    public final void a(Throwable th, boolean z) {
        String[] strArr;
        com.amazon.aps.iva.yb0.j.f(th, "throwable");
        try {
            if (c(th)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new f(th), 2, (Object) null);
                return;
            }
            String th2 = th.toString();
            for (String str : w) {
                Locale locale = Locale.US;
                com.amazon.aps.iva.yb0.j.e(locale, "US");
                String lowerCase = th2.toLowerCase(locale);
                com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (com.amazon.aps.iva.oe0.q.i0(lowerCase, str, false)) {
                    return;
                }
            }
            p1 a2 = bo.app.j.h.a(th, g(), z);
            if (a2 != null) {
                a(a2);
            }
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, g.b);
        }
    }

    public final void a(y3 y3Var) {
        com.amazon.aps.iva.yb0.j.f(y3Var, "notificationTrackingBrazeEvent");
        String optString = y3Var.q().optString("cid", "");
        z1 z1Var = this.d;
        com.amazon.aps.iva.yb0.j.e(optString, "campaignId");
        z1Var.a(new y5(optString, y3Var), y5.class);
    }

    @Override // bo.app.r1
    public void a(long j2) {
        Object systemService = this.a.getSystemService("alarm");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(this.a, BrazeFlushPushDeliveryReceiver.class);
        intent.setAction("com.braze.FLUSH_PUSH_DELIVERY");
        PendingIntent broadcast = PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 134217728);
        if (j2 <= 0) {
            alarmManager.cancel(broadcast);
            List a2 = this.l.a();
            if (!a2.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, w.b, 3, (Object) null);
                a(new b4(this.e.getBaseUrlForRequests(), a(), a2));
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, x.b, 3, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new y(j2), 3, (Object) null);
        alarmManager.set(2, SystemClock.elapsedRealtime() + j2, broadcast);
    }

    @Override // bo.app.r1
    public void a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "campaignId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new p(str), 3, (Object) null);
        this.l.a(str);
    }
}
