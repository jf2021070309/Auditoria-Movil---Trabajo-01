package com.amazon.aps.iva.vt;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ku.e;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.vt.b;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yt.a;
import com.crunchyroll.connectivity.ConnectionErrorBottomMessageLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
import com.ellation.crunchyroll.commenting.comments.pendingstate.banner.PendingStateBannerLayout;
import com.ellation.crunchyroll.commenting.commentscount.CommentsCountLayout;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.widgets.CrunchyrollSwipeRefreshLayout;
import com.ellation.widgets.overflow.OverflowButton;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CommentsFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/aps/iva/vt/b;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/vt/r;", "Lcom/amazon/aps/iva/hu/f;", "Lcom/amazon/aps/iva/mu/e;", "Lcom/amazon/aps/iva/wt/o;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.e implements r, com.amazon.aps.iva.hu.f, com.amazon.aps.iva.mu.e, com.amazon.aps.iva.wt.o, com.amazon.aps.iva.us.a {
    public final FragmentViewBindingDelegate c;
    public final com.amazon.aps.iva.ls.a d;
    public final com.amazon.aps.iva.xw.s e;
    public final com.amazon.aps.iva.xw.s f;
    public final com.amazon.aps.iva.kb0.m g;
    public final com.amazon.aps.iva.au.f h;
    public final LifecycleAwareLazy i;
    public final LifecycleAwareLazy j;
    public final LifecycleAwareLazy k;
    public final LifecycleAwareLazy l;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] n = {com.amazon.aps.iva.k.q.a(b.class, "binding", "getBinding()Lcom/ellation/crunchyroll/commenting/databinding/FragmentCommentsBinding;", 0), defpackage.e.b(b.class, "containerViewId", "getContainerViewId()I", 0), defpackage.e.b(b.class, "input", "getInput()Lcom/ellation/crunchyroll/commenting/comments/CommentsInput;", 0)};
    public static final a m = new a();

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CommentsFragment.kt */
    /* renamed from: com.amazon.aps.iva.vt.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0807b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.recyclerview.widget.f> {
        public C0807b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.recyclerview.widget.f invoke() {
            boolean z = f.a.c.a;
            f.a aVar = new f.a(false, f.a.EnumC0056a.SHARED_STABLE_IDS);
            a aVar2 = b.m;
            b bVar = b.this;
            return new androidx.recyclerview.widget.f(aVar, (com.amazon.aps.iva.hu.b) bVar.i.getValue(), (com.amazon.aps.iva.au.d) bVar.j.getValue());
        }
    }

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.pu.c> {
        public static final c b = new c();

        public c() {
            super(1, com.amazon.aps.iva.pu.c.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/commenting/databinding/FragmentCommentsBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pu.c invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.comment_input_container;
            View u = z.u(R.id.comment_input_container, view2);
            if (u != null) {
                int i2 = R.id.comment_input_connection_error_layout;
                ConnectionErrorBottomMessageLayout connectionErrorBottomMessageLayout = (ConnectionErrorBottomMessageLayout) z.u(R.id.comment_input_connection_error_layout, u);
                if (connectionErrorBottomMessageLayout != null) {
                    i2 = R.id.comment_input_view;
                    CommentsInputLayout commentsInputLayout = (CommentsInputLayout) z.u(R.id.comment_input_view, u);
                    if (commentsInputLayout != null) {
                        i2 = R.id.message_layout_container;
                        FrameLayout frameLayout = (FrameLayout) z.u(R.id.message_layout_container, u);
                        if (frameLayout != null) {
                            com.amazon.aps.iva.pu.l lVar = new com.amazon.aps.iva.pu.l((LinearLayout) u, connectionErrorBottomMessageLayout, commentsInputLayout, frameLayout, 0);
                            i = R.id.comments_account_pending_banner;
                            PendingStateBannerLayout pendingStateBannerLayout = (PendingStateBannerLayout) z.u(R.id.comments_account_pending_banner, view2);
                            if (pendingStateBannerLayout != null) {
                                i = R.id.comments_content;
                                FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.comments_content, view2);
                                if (frameLayout2 != null) {
                                    i = R.id.comments_progress;
                                    FrameLayout frameLayout3 = (FrameLayout) z.u(R.id.comments_progress, view2);
                                    if (frameLayout3 != null) {
                                        i = R.id.comments_recycler_view;
                                        RecyclerView recyclerView = (RecyclerView) z.u(R.id.comments_recycler_view, view2);
                                        if (recyclerView != null) {
                                            i = R.id.comments_swipe_to_refresh;
                                            CrunchyrollSwipeRefreshLayout crunchyrollSwipeRefreshLayout = (CrunchyrollSwipeRefreshLayout) z.u(R.id.comments_swipe_to_refresh, view2);
                                            if (crunchyrollSwipeRefreshLayout != null) {
                                                i = R.id.comments_toolbar;
                                                View u2 = z.u(R.id.comments_toolbar, view2);
                                                if (u2 != null) {
                                                    int i3 = R.id.comments_back;
                                                    ImageView imageView = (ImageView) z.u(R.id.comments_back, u2);
                                                    if (imageView != null) {
                                                        i3 = R.id.comments_count;
                                                        CommentsCountLayout commentsCountLayout = (CommentsCountLayout) z.u(R.id.comments_count, u2);
                                                        if (commentsCountLayout != null) {
                                                            i3 = R.id.sort_button;
                                                            OverflowButton overflowButton = (OverflowButton) z.u(R.id.sort_button, u2);
                                                            if (overflowButton != null) {
                                                                return new com.amazon.aps.iva.pu.c((RelativeLayout) view2, lVar, pendingStateBannerLayout, frameLayout2, frameLayout3, recyclerView, crunchyrollSwipeRefreshLayout, new com.amazon.aps.iva.pu.k((LinearLayout) u2, imageView, commentsCountLayout, overflowButton, 0));
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("Missing required view with ID: ".concat(u2.getResources().getResourceName(i3)));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.au.d> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.au.d invoke() {
            a aVar = b.m;
            b bVar = b.this;
            com.amazon.aps.iva.au.d dVar = new com.amazon.aps.iva.au.d(bVar.hi().a(), bVar.h);
            dVar.setHasStableIds(true);
            return dVar;
        }
    }

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.m70.b> {
        public static final e h = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.m70.b invoke() {
            com.amazon.aps.iva.m70.b bVar = new com.amazon.aps.iva.m70.b();
            bVar.setHasStableIds(true);
            return bVar;
        }
    }

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hu.b> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hu.b invoke() {
            a aVar = b.m;
            b bVar = b.this;
            com.amazon.aps.iva.hu.b bVar2 = new com.amazon.aps.iva.hu.b(bVar.hi().b(), bVar.h);
            bVar2.setHasStableIds(true);
            return bVar2;
        }
    }

    /* compiled from: CommentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            int i = i.a;
            b bVar = b.this;
            String str = bVar.fi().b;
            com.amazon.aps.iva.yb0.j.f(str, "assetId");
            com.amazon.aps.iva.ut.b bVar2 = com.amazon.aps.iva.ut.c.f;
            if (bVar2 != null) {
                return new j(bVar, str, bVar2.getTalkboxService());
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public b() {
        super(R.layout.fragment_comments);
        this.c = com.amazon.aps.iva.a60.b.A(this, c.b);
        this.d = com.amazon.aps.iva.ls.a.COMMENTS;
        this.e = new com.amazon.aps.iva.xw.s("container_id");
        this.f = new com.amazon.aps.iva.xw.s("input");
        this.g = com.amazon.aps.iva.kb0.f.b(new g());
        this.h = new com.amazon.aps.iva.au.f(12001);
        this.i = com.amazon.aps.iva.aq.j.F(this, new f());
        this.j = com.amazon.aps.iva.aq.j.F(this, new d());
        this.k = com.amazon.aps.iva.aq.j.F(this, e.h);
        this.l = com.amazon.aps.iva.aq.j.F(this, new C0807b());
    }

    @Override // com.amazon.aps.iva.vt.r
    @SuppressLint({"NotifyDataSetChanged"})
    public final void F0() {
        ei().f.invalidateItemDecorations();
        di().notifyDataSetChanged();
        ii();
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void J0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onRetry");
        di().d(gi());
        gi().d(new a.b(R.string.commenting_comments_error_other_text, aVar));
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void P1() {
        e.a aVar = com.amazon.aps.iva.ku.e.i;
        com.amazon.aps.iva.vt.c fi = fi();
        a.C0898a c0898a = new a.C0898a(0);
        aVar.getClass();
        com.amazon.aps.iva.ku.e a2 = e.a.a(fi.b, "comments", c0898a, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(parentFragmentManager);
        aVar2.c("post_comment");
        a2.show(aVar2, "post_comment");
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void V() {
        di().f(gi());
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void W1(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar) {
        hi().f().X5();
        ((com.amazon.aps.iva.au.d) this.j.getValue()).e(hVar);
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void Xb(com.amazon.aps.iva.du.x xVar) {
        hi().getPresenter().O0(xVar);
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void Y() {
        di().d(gi());
        gi().d(a.c.a);
    }

    @Override // com.amazon.aps.iva.wt.o
    public final void a() {
        FrameLayout frameLayout = ei().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentsProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void a4(int i, List list) {
        ((OverflowButton) ei().h.e).G(list, Integer.valueOf((int) R.style.PopupActionMenuStyle), Integer.valueOf(i), Integer.valueOf((int) R.color.primary), Integer.valueOf((int) R.color.color_white));
    }

    @Override // com.amazon.aps.iva.wt.o
    public final void b() {
        FrameLayout frameLayout = ei().e;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentsProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void close() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        parentFragmentManager.v(new FragmentManager.q("comments", -1, 1), false);
    }

    public final androidx.recyclerview.widget.f di() {
        return (androidx.recyclerview.widget.f) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void e1(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        di().d(gi());
        gi().d(new a.b(R.string.commenting_comments_error_text, aVar));
    }

    public final com.amazon.aps.iva.pu.c ei() {
        return (com.amazon.aps.iva.pu.c) this.c.getValue(this, n[0]);
    }

    public final com.amazon.aps.iva.vt.c fi() {
        return (com.amazon.aps.iva.vt.c) this.f.getValue(this, n[2]);
    }

    public final com.amazon.aps.iva.m70.b gi() {
        return (com.amazon.aps.iva.m70.b) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void h() {
        di().d(gi());
        gi().d(new a.C0505a(R.string.commenting_comments_empty_state_header_text, R.string.commenting_comments_empty_state_subheader_text));
        OverflowButton overflowButton = (OverflowButton) ei().h.e;
        com.amazon.aps.iva.yb0.j.e(overflowButton, "binding.commentsToolbar.sortButton");
        overflowButton.setEnabled(false);
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void hb() {
        ei().f.smoothScrollToPosition(0);
    }

    public final i hi() {
        return (i) this.g.getValue();
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void i() {
        di().f(gi());
        OverflowButton overflowButton = (OverflowButton) ei().h.e;
        com.amazon.aps.iva.yb0.j.e(overflowButton, "binding.commentsToolbar.sortButton");
        overflowButton.setEnabled(true);
    }

    @Override // com.amazon.aps.iva.mu.e, com.amazon.aps.iva.wt.o
    public final void i1(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        hi().getPresenter().o(xVar);
        hi().f().o(xVar);
    }

    public final void ii() {
        LinearLayout linearLayout = (LinearLayout) ei().h.b;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.commentsToolbar.root");
        t0.j(linearLayout, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comments_toolbar_padding_horizontal)), null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comments_toolbar_padding_horizontal)), null, 10);
    }

    @Override // com.amazon.aps.iva.vt.r
    public final com.amazon.aps.iva.m70.a j1() {
        return gi().a;
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void n2(com.amazon.aps.iva.ez.g<Integer> gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "commentsCount");
        ((CommentsCountLayout) ei().h.d).b1(gVar);
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void o2() {
        ei().g.setRefreshing(false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ((ImageView) ei().h.c).setOnClickListener(new com.amazon.aps.iva.c8.k(this, 9));
        hi().getPresenter().Y5();
        ei().f.addItemDecoration(new com.amazon.aps.iva.zt.b());
        ei().f.addItemDecoration(new com.amazon.aps.iva.gu.a());
        ei().f.setAdapter(di());
        ei().f.setLayoutManager(new LinearLayoutManager(getContext()));
        CommentsInputLayout commentsInputLayout = (CommentsInputLayout) ei().b.d;
        commentsInputLayout.setOnClickListener(new com.amazon.aps.iva.c8.r(this, 8));
        commentsInputLayout.getBinding().g.setFocusable(false);
        commentsInputLayout.getBinding().g.setLongClickable(false);
        commentsInputLayout.getBinding().g.setOnClickListener(new com.amazon.aps.iva.c8.s(this, 9));
        commentsInputLayout.G(new a.C0898a(0));
        ei().g.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.amazon.aps.iva.vt.a
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void onRefresh() {
                b.a aVar = b.m;
                b bVar = b.this;
                com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
                bVar.hi().getPresenter().j6(bVar.fi().b);
            }
        });
        ii();
        PendingStateBannerLayout pendingStateBannerLayout = ei().c;
        com.amazon.aps.iva.iu.a e2 = hi().e();
        com.amazon.aps.iva.lu.b g2 = hi().g();
        pendingStateBannerLayout.getClass();
        com.amazon.aps.iva.yb0.j.f(e2, "commentingPendingStateRouter");
        com.amazon.aps.iva.yb0.j.f(g2, "commentingProfileActivationRouter");
        com.amazon.aps.iva.iu.c cVar = com.amazon.aps.iva.ut.c.h;
        if (cVar != null) {
            com.amazon.aps.iva.ju.b bVar = new com.amazon.aps.iva.ju.b(pendingStateBannerLayout, cVar, e2, g2);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(bVar, pendingStateBannerLayout);
            com.amazon.aps.iva.pu.i iVar = pendingStateBannerLayout.b;
            iVar.d.setOnClickListener(new com.amazon.aps.iva.c8.r(bVar, 9));
            iVar.c.setOnClickListener(new com.amazon.aps.iva.c8.s(bVar, 11));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("pendingStateHandler");
        throw null;
    }

    @Override // com.amazon.aps.iva.vt.r
    public final com.amazon.aps.iva.hf.a s0() {
        com.amazon.aps.iva.ut.a aVar = com.amazon.aps.iva.ut.c.g;
        if (aVar != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            com.amazon.aps.iva.yb0.j.e(parentFragmentManager, "parentFragmentManager");
            return aVar.a(parentFragmentManager);
        }
        com.amazon.aps.iva.yb0.j.m("backHandlerProvider");
        throw null;
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.I(hi().getPresenter(), hi().f(), hi().c(), hi().d());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = ei().d;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentsContent");
        h.a.a(frameLayout, iVar);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        com.amazon.aps.iva.yb0.j.e(parentFragmentManager, "parentFragmentManager");
        com.amazon.aps.iva.ku.e k = com.amazon.aps.iva.ab.r.k(parentFragmentManager);
        if (k != null) {
            k.showSnackbar(iVar);
        }
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void ub(List list, com.amazon.aps.iva.hu.d dVar) {
        com.amazon.aps.iva.yb0.j.f(list, "comments");
        ((com.amazon.aps.iva.hu.b) this.i.getValue()).a.b(list, new com.amazon.aps.iva.p2.b(1, dVar));
    }

    @Override // com.amazon.aps.iva.vt.r
    public final void yb(com.amazon.aps.iva.du.x xVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(xVar, "model");
        FragmentManager parentFragmentManager = getParentFragmentManager();
        com.amazon.aps.iva.yb0.j.e(parentFragmentManager, "parentFragmentManager");
        int intValue = ((Number) this.e.getValue(this, n[1])).intValue();
        com.amazon.aps.iva.ru.c cVar = new com.amazon.aps.iva.ru.c(fi().b, xVar, z);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.d = 17498112;
        aVar.e = 17498113;
        aVar.f = 17498112;
        aVar.g = 17498113;
        com.amazon.aps.iva.ru.b.m.getClass();
        com.amazon.aps.iva.ru.b bVar = new com.amazon.aps.iva.ru.b();
        bVar.e.b(bVar, com.amazon.aps.iva.ru.b.n[1], cVar);
        aVar.d(intValue, bVar, "comment_replies", 1);
        aVar.c("comment_replies");
        aVar.h();
    }
}
