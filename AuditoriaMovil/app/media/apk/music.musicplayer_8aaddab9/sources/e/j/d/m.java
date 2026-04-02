package e.j.d;

import android.app.Application;
import com.google.android.gms.tasks.Tasks;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import e.d.d.y.o;
import e.j.d.c0.a0;
import e.j.d.c0.h0;
import i.a.c0;
import i.a.e0;
import i.a.j0;
import i.a.o0;
import java.util.List;
import java.util.concurrent.Callable;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2", f = "PremiumHelper.kt", l = {589}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super List<? extends Object>>, Object> {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f8833b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f8834c;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$1", f = "PremiumHelper.kt", l = {592}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f8835b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, h.m.d<? super a> dVar) {
            super(2, dVar);
            this.f8835b = kVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new a(this.f8835b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new a(this.f8835b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                k kVar = this.f8835b;
                e.j.a.b bVar = kVar.f8815l;
                boolean z = kVar.f8812i.j() && this.f8835b.f8812i.J.getAdManagerTestAds();
                this.a = 1;
                bVar.f8440j = z;
                Object v = w.v(new e.j.a.c(bVar, null), this);
                if (v != obj2) {
                    v = h.k.a;
                }
                if (v == obj2) {
                    return obj2;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return h.k.a;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$2", f = "PremiumHelper.kt", l = {596}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super Boolean>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f8836b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, h.m.d<? super b> dVar) {
            super(2, dVar);
            this.f8836b = kVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new b(this.f8836b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super Boolean> dVar) {
            return new b(this.f8836b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                k kVar = this.f8836b;
                this.a = 1;
                obj = kVar.r.j(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            this.f8836b.v.b();
            return Boolean.valueOf(((a0) obj) instanceof a0.c);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$3", f = "PremiumHelper.kt", l = {603}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super Boolean>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f8837b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, h.m.d<? super c> dVar) {
            super(2, dVar);
            this.f8837b = kVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new c(this.f8837b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super Boolean> dVar) {
            return new c(this.f8837b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            e.d.d.y.j b2;
            o.b bVar;
            long j2;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                k kVar = this.f8837b;
                e.j.d.y.d.a aVar2 = kVar.f8809f;
                Application application = kVar.f8807d;
                boolean j3 = kVar.f8812i.j();
                this.a = 1;
                aVar2.f8890d = j3;
                try {
                    b2 = e.d.d.y.j.b();
                } catch (IllegalStateException unused) {
                    e.d.d.g.f(application);
                    b2 = e.d.d.y.j.b();
                }
                h.o.c.j.d(b2, "try {\n        FirebaseRe…onfig.getInstance()\n    }");
                aVar2.f8888b = b2;
                i.a.k kVar2 = new i.a.k(w.P(this), 1);
                kVar2.p();
                try {
                    bVar = new o.b();
                    j2 = j3 ? 0L : 43200L;
                } catch (Throwable th) {
                    if (kVar2.a()) {
                        kVar2.resumeWith(w.y(th));
                    }
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j2 + " is an invalid argument");
                }
                bVar.a = j2;
                final e.d.d.y.o oVar = new e.d.d.y.o(bVar, null);
                h.o.c.j.d(oVar, "Builder()\n              …                 .build()");
                long currentTimeMillis = System.currentTimeMillis();
                final e.d.d.y.j jVar = aVar2.f8888b;
                if (jVar == null) {
                    h.o.c.j.k("firebaseRemoteConfig");
                    throw null;
                }
                Tasks.call(jVar.f7740b, new Callable() { // from class: e.d.d.y.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        j jVar2 = j.this;
                        o oVar2 = oVar;
                        e.d.d.y.r.n nVar = jVar2.f7746h;
                        synchronized (nVar.f7797d) {
                            nVar.f7796c.edit().putLong("fetch_timeout_in_seconds", oVar2.a).putLong("minimum_fetch_interval_in_seconds", oVar2.f7748b).commit();
                        }
                        return null;
                    }
                }).continueWithTask(new e.j.d.y.d.c(aVar2, currentTimeMillis, j3, kVar2));
                obj = kVar2.o();
                if (obj == h.m.h.a.COROUTINE_SUSPENDED) {
                    h.o.c.j.e(this, "frame");
                }
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

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$4", f = "PremiumHelper.kt", l = {608}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ k f8838b;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$2$4$1", f = "PremiumHelper.kt", l = {609}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.l<h.m.d<? super h.k>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ k f8839b;

            /* renamed from: e.j.d.m$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0192a extends h.o.c.k implements h.o.b.l<Object, h.k> {
                public final /* synthetic */ k a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0192a(k kVar) {
                    super(1);
                    this.a = kVar;
                }

                @Override // h.o.b.l
                public h.k invoke(Object obj) {
                    h.o.c.j.e(obj, "it");
                    this.a.w.b();
                    this.a.f8811h.j("toto_get_config_timestamp", Long.valueOf(System.currentTimeMillis()));
                    this.a.r.t();
                    return h.k.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, h.m.d<? super a> dVar) {
                super(1, dVar);
                this.f8839b = kVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(h.m.d<?> dVar) {
                return new a(this.f8839b, dVar);
            }

            @Override // h.o.b.l
            public Object invoke(h.m.d<? super h.k> dVar) {
                return new a(this.f8839b, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    w.E0(obj);
                    TotoFeature totoFeature = this.f8839b.q;
                    this.a = 1;
                    obj = totoFeature.getConfig(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    w.E0(obj);
                }
                w.f0((a0) obj, new C0192a(this.f8839b));
                return h.k.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(k kVar, h.m.d<? super d> dVar) {
            super(2, dVar);
            this.f8838b = kVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new d(this.f8838b, dVar);
        }

        @Override // h.o.b.p
        public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
            return new d(this.f8838b, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                w.E0(obj);
                if (((Boolean) this.f8838b.f8812i.f(e.j.d.y.b.z)).booleanValue()) {
                    k kVar = this.f8838b;
                    h0 h0Var = kVar.w;
                    a aVar2 = new a(kVar, null);
                    this.a = 1;
                    if (h0Var.a(aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                w.E0(obj);
            }
            return h.k.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, h.m.d<? super m> dVar) {
        super(2, dVar);
        this.f8834c = kVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        m mVar = new m(this.f8834c, dVar);
        mVar.f8833b = obj;
        return mVar;
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super List<? extends Object>> dVar) {
        m mVar = new m(this.f8834c, dVar);
        mVar.f8833b = e0Var;
        return mVar.invokeSuspend(h.k.a);
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        int i2 = this.a;
        if (i2 == 0) {
            w.E0(obj);
            e0 e0Var = (e0) this.f8833b;
            c0 c0Var = o0.f9155b;
            j0[] j0VarArr = {w.i(e0Var, c0Var, null, new a(this.f8834c, null), 2, null), w.i(e0Var, c0Var, null, new b(this.f8834c, null), 2, null), w.i(e0Var, c0Var, null, new c(this.f8834c, null), 2, null), w.i(e0Var, c0Var, null, new d(this.f8834c, null), 2, null)};
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
