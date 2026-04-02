package com.amazon.aps.iva.k40;

import androidx.lifecycle.p;
import com.amazon.aps.iva.a20.c;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.y30.w;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
/* compiled from: SelectedHeaderViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.ez.b implements b {
    public final v<com.amazon.aps.iva.k40.a> b;
    public final v<com.amazon.aps.iva.y30.c> c;

    /* compiled from: SelectedHeaderViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w, f {
        public final /* synthetic */ l a;

        public a(l lVar) {
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
    public d(p pVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        j.f(pVar, "savedStateHandler");
        this.b = pVar.c("selected_header_event");
        this.c = pVar.c("selected_header");
    }

    @Override // com.amazon.aps.iva.k40.b
    public final void R5(o oVar, c.b bVar) {
        j.f(oVar, "owner");
        this.b.e(oVar, new a(new c(bVar)));
    }

    @Override // com.amazon.aps.iva.k40.b
    public final void S3(o oVar, w.h hVar) {
        j.f(oVar, "owner");
        this.c.e(oVar, new a(hVar));
    }

    @Override // com.amazon.aps.iva.k40.b
    public final void U2(com.amazon.aps.iva.y30.c cVar) {
        j.f(cVar, "preferenceHeader");
        this.b.k(new com.amazon.aps.iva.k40.a(cVar));
        this.c.k(cVar);
    }

    @Override // com.amazon.aps.iva.k40.b
    public final com.amazon.aps.iva.y30.c k6() {
        com.amazon.aps.iva.y30.c d = this.c.d();
        if (d == null) {
            return com.amazon.aps.iva.y30.c.DEFAULT;
        }
        return d;
    }
}
