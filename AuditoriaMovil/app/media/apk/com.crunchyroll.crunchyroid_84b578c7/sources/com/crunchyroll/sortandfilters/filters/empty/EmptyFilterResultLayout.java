package com.crunchyroll.sortandfilters.filters.empty;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.g1.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mn.h;
import com.amazon.aps.iva.on.e;
import com.amazon.aps.iva.qn.c;
import com.amazon.aps.iva.qn.d;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.crunchyroll.crunchyroid.R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: EmptyFilterResultLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/crunchyroll/sortandfilters/filters/empty/EmptyFilterResultLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/qn/c;", "a", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class EmptyFilterResultLayout extends g implements c {
    public static final /* synthetic */ int e = 0;
    public final e b;
    public final ChipsLayoutManager c;
    public com.amazon.aps.iva.qn.a d;

    /* compiled from: EmptyFilterResultLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.o {
        public final int a;
        public final int b;

        public a(Resources resources) {
            this.a = resources.getDimensionPixelOffset(R.dimen.filter_chip_horizontal_space);
            this.b = resources.getDimensionPixelOffset(R.dimen.filter_chip_vertical_space);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            j.f(rect, "outRect");
            j.f(view, "view");
            j.f(recyclerView, "parent");
            j.f(b0Var, "state");
            int i = this.a;
            rect.left = i / 2;
            rect.right = i / 2;
            rect.top = 0;
            rect.bottom = this.b;
        }
    }

    /* compiled from: EmptyFilterResultLayout.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements p<com.amazon.aps.iva.mn.b, com.amazon.aps.iva.fs.b, q> {
        public b(com.amazon.aps.iva.qn.a aVar) {
            super(2, aVar, com.amazon.aps.iva.qn.a.class, "onFilterRemove", "onFilterRemove(Lcom/crunchyroll/sortandfilters/FilterOption;Lcom/ellation/analytics/helpers/AnalyticsClickedView;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.mn.b bVar, com.amazon.aps.iva.fs.b bVar2) {
            com.amazon.aps.iva.mn.b bVar3 = bVar;
            com.amazon.aps.iva.fs.b bVar4 = bVar2;
            j.f(bVar3, "p0");
            j.f(bVar4, "p1");
            ((com.amazon.aps.iva.qn.a) this.receiver).m4(bVar3, bVar4);
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyFilterResultLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public final void b1(com.amazon.aps.iva.mn.i iVar, h hVar) {
        j.f(iVar, "interactor");
        j.f(hVar, "sortAndFiltersAnalytics");
        com.amazon.aps.iva.qn.b bVar = new com.amazon.aps.iva.qn.b(this, iVar, hVar);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar, this);
        this.d = bVar;
        e eVar = this.b;
        RecyclerView recyclerView = (RecyclerView) eVar.f;
        recyclerView.setItemAnimator(null);
        recyclerView.setLayoutManager(this.c);
        Resources resources = recyclerView.getContext().getResources();
        j.e(resources, "context.resources");
        recyclerView.addItemDecoration(new a(resources));
        com.amazon.aps.iva.qn.a aVar = this.d;
        if (aVar != null) {
            recyclerView.setAdapter(new d(new b(aVar)));
            eVar.c.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 6));
            return;
        }
        j.m("presenter");
        throw null;
    }

    @Override // com.amazon.aps.iva.qn.c
    public final void c3(List<? extends com.amazon.aps.iva.mn.b> list) {
        j.f(list, "filters");
        RecyclerView.h adapter = ((RecyclerView) this.b.f).getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.crunchyroll.sortandfilters.filters.empty.FiltersAdapter");
        ((d) adapter).e(list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyFilterResultLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_empty_filter_result, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.empty_filter_result_clear_button;
        TextView textView = (TextView) z.u(R.id.empty_filter_result_clear_button, inflate);
        if (textView != null) {
            i2 = R.id.empty_filter_result_message;
            TextView textView2 = (TextView) z.u(R.id.empty_filter_result_message, inflate);
            if (textView2 != null) {
                i2 = R.id.empty_filter_result_recycler_view;
                RecyclerView recyclerView = (RecyclerView) z.u(R.id.empty_filter_result_recycler_view, inflate);
                if (recyclerView != null) {
                    i2 = R.id.empty_filter_result_title;
                    TextView textView3 = (TextView) z.u(R.id.empty_filter_result_title, inflate);
                    if (textView3 != null) {
                        this.b = new e((ConstraintLayout) inflate, textView, textView2, recyclerView, textView3);
                        ChipsLayoutManager chipsLayoutManager = new ChipsLayoutManager(context);
                        ChipsLayoutManager.b bVar = new ChipsLayoutManager.b(chipsLayoutManager);
                        chipsLayoutManager.h = 1;
                        bVar.a = 17;
                        chipsLayoutManager.f = false;
                        chipsLayoutManager.e = new f(8);
                        chipsLayoutManager.i = 6;
                        chipsLayoutManager.j = true;
                        this.c = bVar.a();
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
