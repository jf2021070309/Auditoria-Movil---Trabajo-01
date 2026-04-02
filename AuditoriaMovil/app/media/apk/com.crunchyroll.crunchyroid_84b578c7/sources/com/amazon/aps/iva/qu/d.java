package com.amazon.aps.iva.qu;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.nu.g;
import com.amazon.aps.iva.wy.h;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.commenting.entrypoint.CommentsEntryPoint;
/* compiled from: CommentsEntryPointPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final g b;
    public String c;

    /* compiled from: CommentsEntryPointPresenter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements l<com.amazon.aps.iva.ez.g<? extends Integer>, q> {
        public a(h hVar) {
            super(1, hVar, e.class, "bindCommentsCount", "bindCommentsCount(Lcom/ellation/crunchyroll/mvp/viewmodel/Resource;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends Integer> gVar) {
            com.amazon.aps.iva.ez.g<? extends Integer> gVar2 = gVar;
            j.f(gVar2, "p0");
            ((e) this.receiver).n2(gVar2);
            return q.a;
        }
    }

    /* compiled from: CommentsEntryPointPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, f {
        public final /* synthetic */ l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof f)) {
                return false;
            }
            return j.a(this.a, ((f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    public d(CommentsEntryPoint commentsEntryPoint, g gVar) {
        super(commentsEntryPoint, new com.amazon.aps.iva.wy.j[0]);
        this.b = gVar;
    }

    @Override // com.amazon.aps.iva.qu.c
    public final void h() {
        e view = getView();
        String str = this.c;
        if (str != null) {
            view.u6(str);
        } else {
            j.m("mediaId");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.M7().e(getView(), new b(new a(getView())));
    }

    @Override // com.amazon.aps.iva.qu.c
    public final void v(String str) {
        j.f(str, "mediaId");
        this.c = str;
        this.b.K2(str);
    }
}
