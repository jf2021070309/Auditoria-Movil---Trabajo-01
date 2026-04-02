package com.amazon.aps.iva.lv;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.g70.f;
import com.amazon.aps.iva.gv.b;
import com.amazon.aps.iva.gv.i;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.crunchylists.crunchylist.CrunchylistActivity;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.feature.empty.EmptyCtaLayout;
import com.ellation.feature.empty.EmptyLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CrunchylistsFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/aps/iva/lv/a;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/lv/v;", "Lcom/amazon/aps/iva/w70/i;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.e implements v, com.amazon.aps.iva.w70.i, com.amazon.aps.iva.us.a {
    public final LifecycleAwareLazy c;
    public final LifecycleAwareLazy d;
    public final FragmentViewBindingDelegate e;
    public final com.amazon.aps.iva.ls.a f;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {com.amazon.aps.iva.k.q.a(a.class, "binding", "getBinding()Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentCrunchylistsBinding;", 0)};
    public static final C0493a g = new C0493a();

    /* compiled from: CrunchylistsFragment.kt */
    /* renamed from: com.amazon.aps.iva.lv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0493a {
    }

    /* compiled from: CrunchylistsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.ov.d> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.ov.d.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentCrunchylistsBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ov.d invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.crunchylists_empty_cta_view;
            EmptyCtaLayout emptyCtaLayout = (EmptyCtaLayout) z.u(R.id.crunchylists_empty_cta_view, view2);
            if (emptyCtaLayout != null) {
                i = R.id.crunchylists_empty_view;
                EmptyLayout emptyLayout = (EmptyLayout) z.u(R.id.crunchylists_empty_view, view2);
                if (emptyLayout != null) {
                    i = R.id.crunchylists_empty_view_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.crunchylists_empty_view_container, view2);
                    if (constraintLayout != null) {
                        i = R.id.crunchylists_error_container;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.crunchylists_error_container, view2);
                        if (frameLayout != null) {
                            i = R.id.crunchylists_recycler_view;
                            RecyclerView recyclerView = (RecyclerView) z.u(R.id.crunchylists_recycler_view, view2);
                            if (recyclerView != null) {
                                i = R.id.crunchylists_toolbar;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) z.u(R.id.crunchylists_toolbar, view2);
                                if (constraintLayout2 != null) {
                                    i = R.id.crunchylists_toolbar_create_list_button;
                                    TextView textView = (TextView) z.u(R.id.crunchylists_toolbar_create_list_button, view2);
                                    if (textView != null) {
                                        i = R.id.crunchylists_toolbar_lists_count;
                                        TextView textView2 = (TextView) z.u(R.id.crunchylists_toolbar_lists_count, view2);
                                        if (textView2 != null) {
                                            return new com.amazon.aps.iva.ov.d((ConstraintLayout) view2, emptyCtaLayout, emptyLayout, constraintLayout, frameLayout, recyclerView, constraintLayout2, textView, textView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CrunchylistsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.mv.f> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.mv.f invoke() {
            C0493a c0493a = a.g;
            a aVar = a.this;
            return new com.amazon.aps.iva.mv.f(new com.amazon.aps.iva.lv.b(aVar.ei().getPresenter()), new com.amazon.aps.iva.lv.c(aVar.ei().getPresenter()), new com.amazon.aps.iva.lv.d(aVar.ei().getPresenter()));
        }
    }

    /* compiled from: CrunchylistsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<g> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final g invoke() {
            int i = g.a;
            a aVar = a.this;
            com.amazon.aps.iva.yb0.j.f(aVar, "fragment");
            return new h(aVar);
        }
    }

    /* compiled from: CrunchylistsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.kb0.q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "it");
            C0493a c0493a = a.g;
            a.this.ei().getPresenter().l();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: CrunchylistsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.g70.j, com.amazon.aps.iva.kb0.q> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.g70.j jVar) {
            com.amazon.aps.iva.g70.j jVar2 = jVar;
            com.amazon.aps.iva.yb0.j.f(jVar2, "it");
            C0493a c0493a = a.g;
            j presenter = a.this.ei().getPresenter();
            Serializable serializable = jVar2.c;
            com.amazon.aps.iva.yb0.j.d(serializable, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.crunchyliststab.list.item.CrunchylistItemUiModel");
            presenter.M((com.amazon.aps.iva.nv.e) serializable);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a() {
        super(R.layout.fragment_crunchylists);
        this.c = com.amazon.aps.iva.aq.j.F(this, new d());
        this.d = com.amazon.aps.iva.aq.j.F(this, new c());
        this.e = com.amazon.aps.iva.a60.b.A(this, b.b);
        this.f = com.amazon.aps.iva.ls.a.ALL_CRUNCHYLISTS;
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void B9() {
        TextView textView = di().h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsToolbarCreateListButton");
        textView.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void F(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        androidx.fragment.app.h activity = getActivity();
        com.amazon.aps.iva.yb0.j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.CrunchylistsMessagingView");
        ((com.amazon.aps.iva.xu.g) activity).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void Fe() {
        TextView textView = di().h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsToolbarCreateListButton");
        textView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return 0;
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return R.string.crunchylists;
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void I1(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        b.a aVar2 = com.amazon.aps.iva.gv.b.e;
        i.c cVar = new i.c(eVar);
        aVar2.getClass();
        aVar.d(0, b.a.a(cVar), "crunchylists", 1);
        aVar.i();
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void L() {
        di().c.b1(u.a);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void N1(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        com.amazon.aps.iva.g70.g gVar = new com.amazon.aps.iva.g70.g(R.style.DeleteCrunchylistDialog, getString(R.string.crunchylists_action_delete), getString(R.string.crunchylist_delete_message), getString(R.string.crunchylist_delete_positive_button), eVar, getString(R.string.crunchylist_delete_negative_button));
        com.amazon.aps.iva.g70.f.e.getClass();
        f.a.a(gVar).show(getChildFragmentManager(), "delete_dialog_tag");
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void R6() {
        di().c.p();
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void T() {
        ConstraintLayout constraintLayout = di().g;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsToolbar");
        constraintLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void T1(List<? extends com.amazon.aps.iva.nv.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, "crunchylists");
        ((com.amazon.aps.iva.mv.f) this.d.getValue()).e(list);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void U() {
        ConstraintLayout constraintLayout = di().g;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsToolbar");
        constraintLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void W() {
        com.amazon.aps.iva.j60.a aVar = di().b.e;
        aVar.getClass();
        if (aVar.b) {
            aVar.getView().setPrimaryButtonText(R.string.crunchylists_create_new_list);
        } else {
            aVar.getView().setPrimaryButtonText(R.string.crunchylists_create_new_list);
        }
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void W4() {
        TextView textView = di().i;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsToolbarListsCount");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void d1(int i, int i2) {
        di().i.setText(getString(R.string.crunchylists_list_items_count, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void d4() {
        TextView textView = di().i;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsToolbarListsCount");
        textView.setVisibility(0);
    }

    public final com.amazon.aps.iva.ov.d di() {
        return (com.amazon.aps.iva.ov.d) this.e.getValue(this, h[0]);
    }

    public final g ei() {
        return (g) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void ge() {
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        b.a aVar2 = com.amazon.aps.iva.gv.b.e;
        i.b bVar = i.b.b;
        aVar2.getClass();
        aVar.d(0, b.a.a(bVar), "crunchylists", 1);
        aVar.i();
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void h() {
        ConstraintLayout constraintLayout = di().d;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsEmptyViewContainer");
        constraintLayout.setVisibility(0);
        RecyclerView recyclerView = di().f;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistsRecyclerView");
        recyclerView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void i() {
        RecyclerView recyclerView = di().f;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistsRecyclerView");
        recyclerView.setVisibility(0);
        ConstraintLayout constraintLayout = di().d;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsEmptyViewContainer");
        constraintLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void k0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsErrorContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, 0L, 0L, 254);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().b.setPrimaryButtonClickListener(new e());
        di().h.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 11));
        ViewGroup.LayoutParams layoutParams = di().g.getLayoutParams();
        com.amazon.aps.iva.yb0.j.d(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        ((AppBarLayout.LayoutParams) layoutParams).setScrollFlags(5);
        RecyclerView recyclerView = di().f;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter((com.amazon.aps.iva.mv.f) this.d.getValue());
        recyclerView.addItemDecoration(new com.amazon.aps.iva.mv.g());
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        androidx.lifecycle.g lifecycle = getLifecycle();
        com.amazon.aps.iva.yb0.j.e(lifecycle, "this.lifecycle");
        d.a.a(requireContext, lifecycle).a(ei().getPresenter());
        FragmentManager childFragmentManager = getChildFragmentManager();
        com.amazon.aps.iva.yb0.j.e(childFragmentManager, "childFragmentManager");
        com.amazon.aps.iva.bo.e.h(childFragmentManager, "delete_dialog_tag", this, new f(), com.amazon.aps.iva.g70.i.h);
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void pa(com.amazon.aps.iva.nv.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "crunchylistItemUiModel");
        int i = CrunchylistActivity.m;
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        CrunchylistActivity.a.a(requireActivity, new com.amazon.aps.iva.cv.c(eVar, null));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ei().getPresenter());
    }

    @Override // com.amazon.aps.iva.lv.v
    public final void x0() {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsErrorContainer");
        com.amazon.aps.iva.k60.a.b(frameLayout);
    }
}
