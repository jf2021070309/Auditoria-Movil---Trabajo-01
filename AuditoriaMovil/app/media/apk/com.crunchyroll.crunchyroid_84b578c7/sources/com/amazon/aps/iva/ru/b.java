package com.amazon.aps.iva.ru;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ku.e;
import com.amazon.aps.iva.m70.a;
import com.amazon.aps.iva.ru.b;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yt.a;
import com.crunchyroll.connectivity.ConnectionErrorBottomMessageLayout;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.commenting.comments.inputview.CommentsInputLayout;
import com.ellation.crunchyroll.commenting.commentscount.CommentsCountLayout;
import com.ellation.crunchyroll.mvp.lifecycle.LifecycleAwareLazy;
import com.ellation.crunchyroll.viewbinding.FragmentViewBindingDelegate;
import com.ellation.widgets.CrunchyrollSwipeRefreshLayout;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: CommentRepliesFragment.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/amazon/aps/iva/ru/b;", "Lcom/amazon/aps/iva/wy/e;", "Lcom/amazon/aps/iva/ru/b0;", "Lcom/amazon/aps/iva/mu/e;", "Lcom/amazon/aps/iva/wt/o;", "Lcom/amazon/aps/iva/hu/f;", "Lcom/amazon/aps/iva/us/a;", "<init>", "()V", "a", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.e implements b0, com.amazon.aps.iva.mu.e, com.amazon.aps.iva.wt.o, com.amazon.aps.iva.hu.f, com.amazon.aps.iva.us.a {
    public final FragmentViewBindingDelegate c;
    public final com.amazon.aps.iva.ls.a d;
    public final com.amazon.aps.iva.xw.s e;
    public final com.amazon.aps.iva.kb0.m f;
    public final LifecycleAwareLazy g;
    public final com.amazon.aps.iva.au.f h;
    public final com.amazon.aps.iva.kb0.m i;
    public final LifecycleAwareLazy j;
    public final LifecycleAwareLazy k;
    public final LifecycleAwareLazy l;
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] n = {com.amazon.aps.iva.k.q.a(b.class, "binding", "getBinding()Lcom/ellation/crunchyroll/commenting/databinding/FragmentCommentRepliesBinding;", 0), defpackage.e.b(b.class, "input", "getInput()Lcom/ellation/crunchyroll/commenting/replies/CommentRepliesInput;", 0)};
    public static final a m = new a();

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* renamed from: com.amazon.aps.iva.ru.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0684b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.recyclerview.widget.f> {
        public C0684b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.recyclerview.widget.f invoke() {
            boolean z = f.a.c.a;
            f.a aVar = new f.a(false, f.a.EnumC0056a.SHARED_STABLE_IDS);
            a aVar2 = b.m;
            b bVar = b.this;
            return new androidx.recyclerview.widget.f(aVar, (t) bVar.j.getValue(), (com.amazon.aps.iva.hu.b) bVar.l.getValue(), (com.amazon.aps.iva.au.d) bVar.i.getValue());
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<View, com.amazon.aps.iva.pu.b> {
        public static final c b = new c();

        public c() {
            super(1, com.amazon.aps.iva.pu.b.class, "bind", "bind(Landroid/view/View;)Lcom/ellation/crunchyroll/commenting/databinding/FragmentCommentRepliesBinding;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.pu.b invoke(View view) {
            View view2 = view;
            com.amazon.aps.iva.yb0.j.f(view2, "p0");
            int i = R.id.comment_input_container;
            View u = com.amazon.aps.iva.e.z.u(R.id.comment_input_container, view2);
            if (u != null) {
                int i2 = R.id.comment_input_connection_error_layout;
                ConnectionErrorBottomMessageLayout connectionErrorBottomMessageLayout = (ConnectionErrorBottomMessageLayout) com.amazon.aps.iva.e.z.u(R.id.comment_input_connection_error_layout, u);
                if (connectionErrorBottomMessageLayout != null) {
                    i2 = R.id.comment_input_view;
                    CommentsInputLayout commentsInputLayout = (CommentsInputLayout) com.amazon.aps.iva.e.z.u(R.id.comment_input_view, u);
                    if (commentsInputLayout != null) {
                        i2 = R.id.message_layout_container;
                        FrameLayout frameLayout = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.message_layout_container, u);
                        if (frameLayout != null) {
                            com.amazon.aps.iva.pe.d dVar = new com.amazon.aps.iva.pe.d((LinearLayout) u, connectionErrorBottomMessageLayout, commentsInputLayout, frameLayout);
                            i = R.id.comment_replies_content;
                            FrameLayout frameLayout2 = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.comment_replies_content, view2);
                            if (frameLayout2 != null) {
                                i = R.id.comment_replies_progress;
                                FrameLayout frameLayout3 = (FrameLayout) com.amazon.aps.iva.e.z.u(R.id.comment_replies_progress, view2);
                                if (frameLayout3 != null) {
                                    i = R.id.comment_replies_recycler_view;
                                    RecyclerView recyclerView = (RecyclerView) com.amazon.aps.iva.e.z.u(R.id.comment_replies_recycler_view, view2);
                                    if (recyclerView != null) {
                                        i = R.id.comment_replies_swipe_to_refresh;
                                        CrunchyrollSwipeRefreshLayout crunchyrollSwipeRefreshLayout = (CrunchyrollSwipeRefreshLayout) com.amazon.aps.iva.e.z.u(R.id.comment_replies_swipe_to_refresh, view2);
                                        if (crunchyrollSwipeRefreshLayout != null) {
                                            i = R.id.comments_replies_toolbar;
                                            View u2 = com.amazon.aps.iva.e.z.u(R.id.comments_replies_toolbar, view2);
                                            if (u2 != null) {
                                                int i3 = R.id.replies_back;
                                                ImageView imageView = (ImageView) com.amazon.aps.iva.e.z.u(R.id.replies_back, u2);
                                                if (imageView != null) {
                                                    i3 = R.id.replies_count;
                                                    CommentsCountLayout commentsCountLayout = (CommentsCountLayout) com.amazon.aps.iva.e.z.u(R.id.replies_count, u2);
                                                    if (commentsCountLayout != null) {
                                                        return new com.amazon.aps.iva.pu.b((ConstraintLayout) view2, dVar, frameLayout2, frameLayout3, recyclerView, crunchyrollSwipeRefreshLayout, new com.amazon.aps.iva.pu.g((LinearLayout) u2, imageView, commentsCountLayout));
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
                throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i2)));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.au.d> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.au.d invoke() {
            a aVar = b.m;
            b bVar = b.this;
            com.amazon.aps.iva.au.d dVar = new com.amazon.aps.iva.au.d(bVar.gi().a(), bVar.h);
            dVar.setHasStableIds(true);
            return dVar;
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<t> {
        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final t invoke() {
            a aVar = b.m;
            t tVar = new t(b.this.gi().e());
            tVar.setHasStableIds(true);
            return tVar;
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.m70.b> {
        public static final f h = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.m70.b invoke() {
            com.amazon.aps.iva.m70.b bVar = new com.amazon.aps.iva.m70.b();
            bVar.setHasStableIds(true);
            return bVar;
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hu.b> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hu.b invoke() {
            a aVar = b.m;
            b bVar = b.this;
            com.amazon.aps.iva.hu.b bVar2 = new com.amazon.aps.iva.hu.b(bVar.gi().b(), bVar.h);
            bVar2.setHasStableIds(true);
            return bVar2;
        }
    }

    /* compiled from: CommentRepliesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.ru.f> {
        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.ru.f invoke() {
            b bVar = b.this;
            bVar.getClass();
            com.amazon.aps.iva.ru.c cVar = (com.amazon.aps.iva.ru.c) bVar.e.getValue(bVar, b.n[1]);
            com.amazon.aps.iva.ut.b bVar2 = com.amazon.aps.iva.ut.c.f;
            if (bVar2 != null) {
                TalkboxService talkboxService = bVar2.getTalkboxService();
                com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
                return new r(talkboxService, bVar, cVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    public b() {
        super(R.layout.fragment_comment_replies);
        this.c = com.amazon.aps.iva.a60.b.A(this, c.b);
        this.d = com.amazon.aps.iva.ls.a.REPLIES;
        this.e = new com.amazon.aps.iva.xw.s("comment_replies_input");
        this.f = com.amazon.aps.iva.kb0.f.b(new h());
        this.g = com.amazon.aps.iva.aq.j.F(this, f.h);
        this.h = new com.amazon.aps.iva.au.f(12002);
        this.i = com.amazon.aps.iva.kb0.f.b(new d());
        this.j = com.amazon.aps.iva.aq.j.F(this, new e());
        this.k = com.amazon.aps.iva.aq.j.F(this, new C0684b());
        this.l = com.amazon.aps.iva.aq.j.F(this, new g());
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void Ed(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "parentComment");
        ((t) this.j.getValue()).e(f1.J(xVar));
    }

    @Override // com.amazon.aps.iva.ru.b0
    @SuppressLint({"NotifyDataSetChanged"})
    public final void F0() {
        ei().e.invalidateItemDecorations();
        di().notifyDataSetChanged();
        hi();
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void J0(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onRetry");
        di().d(fi());
        fi().d(new a.b(R.string.commenting_replies_error_other_text, aVar));
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void V() {
        di().f(fi());
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void W1(com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> hVar) {
        gi().f().X5();
        ((com.amazon.aps.iva.au.d) this.i.getValue()).e(hVar);
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void Xb(com.amazon.aps.iva.du.x xVar) {
        gi().getPresenter().O0(xVar);
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void Y() {
        di().d(fi());
        fi().d(a.c.a);
    }

    @Override // com.amazon.aps.iva.wt.o
    public final void a() {
        FrameLayout frameLayout = ei().d;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentRepliesProgress");
        frameLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.wt.o
    public final void b() {
        FrameLayout frameLayout = ei().d;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentRepliesProgress");
        frameLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void close() {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        parentFragmentManager.v(new FragmentManager.q("comment_replies", -1, 1), false);
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void de(com.amazon.aps.iva.ez.g<Integer> gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "repliesCount");
        ei().g.c.b1(gVar);
    }

    public final androidx.recyclerview.widget.f di() {
        return (androidx.recyclerview.widget.f) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void e1(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        di().d(fi());
        fi().d(new a.b(R.string.commenting_replies_error_text, aVar));
    }

    public final com.amazon.aps.iva.pu.b ei() {
        return (com.amazon.aps.iva.pu.b) this.c.getValue(this, n[0]);
    }

    public final com.amazon.aps.iva.m70.b fi() {
        return (com.amazon.aps.iva.m70.b) this.g.getValue();
    }

    public final com.amazon.aps.iva.ru.f gi() {
        return (com.amazon.aps.iva.ru.f) this.f.getValue();
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void h() {
        di().d(fi());
        fi().d(new a.C0505a(R.string.commenting_replies_empty_state_header_text, R.string.commenting_replies_empty_state_subheader_text));
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void hb() {
        ei().e.smoothScrollToPosition(1);
    }

    public final void hi() {
        LinearLayout linearLayout = ei().g.a;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.commentsRepliesToolbar.root");
        t0.j(linearLayout, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comments_toolbar_padding_horizontal)), null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.comments_toolbar_padding_horizontal)), null, 10);
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void i() {
        di().f(fi());
    }

    @Override // com.amazon.aps.iva.mu.e, com.amazon.aps.iva.wt.o
    public final void i1(com.amazon.aps.iva.du.x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        gi().getPresenter().o(xVar);
        gi().f().o(xVar);
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final com.amazon.aps.iva.m70.a j1() {
        return fi().a;
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void o2() {
        ei().f.setRefreshing(false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        ei().e.addItemDecoration(new com.amazon.aps.iva.zt.b());
        ei().e.addItemDecoration(new com.amazon.aps.iva.gu.c());
        ei().e.setAdapter(di());
        ei().e.setLayoutManager(new LinearLayoutManager(getContext()));
        CommentsInputLayout commentsInputLayout = (CommentsInputLayout) ei().b.e;
        commentsInputLayout.getBinding().g.setFocusable(false);
        commentsInputLayout.getBinding().g.setLongClickable(false);
        commentsInputLayout.setOnClickListener(new com.amazon.aps.iva.ne.a(this, 11));
        commentsInputLayout.getBinding().g.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 12));
        commentsInputLayout.G(new a.b(null));
        ei().f.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: com.amazon.aps.iva.ru.a
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void onRefresh() {
                b.a aVar = b.m;
                b bVar = b.this;
                com.amazon.aps.iva.yb0.j.f(bVar, "this$0");
                bVar.gi().getPresenter().e4();
            }
        });
        ei().g.b.setOnClickListener(new com.amazon.aps.iva.c8.f(this, 9));
        hi();
    }

    @Override // com.amazon.aps.iva.ru.b0
    public final void r7(com.amazon.aps.iva.su.a aVar) {
        e.a aVar2 = com.amazon.aps.iva.ku.e.i;
        com.amazon.aps.iva.fc0.l<?>[] lVarArr = n;
        com.amazon.aps.iva.fc0.l<?> lVar = lVarArr[1];
        com.amazon.aps.iva.xw.s sVar = this.e;
        a.b bVar = new a.b(aVar);
        String str = ((com.amazon.aps.iva.ru.c) sVar.getValue(this, lVarArr[1])).c.b;
        aVar2.getClass();
        com.amazon.aps.iva.ku.e a2 = e.a.a(((com.amazon.aps.iva.ru.c) sVar.getValue(this, lVar)).b, "comment_replies", bVar, str);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(parentFragmentManager);
        aVar3.c("post_comment");
        a2.show(aVar3, "post_comment");
    }

    @Override // com.amazon.aps.iva.ru.b0
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
        return l1.I(gi().getPresenter(), gi().c(), gi().d(), gi().f());
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.ku.e eVar;
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        FrameLayout frameLayout = ei().c;
        com.amazon.aps.iva.yb0.j.e(frameLayout, "binding.commentRepliesContent");
        h.a.a(frameLayout, iVar);
        Fragment C = getParentFragmentManager().C("post_comment");
        if (C instanceof com.amazon.aps.iva.ku.e) {
            eVar = (com.amazon.aps.iva.ku.e) C;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            eVar.showSnackbar(iVar);
        }
    }

    @Override // com.amazon.aps.iva.hu.f
    public final void ub(List list, com.amazon.aps.iva.hu.d dVar) {
        com.amazon.aps.iva.yb0.j.f(list, "comments");
        ((com.amazon.aps.iva.hu.b) this.l.getValue()).a.b(list, new com.amazon.aps.iva.e.h(dVar, 8));
    }
}
