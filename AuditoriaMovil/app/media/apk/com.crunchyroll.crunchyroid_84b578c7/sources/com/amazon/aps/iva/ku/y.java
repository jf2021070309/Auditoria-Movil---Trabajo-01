package com.amazon.aps.iva.ku;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.etp.commenting.model.Comment;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
/* compiled from: PostCommentViewModel.kt */
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.ez.b implements x {
    public final h b;
    public final b c;
    public final String d;
    public final String e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<Comment>> f;

    /* compiled from: PostCommentViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.commenting.comments.post.PostCommentViewModelImpl$postComment$1", f = "PostCommentViewModel.kt", l = {Encoder.DEFAULT_EC_PERCENT}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ String j;
        public final /* synthetic */ boolean k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = str;
            this.k = z;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            y yVar = y.this;
            try {
                if (i != 0) {
                    if (i == 1) {
                        com.amazon.aps.iva.ab.x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.amazon.aps.iva.ab.x.i0(obj);
                    h hVar = yVar.b;
                    String str = yVar.d;
                    String str2 = this.j;
                    boolean z = this.k;
                    String str3 = yVar.e;
                    this.h = 1;
                    obj = hVar.r(str, str2, z, str3, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                Comment comment = (Comment) obj;
                yVar.f.k(new g.c(comment, null));
                yVar.c.a(comment);
            } catch (IOException e) {
                com.amazon.aps.iva.e4.e.g(null, e, yVar.f);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i iVar, c cVar, String str, String str2) {
        super(new com.amazon.aps.iva.wy.j[0]);
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        this.b = iVar;
        this.c = cVar;
        this.d = str;
        this.e = str2;
        this.f = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.ku.x
    public final void a2(String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "message");
        com.amazon.aps.iva.ez.h.c(this.f, null);
        com.amazon.aps.iva.se0.i.d(com.amazon.aps.iva.e.w.D(this), null, null, new a(str, z, null), 3);
    }

    @Override // com.amazon.aps.iva.ku.x
    public final com.amazon.aps.iva.i5.v q6() {
        return this.f;
    }
}
