package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.google.android.gms.cast.MediaError;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.xe.a<com.amazon.aps.iva.xv.b> implements d {

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.BifCacheImpl", f = "DownloadModelCache.kt", l = {329, 329}, m = "deleteAll")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public e i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.BifCacheImpl", f = "DownloadModelCache.kt", l = {MediaError.DetailedErrorCode.DASH_NO_INIT, MediaError.DetailedErrorCode.DASH_NETWORK}, m = "deleteAllFor")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public List h;
        public e i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    public e(Context context) {
        super(com.amazon.aps.iva.xv.b.class, context, "bif_cache", GsonHolder.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[LOOP:2: B:38:0x00b3->B:40:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r14v6, types: [com.amazon.aps.iva.xe.a] */
    @Override // com.amazon.aps.iva.wv.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r13, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.wv.e.b
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.wv.e$b r0 = (com.amazon.aps.iva.wv.e.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.e$b r0 = new com.amazon.aps.iva.wv.e$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ab.x.i0(r14)
            goto Ld5
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            com.amazon.aps.iva.wv.e r13 = r0.i
            java.util.List r2 = r0.h
            java.util.List r2 = (java.util.List) r2
            com.amazon.aps.iva.ab.x.i0(r14)
            r11 = r14
            r14 = r13
            r13 = r2
            r2 = r11
            goto L56
        L41:
            com.amazon.aps.iva.ab.x.i0(r14)
            r14 = r13
            java.util.List r14 = (java.util.List) r14
            r0.h = r14
            r0.i = r12
            r0.l = r4
            java.lang.Object r14 = r12.readAllItems(r0)
            if (r14 != r1) goto L54
            return r1
        L54:
            r2 = r14
            r14 = r12
        L56:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L61:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto La6
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.amazon.aps.iva.xv.b r7 = (com.amazon.aps.iva.xv.b) r7
            r8 = r13
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L7f
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L7f
            goto L9f
        L7f:
            java.util.Iterator r8 = r8.iterator()
        L83:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L9f
            java.lang.Object r9 = r8.next()
            com.ellation.crunchyroll.model.PlayableAsset r9 = (com.ellation.crunchyroll.model.PlayableAsset) r9
            java.lang.String r9 = r9.getId()
            java.lang.String r10 = r7.c()
            boolean r9 = com.amazon.aps.iva.yb0.j.a(r9, r10)
            if (r9 == 0) goto L83
            r7 = r4
            goto La0
        L9f:
            r7 = 0
        La0:
            if (r7 == 0) goto L61
            r5.add(r6)
            goto L61
        La6:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r5)
            r13.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        Lb3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lc7
            java.lang.Object r4 = r2.next()
            com.amazon.aps.iva.xv.b r4 = (com.amazon.aps.iva.xv.b) r4
            java.lang.String r4 = r4.b()
            r13.add(r4)
            goto Lb3
        Lc7:
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r13 = r14.deleteItems(r13, r0)
            if (r13 != r1) goto Ld5
            return r1
        Ld5:
            com.amazon.aps.iva.kb0.q r13 = com.amazon.aps.iva.kb0.q.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.e.a(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[LOOP:1: B:27:0x0084->B:29:0x008a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5 A[RETURN] */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.amazon.aps.iva.xe.a] */
    @Override // com.amazon.aps.iva.wv.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.wv.e.a
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.wv.e$a r0 = (com.amazon.aps.iva.wv.e.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.e$a r0 = new com.amazon.aps.iva.wv.e$a
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
            goto La6
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            com.amazon.aps.iva.wv.e r9 = r0.i
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
            com.amazon.aps.iva.xv.b r6 = (com.amazon.aps.iva.xv.b) r6
            java.lang.String r6 = r6.c()
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
            if (r4 == 0) goto L98
            java.lang.Object r4 = r2.next()
            com.amazon.aps.iva.xv.b r4 = (com.amazon.aps.iva.xv.b) r4
            java.lang.String r4 = r4.b()
            r9.add(r4)
            goto L84
        L98:
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r9 = r10.deleteItems(r9, r0)
            if (r9 != r1) goto La6
            return r1
        La6:
            com.amazon.aps.iva.kb0.q r9 = com.amazon.aps.iva.kb0.q.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.e.b(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(com.amazon.aps.iva.xv.b bVar) {
        com.amazon.aps.iva.xv.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "<this>");
        return bVar2.b();
    }
}
