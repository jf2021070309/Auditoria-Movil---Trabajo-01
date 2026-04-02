package com.amazon.aps.iva.s70;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: SearchToolbarPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.l<String, q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(1);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(String str) {
        String str2 = str;
        j.f(str2, "newSearchText");
        d dVar = this.h;
        if (!j.a(str2, dVar.b)) {
            dVar.b = str2;
            dVar.d.invoke(str2);
        }
        return q.a;
    }
}
