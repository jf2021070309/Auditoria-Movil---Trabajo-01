package com.amazon.aps.iva.yu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: AddToCrunchylistFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/amazon/aps/iva/yu/e;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/yu/u;", "<init>", "()V", "a", "crunchylists_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.e implements u {
    public final com.amazon.aps.iva.xw.s c;
    public final FragmentViewBindingDelegate d;
    public final com.amazon.aps.iva.kb0.m e;
    public final LifecycleAwareLazy f;
    public final C0899e g;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {defpackage.e.b(e.class, "input", "getInput()Lcom/ellation/crunchyroll/crunchylists/addtocrunchylistbutton/AddToCrunchylistInput;", 0), com.amazon.aps.iva.k.q.a(e.class, "binding", "getBinding()Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentAddToCrunchylistBinding;", 0)};
    public static final a h = new a();

    /* compiled from: AddToCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: AddToCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.ov.b> {
        public static final b b = new b();

        public b() {
            super(1, com.amazon.aps.iva.ov.b.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/crunchylists/databinding/FragmentAddToCrunchylistBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.ov.b invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.crunchylists_bottom_fade_effect;
            FrameLayout frameLayout = (FrameLayout) z.u(R.id.crunchylists_bottom_fade_effect, view2);
            if (frameLayout != null) {
                i = R.id.crunchylists_create_list_button;
                TextView textView = (TextView) z.u(R.id.crunchylists_create_list_button, view2);
                if (textView != null) {
                    i = R.id.crunchylists_empty_layout;
                    View u = z.u(R.id.crunchylists_empty_layout, view2);
                    if (u != null) {
                        TextView textView2 = (TextView) z.u(R.id.empty_crunchylists_create_list_button, u);
                        if (textView2 != null) {
                            com.amazon.aps.iva.pu.f fVar = new com.amazon.aps.iva.pu.f((LinearLayout) u, textView2);
                            i = R.id.crunchylists_error_container;
                            FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.crunchylists_error_container, view2);
                            if (frameLayout2 != null) {
                                i = R.id.crunchylists_manage_toolbar;
                                View u2 = z.u(R.id.crunchylists_manage_toolbar, view2);
                                if (u2 != null) {
                                    int i2 = R.id.crunchylists_lists_count;
                                    TextView textView3 = (TextView) z.u(R.id.crunchylists_lists_count, u2);
                                    if (textView3 != null) {
                                        i2 = R.id.crunchylists_manage_button;
                                        TextView textView4 = (TextView) z.u(R.id.crunchylists_manage_button, u2);
                                        if (textView4 != null) {
                                            com.amazon.aps.iva.ov.g gVar = new com.amazon.aps.iva.ov.g((ConstraintLayout) u2, textView3, textView4);
                                            int i3 = R.id.crunchylists_progress;
                                            FrameLayout frameLayout3 = (FrameLayout) z.u(R.id.crunchylists_progress, view2);
                                            if (frameLayout3 != null) {
                                                i3 = R.id.crunchylists_recycler_view;
                                                RecyclerView recyclerView = (RecyclerView) z.u(R.id.crunchylists_recycler_view, view2);
                                                if (recyclerView != null) {
                                                    i3 = R.id.toolbar;
                                                    View u3 = z.u(R.id.toolbar, view2);
                                                    if (u3 != null) {
                                                        return new com.amazon.aps.iva.ov.b((ConstraintLayout) view2, frameLayout, textView, fVar, frameLayout2, gVar, frameLayout3, recyclerView, com.amazon.aps.iva.uu.a.a(u3));
                                                    }
                                                }
                                            }
                                            i = i3;
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(u2.getResources().getResourceName(i2)));
                                }
                            }
                        } else {
                            throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(R.id.empty_crunchylists_create_list_button)));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: AddToCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.zu.a> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.zu.a invoke() {
            return new com.amazon.aps.iva.zu.a(new f(e.this));
        }
    }

    /* compiled from: AddToCrunchylistFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<j> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final j invoke() {
            a aVar = e.h;
            e eVar = e.this;
            eVar.getClass();
            return new k(eVar, (com.amazon.aps.iva.bv.d) eVar.c.getValue(eVar, e.i[0]));
        }
    }

    /* compiled from: AddToCrunchylistFragment.kt */
    /* renamed from: com.amazon.aps.iva.yu.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0899e extends RecyclerView.u {
        public C0899e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            a aVar = e.h;
            e eVar = e.this;
            l presenter = eVar.ei().getPresenter();
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            presenter.o3(((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition(), ((com.amazon.aps.iva.zu.a) eVar.f.getValue()).getItemCount());
        }
    }

    public e() {
        super(R.layout.fragment_add_to_crunchylist);
        this.c = new com.amazon.aps.iva.xw.s("input");
        this.d = com.amazon.aps.iva.a60.b.A(this, b.b);
        this.e = com.amazon.aps.iva.kb0.f.b(new d());
        this.f = com.amazon.aps.iva.aq.j.F(this, new c());
        this.g = new C0899e();
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void B4() {
        RecyclerView recyclerView = di().h;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistsRecyclerView");
        t0.j(recyclerView, null, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.add_to_crunchylists_list_padding_top)), null, null, 13);
        ConstraintLayout constraintLayout = di().f.a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsManageToolbar.root");
        constraintLayout.setVisibility(8);
        TextView textView = di().c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsCreateListButton");
        textView.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void E6() {
        FrameLayout frameLayout = di().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsBottomFadeEffect");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void F(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        androidx.fragment.app.h activity = getActivity();
        com.amazon.aps.iva.yb0.j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.CrunchylistsMessagingView");
        ((com.amazon.aps.iva.xu.g) activity).showSnackbar(iVar);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void Ih() {
        androidx.fragment.app.h activity = getActivity();
        com.amazon.aps.iva.yb0.j.d(activity, "null cannot be cast to non-null type com.ellation.crunchyroll.crunchylists.CrunchylistsNavigationView");
        com.amazon.aps.iva.fc0.l<?> lVar = i[0];
        Intent putExtra = new Intent().putExtra("add_to_crunchylist_input_extras", (com.amazon.aps.iva.bv.d) this.c.getValue(this, lVar));
        com.amazon.aps.iva.yb0.j.e(putExtra, "intent.putExtra(ADD_TO_C…YLIST_INPUT_EXTRAS, this)");
        ((com.amazon.aps.iva.xu.h) activity).U2(putExtra);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void J6() {
        FrameLayout frameLayout = di().b;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsBottomFadeEffect");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void T1(List<? extends com.amazon.aps.iva.nv.b> list) {
        com.amazon.aps.iva.yb0.j.f(list, "crunchylists");
        ((com.amazon.aps.iva.zu.a) this.f.getValue()).e(list);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void d1(int i2, int i3) {
        String string = getString(R.string.crunchylists_list_items_count, Integer.valueOf(i2), Integer.valueOf(i3));
        com.amazon.aps.iva.yb0.j.e(string, "getString(\n            R…  maxListsCount\n        )");
        di().f.b.setText(string);
    }

    public final com.amazon.aps.iva.ov.b di() {
        return (com.amazon.aps.iva.ov.b) this.d.getValue(this, i[1]);
    }

    public final j ei() {
        return (j) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void h() {
        LinearLayout linearLayout = (LinearLayout) di().d.c;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.crunchylistsEmptyLayout.root");
        linearLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void i() {
        LinearLayout linearLayout = (LinearLayout) di().d.c;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.crunchylistsEmptyLayout.root");
        linearLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void j() {
        FrameLayout frameLayout = di().g;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void k0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsErrorContainer");
        com.amazon.aps.iva.k60.a.d(frameLayout, aVar, null, 0, 0, com.amazon.aps.iva.ao.a.u, com.amazon.aps.iva.ao.a.v, 158);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void o() {
        FrameLayout frameLayout = di().g;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        di().i.b.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 10));
        di().i.c.setText(getString(R.string.crunchylists_add_to_crunchylist));
        di().c.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 12));
        ((TextView) di().d.b).setOnClickListener(new com.amazon.aps.iva.c8.h(this, 13));
        di().f.c.setOnClickListener(new com.amazon.aps.iva.fe.a(this, 7));
        di().h.setAdapter((com.amazon.aps.iva.zu.a) this.f.getValue());
        di().h.addItemDecoration(new com.amazon.aps.iva.zu.b());
        di().h.addOnScrollListener(this.g);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(ei().getPresenter());
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void wh() {
        RecyclerView recyclerView = di().h;
        com.amazon.aps.iva.yb0.j.e(recyclerView, "binding.crunchylistsRecyclerView");
        t0.j(recyclerView, null, Integer.valueOf(getResources().getDimensionPixelOffset(R.dimen.crunchylists_list_with_manage_toolbar_padding_top)), null, null, 13);
        ConstraintLayout constraintLayout = di().f.a;
        com.amazon.aps.iva.yb0.j.e(constraintLayout, "binding.crunchylistsManageToolbar.root");
        constraintLayout.setVisibility(0);
        TextView textView = di().c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.crunchylistsCreateListButton");
        textView.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.yu.u
    public final void x0() {
        FrameLayout frameLayout = di().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.crunchylistsErrorContainer");
        com.amazon.aps.iva.k60.a.b(frameLayout);
    }
}
