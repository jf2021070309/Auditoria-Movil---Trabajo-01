package com.amazon.aps.iva.s60;

import com.amazon.aps.iva.o60.f;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
/* compiled from: TranslationsDownloader.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.s60.a {
    public final c a;
    public final f b;

    /* compiled from: TranslationsDownloader.kt */
    @e(c = "com.ellation.localization.remote.TranslationsDownloaderImpl", f = "TranslationsDownloader.kt", l = {24}, m = "download")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public /* synthetic */ Object i;
        public int k;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(c cVar, f fVar) {
        this.a = cVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.s60.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Locale r5, com.amazon.aps.iva.ob0.d<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.s60.b.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.s60.b$a r0 = (com.amazon.aps.iva.s60.b.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.s60.b$a r0 = new com.amazon.aps.iva.s60.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.s60.b r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r5 = r5.toLanguageTag()
            java.lang.String r6 = "locale.toLanguageTag()"
            com.amazon.aps.iva.yb0.j.e(r5, r6)
            r0.h = r4
            r0.k = r3
            com.amazon.aps.iva.s60.c r6 = r4.a
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            okhttp3.ResponseBody r6 = (okhttp3.ResponseBody) r6
            com.amazon.aps.iva.o60.f r5 = r5.b
            java.io.Reader r6 = r6.charStream()
            java.lang.String r0 = "response.charStream()"
            com.amazon.aps.iva.yb0.j.e(r6, r0)
            java.util.LinkedHashMap r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s60.b.a(java.util.Locale, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
