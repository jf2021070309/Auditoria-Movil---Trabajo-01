package com.amazon.aps.iva.c00;

import android.content.Context;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: PanelContentRouter.kt */
/* loaded from: classes2.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.l<Panel, q> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(1);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(Panel panel) {
        Panel panel2 = panel;
        com.amazon.aps.iva.yb0.j.f(panel2, "panel");
        ShowPageActivity.K.getClass();
        ShowPageActivity.a.a(this.h, panel2);
        return q.a;
    }
}
