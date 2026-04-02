package com.amazon.aps.iva.wv;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.wv.z;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.Panel;
import java.util.Comparator;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.xe.a<Panel> implements x {
    public final Context b;

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelCacheImpl", f = "DownloadModelCache.kt", l = {64, 65}, m = "deleteItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public y h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return y.this.deleteItem(null, this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Object e;
            Object e2;
            y yVar = y.this;
            e = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new d((Panel) t2, null));
            e2 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new d((Panel) t, null));
            return f1.t((Long) e, (Long) e2);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelCacheImpl", f = "DownloadModelCache.kt", l = {51}, m = "readAllItems")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public y h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return y.this.readAllItems(this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelCacheImpl$readAllItems$2$1", f = "DownloadModelCache.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super Long>, Object> {
        public int h;
        public final /* synthetic */ Panel j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Panel panel, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.j = panel;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new d(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super Long> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            long j;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                int i2 = z.a;
                z a = z.a.a.a(y.this.b);
                String id = this.j.getId();
                this.h = 1;
                obj = a.readItem(id, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            i iVar = (i) obj;
            if (iVar != null) {
                j = iVar.a();
            } else {
                j = 0;
            }
            return new Long(j);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelCacheImpl", f = "DownloadModelCache.kt", l = {59, 60}, m = "readItem")
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return y.this.readItem(null, this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelCacheImpl", f = "DownloadModelCache.kt", l = {46, 47}, m = "saveItem")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public y h;
        public Panel i;
        public /* synthetic */ Object j;
        public int l;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return y.this.saveItem(null, this);
        }
    }

    public y(Context context) {
        super(Panel.class, context, "panel_cache", GsonHolder.getInstance());
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteItem(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.y.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.y$a r0 = (com.amazon.aps.iva.wv.y.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.y$a r0 = new com.amazon.aps.iva.wv.y$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.wv.y r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = super.deleteItem(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            com.amazon.aps.iva.wv.z$a r7 = com.amazon.aps.iva.wv.z.a.a
            android.content.Context r2 = r2.b
            com.amazon.aps.iva.wv.z r7 = r7.a(r2)
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r7.deleteItem(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.y.deleteItem(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "<this>");
        return panel2.getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveItem(com.ellation.crunchyroll.model.Panel r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.wv.y.f
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.wv.y$f r0 = (com.amazon.aps.iva.wv.y.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.y$f r0 = new com.amazon.aps.iva.wv.y$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.ellation.crunchyroll.model.Panel r7 = r0.i
            com.amazon.aps.iva.wv.y r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r6
            r0.i = r7
            r0.l = r4
            java.lang.Object r8 = super.saveItem(r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r2 = r6
        L4b:
            com.amazon.aps.iva.wv.z$a r8 = com.amazon.aps.iva.wv.z.a.a
            android.content.Context r2 = r2.b
            com.amazon.aps.iva.wv.z r8 = r8.a(r2)
            java.lang.String r2 = "panel"
            com.amazon.aps.iva.yb0.j.f(r7, r2)
            com.amazon.aps.iva.wv.i r2 = new com.amazon.aps.iva.wv.i
            java.lang.String r7 = r7.getId()
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            r2.<init>(r7, r4)
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            com.amazon.aps.iva.wv.a0 r8 = (com.amazon.aps.iva.wv.a0) r8
            java.lang.Object r7 = r8.saveItem(r2, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.y.saveItem(com.ellation.crunchyroll.model.Panel, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readAllItems(com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.Panel>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.wv.y.c
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.wv.y$c r0 = (com.amazon.aps.iva.wv.y.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.y$c r0 = new com.amazon.aps.iva.wv.y$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.wv.y r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4
            r0.k = r3
            java.lang.Object r5 = super.readAllItems(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            r0 = r4
        L40:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.amazon.aps.iva.wv.y$b r1 = new com.amazon.aps.iva.wv.y$b
            r1.<init>()
            java.util.List r5 = com.amazon.aps.iva.lb0.x.T0(r5, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.y.readAllItems(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[ORIG_RETURN, RETURN] */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readItem(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.Panel> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.y.e
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.y$e r0 = (com.amazon.aps.iva.wv.y.e) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.y$e r0 = new com.amazon.aps.iva.wv.y$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.h
            com.ellation.crunchyroll.model.Panel r6 = (com.ellation.crunchyroll.model.Panel) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.wv.y r6 = (com.amazon.aps.iva.wv.y) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3e:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            java.lang.Object r7 = super.readItem(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            com.ellation.crunchyroll.model.Panel r7 = (com.ellation.crunchyroll.model.Panel) r7
            if (r7 == 0) goto L64
            com.ellation.crunchyroll.model.Images r2 = r7.getImages()
            android.content.Context r6 = r6.b
            r0.h = r7
            r0.k = r3
            java.lang.Object r6 = com.amazon.aps.iva.wv.p0.a(r2, r6, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            r6 = r7
            goto L65
        L64:
            r6 = 0
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.y.readItem(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
