package com.amazon.aps.iva.jm;

import android.view.View;
import com.amazon.aps.iva.jm.r;
import com.amazon.aps.iva.jm.t;
import com.amazon.aps.iva.q30.d;
import com.ellation.crunchyroll.presentation.main.BottomNavigationBarLayout;
import com.ellation.crunchyroll.presentation.main.BottomNavigationTabItemLayout;
import com.ellation.widgets.ratingbar.RatingBar;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
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
                t.a aVar = (t.a) obj2;
                r.b bVar = (r.b) obj;
                com.amazon.aps.iva.yb0.j.f(aVar, "this$0");
                com.amazon.aps.iva.yb0.j.f(bVar, "$avatarUiModel");
                aVar.c.K(bVar.c);
                return;
            case 1:
                com.amazon.aps.iva.kz.a aVar2 = (com.amazon.aps.iva.kz.a) obj2;
                com.amazon.aps.iva.kz.i iVar = (com.amazon.aps.iva.kz.i) obj;
                int i2 = com.amazon.aps.iva.kz.f.f;
                com.amazon.aps.iva.yb0.j.f(aVar2, "$listener");
                com.amazon.aps.iva.yb0.j.f(iVar, "$asset");
                aVar2.k0(iVar);
                return;
            case 2:
                BottomNavigationBarLayout bottomNavigationBarLayout = (BottomNavigationBarLayout) obj2;
                Map.Entry entry = (Map.Entry) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr = BottomNavigationBarLayout.k;
                com.amazon.aps.iva.yb0.j.f(bottomNavigationBarLayout, "this$0");
                com.amazon.aps.iva.yb0.j.f(entry, "$entry");
                com.amazon.aps.iva.v10.j jVar = bottomNavigationBarLayout.b;
                if (jVar != null) {
                    jVar.T(((Number) entry.getKey()).intValue(), ((BottomNavigationTabItemLayout) entry.getValue()).getTabText());
                    return;
                }
                return;
            case 3:
                d.a aVar3 = (d.a) obj2;
                com.amazon.aps.iva.q30.b bVar2 = (com.amazon.aps.iva.q30.b) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr2 = d.a.e;
                com.amazon.aps.iva.yb0.j.f(aVar3, "this$0");
                com.amazon.aps.iva.yb0.j.f(bVar2, "$recentSearch");
                aVar3.b.H1(bVar2);
                return;
            default:
                com.amazon.aps.iva.xb0.l lVar = (com.amazon.aps.iva.xb0.l) obj2;
                RatingBar ratingBar = (RatingBar) obj;
                com.amazon.aps.iva.fc0.l<Object>[] lVarArr3 = RatingBar.f;
                com.amazon.aps.iva.yb0.j.f(lVar, "$ratingPickedListener");
                com.amazon.aps.iva.yb0.j.f(ratingBar, "this$0");
                int parseInt = Integer.parseInt(view.getTag().toString());
                lVar.invoke(Integer.valueOf(parseInt));
                ratingBar.setSecondaryRating(parseInt);
                return;
        }
    }
}
