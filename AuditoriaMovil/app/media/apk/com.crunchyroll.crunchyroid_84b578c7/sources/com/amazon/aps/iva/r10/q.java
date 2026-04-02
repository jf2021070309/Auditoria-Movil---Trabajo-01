package com.amazon.aps.iva.r10;

import android.content.Context;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: HistoryFragment.kt */
/* loaded from: classes2.dex */
public final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<l, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ n h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(1);
        this.h = nVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(l lVar) {
        l lVar2 = lVar;
        com.amazon.aps.iva.yb0.j.f(lVar2, "uiModel");
        ShowPageActivity.a aVar = ShowPageActivity.K;
        Context requireContext = this.h.requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        aVar.getClass();
        ShowPageActivity.a.a(requireContext, lVar2.a);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
