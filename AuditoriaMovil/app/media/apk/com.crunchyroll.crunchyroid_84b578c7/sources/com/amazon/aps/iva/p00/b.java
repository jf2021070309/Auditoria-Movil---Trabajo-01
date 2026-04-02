package com.amazon.aps.iva.p00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VideoDownloadModuleImpl.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<String, com.amazon.aps.iva.hg.g, q> {
    public final /* synthetic */ p<com.amazon.aps.iva.hg.g, String, q> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar) {
        super(2);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(String str, com.amazon.aps.iva.hg.g gVar) {
        String str2 = str;
        com.amazon.aps.iva.hg.g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(str2, "newAudioLanguage");
        com.amazon.aps.iva.yb0.j.f(gVar2, "input");
        this.h.invoke(gVar2, str2);
        return q.a;
    }
}
