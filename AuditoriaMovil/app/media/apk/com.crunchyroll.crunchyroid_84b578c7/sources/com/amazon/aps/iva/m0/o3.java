package com.amazon.aps.iva.m0;

import com.google.android.gms.cast.MediaTrack;
/* compiled from: TextFieldImpl.kt */
/* loaded from: classes.dex */
public final class o3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.a2.c0, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(String str, boolean z) {
        super(1);
        this.h = z;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.a2.c0 c0Var) {
        com.amazon.aps.iva.a2.c0 c0Var2 = c0Var;
        com.amazon.aps.iva.yb0.j.f(c0Var2, "$this$semantics");
        if (this.h) {
            com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.a2.y.a;
            String str = this.i;
            com.amazon.aps.iva.yb0.j.f(str, MediaTrack.ROLE_DESCRIPTION);
            c0Var2.b(com.amazon.aps.iva.a2.v.B, str);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
