package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationFlowRouter.kt */
/* loaded from: classes2.dex */
public final class f implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ i a;

    public f(i iVar) {
        this.a = iVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        i iVar = this.a;
        if (intValue == 4013) {
            iVar.b.invoke();
        } else {
            iVar.c.invoke();
        }
        iVar.b = d.h;
        iVar.c = e.h;
    }
}
