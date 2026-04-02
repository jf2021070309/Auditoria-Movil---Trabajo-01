package com.amazon.aps.iva.oa0;

import com.amazon.aps.iva.oa0.r;
import com.amazon.aps.iva.oa0.s;
import java.util.Map;
/* compiled from: ConfigManager.java */
/* loaded from: classes4.dex */
public final class q implements s.a {
    public final /* synthetic */ r a;

    public q(r rVar) {
        this.a = rVar;
    }

    @Override // com.amazon.aps.iva.oa0.s.a
    public final void a(h0 h0Var) {
        r rVar = this.a;
        rVar.f = true;
        rVar.b.b(h0Var);
        if (h0Var.equals(rVar.a)) {
            rVar.getClass();
        } else {
            rVar.getClass();
        }
        rVar.a = h0Var;
        for (Map.Entry entry : rVar.d.entrySet()) {
            ((r.b) entry.getValue()).a();
        }
    }

    @Override // com.amazon.aps.iva.oa0.s.a
    public final void onError() {
        r rVar = this.a;
        rVar.e = false;
        for (Map.Entry entry : rVar.d.entrySet()) {
            ((r.b) entry.getValue()).b();
        }
    }
}
