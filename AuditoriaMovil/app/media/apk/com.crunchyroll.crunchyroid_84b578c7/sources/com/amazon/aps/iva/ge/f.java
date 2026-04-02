package com.amazon.aps.iva.ge;

import com.amazon.aps.iva.yb0.l;
/* compiled from: SignUpScreenController.kt */
/* loaded from: classes.dex */
public final class f extends l implements com.amazon.aps.iva.xb0.l<i, i> {
    public static final f h = new f();

    public f() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final i invoke(i iVar) {
        i iVar2 = iVar;
        com.amazon.aps.iva.yb0.j.f(iVar2, "$this$set");
        String str = iVar2.a;
        com.amazon.aps.iva.yb0.j.f(str, "userInput");
        return new i(str, !iVar2.b);
    }
}
