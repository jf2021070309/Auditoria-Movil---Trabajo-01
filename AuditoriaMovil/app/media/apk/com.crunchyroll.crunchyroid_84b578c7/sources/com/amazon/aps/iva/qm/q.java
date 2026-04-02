package com.amazon.aps.iva.qm;
/* compiled from: ProfileActivationPresenter.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ s h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar) {
        super(1);
        this.h = sVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(String str) {
        z view;
        z view2;
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "username");
        s sVar = this.h;
        view = sVar.getView();
        view.t3();
        view2 = sVar.getView();
        view2.setUsername(str2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
