package com.amazon.aps.iva.qi;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import java.text.DateFormat;
import java.util.Date;
/* compiled from: WatchMusicSummaryPresenter.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.wy.b<h> implements e {
    public final DateFormat b;

    public f(c cVar, DateFormat dateFormat) {
        super(cVar, new j[0]);
        this.b = dateFormat;
    }

    @Override // com.amazon.aps.iva.qi.e
    public final void C4(g gVar, l<? super String, q> lVar) {
        String str;
        boolean z;
        String str2 = gVar.d;
        if (m.b0(str2)) {
            getView().Ph();
        } else {
            getView().oh();
            getView().Hg(str2, gVar.e, lVar);
        }
        getView().setMusicTitle(gVar.c);
        Date date = gVar.f;
        if (date != null) {
            str = this.b.format(date);
        } else {
            str = null;
        }
        boolean z2 = false;
        if (str != null && !m.b0(str)) {
            z = false;
        } else {
            z = true;
        }
        LabelUiModel labelUiModel = gVar.h;
        if (!z) {
            getView().setReleaseDate(str);
            getView().H9();
            getView().W2(labelUiModel, true);
        } else {
            getView().ca();
            getView().W2(labelUiModel, false);
        }
        h view = getView();
        String str3 = gVar.g;
        if (str3.length() == 0) {
            z2 = true;
        }
        if (z2) {
            view.g();
        } else {
            view.setDescription(str3);
            view.r();
        }
        h view2 = getView();
        if (gVar.i == t.MUSIC_VIDEO) {
            view2.Fb();
        } else {
            view2.Md();
        }
        getView().c5();
    }

    @Override // com.amazon.aps.iva.qi.e
    public final void q() {
        getView().Z();
    }
}
