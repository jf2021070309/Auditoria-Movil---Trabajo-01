package com.amazon.aps.iva.w30;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.c8.s;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.x30.a0;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.search.SearchItemsContainerType;
import java.util.Set;
/* compiled from: SearchResultHeaderLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends g implements d {
    public static final /* synthetic */ l<Object>[] e = {q.a(a.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(a.class, "viewAll", "getViewAll()Landroid/view/View;", 0)};
    public final v b;
    public final v c;
    public final b d;

    public a(Context context, a0 a0Var) {
        super(context, null, 0, 6, null);
        this.b = com.amazon.aps.iva.xw.g.c(R.id.search_results_summary_header_title, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.search_results_summary_header_view_all, this);
        this.d = new b(this, a0Var);
        View.inflate(context, R.layout.layout_search_results_summary_header, this);
    }

    private final TextView getTitle() {
        return (TextView) this.b.getValue(this, e[0]);
    }

    private final View getViewAll() {
        return (View) this.c.getValue(this, e[1]);
    }

    @Override // com.amazon.aps.iva.w30.d
    public final void Ie() {
        getViewAll().setVisibility(0);
    }

    public final void b1(com.amazon.aps.iva.s30.d dVar) {
        b bVar = this.d;
        bVar.getClass();
        bVar.c = dVar;
        SearchItemsContainerType searchItemsContainerType = dVar.b;
        bVar.getView().setHeaderText(c.a(searchItemsContainerType));
        if (searchItemsContainerType.getShouldDisplayViewAll()) {
            bVar.getView().Ie();
        } else {
            bVar.getView().og();
        }
        getViewAll().setOnClickListener(new s(this, 19));
    }

    @Override // com.amazon.aps.iva.w30.d
    public final void og() {
        getViewAll().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.w30.d
    public void setHeaderText(int i) {
        getTitle().setText(i);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(this.d);
    }
}
