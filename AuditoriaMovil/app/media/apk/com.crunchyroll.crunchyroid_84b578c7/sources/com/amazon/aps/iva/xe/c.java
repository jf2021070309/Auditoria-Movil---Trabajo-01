package com.amazon.aps.iva.xe;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.ellation.crunchyroll.api.etp.subscription.model.Product;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.List;
import java.util.Map;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SynchronousGsonCache.kt */
/* loaded from: classes.dex */
public abstract class c<T> implements com.amazon.aps.iva.xe.d<T> {
    public final com.amazon.aps.iva.xe.a<T> b;

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$clear$1", f = "SynchronousGsonCache.kt", l = {58}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c<T> cVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                if (aVar2.clear(this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$contains$1", f = "SynchronousGsonCache.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c<T> cVar, String str, com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new b(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
            return ((b) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                obj = aVar2.contains(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$deleteItem$1", f = "SynchronousGsonCache.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.xe.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0862c extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0862c(c<T> cVar, String str, com.amazon.aps.iva.ob0.d<? super C0862c> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new C0862c(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0862c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                if (aVar2.deleteItem(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$deleteItems$1", f = "SynchronousGsonCache.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ List<String> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c<T> cVar, List<String> list, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                if (aVar2.deleteItems(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$readAll$1", f = "SynchronousGsonCache.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super Map<String, ? extends T>>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c<T> cVar, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new e(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, Object obj) {
            return ((e) create(g0Var, (com.amazon.aps.iva.ob0.d) obj)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                obj = aVar2.readAll(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$readAllItems$2", f = "SynchronousGsonCache.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends T>>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c<T> cVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(2, dVar);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new f(this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, Object obj) {
            return ((f) create(g0Var, (com.amazon.aps.iva.ob0.d) obj)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                obj = aVar2.readAllItems(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$readItem$1", f = "SynchronousGsonCache.kt", l = {21}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super T>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c<T> cVar, String str, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new g(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, Object obj) {
            return ((g) create(g0Var, (com.amazon.aps.iva.ob0.d) obj)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                obj = aVar2.readItem(this.j, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$saveItem$1", f = "SynchronousGsonCache.kt", l = {16}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ T j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(c<T> cVar, T t, com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = t;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new h(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((h) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.xe.a<T> aVar2 = this.i.b;
                this.h = 1;
                if (aVar2.saveItem(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    /* compiled from: SynchronousGsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.SynchronousGsonCache$saveItems$1", f = "SynchronousGsonCache.kt", l = {10}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ c<T> i;
        public final /* synthetic */ List<T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(c<T> cVar, List<? extends T> list, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(2, dVar);
            this.i = cVar;
            this.j = list;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new i(this.i, this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((i) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                this.h = 1;
                if (this.i.b.saveItems(this.j, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public c(com.amazon.aps.iva.xe.a<T> aVar) {
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.xe.d
    public final Map<String, T> I0() {
        Object e2;
        e2 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new e(this, null));
        return (Map) e2;
    }

    public List<Benefit> R0() {
        return (List<T>) q();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void X0(List<String> list) {
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new d(this, list, null));
    }

    public List<Product> c() {
        return (List<T>) q();
    }

    @Override // com.amazon.aps.iva.xe.d
    public void clear() {
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new a(this, null));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final boolean contains(String str) {
        Object e2;
        j.f(str, "id");
        e2 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new b(this, str, null));
        return ((Boolean) e2).booleanValue();
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void f1(String str) {
        j.f(str, "id");
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new C0862c(this, str, null));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void m1(T t) {
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new h(this, t, null));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final void n1(List<? extends T> list) {
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new i(this, list, null));
    }

    @Override // com.amazon.aps.iva.xe.d
    public final List<T> q() {
        Object e2;
        e2 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new f(this, null));
        return (List) e2;
    }

    @Override // com.amazon.aps.iva.xe.d
    public final T v(String str) {
        Object e2;
        j.f(str, "id");
        e2 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new g(this, str, null));
        return (T) e2;
    }
}
