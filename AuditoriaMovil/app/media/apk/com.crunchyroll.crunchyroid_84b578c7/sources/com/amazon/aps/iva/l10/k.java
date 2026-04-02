package com.amazon.aps.iva.l10;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import java.util.List;
/* compiled from: GenresListPresenter.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.wy.b<l> implements g {
    public String b;
    public final m c;
    public final com.amazon.aps.iva.n60.b d;

    /* compiled from: GenresListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.m10.e>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.m10.e>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.m10.e>> gVar2 = gVar;
            k kVar = k.this;
            gVar2.e(new h(kVar));
            gVar2.c(new i(kVar));
            gVar2.b(new j(kVar));
            return q.a;
        }
    }

    /* compiled from: GenresListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            k.this.c.P7();
            return q.a;
        }
    }

    /* compiled from: GenresListPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(a aVar) {
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

    public k(e eVar, String str, n nVar, com.amazon.aps.iva.n60.c cVar) {
        super(eVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = str;
        this.c = nVar;
        this.d = cVar;
    }

    @Override // com.amazon.aps.iva.l10.g
    public final void b() {
        this.c.P7();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.c.j2().e(getView(), new c(new a()));
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.d.b(new b());
    }
}
