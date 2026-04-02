package com.amazon.aps.iva.qi;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import java.text.DateFormat;
/* compiled from: WatchMusicSummaryLayout.kt */
/* loaded from: classes.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<e> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar) {
        super(0);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final e invoke() {
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        j.e(dateInstance, "getDateInstance(DateFormat.MEDIUM)");
        c cVar = this.h;
        j.f(cVar, "view");
        return new f(cVar, dateInstance);
    }
}
