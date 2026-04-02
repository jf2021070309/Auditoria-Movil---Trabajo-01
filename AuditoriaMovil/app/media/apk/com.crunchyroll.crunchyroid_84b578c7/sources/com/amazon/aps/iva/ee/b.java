package com.amazon.aps.iva.ee;
/* compiled from: OtpFlowRouter.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ e a;

    public b(e eVar) {
        this.a = eVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        e eVar = this.a;
        if (intValue == -1) {
            eVar.b.invoke();
        } else {
            eVar.c.invoke();
        }
    }
}
