package com.amazon.aps.iva.vt;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.xt.b;
import com.ellation.crunchyroll.api.etp.commenting.TalkboxService;
import com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModelImpl;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CommentsModule.kt */
/* loaded from: classes2.dex */
public final class j implements com.amazon.aps.iva.vt.i {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] u = {com.amazon.aps.iva.k.q.a(j.class, "localCommentsViewModel", "getLocalCommentsViewModel()Lcom/ellation/crunchyroll/commenting/comments/localcomments/LocalCommentsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "commentsViewModel", "getCommentsViewModel()Lcom/ellation/crunchyroll/commenting/comments/CommentsViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "commentVoteViewModel", "getCommentVoteViewModel()Lcom/ellation/crunchyroll/commenting/comments/vote/CommentsVoteViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "totalCommentsViewModel", "getTotalCommentsViewModel()Lcom/ellation/crunchyroll/commenting/commentscount/CommentsTotalCountViewModelImpl;", 0), com.amazon.aps.iva.k.q.a(j.class, "commentActionViewModel", "getCommentActionViewModel()Lcom/ellation/crunchyroll/commenting/comments/action/CommentActionViewModelImpl;", 0)};
    public final com.amazon.aps.iva.vt.b b;
    public final String c;
    public final TalkboxService d;
    public final com.amazon.aps.iva.ff.b e;
    public final com.amazon.aps.iva.wt.f f;
    public final com.amazon.aps.iva.ez.f g;
    public final com.amazon.aps.iva.ez.f h;
    public final com.amazon.aps.iva.ez.f i;
    public final com.amazon.aps.iva.iu.a j;
    public final com.amazon.aps.iva.lu.b k;
    public final com.amazon.aps.iva.kb0.m l;
    public final com.amazon.aps.iva.ez.a m;
    public final com.amazon.aps.iva.ez.f n;
    public final com.amazon.aps.iva.xt.c o;
    public final com.amazon.aps.iva.kb0.m p;
    public final com.amazon.aps.iva.kb0.m q;
    public final com.amazon.aps.iva.kb0.m r;
    public final EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> s;
    public final EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> t;

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<PlayableAsset> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final PlayableAsset invoke() {
            return j.this.e.getCurrentAsset().d();
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.wt.h> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.wt.h invoke() {
            j jVar = j.this;
            com.amazon.aps.iva.vt.b bVar = jVar.b;
            com.amazon.aps.iva.fc0.l<?> lVar = j.u[4];
            com.amazon.aps.iva.yb0.j.f(bVar, "view");
            com.amazon.aps.iva.iu.a aVar = jVar.j;
            com.amazon.aps.iva.yb0.j.f(aVar, "pendingStateRouter");
            return new com.amazon.aps.iva.wt.i(bVar, (CommentActionViewModelImpl) jVar.n.getValue(jVar, lVar), aVar);
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, CommentActionViewModelImpl> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CommentActionViewModelImpl invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            j jVar = j.this;
            com.amazon.aps.iva.wt.f fVar = jVar.f;
            com.amazon.aps.iva.nu.i h = j.h(jVar);
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            com.amazon.aps.iva.ff.b bVar = jVar.e;
            com.amazon.aps.iva.yb0.j.f(bVar, "currentAssetProvider");
            CommentActionViewModelImpl commentActionViewModelImpl = new CommentActionViewModelImpl(fVar, h, new com.amazon.aps.iva.wt.b(cVar, bVar));
            com.amazon.aps.iva.fc0.l<?>[] lVarArr = j.u;
            commentActionViewModelImpl.addEventListener((x) jVar.h.getValue(jVar, lVarArr[1]));
            commentActionViewModelImpl.addEventListener((com.amazon.aps.iva.hu.h) jVar.g.getValue(jVar, lVarArr[0]));
            return commentActionViewModelImpl;
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.mu.a> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.mu.a invoke() {
            j jVar = j.this;
            com.amazon.aps.iva.vt.b bVar = jVar.b;
            com.amazon.aps.iva.fc0.l<?> lVar = j.u[2];
            com.amazon.aps.iva.yb0.j.f(bVar, "view");
            com.amazon.aps.iva.iu.a aVar = jVar.j;
            com.amazon.aps.iva.yb0.j.f(aVar, "accountPendingStateRouter");
            return new com.amazon.aps.iva.mu.b(bVar, (com.amazon.aps.iva.mu.h) jVar.i.getValue(jVar, lVar), aVar);
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.mu.h> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.mu.h invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new com.amazon.aps.iva.mu.h(j.this.f);
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, x> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final x invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            com.amazon.aps.iva.bu.d dVar = new com.amazon.aps.iva.bu.d();
            j jVar = j.this;
            String str = jVar.c;
            com.amazon.aps.iva.yb0.j.f(str, "assetId");
            TalkboxService talkboxService = jVar.d;
            com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
            return new x(dVar, new com.amazon.aps.iva.vt.e(str, talkboxService));
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.hu.c> {
        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.hu.c invoke() {
            j jVar = j.this;
            com.amazon.aps.iva.vt.b bVar = jVar.b;
            com.amazon.aps.iva.fc0.l<?> lVar = j.u[0];
            com.amazon.aps.iva.nu.i h = j.h(jVar);
            com.amazon.aps.iva.yb0.j.f(bVar, "view");
            return new com.amazon.aps.iva.hu.e(bVar, (com.amazon.aps.iva.hu.h) jVar.g.getValue(jVar, lVar), h);
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.hu.h> {
        public static final h h = new h();

        public h() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.hu.h invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            return new com.amazon.aps.iva.hu.h();
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.vt.k> {
        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.vt.k invoke() {
            j jVar = j.this;
            com.amazon.aps.iva.vt.b bVar = jVar.b;
            LiveData<PlayableAsset> currentAsset = jVar.e.getCurrentAsset();
            com.amazon.aps.iva.fc0.l<?> lVar = j.u[1];
            com.amazon.aps.iva.nu.i h = j.h(jVar);
            com.amazon.aps.iva.yb0.j.f(bVar, "view");
            String str = jVar.c;
            com.amazon.aps.iva.yb0.j.f(str, "assetId");
            com.amazon.aps.iva.yb0.j.f(currentAsset, "currentAsset");
            com.amazon.aps.iva.iu.a aVar = jVar.j;
            com.amazon.aps.iva.yb0.j.f(aVar, "pendingStateRouter");
            com.amazon.aps.iva.xt.c cVar = jVar.o;
            com.amazon.aps.iva.yb0.j.f(cVar, "analytics");
            return new l(bVar, str, currentAsset, (x) jVar.h.getValue(jVar, lVar), h, aVar, cVar);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* renamed from: com.amazon.aps.iva.vt.j$j  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0808j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0808j(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: CommentsModule.kt */
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, com.amazon.aps.iva.nu.i> {
        public k() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.nu.i invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            TalkboxService talkboxService = j.this.d;
            com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
            return new com.amazon.aps.iva.nu.i(new com.amazon.aps.iva.qu.b(talkboxService));
        }
    }

    public j(com.amazon.aps.iva.vt.b bVar, String str, TalkboxService talkboxService) {
        com.amazon.aps.iva.yb0.j.f(talkboxService, "talkboxService");
        this.b = bVar;
        this.c = str;
        this.d = talkboxService;
        androidx.fragment.app.h requireActivity = bVar.requireActivity();
        com.amazon.aps.iva.yb0.j.d(requireActivity, "null cannot be cast to non-null type com.crunchyroll.commenting.CurrentAssetProvider");
        this.e = (com.amazon.aps.iva.ff.b) requireActivity;
        this.f = new com.amazon.aps.iva.wt.f(str, talkboxService);
        this.g = new com.amazon.aps.iva.ez.f(bVar, com.amazon.aps.iva.hu.h.class, h.h);
        this.h = new com.amazon.aps.iva.ez.f(bVar, x.class, new f());
        this.i = new com.amazon.aps.iva.ez.f(bVar, com.amazon.aps.iva.mu.h.class, new e());
        com.amazon.aps.iva.ut.b bVar2 = com.amazon.aps.iva.ut.c.f;
        if (bVar2 != null) {
            this.j = bVar2.d().invoke(bVar);
            com.amazon.aps.iva.ut.b bVar3 = com.amazon.aps.iva.ut.c.f;
            if (bVar3 != null) {
                this.k = bVar3.c().invoke(bVar);
                this.l = com.amazon.aps.iva.kb0.f.b(new d());
                androidx.fragment.app.h requireActivity2 = bVar.requireActivity();
                com.amazon.aps.iva.yb0.j.e(requireActivity2, "fragment.requireActivity()");
                this.m = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.nu.i.class, new C0808j(requireActivity2), new k());
                this.n = new com.amazon.aps.iva.ez.f(bVar, CommentActionViewModelImpl.class, new c());
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                this.o = b.a.a(com.amazon.aps.iva.ls.a.COMMENTS, new a());
                this.p = com.amazon.aps.iva.kb0.f.b(new g());
                this.q = com.amazon.aps.iva.kb0.f.b(new i());
                this.r = com.amazon.aps.iva.kb0.f.b(new b());
                EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> eventDispatcherImpl = new EventDispatcher.EventDispatcherImpl<>();
                eventDispatcherImpl.addEventListener(getPresenter());
                eventDispatcherImpl.addEventListener(c());
                eventDispatcherImpl.addEventListener(d());
                this.s = eventDispatcherImpl;
                EventDispatcher.EventDispatcherImpl<com.amazon.aps.iva.du.f> eventDispatcherImpl2 = new EventDispatcher.EventDispatcherImpl<>();
                eventDispatcherImpl2.addEventListener(f());
                eventDispatcherImpl2.addEventListener(c());
                eventDispatcherImpl2.addEventListener(d());
                this.t = eventDispatcherImpl2;
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    public static final com.amazon.aps.iva.nu.i h(j jVar) {
        jVar.getClass();
        return (com.amazon.aps.iva.nu.i) jVar.m.getValue(jVar, u[3]);
    }

    @Override // com.amazon.aps.iva.vt.i
    public final EventDispatcher.EventDispatcherImpl a() {
        return this.s;
    }

    @Override // com.amazon.aps.iva.vt.i
    public final EventDispatcher.EventDispatcherImpl b() {
        return this.t;
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.mu.a c() {
        return (com.amazon.aps.iva.mu.a) this.l.getValue();
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.wt.h d() {
        return (com.amazon.aps.iva.wt.h) this.r.getValue();
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.iu.a e() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.hu.c f() {
        return (com.amazon.aps.iva.hu.c) this.p.getValue();
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.lu.b g() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.vt.i
    public final com.amazon.aps.iva.vt.k getPresenter() {
        return (com.amazon.aps.iva.vt.k) this.q.getValue();
    }
}
