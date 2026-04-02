package com.amazon.aps.iva.ru;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.xt.b;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentRepliesModule.kt */
/* loaded from: classes2.dex */
public final class r implements f {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] s = {com.amazon.aps.iva.k.q.a(r.class, "commentsViewModel", "getCommentsViewModel()Lcom/ellation/crunchyroll/commenting/comments/CommentsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(r.class, "localRepliesViewModel", "getLocalRepliesViewModel()Lcom/ellation/crunchyroll/commenting/comments/localcomments/LocalCommentsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(r.class, "totalCommentsViewModel", "getTotalCommentsViewModel()Lcom/ellation/crunchyroll/commenting/commentscount/CommentsTotalCountViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(r.class, "repliesViewModel", "getRepliesViewModel()Lcom/ellation/crunchyroll/commenting/replies/CommentRepliesViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(r.class, "commentVoteViewModel", "getCommentVoteViewModel()Lcom/ellation/crunchyroll/commenting/comments/vote/CommentsVoteViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(r.class, "commentActionViewModel", "getCommentActionViewModel()Lcom/ellation/crunchyroll/commenting/comments/action/CommentActionViewModelImpl;", 0)};
    public final b a;
    public final TalkboxService b;
    public final com.amazon.aps.iva.ff.b c;
    public final com.amazon.aps.iva.wt.f d;
    public final com.amazon.aps.iva.ez.f e;
    public final com.amazon.aps.iva.ez.f f;
    public final com.amazon.aps.iva.ez.a g;
    public final com.amazon.aps.iva.ez.f h;
    public final com.amazon.aps.iva.ez.f i;
    public final com.amazon.aps.iva.iu.a j;
    public final com.amazon.aps.iva.kb0.m k;
    public final w l;
    public final com.amazon.aps.iva.ez.f m;
    public final com.amazon.aps.iva.kb0.m n;
    public final com.amazon.aps.iva.kb0.m o;
    public final EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> p;
    public final EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> q;
    public final EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> r;

    public r(TalkboxService talkboxService, b bVar, c cVar) {
        this.a = bVar;
        this.b = talkboxService;
        androidx.fragment.app.h requireActivity = bVar.requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.crunchyroll.commenting.CurrentAssetProvider");
        com.amazon.aps.iva.ff.b bVar2 = (com.amazon.aps.iva.ff.b) requireActivity;
        this.c = bVar2;
        String str = cVar.b;
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        this.d = new com.amazon.aps.iva.wt.f(str, talkboxService);
        Fragment C = bVar.requireActivity().getSupportFragmentManager().C("comments");
        com.amazon.aps.iva.yb0.j.d(C, "null cannot be cast to non-null type com.ellation.crunchyroll.commenting.comments.CommentsFragment");
        this.e = new com.amazon.aps.iva.ez.f((com.amazon.aps.iva.vt.b) C, com.amazon.aps.iva.vt.x.class, new l(cVar, this));
        this.f = new com.amazon.aps.iva.ez.f(bVar, com.amazon.aps.iva.hu.h.class, n.h);
        androidx.fragment.app.h requireActivity2 = bVar.requireActivity();
        com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
        this.g = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.nu.i.class, new p(requireActivity2), new q(this));
        this.h = new com.amazon.aps.iva.ez.f(bVar, h0.class, new o(cVar, this));
        this.i = new com.amazon.aps.iva.ez.f(bVar, com.amazon.aps.iva.mu.h.class, new k(this));
        com.amazon.aps.iva.ds.c cVar2 = com.amazon.aps.iva.ds.c.b;
        com.amazon.aps.iva.xt.c a = b.a.a(com.amazon.aps.iva.ls.a.REPLIES, new g(this));
        com.amazon.aps.iva.ut.b bVar3 = com.amazon.aps.iva.ut.c.f;
        if (bVar3 != null) {
            com.amazon.aps.iva.iu.a invoke = bVar3.d().invoke(bVar);
            this.j = invoke;
            this.k = com.amazon.aps.iva.kb0.f.b(new j(this));
            boolean z = cVar.d;
            LiveData<PlayableAsset> currentAsset = bVar2.getCurrentAsset();
            h0 g = g();
            com.amazon.aps.iva.yb0.j.f(currentAsset, "currentAsset");
            com.amazon.aps.iva.yb0.j.f(invoke, "pendingStateRouter");
            w wVar = new w(bVar, str, z, currentAsset, g, invoke, a);
            this.l = wVar;
            this.m = new com.amazon.aps.iva.ez.f(bVar, CommentActionViewModelImpl.class, new i(this));
            this.n = com.amazon.aps.iva.kb0.f.b(new h(this));
            this.o = com.amazon.aps.iva.kb0.f.b(new m(this));
            EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> eventDispatcherImpl = new EventDispatcher.EventDispatcherImpl<>();
            eventDispatcherImpl.addEventListener(d());
            eventDispatcherImpl.addEventListener(c());
            eventDispatcherImpl.addEventListener(wVar);
            this.p = eventDispatcherImpl;
            EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> eventDispatcherImpl2 = new EventDispatcher.EventDispatcherImpl<>();
            eventDispatcherImpl2.addEventListener(d());
            eventDispatcherImpl2.addEventListener(c());
            eventDispatcherImpl2.addEventListener(wVar);
            this.q = eventDispatcherImpl2;
            EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> eventDispatcherImpl3 = new EventDispatcher.EventDispatcherImpl<>();
            eventDispatcherImpl3.addEventListener(f());
            eventDispatcherImpl3.addEventListener(c());
            eventDispatcherImpl3.addEventListener(d());
            this.r = eventDispatcherImpl3;
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.ru.f
    public final EventDispatcher.EventDispatcherImpl a() {
        return this.p;
    }

    @Override // com.amazon.aps.iva.ru.f
    public final EventDispatcher.EventDispatcherImpl b() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.ru.f
    public final com.amazon.aps.iva.mu.a c() {
        return (com.amazon.aps.iva.mu.a) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.ru.f
    public final com.amazon.aps.iva.wt.h d() {
        return (com.amazon.aps.iva.wt.h) this.n.getValue();
    }

    @Override // com.amazon.aps.iva.ru.f
    public final EventDispatcher.EventDispatcherImpl e() {
        return this.q;
    }

    @Override // com.amazon.aps.iva.ru.f
    public final com.amazon.aps.iva.hu.c f() {
        return (com.amazon.aps.iva.hu.c) this.o.getValue();
    }

    public final h0 g() {
        return (h0) this.h.getValue(this, s[3]);
    }

    @Override // com.amazon.aps.iva.ru.f
    public final u getPresenter() {
        return this.l;
    }
}
