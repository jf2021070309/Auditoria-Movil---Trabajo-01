package com.amazon.aps.iva.n00;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.cms.model.Season;
import java.util.Set;
/* compiled from: SeasonNavigatorLayout.kt */
/* loaded from: classes2.dex */
public final class b extends g implements d {
    public static final /* synthetic */ l<Object>[] f = {q.a(b.class, "previousSeason", "getPreviousSeason()Landroid/widget/TextView;", 0), q.a(b.class, "nextSeason", "getNextSeason()Landroid/widget/TextView;", 0)};
    public final c b;
    public final v c;
    public final v d;
    public com.amazon.aps.iva.xb0.l<? super Season, com.amazon.aps.iva.kb0.q> e;

    /* compiled from: SeasonNavigatorLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Season, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Season season) {
            j.f(season, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new c(this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.show_page_previous_season, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.show_page_next_season, this);
        this.e = a.h;
        View.inflate(context, R.layout.layout_season_navigator, this);
    }

    private final TextView getNextSeason() {
        return (TextView) this.d.getValue(this, f[1]);
    }

    private final TextView getPreviousSeason() {
        return (TextView) this.c.getValue(this, f[0]);
    }

    @Override // com.amazon.aps.iva.n00.d
    public final void K5(Season season) {
        getNextSeason().setVisibility(0);
        getNextSeason().setOnClickListener(new com.amazon.aps.iva.dc.c(3, this, season));
    }

    @Override // com.amazon.aps.iva.n00.d
    public final void h7() {
        getPreviousSeason().setVisibility(8);
        getNextSeason().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.n00.d
    public final void r6(Season season) {
        getPreviousSeason().setVisibility(0);
        getPreviousSeason().setOnClickListener(new com.amazon.aps.iva.dc.b(4, this, season));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.b);
    }
}
