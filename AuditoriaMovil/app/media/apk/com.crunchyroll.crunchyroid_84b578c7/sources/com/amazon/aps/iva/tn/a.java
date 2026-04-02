package com.amazon.aps.iva.tn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.mn.h;
import com.amazon.aps.iva.mn.k;
import com.amazon.aps.iva.mn.m;
import com.amazon.aps.iva.mn.n;
import com.amazon.aps.iva.xw.w0;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SortFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/tn/a;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/tn/f;", "<init>", "()V", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.wy.e implements f {
    public static final /* synthetic */ l<Object>[] i = {q.a(a.class, "binding", "getBinding()Lcom/crunchyroll/sortandfilters/databinding/FragmentSortAndFilterBinding;", 0), q.a(a.class, "sortSelectionViewModel", "getSortSelectionViewModel()Lcom/crunchyroll/sortandfilters/sort/SortSelectionViewModelImpl;", 0)};
    public final FragmentViewBindingDelegate c;
    public com.amazon.aps.iva.p70.b<m> d;
    public com.amazon.aps.iva.p70.b<n> e;
    public View f;
    public final com.amazon.aps.iva.ez.f g;
    public final com.amazon.aps.iva.kb0.m h;

    /* compiled from: SortFragment.kt */
    /* renamed from: com.amazon.aps.iva.tn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0744a extends i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.on.b> {
        public static final C0744a b = new C0744a();

        public C0744a() {
            super(1, com.amazon.aps.iva.on.b.class, "bind", "bind(Landroid/view/View;)Lcom/crunchyroll/sortandfilters/databinding/FragmentSortAndFilterBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.on.b invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            return com.amazon.aps.iva.on.b.a(view2);
        }
    }

    /* compiled from: SortFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends i implements com.amazon.aps.iva.xb0.l<m, com.amazon.aps.iva.kb0.q> {
        public b(com.amazon.aps.iva.tn.b bVar) {
            super(1, bVar, com.amazon.aps.iva.tn.b.class, "onSortOptionSelected", "onSortOptionSelected(Lcom/crunchyroll/sortandfilters/SortOption;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(m mVar) {
            m mVar2 = mVar;
            j.f(mVar2, "p0");
            ((com.amazon.aps.iva.tn.b) this.receiver).B4(mVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SortFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends i implements com.amazon.aps.iva.xb0.l<n, com.amazon.aps.iva.kb0.q> {
        public c(com.amazon.aps.iva.tn.b bVar) {
            super(1, bVar, com.amazon.aps.iva.tn.b.class, "onSortOrderSelected", "onSortOrderSelected(Lcom/crunchyroll/sortandfilters/SortOrder;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(n nVar) {
            n nVar2 = nVar;
            j.f(nVar2, "p0");
            ((com.amazon.aps.iva.tn.b) this.receiver).G1(nVar2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SortFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.tn.b> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.tn.b invoke() {
            l<Object>[] lVarArr = a.i;
            a aVar = a.this;
            aVar.getClass();
            l<?> lVar = a.i[1];
            h d = aVar.ei().d();
            j.f(d, "sortAndFiltersAnalytics");
            return new com.amazon.aps.iva.tn.c(aVar, (com.amazon.aps.iva.tn.e) aVar.g.getValue(aVar, lVar), d);
        }
    }

    /* compiled from: SortFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.tn.e> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.tn.e invoke(p pVar) {
            j.f(pVar, "it");
            return new com.amazon.aps.iva.tn.e(a.this.ei().a());
        }
    }

    public a() {
        super(0);
        this.c = com.amazon.aps.iva.a60.b.A(this, C0744a.b);
        this.g = new com.amazon.aps.iva.ez.f(this, com.amazon.aps.iva.tn.e.class, new e());
        this.h = com.amazon.aps.iva.kb0.f.b(new d());
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void Ba() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
            com.amazon.aps.iva.p70.b<n> bVar = this.e;
            if (bVar != null) {
                bVar.setVisibility(0);
                return;
            } else {
                j.m("sortOrder");
                throw null;
            }
        }
        j.m("divider");
        throw null;
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void E8(List<? extends m> list) {
        j.f(list, "options");
        com.amazon.aps.iva.p70.b<m> bVar = this.d;
        if (bVar != null) {
            bVar.a(list, Integer.valueOf((int) R.string.sorting_title));
        } else {
            j.m("sortOptions");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void Ff() {
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
            com.amazon.aps.iva.p70.b<n> bVar = this.e;
            if (bVar != null) {
                bVar.setVisibility(8);
                return;
            } else {
                j.m("sortOrder");
                throw null;
            }
        }
        j.m("divider");
        throw null;
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void V0() {
        TextView textView = di().b;
        j.e(textView, "binding.sortAndFiltersApplyButton");
        textView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void close() {
        requireActivity().finish();
    }

    public final com.amazon.aps.iva.on.b di() {
        return (com.amazon.aps.iva.on.b) this.c.getValue(this, i[0]);
    }

    public abstract k ei();

    @Override // com.amazon.aps.iva.tn.f
    public final void i5(List<? extends n> list) {
        j.f(list, "orders");
        com.amazon.aps.iva.p70.b<n> bVar = this.e;
        if (bVar != null) {
            bVar.a(list, Integer.valueOf((int) R.string.sorting_order_title));
        } else {
            j.m("sortOrder");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void kc(n nVar) {
        com.amazon.aps.iva.p70.b<n> bVar = this.e;
        if (bVar != null) {
            bVar.b(nVar);
        } else {
            j.m("sortOrder");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_sort_and_filter, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.sort_and_filters_container);
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.p70.b<m> bVar = new com.amazon.aps.iva.p70.b<>(requireContext);
        com.amazon.aps.iva.kb0.m mVar = this.h;
        bVar.setOnCheckedChangeListener(new b((com.amazon.aps.iva.tn.b) mVar.getValue()));
        this.d = bVar;
        linearLayout.addView(bVar);
        View.inflate(requireContext(), R.layout.sort_and_filters_radio_group_divider, linearLayout);
        this.f = (View) x.C0(w0.a(linearLayout));
        Context requireContext2 = requireContext();
        j.e(requireContext2, "requireContext()");
        com.amazon.aps.iva.p70.b<n> bVar2 = new com.amazon.aps.iva.p70.b<>(requireContext2);
        bVar2.setOnCheckedChangeListener(new c((com.amazon.aps.iva.tn.b) mVar.getValue()));
        this.e = bVar2;
        linearLayout.addView(bVar2);
        return inflate;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().b.setText(R.string.sorting_apply);
        di().b.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 7));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.tn.b) this.h.getValue());
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void u1() {
        TextView textView = di().b;
        j.e(textView, "binding.sortAndFiltersApplyButton");
        textView.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.tn.f
    public final void x5(m mVar) {
        j.f(mVar, "option");
        com.amazon.aps.iva.p70.b<m> bVar = this.d;
        if (bVar != null) {
            bVar.b(mVar);
        } else {
            j.m("sortOptions");
            throw null;
        }
    }
}
