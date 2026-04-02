package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class f extends l implements p<com.amazon.aps.iva.hg.g, String, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.hg.g gVar, String str) {
        com.amazon.aps.iva.hg.g gVar2 = gVar;
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(gVar2, "input");
        com.amazon.aps.iva.yb0.j.f(str2, "newAudioLocale");
        com.amazon.aps.iva.u00.i iVar = this.h.g;
        iVar.getClass();
        iVar.b.a1(gVar2, str2, new com.amazon.aps.iva.u00.h(iVar, gVar2, str2));
        return q.a;
    }
}
