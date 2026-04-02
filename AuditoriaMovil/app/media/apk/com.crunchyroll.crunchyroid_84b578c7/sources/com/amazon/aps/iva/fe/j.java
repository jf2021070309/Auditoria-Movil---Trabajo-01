package com.amazon.aps.iva.fe;
/* compiled from: OtpPresenter.kt */
/* loaded from: classes.dex */
public final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ l h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar) {
        super(1);
        this.h = lVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
        int intValue = num.intValue();
        l lVar = this.h;
        if (intValue != 0) {
            l.q6(lVar).Jh(intValue);
        } else {
            l.q6(lVar).w4();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
