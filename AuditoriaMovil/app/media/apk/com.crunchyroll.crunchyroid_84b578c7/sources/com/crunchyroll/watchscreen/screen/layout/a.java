package com.crunchyroll.watchscreen.screen.layout;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xa0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchScreenLayout.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.l<e, q> {
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z) {
        super(1);
        this.h = z;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(e eVar) {
        e eVar2 = eVar;
        j.f(eVar2, "$this$type");
        e.a(eVar2, !this.h, false, 125);
        return q.a;
    }
}
