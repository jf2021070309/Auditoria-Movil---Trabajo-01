package com.amazon.aps.iva.ip;

import android.content.res.Configuration;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.el.h0;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: WatchScreenComponentsVisibilityPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<com.amazon.aps.iva.ip.b> {
    public final boolean b;
    public final LiveData<h0> c;

    /* compiled from: WatchScreenComponentsVisibilityPresenter.kt */
    /* renamed from: com.amazon.aps.iva.ip.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0385a extends l implements com.amazon.aps.iva.xb0.l<h0, q> {
        public C0385a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(h0 h0Var) {
            boolean isFullscreen = h0Var.isFullscreen();
            a aVar = a.this;
            if (isFullscreen) {
                aVar.q6();
                aVar.getView().Lg();
            } else {
                aVar.q6();
                aVar.getView().P1();
            }
            return q.a;
        }
    }

    /* compiled from: WatchScreenComponentsVisibilityPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(C0385a c0385a) {
            this.a = c0385a;
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
    public a(boolean z, com.amazon.aps.iva.ip.b bVar, LiveData<h0> liveData) {
        super(bVar, new com.amazon.aps.iva.wy.j[0]);
        j.f(bVar, "view");
        this.b = z;
        this.c = liveData;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        if (!this.b) {
            getView().r0();
        }
        q6();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        b bVar = new b(new C0385a());
        this.c.e(getView(), bVar);
    }

    public final void q6() {
        if (!getView().G7() && getView().Ud()) {
            getView().U0();
        } else {
            getView().W0();
        }
    }
}
