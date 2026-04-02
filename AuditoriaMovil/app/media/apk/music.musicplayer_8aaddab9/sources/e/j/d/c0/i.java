package e.j.d.c0;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import androidx.appcompat.app.AlertController;
import c.b.c.i;
import c.c0.d;
import c.c0.t;
import ch.qos.logback.classic.Level;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.zipoapps.premiumhelper.AcknowledgePurchaseWorker;
import com.zipoapps.premiumhelper.toto.TotoFeature;
import com.zipoapps.premiumhelper.util.ActivePurchaseInfo;
import e.j.d.c0.a0;
import i.a.j0;
import i.a.k0;
import i.a.o0;
import i.a.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class i implements e.a.a.a.p {
    public static final /* synthetic */ h.r.f<Object>[] a;

    /* renamed from: b  reason: collision with root package name */
    public final Application f8646b;

    /* renamed from: c  reason: collision with root package name */
    public final e.j.d.y.b f8647c;

    /* renamed from: d  reason: collision with root package name */
    public final e.j.d.i f8648d;

    /* renamed from: e  reason: collision with root package name */
    public final e.j.d.c0.g f8649e;

    /* renamed from: f  reason: collision with root package name */
    public final e.j.d.z.d f8650f;

    /* renamed from: g  reason: collision with root package name */
    public final e.j.d.f f8651g;

    /* renamed from: h  reason: collision with root package name */
    public final i.a.h2.k<Boolean> f8652h;

    /* renamed from: i  reason: collision with root package name */
    public final i.a.h2.r<Boolean> f8653i;

    /* renamed from: j  reason: collision with root package name */
    public final i.a.h2.j<d0> f8654j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a.h2.n<d0> f8655k;

    /* renamed from: l  reason: collision with root package name */
    public Hashtable<String, e.j.d.h> f8656l;

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {SyslogConstants.LOG_ALERT, 114, SyslogConstants.LOG_CLOCK}, m = "acknowledgeAll$premium_helper_regularRelease")
    /* loaded from: classes2.dex */
    public static final class a extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8657b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8658c;

        /* renamed from: d  reason: collision with root package name */
        public Object f8659d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f8660e;

        /* renamed from: g  reason: collision with root package name */
        public int f8662g;

        public a(h.m.d<? super a> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8660e = obj;
            this.f8662g |= Level.ALL_INT;
            return i.this.h(null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {134}, m = "acknowledgePurchase")
    /* loaded from: classes2.dex */
    public static final class b extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8663b;

        /* renamed from: d  reason: collision with root package name */
        public int f8665d;

        public b(h.m.d<? super b> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8663b = obj;
            this.f8665d |= Level.ALL_INT;
            i iVar = i.this;
            h.r.f<Object>[] fVarArr = i.a;
            return iVar.i(null, null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {76, 78}, m = "getActivePurchases")
    /* loaded from: classes2.dex */
    public static final class c extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8666b;

        /* renamed from: d  reason: collision with root package name */
        public int f8668d;

        public c(h.m.d<? super c> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8666b = obj;
            this.f8668d |= Level.ALL_INT;
            return i.this.j(this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1", f = "Billing.kt", l = {83, 83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super a0.c<List<? extends e.j.d.c0.c>>>, Object> {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public int f8669b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f8670c;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.c f8672e;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
            public final /* synthetic */ i a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ List<e.j.d.c0.c> f8673b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, List<e.j.d.c0.c> list, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.a = iVar;
                this.f8673b = list;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new a(this.a, this.f8673b, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
                a aVar = new a(this.a, this.f8673b, dVar);
                h.k kVar = h.k.a;
                aVar.invokeSuspend(kVar);
                return kVar;
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                e.j.d.w.E0(obj);
                i.g(this.a, this.f8673b);
                if (!this.f8673b.isEmpty()) {
                    Application application = this.a.f8646b;
                    h.o.c.j.e(application, CoreConstants.CONTEXT_SCOPE_VALUE);
                    d.a aVar2 = new d.a();
                    aVar2.a = c.c0.s.CONNECTED;
                    c.c0.d dVar = new c.c0.d(aVar2);
                    h.o.c.j.d(dVar, "Builder()\n              …\n                .build()");
                    t.a aVar3 = new t.a(AcknowledgePurchaseWorker.class);
                    aVar3.f1314b.f1515j = dVar;
                    c.c0.t a = aVar3.a();
                    h.o.c.j.d(a, "OneTimeWorkRequestBuilde…\n                .build()");
                    c.c0.d0.l.c(application).b("AcknowledgePurchaseWorker", c.c0.h.KEEP, a);
                    TotoFeature.scheduleRegister$default(e.j.d.k.a.a().q, false, 1, null);
                }
                return h.k.a;
            }
        }

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$inapp$1", f = "Billing.kt", l = {SyslogConstants.LOG_AUTHPRIV}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super List<? extends e.j.d.c0.c>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i f8674b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e.a.a.a.c f8675c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, e.a.a.a.c cVar, h.m.d<? super b> dVar) {
                super(2, dVar);
                this.f8674b = iVar;
                this.f8675c = cVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new b(this.f8674b, this.f8675c, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super List<? extends e.j.d.c0.c>> dVar) {
                return new b(this.f8674b, this.f8675c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    e.j.d.w.E0(obj);
                    i iVar = this.f8674b;
                    e.a.a.a.c cVar = this.f8675c;
                    this.a = 1;
                    obj = i.f(iVar, cVar, "inapp", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e.j.d.w.E0(obj);
                }
                return obj;
            }
        }

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$getActivePurchases$2$1$subs$1", f = "Billing.kt", l = {81}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super List<? extends e.j.d.c0.c>>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i f8676b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e.a.a.a.c f8677c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i iVar, e.a.a.a.c cVar, h.m.d<? super c> dVar) {
                super(2, dVar);
                this.f8676b = iVar;
                this.f8677c = cVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new c(this.f8676b, this.f8677c, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super List<? extends e.j.d.c0.c>> dVar) {
                return new c(this.f8676b, this.f8677c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    e.j.d.w.E0(obj);
                    i iVar = this.f8676b;
                    e.a.a.a.c cVar = this.f8677c;
                    this.a = 1;
                    obj = i.f(iVar, cVar, "subs", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e.j.d.w.E0(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e.a.a.a.c cVar, h.m.d<? super d> dVar) {
            super(2, dVar);
            this.f8672e = cVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            d dVar2 = new d(this.f8672e, dVar);
            dVar2.f8670c = obj;
            return dVar2;
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super a0.c<List<? extends e.j.d.c0.c>>> dVar) {
            d dVar2 = new d(this.f8672e, dVar);
            dVar2.f8670c = e0Var;
            return dVar2.invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            i.a.e0 e0Var;
            j0 i2;
            Object d2;
            Object y;
            i.a.e0 e0Var2;
            Collection collection;
            List g2;
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i3 = this.f8669b;
            boolean z = true;
            if (i3 == 0) {
                e.j.d.w.E0(obj);
                e0Var = (i.a.e0) this.f8670c;
                j0 i4 = e.j.d.w.i(e0Var, null, null, new b(i.this, this.f8672e, null), 3, null);
                i2 = e.j.d.w.i(e0Var, null, null, new c(i.this, this.f8672e, null), 3, null);
                this.f8670c = e0Var;
                this.a = i2;
                this.f8669b = 1;
                d2 = ((k0) i4).d(this);
                if (d2 == aVar) {
                    return aVar;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    collection = (Collection) this.a;
                    e.j.d.w.E0(obj);
                    y = obj;
                    e0Var2 = (i.a.e0) this.f8670c;
                    g2 = h.l.c.g(collection, (Iterable) y);
                    b0 b0Var = b0.a;
                    i iVar = i.this;
                    boolean l2 = b0Var.l(iVar.f8646b, (String) iVar.f8647c.f(e.j.d.y.b.C));
                    e.j.d.i iVar2 = i.this.f8648d;
                    if (((ArrayList) g2).isEmpty() && !l2) {
                        z = false;
                    }
                    SharedPreferences.Editor edit = iVar2.a.edit();
                    edit.putBoolean("has_active_purchase", z);
                    edit.apply();
                    e.j.d.w.Y(e0Var2, o0.f9155b, null, new a(i.this, g2, null), 2, null);
                    i.this.k().g(h.o.c.j.i("Purchases: ", g2), new Object[0]);
                    return new a0.c(g2);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i.a.e0 e0Var3 = (i.a.e0) this.f8670c;
                e.j.d.w.E0(obj);
                d2 = obj;
                i2 = (j0) this.a;
                e0Var = e0Var3;
            }
            Collection collection2 = (Collection) d2;
            this.f8670c = e0Var;
            this.a = collection2;
            this.f8669b = 2;
            y = i2.y(this);
            if (y == aVar) {
                return aVar;
            }
            e0Var2 = e0Var;
            collection = collection2;
            g2 = h.l.c.g(collection, (Iterable) y);
            b0 b0Var2 = b0.a;
            i iVar3 = i.this;
            boolean l22 = b0Var2.l(iVar3.f8646b, (String) iVar3.f8647c.f(e.j.d.y.b.C));
            e.j.d.i iVar22 = i.this.f8648d;
            if (((ArrayList) g2).isEmpty()) {
                z = false;
            }
            SharedPreferences.Editor edit2 = iVar22.a.edit();
            edit2.putBoolean("has_active_purchase", z);
            edit2.apply();
            e.j.d.w.Y(e0Var2, o0.f9155b, null, new a(i.this, g2, null), 2, null);
            i.this.k().g(h.o.c.j.i("Purchases: ", g2), new Object[0]);
            return new a0.c(g2);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {46, 52}, m = "getOffer")
    /* loaded from: classes2.dex */
    public static final class e extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8678b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8679c;

        /* renamed from: d  reason: collision with root package name */
        public int f8680d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f8681e;

        /* renamed from: g  reason: collision with root package name */
        public int f8683g;

        public e(h.m.d<? super e> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8681e = obj;
            this.f8683g |= Level.ALL_INT;
            return i.this.l(null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$getOffer$2", f = "Billing.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends h.m.i.a.h implements h.o.b.l<h.m.d<? super e.j.d.h>, Object> {
        public int a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f8685c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, h.m.d<? super f> dVar) {
            super(1, dVar);
            this.f8685c = str;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(h.m.d<?> dVar) {
            return new f(this.f8685c, dVar);
        }

        @Override // h.o.b.l
        public Object invoke(h.m.d<? super e.j.d.h> dVar) {
            return new f(this.f8685c, dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                i iVar = i.this;
                String str = this.f8685c;
                this.a = 1;
                obj = i.e(iVar, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e.j.d.w.E0(obj);
            }
            return obj;
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {333, 334}, m = "hasHistoryPurchases")
    /* loaded from: classes2.dex */
    public static final class g extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8686b;

        /* renamed from: d  reason: collision with root package name */
        public int f8688d;

        public g(h.m.d<? super g> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8686b = obj;
            this.f8688d |= Level.ALL_INT;
            return i.this.n(this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1", f = "Billing.kt", l = {338, 338}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super a0.c<Boolean>>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8689b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.c f8691d;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1$inapp$1", f = "Billing.kt", l = {335}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super Boolean>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i f8692b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e.a.a.a.c f8693c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, e.a.a.a.c cVar, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.f8692b = iVar;
                this.f8693c = cVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new a(this.f8692b, this.f8693c, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super Boolean> dVar) {
                return new a(this.f8692b, this.f8693c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    e.j.d.w.E0(obj);
                    i iVar = this.f8692b;
                    e.a.a.a.c cVar = this.f8693c;
                    this.a = 1;
                    obj = i.c(iVar, cVar, "inapp", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e.j.d.w.E0(obj);
                }
                return obj;
            }
        }

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$hasHistoryPurchases$2$1$subs$1", f = "Billing.kt", l = {336}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super Boolean>, Object> {
            public int a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i f8694b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e.a.a.a.c f8695c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, e.a.a.a.c cVar, h.m.d<? super b> dVar) {
                super(2, dVar);
                this.f8694b = iVar;
                this.f8695c = cVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                return new b(this.f8694b, this.f8695c, dVar);
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super Boolean> dVar) {
                return new b(this.f8694b, this.f8695c, dVar).invokeSuspend(h.k.a);
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                int i2 = this.a;
                if (i2 == 0) {
                    e.j.d.w.E0(obj);
                    i iVar = this.f8694b;
                    e.a.a.a.c cVar = this.f8695c;
                    this.a = 1;
                    obj = i.c(iVar, cVar, "subs", this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e.j.d.w.E0(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e.a.a.a.c cVar, h.m.d<? super h> dVar) {
            super(2, dVar);
            this.f8691d = cVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            h hVar = new h(this.f8691d, dVar);
            hVar.f8689b = obj;
            return hVar;
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super a0.c<Boolean>> dVar) {
            h hVar = new h(this.f8691d, dVar);
            hVar.f8689b = e0Var;
            return hVar.invokeSuspend(h.k.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        @Override // h.m.i.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                h.m.h.a r0 = h.m.h.a.COROUTINE_SUSPENDED
                int r1 = r14.a
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r2) goto L11
                e.j.d.w.E0(r15)
                goto L6e
            L11:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L19:
                java.lang.Object r1 = r14.f8689b
                i.a.j0 r1 = (i.a.j0) r1
                e.j.d.w.E0(r15)
                goto L5b
            L21:
                e.j.d.w.E0(r15)
                java.lang.Object r15 = r14.f8689b
                i.a.e0 r15 = (i.a.e0) r15
                r1 = 0
                r11 = 0
                e.j.d.c0.i$h$a r8 = new e.j.d.c0.i$h$a
                e.j.d.c0.i r5 = e.j.d.c0.i.this
                e.a.a.a.c r6 = r14.f8691d
                r8.<init>(r5, r6, r3)
                r9 = 3
                r12 = 0
                r6 = 0
                r7 = 0
                r10 = 0
                r5 = r15
                i.a.j0 r13 = e.j.d.w.i(r5, r6, r7, r8, r9, r10)
                e.j.d.c0.i$h$b r8 = new e.j.d.c0.i$h$b
                e.j.d.c0.i r5 = e.j.d.c0.i.this
                e.a.a.a.c r6 = r14.f8691d
                r8.<init>(r5, r6, r3)
                r5 = r15
                r6 = r1
                r7 = r11
                r10 = r12
                i.a.j0 r1 = e.j.d.w.i(r5, r6, r7, r8, r9, r10)
                r14.f8689b = r1
                r14.a = r4
                i.a.k0 r13 = (i.a.k0) r13
                java.lang.Object r15 = r13.d(r14)
                if (r15 != r0) goto L5b
                return r0
            L5b:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 != 0) goto L78
                r14.f8689b = r3
                r14.a = r2
                java.lang.Object r15 = r1.y(r14)
                if (r15 != r0) goto L6e
                return r0
            L6e:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L77
                goto L78
            L77:
                r4 = 0
            L78:
                java.lang.Boolean r15 = java.lang.Boolean.valueOf(r4)
                e.j.d.c0.a0$c r0 = new e.j.d.c0.a0$c
                r0.<init>(r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$onPurchasesUpdated$1", f = "Billing.kt", l = {448, 457, 460}, m = "invokeSuspend")
    /* renamed from: e.j.d.c0.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0189i extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e.a.a.a.j f8696b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<Purchase> f8697c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f8698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0189i(e.a.a.a.j jVar, List<Purchase> list, i iVar, h.m.d<? super C0189i> dVar) {
            super(2, dVar);
            this.f8696b = jVar;
            this.f8697c = list;
            this.f8698d = iVar;
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new C0189i(this.f8696b, this.f8697c, this.f8698d, dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
            return new C0189i(this.f8696b, this.f8697c, this.f8698d, dVar).invokeSuspend(h.k.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[RETURN] */
        @Override // h.m.i.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                h.m.h.a r0 = h.m.h.a.COROUTINE_SUSPENDED
                int r1 = r6.a
                r2 = 1
                r3 = 3
                r4 = 2
                if (r1 == 0) goto L21
                if (r1 == r2) goto L1d
                if (r1 == r4) goto L18
                if (r1 != r3) goto L10
                goto L18
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                e.j.d.w.E0(r7)
                goto Lc6
            L1d:
                e.j.d.w.E0(r7)
                goto L47
            L21:
                e.j.d.w.E0(r7)
                e.a.a.a.j r7 = r6.f8696b
                int r7 = r7.a
                if (r7 != 0) goto Lb1
                java.util.List<com.android.billingclient.api.Purchase> r7 = r6.f8697c
                if (r7 == 0) goto L37
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L35
                goto L37
            L35:
                r7 = 0
                goto L38
            L37:
                r7 = 1
            L38:
                if (r7 != 0) goto Lb1
                e.j.d.c0.i r7 = r6.f8698d
                java.util.List<com.android.billingclient.api.Purchase> r1 = r6.f8697c
                r6.a = r2
                java.lang.Object r7 = e.j.d.c0.i.b(r7, r1, r6)
                if (r7 != r0) goto L47
                return r0
            L47:
                java.util.List r7 = (java.util.List) r7
                e.j.d.c0.i r1 = r6.f8698d
                e.j.d.c0.i.g(r1, r7)
                boolean r1 = r7.isEmpty()
                r1 = r1 ^ r2
                if (r1 == 0) goto L9d
                e.j.d.k$a r1 = e.j.d.k.a
                e.j.d.k r1 = r1.a()
                com.zipoapps.premiumhelper.toto.TotoFeature r1 = r1.q
                r1.scheduleRegister(r2)
                e.j.d.c0.i r1 = r6.f8698d
                android.app.Application r1 = r1.f8646b
                java.lang.String r2 = "context"
                h.o.c.j.e(r1, r2)
                c.c0.d$a r2 = new c.c0.d$a
                r2.<init>()
                c.c0.s r3 = c.c0.s.CONNECTED
                r2.a = r3
                c.c0.d r3 = new c.c0.d
                r3.<init>(r2)
                java.lang.String r2 = "Builder()\n              …\n                .build()"
                h.o.c.j.d(r3, r2)
                c.c0.t$a r2 = new c.c0.t$a
                java.lang.Class<com.zipoapps.premiumhelper.AcknowledgePurchaseWorker> r5 = com.zipoapps.premiumhelper.AcknowledgePurchaseWorker.class
                r2.<init>(r5)
                c.c0.d0.s.p r5 = r2.f1314b
                r5.f1515j = r3
                c.c0.a0 r2 = r2.a()
                java.lang.String r3 = "OneTimeWorkRequestBuilde…\n                .build()"
                h.o.c.j.d(r2, r3)
                c.c0.t r2 = (c.c0.t) r2
                c.c0.d0.l r1 = c.c0.d0.l.c(r1)
                c.c0.h r3 = c.c0.h.KEEP
                java.lang.String r5 = "AcknowledgePurchaseWorker"
                r1.b(r5, r3, r2)
            L9d:
                e.j.d.c0.i r1 = r6.f8698d
                i.a.h2.j<e.j.d.c0.d0> r1 = r1.f8654j
                e.j.d.c0.d0 r2 = new e.j.d.c0.d0
                e.a.a.a.j r3 = r6.f8696b
                r2.<init>(r3, r7)
                r6.a = r4
                java.lang.Object r7 = r1.b(r2, r6)
                if (r7 != r0) goto Lc6
                return r0
            Lb1:
                e.j.d.c0.i r7 = r6.f8698d
                i.a.h2.j<e.j.d.c0.d0> r7 = r7.f8654j
                e.j.d.c0.d0 r1 = new e.j.d.c0.d0
                e.a.a.a.j r2 = r6.f8696b
                r5 = 0
                r1.<init>(r2, r5, r4)
                r6.a = r3
                java.lang.Object r7 = r7.b(r1, r6)
                if (r7 != r0) goto Lc6
                return r0
            Lc6:
                h.k r7 = h.k.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.C0189i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {370}, m = "queryPurchaseHistory")
    /* loaded from: classes2.dex */
    public static final class j extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f8699b;

        /* renamed from: d  reason: collision with root package name */
        public int f8701d;

        public j(h.m.d<? super j> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8699b = obj;
            this.f8701d |= Level.ALL_INT;
            i iVar = i.this;
            h.r.f<Object>[] fVarArr = i.a;
            return iVar.p(null, null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {163, 165}, m = "querySkuDetails")
    /* loaded from: classes2.dex */
    public static final class k extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8702b;

        /* renamed from: c  reason: collision with root package name */
        public Object f8703c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f8704d;

        /* renamed from: f  reason: collision with root package name */
        public int f8706f;

        public k(h.m.d<? super k> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8704d = obj;
            this.f8706f |= Level.ALL_INT;
            i iVar = i.this;
            h.r.f<Object>[] fVarArr = i.a;
            return iVar.r(null, null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {171, 178}, m = "querySkuDetails")
    /* loaded from: classes2.dex */
    public static final class l extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8707b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f8708c;

        /* renamed from: e  reason: collision with root package name */
        public int f8710e;

        public l(h.m.d<? super l> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8708c = obj;
            this.f8710e |= Level.ALL_INT;
            i iVar = i.this;
            h.r.f<Object>[] fVarArr = i.a;
            return iVar.q(null, null, null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing", f = "Billing.kt", l = {191, 195, 196}, m = "querySkuWithRetries")
    /* loaded from: classes2.dex */
    public static final class m extends h.m.i.a.c {
        public Object a;

        /* renamed from: b  reason: collision with root package name */
        public Object f8711b;

        /* renamed from: c  reason: collision with root package name */
        public int f8712c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f8713d;

        /* renamed from: f  reason: collision with root package name */
        public int f8715f;

        public m(h.m.d<? super m> dVar) {
            super(dVar);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            this.f8713d = obj;
            this.f8715f |= Level.ALL_INT;
            i iVar = i.this;
            h.r.f<Object>[] fVarArr = i.a;
            return iVar.s(null, null, this);
        }
    }

    @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1", f = "Billing.kt", l = {302}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
        public int a;

        @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1$1", f = "Billing.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
            public /* synthetic */ Object a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i f8717b;

            @h.m.i.a.e(c = "com.zipoapps.premiumhelper.util.Billing$updateOfferCache$1$1$1", f = "Billing.kt", l = {305, 312}, m = "invokeSuspend")
            /* renamed from: e.j.d.c0.i$n$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0190a extends h.m.i.a.h implements h.o.b.p<i.a.e0, h.m.d<? super h.k>, Object> {
                public Object a;

                /* renamed from: b  reason: collision with root package name */
                public Object f8718b;

                /* renamed from: c  reason: collision with root package name */
                public Object f8719c;

                /* renamed from: d  reason: collision with root package name */
                public Object f8720d;

                /* renamed from: e  reason: collision with root package name */
                public Object f8721e;

                /* renamed from: f  reason: collision with root package name */
                public Object f8722f;

                /* renamed from: g  reason: collision with root package name */
                public int f8723g;

                /* renamed from: h  reason: collision with root package name */
                public final /* synthetic */ i f8724h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0190a(i iVar, h.m.d<? super C0190a> dVar) {
                    super(2, dVar);
                    this.f8724h = iVar;
                }

                @Override // h.m.i.a.a
                public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                    return new C0190a(this.f8724h, dVar);
                }

                @Override // h.o.b.p
                public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
                    return new C0190a(this.f8724h, dVar).invokeSuspend(h.k.a);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:1|2|(1:(1:(10:6|7|8|9|10|11|12|13|14|(8:16|17|(1:19)(1:25)|(4:21|(1:23)|10|11)|12|13|14|(3:26|27|28)(0))(0))(2:44|45))(2:46|47))(3:51|52|(1:54))|48|49|13|14|(0)(0)|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
                    r0 = e;
                 */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0080 A[Catch: Exception -> 0x0104, TRY_LEAVE, TryCatch #3 {Exception -> 0x0104, blocks: (B:21:0x007a, B:23:0x0080, B:41:0x0101), top: B:56:0x007a }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x0101 A[Catch: Exception -> 0x0104, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0104, blocks: (B:21:0x007a, B:23:0x0080, B:41:0x0101), top: B:56:0x007a }] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0098 -> B:38:0x00fa). Please submit an issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ae -> B:58:0x00b1). Please submit an issue!!! */
                @Override // h.m.i.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r18) {
                    /*
                        Method dump skipped, instructions count: 283
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.n.a.C0190a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, h.m.d<? super a> dVar) {
                super(2, dVar);
                this.f8717b = iVar;
            }

            @Override // h.m.i.a.a
            public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
                a aVar = new a(this.f8717b, dVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // h.o.b.p
            public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
                a aVar = new a(this.f8717b, dVar);
                aVar.a = e0Var;
                h.k kVar = h.k.a;
                aVar.invokeSuspend(kVar);
                return kVar;
            }

            @Override // h.m.i.a.a
            public final Object invokeSuspend(Object obj) {
                h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
                e.j.d.w.E0(obj);
                e.j.d.w.Y((i.a.e0) this.a, o0.f9155b, null, new C0190a(this.f8717b, null), 2, null);
                return h.k.a;
            }
        }

        public n(h.m.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // h.m.i.a.a
        public final h.m.d<h.k> create(Object obj, h.m.d<?> dVar) {
            return new n(dVar);
        }

        @Override // h.o.b.p
        public Object i(i.a.e0 e0Var, h.m.d<? super h.k> dVar) {
            return new n(dVar).invokeSuspend(h.k.a);
        }

        @Override // h.m.i.a.a
        public final Object invokeSuspend(Object obj) {
            h.m.h.a aVar = h.m.h.a.COROUTINE_SUSPENDED;
            int i2 = this.a;
            if (i2 == 0) {
                e.j.d.w.E0(obj);
                a aVar2 = new a(i.this, null);
                this.a = 1;
                if (e.j.d.w.v(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                e.j.d.w.E0(obj);
            }
            return h.k.a;
        }
    }

    static {
        h.o.c.n nVar = new h.o.c.n(i.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(h.o.c.r.a);
        a = new h.r.f[]{nVar};
    }

    public i(Application application, e.j.d.y.b bVar, e.j.d.i iVar, e.j.d.c0.g gVar) {
        h.o.c.j.e(application, "application");
        h.o.c.j.e(bVar, "configuration");
        h.o.c.j.e(iVar, "preferences");
        h.o.c.j.e(gVar, "appInstanceId");
        this.f8646b = application;
        this.f8647c = bVar;
        this.f8648d = iVar;
        this.f8649e = gVar;
        this.f8650f = new e.j.d.z.d("PremiumHelper");
        this.f8651g = new e.j.d.f(application, this);
        i.a.h2.k<Boolean> a2 = i.a.h2.t.a(Boolean.valueOf(iVar.g()));
        this.f8652h = a2;
        this.f8653i = e.j.d.w.h(a2);
        i.a.g2.e eVar = i.a.g2.e.SUSPEND;
        if (!(eVar == eVar)) {
            throw new IllegalArgumentException(h.o.c.j.i("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", eVar).toString());
        }
        i.a.h2.o oVar = new i.a.h2.o(0, 0, eVar);
        this.f8654j = oVar;
        this.f8655k = new i.a.h2.l(oVar, null);
        this.f8656l = new Hashtable<>();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
        if (r1 == r3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ce -> B:31:0x00d2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0113 -> B:48:0x0195). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0183 -> B:44:0x0189). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0193 -> B:48:0x0195). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(e.j.d.c0.i r17, java.util.List r18, h.m.d r19) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.b(e.j.d.c0.i, java.util.List, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(e.j.d.c0.i r4, e.a.a.a.c r5, java.lang.String r6, h.m.d r7) {
        /*
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r7 instanceof e.j.d.c0.m
            if (r0 == 0) goto L16
            r0 = r7
            e.j.d.c0.m r0 = (e.j.d.c0.m) r0
            int r1 = r0.f8739c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8739c = r1
            goto L1b
        L16:
            e.j.d.c0.m r0 = new e.j.d.c0.m
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.a
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8739c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            e.j.d.w.E0(r7)
            goto L3e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            e.j.d.w.E0(r7)
            r0.f8739c = r3
            java.lang.Object r7 = r4.p(r5, r6, r0)
            if (r7 != r1) goto L3e
            goto L51
        L3e:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L4b
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L49
            goto L4b
        L49:
            r4 = 0
            goto L4c
        L4b:
            r4 = 1
        L4c:
            r4 = r4 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.c(e.j.d.c0.i, e.a.a.a.c, java.lang.String, h.m.d):java.lang.Object");
    }

    public static final void d(final i iVar, Activity activity, final e.j.d.h hVar) {
        Objects.requireNonNull(iVar);
        i.a aVar = new i.a(activity);
        AlertController.b bVar = aVar.a;
        bVar.f128d = "Purchase debug offer?";
        bVar.f130f = "You are trying to purchase a DEBUG offer. This purchase is for testing only, Google Play is not updated.";
        bVar.f133i = "Cancel";
        bVar.f134j = null;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: e.j.d.c0.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                i iVar2 = i.this;
                e.j.d.h hVar2 = hVar;
                h.o.c.j.e(iVar2, "this$0");
                h.o.c.j.e(hVar2, "$offer");
                e.j.d.w.Y(z0.a, null, null, new o(iVar2, hVar2, null), 3, null);
            }
        };
        bVar.f131g = "Test Purchase";
        bVar.f132h = onClickListener;
        aVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(e.j.d.c0.i r5, java.lang.String r6, h.m.d r7) {
        /*
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r7 instanceof e.j.d.c0.q
            if (r0 == 0) goto L16
            r0 = r7
            e.j.d.c0.q r0 = (e.j.d.c0.q) r0
            int r1 = r0.f8759e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f8759e = r1
            goto L1b
        L16:
            e.j.d.c0.q r0 = new e.j.d.c0.q
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f8757c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8759e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.a
            e.j.d.c0.i r5 = (e.j.d.c0.i) r5
            e.j.d.w.E0(r7)
            goto L68
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.Object r5 = r0.f8756b
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.a
            e.j.d.c0.i r5 = (e.j.d.c0.i) r5
            e.j.d.w.E0(r7)
            goto L58
        L46:
            e.j.d.w.E0(r7)
            e.j.d.f r7 = r5.f8651g
            r0.a = r5
            r0.f8756b = r6
            r0.f8759e = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L58
            goto L84
        L58:
            e.a.a.a.c r7 = (e.a.a.a.c) r7
            r0.a = r5
            r2 = 0
            r0.f8756b = r2
            r0.f8759e = r3
            java.lang.Object r7 = r5.r(r7, r6, r0)
            if (r7 != r1) goto L68
            goto L84
        L68:
            com.android.billingclient.api.SkuDetails r7 = (com.android.billingclient.api.SkuDetails) r7
            e.j.d.h r1 = new e.j.d.h
            java.lang.String r6 = r7.d()
            java.lang.String r0 = "skuDetails.sku"
            h.o.c.j.d(r6, r0)
            java.lang.String r0 = r7.e()
            e.j.d.c0.b0 r2 = e.j.d.c0.b0.a
            android.app.Application r5 = r5.f8646b
            java.lang.String r5 = r2.c(r5, r7)
            r1.<init>(r6, r0, r7, r5)
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.e(e.j.d.c0.i, java.lang.String, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00d6 -> B:28:0x00d7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(e.j.d.c0.i r9, e.a.a.a.c r10, java.lang.String r11, h.m.d r12) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.f(e.j.d.c0.i, e.a.a.a.c, java.lang.String, h.m.d):java.lang.Object");
    }

    public static final void g(i iVar, List list) {
        Objects.requireNonNull(iVar);
        if (!(!list.isEmpty())) {
            SharedPreferences.Editor edit = iVar.f8648d.a.edit();
            edit.putString("active_purchase_info", "");
            edit.apply();
            return;
        }
        e.j.d.c0.c cVar = (e.j.d.c0.c) list.get(0);
        e.j.d.i iVar2 = iVar.f8648d;
        String str = cVar.a.b().get(0);
        h.o.c.j.d(str, "ap.purchase.skus[0]");
        String a2 = cVar.a.a();
        h.o.c.j.d(a2, "ap.purchase.purchaseToken");
        ActivePurchaseInfo activePurchaseInfo = new ActivePurchaseInfo(str, a2, cVar.a.f2936c.optLong("purchaseTime"), cVar.f8629c);
        Objects.requireNonNull(iVar2);
        h.o.c.j.e(activePurchaseInfo, "value");
        SharedPreferences.Editor edit2 = iVar2.a.edit();
        edit2.putString("active_purchase_info", new e.d.e.j().f(activePurchaseInfo));
        edit2.apply();
    }

    @Override // e.a.a.a.p
    public void a(e.a.a.a.j jVar, List<Purchase> list) {
        h.o.c.j.e(jVar, "result");
        e.j.d.z.c k2 = k();
        k2.g("onPurchaseUpdated: " + list + " Result: " + jVar.a, new Object[0]);
        try {
            e.j.d.w.Y(z0.a, null, null, new C0189i(jVar, list, this, null), 3, null);
        } catch (Exception e2) {
            k().k(6, e2, null, new Object[0]);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(1:(9:12|13|14|15|(3:18|(2:20|21)|16)|23|24|25|26)(2:30|31))(14:32|33|34|35|(4:38|(3:40|41|42)(1:44)|43|36)|45|46|47|15|(1:16)|23|24|25|26))(2:49|50))(4:64|65|66|(1:68)(1:69))|51|(2:56|(2:58|(1:60)(13:61|34|35|(1:36)|45|46|47|15|(1:16)|23|24|25|26))(12:62|35|(1:36)|45|46|47|15|(1:16)|23|24|25|26))|63|(0)(0)))|75|6|7|(0)(0)|51|(3:53|56|(0)(0))|63|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010e, code lost:
        r5 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088 A[Catch: Exception -> 0x0062, TryCatch #2 {Exception -> 0x0062, blocks: (B:21:0x0052, B:45:0x00a1, B:47:0x00a7, B:48:0x00b0, B:50:0x00b6, B:52:0x00ca, B:53:0x00ce, B:24:0x005e, B:33:0x0078, B:35:0x007c, B:41:0x0088), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6 A[Catch: Exception -> 0x0062, TryCatch #2 {Exception -> 0x0062, blocks: (B:21:0x0052, B:45:0x00a1, B:47:0x00a7, B:48:0x00b0, B:50:0x00b6, B:52:0x00ca, B:53:0x00ce, B:24:0x005e, B:33:0x0078, B:35:0x007c, B:41:0x0088), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9 A[Catch: Exception -> 0x003f, TryCatch #1 {Exception -> 0x003f, blocks: (B:14:0x003a, B:55:0x00e3, B:57:0x00e9, B:60:0x010b), top: B:70:0x003a }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [e.j.d.c0.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List<e.j.d.c0.c> r12, h.m.d<? super h.k> r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.h(java.util.List, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(e.a.a.a.c r5, java.lang.String r6, h.m.d<? super e.a.a.a.j> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof e.j.d.c0.i.b
            if (r0 == 0) goto L13
            r0 = r7
            e.j.d.c0.i$b r0 = (e.j.d.c0.i.b) r0
            int r1 = r0.f8665d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8665d = r1
            goto L18
        L13:
            e.j.d.c0.i$b r0 = new e.j.d.c0.i$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8663b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8665d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            e.j.d.c0.i r5 = (e.j.d.c0.i) r5
            e.j.d.w.E0(r7)
            goto L5f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.j.d.w.E0(r7)
            if (r6 == 0) goto L7b
            e.a.a.a.a r7 = new e.a.a.a.a
            r7.<init>()
            r7.a = r6
            java.lang.String r6 = "newBuilder()\n           …ken)\n            .build()"
            h.o.c.j.d(r7, r6)
            r0.a = r4
            r0.f8665d = r3
            r6 = 0
            i.a.s r6 = e.j.d.w.a(r6, r3)
            e.a.a.a.e r2 = new e.a.a.a.e
            r2.<init>(r6)
            r5.a(r7, r2)
            i.a.t r6 = (i.a.t) r6
            java.lang.Object r7 = r6.d(r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r5 = r4
        L5f:
            r6 = r7
            e.a.a.a.j r6 = (e.a.a.a.j) r6
            e.j.d.z.c r5 = r5.k()
            boolean r6 = e.j.d.w.U(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r0 = "Purchase acknowledged: "
            java.lang.String r6 = h.o.c.j.i(r0, r6)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5.g(r6, r0)
            return r7
        L7b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Purchase token must be set"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.i(e.a.a.a.c, java.lang.String, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(h.m.d<? super e.j.d.c0.a0<? extends java.util.List<e.j.d.c0.c>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof e.j.d.c0.i.c
            if (r0 == 0) goto L13
            r0 = r8
            e.j.d.c0.i$c r0 = (e.j.d.c0.i.c) r0
            int r1 = r0.f8668d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8668d = r1
            goto L18
        L13:
            e.j.d.c0.i$c r0 = new e.j.d.c0.i$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8666b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8668d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            e.j.d.w.E0(r8)     // Catch: java.lang.Exception -> Lb7
            goto Lb4
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            java.lang.Object r2 = r0.a
            e.j.d.c0.i r2 = (e.j.d.c0.i) r2
            e.j.d.w.E0(r8)     // Catch: java.lang.Exception -> Lb7
            goto La1
        L3b:
            e.j.d.w.E0(r8)
            e.j.d.y.b r8 = r7.f8647c     // Catch: java.lang.Exception -> Lb7
            boolean r8 = r8.j()     // Catch: java.lang.Exception -> Lb7
            if (r8 == 0) goto L93
            e.j.d.i r8 = r7.f8648d     // Catch: java.lang.Exception -> Lb7
            com.zipoapps.premiumhelper.util.ActivePurchaseInfo r8 = r8.d()     // Catch: java.lang.Exception -> Lb7
            if (r8 == 0) goto L93
            java.lang.String r2 = r8.getPurchaseToken()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r5 = "debugtoken"
            r6 = 0
            boolean r2 = h.t.g.q(r2, r5, r6, r4)     // Catch: java.lang.Exception -> Lb7
            if (r2 == 0) goto L93
            e.j.d.c0.c r0 = new e.j.d.c0.c     // Catch: java.lang.Exception -> Lb7
            e.j.d.c0.b0 r1 = e.j.d.c0.b0.a     // Catch: java.lang.Exception -> Lb7
            android.app.Application r2 = r7.f8646b     // Catch: java.lang.Exception -> Lb7
            java.lang.String r3 = r8.getSku()     // Catch: java.lang.Exception -> Lb7
            com.android.billingclient.api.Purchase r2 = r1.a(r2, r3)     // Catch: java.lang.Exception -> Lb7
            java.lang.String r8 = r8.getSku()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r3 = "subs"
            java.lang.String r4 = ""
            com.android.billingclient.api.SkuDetails r8 = r1.b(r8, r3, r4)     // Catch: java.lang.Exception -> Lb7
            e.j.d.c0.e0 r1 = e.j.d.c0.e0.PAID     // Catch: java.lang.Exception -> Lb7
            r0.<init>(r2, r8, r1)     // Catch: java.lang.Exception -> Lb7
            java.util.List r8 = e.j.d.w.a0(r0)     // Catch: java.lang.Exception -> Lb7
            e.j.d.z.c r0 = r7.k()     // Catch: java.lang.Exception -> Lb7
            java.lang.String r1 = "Purchases: "
            java.lang.String r1 = h.o.c.j.i(r1, r8)     // Catch: java.lang.Exception -> Lb7
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lb7
            r0.g(r1, r2)     // Catch: java.lang.Exception -> Lb7
            e.j.d.c0.a0$c r0 = new e.j.d.c0.a0$c     // Catch: java.lang.Exception -> Lb7
            r0.<init>(r8)     // Catch: java.lang.Exception -> Lb7
            return r0
        L93:
            e.j.d.f r8 = r7.f8651g     // Catch: java.lang.Exception -> Lb7
            r0.a = r7     // Catch: java.lang.Exception -> Lb7
            r0.f8668d = r3     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Exception -> Lb7
            if (r8 != r1) goto La0
            return r1
        La0:
            r2 = r7
        La1:
            e.a.a.a.c r8 = (e.a.a.a.c) r8     // Catch: java.lang.Exception -> Lb7
            e.j.d.c0.i$d r3 = new e.j.d.c0.i$d     // Catch: java.lang.Exception -> Lb7
            r5 = 0
            r3.<init>(r8, r5)     // Catch: java.lang.Exception -> Lb7
            r0.a = r5     // Catch: java.lang.Exception -> Lb7
            r0.f8668d = r4     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r8 = e.j.d.w.v(r3, r0)     // Catch: java.lang.Exception -> Lb7
            if (r8 != r1) goto Lb4
            return r1
        Lb4:
            e.j.d.c0.a0$c r8 = (e.j.d.c0.a0.c) r8     // Catch: java.lang.Exception -> Lb7
            goto Lbe
        Lb7:
            r8 = move-exception
            e.j.d.c0.a0$b r0 = new e.j.d.c0.a0$b
            r0.<init>(r8)
            r8 = r0
        Lbe:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.j(h.m.d):java.lang.Object");
    }

    public final e.j.d.z.c k() {
        return this.f8650f.a(this, a[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00dd -> B:13:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(e.j.d.y.b.a.d r11, h.m.d<? super e.j.d.c0.a0<e.j.d.h>> r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.l(e.j.d.y.b$a$d, h.m.d):java.lang.Object");
    }

    public final e0 m(Purchase purchase, SkuDetails skuDetails) {
        return skuDetails != null ? h.o.c.j.a(skuDetails.e(), "inapp") ? e0.PAID : purchase.f2936c.optBoolean("autoRenewing") ^ true ? o(purchase, skuDetails) ? e0.SUBSCRIPTION_CANCELLED : e0.TRIAL_CANCELLED : o(purchase, skuDetails) ? e0.PAID : e0.TRIAL : e0.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(h.m.d<? super e.j.d.c0.a0<java.lang.Boolean>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e.j.d.c0.i.g
            if (r0 == 0) goto L13
            r0 = r7
            e.j.d.c0.i$g r0 = (e.j.d.c0.i.g) r0
            int r1 = r0.f8688d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8688d = r1
            goto L18
        L13:
            e.j.d.c0.i$g r0 = new e.j.d.c0.i$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8686b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8688d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.j.d.w.E0(r7)     // Catch: java.lang.Exception -> L61
            goto L5e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            java.lang.Object r2 = r0.a
            e.j.d.c0.i r2 = (e.j.d.c0.i) r2
            e.j.d.w.E0(r7)     // Catch: java.lang.Exception -> L61
            goto L4b
        L3a:
            e.j.d.w.E0(r7)
            e.j.d.f r7 = r6.f8651g     // Catch: java.lang.Exception -> L61
            r0.a = r6     // Catch: java.lang.Exception -> L61
            r0.f8688d = r4     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = r7.a(r0)     // Catch: java.lang.Exception -> L61
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            e.a.a.a.c r7 = (e.a.a.a.c) r7     // Catch: java.lang.Exception -> L61
            e.j.d.c0.i$h r4 = new e.j.d.c0.i$h     // Catch: java.lang.Exception -> L61
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Exception -> L61
            r0.a = r5     // Catch: java.lang.Exception -> L61
            r0.f8688d = r3     // Catch: java.lang.Exception -> L61
            java.lang.Object r7 = e.j.d.w.v(r4, r0)     // Catch: java.lang.Exception -> L61
            if (r7 != r1) goto L5e
            return r1
        L5e:
            e.j.d.c0.a0$c r7 = (e.j.d.c0.a0.c) r7     // Catch: java.lang.Exception -> L61
            goto L68
        L61:
            r7 = move-exception
            e.j.d.c0.a0$b r0 = new e.j.d.c0.a0$b
            r0.<init>(r7)
            r7 = r0
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.n(h.m.d):java.lang.Object");
    }

    public final boolean o(Purchase purchase, SkuDetails skuDetails) {
        String a2;
        try {
            a2 = skuDetails.a();
            h.o.c.j.d(a2, "skuDetails.freeTrialPeriod");
        } catch (Exception e2) {
            e.j.d.z.c k2 = k();
            StringBuilder y = e.a.d.a.a.y("Trial check failed for ");
            y.append(skuDetails.d());
            y.append(" trial period is: ");
            y.append(skuDetails.a());
            k2.k(6, e2, y.toString(), new Object[0]);
        }
        if (a2.length() == 0) {
            return true;
        }
        l.c.a.d z = l.c.a.d.z(purchase.f2936c.optLong("purchaseTime"));
        l.c.a.l b2 = l.c.a.l.b(skuDetails.a());
        Objects.requireNonNull(z);
        l.c.a.q qVar = l.c.a.q.f9705d;
        return ((l.c.a.d) b2.a(z)).compareTo(l.c.a.d.z(System.currentTimeMillis())) < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(e.a.a.a.c r5, java.lang.String r6, h.m.d<? super java.util.List<? extends com.android.billingclient.api.PurchaseHistoryRecord>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof e.j.d.c0.i.j
            if (r0 == 0) goto L13
            r0 = r7
            e.j.d.c0.i$j r0 = (e.j.d.c0.i.j) r0
            int r1 = r0.f8701d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8701d = r1
            goto L18
        L13:
            e.j.d.c0.i$j r0 = new e.j.d.c0.i$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f8699b
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8701d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            e.j.d.c0.i r5 = (e.j.d.c0.i) r5
            e.j.d.w.E0(r7)
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.j.d.w.E0(r7)
            r0.a = r4
            r0.f8701d = r3
            r7 = 0
            i.a.s r7 = e.j.d.w.a(r7, r3)
            e.a.a.a.f r2 = new e.a.a.a.f
            r2.<init>(r7)
            r5.d(r6, r2)
            i.a.t r7 = (i.a.t) r7
            java.lang.Object r7 = r7.d(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r5 = r4
        L51:
            e.a.a.a.m r7 = (e.a.a.a.m) r7
            e.a.a.a.j r6 = r7.a
            boolean r6 = e.j.d.w.U(r6)
            r0 = 0
            if (r6 == 0) goto L70
            java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> r6 = r7.f5009b
            if (r6 == 0) goto L68
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            if (r3 != 0) goto L70
            java.util.List<com.android.billingclient.api.PurchaseHistoryRecord> r6 = r7.f5009b
            h.o.c.j.c(r6)
            goto L72
        L70:
            h.l.e r6 = h.l.e.a
        L72:
            e.j.d.y.b r7 = r5.f8647c
            boolean r7 = r7.j()
            if (r7 == 0) goto L9a
            java.util.Iterator r7 = r6.iterator()
        L7e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r7.next()
            com.android.billingclient.api.PurchaseHistoryRecord r1 = (com.android.billingclient.api.PurchaseHistoryRecord) r1
            e.j.d.z.c r2 = r5.k()
            java.lang.String r3 = "History purchase: "
            java.lang.String r1 = h.o.c.j.i(r3, r1)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2.g(r1, r3)
            goto L7e
        L9a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.p(e.a.a.a.c, java.lang.String, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(e.a.a.a.c r7, java.lang.String r8, java.lang.String r9, h.m.d<? super com.android.billingclient.api.SkuDetails> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof e.j.d.c0.i.l
            if (r0 == 0) goto L13
            r0 = r10
            e.j.d.c0.i$l r0 = (e.j.d.c0.i.l) r0
            int r1 = r0.f8710e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8710e = r1
            goto L18
        L13:
            e.j.d.c0.i$l r0 = new e.j.d.c0.i$l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f8708c
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8710e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f8707b
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r0.a
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            e.j.d.w.E0(r10)
            goto L86
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            e.j.d.w.E0(r10)
            goto L5b
        L41:
            e.j.d.w.E0(r10)
            if (r9 == 0) goto L4f
            int r10 = r9.length()
            if (r10 != 0) goto L4d
            goto L4f
        L4d:
            r10 = 0
            goto L50
        L4f:
            r10 = 1
        L50:
            if (r10 == 0) goto L5c
            r0.f8710e = r4
            java.lang.Object r10 = r6.r(r7, r8, r0)
            if (r10 != r1) goto L5b
            return r1
        L5b:
            return r10
        L5c:
            java.lang.String[] r10 = new java.lang.String[r4]
            r10[r5] = r8
            java.util.List r10 = h.l.c.e(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
            if (r9 == 0) goto Lc1
            e.a.a.a.q r10 = new e.a.a.a.q
            r10.<init>()
            r10.a = r9
            r10.f5017b = r2
            java.lang.String r2 = "newBuilder()\n           …\n                .build()"
            h.o.c.j.d(r10, r2)
            r0.a = r8
            r0.f8707b = r9
            r0.f8710e = r3
            java.lang.Object r10 = r6.s(r7, r10, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            e.a.a.a.s r10 = (e.a.a.a.s) r10
            boolean r7 = e.j.d.w.V(r10)
            if (r7 == 0) goto L98
            java.util.List<com.android.billingclient.api.SkuDetails> r7 = r10.f5018b
            h.o.c.j.c(r7)
            java.lang.Object r7 = r7.get(r5)
            return r7
        L98:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to get sku "
            r0.append(r1)
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            e.a.a.a.j r10 = r10.a
            int r10 = r10.a
            r0.append(r10)
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        Lc1:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "SKU type must be set"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.q(e.a.a.a.c, java.lang.String, java.lang.String, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(e.a.a.a.c r6, java.lang.String r7, h.m.d<? super com.android.billingclient.api.SkuDetails> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof e.j.d.c0.i.k
            if (r0 == 0) goto L13
            r0 = r8
            e.j.d.c0.i$k r0 = (e.j.d.c0.i.k) r0
            int r1 = r0.f8706f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8706f = r1
            goto L18
        L13:
            e.j.d.c0.i$k r0 = new e.j.d.c0.i$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8704d
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8706f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.j.d.w.E0(r8)
            goto L70
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.f8703c
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f8702b
            e.a.a.a.c r6 = (e.a.a.a.c) r6
            java.lang.Object r2 = r0.a
            e.j.d.c0.i r2 = (e.j.d.c0.i) r2
            e.j.d.w.E0(r8)     // Catch: java.lang.Exception -> L43
            goto L5a
        L43:
            goto L5e
        L45:
            e.j.d.w.E0(r8)
            java.lang.String r8 = "subs"
            r0.a = r5     // Catch: java.lang.Exception -> L5d
            r0.f8702b = r6     // Catch: java.lang.Exception -> L5d
            r0.f8703c = r7     // Catch: java.lang.Exception -> L5d
            r0.f8706f = r4     // Catch: java.lang.Exception -> L5d
            java.lang.Object r8 = r5.q(r6, r7, r8, r0)     // Catch: java.lang.Exception -> L5d
            if (r8 != r1) goto L59
            return r1
        L59:
            r2 = r5
        L5a:
            com.android.billingclient.api.SkuDetails r8 = (com.android.billingclient.api.SkuDetails) r8     // Catch: java.lang.Exception -> L43
            goto L72
        L5d:
            r2 = r5
        L5e:
            r8 = 0
            r0.a = r8
            r0.f8702b = r8
            r0.f8703c = r8
            r0.f8706f = r3
            java.lang.String r8 = "inapp"
            java.lang.Object r8 = r2.q(r6, r7, r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            com.android.billingclient.api.SkuDetails r8 = (com.android.billingclient.api.SkuDetails) r8
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.r(e.a.a.a.c, java.lang.String, h.m.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ad -> B:39:0x00b0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(e.a.a.a.c r10, e.a.a.a.q r11, h.m.d<? super e.a.a.a.s> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof e.j.d.c0.i.m
            if (r0 == 0) goto L13
            r0 = r12
            e.j.d.c0.i$m r0 = (e.j.d.c0.i.m) r0
            int r1 = r0.f8715f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8715f = r1
            goto L18
        L13:
            e.j.d.c0.i$m r0 = new e.j.d.c0.i$m
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8713d
            h.m.h.a r1 = h.m.h.a.COROUTINE_SUSPENDED
            int r2 = r0.f8715f
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5d
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L41
            if (r2 != r4) goto L39
            int r10 = r0.f8712c
            java.lang.Object r11 = r0.f8711b
            e.a.a.a.q r11 = (e.a.a.a.q) r11
            java.lang.Object r2 = r0.a
            e.a.a.a.c r2 = (e.a.a.a.c) r2
            e.j.d.w.E0(r12)
            goto Lb0
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            int r10 = r0.f8712c
            java.lang.Object r11 = r0.f8711b
            e.a.a.a.q r11 = (e.a.a.a.q) r11
            java.lang.Object r2 = r0.a
            e.a.a.a.c r2 = (e.a.a.a.c) r2
            e.j.d.w.E0(r12)
            goto La1
        L4f:
            int r10 = r0.f8712c
            java.lang.Object r11 = r0.f8711b
            e.a.a.a.q r11 = (e.a.a.a.q) r11
            java.lang.Object r2 = r0.a
            e.a.a.a.c r2 = (e.a.a.a.c) r2
            e.j.d.w.E0(r12)
            goto L71
        L5d:
            e.j.d.w.E0(r12)
            r0.a = r10
            r0.f8711b = r11
            r0.f8712c = r3
            r0.f8715f = r6
            java.lang.Object r12 = c.t.m.B(r10, r11, r0)
            if (r12 != r1) goto L6f
            return r1
        L6f:
            r2 = r10
            r10 = 0
        L71:
            e.a.a.a.s r12 = (e.a.a.a.s) r12
        L73:
            r7 = 5
            if (r10 >= r7) goto Lb3
            java.lang.String r7 = "<this>"
            h.o.c.j.e(r12, r7)
            boolean r7 = e.j.d.w.V(r12)
            if (r7 != 0) goto L8b
            e.a.a.a.j r7 = r12.a
            int r7 = r7.a
            if (r7 == 0) goto L89
            if (r7 != r5) goto L8b
        L89:
            r7 = 1
            goto L8c
        L8b:
            r7 = 0
        L8c:
            if (r7 == 0) goto Lb3
            int r10 = r10 + 1
            r7 = 500(0x1f4, double:2.47E-321)
            r0.a = r2
            r0.f8711b = r11
            r0.f8712c = r10
            r0.f8715f = r5
            java.lang.Object r12 = e.j.d.w.z(r7, r0)
            if (r12 != r1) goto La1
            return r1
        La1:
            r0.a = r2
            r0.f8711b = r11
            r0.f8712c = r10
            r0.f8715f = r4
            java.lang.Object r12 = c.t.m.B(r2, r11, r0)
            if (r12 != r1) goto Lb0
            return r1
        Lb0:
            e.a.a.a.s r12 = (e.a.a.a.s) r12
            goto L73
        Lb3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.d.c0.i.s(e.a.a.a.c, e.a.a.a.q, h.m.d):java.lang.Object");
    }

    public final void t() {
        if (e.j.d.k.a.a().e()) {
            return;
        }
        e.j.d.w.Y(z0.a, null, null, new n(null), 3, null);
    }
}
