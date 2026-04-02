package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.bu.h;
import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.j8.f;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: CommentsDataSource.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.j8.f<Integer, x> implements b {
    public final q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super CommentPreview>, Object> f;
    public final com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> g;
    public final p<Throwable, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object>, com.amazon.aps.iva.kb0.q> h;
    public final com.amazon.aps.iva.bu.a i;
    public final List<x> j;
    public int k;
    public Integer l;

    /* compiled from: CommentsDataSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.list.datasource.CommentsDataSourceImpl$loadAfter$1", f = "CommentsDataSource.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ Integer j;
        public final /* synthetic */ f.C0407f<Integer> k;
        public final /* synthetic */ f.a<Integer, x> l;

        /* compiled from: CommentsDataSource.kt */
        @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.list.datasource.CommentsDataSourceImpl$loadAfter$1$2", f = "CommentsDataSource.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.amazon.aps.iva.bu.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0153a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
            public final /* synthetic */ m h;
            public final /* synthetic */ f.C0407f<Integer> i;
            public final /* synthetic */ f.a<Integer, x> j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0153a(m mVar, f.C0407f<Integer> c0407f, f.a<Integer, x> aVar, com.amazon.aps.iva.ob0.d<? super C0153a> dVar) {
                super(1, dVar);
                this.h = mVar;
                this.i = c0407f;
                this.j = aVar;
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
                return new C0153a(this.h, this.i, this.j, dVar);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
                return ((C0153a) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                com.amazon.aps.iva.ab.x.i0(obj);
                this.h.j(this.i, this.j);
                return com.amazon.aps.iva.kb0.q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, f.C0407f<Integer> c0407f, f.a<Integer, x> aVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = num;
            this.k = c0407f;
            this.l = aVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Integer num;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            Integer num2 = this.j;
            f.a<Integer, x> aVar2 = this.l;
            f.C0407f<Integer> c0407f = this.k;
            m mVar = m.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super CommentPreview>, Object> qVar = mVar.f;
                    com.amazon.aps.iva.yb0.j.e(num2, "page");
                    Integer num3 = new Integer(c0407f.b);
                    this.h = 1;
                    obj = qVar.invoke(num2, num3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                CommentPreview commentPreview = (CommentPreview) obj;
                List<x> list = mVar.j;
                List<x> list2 = mVar.j;
                List<Comment> comments = commentPreview.getComments();
                ArrayList arrayList = new ArrayList(r.Y(comments));
                for (Comment comment : comments) {
                    arrayList.add(l1.K(comment, null));
                }
                list.addAll(arrayList);
                mVar.k = Math.max(mVar.k, Math.max(commentPreview.getTotal(), list2.size()));
                if (list2.size() == mVar.k) {
                    num = null;
                } else {
                    num = new Integer(num2.intValue() + 1);
                }
                mVar.l = num;
                mVar.g.invoke(new Integer(mVar.k));
                aVar2.a(mVar.l, com.amazon.aps.iva.lb0.x.X0(list2.subList(list2.size() - commentPreview.getComments().size(), list2.size())));
            } catch (IOException e) {
                mVar.h.invoke(new com.amazon.aps.iva.cu.b(e), new C0153a(mVar, c0407f, aVar2, null));
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public m(h.d dVar, com.amazon.aps.iva.xb0.l lVar, p pVar, com.amazon.aps.iva.bu.a aVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "onSuccess");
        com.amazon.aps.iva.yb0.j.f(pVar, "onFailure");
        this.f = dVar;
        this.g = lVar;
        this.h = pVar;
        this.i = aVar;
        List<x> synchronizedList = Collections.synchronizedList(new ArrayList());
        com.amazon.aps.iva.yb0.j.e(synchronizedList, "synchronizedList(mutableListOf())");
        this.j = synchronizedList;
        this.k = aVar.b;
        this.l = aVar.c;
    }

    @Override // com.amazon.aps.iva.bu.b
    public final int a() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.bu.b
    public final Integer c() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void j(f.C0407f<Integer> c0407f, f.a<Integer, x> aVar) {
        com.amazon.aps.iva.yb0.j.f(c0407f, "params");
        com.amazon.aps.iva.yb0.j.f(aVar, "callback");
        Integer num = c0407f.a;
        if (num != null) {
            com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new a(num, c0407f, aVar, null));
        }
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void k(f.C0407f c0407f, f.b bVar) {
    }

    @Override // com.amazon.aps.iva.j8.f
    public final void m(f.e eVar, f.d dVar) {
        int i;
        com.amazon.aps.iva.bu.a aVar = this.i;
        List<x> list = this.j;
        list.addAll(aVar.a);
        List<x> list2 = aVar.a;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (x xVar : list2) {
                if (xVar.q && (i = i + 1) < 0) {
                    f1.R();
                    throw null;
                }
            }
        }
        int i2 = aVar.b;
        this.g.invoke(Integer.valueOf(Math.max(0, i2 - i)));
        dVar.a(list, i2, aVar.c);
    }

    @Override // com.amazon.aps.iva.bu.b
    public final List<x> x() {
        return this.j;
    }
}
