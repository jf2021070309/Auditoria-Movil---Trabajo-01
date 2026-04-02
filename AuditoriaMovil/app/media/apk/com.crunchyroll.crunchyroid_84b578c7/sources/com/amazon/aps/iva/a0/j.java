package com.amazon.aps.iva.a0;

import com.google.android.gms.cast.MediaError;
/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.h1.c, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.f1.s h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ com.amazon.aps.iva.h1.f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.amazon.aps.iva.f1.s sVar, long j, long j2, com.amazon.aps.iva.h1.f fVar) {
        super(1);
        this.h = sVar;
        this.i = j;
        this.j = j2;
        this.k = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.h1.c cVar2 = cVar;
        com.amazon.aps.iva.yb0.j.f(cVar2, "$this$onDrawWithContent");
        cVar2.f1();
        com.amazon.aps.iva.h1.e.t0(cVar2, this.h, this.i, this.j, 0.0f, this.k, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
