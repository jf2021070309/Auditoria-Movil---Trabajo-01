package com.amazon.aps.iva.b50;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: WatchlistInteractor.kt */
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.wy.a implements n {
    public final EtpContentService b;
    public int c;
    public int d;
    public final ArrayList e = new ArrayList();

    public s(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: IOException -> 0x00fe, TryCatch #3 {IOException -> 0x00fe, blocks: (B:37:0x0093, B:39:0x0097, B:40:0x009d, B:42:0x00a4, B:43:0x00ad, B:45:0x00b3, B:47:0x00bb, B:48:0x00bf, B:50:0x00c6, B:52:0x00cc, B:53:0x00d7, B:55:0x00dd, B:57:0x00e5, B:59:0x00f5, B:61:0x00fa, B:62:0x00fd, B:66:0x0102, B:65:0x0100, B:70:0x010b, B:71:0x0115), top: B:83:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3 A[Catch: IOException -> 0x00fe, TryCatch #3 {IOException -> 0x00fe, blocks: (B:37:0x0093, B:39:0x0097, B:40:0x009d, B:42:0x00a4, B:43:0x00ad, B:45:0x00b3, B:47:0x00bb, B:48:0x00bf, B:50:0x00c6, B:52:0x00cc, B:53:0x00d7, B:55:0x00dd, B:57:0x00e5, B:59:0x00f5, B:61:0x00fa, B:62:0x00fd, B:66:0x0102, B:65:0x0100, B:70:0x010b, B:71:0x0115), top: B:83:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6 A[Catch: IOException -> 0x00fe, TryCatch #3 {IOException -> 0x00fe, blocks: (B:37:0x0093, B:39:0x0097, B:40:0x009d, B:42:0x00a4, B:43:0x00ad, B:45:0x00b3, B:47:0x00bb, B:48:0x00bf, B:50:0x00c6, B:52:0x00cc, B:53:0x00d7, B:55:0x00dd, B:57:0x00e5, B:59:0x00f5, B:61:0x00fa, B:62:0x00fd, B:66:0x0102, B:65:0x0100, B:70:0x010b, B:71:0x0115), top: B:83:0x0021 }] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.amazon.aps.iva.lb0.z] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.amazon.aps.iva.b50.f0$a$a] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.amazon.aps.iva.b50.f0$a$b, com.amazon.aps.iva.xb0.l] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.amazon.aps.iva.xb0.l] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.amazon.aps.iva.xb0.l] */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.amazon.aps.iva.xb0.l] */
    @Override // com.amazon.aps.iva.b50.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable O0(java.util.Map r10, com.amazon.aps.iva.b50.f0.a.C0131a r11, com.amazon.aps.iva.b50.f0.a.b r12, com.amazon.aps.iva.ob0.d r13) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b50.s.O0(java.util.Map, com.amazon.aps.iva.b50.f0$a$a, com.amazon.aps.iva.b50.f0$a$b, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    @Override // com.amazon.aps.iva.b50.n
    public final void Q1(com.amazon.aps.iva.b60.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "item");
        com.amazon.aps.iva.lb0.t.h0(this.e, new r(kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // com.amazon.aps.iva.b50.n
    public final void Y(com.amazon.aps.iva.b60.k kVar) {
        com.amazon.aps.iva.b60.k kVar2;
        ?? r1;
        Iterator it = this.e.iterator();
        while (true) {
            kVar2 = null;
            if (it.hasNext()) {
                r1 = it.next();
                if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.b60.s) r1).getContentId(), kVar.getContentId())) {
                    break;
                }
            } else {
                r1 = 0;
                break;
            }
        }
        if (r1 instanceof com.amazon.aps.iva.b60.k) {
            kVar2 = r1;
        }
        if (kVar2 != null) {
            kVar2.d = kVar.d;
        }
    }

    @Override // com.amazon.aps.iva.b50.n
    public final void clear() {
        this.c = 0;
        this.d = 0;
        this.e.clear();
    }

    @Override // com.amazon.aps.iva.b50.n
    public final List<com.amazon.aps.iva.b60.s> x() {
        return this.e;
    }
}
