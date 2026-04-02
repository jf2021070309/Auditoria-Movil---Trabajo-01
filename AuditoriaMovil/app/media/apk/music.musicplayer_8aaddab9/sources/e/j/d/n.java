package e.j.d;

import c.p.b0;
import c.p.c;
import com.google.android.gms.ads.nativead.NativeAd;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import e.j.d.c0.a0;
import e.j.d.c0.h0;
import e.j.d.k;
import e.j.d.t;
import e.j.d.w;
import h.m.d;
import h.m.i.a.e;
import h.m.i.a.h;
import h.o.b.l;
import h.o.b.p;
import h.o.c.j;
import i.a.e0;
import i.a.z0;
import java.util.Objects;
@h.m.i.a.e(c = "com.zipoapps.premiumhelper.PremiumHelper$doInitialize$3", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n extends h.m.i.a.h implements h.o.b.p<e0, h.m.d<? super h.k>, Object> {
    public final /* synthetic */ k a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, h.m.d<? super n> dVar) {
        super(2, dVar);
        this.a = kVar;
    }

    @Override // h.m.i.a.a
    public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
        return new n(this.a, dVar);
    }

    @Override // h.o.b.p
    public Object i(e0 e0Var, h.m.d<? super h.k> dVar) {
        n nVar = new n(this.a, dVar);
        h.k kVar = h.k.a;
        nVar.invokeSuspend(kVar);
        return kVar;
    }

    @Override // h.m.i.a.a
    public final Object invokeSuspend(Object obj) {
        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
        w.E0(obj);
        final k kVar = this.a;
        k.a aVar2 = k.a;
        Objects.requireNonNull(kVar);
        b0.a.f2438g.a(new c.p.d() { // from class: com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1
            public boolean a;

            /* loaded from: classes2.dex */
            public static final class a extends h.o.c.k implements h.o.b.a<h.k> {
                public final /* synthetic */ k a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(k kVar) {
                    super(0);
                    this.a = kVar;
                }

                @Override // h.o.b.a
                public h.k invoke() {
                    w.Y(z0.a, null, null, new t(this.a, null), 3, null);
                    return h.k.a;
                }
            }

            @e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$2", f = "PremiumHelper.kt", l = {658}, m = "invokeSuspend")
            /* loaded from: classes2.dex */
            public static final class b extends h implements p<e0, d<? super h.k>, Object> {
                public int a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ k f4897b;

                @e(c = "com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$onStart$2$1", f = "PremiumHelper.kt", l = {659}, m = "invokeSuspend")
                /* loaded from: classes2.dex */
                public static final class a extends h implements l<d<? super h.k>, Object> {
                    public int a;

                    /* renamed from: b  reason: collision with root package name */
                    public final /* synthetic */ k f4898b;

                    /* renamed from: com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1$b$a$a  reason: collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C0101a extends h.o.c.k implements l<Object, h.k> {
                        public final /* synthetic */ k a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0101a(k kVar) {
                            super(1);
                            this.a = kVar;
                        }

                        @Override // h.o.b.l
                        public h.k invoke(Object obj) {
                            j.e(obj, "it");
                            this.a.w.b();
                            this.a.f8811h.j("toto_get_config_timestamp", Long.valueOf(System.currentTimeMillis()));
                            this.a.r.t();
                            return h.k.a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(k kVar, d<? super a> dVar) {
                        super(1, dVar);
                        this.f4898b = kVar;
                    }

                    @Override // h.m.i.a.a
                    public final d<h.k> create(d<?> dVar) {
                        return new a(this.f4898b, dVar);
                    }

                    @Override // h.o.b.l
                    public Object invoke(d<? super h.k> dVar) {
                        return new a(this.f4898b, dVar).invokeSuspend(h.k.a);
                    }

                    @Override // h.m.i.a.a
                    public final Object invokeSuspend(Object obj) {
                        h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                        int i2 = this.a;
                        if (i2 == 0) {
                            w.E0(obj);
                            TotoFeature totoFeature = this.f4898b.q;
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
                        w.f0((a0) obj, new C0101a(this.f4898b));
                        return h.k.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(k kVar, d<? super b> dVar) {
                    super(2, dVar);
                    this.f4897b = kVar;
                }

                @Override // h.m.i.a.a
                public final d<h.k> create(Object obj, d<?> dVar) {
                    return new b(this.f4897b, dVar);
                }

                @Override // h.o.b.p
                public Object i(e0 e0Var, d<? super h.k> dVar) {
                    return new b(this.f4897b, dVar).invokeSuspend(h.k.a);
                }

                @Override // h.m.i.a.a
                public final Object invokeSuspend(Object obj) {
                    h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                    int i2 = this.a;
                    if (i2 == 0) {
                        w.E0(obj);
                        k kVar = this.f4897b;
                        h0 h0Var = kVar.w;
                        a aVar2 = new a(kVar, null);
                        this.a = 1;
                        if (h0Var.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    } else if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w.E0(obj);
                    }
                    return h.k.a;
                }
            }

            @Override // c.p.h
            public /* synthetic */ void a(c.p.p pVar) {
                c.d(this, pVar);
            }

            @Override // c.p.h
            public void b(c.p.p pVar) {
                j.e(pVar, "owner");
                this.a = true;
            }

            @Override // c.p.h
            public /* synthetic */ void d(c.p.p pVar) {
                c.c(this, pVar);
            }

            @Override // c.p.h
            public void e(c.p.p pVar) {
                h.k kVar2;
                j.e(pVar, "owner");
                k kVar3 = k.this;
                k.a aVar3 = k.a;
                kVar3.c().k(4, null, " *********** APP IS BACKGROUND *********** ", new Object[0]);
                this.a = false;
                e.j.a.b bVar = k.this.f8815l;
                do {
                    NativeAd b2 = bVar.f8441k.b();
                    if (b2 == null) {
                        kVar2 = null;
                        continue;
                    } else {
                        bVar.b().a(j.i("AdManager: Destroying native ad: ", b2.getHeadline()), new Object[0]);
                        b2.destroy();
                        kVar2 = h.k.a;
                        continue;
                    }
                } while (kVar2 != null);
            }

            @Override // c.p.h
            public /* synthetic */ void f(c.p.p pVar) {
                c.b(this, pVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:40:0x011f  */
            @Override // c.p.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void h(c.p.p r12) {
                /*
                    Method dump skipped, instructions count: 584
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.PremiumHelper$registerProcessLifecycleCallbacks$1.h(c.p.p):void");
            }
        });
        e.j.a.k kVar2 = this.a.p;
        if (!kVar2.f8475c.g()) {
            kVar2.a.registerActivityLifecycleCallbacks(new e.j.a.i(kVar2));
            kVar2.a.registerActivityLifecycleCallbacks(new e.j.d.c0.e(k.a.a().f8812i.J.getMainActivityClass(), new e.j.a.j(kVar2)));
        }
        return h.k.a;
    }
}
