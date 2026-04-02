package com.amazon.aps.iva.fy;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.xx.p;
import com.ellation.crunchyroll.model.music.MusicImages;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.MaturityRatingType;
import java.util.ArrayList;
import java.util.List;
/* compiled from: HeroMusicPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final com.amazon.aps.iva.k50.d b;
    public final boolean c;
    public p d;

    public d(a aVar, com.amazon.aps.iva.k50.d dVar, boolean z) {
        super(aVar, new j[0]);
        this.b = dVar;
        this.c = z;
    }

    @Override // com.amazon.aps.iva.fy.c
    public final void E5(p pVar) {
        this.d = pVar;
        getView().setTitle(pVar.c);
        List<String> list = pVar.h;
        boolean isEmpty = list.isEmpty();
        boolean z = false;
        LabelUiModel labelUiModel = pVar.i;
        if (isEmpty) {
            getView().jh();
        } else {
            e view = getView();
            ArrayList Z0 = x.Z0(list);
            if (labelUiModel.getMaturityRating() != MaturityRatingType.UNDEFINED) {
                Z0.add(0, "");
            }
            view.setGenres(Z0);
            getView().Wg();
        }
        e view2 = getView();
        String str = pVar.g;
        if ((str == null || str.length() == 0) ? true : true) {
            view2.g();
        } else {
            view2.setDescription(str);
        }
        boolean z2 = this.c;
        MusicImages musicImages = pVar.d;
        if (z2) {
            getView().g2(musicImages.getPostersWide());
        } else {
            getView().g2(musicImages.getPostersTall());
        }
        getView().X1(labelUiModel);
    }

    @Override // com.amazon.aps.iva.fy.c
    public final void K3() {
        p pVar = this.d;
        if (pVar != null) {
            this.b.C1(new com.amazon.aps.iva.l50.c(pVar.e, pVar.f));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("heroItem");
        throw null;
    }

    @Override // com.amazon.aps.iva.fy.c
    public final void h() {
        p pVar = this.d;
        if (pVar != null) {
            this.b.D1(new com.amazon.aps.iva.l50.a(pVar.b));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("heroItem");
        throw null;
    }
}
