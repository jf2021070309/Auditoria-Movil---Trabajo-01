package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class d0 extends com.amazon.aps.iva.xe.a<com.amazon.aps.iva.ig.a> implements b0 {
    public d0(Context context) {
        super(com.amazon.aps.iva.ig.a.class, context, "playheads_cache", GsonHolder.getInstance());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.wv.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.ArrayList r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.wv.c0
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.wv.c0 r0 = (com.amazon.aps.iva.wv.c0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.c0 r0 = new com.amazon.aps.iva.wv.c0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.l
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.k
            java.util.Iterator r2 = r0.j
            java.util.Map r4 = r0.i
            java.util.Map r4 = (java.util.Map) r4
            com.amazon.aps.iva.wv.d0 r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L68
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
            r5 = r6
            r2 = r7
            r4 = r8
        L48:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L70
            java.lang.Object r7 = r2.next()
            java.lang.String r7 = (java.lang.String) r7
            r0.h = r5
            r8 = r4
            java.util.Map r8 = (java.util.Map) r8
            r0.i = r8
            r0.j = r2
            r0.k = r7
            r0.n = r3
            java.lang.Object r8 = r5.readItem(r7, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            com.amazon.aps.iva.ig.a r8 = (com.amazon.aps.iva.ig.a) r8
            if (r8 == 0) goto L48
            r4.put(r7, r8)
            goto L48
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.d0.g(java.util.ArrayList, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(com.amazon.aps.iva.ig.a aVar) {
        com.amazon.aps.iva.ig.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "<this>");
        return aVar2.a();
    }
}
