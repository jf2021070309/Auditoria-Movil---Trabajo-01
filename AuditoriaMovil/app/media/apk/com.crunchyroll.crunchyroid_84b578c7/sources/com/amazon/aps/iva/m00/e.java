package com.amazon.aps.iva.m00;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.ellation.crunchyroll.presentation.content.seasons.a;
/* compiled from: SeasonsDialog.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<FormattableSeason, q> {
    public final /* synthetic */ com.ellation.crunchyroll.presentation.content.seasons.a<FormattableSeason> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.ellation.crunchyroll.presentation.content.seasons.a<FormattableSeason> aVar) {
        super(1);
        this.h = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(FormattableSeason formattableSeason) {
        FormattableSeason formattableSeason2 = formattableSeason;
        com.amazon.aps.iva.yb0.j.f(formattableSeason2, "it");
        a.C0969a c0969a = com.ellation.crunchyroll.presentation.content.seasons.a.h;
        ((h) this.h.g.getValue()).e0(formattableSeason2);
        return q.a;
    }
}
