package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public abstract class c extends com.amazon.aps.iva.xe.a<Subtitle> implements n0 {

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.BaseSubtitlesCacheImpl", f = "DownloadModelCache.kt", l = {377, 377}, m = "deleteAll$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public c i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return c.i(c.this, null, this);
        }
    }

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.BaseSubtitlesCacheImpl", f = "DownloadModelCache.kt", l = {370, 369}, m = "deleteAllFor$suspendImpl")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public List h;
        public c i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return c.j(c.this, null, this);
        }
    }

    public c(Context context, String str) {
        super(Subtitle.class, context, str, GsonHolder.getInstance());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[LOOP:1: B:26:0x007e->B:28:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object i(com.amazon.aps.iva.wv.c r6, java.lang.String r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            boolean r0 = r8 instanceof com.amazon.aps.iva.wv.c.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.wv.c$a r0 = (com.amazon.aps.iva.wv.c.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.c$a r0 = new com.amazon.aps.iva.wv.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ab.x.i0(r8)
            goto La0
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.wv.c r6 = r0.i
            java.lang.String r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4b
        L3b:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r7
            r0.i = r6
            r0.l = r4
            java.lang.Object r8 = r6.readAllItems(r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.ellation.crunchyroll.api.model.Subtitle r5 = (com.ellation.crunchyroll.api.model.Subtitle) r5
            java.lang.String r5 = r5.getParentId()
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r7)
            if (r5 == 0) goto L56
            r2.add(r4)
            goto L56
        L71:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = com.amazon.aps.iva.lb0.r.Y(r2)
            r7.<init>(r8)
            java.util.Iterator r8 = r2.iterator()
        L7e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L92
            java.lang.Object r2 = r8.next()
            com.ellation.crunchyroll.api.model.Subtitle r2 = (com.ellation.crunchyroll.api.model.Subtitle) r2
            java.lang.String r2 = r2.getId()
            r7.add(r2)
            goto L7e
        L92:
            r8 = 0
            r0.h = r8
            r0.i = r8
            r0.l = r3
            java.lang.Object r6 = r6.deleteItems(r7, r0)
            if (r6 != r1) goto La0
            return r1
        La0:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.c.i(com.amazon.aps.iva.wv.c, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[LOOP:2: B:37:0x00ad->B:39:0x00b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object j(com.amazon.aps.iva.wv.c r10, java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset> r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            boolean r0 = r12 instanceof com.amazon.aps.iva.wv.c.b
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.wv.c$b r0 = (com.amazon.aps.iva.wv.c.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.c$b r0 = new com.amazon.aps.iva.wv.c$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.ab.x.i0(r12)
            goto Lcf
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            com.amazon.aps.iva.wv.c r10 = r0.i
            java.util.List r11 = r0.h
            java.util.List r11 = (java.util.List) r11
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L50
        L3d:
            com.amazon.aps.iva.ab.x.i0(r12)
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            r0.h = r12
            r0.i = r10
            r0.l = r4
            java.lang.Object r12 = r10.readAllItems(r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
        L5b:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto La0
            java.lang.Object r5 = r12.next()
            r6 = r5
            com.ellation.crunchyroll.api.model.Subtitle r6 = (com.ellation.crunchyroll.api.model.Subtitle) r6
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L79
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L79
            goto L99
        L79:
            java.util.Iterator r7 = r7.iterator()
        L7d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L99
            java.lang.Object r8 = r7.next()
            com.ellation.crunchyroll.model.PlayableAsset r8 = (com.ellation.crunchyroll.model.PlayableAsset) r8
            java.lang.String r8 = r8.getId()
            java.lang.String r9 = r6.getParentId()
            boolean r8 = com.amazon.aps.iva.yb0.j.a(r8, r9)
            if (r8 == 0) goto L7d
            r6 = r4
            goto L9a
        L99:
            r6 = 0
        L9a:
            if (r6 == 0) goto L5b
            r2.add(r5)
            goto L5b
        La0:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = com.amazon.aps.iva.lb0.r.Y(r2)
            r11.<init>(r12)
            java.util.Iterator r12 = r2.iterator()
        Lad:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto Lc1
            java.lang.Object r2 = r12.next()
            com.ellation.crunchyroll.api.model.Subtitle r2 = (com.ellation.crunchyroll.api.model.Subtitle) r2
            java.lang.String r2 = r2.getId()
            r11.add(r2)
            goto Lad
        Lc1:
            r12 = 0
            r0.h = r12
            r0.i = r12
            r0.l = r3
            java.lang.Object r10 = r10.deleteItems(r11, r0)
            if (r10 != r1) goto Lcf
            return r1
        Lcf:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.c.j(com.amazon.aps.iva.wv.c, java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.wv.n0
    public final Object a(List<? extends PlayableAsset> list, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return j(this, list, dVar);
    }

    @Override // com.amazon.aps.iva.wv.n0
    public final Object b(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return i(this, str, dVar);
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Subtitle subtitle) {
        Subtitle subtitle2 = subtitle;
        com.amazon.aps.iva.yb0.j.f(subtitle2, "<this>");
        return subtitle2.getId();
    }
}
