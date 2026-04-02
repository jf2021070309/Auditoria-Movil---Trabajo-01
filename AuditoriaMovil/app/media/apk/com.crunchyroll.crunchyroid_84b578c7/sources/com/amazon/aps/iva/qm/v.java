package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationPresenter.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar) {
        super(1);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(Throwable th) {
        boolean z;
        z view;
        z view2;
        z view3;
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "throwable");
        s sVar = this.h;
        e0 a = sVar.d.a(th2);
        String str = a.b;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            view3 = sVar.getView();
            view3.setUsername(a.b);
        }
        view = sVar.getView();
        view.b();
        view2 = sVar.getView();
        view2.e5(a.a);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
