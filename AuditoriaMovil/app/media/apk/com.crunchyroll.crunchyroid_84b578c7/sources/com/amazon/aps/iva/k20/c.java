package com.amazon.aps.iva.k20;
/* compiled from: CancellationRescueFlowRouter.kt */
/* loaded from: classes2.dex */
public final class c implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ g a;

    public c(g gVar) {
        this.a = gVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        g gVar = this.a;
        if (intValue != 10) {
            if (intValue != 20) {
                if (intValue == 30) {
                    gVar.d.invoke();
                    return;
                }
                return;
            }
            gVar.c.invoke();
            return;
        }
        gVar.b.invoke();
    }
}
