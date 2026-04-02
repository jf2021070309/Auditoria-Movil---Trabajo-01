package com.amazon.aps.iva.l40;

import android.view.View;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.ellation.widgets.behavior.AppBarLayoutBehavior;
/* compiled from: ShowPageScrollChangeListener.kt */
/* loaded from: classes2.dex */
public final class c1 implements AppBarLayoutBehavior.a {
    public final View a;
    public final View b;
    public final View c;
    public final View d;
    public final View e;

    public c1(ShowPageActivity.i iVar) {
        Object invoke = iVar.invoke(Integer.valueOf((int) R.id.show_page_hero_cover));
        com.amazon.aps.iva.yb0.j.c(invoke);
        this.a = (View) invoke;
        Object invoke2 = iVar.invoke(Integer.valueOf((int) R.id.show_page_summary_title));
        com.amazon.aps.iva.yb0.j.c(invoke2);
        this.b = (View) invoke2;
        Object invoke3 = iVar.invoke(Integer.valueOf((int) R.id.show_page_toolbar_background_solid));
        com.amazon.aps.iva.yb0.j.c(invoke3);
        this.c = (View) invoke3;
        this.d = (View) iVar.invoke(Integer.valueOf((int) R.id.show_page_toolbar_title));
        Object invoke4 = iVar.invoke(Integer.valueOf((int) R.id.show_page_hero_empty_space));
        com.amazon.aps.iva.yb0.j.c(invoke4);
        this.e = (View) invoke4;
    }

    @Override // com.ellation.widgets.behavior.AppBarLayoutBehavior.a
    public final void a(int i) {
        float f = -i;
        View view = this.b;
        this.a.setAlpha(f / view.getTop());
        View view2 = this.e;
        this.c.setAlpha((f - view2.getHeight()) * (1.0f / (view.getTop() - view2.getHeight())));
        View view3 = this.d;
        if (view3 != null) {
            view3.setAlpha((f - view.getTop()) * (1.0f / (view.getHeight() / 2.0f)));
        }
    }
}
