package com.amazon.aps.iva.nl;
/* compiled from: AudioSettingsPresenter.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.wy.b<o> implements l {
    public final q b;

    public m(q qVar, e eVar) {
        super(eVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = qVar;
    }

    @Override // com.amazon.aps.iva.nl.l
    public final void d0(a aVar) {
        String str;
        com.amazon.aps.iva.yb0.j.f(aVar, "option");
        q qVar = this.b;
        a d = qVar.O5().d();
        if (d != null) {
            str = d.a;
        } else {
            str = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(aVar.a, str)) {
            qVar.m2(aVar);
        }
        getView().closeScreen();
    }
}
