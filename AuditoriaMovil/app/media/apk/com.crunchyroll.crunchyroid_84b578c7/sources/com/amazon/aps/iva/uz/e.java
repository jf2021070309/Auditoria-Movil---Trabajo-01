package com.amazon.aps.iva.uz;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.ads.AdRequest;
/* compiled from: BrowseAllAdapter.kt */
/* loaded from: classes2.dex */
public final class e extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ c i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, c cVar, h hVar) {
        super(2);
        this.h = hVar;
        this.i = cVar;
        this.j = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            h hVar = this.h;
            Panel panel = ((h.c.C0774c) hVar).c;
            int i = this.j;
            c cVar = this.i;
            com.amazon.aps.iva.wz.a.a(panel, new d(i, cVar, hVar), cVar.c, null, null, iVar2, Panel.$stable | AdRequest.MAX_CONTENT_URL_LENGTH, 24);
        }
        return q.a;
    }
}
