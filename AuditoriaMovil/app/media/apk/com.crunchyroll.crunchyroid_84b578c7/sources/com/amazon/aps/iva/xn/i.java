package com.amazon.aps.iva.xn;

import okhttp3.OkHttpClient;
/* compiled from: BifFileSource.kt */
/* loaded from: classes2.dex */
public final class i implements com.amazon.aps.iva.xn.a {
    public final OkHttpClient b;

    /* compiled from: BifFileSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.trickscrubbing.NetworkBifFileSource", f = "BifFileSource.kt", l = {31}, m = "loadBifFile")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return i.this.c(null, this);
        }
    }

    public i(OkHttpClient okHttpClient) {
        this.b = okHttpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // com.amazon.aps.iva.xn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super byte[]> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.xn.i.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.xn.i$a r0 = (com.amazon.aps.iva.xn.i.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.xn.i$a r0 = new com.amazon.aps.iva.xn.i$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            okhttp3.Request$Builder r6 = new okhttp3.Request$Builder
            r6.<init>()
            okhttp3.Request$Builder r5 = r6.url(r5)
            okhttp3.Request r5 = r5.build()
            okhttp3.OkHttpClient r6 = r4.b
            okhttp3.Call r5 = r6.newCall(r5)
            com.amazon.aps.iva.se0.u r5 = com.amazon.aps.iva.b30.j.f(r5)
            r0.j = r3
            java.lang.Object r6 = r5.K(r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            okhttp3.Response r6 = (okhttp3.Response) r6
            okhttp3.ResponseBody r5 = r6.body()
            if (r5 == 0) goto L65
            com.amazon.aps.iva.ef0.h r5 = r5.source()
            if (r5 == 0) goto L65
            byte[] r5 = r5.X()
            goto L66
        L65:
            r5 = 0
        L66:
            if (r5 == 0) goto L69
            return r5
        L69:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Required value was null."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.xn.i.c(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
