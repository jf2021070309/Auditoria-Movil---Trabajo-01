package com.amazon.aps.iva.q30;

import android.content.Context;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
/* compiled from: RecentSearchesRouter.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context) {
        super(2);
        this.h = context;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(String str, com.amazon.aps.iva.x50.t tVar) {
        String str2 = str;
        com.amazon.aps.iva.x50.t tVar2 = tVar;
        com.amazon.aps.iva.yb0.j.f(str2, "containerId");
        com.amazon.aps.iva.yb0.j.f(tVar2, "resourceType");
        ShowPageActivity.K.getClass();
        ShowPageActivity.a.b(this.h, str2, tVar2, true);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
