package com.ellation.crunchyroll.feed;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.vx.o;
import com.amazon.aps.iva.vx.p;
import com.amazon.aps.iva.vx.r;
import com.amazon.aps.iva.vx.s;
import com.amazon.aps.iva.vx.t;
import com.amazon.aps.iva.vx.u;
import com.amazon.aps.iva.vx.v;
import com.amazon.aps.iva.vx.w;
import com.amazon.aps.iva.xw.t0;
import com.crunchyroll.connectivity.d;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EmptyMeta;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.ui.recycler.LinearLoadMoreScrollListener;
import com.ellation.crunchyroll.ui.recycler.LoadMoreScrollListener;
import com.ellation.widgets.ScrollToggleRecyclerView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: HomeFeedView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006J\u0012\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010#\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u0019R\u001b\u0010&\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u0019R\u0014\u0010*\u001a\u00020'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/ellation/crunchyroll/feed/HomeFeedScreenView;", "Lcom/amazon/aps/iva/bh/a;", "Lcom/amazon/aps/iva/vx/w;", "Lcom/amazon/aps/iva/gn/e;", "Lcom/amazon/aps/iva/i5/o;", "Lcom/amazon/aps/iva/oh/i;", "Lcom/amazon/aps/iva/vx/v;", "Lcom/ellation/crunchyroll/ui/recycler/LoadMoreScrollListener;", "loadMoreScrollListener", "Lcom/amazon/aps/iva/kb0/q;", "setLoadMoreScrollListener", "Lcom/ellation/widgets/ScrollToggleRecyclerView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getFeedList", "()Lcom/ellation/widgets/ScrollToggleRecyclerView;", "feedList", "Landroid/widget/ImageView;", "c", "getHeroImage", "()Landroid/widget/ImageView;", "heroImage", "Landroid/view/View;", "d", "getHeroImageOverlay", "()Landroid/view/View;", "heroImageOverlay", "e", "getProgress", "progress", "f", "getError", "error", "g", "getRetryButton", "retryButton", "h", "getEmailVerificationBanner", "emailVerificationBanner", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "home-feed_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class HomeFeedScreenView extends com.amazon.aps.iva.bh.a implements w, com.amazon.aps.iva.gn.e, com.amazon.aps.iva.oh.i, v {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] n = {q.a(HomeFeedScreenView.class, "feedList", "getFeedList()Lcom/ellation/widgets/ScrollToggleRecyclerView;", 0), q.a(HomeFeedScreenView.class, "heroImage", "getHeroImage()Landroid/widget/ImageView;", 0), q.a(HomeFeedScreenView.class, "heroImageOverlay", "getHeroImageOverlay()Landroid/view/View;", 0), q.a(HomeFeedScreenView.class, "progress", "getProgress()Landroid/view/View;", 0), q.a(HomeFeedScreenView.class, "error", "getError()Landroid/view/View;", 0), q.a(HomeFeedScreenView.class, "retryButton", "getRetryButton()Landroid/view/View;", 0), q.a(HomeFeedScreenView.class, "emailVerificationBanner", "getEmailVerificationBanner()Landroid/view/View;", 0)};
    public final com.amazon.aps.iva.xw.v b;
    public final com.amazon.aps.iva.xw.v c;
    public final com.amazon.aps.iva.xw.v d;
    public final com.amazon.aps.iva.xw.v e;
    public final com.amazon.aps.iva.xw.v f;
    public final com.amazon.aps.iva.xw.v g;
    public final com.amazon.aps.iva.xw.v h;
    public com.ellation.crunchyroll.feed.a i;
    public final EventDispatcher.EventDispatcherImpl j;
    public LoadMoreScrollListener k;
    public com.amazon.aps.iva.wx.a l;
    public final a m;

    /* compiled from: HomeFeedView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.u {

        /* compiled from: HomeFeedView.kt */
        /* renamed from: com.ellation.crunchyroll.feed.HomeFeedScreenView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0966a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<RecyclerView.u, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ RecyclerView h;
            public final /* synthetic */ int i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0966a(RecyclerView recyclerView, int i) {
                super(1);
                this.h = recyclerView;
                this.i = i;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(RecyclerView.u uVar) {
                RecyclerView.u uVar2 = uVar;
                com.amazon.aps.iva.yb0.j.f(uVar2, "$this$notify");
                uVar2.onScrollStateChanged(this.h, this.i);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* compiled from: HomeFeedView.kt */
        /* loaded from: classes2.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<RecyclerView.u, com.amazon.aps.iva.kb0.q> {
            public final /* synthetic */ RecyclerView h;
            public final /* synthetic */ int i;
            public final /* synthetic */ int j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(RecyclerView recyclerView, int i, int i2) {
                super(1);
                this.h = recyclerView;
                this.i = i;
                this.j = i2;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final com.amazon.aps.iva.kb0.q invoke(RecyclerView.u uVar) {
                RecyclerView.u uVar2 = uVar;
                com.amazon.aps.iva.yb0.j.f(uVar2, "$this$notify");
                uVar2.onScrolled(this.h, this.i, this.j);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            HomeFeedScreenView.this.j.notify(new C0966a(recyclerView, i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            HomeFeedScreenView.this.j.notify(new b(recyclerView, i, i2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HomeFeedScreenView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    public static void Oa(HomeFeedScreenView homeFeedScreenView) {
        com.amazon.aps.iva.yb0.j.f(homeFeedScreenView, "this$0");
        com.ellation.crunchyroll.feed.a aVar = homeFeedScreenView.i;
        if (aVar != null) {
            ((HomeFeedPresenterImpl) aVar.n).b.M5();
        } else {
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
    }

    public static void X7(HomeFeedScreenView homeFeedScreenView) {
        com.amazon.aps.iva.yb0.j.f(homeFeedScreenView, "this$0");
        com.ellation.crunchyroll.feed.a aVar = homeFeedScreenView.i;
        if (aVar != null) {
            ((HomeFeedPresenterImpl) aVar.n).b.M5();
        } else {
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
    }

    public static void ci(HomeFeedScreenView homeFeedScreenView) {
        RecyclerView.p layoutManager = homeFeedScreenView.getFeedList().getLayoutManager();
        com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        com.ellation.crunchyroll.feed.a aVar = homeFeedScreenView.i;
        if (aVar != null) {
            homeFeedScreenView.setLoadMoreScrollListener(new LinearLoadMoreScrollListener(linearLayoutManager, aVar.n));
        } else {
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
    }

    private final View getEmailVerificationBanner() {
        return (View) this.h.getValue(this, n[6]);
    }

    private final View getError() {
        return (View) this.f.getValue(this, n[4]);
    }

    private final ScrollToggleRecyclerView getFeedList() {
        return (ScrollToggleRecyclerView) this.b.getValue(this, n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getHeroImage() {
        return (ImageView) this.c.getValue(this, n[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getHeroImageOverlay() {
        return (View) this.d.getValue(this, n[2]);
    }

    private final View getProgress() {
        return (View) this.e.getValue(this, n[3]);
    }

    private final View getRetryButton() {
        return (View) this.g.getValue(this, n[5]);
    }

    public static void nf(HomeFeedScreenView homeFeedScreenView, int i) {
        com.amazon.aps.iva.yb0.j.f(homeFeedScreenView, "this$0");
        ScrollToggleRecyclerView feedList = homeFeedScreenView.getFeedList();
        int i2 = ScrollToggleRecyclerView.d;
        com.amazon.aps.iva.z60.c cVar = new com.amazon.aps.iva.z60.c(-1, feedList.getContext());
        cVar.setTargetPosition(i);
        RecyclerView.p layoutManager = feedList.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(cVar);
        }
    }

    private final void setLoadMoreScrollListener(LoadMoreScrollListener loadMoreScrollListener) {
        this.k = loadMoreScrollListener;
        if (loadMoreScrollListener != null) {
            this.j.addEventListener(loadMoreScrollListener);
        }
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void Ag() {
        getHeroImage().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void Ce(List<String> list) {
        com.amazon.aps.iva.yb0.j.f(list, "assetIds");
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void D2() {
        getEmailVerificationBanner().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void F2() {
    }

    @Override // com.amazon.aps.iva.bh.a
    public final void G4(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        com.ellation.crunchyroll.feed.a aVar = this.i;
        if (aVar != null) {
            ((HomeFeedPresenterImpl) aVar.n).onNewIntent(intent);
        } else {
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.bh.a
    public final void H6() {
        getFeedList().smoothScrollToPosition(0);
    }

    @Override // com.amazon.aps.iva.f60.k
    public final void Jc(com.amazon.aps.iva.b60.j jVar) {
        com.ellation.crunchyroll.feed.a aVar = this.i;
        if (aVar != null) {
            ((HomeFeedPresenterImpl) aVar.n).U0(jVar);
        } else {
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void Q5() {
        getHeroImage().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.gn.e
    public final void Tb(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        Context context = getContext();
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        com.amazon.aps.iva.yb0.j.c(a2);
        com.amazon.aps.iva.d3.a.startActivity(context, com.amazon.aps.iva.gd0.j.i(a2, str), null);
    }

    @Override // com.amazon.aps.iva.bh.a
    public final void U2(Fragment fragment, com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, com.amazon.aps.iva.xb0.q<? super Integer, ? super Integer, ? super com.amazon.aps.iva.ob0.d<? super ContentApiResponse<HomeFeedItemRaw, EmptyMeta>>, ? extends Object> qVar, List<? extends HomeFeedItemResponseType> list, boolean z, boolean z2, com.amazon.aps.iva.ls.a aVar3) {
        com.amazon.aps.iva.yb0.j.f(fragment, "fragment");
        com.amazon.aps.iva.yb0.j.f(aVar, "isInGraceButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar2, "isSubscriptionButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar3, "screen");
        com.ellation.crunchyroll.feed.a aVar4 = new com.ellation.crunchyroll.feed.a(this, fragment, aVar, aVar2, qVar, list, z, z2, aVar3);
        this.i = aVar4;
        com.ellation.crunchyroll.mvp.lifecycle.a.b(aVar4.q, this);
        com.ellation.crunchyroll.feed.a aVar5 = this.i;
        if (aVar5 != null) {
            com.ellation.crunchyroll.mvp.lifecycle.a.b(aVar5.p, this);
            com.ellation.crunchyroll.feed.a aVar6 = this.i;
            if (aVar6 != null) {
                com.ellation.crunchyroll.mvp.lifecycle.a.b(aVar6.n, this);
                getFeedList().setHasFixedSize(true);
                ScrollToggleRecyclerView feedList = getFeedList();
                Resources resources = getResources();
                com.amazon.aps.iva.yb0.j.e(resources, "resources");
                feedList.addItemDecoration(new com.amazon.aps.iva.vx.l(resources));
                getFeedList().setItemAnimator(null);
                RecyclerView.p layoutManager = getFeedList().getLayoutManager();
                com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                getFeedList().setVerticalScrollListener(new t((LinearLayoutManager) layoutManager, this));
                getFeedList().addOnScrollListener(this.m);
                this.j.addEventListener(new m(this));
                Context context = getContext();
                com.amazon.aps.iva.yb0.j.e(context, "context");
                ImageView heroImage = getHeroImage();
                com.ellation.crunchyroll.feed.a aVar7 = this.i;
                if (aVar7 != null) {
                    o oVar = new o(aVar7.p);
                    com.ellation.crunchyroll.feed.a aVar8 = this.i;
                    if (aVar8 != null) {
                        com.amazon.aps.iva.nt.a aVar9 = new com.amazon.aps.iva.nt.a(oVar, new p(aVar8.q), new com.amazon.aps.iva.vx.q(this), new k(this));
                        r rVar = new r(this);
                        com.ellation.crunchyroll.feed.a aVar10 = this.i;
                        if (aVar10 != null) {
                            com.amazon.aps.iva.hy.e eVar = new com.amazon.aps.iva.hy.e(rVar, aVar10.q);
                            com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
                            if (kVar != null) {
                                Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
                                com.amazon.aps.iva.yb0.j.c(a2);
                                com.ellation.crunchyroll.feed.a aVar11 = this.i;
                                if (aVar11 != null) {
                                    com.amazon.aps.iva.n70.d l = kVar.l(a2, aVar11.q);
                                    com.amazon.aps.iva.vx.k kVar2 = defpackage.i.f;
                                    if (kVar2 != null) {
                                        Activity a3 = com.amazon.aps.iva.xw.q.a(getContext());
                                        com.amazon.aps.iva.yb0.j.c(a3);
                                        com.ellation.crunchyroll.feed.a aVar12 = this.i;
                                        if (aVar12 != null) {
                                            com.amazon.aps.iva.hy.f fVar = new com.amazon.aps.iva.hy.f(aVar9, eVar, l, kVar2.h(a3, aVar12.q));
                                            Context context2 = getContext();
                                            com.amazon.aps.iva.yb0.j.d(context2, "null cannot be cast to non-null type com.crunchyroll.multitiersubscription.success.UpgradeFlowRouterProvider");
                                            com.amazon.aps.iva.xh.b H6 = ((com.amazon.aps.iva.xh.c) context2).H6();
                                            com.ellation.crunchyroll.feed.a aVar13 = this.i;
                                            if (aVar13 != null) {
                                                this.l = new com.amazon.aps.iva.wx.a(context, heroImage, fVar, H6, new s(aVar13.p));
                                                getFeedList().setAdapter(this.l);
                                                ci(this);
                                                getError().setOnClickListener(new com.amazon.aps.iva.c8.s(this, 12));
                                                getRetryButton().setOnClickListener(new com.amazon.aps.iva.c8.e(this, 10));
                                                com.amazon.aps.iva.i5.o d = t0.d(this);
                                                com.amazon.aps.iva.vx.k kVar3 = defpackage.i.f;
                                                if (kVar3 != null) {
                                                    kVar3.a.k(d, new l(this));
                                                    com.amazon.aps.iva.vx.k kVar4 = defpackage.i.f;
                                                    if (kVar4 != null) {
                                                        com.ellation.crunchyroll.feed.a aVar14 = this.i;
                                                        if (aVar14 != null) {
                                                            kVar4.a.s(d, new u(aVar14.n));
                                                            Context context3 = getContext();
                                                            com.amazon.aps.iva.yb0.j.e(context3, "context");
                                                            com.crunchyroll.connectivity.d a4 = d.a.a(context3, d.getLifecycle());
                                                            com.ellation.crunchyroll.feed.a aVar15 = this.i;
                                                            if (aVar15 != null) {
                                                                a4.a(aVar15.n);
                                                                com.amazon.aps.iva.vx.k kVar5 = defpackage.i.f;
                                                                if (kVar5 != null) {
                                                                    com.amazon.aps.iva.nh.d p = kVar5.p();
                                                                    Activity a5 = com.amazon.aps.iva.xw.q.a(getContext());
                                                                    com.amazon.aps.iva.yb0.j.d(a5, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                                                    androidx.fragment.app.h hVar = (androidx.fragment.app.h) a5;
                                                                    com.ellation.crunchyroll.feed.a aVar16 = this.i;
                                                                    if (aVar16 != null) {
                                                                        p.a(hVar, this, aVar16.a());
                                                                        return;
                                                                    } else {
                                                                        com.amazon.aps.iva.yb0.j.m("feedModule");
                                                                        throw null;
                                                                    }
                                                                }
                                                                com.amazon.aps.iva.yb0.j.m("dependencies");
                                                                throw null;
                                                            }
                                                            com.amazon.aps.iva.yb0.j.m("feedModule");
                                                            throw null;
                                                        }
                                                        com.amazon.aps.iva.yb0.j.m("feedModule");
                                                        throw null;
                                                    }
                                                    com.amazon.aps.iva.yb0.j.m("dependencies");
                                                    throw null;
                                                }
                                                com.amazon.aps.iva.yb0.j.m("dependencies");
                                                throw null;
                                            }
                                            com.amazon.aps.iva.yb0.j.m("feedModule");
                                            throw null;
                                        }
                                        com.amazon.aps.iva.yb0.j.m("feedModule");
                                        throw null;
                                    }
                                    com.amazon.aps.iva.yb0.j.m("dependencies");
                                    throw null;
                                }
                                com.amazon.aps.iva.yb0.j.m("feedModule");
                                throw null;
                            }
                            com.amazon.aps.iva.yb0.j.m("dependencies");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("feedModule");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("feedModule");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("feedModule");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("feedModule");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("feedModule");
        throw null;
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void a() {
        getProgress().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void b() {
        getProgress().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.bh.a
    public final void b1() {
        getHeroImage().setPadding(0, t0.a(R.dimen.browse_music_landing_padding_top, this), 0, 0);
        getFeedList().setPadding(0, t0.a(R.dimen.browse_music_landing_padding_top, this), 0, 0);
    }

    @Override // com.amazon.aps.iva.oh.i
    public final void bg() {
        showSnackbar(com.amazon.aps.iva.bt.c.b);
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void c() {
        getError().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.vx.v
    public final void f2() {
        com.ellation.crunchyroll.feed.a aVar = this.i;
        if (aVar != null) {
            HomeFeedPresenterImpl homeFeedPresenterImpl = (HomeFeedPresenterImpl) aVar.n;
            homeFeedPresenterImpl.getClass();
            homeFeedPresenterImpl.b.N5(new j(homeFeedPresenterImpl));
            return;
        }
        com.amazon.aps.iva.yb0.j.m("feedModule");
        throw null;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.vx.w
    public final boolean isResumed() {
        return t0.d(this).getLifecycle().getCurrentState().isAtLeast(g.b.RESUMED);
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void j7(List<? extends com.amazon.aps.iva.xx.l> list, com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        com.amazon.aps.iva.yb0.j.f(aVar, "onSubmit");
        getFeedList().setVisibility(0);
        com.amazon.aps.iva.wx.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.a.b(list, new com.amazon.aps.iva.e.k(aVar, 9));
        }
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void m() {
        getError().setVisibility(8);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView.p layoutManager = getFeedList().getLayoutManager();
        com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (this.l != null) {
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            getFeedList().setAdapter(this.l);
            getFeedList().scrollToPosition(findFirstVisibleItemPosition);
        }
        for (View view : f1.K(getHeroImage(), getHeroImageOverlay())) {
            view.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.hero_image_height);
            view.requestLayout();
        }
        getHeroImageOverlay().setTranslationY(0.0f);
        getHeroImage().setClipBounds(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getFeedList().removeOnScrollListener(this.m);
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void reset() {
        getFeedList().scrollToPosition(0);
        LoadMoreScrollListener loadMoreScrollListener = this.k;
        EventDispatcher.EventDispatcherImpl eventDispatcherImpl = this.j;
        if (loadMoreScrollListener != null) {
            eventDispatcherImpl.removeEventListener(loadMoreScrollListener);
        }
        ci(this);
        ScrollToggleRecyclerView feedList = getFeedList();
        a aVar = this.m;
        feedList.removeOnScrollListener(aVar);
        getFeedList().addOnScrollListener(aVar);
        eventDispatcherImpl.addEventListener(new m(this));
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void scrollToPosition(int i) {
        getFeedList().post(new com.amazon.aps.iva.a6.c(i, 1, this));
    }

    @Override // com.amazon.aps.iva.u70.j
    public final void showSnackbar(com.amazon.aps.iva.u70.i iVar) {
        com.amazon.aps.iva.yb0.j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        Activity a2 = com.amazon.aps.iva.xw.q.a(getContext());
        com.amazon.aps.iva.yb0.j.c(a2);
        View findViewById = a2.findViewById(com.ellation.crunchyroll.ui.R.id.errors_layout);
        com.amazon.aps.iva.yb0.j.e(findViewById, "context.asActivity()!!).…sources.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }

    @Override // com.amazon.aps.iva.vx.w
    public final void zd() {
        getFeedList().setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFeedScreenView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.home_feed_list, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.home_feed_hero_image, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.home_feed_hero_image_overlay, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.home_feed_progress, this);
        this.f = com.amazon.aps.iva.xw.g.c(R.id.home_feed_error_layout, this);
        this.g = com.amazon.aps.iva.xw.g.c(R.id.retry_text, this);
        this.h = com.amazon.aps.iva.xw.g.c(R.id.email_verification_banner, this);
        this.j = new EventDispatcher.EventDispatcherImpl();
        View.inflate(context, R.layout.view_home_feed, this);
        this.m = new a();
    }
}
