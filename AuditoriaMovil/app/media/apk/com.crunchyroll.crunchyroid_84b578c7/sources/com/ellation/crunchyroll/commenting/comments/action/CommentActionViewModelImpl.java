package com.ellation.crunchyroll.commenting.comments.action;

import com.amazon.aps.iva.du.a;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.b;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nu.f;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.vt.h;
import com.amazon.aps.iva.wt.d;
import com.amazon.aps.iva.wt.g;
import com.amazon.aps.iva.wt.n;
import com.amazon.aps.iva.wt.p;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.commenting.body.VoteType;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import kotlin.Metadata;
/* compiled from: CommentActionViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/ellation/crunchyroll/commenting/comments/action/CommentActionViewModelImpl;", "Lcom/amazon/aps/iva/ez/b;", "Lcom/ellation/crunchyroll/commenting/comments/action/CommentActionViewModel;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Lcom/amazon/aps/iva/vt/h;", "commenting_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CommentActionViewModelImpl extends b implements CommentActionViewModel, EventDispatcher<h> {
    public final d b;
    public final f c;
    public final com.amazon.aps.iva.wt.a d;
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<h> e;
    public final HashMap<j<String, g>, com.amazon.aps.iva.du.a> f;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<n>>> g;
    public final v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<x>>> h;

    /* compiled from: CommentActionViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Throwable, q> {
        public final /* synthetic */ x i;
        public final /* synthetic */ com.amazon.aps.iva.du.a j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.du.a aVar, x xVar) {
            super(1);
            this.i = xVar;
            this.j = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Throwable th) {
            boolean z;
            Throwable th2 = th;
            CommentActionViewModelImpl commentActionViewModelImpl = CommentActionViewModelImpl.this;
            HashMap<j<String, g>, com.amazon.aps.iva.du.a> hashMap = commentActionViewModelImpl.f;
            x xVar = this.i;
            String str = xVar.b;
            com.amazon.aps.iva.du.a aVar = this.j;
            com.amazon.aps.iva.du.a remove = hashMap.remove(new j(str, CommentActionViewModelImpl.Q8(aVar)));
            if (remove != null && th2 == null) {
                if (CommentActionViewModelImpl.Q8(remove) == CommentActionViewModelImpl.Q8(aVar) && !com.amazon.aps.iva.yb0.j.a(remove, aVar)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    commentActionViewModelImpl.S8(remove, xVar);
                }
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentActionViewModelImpl(com.amazon.aps.iva.wt.f fVar, f fVar2, com.amazon.aps.iva.wt.b bVar) {
        super(fVar);
        com.amazon.aps.iva.yb0.j.f(fVar, "interactor");
        this.b = fVar;
        this.c = fVar2;
        this.d = bVar;
        this.e = new EventDispatcher.EventDispatcherImpl<>();
        this.f = new HashMap<>();
        this.g = new v<>();
        this.h = new v<>();
    }

    public static final Object N8(CommentActionViewModelImpl commentActionViewModelImpl, com.amazon.aps.iva.du.a aVar, String str, com.amazon.aps.iva.ob0.d dVar) {
        boolean a2;
        commentActionViewModelImpl.getClass();
        boolean z = true;
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.b.e)) {
            a2 = true;
        } else {
            a2 = com.amazon.aps.iva.yb0.j.a(aVar, a.d.e);
        }
        d dVar2 = commentActionViewModelImpl.b;
        if (a2) {
            Object o1 = dVar2.o1(str, R8(aVar), dVar);
            if (o1 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return q.a;
            }
            return o1;
        }
        if (!com.amazon.aps.iva.yb0.j.a(aVar, a.e.e)) {
            z = com.amazon.aps.iva.yb0.j.a(aVar, a.g.e);
        }
        if (z) {
            Object u1 = dVar2.u1(str, R8(aVar), dVar);
            if (u1 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return q.a;
            }
            return u1;
        } else if (com.amazon.aps.iva.yb0.j.a(aVar, a.c.e)) {
            Object S = dVar2.S(str, dVar);
            if (S != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return q.a;
            }
            return S;
        } else if (com.amazon.aps.iva.yb0.j.a(aVar, a.f.e)) {
            Object d1 = dVar2.d1(str, dVar);
            if (d1 != com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return q.a;
            }
            return d1;
        } else {
            throw new IllegalArgumentException(aVar + " is not supported!");
        }
    }

    public static n P8(n nVar) {
        a.b bVar = a.b.e;
        com.amazon.aps.iva.du.a aVar = nVar.a;
        if (com.amazon.aps.iva.yb0.j.a(aVar, bVar)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, false, true, false, false, false, false, false, 260095));
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.e.e)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, false, false, false, false, false, false, false, 260095));
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.d.e)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, false, false, true, false, false, false, false, 258047));
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.g.e)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, false, false, false, false, false, false, false, 258047));
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.c.e)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, true, false, false, false, false, true, false, 195583));
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.f.e)) {
            return n.a(nVar, x.a(nVar.b, 0, false, 0, false, false, false, false, false, false, false, 195583));
        }
        return n.a(nVar, x.a(nVar.b, 0, false, 0, false, false, false, false, false, false, false, 262143));
    }

    public static g Q8(com.amazon.aps.iva.du.a aVar) {
        boolean a2;
        boolean a3;
        boolean z = true;
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.b.e)) {
            a2 = true;
        } else {
            a2 = com.amazon.aps.iva.yb0.j.a(aVar, a.e.e);
        }
        if (a2) {
            return g.SPOILER_VOTE;
        }
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.d.e)) {
            a3 = true;
        } else {
            a3 = com.amazon.aps.iva.yb0.j.a(aVar, a.g.e);
        }
        if (a3) {
            return g.INAPPROPRIATE_VOTE;
        }
        if (!com.amazon.aps.iva.yb0.j.a(aVar, a.c.e)) {
            z = com.amazon.aps.iva.yb0.j.a(aVar, a.f.e);
        }
        if (z) {
            return g.SPOILER_FLAG;
        }
        throw new IllegalArgumentException(aVar + " is not supported!");
    }

    public static VoteType R8(com.amazon.aps.iva.du.a aVar) {
        boolean a2;
        boolean z = true;
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.b.e)) {
            a2 = true;
        } else {
            a2 = com.amazon.aps.iva.yb0.j.a(aVar, a.e.e);
        }
        if (a2) {
            return VoteType.SPOILER;
        }
        if (!com.amazon.aps.iva.yb0.j.a(aVar, a.d.e)) {
            z = com.amazon.aps.iva.yb0.j.a(aVar, a.g.e);
        }
        if (z) {
            return VoteType.INAPPROPRIATE;
        }
        throw new IllegalArgumentException(aVar + " is not supported!");
    }

    @Override // com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModel
    public final v G5() {
        return this.h;
    }

    @Override // com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModel
    public final void M0(com.amazon.aps.iva.du.a aVar, x xVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "action");
        com.amazon.aps.iva.yb0.j.f(xVar, "model");
        if (com.amazon.aps.iva.yb0.j.a(aVar, a.C0206a.e)) {
            i.d(w.D(this), null, null, new p(this, xVar, null), 3);
        } else {
            S8(aVar, xVar);
        }
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    /* renamed from: O8 */
    public final void addEventListener(h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.e.addEventListener(hVar);
    }

    public final void S8(com.amazon.aps.iva.du.a aVar, x xVar) {
        HashMap<j<String, g>, com.amazon.aps.iva.du.a> hashMap = this.f;
        if (!hashMap.containsKey(new j(xVar.b, Q8(aVar)))) {
            v<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.ez.g<n>>> vVar = this.g;
            n P8 = P8(new n(aVar, xVar));
            com.amazon.aps.iva.yb0.j.f(vVar, "<this>");
            vVar.k(new com.amazon.aps.iva.ez.d<>(new g.b(P8)));
            i.d(w.D(this), null, null, new com.amazon.aps.iva.wt.q(this, aVar, xVar, null), 3).s0(new a(aVar, xVar));
        }
        hashMap.put(new j<>(xVar.b, Q8(aVar)), aVar);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.e.clear();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final int getListenerCount() {
        return this.e.getListenerCount();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super h, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "action");
        this.e.notify(lVar);
    }

    @Override // com.ellation.crunchyroll.commenting.comments.action.CommentActionViewModel
    public final v p5() {
        return this.g;
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(h hVar) {
        h hVar2 = hVar;
        com.amazon.aps.iva.yb0.j.f(hVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.e.removeEventListener(hVar2);
    }
}
