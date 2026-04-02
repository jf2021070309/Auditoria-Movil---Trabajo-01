package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: DownloadHistoryCache.kt */
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.xe.a<i> implements z {

    /* compiled from: DownloadHistoryCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelDownloadHistoryCacheImpl", f = "DownloadHistoryCache.kt", l = {40, 41}, m = "saveItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public a0 h;
        public i i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return a0.this.saveItem(null, this);
        }
    }

    /* compiled from: DownloadHistoryCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.PanelDownloadHistoryCacheImpl", f = "DownloadHistoryCache.kt", l = {46, 46}, m = "saveItems")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public a0 h;
        public Collection i;
        public Iterator j;
        public Object k;
        public a0 l;
        public /* synthetic */ Object m;
        public int o;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.m = obj;
            this.o |= Integer.MIN_VALUE;
            return a0.this.saveItems(null, this);
        }
    }

    public a0(Context context) {
        super(i.class, context, "panel_download_history_cache", GsonHolder.getInstance());
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(i iVar) {
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "<this>");
        return iVar2.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveItem(com.amazon.aps.iva.wv.i r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.a0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.a0$a r0 = (com.amazon.aps.iva.wv.a0.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.a0$a r0 = new com.amazon.aps.iva.wv.a0$a
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
            goto L6a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.wv.i r6 = r0.i
            com.amazon.aps.iva.wv.a0 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L54
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.lang.String r7 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r6, r7)
            java.lang.String r7 = r6.b()
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r5.contains(r7, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6d
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r6 = super.saveItem(r6, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L6d:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.a0.saveItem(com.amazon.aps.iva.wv.i, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:22:0x0084). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveItems(java.util.List<com.amazon.aps.iva.wv.i> r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.wv.a0.b
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.wv.a0$b r0 = (com.amazon.aps.iva.wv.a0.b) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.a0$b r0 = new com.amazon.aps.iva.wv.a0$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.m
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.o
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L43
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            com.amazon.aps.iva.ab.x.i0(r11)
            goto La6
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L33:
            com.amazon.aps.iva.wv.a0 r10 = r0.l
            java.lang.Object r2 = r0.k
            java.util.Iterator r5 = r0.j
            java.util.Collection r6 = r0.i
            java.util.Collection r6 = (java.util.Collection) r6
            com.amazon.aps.iva.wv.a0 r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L84
        L43:
            com.amazon.aps.iva.ab.x.i0(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
            r7 = r9
            r5 = r10
            r6 = r11
            r10 = r7
        L55:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L90
            java.lang.Object r2 = r5.next()
            r11 = r2
            com.amazon.aps.iva.wv.i r11 = (com.amazon.aps.iva.wv.i) r11
            r7.getClass()
            java.lang.String r8 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r11, r8)
            java.lang.String r11 = r11.b()
            r0.h = r7
            r8 = r6
            java.util.Collection r8 = (java.util.Collection) r8
            r0.i = r8
            r0.j = r5
            r0.k = r2
            r0.l = r10
            r0.o = r3
            java.lang.Object r11 = r7.contains(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L55
            r6.add(r2)
            goto L55
        L90:
            java.util.List r6 = (java.util.List) r6
            r11 = 0
            r0.h = r11
            r0.i = r11
            r0.j = r11
            r0.k = r11
            r0.l = r11
            r0.o = r4
            java.lang.Object r10 = super.saveItems(r6, r0)
            if (r10 != r1) goto La6
            return r1
        La6:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.a0.saveItems(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
