package e.j.d;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentManager;
import c.c0.c;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import e.j.d.b0.c.g;
import e.j.d.b0.d.e;
import e.j.d.c0.a0;
import e.j.d.c0.b0;
import e.j.d.c0.d0;
import e.j.d.c0.f0;
import e.j.d.c0.h0;
import e.j.d.c0.z;
import e.j.d.y.b;
import i.a.e0;
import i.a.j0;
import i.a.z0;
import java.util.List;
import java.util.Objects;
import n.a.a;
/* loaded from: classes.dex */
public final class k {
    public static final a a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ h.r.f<Object>[] f8805b;

    /* renamed from: c  reason: collision with root package name */
    public static k f8806c;

    /* renamed from: d  reason: collision with root package name */
    public final Application f8807d;

    /* renamed from: e  reason: collision with root package name */
    public final e.j.d.z.d f8808e = new e.j.d.z.d("PremiumHelper");

    /* renamed from: f  reason: collision with root package name */
    public final e.j.d.y.d.a f8809f;

    /* renamed from: g  reason: collision with root package name */
    public final e.j.d.c0.g f8810g;

    /* renamed from: h  reason: collision with root package name */
    public final i f8811h;

    /* renamed from: i  reason: collision with root package name */
    public final e.j.d.y.b f8812i;

    /* renamed from: j  reason: collision with root package name */
    public final e.j.d.b f8813j;

    /* renamed from: k  reason: collision with root package name */
    public final z f8814k;

    /* renamed from: l  reason: collision with root package name */
    public final e.j.a.b f8815l;

    /* renamed from: m  reason: collision with root package name */
    public final e.j.d.b0.d.e f8816m;

    /* renamed from: n  reason: collision with root package name */
    public final e.j.d.b0.c.g f8817n;
    public final e.j.d.b0.a.a o;
    public final e.j.a.k p;
    public final TotoFeature q;
    public final e.j.d.c0.i r;
    public final i.a.h2.k<Boolean> s;
    public final i.a.h2.r<Boolean> t;
    public final h.d u;
    public final f0 v;
    public final h0 w;

    /* loaded from: classes2.dex */
    public static final class a {
        public a(h.o.c.f fVar) {
        }

        public final k a() {
            k kVar = k.f8806c;
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalStateException("Please call getInstance() with context first".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends h.o.c.k implements h.o.b.a<h.k> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f8818b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ FullScreenContentCallback f8819c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ boolean f8820d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, FullScreenContentCallback fullScreenContentCallback, boolean z) {
            super(0);
            this.f8818b = activity;
            this.f8819c = fullScreenContentCallback;
            this.f8820d = z;
        }

        @Override // h.o.b.a
        public h.k invoke() {
            k kVar = k.this;
            Activity activity = this.f8818b;
            FullScreenContentCallback fullScreenContentCallback = this.f8819c;
            boolean z = this.f8820d;
            e.j.a.b bVar = kVar.f8815l;
            u uVar = new u(fullScreenContentCallback, kVar, activity);
            Objects.requireNonNull(bVar);
            h.o.c.j.e(activity, "activity");
            if (activity instanceof c.p.p) {
                w.Y(c.p.q.a((c.p.p) activity), null, null, new e.j.a.g(bVar, uVar, z, activity, null), 3, null);
            }
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h.o.c.k implements h.o.b.a<h.k> {
        public final /* synthetic */ FullScreenContentCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(FullScreenContentCallback fullScreenContentCallback) {
            super(0);
            this.a = fullScreenContentCallback;
        }

        @Override // h.o.b.a
        public h.k invoke() {
            FullScreenContentCallback fullScreenContentCallback = this.a;
            if (fullScreenContentCallback != null) {
                fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(-2, "CAPPING_SKIP", "CAPPING"));
            }
            return h.k.a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends FullScreenContentCallback {
        public final /* synthetic */ h.o.b.a<h.k> a;

        public d(h.o.b.a<h.k> aVar) {
            this.a = aVar;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            h.o.b.a<h.k> aVar = this.a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(AdError adError) {
            h.o.c.j.e(adError, "p0");
            h.o.b.a<h.k> aVar = this.a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper", f = "PremiumHelper.kt", l = {289}, m = "waitForInitComplete")
    /* loaded from: classes2.dex */
    public static final class e extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8821b;

        /* renamed from: d  reason: collision with root package name */
        public int f8823d;

        public e(h.m.d<? super e> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8821b = obj;
            this.f8823d |= Level.ALL_INT;
            return k.this.n(this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2", f = "PremiumHelper.kt", l = {304}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super List<? extends Boolean>>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8824b;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$1", f = "PremiumHelper.kt", l = {304}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super List<? extends Boolean>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ j0<Boolean> f8826b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ j0<Boolean> f8827c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j0<Boolean> j0Var, j0<Boolean> j0Var2, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.f8826b = j0Var;
                this.f8827c = j0Var2;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new a(this.f8826b, this.f8827c, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super List<? extends Boolean>> dVar) {
                return new a(this.f8826b, this.f8827c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    j0[] j0VarArr = {this.f8826b, this.f8827c};
                    this.a = 1;
                    obj = w.j(j0VarArr, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                return obj;
            }
        }

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1", f = "PremiumHelper.kt", l = {298}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super Boolean>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f8828b;

            @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1$1", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class a extends h.m.i.a.h implements h.o.b.p<Boolean, h.m.d<? super Boolean>, Object> {
                public /* synthetic */ boolean a;

                public a(h.m.d<? super a> dVar) {
                    super(2, dVar);
                }

                @Override // h.m.i.a.a
                public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                    a aVar = new a(dVar);
                    aVar.a = ((Boolean) obj).booleanValue();
                    return aVar;
                }

                @Override // h.o.b.p
                public Object i(Boolean bool, h.m.d<? super Boolean> dVar) {
                    Boolean valueOf = Boolean.valueOf(bool.booleanValue());
                    a aVar = new a(dVar);
                    aVar.a = valueOf.booleanValue();
                    h.k kVar = h.k.a;
                    h.m.h.a aVar2 = h.m.h.a.COROUTINE_SUSPENDED;
                    w.E0(kVar);
                    return Boolean.valueOf(aVar.a);
                }

                @Override // h.m.i.a.a
                public final Object invokeSuspend(Object obj) {
                    h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                    w.E0(obj);
                    return Boolean.valueOf(this.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, h.m.d<? super b> dVar) {
                super(2, dVar);
                this.f8828b = kVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new b(this.f8828b, dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super Boolean> dVar) {
                return new b(this.f8828b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    if (!this.f8828b.t.getValue().booleanValue()) {
                        i.a.h2.r<Boolean> rVar = this.f8828b.t;
                        a aVar2 = new a(null);
                        this.a = 1;
                        if (w.F(rVar, aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                return Boolean.TRUE;
            }
        }

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$minSplashTimeout$1", f = "PremiumHelper.kt", l = {292}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super Boolean>, Object> {
            public int a;

            public c(h.m.d<? super c> dVar) {
                super(2, dVar);
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new c(dVar);
            }

            @Override // h.o.b.p
            public Object i(e0 e0Var, h.m.d<? super Boolean> dVar) {
                return new c(dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    this.a = 1;
                    if (w.z(1500L, this) == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                return Boolean.TRUE;
            }
        }

        public f(h.m.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f8824b = obj;
            return fVar;
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super List<? extends Boolean>> dVar) {
            f fVar = new f(dVar);
            fVar.f8824b = e0Var;
            return fVar.invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                e0 e0Var = (e0) this.f8824b;
                j0 i3 = w.i(e0Var, null, null, new c(null), 3, null);
                j0 i4 = w.i(e0Var, null, null, new b(k.this, null), 3, null);
                long j2 = k.this.f8811h.i() ? 20000L : AbstractComponentTracker.LINGERING_TIMEOUT;
                a aVar2 = new a(i3, i4, null);
                this.a = 1;
                obj = i.a.g.a(j2, aVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return obj;
        }
    }

    static {
        h.o.c.n nVar = new h.o.c.n(k.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(h.o.c.r.a);
        f8805b = new h.r.f[]{nVar};
        a = new a(null);
    }

    public k(Application application, PremiumHelperConfiguration premiumHelperConfiguration, h.o.c.f fVar) {
        this.f8807d = application;
        e.j.d.y.d.a aVar = new e.j.d.y.d.a();
        this.f8809f = aVar;
        e.j.d.c0.g gVar = new e.j.d.c0.g(application);
        this.f8810g = gVar;
        i iVar = new i(application);
        this.f8811h = iVar;
        e.j.d.y.b bVar = new e.j.d.y.b(application, aVar, premiumHelperConfiguration);
        this.f8812i = bVar;
        this.f8813j = new e.j.d.b(application, bVar, iVar);
        this.f8814k = new z(application);
        e.j.a.b bVar2 = new e.j.a.b(application);
        this.f8815l = bVar2;
        this.f8816m = new e.j.d.b0.d.e(application, iVar, bVar);
        e.j.d.b0.c.g gVar2 = new e.j.d.b0.c.g(bVar, iVar);
        this.f8817n = gVar2;
        this.o = new e.j.d.b0.a.a(gVar2, bVar, iVar);
        this.p = new e.j.a.k(application, bVar2, iVar);
        this.q = new TotoFeature(application, bVar, iVar);
        this.r = new e.j.d.c0.i(application, bVar, iVar, gVar);
        i.a.h2.k<Boolean> a2 = i.a.h2.t.a(Boolean.FALSE);
        this.s = a2;
        this.t = w.h(a2);
        this.u = w.Z(new o(this));
        this.v = new f0(300000L, 0L, true);
        this.w = new h0(((Number) bVar.f(e.j.d.y.b.A)).longValue() * 3600000, ((Number) iVar.b("toto_get_config_timestamp", 0L)).longValue(), false);
        try {
            c.c0.d0.l.d(application, new c.c0.c(new c.a()));
        } catch (Exception unused) {
            n.a.a.f9946d.g("WorkManager already initialized", new Object[0]);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x0097
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final java.lang.Object a(e.j.d.k r17, h.m.d r18) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.k.a(e.j.d.k, h.m.d):java.lang.Object");
    }

    public static final void b(k kVar) {
        Application application = kVar.f8807d;
        h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        String j2 = b0.j(application);
        boolean z = true;
        if (!(j2 == null || j2.length() == 0) && !h.o.c.j.a(j2, application.getPackageName())) {
            z = false;
        }
        if (!z) {
            kVar.c().b(h.o.c.j.i("PremiumHelper initialization disabled for process ", b0.j(kVar.f8807d)), new Object[0]);
            return;
        }
        if (kVar.f8812i.j()) {
            n.a.a.a(new a.b());
        } else {
            n.a.a.a(new e.j.d.z.b(kVar.f8807d));
        }
        n.a.a.a(new e.j.d.z.a(kVar.f8807d, kVar.f8812i.j()));
        try {
            w.Y(z0.a, null, null, new v(kVar, null), 3, null);
        } catch (Exception e2) {
            kVar.c().k(6, e2, "Initialization failed", new Object[0]);
        }
    }

    public static final void g(Application application, PremiumHelperConfiguration premiumHelperConfiguration) {
        a aVar = a;
        Objects.requireNonNull(aVar);
        h.o.c.j.e(application, "application");
        h.o.c.j.e(premiumHelperConfiguration, "appConfiguration");
        if (f8806c != null) {
            return;
        }
        synchronized (aVar) {
            if (f8806c == null) {
                k kVar = new k(application, premiumHelperConfiguration, null);
                f8806c = kVar;
                b(kVar);
            }
        }
    }

    public static void l(k kVar, String str, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        h.o.c.j.e(str, "source");
        e.a aVar = e.j.d.b0.d.e.a;
        Application application = kVar.f8807d;
        Objects.requireNonNull(aVar);
        h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
        h.o.c.j.e(str, "source");
        Intent putExtra = new Intent(application, RelaunchPremiumActivity.class).putExtra("source", str).putExtra("theme", i2);
        h.o.c.j.d(putExtra, "Intent(context, Relaunch…ctivity.ARG_THEME, theme)");
        putExtra.addFlags(268435456);
        if (i3 != -1) {
            putExtra.addFlags(i3);
        }
        application.startActivity(putExtra);
    }

    public static void m(k kVar, FragmentManager fragmentManager, int i2, g.a aVar, int i3) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        int i4 = i3 & 4;
        h.o.c.j.e(fragmentManager, "fm");
        e.j.d.b0.c.g gVar = kVar.f8817n;
        h.r.f<Object>[] fVarArr = e.j.d.b0.c.g.a;
        gVar.e(fragmentManager, i2, false, null);
    }

    public final e.j.d.z.c c() {
        return this.f8808e.a(this, f8805b[0]);
    }

    public final Object d(b.a.d dVar, h.m.d<? super a0<h>> dVar2) {
        return this.r.l(dVar, dVar2);
    }

    public final boolean e() {
        return this.f8811h.g();
    }

    public final void f() {
        SharedPreferences.Editor edit = this.f8811h.a.edit();
        edit.putBoolean("is_next_app_start_ignored", true);
        edit.apply();
    }

    public final boolean h() {
        return this.f8812i.J.getIntroActivityClass() == null || ((Boolean) this.f8811h.b("intro_complete", Boolean.FALSE)).booleanValue();
    }

    public final i.a.h2.b<d0> i(Activity activity, h hVar) {
        h.o.c.j.e(activity, "activity");
        h.o.c.j.e(hVar, "offer");
        e.j.d.c0.i iVar = this.r;
        Objects.requireNonNull(iVar);
        h.o.c.j.e(activity, "activity");
        h.o.c.j.e(hVar, "offer");
        w.Y(c.p.q.a((c.p.p) activity), null, null, new e.j.d.c0.n(hVar, iVar, activity, null), 3, null);
        i.a.h2.n<d0> nVar = iVar.f8655k;
        h.o.b.l<Object, Object> lVar = i.a.h2.d.a;
        if (nVar instanceof i.a.h2.r) {
            return nVar;
        }
        h.o.b.l<Object, Object> lVar2 = i.a.h2.d.a;
        h.o.b.p<Object, Object, Boolean> pVar = i.a.h2.d.f9004b;
        if (nVar instanceof i.a.h2.a) {
            i.a.h2.a aVar = (i.a.h2.a) nVar;
            if (aVar.f8998b == lVar2 && aVar.f8999c == pVar) {
                return nVar;
            }
        }
        return new i.a.h2.a(nVar, lVar2, pVar);
    }

    public final void j(Activity activity, FullScreenContentCallback fullScreenContentCallback, boolean z) {
        h.o.c.j.e(activity, "activity");
        if (!this.f8811h.g()) {
            ((f0) this.u.getValue()).a(new b(activity, fullScreenContentCallback, z), new c(fullScreenContentCallback));
        } else if (fullScreenContentCallback == null) {
        } else {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(new AdError(-3, "PURCHASED", "PURCHASED"));
        }
    }

    public final void k(Activity activity, h.o.b.a<h.k> aVar) {
        h.o.c.j.e(activity, "activity");
        d dVar = new d(aVar);
        h.o.c.j.e(activity, "activity");
        j(activity, dVar, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(h.m.d<? super e.j.d.c0.a0<h.k>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e.j.d.k.e
            if (r0 == 0) goto L13
            r0 = r8
            e.j.d.k$e r0 = (e.j.d.k.e) r0
            int r1 = r0.f8823d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8823d = r1
            goto L18
        L13:
            e.j.d.k$e r0 = new e.j.d.k$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8821b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8823d
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r0 = r0.a
            e.j.d.k r0 = (e.j.d.k) r0
            e.j.d.w.E0(r8)     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            goto L4d
        L2d:
            r8 = move-exception
            goto L7c
        L2f:
            r8 = move-exception
            goto L5e
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            e.j.d.w.E0(r8)
            e.j.d.k$f r8 = new e.j.d.k$f     // Catch: java.lang.Exception -> L59 i.a.z1 -> L5c
            r8.<init>(r3)     // Catch: java.lang.Exception -> L59 i.a.z1 -> L5c
            r0.a = r7     // Catch: java.lang.Exception -> L59 i.a.z1 -> L5c
            r0.f8823d = r5     // Catch: java.lang.Exception -> L59 i.a.z1 -> L5c
            java.lang.Object r8 = e.j.d.w.v(r8, r0)     // Catch: java.lang.Exception -> L59 i.a.z1 -> L5c
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r0 = r7
        L4d:
            e.j.d.b r8 = r0.f8813j     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            r8.f8528f = r4     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            e.j.d.c0.a0$c r8 = new e.j.d.c0.a0$c     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            h.k r1 = h.k.a     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            r8.<init>(r1)     // Catch: java.lang.Exception -> L2d i.a.z1 -> L2f
            goto L8c
        L59:
            r8 = move-exception
            r0 = r7
            goto L7c
        L5c:
            r8 = move-exception
            r0 = r7
        L5e:
            e.j.d.z.c r1 = r0.c()     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "Initialization timeout expired: "
            java.lang.String r6 = r8.getMessage()     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = h.o.c.j.i(r2, r6)     // Catch: java.lang.Exception -> L2d
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2d
            r1.b(r2, r6)     // Catch: java.lang.Exception -> L2d
            e.j.d.b r1 = r0.f8813j     // Catch: java.lang.Exception -> L2d
            r1.f8528f = r5     // Catch: java.lang.Exception -> L2d
            e.j.d.c0.a0$b r1 = new e.j.d.c0.a0$b     // Catch: java.lang.Exception -> L2d
            r1.<init>(r8)     // Catch: java.lang.Exception -> L2d
            r8 = r1
            goto L8c
        L7c:
            e.j.d.z.c r0 = r0.c()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r2 = 6
            r0.k(r2, r8, r3, r1)
            e.j.d.c0.a0$b r0 = new e.j.d.c0.a0$b
            r0.<init>(r8)
            r8 = r0
        L8c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.k.n(h.m.d):java.lang.Object");
    }
}
