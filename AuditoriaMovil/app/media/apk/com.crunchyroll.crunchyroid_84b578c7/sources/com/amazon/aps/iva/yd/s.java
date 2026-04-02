package com.amazon.aps.iva.yd;
/* compiled from: EmailMandatoryRouter.kt */
/* loaded from: classes.dex */
public final class s implements com.amazon.aps.iva.h.b<Integer> {
    public final /* synthetic */ v a;

    public s(v vVar) {
        this.a = vVar;
    }

    @Override // com.amazon.aps.iva.h.b
    public final void a(Integer num) {
        int intValue = num.intValue();
        v vVar = this.a;
        if (intValue == -1) {
            vVar.b.invoke();
        } else {
            vVar.c.invoke();
        }
    }
}
