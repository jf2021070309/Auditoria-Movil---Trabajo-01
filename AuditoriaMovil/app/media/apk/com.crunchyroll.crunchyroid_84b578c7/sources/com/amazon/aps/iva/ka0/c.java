package com.amazon.aps.iva.ka0;

import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ka0.t;
import com.amazon.aps.iva.ka0.y;
import com.amazon.aps.iva.la0.d;
import java.util.regex.Pattern;
/* compiled from: ExoPlayerBinding.kt */
/* loaded from: classes4.dex */
public final class c implements t.a<com.amazon.aps.iva.a6.m> {
    public final com.amazon.aps.iva.ma0.d a = new com.amazon.aps.iva.ma0.d();
    public final com.amazon.aps.iva.ma0.a b = new com.amazon.aps.iva.ma0.a();
    public h c;

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void a(com.amazon.aps.iva.a6.m mVar, y yVar) {
        com.amazon.aps.iva.a6.m mVar2 = mVar;
        com.amazon.aps.iva.yb0.j.f(mVar2, "player");
        com.amazon.aps.iva.yb0.j.f(yVar, "collector");
        com.amazon.aps.iva.ia0.b.a("PlayerUtils", "catchUpPlayState: Called. pwr is " + mVar2.k0());
        if (mVar2.k0()) {
            yVar.d();
        }
        if (mVar2.h() != 1) {
            k0.h(mVar2.h(), yVar, mVar2.k0());
        }
        Pattern compile = Pattern.compile("^x-litix-.*", 2);
        com.amazon.aps.iva.yb0.j.e(compile, "compile(\"^x-litix-.*\", Pattern.CASE_INSENSITIVE)");
        h hVar = new h(mVar2, new com.amazon.aps.iva.la0.b(mVar2, yVar, f1.K(new d.a("x-cdn"), new d.a("content-type"), new d.a("x-request-id"), new d.b(compile))), yVar);
        mVar2.b0(hVar);
        this.c = hVar;
        this.b.a(mVar2, yVar);
        this.a.a(mVar2, yVar);
    }

    @Override // com.amazon.aps.iva.ka0.t.a
    public final void b(com.amazon.aps.iva.a6.m mVar, y yVar) {
        com.amazon.aps.iva.a6.m mVar2 = mVar;
        com.amazon.aps.iva.yb0.j.f(yVar, "collector");
        h hVar = this.c;
        if (hVar != null) {
            mVar2.D0(hVar);
        }
        y.a<?> value = yVar.r.getValue(yVar, y.y[0]);
        if (value != null) {
            value.a("player unbound");
        }
        this.c = null;
        this.a.b(mVar2, yVar);
        this.b.b(mVar2, yVar);
    }
}
