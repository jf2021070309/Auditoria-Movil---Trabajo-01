package com.amazon.aps.iva.wv;

import android.content.Context;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.model.Series;
import com.google.android.gms.cast.MediaError;
/* compiled from: DownloadModelCache.kt */
/* loaded from: classes2.dex */
public final class j0 extends com.amazon.aps.iva.xe.a<Series> implements i0 {
    public final Context b;

    /* compiled from: DownloadModelCache.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.cache.SeriesCacheImpl", f = "DownloadModelCache.kt", l = {MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 111}, m = "readItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return j0.this.readItem(null, this);
        }
    }

    public j0(Context context) {
        super(Series.class, context, "series_cache", GsonHolder.getInstance());
        this.b = context;
    }

    @Override // com.amazon.aps.iva.xe.a
    public final String getInternalCacheableId(Series series) {
        Series series2 = series;
        com.amazon.aps.iva.yb0.j.f(series2, "<this>");
        return series2.getId();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[ORIG_RETURN, RETURN] */
    @Override // com.amazon.aps.iva.xe.a, com.amazon.aps.iva.xe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readItem(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.Series> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.wv.j0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.wv.j0$a r0 = (com.amazon.aps.iva.wv.j0.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.wv.j0$a r0 = new com.amazon.aps.iva.wv.j0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.h
            com.ellation.crunchyroll.model.Series r6 = (com.ellation.crunchyroll.model.Series) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L65
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.wv.j0 r6 = (com.amazon.aps.iva.wv.j0) r6
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3e:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            java.lang.Object r7 = super.readItem(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            com.ellation.crunchyroll.model.Series r7 = (com.ellation.crunchyroll.model.Series) r7
            if (r7 == 0) goto L64
            com.ellation.crunchyroll.model.Images r2 = r7.getImages()
            android.content.Context r6 = r6.b
            r0.h = r7
            r0.k = r3
            java.lang.Object r6 = com.amazon.aps.iva.wv.p0.a(r2, r6, r0)
            if (r6 != r1) goto L62
            return r1
        L62:
            r6 = r7
            goto L65
        L64:
            r6 = 0
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.wv.j0.readItem(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
