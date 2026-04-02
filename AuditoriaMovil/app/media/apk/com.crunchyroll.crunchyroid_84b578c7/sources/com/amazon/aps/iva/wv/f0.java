package com.amazon.aps.iva.wv;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.google.android.gms.cast.MediaError;
import java.util.Comparator;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class f0 extends com.amazon.aps.iva.xe.a<Season> implements e0 {
    public final Context b;

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.SeasonsCacheImpl", f = "DownloadModelCache.kt", l = {MediaError.DetailedErrorCode.DASH_MANIFEST_UNKNOWN, MediaError.DetailedErrorCode.DASH_MANIFEST_UNKNOWN}, m = "deleteAll")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public f0 i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return f0.this.b(null, this);
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        public final /* synthetic */ w b;

        public b(w wVar) {
            this.b = wVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer num;
            List<String> c;
            List<String> c2;
            Season season = (Season) t;
            Integer num2 = null;
            w wVar = this.b;
            if (wVar != null && (c2 = wVar.c()) != null) {
                num = Integer.valueOf(c2.indexOf(season.getId()));
            } else {
                num = null;
            }
            Season season2 = (Season) t2;
            if (wVar != null && (c = wVar.c()) != null) {
                num2 = Integer.valueOf(c.indexOf(season2.getId()));
            }
            return f1.t(num, num2);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.SeasonsCacheImpl", f = "DownloadModelCache.kt", l = {413, 414}, m = "readAll")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return f0.this.c(null, this);
        }
    }

    public f0(Context context) {
        super(Season.class, context, "seasons_cache", GsonHolder.getInstance());
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[LOOP:1: B:27:0x0084->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.amazon.aps.iva.xe.a] */
    @Override // com.amazon.aps.iva.wv.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.wv.f0.a
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.wv.f0$a r0 = (com.amazon.aps.iva.wv.f0.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.f0$a r0 = new com.amazon.aps.iva.wv.f0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ab.x.i0(r10)
            goto Lab
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            com.amazon.aps.iva.wv.f0 r9 = r0.i
            java.lang.String r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L51
        L3f:
            com.amazon.aps.iva.ab.x.i0(r10)
            r0.h = r9
            r0.i = r8
            r0.l = r4
            java.lang.Object r10 = r8.readAllItems(r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            r2 = r10
            r10 = r8
        L51:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L5c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L77
            java.lang.Object r5 = r2.next()
            r6 = r5
            com.ellation.crunchyroll.api.cms.model.Season r6 = (com.ellation.crunchyroll.api.cms.model.Season) r6
            java.lang.String r6 = r6.getSeriesId()
            boolean r6 = com.amazon.aps.iva.yb0.j.a(r6, r9)
            if (r6 == 0) goto L5c
            r4.add(r5)
            goto L5c
        L77:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r4)
            r9.<init>(r2)
            java.util.Iterator r2 = r4.iterator()
        L84:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r2.next()
            com.ellation.crunchyroll.api.cms.model.Season r4 = (com.ellation.crunchyroll.api.cms.model.Season) r4
            java.lang.String r5 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r4, r5)
            java.lang.String r4 = r4.getId()
            r9.add(r4)
            goto L84
        L9d:
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r9 = r10.deleteItems(r9, r0)
            if (r9 != r1) goto Lab
            return r1
        Lab:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.f0.b(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    @Override // com.amazon.aps.iva.wv.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.cms.model.Season>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.wv.f0.c
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.wv.f0$c r0 = (com.amazon.aps.iva.wv.f0.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.f0$c r0 = new com.amazon.aps.iva.wv.f0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.wv.w r8 = (com.amazon.aps.iva.wv.w) r8
            java.lang.Object r0 = r0.h
            java.lang.String r0 = (java.lang.String) r0
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L85
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.i
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.wv.f0 r2 = (com.amazon.aps.iva.wv.f0) r2
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L72
        L46:
            com.amazon.aps.iva.ab.x.i0(r9)
            android.content.Context r9 = r7.b
            java.lang.String r2 = "context"
            com.amazon.aps.iva.yb0.j.f(r9, r2)
            com.amazon.aps.iva.wv.h0 r2 = com.amazon.aps.iva.wv.g0.a.a
            if (r2 != 0) goto L64
            com.amazon.aps.iva.wv.h0 r2 = new com.amazon.aps.iva.wv.h0
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r5 = "context.applicationContext"
            com.amazon.aps.iva.yb0.j.e(r9, r5)
            r2.<init>(r9)
            com.amazon.aps.iva.wv.g0.a.a = r2
        L64:
            r0.h = r7
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r2.readItem(r8, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r2 = r7
        L72:
            com.amazon.aps.iva.wv.w r9 = (com.amazon.aps.iva.wv.w) r9
            r0.h = r8
            r0.i = r9
            r0.l = r3
            java.lang.Object r0 = r2.readAllItems(r0)
            if (r0 != r1) goto L81
            return r1
        L81:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L85:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L90:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r9.next()
            r3 = r2
            com.ellation.crunchyroll.api.cms.model.Season r3 = (com.ellation.crunchyroll.api.cms.model.Season) r3
            java.lang.String r3 = r3.getSeriesId()
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r3, r0)
            if (r3 == 0) goto L90
            r1.add(r2)
            goto L90
        Lab:
            com.amazon.aps.iva.wv.f0$b r9 = new com.amazon.aps.iva.wv.f0$b
            r9.<init>(r8)
            java.util.List r8 = com.amazon.aps.iva.lb0.x.T0(r1, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.f0.c(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Season season) {
        Season season2 = season;
        com.amazon.aps.iva.yb0.j.f(season2, "<this>");
        return season2.getId();
    }
}
