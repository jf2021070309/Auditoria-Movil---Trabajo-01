package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.model.Images;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: WithImages.kt */
/* loaded from: classes2.dex */
public final class p0 {

    /* compiled from: WithImages.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.WithImagesKt", f = "WithImages.kt", l = {27, 28, 29, 30}, m = "prepareImagesForOffline")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public Images h;
        public Object i;
        public List j;
        public List k;
        public /* synthetic */ Object l;
        public int m;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.m |= Integer.MIN_VALUE;
            return p0.a(null, null, this);
        }
    }

    /* compiled from: WithImages.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.WithImagesKt", f = "WithImages.kt", l = {18}, m = "prepareImagesForOffline$toLocalImages")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public Context h;
        public List i;
        public Collection j;
        public Iterator k;
        public /* synthetic */ Object l;
        public int m;

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.m |= Integer.MIN_VALUE;
            return p0.c(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.ellation.crunchyroll.model.Images r9, android.content.Context r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.p0.a(com.ellation.crunchyroll.model.Images, android.content.Context, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(com.ellation.crunchyroll.api.etp.model.Image r8, android.content.Context r9, com.amazon.aps.iva.ob0.d r10) {
        /*
            boolean r0 = r10 instanceof com.amazon.aps.iva.wv.q0
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.wv.q0 r0 = (com.amazon.aps.iva.wv.q0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.q0 r0 = new com.amazon.aps.iva.wv.q0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.ellation.crunchyroll.api.etp.model.Image r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r10)
        L28:
            r2 = r8
            goto L69
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            com.amazon.aps.iva.ab.x.i0(r10)
            java.lang.String r10 = "context"
            com.amazon.aps.iva.yb0.j.f(r9, r10)
            com.amazon.aps.iva.wv.p r10 = com.amazon.aps.iva.wv.o.a.a
            if (r10 != 0) goto L4e
            com.amazon.aps.iva.wv.p r10 = new com.amazon.aps.iva.wv.p
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r2 = "context.applicationContext"
            com.amazon.aps.iva.yb0.j.e(r9, r2)
            r10.<init>(r9)
            com.amazon.aps.iva.wv.o.a.a = r10
        L4e:
            java.lang.String r9 = r8.getUrl()
            if (r9 == 0) goto L59
            int r9 = r9.hashCode()
            goto L5a
        L59:
            r9 = 0
        L5a:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.h = r8
            r0.j = r3
            java.lang.Object r10 = r10.readItem(r9, r0)
            if (r10 != r1) goto L28
            return r1
        L69:
            com.amazon.aps.iva.xv.c r10 = (com.amazon.aps.iva.xv.c) r10
            if (r10 == 0) goto L7a
            java.lang.String r3 = r10.a()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            com.ellation.crunchyroll.api.etp.model.Image r8 = com.ellation.crunchyroll.api.etp.model.Image.copy$default(r2, r3, r4, r5, r6, r7)
            goto L7b
        L7a:
            r8 = 0
        L7b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.p0.b(com.ellation.crunchyroll.api.etp.model.Image, android.content.Context, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:21:0x0077). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.util.List<com.ellation.crunchyroll.api.etp.model.Image> r7, android.content.Context r8, com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.etp.model.Image>> r9) {
        /*
            boolean r0 = r9 instanceof com.amazon.aps.iva.wv.p0.b
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.wv.p0$b r0 = (com.amazon.aps.iva.wv.p0.b) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.p0$b r0 = new com.amazon.aps.iva.wv.p0$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.util.Iterator r7 = r0.k
            java.util.Collection r8 = r0.j
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.List r2 = r0.i
            java.util.List r2 = (java.util.List) r2
            android.content.Context r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L77
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            com.amazon.aps.iva.ab.x.i0(r9)
            r9 = r7
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L51:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r7.next()
            com.ellation.crunchyroll.api.etp.model.Image r4 = (com.ellation.crunchyroll.api.etp.model.Image) r4
            r0.h = r9
            r5 = r8
            java.util.List r5 = (java.util.List) r5
            r0.i = r5
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5
            r0.j = r5
            r0.k = r7
            r0.m = r3
            java.io.Serializable r4 = b(r4, r9, r0)
            if (r4 != r1) goto L74
            return r1
        L74:
            r6 = r4
            r4 = r9
            r9 = r6
        L77:
            com.ellation.crunchyroll.api.etp.model.Image r9 = (com.ellation.crunchyroll.api.etp.model.Image) r9
            if (r9 == 0) goto L7e
            r2.add(r9)
        L7e:
            r9 = r4
            goto L51
        L80:
            java.util.List r2 = (java.util.List) r2
            r7 = r2
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r3
            if (r7 == 0) goto L8d
            r8 = r2
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.p0.c(java.util.List, android.content.Context, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
