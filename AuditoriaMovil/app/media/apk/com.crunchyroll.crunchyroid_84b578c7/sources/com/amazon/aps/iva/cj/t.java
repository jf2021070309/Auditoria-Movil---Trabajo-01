package com.amazon.aps.iva.cj;

import com.amazon.aps.iva.ee0.f1;
import com.crunchyroll.player.exoplayercomponent.components.ExoplayerComponent;
/* compiled from: PlayerImpl.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ExoplayerComponent.a, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ s h;
    public final /* synthetic */ com.amazon.aps.iva.gj.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, com.amazon.aps.iva.gj.a aVar) {
        super(1);
        this.h = sVar;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(ExoplayerComponent.a aVar) {
        ExoplayerComponent.a aVar2 = aVar;
        com.amazon.aps.iva.yb0.j.f(aVar2, "$this$register");
        s sVar = this.h;
        a a = sVar.d.a();
        String str = a.a;
        String str2 = a.c;
        m mVar = sVar.b;
        String h = mVar.h();
        com.amazon.aps.iva.xb0.a<String> aVar3 = sVar.c;
        aVar2.a = new com.amazon.aps.iva.kk.a(true, true, str, str2, h, aVar3.invoke(), sVar.h, 134215728);
        aVar2.b = true;
        aVar2.c = new com.amazon.aps.iva.ck.g(com.amazon.aps.iva.aq.k.x(new com.amazon.aps.iva.kb0.j("/v1/manifest/", f1.J(403))));
        aVar2.d = true;
        if (this.i.b) {
            aVar2.e = new com.amazon.aps.iva.mk.a(mVar.c(), aVar3.invoke(), sVar.g.a(), new com.amazon.aps.iva.mk.b(com.amazon.aps.iva.u50.b.a));
        }
        k kVar = n.d;
        if (kVar != null) {
            aVar2.k = kVar.h().isEnabled();
            aVar2.g = true;
            aVar2.h = mVar.e();
            aVar2.i = mVar.g();
            aVar2.j = mVar.d();
            com.amazon.aps.iva.mf0.a.a.a(com.amazon.aps.iva.q.c0.a("Setting subtitlesRenderingFps to: ", aVar2.h), new Object[0]);
            return com.amazon.aps.iva.kb0.q.a;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
