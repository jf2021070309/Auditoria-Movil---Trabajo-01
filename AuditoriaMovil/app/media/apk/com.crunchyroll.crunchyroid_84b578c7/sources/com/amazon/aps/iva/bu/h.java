package com.amazon.aps.iva.bu;

import com.amazon.aps.iva.du.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.j8.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: CommentsDataSourceDelegate.kt */
/* loaded from: classes2.dex */
public final class h implements com.amazon.aps.iva.bu.c {
    public final n a;
    public final k b;
    public final h.c<x> c;
    public final com.amazon.aps.iva.xb0.l<Integer, q> d;
    public final p<Throwable, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ob0.d<? super q>, ? extends Object>, q> e;
    public com.amazon.aps.iva.bu.b f;
    public com.amazon.aps.iva.j8.h<x> g;
    public final v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<x>>> h;

    /* compiled from: CommentsDataSourceDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Exception, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Exception exc) {
            Exception exc2 = exc;
            com.amazon.aps.iva.yb0.j.f(exc2, "it");
            h.this.e.invoke(new com.amazon.aps.iva.cu.a(exc2), new g(null));
            return q.a;
        }
    }

    /* compiled from: CommentsDataSourceDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Exception, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Exception exc) {
            Exception exc2 = exc;
            com.amazon.aps.iva.yb0.j.f(exc2, "it");
            h.this.e.invoke(new com.amazon.aps.iva.cu.c(exc2), new i(null));
            return q.a;
        }
    }

    /* compiled from: CommentsDataSourceDelegate.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.list.datasource.CommentsDataSourceDelegateImpl", f = "CommentsDataSourceDelegate.kt", l = {62}, m = "reloadComments")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public h h;
        public com.amazon.aps.iva.xb0.l i;
        public /* synthetic */ Object j;
        public int l;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return h.this.a(null, this);
        }
    }

    /* compiled from: CommentsDataSourceDelegate.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class d extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.q<Integer, Integer, com.amazon.aps.iva.ob0.d<? super CommentPreview>, Object> {
        public d(n nVar) {
            super(3, nVar, n.class, "fetchComments", "fetchComments(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // com.amazon.aps.iva.xb0.q
        public final Object invoke(Integer num, Integer num2, com.amazon.aps.iva.ob0.d<? super CommentPreview> dVar) {
            return ((n) this.receiver).H1(num.intValue(), num2.intValue(), dVar);
        }
    }

    /* compiled from: CommentsDataSourceDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Exception, q> {
        public e() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Exception exc) {
            Exception exc2 = exc;
            com.amazon.aps.iva.yb0.j.f(exc2, "it");
            h.this.e.invoke(new com.amazon.aps.iva.cu.a(exc2), new j(null));
            return q.a;
        }
    }

    public h(com.amazon.aps.iva.vt.f fVar, k kVar, n nVar, com.amazon.aps.iva.xb0.l lVar, p pVar) {
        com.amazon.aps.iva.yb0.j.f(nVar, "commentsLoader");
        com.amazon.aps.iva.yb0.j.f(kVar, "commentsDataSourceFactory");
        com.amazon.aps.iva.yb0.j.f(lVar, "onPageLoadingSuccess");
        this.a = nVar;
        this.b = kVar;
        this.c = fVar;
        this.d = lVar;
        this.e = pVar;
        this.h = new v<>();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30)(1:31))|12|(2:15|13)|16|17|(3:19|20|21)(2:23|24)))|34|6|7|(0)(0)|12|(1:13)|16|17|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0098, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        r6.invoke(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[Catch: IOException -> 0x0098, LOOP:0: B:22:0x005d->B:24:0x0064, LOOP_END, TryCatch #0 {IOException -> 0x0098, blocks: (B:12:0x0027, B:21:0x0048, B:22:0x005d, B:24:0x0064, B:25:0x0072, B:27:0x008b, B:28:0x0092, B:29:0x0097, B:17:0x0036), top: B:34:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[Catch: IOException -> 0x0098, TryCatch #0 {IOException -> 0x0098, blocks: (B:12:0x0027, B:21:0x0048, B:22:0x005d, B:24:0x0064, B:25:0x0072, B:27:0x008b, B:28:0x0092, B:29:0x0097, B:17:0x0036), top: B:34:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: IOException -> 0x0098, TryCatch #0 {IOException -> 0x0098, blocks: (B:12:0x0027, B:21:0x0048, B:22:0x005d, B:24:0x0064, B:25:0x0072, B:27:0x008b, B:28:0x0092, B:29:0x0097, B:17:0x0036), top: B:34:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.xb0.l<? super java.lang.Exception, com.amazon.aps.iva.kb0.q> r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.bu.h.c
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.bu.h$c r0 = (com.amazon.aps.iva.bu.h.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.bu.h$c r0 = new com.amazon.aps.iva.bu.h$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.amazon.aps.iva.xb0.l r6 = r0.i
            com.amazon.aps.iva.bu.h r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: java.io.IOException -> L98
            goto L48
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.amazon.aps.iva.bu.n r7 = r5.a     // Catch: java.io.IOException -> L98
            r0.h = r5     // Catch: java.io.IOException -> L98
            r0.i = r6     // Catch: java.io.IOException -> L98
            r0.l = r3     // Catch: java.io.IOException -> L98
            r2 = 50
            java.lang.Object r7 = r7.H1(r3, r2, r0)     // Catch: java.io.IOException -> L98
            if (r7 != r1) goto L47
            return r1
        L47:
            r0 = r5
        L48:
            com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview r7 = (com.ellation.crunchyroll.api.etp.commenting.model.CommentPreview) r7     // Catch: java.io.IOException -> L98
            java.util.List r1 = r7.getComments()     // Catch: java.io.IOException -> L98
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.io.IOException -> L98
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.io.IOException -> L98
            int r3 = com.amazon.aps.iva.lb0.r.Y(r1)     // Catch: java.io.IOException -> L98
            r2.<init>(r3)     // Catch: java.io.IOException -> L98
            java.util.Iterator r1 = r1.iterator()     // Catch: java.io.IOException -> L98
        L5d:
            boolean r3 = r1.hasNext()     // Catch: java.io.IOException -> L98
            r4 = 0
            if (r3 == 0) goto L72
            java.lang.Object r3 = r1.next()     // Catch: java.io.IOException -> L98
            com.ellation.crunchyroll.api.etp.commenting.model.Comment r3 = (com.ellation.crunchyroll.api.etp.commenting.model.Comment) r3     // Catch: java.io.IOException -> L98
            com.amazon.aps.iva.du.x r3 = com.amazon.aps.iva.e4.l1.K(r3, r4)     // Catch: java.io.IOException -> L98
            r2.add(r3)     // Catch: java.io.IOException -> L98
            goto L5d
        L72:
            int r7 = r7.getTotal()     // Catch: java.io.IOException -> L98
            com.amazon.aps.iva.bu.a r1 = new com.amazon.aps.iva.bu.a     // Catch: java.io.IOException -> L98
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.io.IOException -> L98
            r1.<init>(r7, r2, r3)     // Catch: java.io.IOException -> L98
            r0.b(r1)     // Catch: java.io.IOException -> L98
            com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x>>> r7 = r0.h     // Catch: java.io.IOException -> L98
            com.amazon.aps.iva.ez.g$c r1 = new com.amazon.aps.iva.ez.g$c     // Catch: java.io.IOException -> L98
            com.amazon.aps.iva.j8.h<com.amazon.aps.iva.du.x> r0 = r0.g     // Catch: java.io.IOException -> L98
            if (r0 == 0) goto L92
            r1.<init>(r0, r4)     // Catch: java.io.IOException -> L98
            r7.k(r1)     // Catch: java.io.IOException -> L98
            goto L9c
        L92:
            java.lang.String r7 = "pagedList"
            com.amazon.aps.iva.yb0.j.m(r7)     // Catch: java.io.IOException -> L98
            throw r4     // Catch: java.io.IOException -> L98
        L98:
            r7 = move-exception
            r6.invoke(r7)
        L9c:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bu.h.a(com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final void b(com.amazon.aps.iva.bu.a aVar) {
        com.amazon.aps.iva.kb0.j a2 = this.b.a(this.c, this.d, this.e, new d(this.a), aVar);
        this.f = (com.amazon.aps.iva.bu.b) a2.b;
        this.g = (com.amazon.aps.iva.j8.h) a2.c;
    }

    @Override // com.amazon.aps.iva.bu.c
    public final void o(x xVar) {
        com.amazon.aps.iva.yb0.j.f(xVar, "updatedModel");
        com.amazon.aps.iva.bu.b bVar = this.f;
        if (bVar != null) {
            Iterator<x> it = bVar.x().iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (com.amazon.aps.iva.yb0.j.a(it.next().b, xVar.b)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= 0) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                com.amazon.aps.iva.bu.b bVar2 = this.f;
                if (bVar2 != null) {
                    ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(bVar2.x());
                    Z0.set(intValue, xVar);
                    com.amazon.aps.iva.bu.b bVar3 = this.f;
                    if (bVar3 != null) {
                        int a2 = bVar3.a();
                        com.amazon.aps.iva.bu.b bVar4 = this.f;
                        if (bVar4 != null) {
                            b(new com.amazon.aps.iva.bu.a(a2, Z0, bVar4.c()));
                            v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<x>>> vVar = this.h;
                            com.amazon.aps.iva.j8.h<x> hVar = this.g;
                            if (hVar != null) {
                                vVar.k(new g.c(hVar, null));
                                return;
                            } else {
                                com.amazon.aps.iva.yb0.j.m("pagedList");
                                throw null;
                            }
                        }
                        com.amazon.aps.iva.yb0.j.m("dataSource");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("dataSource");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("dataSource");
                throw null;
            }
            return;
        }
        com.amazon.aps.iva.yb0.j.m("dataSource");
        throw null;
    }

    @Override // com.amazon.aps.iva.bu.c
    public final v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<x>>> u0() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.bu.c
    public final Object v0(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        Object a2 = a(new b(), dVar);
        if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.bu.c
    public final Object w0(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        com.amazon.aps.iva.ez.h.c(this.h, null);
        Object a2 = a(new e(), dVar);
        if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.bu.c
    public final Object x0(com.amazon.aps.iva.ob0.d<? super q> dVar) {
        com.amazon.aps.iva.ez.h.c(this.h, null);
        Object a2 = a(new a(), dVar);
        if (a2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return a2;
        }
        return q.a;
    }
}
