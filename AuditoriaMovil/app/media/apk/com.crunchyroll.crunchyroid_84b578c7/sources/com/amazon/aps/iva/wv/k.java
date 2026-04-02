package com.amazon.aps.iva.wv;

import android.content.Context;
import com.amazon.aps.iva.ee0.f1;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.Episode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.xe.a<Episode> implements j {
    public final Context b;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public final /* synthetic */ w b;

        public a(w wVar) {
            this.b = wVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer num;
            List<String> c;
            List<String> c2;
            Episode episode = (Episode) t;
            Integer num2 = null;
            w wVar = this.b;
            if (wVar != null && (c2 = wVar.c()) != null) {
                num = Integer.valueOf(c2.indexOf(episode.getId()));
            } else {
                num = null;
            }
            Episode episode2 = (Episode) t2;
            if (wVar != null && (c = wVar.c()) != null) {
                num2 = Integer.valueOf(c.indexOf(episode2.getId()));
            }
            return f1.t(num, num2);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.EpisodeCacheImpl", f = "DownloadModelCache.kt", l = {179, 180}, m = "readAllBySeason")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return k.this.e(null, this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.EpisodeCacheImpl", f = "DownloadModelCache.kt", l = {171, 172}, m = "readItem")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return k.this.readItem(null, this);
        }
    }

    public k(Context context) {
        super(Episode.class, context, "episode_cache", GsonHolder.getInstance());
        this.b = context;
    }

    @Override // com.amazon.aps.iva.wv.j
    public final Object d(List<Episode> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        List<Episode> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (Episode episode : list2) {
            arrayList.add(com.amazon.aps.iva.aq.j.r(episode));
        }
        Object deleteItems = deleteItems(arrayList, dVar);
        if (deleteItems == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deleteItems;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    @Override // com.amazon.aps.iva.wv.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.model.Episode>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.wv.k.b
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.wv.k$b r0 = (com.amazon.aps.iva.wv.k.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.k$b r0 = new com.amazon.aps.iva.wv.k$b
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
            com.amazon.aps.iva.wv.k r2 = (com.amazon.aps.iva.wv.k) r2
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L72
        L46:
            com.amazon.aps.iva.ab.x.i0(r9)
            android.content.Context r9 = r7.b
            java.lang.String r2 = "context"
            com.amazon.aps.iva.yb0.j.f(r9, r2)
            com.amazon.aps.iva.wv.n r2 = com.amazon.aps.iva.wv.m.a.a
            if (r2 != 0) goto L64
            com.amazon.aps.iva.wv.n r2 = new com.amazon.aps.iva.wv.n
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r5 = "context.applicationContext"
            com.amazon.aps.iva.yb0.j.e(r9, r5)
            r2.<init>(r9)
            com.amazon.aps.iva.wv.m.a.a = r2
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
            com.ellation.crunchyroll.model.Episode r3 = (com.ellation.crunchyroll.model.Episode) r3
            java.lang.String r3 = r3.getSeasonId()
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r3, r0)
            if (r3 == 0) goto L90
            r1.add(r2)
            goto L90
        Lab:
            com.amazon.aps.iva.wv.k$a r9 = new com.amazon.aps.iva.wv.k$a
            r9.<init>(r8)
            java.util.List r8 = com.amazon.aps.iva.lb0.x.T0(r1, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.k.e(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Episode episode) {
        Episode episode2 = episode;
        com.amazon.aps.iva.yb0.j.f(episode2, "<this>");
        return episode2.getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    @Override // com.amazon.aps.iva.wv.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(java.lang.String r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.wv.l
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.wv.l r0 = (com.amazon.aps.iva.wv.l) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.l r0 = new com.amazon.aps.iva.wv.l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.k = r3
            java.lang.Object r6 = r4.readAllItems(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.ellation.crunchyroll.model.Episode r2 = (com.ellation.crunchyroll.model.Episode) r2
            java.lang.String r2 = r2.getSeriesId()
            boolean r2 = com.amazon.aps.iva.yb0.j.a(r2, r5)
            if (r2 == 0) goto L4a
            r0.add(r1)
            goto L4a
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.k.h(java.lang.String, com.amazon.aps.iva.ob0.d):java.io.Serializable");
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
    public final java.lang.Object readItem(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.Episode> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.k.c
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.k$c r0 = (com.amazon.aps.iva.wv.k.c) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.k$c r0 = new com.amazon.aps.iva.wv.k$c
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
            com.ellation.crunchyroll.model.Episode r6 = (com.ellation.crunchyroll.model.Episode) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.wv.k r6 = (com.amazon.aps.iva.wv.k) r6
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
            com.ellation.crunchyroll.model.Episode r7 = (com.ellation.crunchyroll.model.Episode) r7
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.k.readItem(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
