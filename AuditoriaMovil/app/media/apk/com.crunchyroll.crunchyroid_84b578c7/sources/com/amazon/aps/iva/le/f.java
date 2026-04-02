package com.amazon.aps.iva.le;

import com.amazon.aps.iva.le.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: VerifyNumberScreenController.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<i, i> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(1);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final i invoke(i iVar) {
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "$this$set");
        String str = ((j.d) this.h).a;
        com.amazon.aps.iva.yb0.j.f(str, "phoneNumber");
        return new i(str, iVar2.b, iVar2.c);
    }
}
