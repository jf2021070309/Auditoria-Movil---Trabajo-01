package com.amazon.aps.iva.rn;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.sortandfilters.header.SortAndFiltersHeaderLayout;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

    public /* synthetic */ a(int i, com.amazon.aps.iva.xb0.a aVar) {
        this.b = i;
        this.c = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        com.amazon.aps.iva.xb0.a aVar = this.c;
        switch (i) {
            case 0:
                int i2 = SortAndFiltersHeaderLayout.c;
                j.f(aVar, "$onClick");
                aVar.invoke();
                return;
            default:
                ShowPageActivity.a aVar2 = ShowPageActivity.K;
                j.f(aVar, "$onCtaButtonClick");
                aVar.invoke();
                return;
        }
    }
}
