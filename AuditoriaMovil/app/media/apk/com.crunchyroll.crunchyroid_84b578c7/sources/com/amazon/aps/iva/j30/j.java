package com.amazon.aps.iva.j30;
/* compiled from: UpsellV2FlowRouter.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ m a;

    public j(m mVar) {
        this.a = mVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        m mVar = this.a;
        if (intValue != -1) {
            if (intValue == 50) {
                mVar.b.invoke();
                return;
            }
            return;
        }
        mVar.c.invoke();
    }
}
