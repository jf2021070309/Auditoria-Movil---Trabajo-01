package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.google.common.primitives.Ints;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes.dex */
public final class t {
    public static final a l = new a(null);
    private static final long m;
    private static final long n;
    private final Context a;
    private final i2 b;
    private final z1 c;
    private final z1 d;
    private final AlarmManager e;
    private final int f;
    private final boolean g;
    private final ReentrantLock h;
    private final String i;
    private com.amazon.aps.iva.se0.j1 j;
    private e3 k;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final long a() {
            return t.n;
        }

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a(double r6, double r8, int r10, boolean r11) {
            /*
                r5 = this;
                long r0 = com.braze.support.DateTimeUtils.nowInMilliseconds()
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                long r3 = (long) r10
                long r3 = r2.toMillis(r3)
                if (r11 == 0) goto L1d
                long r6 = (long) r6
                long r6 = r2.toMillis(r6)
                long r6 = r6 + r3
                long r8 = r5.a()
                long r8 = r8 + r6
                int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r6 > 0) goto L29
                goto L27
            L1d:
                long r6 = (long) r8
                long r6 = r2.toMillis(r6)
                long r6 = r6 + r3
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 > 0) goto L29
            L27:
                r6 = 1
                goto L2a
            L29:
                r6 = 0
            L2a:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.app.t.a.a(double, double, int, boolean):boolean");
        }

        public final long a(e3 e3Var, int i, boolean z) {
            com.amazon.aps.iva.yb0.j.f(e3Var, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i);
            if (z) {
                long millis2 = timeUnit.toMillis((long) e3Var.x());
                return Math.max(a(), (millis2 + millis) - DateTimeUtils.nowInMilliseconds());
            }
            return millis;
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
            return "Cancelling session seal alarm";
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
            return "Failed to cancel session seal alarm";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j) {
            super(0);
            this.b = j;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Creating a session seal alarm with a delay of "), this.b, " ms");
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
            return "Failed to create session seal alarm";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ e3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e3 e3Var) {
            super(0);
            this.b = e3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Clearing completely dispatched sealed session " + this.b.s();
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ e3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e3 e3Var) {
            super(0);
            this.b = e3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "New session created with ID: " + this.b.s();
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
            return "Getting the stored open session";
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ e3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e3 e3Var) {
            super(0);
            this.b = e3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Checking if this session needs to be sealed: " + this.b.s();
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ e3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e3 e3Var) {
            super(0);
            this.b = e3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Session [" + this.b.s() + "] being sealed because its end time is over the grace period. Session: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends BroadcastReceiver {

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Session seal logic executing in broadcast";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            private /* synthetic */ Object c;
            final /* synthetic */ t d;
            final /* synthetic */ BroadcastReceiver.PendingResult e;

            /* loaded from: classes.dex */
            public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
                public static final a b = new a();

                public a() {
                    super(0);
                }

                @Override // com.amazon.aps.iva.xb0.a
                /* renamed from: a */
                public final String invoke() {
                    return "Failed to log throwable during seal session.";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, BroadcastReceiver.PendingResult pendingResult, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.d = tVar;
                this.e = pendingResult;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                b bVar = new b(this.d, this.e, dVar);
                bVar.c = obj;
                return bVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    com.amazon.aps.iva.se0.g0 g0Var = (com.amazon.aps.iva.se0.g0) this.c;
                    ReentrantLock reentrantLock = this.d.h;
                    t tVar = this.d;
                    reentrantLock.lock();
                    try {
                        try {
                            tVar.j();
                        } catch (Exception e) {
                            try {
                                tVar.c.a(e, Throwable.class);
                            } catch (Exception e2) {
                                BrazeLogger.INSTANCE.brazelog(g0Var, BrazeLogger.Priority.E, e2, a.b);
                            }
                        }
                        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                        reentrantLock.unlock();
                        this.e.finish();
                        return com.amazon.aps.iva.kb0.q.a;
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.yb0.j.f(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, a.b, 2, (Object) null);
            com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new b(t.this, goAsync(), null), 3);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        private /* synthetic */ Object c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Requesting data flush on internal session close flush timer.";
            }
        }

        public l(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((l) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            l lVar = new l(dVar);
            lVar.c = obj;
            return lVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.se0.g0 g0Var;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    g0Var = (com.amazon.aps.iva.se0.g0) this.c;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.se0.g0 g0Var2 = (com.amazon.aps.iva.se0.g0) this.c;
                long j = t.m;
                this.c = g0Var2;
                this.b = 1;
                if (com.amazon.aps.iva.ab.t.l(j, this) == aVar) {
                    return aVar;
                }
                g0Var = g0Var2;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g0Var, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            Braze.Companion.getInstance(t.this.a).requestImmediateDataFlush();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ e3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(e3 e3Var) {
            super(0);
            this.b = e3Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Closed session with id " + this.b.s();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m = timeUnit.toMillis(10L);
        n = timeUnit.toMillis(10L);
    }

    public t(Context context, i2 i2Var, z1 z1Var, z1 z1Var2, AlarmManager alarmManager, int i2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(context, "applicationContext");
        com.amazon.aps.iva.yb0.j.f(i2Var, "sessionStorageManager");
        com.amazon.aps.iva.yb0.j.f(z1Var, "internalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(z1Var2, "externalEventPublisher");
        com.amazon.aps.iva.yb0.j.f(alarmManager, "alarmManager");
        this.a = context;
        this.b = i2Var;
        this.c = z1Var;
        this.d = z1Var2;
        this.e = alarmManager;
        this.f = i2;
        this.g = z;
        this.h = new ReentrantLock();
        this.j = com.amazon.aps.iva.a60.b.f();
        k kVar = new k();
        String str = context.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.i = str;
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(kVar, new IntentFilter(str), 4);
        } else {
            context.registerReceiver(kVar, new IntentFilter(str));
        }
    }

    private final void e() {
        e3 e3Var = this.k;
        if (e3Var != null) {
            long a2 = l.a(e3Var, this.f, this.g);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new d(a2), 3, (Object) null);
            try {
                Intent intent = new Intent(this.i);
                intent.putExtra("session_id", e3Var.toString());
                this.e.set(1, DateTimeUtils.nowInMilliseconds() + a2, PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | Ints.MAX_POWER_OF_TWO));
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, e.b);
            }
        }
    }

    private final boolean f() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            e3 e3Var = this.k;
            boolean z = false;
            if (e3Var != null && !e3Var.y()) {
                if (e3Var.w() != null) {
                    e3Var.a((Double) null);
                    z = true;
                }
                return z;
            }
            h();
            if (e3Var != null && e3Var.y()) {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(e3Var), 3, (Object) null);
                this.b.a(e3Var.s().toString());
            }
            z = true;
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void h() {
        e3 e3Var = new e3(null, 0.0d, null, false, 15, null);
        this.k = e3Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new g(e3Var), 2, (Object) null);
        this.c.a(new d5(e3Var), d5.class);
        this.d.a(new SessionStateChangedEvent(e3Var.s().toString(), SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        e5 e5Var;
        e3 e3Var;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.k == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
                c5 a2 = this.b.a();
                if (a2 != null) {
                    e3Var = a2.z();
                } else {
                    e3Var = null;
                }
                this.k = e3Var;
            }
            e3 e3Var2 = this.k;
            if (e3Var2 != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new i(e3Var2), 3, (Object) null);
                Double w = e3Var2.w();
                if (w != null && !e3Var2.y() && l.a(e3Var2.x(), w.doubleValue(), this.f, this.g)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new j(e3Var2), 2, (Object) null);
                    k();
                    i2 i2Var = this.b;
                    e3 e3Var3 = this.k;
                    if (e3Var3 != null) {
                        e5Var = e3Var3.s();
                    } else {
                        e5Var = null;
                    }
                    i2Var.a(String.valueOf(e5Var));
                    this.k = null;
                }
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final e5 g() {
        e5 e5Var;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            e3 e3Var = this.k;
            if (e3Var != null) {
                e5Var = e3Var.s();
            } else {
                e5Var = null;
            }
            return e5Var;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r1.y() == true) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.h
            r0.lock()
            bo.app.e3 r1 = r3.k     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L11
            boolean r1 = r1.y()     // Catch: java.lang.Throwable -> L16
            r2 = 1
            if (r1 != r2) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            r0.unlock()
            return r2
        L16:
            r1 = move-exception
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.t.i():boolean");
    }

    public final void k() {
        e3 e3Var = this.k;
        if (e3Var != null) {
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                e3Var.A();
                this.b.a(e3Var);
                this.c.a(new f5(e3Var), f5.class);
                this.d.a(new SessionStateChangedEvent(e3Var.s().toString(), SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void l() {
        e3 e3Var;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (f() && (e3Var = this.k) != null) {
                this.b.a(e3Var);
            }
            d();
            c();
            this.c.a(g5.b, g5.class);
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void m() {
        this.j.a(null);
        this.j = com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new l(null), 3);
    }

    public final void n() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            f();
            e3 e3Var = this.k;
            if (e3Var != null) {
                e3Var.a(Double.valueOf(DateTimeUtils.nowInSecondsPrecise()));
                this.b.a(e3Var);
                m();
                e();
                this.c.a(i5.b, i5.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(e3Var), 3, (Object) null);
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    private final void c() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
        try {
            Intent intent = new Intent(this.i);
            intent.putExtra("session_id", String.valueOf(this.k));
            this.e.cancel(PendingIntent.getBroadcast(this.a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | Ints.MAX_POWER_OF_TWO));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, c.b);
        }
    }

    public final void d() {
        this.j.a(null);
    }
}
