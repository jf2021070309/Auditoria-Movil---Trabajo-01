package com.amazon.aps.iva.zh;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.behavior.AppBarLayoutBehavior;
/* compiled from: ArtistScrollChangeListener.kt */
/* loaded from: classes.dex */
public final class s implements AppBarLayoutBehavior.a {
    public final com.amazon.aps.iva.vy.a a;
    public final View b;

    public s(com.amazon.aps.iva.vy.a aVar) {
        this.a = aVar;
        this.b = aVar.i.findViewById(R.id.artist_summary_title);
    }

    @Override // com.ellation.widgets.behavior.AppBarLayoutBehavior.a
    public final void a(int i) {
        com.amazon.aps.iva.vy.a aVar = this.a;
        View view = aVar.d;
        com.amazon.aps.iva.yb0.j.c(view);
        float f = -i;
        View view2 = this.b;
        view.setAlpha(f / view2.getTop());
        FrameLayout frameLayout = aVar.l;
        if (frameLayout != null) {
            frameLayout.setAlpha((f - aVar.i.findViewById(R.id.artist_hero_empty_space).getHeight()) * (1.0f / (view2.getTop() - aVar.i.findViewById(R.id.artist_hero_empty_space).getHeight())));
        }
        TextView textView = aVar.m;
        if (textView != null) {
            textView.setAlpha((f - view2.getTop()) * (1.0f / (view2.getHeight() / 2.0f)));
        }
    }
}
