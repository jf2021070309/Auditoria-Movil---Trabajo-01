package com.amazon.aps.iva.d10;
/* compiled from: DownloadsModule.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ com.amazon.aps.iva.i10.a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.amazon.aps.iva.i10.a aVar) {
        super(0);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.h.isResumed());
    }
}
