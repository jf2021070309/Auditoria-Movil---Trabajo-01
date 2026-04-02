package com.amazon.aps.iva.dc;

import android.view.View;
import com.amazon.aps.iva.ab.r;
import com.amazon.aps.iva.f00.q;
import com.amazon.aps.iva.kf.b0;
import com.amazon.aps.iva.kf.c0;
import com.amazon.aps.iva.nv.e;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.cards.ShortNewsCard;
import com.braze.ui.widget.ShortNewsCardView;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.google.android.material.snackbar.Snackbar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ShortNewsCardView.c((ShortNewsCardView) obj2, (ShortNewsCard) obj, view);
                return;
            case 1:
                p pVar = (p) obj2;
                c0 c0Var = (c0) obj;
                int i2 = b0.c;
                j.f(pVar, "$onConnectedAppItemClick");
                j.f(c0Var, "$model");
                j.e(view, "it");
                pVar.invoke(c0Var, r.p(view, null));
                return;
            case 2:
                l lVar = (l) obj2;
                e eVar = (e) obj;
                int i3 = com.amazon.aps.iva.nv.c.d;
                j.f(lVar, "$onCrunchylistItemClick");
                j.f(eVar, "$crunchylistItemUiModel");
                lVar.invoke(eVar);
                return;
            case 3:
                com.amazon.aps.iva.d00.a aVar = (com.amazon.aps.iva.d00.a) obj2;
                q qVar = (q) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = com.amazon.aps.iva.f00.p.o;
                j.f(aVar, "$listener");
                j.f(qVar, "$asset");
                aVar.P3(qVar);
                return;
            case 4:
                com.amazon.aps.iva.n00.b bVar = (com.amazon.aps.iva.n00.b) obj2;
                Season season = (Season) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = com.amazon.aps.iva.n00.b.f;
                j.f(bVar, "this$0");
                j.f(season, "$season");
                bVar.e.invoke(season);
                return;
            default:
                Snackbar.a((Snackbar) obj2, (View.OnClickListener) obj, view);
                return;
        }
    }
}
