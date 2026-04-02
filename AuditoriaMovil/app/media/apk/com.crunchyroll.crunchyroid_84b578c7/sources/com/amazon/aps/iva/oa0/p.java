package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.r;
import com.amazon.aps.iva.oa0.s;
/* compiled from: ConfigManager.java */
/* loaded from: classes4.dex */
public final class p implements s.a {
    public final /* synthetic */ s a;
    public final /* synthetic */ s b;
    public final /* synthetic */ r.a c;

    public p(v vVar, u uVar, x0 x0Var) {
        this.a = vVar;
        this.b = uVar;
        this.c = x0Var;
    }

    @Override // com.amazon.aps.iva.oa0.s.a
    public final void a(h0 h0Var) {
        r.a(this.a, this.b, h0Var, this.c);
    }

    @Override // com.amazon.aps.iva.oa0.s.a
    public final void onError() {
        r.a(this.a, this.b, null, this.c);
    }
}
