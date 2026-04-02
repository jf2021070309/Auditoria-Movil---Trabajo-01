package com.amazon.aps.iva.i10;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.d10.c0;
import com.amazon.aps.iva.d10.d0;
import com.amazon.aps.iva.d10.u;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.gn.c;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.t;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.presentation.downloads.activity.DownloadsActivity;
import com.ellation.crunchyroll.presentation.downloads.empty.DownloadsEmptyLayout;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: DownloadsFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/aps/iva/i10/a;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/i10/l;", "Lcom/amazon/aps/iva/g10/g;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/w70/i;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.e implements com.amazon.aps.iva.i10.l, com.amazon.aps.iva.g10.g, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.w70.i, com.amazon.aps.iva.us.a {
    public final com.amazon.aps.iva.ls.a c;
    public final s d;
    public final v e;
    public final v f;
    public final v g;
    public final v h;
    public final v i;
    public final v j;
    public final v k;
    public final v l;
    public final v m;
    public final v n;
    public final com.amazon.aps.iva.ws.f o;
    public final LifecycleAwareLazy p;
    public GridLayoutManager q;
    public final com.amazon.aps.iva.kb0.m r;
    public final com.amazon.aps.iva.kb0.m s;
    public final com.amazon.aps.iva.kb0.m t;
    public final com.amazon.aps.iva.kb0.m u;
    public final int v;
    public final int w;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] y = {defpackage.e.b(a.class, "isOffline", "isOffline()Z", 0), com.amazon.aps.iva.k.q.a(a.class, "recycleView", "getRecycleView()Landroidx/recyclerview/widget/RecyclerView;", 0), com.amazon.aps.iva.k.q.a(a.class, "progress", "getProgress()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(a.class, "emptyLayout", "getEmptyLayout()Lcom/ellation/crunchyroll/presentation/downloads/empty/DownloadsEmptyLayout;", 0), com.amazon.aps.iva.k.q.a(a.class, "downloadsManageContainer", "getDownloadsManageContainer()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(a.class, "toggleSelectAllButton", "getToggleSelectAllButton()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "manageButton", "getManageButton()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "removeContainer", "getRemoveContainer()Landroid/view/ViewGroup;", 0), com.amazon.aps.iva.k.q.a(a.class, "selectedDownloadsCount", "getSelectedDownloadsCount()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(a.class, "removeButton", "getRemoveButton()Landroid/view/View;", 0), com.amazon.aps.iva.k.q.a(a.class, "snackbarContainer", "getSnackbarContainer()Landroid/view/ViewGroup;", 0)};
    public static final C0349a x = new C0349a();

    /* compiled from: DownloadsFragment.kt */
    /* renamed from: com.amazon.aps.iva.i10.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0349a {
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.f10.e> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.f10.e invoke() {
            C0349a c0349a = a.x;
            a aVar = a.this;
            com.amazon.aps.iva.f10.l lVar = new com.amazon.aps.iva.f10.l(new com.amazon.aps.iva.i10.b((com.amazon.aps.iva.i10.f) aVar.s.getValue()), new com.amazon.aps.iva.i10.c((com.amazon.aps.iva.gn.c) aVar.u.getValue()), new com.amazon.aps.iva.i10.d(aVar.ei()));
            com.amazon.aps.iva.g10.d ei = aVar.ei();
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                com.amazon.aps.iva.zv.e f = bVar.f();
                Context context = aVar.getContext();
                com.amazon.aps.iva.yb0.j.d(context, "null cannot be cast to non-null type android.app.Activity");
                com.amazon.aps.iva.gx.c a = f.a((Activity) context);
                com.amazon.aps.iva.ws.f fVar = aVar.o;
                com.amazon.aps.iva.yb0.j.f(fVar, "panelAnalytics");
                com.amazon.aps.iva.yb0.j.f(a, "showPageRouter");
                return new com.amazon.aps.iva.f10.e(lVar, ei, new com.amazon.aps.iva.f10.g(fVar, a));
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.h10.c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.h10.c cVar) {
            super(0);
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            DownloadsEmptyLayout downloadsEmptyLayout = (DownloadsEmptyLayout) aVar.g.getValue(aVar, a.y[3]);
            com.amazon.aps.iva.kb0.m mVar = aVar.r;
            com.amazon.aps.iva.k50.a b = ((u) mVar.getValue()).b();
            com.amazon.aps.iva.xh.b a = ((u) mVar.getValue()).a();
            downloadsEmptyLayout.getClass();
            com.amazon.aps.iva.h10.c cVar = this.i;
            com.amazon.aps.iva.yb0.j.f(cVar, "state");
            com.amazon.aps.iva.yb0.j.f(b, "browseRouter");
            com.amazon.aps.iva.yb0.j.f(a, "upgradeFlowRouter");
            com.amazon.aps.iva.ls.a aVar2 = com.amazon.aps.iva.ls.a.DOWNLOADS;
            com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                final com.amazon.aps.iva.zv.a F = bVar.F();
                t tVar = new t(F) { // from class: com.amazon.aps.iva.h10.a
                    @Override // com.amazon.aps.iva.yb0.t, com.amazon.aps.iva.fc0.m
                    public final Object get() {
                        return Boolean.valueOf(((com.amazon.aps.iva.zv.a) this.receiver).getHasPremiumBenefit());
                    }
                };
                com.amazon.aps.iva.yb0.j.f(aVar2, "screen");
                com.amazon.aps.iva.us.v vVar = new com.amazon.aps.iva.us.v(cVar2, aVar2, tVar);
                com.amazon.aps.iva.zv.b bVar2 = com.amazon.aps.iva.sv.e.e;
                if (bVar2 != null) {
                    com.amazon.aps.iva.rh.a g = bVar2.g();
                    com.amazon.aps.iva.yb0.j.f(g, "upgradeMessageProvider");
                    com.amazon.aps.iva.h10.b bVar3 = new com.amazon.aps.iva.h10.b(b, a, vVar, g, downloadsEmptyLayout);
                    downloadsEmptyLayout.h = bVar3;
                    bVar3.q6(cVar);
                    return com.amazon.aps.iva.kb0.q.a;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            C0349a c0349a = a.x;
            a.this.di().e(z.b);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.i10.f> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.i10.f invoke() {
            return ((u) a.this.r.getValue()).c();
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.g10.d> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.g10.d invoke() {
            return ((u) a.this.r.getValue()).d();
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            ((DownloadsEmptyLayout) aVar.g.getValue(aVar, a.y[3])).setVisibility(8);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            ((View) aVar.f.getValue(aVar, a.y[2])).setVisibility(8);
            aVar.fi().setVisibility(0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<u> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final u invoke() {
            a aVar = a.this;
            androidx.fragment.app.h requireActivity = aVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            return new c0(requireActivity, aVar, aVar, ((Boolean) aVar.d.getValue(aVar, a.y[0])).booleanValue());
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final j h = new j();

        public j() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            com.amazon.aps.iva.yb0.j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.amazon.aps.iva.i10.e.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class k extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public k(com.amazon.aps.iva.i10.f fVar) {
            super(0, fVar, com.amazon.aps.iva.i10.f.class, "onBenefitsUpdated", "onBenefitsUpdated()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((com.amazon.aps.iva.i10.f) this.receiver).L1();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.gn.c> {
        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.gn.c invoke() {
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                return c.a.a(a.this, bVar.d());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public m() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            ((DownloadsEmptyLayout) aVar.g.getValue(aVar, a.y[3])).setVisibility(0);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            a aVar = a.this;
            ((View) aVar.f.getValue(aVar, a.y[2])).setVisibility(0);
            aVar.fi().setVisibility(8);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public o() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsActivity downloadsActivity;
            androidx.fragment.app.h activity = a.this.getActivity();
            if (activity instanceof DownloadsActivity) {
                downloadsActivity = (DownloadsActivity) activity;
            } else {
                downloadsActivity = null;
            }
            if (downloadsActivity != null) {
                downloadsActivity.U0();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public p() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            DownloadsActivity downloadsActivity;
            androidx.fragment.app.h activity = a.this.getActivity();
            if (activity instanceof DownloadsActivity) {
                downloadsActivity = (DownloadsActivity) activity;
            } else {
                downloadsActivity = null;
            }
            if (downloadsActivity != null) {
                downloadsActivity.W0();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<com.amazon.aps.iva.d10.i> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<com.amazon.aps.iva.d10.i> list) {
            super(0);
            this.i = list;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            C0349a c0349a = a.x;
            a.this.di().e(this.i);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public a() {
        super(0);
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.DOWNLOADS;
        this.c = aVar;
        this.d = new s("is_offline");
        this.e = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_recycler_view);
        this.f = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_progress);
        this.g = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_empty_layout);
        this.h = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_manage_container);
        this.i = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_toggle_select_all_button);
        this.j = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_manage_button);
        this.k = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_remove_container);
        this.l = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_selected_count);
        this.m = com.amazon.aps.iva.xw.g.f(this, R.id.downloads_remove_button);
        this.n = com.amazon.aps.iva.xw.g.f(this, R.id.snackbar_container);
        this.o = d.a.a(aVar);
        this.p = com.amazon.aps.iva.aq.j.F(this, new b());
        this.r = com.amazon.aps.iva.kb0.f.b(new i());
        this.s = com.amazon.aps.iva.kb0.f.b(new e());
        this.t = com.amazon.aps.iva.kb0.f.b(new f());
        this.u = com.amazon.aps.iva.kb0.f.b(new l());
        this.v = R.string.offline;
        this.w = R.drawable.ic_crown;
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void B7() {
        hi().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void Bb() {
        com.amazon.aps.iva.xw.t.b(this, new d());
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int G() {
        return this.w;
    }

    @Override // com.amazon.aps.iva.w70.i
    public final int H6() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void H8() {
        ii().setText(R.string.select_all);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void I7() {
        ii().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void L9() {
        com.amazon.aps.iva.xw.t.b(this, new o());
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        androidx.fragment.app.h requireActivity = requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
        startActivity(com.amazon.aps.iva.gd0.j.i(requireActivity, str));
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void V7() {
        com.amazon.aps.iva.xw.t.b(this, new p());
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void Va() {
        GridLayoutManager gridLayoutManager = this.q;
        if (gridLayoutManager != null) {
            gridLayoutManager.g(getResources().getInteger(R.integer.panel_card_number_of_columns));
        } else {
            com.amazon.aps.iva.yb0.j.m("layoutManager");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void X4() {
        ((ViewGroup) this.k.getValue(this, y[7])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void a() {
        com.amazon.aps.iva.xw.t.b(this, new n());
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void ai() {
        ii().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void b() {
        com.amazon.aps.iva.xw.t.b(this, new h());
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.c;
    }

    public final com.amazon.aps.iva.f10.e di() {
        return (com.amazon.aps.iva.f10.e) this.p.getValue();
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void eg(com.amazon.aps.iva.h10.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "state");
        com.amazon.aps.iva.xw.t.b(this, new c(cVar));
    }

    public final com.amazon.aps.iva.g10.d ei() {
        return (com.amazon.aps.iva.g10.d) this.t.getValue();
    }

    public final RecyclerView fi() {
        return (RecyclerView) this.e.getValue(this, y[1]);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void g4() {
        gi().setEnabled(false);
    }

    public final View gi() {
        return (View) this.m.getValue(this, y[9]);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void h() {
        com.amazon.aps.iva.xw.t.b(this, new m());
    }

    public final TextView hi() {
        return (TextView) this.l.getValue(this, y[8]);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void i() {
        com.amazon.aps.iva.xw.t.b(this, new g());
    }

    public final TextView ii() {
        return (TextView) this.i.getValue(this, y[5]);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void lf() {
        ii().setText(R.string.deselect_all);
    }

    @Override // com.amazon.aps.iva.i10.l
    public final void nc(List<com.amazon.aps.iva.d10.i> list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        com.amazon.aps.iva.xw.t.b(this, new q(list));
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void o3() {
        ((ViewGroup) this.k.getValue(this, y[7])).setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_downloads, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ii().setOnClickListener(new com.amazon.aps.iva.c8.f(this, 15));
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = y;
        ((TextView) this.j.getValue(this, lVarArr[6])).setOnClickListener(new com.amazon.aps.iva.ne.a(this, 16));
        gi().setOnClickListener(new com.amazon.aps.iva.c8.h(this, 15));
        fi().setItemAnimator(null);
        this.q = new GridLayoutManager(getContext(), getResources().getInteger(R.integer.panel_card_number_of_columns), 0);
        RecyclerView fi = fi();
        GridLayoutManager gridLayoutManager = this.q;
        if (gridLayoutManager != null) {
            fi.setLayoutManager(gridLayoutManager);
            fi().addItemDecoration(new d0());
            fi().setAdapter(di());
            f1.i((ViewGroup) this.k.getValue(this, lVarArr[7]), j.h);
            com.amazon.aps.iva.zv.b bVar = com.amazon.aps.iva.sv.e.e;
            if (bVar != null) {
                bVar.e().a(this, new k((com.amazon.aps.iva.i10.f) this.s.getValue()));
                return;
            } else {
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.m("layoutManager");
        throw null;
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void qf() {
        ((ViewGroup) this.h.getValue(this, y[4])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void r4() {
        ((TextView) this.j.getValue(this, y[6])).setText(R.string.manage_downloads);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void r8() {
        ((TextView) this.j.getValue(this, y[6])).setText(R.string.cancel_downloads);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(ei(), (com.amazon.aps.iva.i10.f) this.s.getValue(), (com.amazon.aps.iva.gn.c) this.u.getValue());
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void u() {
        com.amazon.aps.iva.f10.e di = di();
        di.e = false;
        di.notifyDataSetChanged();
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void u3(int i2) {
        int i3 = com.amazon.aps.iva.u70.h.a;
        com.amazon.aps.iva.fc0.l<?> lVar = y[10];
        String quantityString = getResources().getQuantityString(R.plurals.downloads_removed_success, i2, Integer.valueOf(i2));
        com.amazon.aps.iva.yb0.j.e(quantityString, "resources.getQuantityStr…msCount\n                )");
        h.a.a((ViewGroup) this.n.getValue(this, lVar), new com.amazon.aps.iva.g10.a(quantityString));
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void v5() {
        gi().setEnabled(true);
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void w9(int i2) {
        hi().setVisibility(0);
        hi().setText(getResources().getQuantityString(R.plurals.downloads_selected_plural, i2, Integer.valueOf(i2)));
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void z() {
        com.amazon.aps.iva.f10.e di = di();
        di.e = true;
        di.notifyDataSetChanged();
    }

    @Override // com.amazon.aps.iva.g10.g
    public final void z4() {
        ((ViewGroup) this.h.getValue(this, y[4])).setVisibility(0);
    }
}
