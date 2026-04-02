package com.amazon.aps.iva.s40;
/* compiled from: SignUpFlowRouter.kt */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ h a;

    public d(h hVar) {
        this.a = hVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        h hVar = this.a;
        if (intValue != 20) {
            if (intValue != 40) {
                hVar.d.invoke();
                return;
            } else {
                hVar.b.invoke();
                return;
            }
        }
        hVar.c.invoke();
    }
}
