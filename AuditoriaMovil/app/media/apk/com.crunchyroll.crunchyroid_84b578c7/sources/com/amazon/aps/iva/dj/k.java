package com.amazon.aps.iva.dj;

import com.amazon.aps.iva.js.z;
/* compiled from: PlayerEventsAnalytics.kt */
/* loaded from: classes.dex */
public final class k implements j {
    public final boolean a;
    public final com.amazon.aps.iva.dj.a b;
    public final com.amazon.aps.iva.ds.a c;

    /* compiled from: PlayerEventsAnalytics.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.qj.d.values().length];
            try {
                iArr[com.amazon.aps.iva.qj.d.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.qj.d.LOCAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public k(com.amazon.aps.iva.dj.a aVar, com.amazon.aps.iva.ds.a aVar2, boolean z) {
        this.a = z;
        this.b = aVar;
        this.c = aVar2;
    }

    public static z b(com.amazon.aps.iva.qj.d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "<this>");
        int i = a.a[dVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return z.a.a;
            }
            throw new com.amazon.aps.iva.kb0.h();
        }
        return z.b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r2 == null) goto L22;
     */
    @Override // com.amazon.aps.iva.dj.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.amazon.aps.iva.pj.i r21) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.dj.k.a(com.amazon.aps.iva.pj.i):void");
    }
}
