package com.amazon.aps.iva.ul;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.player.settings.reportproblem.button.ReportProblemButton;
/* compiled from: ReportProblemButtonPresenter.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.b<f> implements d {
    public final c b;
    public boolean c;
    public String d;

    public e(ReportProblemButton reportProblemButton, c cVar) {
        super(reportProblemButton, new j[0]);
        this.b = cVar;
        this.d = "";
    }

    @Override // com.amazon.aps.iva.ul.d
    public final void R5() {
        this.b.E4(getView().getProblemDescription());
    }

    @Override // com.amazon.aps.iva.ul.d
    public final void a() {
        this.b.a();
    }

    @Override // com.amazon.aps.iva.ul.d
    public final void h3(boolean z) {
        this.c = z;
        if (z) {
            getView().S5();
            getView().C9();
            return;
        }
        getView().Kb();
        if (m.b0(this.d)) {
            getView().d3();
        }
    }

    @Override // com.amazon.aps.iva.ul.d
    public final void k5(String str) {
        this.d = str;
        if (!m.b0(str)) {
            getView().jb();
            getView().C9();
            return;
        }
        if (!this.c) {
            getView().d3();
        }
        getView().Fd();
    }
}
