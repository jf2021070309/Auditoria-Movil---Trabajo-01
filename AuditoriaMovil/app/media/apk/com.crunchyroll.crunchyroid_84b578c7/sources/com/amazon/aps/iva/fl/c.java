package com.amazon.aps.iva.fl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerPinchToZoomPresenter.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> {
    public final LiveData<h0> b;

    /* compiled from: PlayerPinchToZoomPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<h0, q> {

        /* compiled from: PlayerPinchToZoomPresenter.kt */
        /* renamed from: com.amazon.aps.iva.fl.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0252a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[h0.values().length];
                try {
                    iArr[h0.MINIMIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                a = iArr;
            }
        }

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(h0 h0Var) {
            int i;
            h0 h0Var2 = h0Var;
            if (h0Var2 == null) {
                i = -1;
            } else {
                i = C0252a.a[h0Var2.ordinal()];
            }
            c cVar = c.this;
            if (i == 1) {
                cVar.getView().n5();
            } else {
                cVar.getView().v8();
            }
            return q.a;
        }
    }

    /* compiled from: PlayerPinchToZoomPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LiveData<h0> liveData, d dVar) {
        super(dVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(dVar, "view");
        this.b = liveData;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        b bVar = new b(new a());
        this.b.e(getView(), bVar);
    }
}
