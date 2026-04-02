package com.amazon.aps.iva.kz;

import com.amazon.aps.iva.ot.a;
/* compiled from: PlayableAssetCardPresenter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.b<j> implements g {
    public i b;

    public h(f fVar) {
        super(fVar, new com.amazon.aps.iva.wy.j[0]);
    }

    @Override // com.amazon.aps.iva.kz.g
    public final void H3(i iVar) {
        boolean z;
        boolean z2;
        i iVar2;
        boolean z3;
        com.amazon.aps.iva.yb0.j.f(iVar, "asset");
        this.b = iVar;
        j view = getView();
        i iVar3 = this.b;
        if (iVar3 != null) {
            view.q1(iVar3.b);
            i iVar4 = this.b;
            if (iVar4 != null) {
                boolean z4 = true;
                if (iVar4.c.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i iVar5 = this.b;
                    if (iVar5 != null) {
                        if (iVar5.e.length() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            j view2 = getView();
                            i iVar6 = this.b;
                            if (iVar6 != null) {
                                view2.D1(iVar6.e);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("asset");
                                throw null;
                            }
                        } else {
                            getView().p();
                        }
                    } else {
                        com.amazon.aps.iva.yb0.j.m("asset");
                        throw null;
                    }
                } else {
                    i iVar7 = this.b;
                    if (iVar7 != null) {
                        if (iVar7.e.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            j view3 = getView();
                            i iVar8 = this.b;
                            if (iVar8 != null) {
                                view3.N0(iVar8.c);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("asset");
                                throw null;
                            }
                        } else {
                            j view4 = getView();
                            if (this.b != null) {
                                view4.N0(iVar2.e + ". " + iVar2.c);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("asset");
                                throw null;
                            }
                        }
                    } else {
                        com.amazon.aps.iva.yb0.j.m("asset");
                        throw null;
                    }
                }
                i iVar9 = this.b;
                if (iVar9 != null) {
                    com.amazon.aps.iva.ot.a aVar = iVar9.l;
                    if (!(aVar instanceof a.d)) {
                        z4 = com.amazon.aps.iva.yb0.j.a(aVar, a.C0584a.d);
                    }
                    if (z4) {
                        j view5 = getView();
                        i iVar10 = this.b;
                        if (iVar10 != null) {
                            view5.setWatchProgress(iVar10.j);
                            return;
                        } else {
                            com.amazon.aps.iva.yb0.j.m("asset");
                            throw null;
                        }
                    }
                    getView().setWatchProgress(0);
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("asset");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("asset");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("asset");
        throw null;
    }
}
