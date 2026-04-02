package com.amazon.aps.iva.si;

import android.content.Context;
import com.amazon.aps.iva.b50.w;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.ve0.f;
import com.amazon.aps.iva.ve0.g;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.x;
import com.google.gson.Gson;
import java.io.Serializable;
/* compiled from: ObjectDataStore.kt */
/* loaded from: classes.dex */
public final class b<T extends Serializable> implements com.amazon.aps.iva.si.a<T> {
    public static final /* synthetic */ l<Object>[] e = {e0.a.h(new x(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public final Context b;
    public final com.amazon.aps.iva.xb0.a<String> c;
    public final Class<T> a = com.amazon.aps.iva.am.a.class;
    public final com.amazon.aps.iva.c4.c d = w.q("selected_profile", null, 14);

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class a implements f<String> {
        public final /* synthetic */ f b;
        public final /* synthetic */ b c;

        /* compiled from: Emitters.kt */
        /* renamed from: com.amazon.aps.iva.si.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0706a<T> implements g {
            public final /* synthetic */ g b;
            public final /* synthetic */ b c;

            /* compiled from: Emitters.kt */
            @e(c = "com.crunchyroll.mvvm.datastore.ObjectDataStoreImpl$read$$inlined$map$1$2", f = "ObjectDataStore.kt", l = {223}, m = "emit")
            /* renamed from: com.amazon.aps.iva.si.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0707a extends com.amazon.aps.iva.qb0.c {
                public /* synthetic */ Object h;
                public int i;

                public C0707a(com.amazon.aps.iva.ob0.d dVar) {
                    super(dVar);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    this.h = obj;
                    this.i |= Integer.MIN_VALUE;
                    return C0706a.this.a(null, this);
                }
            }

            public C0706a(g gVar, b bVar) {
                this.b = gVar;
                this.c = bVar;
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
                    boolean r0 = r6 instanceof com.amazon.aps.iva.si.b.a.C0706a.C0707a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.amazon.aps.iva.si.b$a$a$a r0 = (com.amazon.aps.iva.si.b.a.C0706a.C0707a) r0
                    int r1 = r0.i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.i = r1
                    goto L18
                L13:
                    com.amazon.aps.iva.si.b$a$a$a r0 = new com.amazon.aps.iva.si.b$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.h
                    com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
                    int r2 = r0.i
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    com.amazon.aps.iva.ab.x.i0(r6)
                    goto L51
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    com.amazon.aps.iva.ab.x.i0(r6)
                    com.amazon.aps.iva.d4.d r5 = (com.amazon.aps.iva.d4.d) r5
                    com.amazon.aps.iva.si.b r6 = r4.c
                    com.amazon.aps.iva.xb0.a<java.lang.String> r6 = r6.c
                    java.lang.Object r6 = r6.invoke()
                    java.lang.String r6 = (java.lang.String) r6
                    com.amazon.aps.iva.d4.d$a r6 = com.amazon.aps.iva.cq.b.n0(r6)
                    java.lang.Object r5 = r5.c(r6)
                    r0.i = r3
                    com.amazon.aps.iva.ve0.g r6 = r4.b
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L51
                    return r1
                L51:
                    com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.si.b.a.C0706a.a(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
            }
        }

        public a(f fVar, b bVar) {
            this.b = fVar;
            this.c = bVar;
        }

        @Override // com.amazon.aps.iva.ve0.f
        public final Object c(g<? super String> gVar, com.amazon.aps.iva.ob0.d dVar) {
            Object c = this.b.c(new C0706a(gVar, this.c), dVar);
            if (c == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return c;
            }
            return q.a;
        }
    }

    /* compiled from: ObjectDataStore.kt */
    @e(c = "com.crunchyroll.mvvm.datastore.ObjectDataStoreImpl", f = "ObjectDataStore.kt", l = {40}, m = "read")
    /* renamed from: com.amazon.aps.iva.si.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0708b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public Gson i;
        public /* synthetic */ Object j;
        public final /* synthetic */ b<T> k;
        public int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0708b(b<T> bVar, com.amazon.aps.iva.ob0.d<? super C0708b> dVar) {
            super(dVar);
            this.k = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return this.k.b(this);
        }
    }

    public b(Context context, com.amazon.aps.iva.am.f fVar) {
        this.b = context;
        this.c = fVar;
    }

    @Override // com.amazon.aps.iva.si.a
    public final Object a(com.amazon.aps.iva.am.a aVar, com.amazon.aps.iva.ob0.d dVar) {
        Object a2 = com.amazon.aps.iva.d4.e.a(this.d.getValue(this.b, e[0]), new c(this, aVar, null), dVar);
        if (a2 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return q.a;
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // com.amazon.aps.iva.si.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.amazon.aps.iva.ob0.d<? super T> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.si.b.C0708b
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.si.b$b r0 = (com.amazon.aps.iva.si.b.C0708b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.si.b$b r0 = new com.amazon.aps.iva.si.b$b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.gson.Gson r1 = r0.i
            com.amazon.aps.iva.si.b r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.google.gson.Gson r7 = com.amazon.aps.iva.si.d.a
            com.amazon.aps.iva.fc0.l<java.lang.Object>[] r2 = com.amazon.aps.iva.si.b.e
            r4 = 0
            r2 = r2[r4]
            com.amazon.aps.iva.c4.c r4 = r6.d
            android.content.Context r5 = r6.b
            java.lang.Object r2 = r4.getValue(r5, r2)
            com.amazon.aps.iva.z3.i r2 = (com.amazon.aps.iva.z3.i) r2
            com.amazon.aps.iva.ve0.f r2 = r2.getData()
            com.amazon.aps.iva.si.b$a r4 = new com.amazon.aps.iva.si.b$a
            r4.<init>(r2, r6)
            r0.h = r6
            r0.i = r7
            r0.l = r3
            java.lang.Object r0 = com.amazon.aps.iva.dg.b.s(r4, r0)
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r1 = r7
            r7 = r0
            r0 = r6
        L60:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class<T extends java.io.Serializable> r0 = r0.a
            java.lang.Object r7 = r1.fromJson(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.si.b.b(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
