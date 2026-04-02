package com.amazon.aps.iva.hv;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.feature.empty.EmptyLayout;
import com.ellation.widgets.searchtoolbar.SearchToolbarLayout;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrunchylistSearchFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/hv/a;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/hv/m;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.e implements m {
    public final FragmentViewBindingDelegate c;
    public final com.amazon.aps.iva.kb0.m d;
    public final LifecycleAwareLazy e;
    public final LifecycleAwareLazy f;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {com.amazon.aps.iva.k.q.a(a.class, "binding", "getBinding()Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentCrunchylistSearchBinding;", 0)};
    public static final C0345a g = new C0345a();

    /* compiled from: CrunchylistSearchFragment.kt */
    /* renamed from: com.amazon.aps.iva.hv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0345a {
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.jv.c> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.jv.c invoke() {
            a aVar = a.this;
            com.amazon.aps.iva.hv.b bVar = new com.amazon.aps.iva.hv.b(aVar);
            androidx.fragment.app.h requireActivity = aVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return new com.amazon.aps.iva.jv.c(requireActivity, bVar);
        }
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.ov.c> {
        public static final c b = new c();

        public c() {
            super(1, com.amazon.aps.iva.ov.c.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentCrunchylistSearchBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ov.c invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.crunchylist_search_empty_input;
            FrameLayout frameLayout = (FrameLayout) z.u(R.id.crunchylist_search_empty_input, view2);
            if (frameLayout != null) {
                i = R.id.crunchylist_search_error_container;
                FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.crunchylist_search_error_container, view2);
                if (frameLayout2 != null) {
                    i = R.id.crunchylist_search_no_results_view;
                    EmptyLayout emptyLayout = (EmptyLayout) z.u(R.id.crunchylist_search_no_results_view, view2);
                    if (emptyLayout != null) {
                        i = R.id.crunchylist_search_progress;
                        FrameLayout frameLayout3 = (FrameLayout) z.u(R.id.crunchylist_search_progress, view2);
                        if (frameLayout3 != null) {
                            i = R.id.crunchylist_search_results_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) z.u(R.id.crunchylist_search_results_recycler_view, view2);
                            if (recyclerView != null) {
                                i = R.id.toolbar;
                                SearchToolbarLayout searchToolbarLayout = (SearchToolbarLayout) z.u(R.id.toolbar, view2);
                                if (searchToolbarLayout != null) {
                                    return new com.amazon.aps.iva.ov.c((ConstraintLayout) view2, frameLayout, frameLayout2, emptyLayout, frameLayout3, recyclerView, searchToolbarLayout);
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ty.b> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ty.b invoke() {
            int i = com.amazon.aps.iva.ty.b.a;
            androidx.fragment.app.h requireActivity = a.this.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return new com.amazon.aps.iva.ty.d(requireActivity);
        }
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hv.e> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hv.e invoke() {
            int i = com.amazon.aps.iva.hv.e.a;
            a aVar = a.this;
            com.amazon.aps.iva.yb0.j.f(aVar, "fragment");
            return new com.amazon.aps.iva.hv.f(aVar);
        }
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public f(com.amazon.aps.iva.hv.g gVar) {
            super(1, gVar, com.amazon.aps.iva.hv.g.class, "onSearchTextChanged", "onSearchTextChanged(Ljava/lang/String;)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "p0");
            ((com.amazon.aps.iva.hv.g) this.receiver).Z4(str2);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistSearchFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public g(com.amazon.aps.iva.hv.g gVar) {
            super(0, gVar, com.amazon.aps.iva.hv.g.class, "onRetry", "onRetry()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.hv.g) this.receiver).b();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a() {
        super(R.layout.fragment_crunchylist_search);
        this.c = com.amazon.aps.iva.a60.b.A(this, c.b);
        this.d = com.amazon.aps.iva.kb0.f.b(new e());
        this.e = com.amazon.aps.iva.aq.j.F(this, new d());
        this.f = com.amazon.aps.iva.aq.j.F(this, new b());
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void J9() {
        FrameLayout frameLayout = di().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchEmptyInput");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void K4() {
        EmptyLayout emptyLayout = di().d;
        com.amazon.aps.iva.yb0.j.e(emptyLayout, "binding.crunchylistSearchNoResultsView");
        emptyLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void V2(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.iv.b> hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "crunchylistSearchPagedList");
        ((com.amazon.aps.iva.jv.c) this.f.getValue()).e(hVar);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void c() {
        FrameLayout frameLayout = di().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchErrorContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, new g(ei().getPresenter()), null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void closeScreen() {
        requireActivity().getOnBackPressedDispatcher().c();
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void d() {
        ((com.amazon.aps.iva.ty.b) this.e.getValue()).d();
    }

    public final com.amazon.aps.iva.ov.c di() {
        return (com.amazon.aps.iva.ov.c) this.c.getValue(this, h[0]);
    }

    public final com.amazon.aps.iva.hv.e ei() {
        return (com.amazon.aps.iva.hv.e) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void m() {
        FrameLayout frameLayout = di().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchErrorContainer");
        com.amazon.aps.iva.k60.a.b(frameLayout);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void oa() {
        ((com.amazon.aps.iva.ty.b) this.e.getValue()).a(di().g.getSearchInput());
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void of() {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchProgress");
        frameLayout.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            com.amazon.aps.iva.xw.b.e(activity, R.color.black);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (isRemoving()) {
            ei().getPresenter().d6();
        }
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            com.amazon.aps.iva.xw.b.e(activity, R.color.cr_black_pearl);
        }
        di().g.setNavigationOnClickListener(new com.amazon.aps.iva.c8.j(this, 10));
        di().g.setSearchTextChangeListener(new f(ei().getPresenter()));
        di().f.addItemDecoration(new com.amazon.aps.iva.jv.e());
        di().f.setAdapter((com.amazon.aps.iva.jv.c) this.f.getValue());
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void qb() {
        EmptyLayout emptyLayout = di().d;
        com.amazon.aps.iva.yb0.j.e(emptyLayout, "binding.crunchylistSearchNoResultsView");
        emptyLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void sc() {
        FrameLayout frameLayout = di().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchEmptyInput");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ei().getPresenter());
    }

    @Override // com.amazon.aps.iva.hv.m
    public final void showLoadingOverlay() {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistSearchProgress");
        frameLayout.setVisibility(0);
    }
}
