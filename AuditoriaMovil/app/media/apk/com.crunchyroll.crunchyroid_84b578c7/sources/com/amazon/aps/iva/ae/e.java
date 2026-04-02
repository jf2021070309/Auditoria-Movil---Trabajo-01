package com.amazon.aps.iva.ae;

import com.amazon.aps.iva.ae.i;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: LogInScreenController.kt */
/* loaded from: classes.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<h, h> {
    public final /* synthetic */ i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar) {
        super(1);
        this.h = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final h invoke(h hVar) {
        j.f(hVar, "$this$set");
        String str = ((i.d) this.h).a;
        j.f(str, "userInput");
        return new h(str);
    }
}
