package com.ellation.crunchyroll.presentation.main;

import com.amazon.aps.iva.cx.m;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.y30.l0;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.presentation.main.c;
import com.google.android.gms.common.internal.ImagesContract;
/* compiled from: BottomNavigationBarPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<com.ellation.crunchyroll.presentation.main.b> {
    public final l0 b;
    public final m c;
    public final boolean d;
    public final boolean e;

    /* compiled from: BottomNavigationBarPresenter.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.main.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0970a extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public C0970a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            j.e(str2, ImagesContract.URL);
            a.this.getView().setAccountUiModel(new c.a(str2));
            return q.a;
        }
    }

    /* compiled from: BottomNavigationBarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<String, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(String str) {
            String str2 = str;
            a aVar = a.this;
            if (str2 != null) {
                aVar.getView().Db();
            } else {
                aVar.getView().va();
            }
            return q.a;
        }
    }

    /* compiled from: BottomNavigationBarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class c implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public c(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.ellation.crunchyroll.presentation.main.b bVar, l0 l0Var, m mVar, boolean z, boolean z2) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(bVar, "view");
        this.b = l0Var;
        this.c = mVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        if (this.d && !this.e) {
            getView().o7();
            getView().ve();
        } else {
            getView().ze();
            getView().za();
        }
        l0 l0Var = this.b;
        l0Var.j3().e(getView(), new c(new C0970a()));
        if (this.c.isEnabled()) {
            l0Var.p8().e(getView(), new c(new b()));
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onResume() {
        this.b.B1();
    }
}
