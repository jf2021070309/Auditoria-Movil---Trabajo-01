package com.amazon.aps.iva.fa0;
/* loaded from: classes4.dex */
public final class r extends t {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.amazon.aps.iva.ga0.k kVar, int i) {
        super(kVar);
        this.i = i;
        if (i != 1) {
            return;
        }
        super(kVar);
        this.h = true;
    }

    @Override // com.amazon.aps.iva.da0.a, com.amazon.aps.iva.da0.e
    public final String getType() {
        switch (this.i) {
            case 0:
                return "pause";
            default:
                return "seeking";
        }
    }
}
