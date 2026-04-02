package com.ellation.crunchyroll.commenting.entrypoint;

import androidx.lifecycle.p;
import com.amazon.aps.iva.nu.i;
import com.amazon.aps.iva.ut.b;
import com.amazon.aps.iva.ut.c;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
/* compiled from: CommentsEntryPoint.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<p, i> {
    public static final a h = new a();

    public a() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final i invoke(p pVar) {
        j.f(pVar, "it");
        b bVar = c.f;
        if (bVar != null) {
            TalkboxService talkboxService = bVar.getTalkboxService();
            j.f(talkboxService, "talkboxService");
            return new i(new com.amazon.aps.iva.qu.b(talkboxService));
        }
        j.m("dependencies");
        throw null;
    }
}
