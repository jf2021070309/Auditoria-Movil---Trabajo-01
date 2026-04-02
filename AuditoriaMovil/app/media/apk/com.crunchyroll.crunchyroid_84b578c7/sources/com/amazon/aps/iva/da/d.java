package com.amazon.aps.iva.da;
/* compiled from: LottieAnimatable.kt */
/* loaded from: classes.dex */
public final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Long, Boolean> {
    public final /* synthetic */ f h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, int i) {
        super(1);
        this.h = fVar;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Long l) {
        return Boolean.valueOf(f.f(this.h, this.i, l.longValue()));
    }
}
