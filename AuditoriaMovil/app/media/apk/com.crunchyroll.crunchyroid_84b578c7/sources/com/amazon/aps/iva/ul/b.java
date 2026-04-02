package com.amazon.aps.iva.ul;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.player.settings.reportproblem.button.ReportProblemButton;
/* compiled from: ReportProblemButton.kt */
/* loaded from: classes2.dex */
public final class b extends l implements com.amazon.aps.iva.xb0.a<d> {
    public final /* synthetic */ ReportProblemButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ReportProblemButton reportProblemButton) {
        super(0);
        this.h = reportProblemButton;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final d invoke() {
        ReportProblemButton reportProblemButton = this.h;
        c cVar = reportProblemButton.d;
        if (cVar != null) {
            return new e(reportProblemButton, cVar);
        }
        j.m("reportProblemButtonListener");
        throw null;
    }
}
