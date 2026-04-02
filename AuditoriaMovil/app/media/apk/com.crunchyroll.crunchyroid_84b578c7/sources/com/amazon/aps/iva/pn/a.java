package com.amazon.aps.iva.pn;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mn.k;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: FiltersFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/iva/pn/a;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/pn/h;", "<init>", "()V", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.wy.e implements h {
    public static final /* synthetic */ l<Object>[] f = {q.a(a.class, "binding", "getBinding()Lcom/crunchyroll/sortandfilters/databinding/FragmentSortAndFilterBinding;", 0), q.a(a.class, "filterSelectionViewModel", "getFilterSelectionViewModel()Lcom/crunchyroll/sortandfilters/filters/FiltersSelectionViewModelImpl;", 0)};
    public final FragmentViewBindingDelegate c;
    public final com.amazon.aps.iva.ez.f d;
    public final m e;

    /* compiled from: FiltersFragment.kt */
    /* renamed from: com.amazon.aps.iva.pn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0624a extends i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.on.b> {
        public static final C0624a b = new C0624a();

        public C0624a() {
            super(1, com.amazon.aps.iva.on.b.class, "bind", "bind(Landroid/view/View;)Lcom/crunchyroll/sortandfilters/databinding/FragmentSortAndFilterBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.on.b invoke(View view) {
            View view2 = view;
            j.f(view2, "p0");
            return com.amazon.aps.iva.on.b.a(view2);
        }
    }

    /* compiled from: FiltersFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, g> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final g invoke(p pVar) {
            j.f(pVar, "it");
            return new g(a.this.ei().a());
        }
    }

    /* compiled from: FiltersFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.pn.b> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.pn.b invoke() {
            l<Object>[] lVarArr = a.f;
            a aVar = a.this;
            aVar.getClass();
            l<?> lVar = a.f[1];
            com.amazon.aps.iva.mn.h d = aVar.ei().d();
            j.f(d, "sortAndFiltersAnalytics");
            return new e(aVar, (g) aVar.d.getValue(aVar, lVar), d);
        }
    }

    public a() {
        super(0);
        this.c = com.amazon.aps.iva.a60.b.A(this, C0624a.b);
        this.d = new com.amazon.aps.iva.ez.f(this, g.class, new b());
        this.e = com.amazon.aps.iva.kb0.f.b(new c());
    }

    @Override // com.amazon.aps.iva.pn.h
    public final void Dg(int i, com.amazon.aps.iva.mn.b bVar, boolean z, d dVar) {
        j.f(bVar, "option");
        LinearLayout linearLayout = di().c;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.un.b bVar2 = new com.amazon.aps.iva.un.b(requireContext);
        bVar2.removeAllViews();
        View inflate = View.inflate(bVar2.getContext(), R.layout.custom_radio_group_title, null);
        j.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(i);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        bVar2.addView(textView);
        int title = bVar.getTitle();
        View inflate2 = View.inflate(bVar2.getContext(), R.layout.sort_and_filters_check_box, null);
        j.d(inflate2, "null cannot be cast to non-null type android.widget.CheckBox");
        CheckBox checkBox = (CheckBox) inflate2;
        checkBox.setText(title);
        checkBox.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        bVar2.addView(checkBox);
        bVar2.c = checkBox;
        checkBox.setChecked(z);
        bVar2.setOnCheckedChangeListener(dVar);
        linearLayout.addView(bVar2);
    }

    @Override // com.amazon.aps.iva.pn.h
    public final void V0() {
        TextView textView = di().b;
        j.e(textView, "binding.sortAndFiltersApplyButton");
        textView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.pn.h
    public final void Wa(int i, List list, com.amazon.aps.iva.mn.b bVar, com.amazon.aps.iva.pn.c cVar) {
        j.f(list, "options");
        j.f(bVar, "defaultOption");
        LinearLayout linearLayout = di().c;
        Context requireContext = requireContext();
        j.e(requireContext, "requireContext()");
        com.amazon.aps.iva.p70.b bVar2 = new com.amazon.aps.iva.p70.b(requireContext);
        bVar2.a(list, Integer.valueOf(i));
        bVar2.b(bVar);
        bVar2.setOnCheckedChangeListener(cVar);
        linearLayout.addView(bVar2);
    }

    @Override // com.amazon.aps.iva.pn.h
    public final void close() {
        requireActivity().finish();
    }

    public final com.amazon.aps.iva.on.b di() {
        return (com.amazon.aps.iva.on.b) this.c.getValue(this, f[0]);
    }

    public abstract k ei();

    @Override // com.amazon.aps.iva.pn.h
    public final void o5() {
        View.inflate(requireContext(), R.layout.sort_and_filters_radio_group_divider, di().c);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_sort_and_filter, viewGroup, false);
        j.e(inflate, "inflater.inflate(R.layou…filter, container, false)");
        return inflate;
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().b.setText(R.string.filters_apply);
        di().b.setOnClickListener(new com.amazon.aps.iva.c8.e(this, 6));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.pn.b) this.e.getValue());
    }

    @Override // com.amazon.aps.iva.pn.h
    public final void u1() {
        TextView textView = di().b;
        j.e(textView, "binding.sortAndFiltersApplyButton");
        textView.setEnabled(true);
    }
}
