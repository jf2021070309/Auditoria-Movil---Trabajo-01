package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class p extends com.amazon.aps.iva.xe.a<com.amazon.aps.iva.xv.c> implements o {

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.ImageCacheImpl", f = "DownloadModelCache.kt", l = {492, 491}, m = "deleteAll")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public p h;
        public String i;
        public p j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.ImageCacheImpl", f = "DownloadModelCache.kt", l = {484, 483}, m = "deleteAllFor")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public p h;
        public List i;
        public p j;
        public /* synthetic */ Object k;
        public int m;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    public p(Context context) {
        super(com.amazon.aps.iva.xv.c.class, context, "image_cache", GsonHolder.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[LOOP:2: B:38:0x00b8->B:40:0x00be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.amazon.aps.iva.xe.a] */
    @Override // com.amazon.aps.iva.wv.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r14, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.p.a(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[LOOP:1: B:27:0x0089->B:29:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4 A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.amazon.aps.iva.xe.a] */
    @Override // com.amazon.aps.iva.wv.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.wv.p.a
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.wv.p$a r0 = (com.amazon.aps.iva.wv.p.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.p$a r0 = new com.amazon.aps.iva.wv.p$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Lb5
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            com.amazon.aps.iva.wv.p r10 = r0.j
            java.lang.String r2 = r0.i
            com.amazon.aps.iva.wv.p r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            r8 = r11
            r11 = r10
            r10 = r2
            r2 = r8
            goto L56
        L41:
            com.amazon.aps.iva.ab.x.i0(r11)
            r0.h = r9
            r0.i = r10
            r0.j = r9
            r0.m = r4
            java.lang.Object r11 = r9.readAllItems(r0)
            if (r11 != r1) goto L53
            return r1
        L53:
            r4 = r9
            r2 = r11
            r11 = r4
        L56:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L61:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r2.next()
            r7 = r6
            com.amazon.aps.iva.xv.c r7 = (com.amazon.aps.iva.xv.c) r7
            java.lang.String r7 = r7.c()
            boolean r7 = com.amazon.aps.iva.yb0.j.a(r7, r10)
            if (r7 == 0) goto L61
            r5.add(r6)
            goto L61
        L7c:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r5)
            r10.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L89:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto La5
            java.lang.Object r5 = r2.next()
            com.amazon.aps.iva.xv.c r5 = (com.amazon.aps.iva.xv.c) r5
            r4.getClass()
            java.lang.String r6 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r5, r6)
            java.lang.String r5 = r5.b()
            r10.add(r5)
            goto L89
        La5:
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r0.m = r3
            java.lang.Object r10 = r11.deleteItems(r10, r0)
            if (r10 != r1) goto Lb5
            return r1
        Lb5:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.p.b(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(com.amazon.aps.iva.xv.c cVar) {
        com.amazon.aps.iva.xv.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "<this>");
        return cVar2.b();
    }
}
