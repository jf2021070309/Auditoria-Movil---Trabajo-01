package com.amazon.aps.iva.y10;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.presentation.main.lists.MyListsBottomBarActivity;
/* compiled from: MyListBottomBarPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements f {
    public final com.amazon.aps.iva.uw.a b;

    /* compiled from: MyListBottomBarPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Boolean, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.amazon.aps.iva.yb0.j.e(bool2, "isInEditMode");
            boolean booleanValue = bool2.booleanValue();
            g gVar = g.this;
            if (booleanValue) {
                gVar.getView().Kc();
            } else {
                gVar.getView().ch();
            }
            return q.a;
        }
    }

    /* compiled from: MyListBottomBarPresenter.kt */
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

    public g(com.amazon.aps.iva.uw.a aVar, MyListsBottomBarActivity myListsBottomBarActivity) {
        super(myListsBottomBarActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = aVar;
    }

    @Override // com.amazon.aps.iva.y10.f
    public final void a() {
        com.amazon.aps.iva.uw.a aVar = this.b;
        T d = aVar.a1().d();
        com.amazon.aps.iva.yb0.j.c(d);
        if (((Boolean) d).booleanValue()) {
            aVar.u();
        } else {
            getView().closeScreen();
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.a1().e(getView(), new b(new a()));
    }
}
