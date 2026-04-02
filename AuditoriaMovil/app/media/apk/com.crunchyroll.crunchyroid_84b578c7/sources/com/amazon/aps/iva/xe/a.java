package com.amazon.aps.iva.xe;

import android.content.Context;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.x;
import com.google.android.gms.cast.MediaError;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: GsonCache.kt */
/* loaded from: classes.dex */
public abstract class a<T> implements com.amazon.aps.iva.xe.b<T> {
    static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] $$delegatedProperties = {e0.a.h(new x(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    private final Class<T> c;
    private final Context context;
    private final com.amazon.aps.iva.bc0.b dataStore$delegate;
    private final Gson gson;
    private final Map<String, T> inMemoryItems;
    private final Set<String> removingItems;

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$clear$2", f = "GsonCache.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.amazon.aps.iva.xe.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0853a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ a<T> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0853a(a<T> aVar, com.amazon.aps.iva.ob0.d<? super C0853a> dVar) {
            super(2, dVar);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            C0853a c0853a = new C0853a(this.i, dVar);
            c0853a.h = obj;
            return c0853a;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((C0853a) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.h;
            aVar2.f();
            aVar2.a.clear();
            ((a) this.i).inMemoryItems.clear();
            return q.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.ve0.f<Boolean> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
        public final /* synthetic */ String c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.amazon.aps.iva.xe.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0854a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
            public final /* synthetic */ String c;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$contains$suspendImpl$$inlined$map$1$2", f = "GsonCache.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.xe.a$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0855a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0855a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return C0854a.this.a(null, this);
                }
            }

            public C0854a(com.amazon.aps.iva.ve0.g gVar, String str) {
                this.b = gVar;
                this.c = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.xe.a.b.C0854a.C0855a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.xe.a$b$a$a r0 = (com.amazon.aps.iva.xe.a.b.C0854a.C0855a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.xe.a$b$a$a r0 = new com.amazon.aps.iva.xe.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L4d
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.d4.d r5 = (com.amazon.aps.iva.d4.d) r5
                    java.lang.String r6 = r4.c
                    com.amazon.aps.iva.d4.d$a r6 = com.amazon.aps.iva.cq.b.n0(r6)
                    boolean r5 = r5.b(r6)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L4d
                    return r1
                L4d:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.b.C0854a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public b(com.amazon.aps.iva.ve0.f fVar, String str) {
            this.b = fVar;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super Boolean> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new C0854a(gVar, this.c), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Context, List<? extends com.amazon.aps.iva.z3.d<com.amazon.aps.iva.d4.d>>> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final List<? extends com.amazon.aps.iva.z3.d<com.amazon.aps.iva.d4.d>> invoke(Context context) {
            Context context2 = context;
            com.amazon.aps.iva.yb0.j.f(context2, "context");
            LinkedHashSet linkedHashSet = com.amazon.aps.iva.c4.j.a;
            String str = this.h;
            com.amazon.aps.iva.yb0.j.f(str, "sharedPreferencesName");
            com.amazon.aps.iva.yb0.j.f(linkedHashSet, "keysToMigrate");
            return f1.J(new com.amazon.aps.iva.b4.b(context2, str, com.amazon.aps.iva.b4.c.a, new com.amazon.aps.iva.c4.i(linkedHashSet, null), new com.amazon.aps.iva.c4.h(null)));
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE}, m = "deleteItem$suspendImpl")
    /* loaded from: classes.dex */
    public static final class d<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public String i;
        public /* synthetic */ Object j;
        public final /* synthetic */ a<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a<T> aVar, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a.deleteItem$suspendImpl(this.k, null, this);
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$deleteItem$2", f = "GsonCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(2, dVar);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            e eVar = new e(this.i, dVar);
            eVar.h = obj;
            return eVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((e) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            ((com.amazon.aps.iva.d4.a) this.h).g(com.amazon.aps.iva.cq.b.n0(this.i));
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$deleteItems$2", f = "GsonCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ List<String> i;
        public final /* synthetic */ a<T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar, List list, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = list;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            f fVar = new f(this.j, this.i, dVar);
            fVar.h = obj;
            return fVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.h;
            for (String str : this.i) {
                aVar2.g(com.amazon.aps.iva.cq.b.n0(str));
                a<T> aVar3 = this.j;
                ((a) aVar3).removingItems.remove(str);
                aVar3.deleteInMemoryItem(str);
            }
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {95}, m = "readAll$suspendImpl")
    /* loaded from: classes.dex */
    public static final class g<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public /* synthetic */ Object i;
        public final /* synthetic */ a<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a<T> aVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.readAll$suspendImpl(this.j, this);
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {87}, m = "readAllItems$suspendImpl")
    /* loaded from: classes.dex */
    public static final class h<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public Collection i;
        public Iterator j;
        public /* synthetic */ Object k;
        public final /* synthetic */ a<T> l;
        public int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(a<T> aVar, com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(dVar);
            this.l = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return a.readAllItems$suspendImpl(this.l, null, this);
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {91, 91}, m = "readAllItems$suspendImpl")
    /* loaded from: classes.dex */
    public static final class i<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public /* synthetic */ Object i;
        public final /* synthetic */ a<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a<T> aVar, com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(dVar);
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.readAllItems$suspendImpl(this.j, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class j implements com.amazon.aps.iva.ve0.f<List<? extends String>> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;

        /* compiled from: Emitters.kt */
        /* renamed from: com.amazon.aps.iva.xe.a$j$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0856a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$readAllKeys$suspendImpl$$inlined$map$1$2", f = "GsonCache.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.xe.a$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0857a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0857a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return C0856a.this.a(null, this);
                }
            }

            public C0856a(com.amazon.aps.iva.ve0.g gVar) {
                this.b = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.xe.a.j.C0856a.C0857a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.xe.a$j$a$a r0 = (com.amazon.aps.iva.xe.a.j.C0856a.C0857a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.xe.a$j$a$a r0 = new com.amazon.aps.iva.xe.a$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L6c
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.d4.d r5 = (com.amazon.aps.iva.d4.d) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r6 = new java.util.ArrayList
                    int r2 = com.amazon.aps.iva.lb0.r.Y(r5)
                    r6.<init>(r2)
                    java.util.Iterator r5 = r5.iterator()
                L4b:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L5d
                    java.lang.Object r2 = r5.next()
                    com.amazon.aps.iva.d4.d$a r2 = (com.amazon.aps.iva.d4.d.a) r2
                    java.lang.String r2 = r2.a
                    r6.add(r2)
                    goto L4b
                L5d:
                    java.util.List r5 = com.amazon.aps.iva.lb0.x.X0(r6)
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L6c
                    return r1
                L6c:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.j.C0856a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public j(com.amazon.aps.iva.ve0.f fVar) {
            this.b = fVar;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super List<? extends String>> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new C0856a(gVar), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {59}, m = "readItem$suspendImpl")
    /* loaded from: classes.dex */
    public static final class k<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public String i;
        public Gson j;
        public /* synthetic */ Object k;
        public final /* synthetic */ a<T> l;
        public int m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(a<T> aVar, com.amazon.aps.iva.ob0.d<? super k> dVar) {
            super(dVar);
            this.l = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return a.readItem$suspendImpl(this.l, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class l implements com.amazon.aps.iva.ve0.f<String> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
        public final /* synthetic */ String c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.amazon.aps.iva.xe.a$l$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0858a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
            public final /* synthetic */ String c;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$readItem$suspendImpl$$inlined$map$1$2", f = "GsonCache.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.xe.a$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0859a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0859a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return C0858a.this.a(null, this);
                }
            }

            public C0858a(com.amazon.aps.iva.ve0.g gVar, String str) {
                this.b = gVar;
                this.c = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.xe.a.l.C0858a.C0859a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.xe.a$l$a$a r0 = (com.amazon.aps.iva.xe.a.l.C0858a.C0859a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.xe.a$l$a$a r0 = new com.amazon.aps.iva.xe.a$l$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.d4.d r5 = (com.amazon.aps.iva.d4.d) r5
                    java.lang.String r6 = r4.c
                    com.amazon.aps.iva.d4.d$a r6 = com.amazon.aps.iva.cq.b.n0(r6)
                    java.lang.Object r5 = r5.c(r6)
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.l.C0858a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public l(com.amazon.aps.iva.ve0.f fVar, String str) {
            this.b = fVar;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super String> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new C0858a(gVar, this.c), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache", f = "GsonCache.kt", l = {68}, m = "readRawItem$suspendImpl")
    /* loaded from: classes.dex */
    public static final class m<T> extends com.amazon.aps.iva.qb0.c {
        public a h;
        public Gson i;
        public /* synthetic */ Object j;
        public final /* synthetic */ a<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(a<T> aVar, com.amazon.aps.iva.ob0.d<? super m> dVar) {
            super(dVar);
            this.k = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a.readRawItem$suspendImpl(this.k, null, this);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class n implements com.amazon.aps.iva.ve0.f<String> {
        public final /* synthetic */ com.amazon.aps.iva.ve0.f b;
        public final /* synthetic */ String c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.amazon.aps.iva.xe.a$n$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0860a<T> implements com.amazon.aps.iva.ve0.g {
            public final /* synthetic */ com.amazon.aps.iva.ve0.g b;
            public final /* synthetic */ String c;

            /* compiled from: Emitters.kt */
            @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$readRawItem$suspendImpl$$inlined$map$1$2", f = "GsonCache.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.xe.a$n$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0861a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0861a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return C0860a.this.a(null, this);
                }
            }

            public C0860a(com.amazon.aps.iva.ve0.g gVar, String str) {
                this.b = gVar;
                this.c = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // com.amazon.aps.iva.ve0.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r5, com.amazon.aps.iva.ob0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.amazon.aps.iva.xe.a.n.C0860a.C0861a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.xe.a$n$a$a r0 = (com.amazon.aps.iva.xe.a.n.C0860a.C0861a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.xe.a$n$a$a r0 = new com.amazon.aps.iva.xe.a$n$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.d4.d r5 = (com.amazon.aps.iva.d4.d) r5
                    java.lang.String r6 = r4.c
                    com.amazon.aps.iva.d4.d$a r6 = com.amazon.aps.iva.cq.b.n0(r6)
                    java.lang.Object r5 = r5.c(r6)
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.n.C0860a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public n(com.amazon.aps.iva.ve0.f fVar, String str) {
            this.b = fVar;
            this.c = str;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(com.amazon.aps.iva.ve0.g<? super String> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new C0860a(gVar, this.c), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$saveItem$2", f = "GsonCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ a<T> i;
        public final /* synthetic */ T j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(a<T> aVar, T t, com.amazon.aps.iva.ob0.d<? super o> dVar) {
            super(2, dVar);
            this.i = aVar;
            this.j = t;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            o oVar = new o(this.i, this.j, dVar);
            oVar.h = obj;
            return oVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((o) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.h;
            a<T> aVar3 = this.i;
            T t = this.j;
            d.a<?> n0 = com.amazon.aps.iva.cq.b.n0(aVar3.getInternalCacheableId(t));
            String json = ((a) aVar3).gson.toJson(t);
            com.amazon.aps.iva.yb0.j.e(json, "gson.toJson(item)");
            aVar2.getClass();
            aVar2.h(n0, json);
            return q.a;
        }
    }

    /* compiled from: GsonCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.cache.GsonCache$saveItems$3", f = "GsonCache.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.d4.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;
        public final /* synthetic */ List<T> i;
        public final /* synthetic */ a<T> j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(a aVar, List list, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.i = list;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            p pVar = new p(this.j, this.i, dVar);
            pVar.h = obj;
            return pVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.d4.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((p) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.d4.a aVar2 = (com.amazon.aps.iva.d4.a) this.h;
            List<T> list = this.i;
            ArrayList arrayList = new ArrayList(r.Y(list));
            for (T t : list) {
                a<T> aVar3 = this.j;
                d.a n0 = com.amazon.aps.iva.cq.b.n0(aVar3.getInternalCacheableId(t));
                String json = ((a) aVar3).gson.toJson(t);
                com.amazon.aps.iva.yb0.j.e(json, "gson.toJson(item)");
                arrayList.add(new d.b(n0, json));
            }
            d.b[] bVarArr = (d.b[]) arrayList.toArray(new d.b[0]);
            d.b[] bVarArr2 = (d.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
            aVar2.getClass();
            com.amazon.aps.iva.yb0.j.f(bVarArr2, "pairs");
            aVar2.f();
            for (d.b bVar : bVarArr2) {
                aVar2.h(bVar.a, bVar.b);
            }
            return q.a;
        }
    }

    static {
    }

    public a(Class<T> cls, Context context, String str, Gson gson) {
        com.amazon.aps.iva.yb0.j.f(cls, "c");
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "storeKey");
        com.amazon.aps.iva.yb0.j.f(gson, "gson");
        this.c = cls;
        this.context = context;
        this.gson = gson;
        this.dataStore$delegate = w.q(str, new c(str), 10);
        this.inMemoryItems = new ConcurrentHashMap();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        com.amazon.aps.iva.yb0.j.e(synchronizedSet, "synchronizedSet(mutableSetOf())");
        this.removingItems = synchronizedSet;
    }

    public static <T> Object clear$suspendImpl(a<T> aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object a = com.amazon.aps.iva.d4.e.a(aVar.getDataStore(((a) aVar).context), new C0853a(aVar, null), dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    public static /* synthetic */ <T> Object contains$suspendImpl(a<T> aVar, String str, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return com.amazon.aps.iva.dg.b.q(new b(aVar.getDataStore(((a) aVar).context).getData(), str), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteInMemoryItem(String str) {
        this.inMemoryItems.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object deleteItem$suspendImpl(com.amazon.aps.iva.xe.a<T> r5, java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            boolean r0 = r7 instanceof com.amazon.aps.iva.xe.a.d
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.xe.a$d r0 = (com.amazon.aps.iva.xe.a.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$d r0 = new com.amazon.aps.iva.xe.a$d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.xe.a r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            android.content.Context r7 = r5.context
            com.amazon.aps.iva.z3.i r7 = r5.getDataStore(r7)
            com.amazon.aps.iva.xe.a$e r2 = new com.amazon.aps.iva.xe.a$e
            r4 = 0
            r2.<init>(r6, r4)
            r0.h = r5
            r0.i = r6
            r0.l = r3
            java.lang.Object r7 = com.amazon.aps.iva.d4.e.a(r7, r2, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r5.deleteInMemoryItem(r6)
            com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.deleteItem$suspendImpl(com.amazon.aps.iva.xe.a, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static <T> Object deleteItems$suspendImpl(a<T> aVar, List<String> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        ((a) aVar).removingItems.addAll(list);
        Object a = com.amazon.aps.iva.d4.e.a(aVar.getDataStore(((a) aVar).context), new f(aVar, list, null), dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    private final com.amazon.aps.iva.z3.i<com.amazon.aps.iva.d4.d> getDataStore(Context context) {
        return (com.amazon.aps.iva.z3.i) this.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[LOOP:0: B:21:0x0057->B:23:0x005d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readAll$suspendImpl(com.amazon.aps.iva.xe.a<T> r4, com.amazon.aps.iva.ob0.d<? super java.util.Map<java.lang.String, ? extends T>> r5) {
        /*
            boolean r0 = r5 instanceof com.amazon.aps.iva.xe.a.g
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.xe.a$g r0 = (com.amazon.aps.iva.xe.a.g) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$g r0 = new com.amazon.aps.iva.xe.a$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.xe.a r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4
            r0.k = r3
            java.lang.Object r5 = r4.readAllItems(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r0 = com.amazon.aps.iva.lb0.r.Y(r5)
            int r0 = com.amazon.aps.iva.aq.k.w(r0)
            r1 = 16
            if (r0 >= r1) goto L4e
            r0 = r1
        L4e:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L57:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            java.lang.String r2 = r4.getInternalCacheableId(r0)
            r1.put(r2, r0)
            goto L57
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.readAll$suspendImpl(com.amazon.aps.iva.xe.a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[PHI: r6 
      PHI: (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x0051, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readAllItems$suspendImpl(com.amazon.aps.iva.xe.a<T> r5, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends T>> r6) {
        /*
            boolean r0 = r6 instanceof com.amazon.aps.iva.xe.a.i
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.xe.a$i r0 = (com.amazon.aps.iva.xe.a.i) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$i r0 = new com.amazon.aps.iva.xe.a$i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L54
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.amazon.aps.iva.xe.a r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L46
        L38:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.k = r4
            java.lang.Object r6 = r5.readAllKeys(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.util.List r6 = (java.util.List) r6
            r2 = 0
            r0.h = r2
            r0.k = r3
            java.lang.Object r6 = r5.readAllItems(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.readAllItems$suspendImpl(com.amazon.aps.iva.xe.a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static /* synthetic */ <T> Object readAllKeys$suspendImpl(a<T> aVar, com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return com.amazon.aps.iva.dg.b.q(new j(aVar.getDataStore(((a) aVar).context).getData()), dVar);
    }

    private final T readInMemoryItem(String str) {
        return this.inMemoryItems.get(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readItem$suspendImpl(com.amazon.aps.iva.xe.a<T> r6, java.lang.String r7, com.amazon.aps.iva.ob0.d<? super T> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.xe.a.k
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.xe.a$k r0 = (com.amazon.aps.iva.xe.a.k) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$k r0 = new com.amazon.aps.iva.xe.a$k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.google.gson.Gson r6 = r0.j
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.xe.a r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            r5 = r8
            r8 = r6
            r6 = r0
            r0 = r5
            goto L6b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.util.Set<java.lang.String> r8 = r6.removingItems
            boolean r8 = r8.contains(r7)
            if (r8 == 0) goto L45
            goto L79
        L45:
            java.lang.Object r8 = r6.readInMemoryItem(r7)
            if (r8 != 0) goto L7a
            com.google.gson.Gson r8 = r6.gson
            android.content.Context r2 = r6.context
            com.amazon.aps.iva.z3.i r2 = r6.getDataStore(r2)
            com.amazon.aps.iva.ve0.f r2 = r2.getData()
            com.amazon.aps.iva.xe.a$l r4 = new com.amazon.aps.iva.xe.a$l
            r4.<init>(r2, r7)
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.m = r3
            java.lang.Object r0 = com.amazon.aps.iva.dg.b.s(r4, r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Class<T> r1 = r6.c
            java.lang.Object r8 = r8.fromJson(r0, r1)
            if (r8 == 0) goto L79
            r6.saveInMemoryItem(r7, r8)
            goto L7a
        L79:
            r8 = 0
        L7a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.readItem$suspendImpl(com.amazon.aps.iva.xe.a, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readRawItem$suspendImpl(com.amazon.aps.iva.xe.a<T> r6, java.lang.String r7, com.amazon.aps.iva.ob0.d<? super T> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.xe.a.m
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.xe.a$m r0 = (com.amazon.aps.iva.xe.a.m) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$m r0 = new com.amazon.aps.iva.xe.a$m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.google.gson.Gson r6 = r0.i
            com.amazon.aps.iva.xe.a r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L58
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.google.gson.Gson r8 = r6.gson
            android.content.Context r2 = r6.context
            com.amazon.aps.iva.z3.i r2 = r6.getDataStore(r2)
            com.amazon.aps.iva.ve0.f r2 = r2.getData()
            com.amazon.aps.iva.xe.a$n r4 = new com.amazon.aps.iva.xe.a$n
            r4.<init>(r2, r7)
            r0.h = r6
            r0.i = r8
            r0.l = r3
            java.lang.Object r7 = com.amazon.aps.iva.dg.b.s(r4, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class<T> r6 = r6.c
            java.lang.Object r6 = r8.fromJson(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.readRawItem$suspendImpl(com.amazon.aps.iva.xe.a, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    private final void saveInMemoryItem(String str, T t) {
        this.inMemoryItems.put(str, t);
    }

    public static <T> Object saveItem$suspendImpl(a<T> aVar, T t, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        aVar.saveInMemoryItem(aVar.getInternalCacheableId(t), t);
        Object a = com.amazon.aps.iva.d4.e.a(aVar.getDataStore(((a) aVar).context), new o(aVar, t, null), dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    public static <T> Object saveItems$suspendImpl(a<T> aVar, List<? extends T> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        if (list.isEmpty()) {
            return q.a;
        }
        Map<String, T> map = ((a) aVar).inMemoryItems;
        List<? extends T> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (T t : list2) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(aVar.getInternalCacheableId(t), t));
        }
        i0.X(arrayList, map);
        Object a = com.amazon.aps.iva.d4.e.a(aVar.getDataStore(((a) aVar).context), new p(aVar, list, null), dVar);
        if (a == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object clear(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return clear$suspendImpl(this, dVar);
    }

    public Object contains(String str, com.amazon.aps.iva.ob0.d<? super Boolean> dVar) {
        return contains$suspendImpl(this, str, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object deleteItem(String str, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return deleteItem$suspendImpl(this, str, dVar);
    }

    public Object deleteItems(List<String> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return deleteItems$suspendImpl(this, list, dVar);
    }

    public abstract String getInternalCacheableId(T t);

    public Object readAll(com.amazon.aps.iva.ob0.d<? super Map<String, ? extends T>> dVar) {
        return readAll$suspendImpl(this, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object readAllItems(com.amazon.aps.iva.ob0.d<? super List<? extends T>> dVar) {
        return readAllItems$suspendImpl(this, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object readAllKeys(com.amazon.aps.iva.ob0.d<? super List<String>> dVar) {
        return readAllKeys$suspendImpl(this, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object readItem(String str, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        return readItem$suspendImpl(this, str, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object readRawItem(String str, com.amazon.aps.iva.ob0.d<? super T> dVar) {
        return readRawItem$suspendImpl(this, str, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object saveItem(T t, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return saveItem$suspendImpl(this, t, dVar);
    }

    @Override // com.amazon.aps.iva.xe.b
    public Object saveItems(List<? extends T> list, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return saveItems$suspendImpl(this, list, dVar);
    }

    public Object readAllItems(List<String> list, com.amazon.aps.iva.ob0.d<? super List<? extends T>> dVar) {
        return readAllItems$suspendImpl(this, list, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006b -> B:12:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> java.lang.Object readAllItems$suspendImpl(com.amazon.aps.iva.xe.a<T> r6, java.util.List<java.lang.String> r7, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends T>> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.xe.a.h
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.xe.a$h r0 = (com.amazon.aps.iva.xe.a.h) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.xe.a$h r0 = new com.amazon.aps.iva.xe.a$h
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.util.Iterator r6 = r0.j
            java.util.Collection r7 = r0.i
            java.util.Collection r7 = (java.util.Collection) r7
            com.amazon.aps.iva.xe.a r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            r5 = r0
            r0 = r7
            r7 = r2
        L31:
            r2 = r1
            r1 = r5
            goto L6f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r7
            r7 = r6
            r6 = r5
        L4d:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.h = r7
            r4 = r8
            java.util.Collection r4 = (java.util.Collection) r4
            r0.i = r4
            r0.j = r6
            r0.m = r3
            java.lang.Object r2 = r7.readItem(r2, r0)
            if (r2 != r1) goto L6b
            return r1
        L6b:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L31
        L6f:
            if (r8 == 0) goto L74
            r0.add(r8)
        L74:
            r8 = r0
            r0 = r1
            r1 = r2
            goto L4d
        L78:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xe.a.readAllItems$suspendImpl(com.amazon.aps.iva.xe.a, java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
