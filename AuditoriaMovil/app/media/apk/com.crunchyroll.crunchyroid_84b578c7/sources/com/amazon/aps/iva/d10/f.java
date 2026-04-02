package com.amazon.aps.iva.d10;

import com.amazon.aps.iva.d10.l;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.downloading.e0;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: AsyncDownloadPanelFetcher.kt */
/* loaded from: classes2.dex */
public final class f {
    public final InternalDownloadsManager a;
    public final com.amazon.aps.iva.xb0.p<Panel, List<? extends e0>, i> b;
    public final com.amazon.aps.iva.sv.c c;
    public final com.amazon.aps.iva.wu.a d;

    public f(InternalDownloadsManager internalDownloadsManager, l.a aVar, com.amazon.aps.iva.sv.d dVar, com.amazon.aps.iva.wu.a aVar2) {
        this.a = internalDownloadsManager;
        this.b = aVar;
        this.c = dVar;
        this.d = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c2 -> B:27:0x00c8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.amazon.aps.iva.d10.f r19, java.util.List r20, com.amazon.aps.iva.ob0.d r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d10.f.a(com.amazon.aps.iva.d10.f, java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.amazon.aps.iva.xb0.l] */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.amazon.aps.iva.xb0.l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, com.amazon.aps.iva.d10.l.c.a r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.d10.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.d10.a r0 = (com.amazon.aps.iva.d10.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.d10.a r0 = new com.amazon.aps.iva.d10.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.j
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.xb0.l r8 = (com.amazon.aps.iva.xb0.l) r8
            com.amazon.aps.iva.d10.f r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L77
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.j
            r8 = r7
            com.amazon.aps.iva.xb0.l r8 = (com.amazon.aps.iva.xb0.l) r8
            java.lang.Object r7 = r0.i
            java.lang.String r7 = (java.lang.String) r7
            com.amazon.aps.iva.d10.f r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L60
        L4b:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r6
            r0.i = r7
            r0.j = r8
            r0.m = r4
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r9 = r6.a
            java.lang.Object r9 = r9.t(r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r6
        L60:
            java.util.List r9 = (java.util.List) r9
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r4 = r2.a
            r0.h = r2
            r0.i = r8
            r0.j = r9
            r0.m = r3
            java.lang.Object r7 = r4.h(r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r2
            r5 = r9
            r9 = r7
            r7 = r5
        L77:
            com.ellation.crunchyroll.model.PlayableAsset r9 = (com.ellation.crunchyroll.model.PlayableAsset) r9
            if (r9 == 0) goto Lbf
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L81:
            boolean r1 = r7.hasNext()
            r2 = 0
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r7.next()
            r3 = r1
            com.ellation.crunchyroll.model.Panel r3 = (com.ellation.crunchyroll.model.Panel) r3
            java.lang.String r4 = r9.getParentId()
            java.lang.String r3 = r3.getId()
            boolean r3 = com.amazon.aps.iva.yb0.j.a(r4, r3)
            if (r3 == 0) goto L81
            goto L9f
        L9e:
            r1 = r2
        L9f:
            com.ellation.crunchyroll.model.Panel r1 = (com.ellation.crunchyroll.model.Panel) r1
            if (r1 == 0) goto Lbf
            com.ellation.crunchyroll.downloading.InternalDownloadsManager r7 = r0.a
            java.lang.String r3 = r9.getParentId()
            boolean r4 = r9 instanceof com.ellation.crunchyroll.model.Episode
            if (r4 == 0) goto Lb0
            com.ellation.crunchyroll.model.Episode r9 = (com.ellation.crunchyroll.model.Episode) r9
            goto Lb1
        Lb0:
            r9 = r2
        Lb1:
            if (r9 == 0) goto Lb7
            java.lang.String r2 = r9.getSeasonId()
        Lb7:
            com.amazon.aps.iva.d10.b r9 = new com.amazon.aps.iva.d10.b
            r9.<init>(r8, r0, r1)
            r7.m3(r3, r2, r9)
        Lbf:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d10.f.b(java.lang.String, com.amazon.aps.iva.d10.l$c$a, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
