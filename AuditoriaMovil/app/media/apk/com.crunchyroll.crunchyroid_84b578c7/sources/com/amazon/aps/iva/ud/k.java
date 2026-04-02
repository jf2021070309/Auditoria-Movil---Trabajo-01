package com.amazon.aps.iva.ud;

import android.content.Context;
import com.amazon.aps.iva.o0.e0;
import com.crunchyroll.crunchyroid.R;
/* compiled from: ErrorLayout.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.q<com.amazon.aps.iva.y4.d, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(3);
        this.h = str;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.y4.d dVar, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        num.intValue();
        com.amazon.aps.iva.yb0.j.f(dVar, "$this$Column");
        e0.b bVar = com.amazon.aps.iva.o0.e0.a;
        String string = ((Context) iVar2.i(com.amazon.aps.iva.p4.h.b)).getString(R.string.widget_continue_watching_error_message);
        com.amazon.aps.iva.p4.n q = com.amazon.aps.iva.ff0.b.q(com.amazon.aps.iva.e.w.M(4));
        com.amazon.aps.iva.a5.e eVar = new com.amazon.aps.iva.a5.e(new com.amazon.aps.iva.b5.e(R.color.color_white), new com.amazon.aps.iva.o2.m(com.amazon.aps.iva.e.z.z(14)), null, new com.amazon.aps.iva.a5.c(3), 44);
        com.amazon.aps.iva.yb0.j.e(string, "getString(\n             …age\n                    )");
        com.amazon.aps.iva.a5.d.a(string, q, eVar, 2, iVar2, 3072, 0);
        com.amazon.aps.iva.a5.d.a(this.h, com.amazon.aps.iva.ff0.b.q(com.amazon.aps.iva.e.w.M(8)), new com.amazon.aps.iva.a5.e(new com.amazon.aps.iva.b5.e(R.color.primary), new com.amazon.aps.iva.o2.m(com.amazon.aps.iva.e.z.z(14)), new com.amazon.aps.iva.a5.b(), new com.amazon.aps.iva.a5.c(3), 40), 1, iVar2, 3072, 0);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
