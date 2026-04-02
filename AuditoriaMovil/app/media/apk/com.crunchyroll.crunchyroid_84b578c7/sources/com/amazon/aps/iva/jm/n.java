package com.amazon.aps.iva.jm;
/* compiled from: AvatarSelectionPresenter.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.kb0.q, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.kb0.q qVar) {
        com.amazon.aps.iva.yb0.j.f(qVar, "it");
        i iVar = this.h;
        i.q6(iVar).b();
        i.q6(iVar).closeScreen();
        return com.amazon.aps.iva.kb0.q.a;
    }
}
