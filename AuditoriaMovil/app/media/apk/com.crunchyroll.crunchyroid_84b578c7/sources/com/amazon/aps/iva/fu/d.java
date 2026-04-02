package com.amazon.aps.iva.fu;

import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.du.f;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
/* compiled from: CommentViewHolder.kt */
/* loaded from: classes2.dex */
public final class d extends a {
    public final com.amazon.aps.iva.du.e b;

    public d(com.amazon.aps.iva.du.e eVar) {
        super(eVar);
        this.b = eVar;
    }

    @Override // com.amazon.aps.iva.fu.a
    public final void b1(x xVar, EventDispatcher<f> eventDispatcher) {
        j.f(eventDispatcher, "eventDispatcher");
        com.amazon.aps.iva.du.e eVar = this.b;
        eVar.getClass();
        com.amazon.aps.iva.du.j jVar = eVar.c;
        jVar.getClass();
        jVar.c = xVar;
        jVar.d = eventDispatcher;
        jVar.u6(xVar);
        jVar.getView().setCommentBackground(xVar.p);
        jVar.getView().kf(xVar.d);
        jVar.getView().T4(xVar.e);
        jVar.getView().gg(jVar.b.a(xVar.j));
        jVar.getView().p8(xVar.f);
        jVar.c = xVar;
        jVar.getView().c7(xVar.s);
        jVar.c = xVar;
        jVar.getView().J1(xVar.k);
        jVar.r6(xVar, false);
        jVar.s6(xVar);
        com.amazon.aps.iva.pu.e eVar2 = eVar.d;
        eVar2.l.setOnClickListener(new s(eVar, 10));
        eVar2.h.setOnClickListener(new com.amazon.aps.iva.c8.e(eVar, 9));
        eVar2.i.setOnClickListener(new com.amazon.aps.iva.c8.f(eVar, 8));
        e.a(this, eVar.getBinding());
    }
}
