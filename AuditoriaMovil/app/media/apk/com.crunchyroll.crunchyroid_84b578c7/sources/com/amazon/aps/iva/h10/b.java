package com.amazon.aps.iva.h10;

import com.amazon.aps.iva.h10.c;
import com.amazon.aps.iva.us.u;
import com.amazon.aps.iva.us.v;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.presentation.downloads.empty.DownloadsEmptyLayout;
/* compiled from: DownloadsEmptyLayoutPresenter.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.b<f> {
    public final com.amazon.aps.iva.k50.a b;
    public final com.amazon.aps.iva.xh.b c;
    public final u d;
    public final com.amazon.aps.iva.rh.a e;
    public c f;

    public b(com.amazon.aps.iva.k50.a aVar, com.amazon.aps.iva.xh.b bVar, v vVar, com.amazon.aps.iva.rh.a aVar2, DownloadsEmptyLayout downloadsEmptyLayout) {
        super(downloadsEmptyLayout, new j[0]);
        this.b = aVar;
        this.c = bVar;
        this.d = vVar;
        this.e = aVar2;
    }

    public final void q6(c cVar) {
        boolean a;
        this.f = cVar;
        getView().setImage(cVar.a);
        c cVar2 = this.f;
        if (cVar2 != null) {
            if (cVar2.d) {
                getView().L0();
            } else {
                getView().e2();
            }
            c cVar3 = this.f;
            if (cVar3 != null) {
                if (cVar3.e) {
                    getView().rh();
                } else {
                    getView().q4();
                }
                c cVar4 = this.f;
                if (cVar4 != null) {
                    c.C0316c c0316c = c.C0316c.f;
                    boolean a2 = com.amazon.aps.iva.yb0.j.a(cVar4, c0316c);
                    c.b bVar = c.b.f;
                    if (a2) {
                        a = true;
                    } else {
                        a = com.amazon.aps.iva.yb0.j.a(cVar4, bVar);
                    }
                    if (a) {
                        getView().p();
                        f view = getView();
                        c cVar5 = this.f;
                        if (cVar5 != null) {
                            view.setSubtitle(cVar5.c);
                        } else {
                            com.amazon.aps.iva.yb0.j.m("state");
                            throw null;
                        }
                    } else {
                        f view2 = getView();
                        c cVar6 = this.f;
                        if (cVar6 != null) {
                            Integer num = cVar6.b;
                            com.amazon.aps.iva.yb0.j.c(num);
                            view2.g6(num.intValue());
                        } else {
                            com.amazon.aps.iva.yb0.j.m("state");
                            throw null;
                        }
                    }
                    c cVar7 = this.f;
                    if (cVar7 != null) {
                        if (!com.amazon.aps.iva.yb0.j.a(cVar7, bVar)) {
                            c cVar8 = this.f;
                            if (cVar8 != null) {
                                if (!com.amazon.aps.iva.yb0.j.a(cVar8, c0316c)) {
                                    com.amazon.aps.iva.rh.a aVar = this.e;
                                    getView().lc(aVar.c(null, null), aVar.a());
                                    return;
                                }
                                return;
                            }
                            com.amazon.aps.iva.yb0.j.m("state");
                            throw null;
                        }
                        return;
                    }
                    com.amazon.aps.iva.yb0.j.m("state");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("state");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("state");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("state");
        throw null;
    }
}
