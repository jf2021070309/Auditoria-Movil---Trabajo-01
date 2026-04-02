package com.ellation.crunchyroll.presentation.content.seasons;

import com.amazon.aps.iva.k3.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.FormattableSeason;
/* compiled from: SeasonsDialog.kt */
/* loaded from: classes2.dex */
public final class b implements com.amazon.aps.iva.m00.a<FormattableSeason> {
    public final /* synthetic */ a<FormattableSeason> a;

    public b(a<FormattableSeason> aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.m00.a
    public final void a(FormattableSeason formattableSeason) {
        FormattableSeason formattableSeason2 = formattableSeason;
        j.f(formattableSeason2, "season");
        this.a.getParentFragmentManager().a0(e.a(new com.amazon.aps.iva.kb0.j("selected_season_result", formattableSeason2)), "season_dialog");
    }
}
