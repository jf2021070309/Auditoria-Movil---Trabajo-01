package com.amazon.aps.iva.wf;

import android.view.View;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.contentunavailable.ContentUnavailableLayout;
import com.crunchyroll.sortandfilters.header.SortAndFiltersHeaderLayout;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.crunchyroll.presentation.showpage.summary.ShowSummaryLayout;
import com.ellation.crunchyroll.ratebutton.RateButtonLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ d(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i) {
            case 0:
                int i2 = ContentUnavailableLayout.c;
                j.f(aVar, "$onCtaButtonClick");
                aVar.invoke();
                return;
            case 1:
                int i3 = SortAndFiltersHeaderLayout.c;
                j.f(aVar, "$onClick");
                aVar.invoke();
                return;
            case 2:
                ShowPageActivity.a aVar2 = ShowPageActivity.K;
                j.f(aVar, "$callback");
                aVar.invoke();
                return;
            case 3:
                l<Object>[] lVarArr = ShowSummaryLayout.j;
                j.f(aVar, "$onSummaryCtaButtonClick");
                aVar.invoke();
                return;
            default:
                int i4 = RateButtonLayout.e;
                j.f(aVar, "$onClick");
                aVar.invoke();
                return;
        }
    }
}
