package com.ellation.crunchyroll.presentation.watchlist;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: WatchlistFragment.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public final /* synthetic */ a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        j.f(panel2, "panel");
        ShowPageActivity.a aVar = ShowPageActivity.K;
        Context requireContext = this.h.requireContext();
        j.e(requireContext, "requireContext()");
        aVar.getClass();
        ShowPageActivity.a.a(requireContext, panel2);
        return q.a;
    }
}
