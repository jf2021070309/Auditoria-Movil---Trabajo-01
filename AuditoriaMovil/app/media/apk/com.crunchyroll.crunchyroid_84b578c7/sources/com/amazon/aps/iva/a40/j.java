package com.amazon.aps.iva.a40;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
/* compiled from: ChangePasswordPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<m> implements f {
    public final com.amazon.aps.iva.y30.h b;
    public final n c;
    public final k d;
    public final com.amazon.aps.iva.ty.b e;

    /* compiled from: ChangePasswordPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar) {
            com.amazon.aps.iva.ez.d<? extends com.amazon.aps.iva.ez.g<? extends q>> dVar2 = dVar;
            j jVar = j.this;
            ((com.amazon.aps.iva.ez.g) dVar2.b).c(new g(jVar));
            com.amazon.aps.iva.ez.g<? extends q> a = dVar2.a();
            if (a != null) {
                a.e(new h(jVar));
                a.b(new i(jVar));
            }
            return q.a;
        }
    }

    /* compiled from: ChangePasswordPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
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

    public j(com.amazon.aps.iva.a40.a aVar, com.amazon.aps.iva.y30.i iVar, o oVar, l lVar, com.amazon.aps.iva.ty.d dVar) {
        super(aVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = iVar;
        this.c = oVar;
        this.d = lVar;
        this.e = dVar;
    }

    @Override // com.amazon.aps.iva.a40.f
    public final void U3(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "newPassword");
        com.amazon.aps.iva.yb0.j.f(str2, "password");
        this.e.d();
        this.c.C2(str, str2);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.v7().e(getView(), new b(new a()));
    }
}
