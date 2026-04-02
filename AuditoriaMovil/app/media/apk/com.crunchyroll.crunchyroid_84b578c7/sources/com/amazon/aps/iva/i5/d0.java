package com.amazon.aps.iva.i5;

import androidx.lifecycle.LiveData;
/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class d0 {

    /* compiled from: Transformations.kt */
    /* loaded from: classes.dex */
    public static final class a implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public a(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
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

    public static final u a(LiveData liveData) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        u uVar = new u();
        com.amazon.aps.iva.yb0.z zVar = new com.amazon.aps.iva.yb0.z();
        boolean z = true;
        zVar.b = true;
        if (liveData.e == LiveData.k) {
            z = false;
        }
        if (z) {
            uVar.k(liveData.d());
            zVar.b = false;
        }
        uVar.l(liveData, new a(new b0(uVar, zVar)));
        return uVar;
    }

    public static final u b(LiveData liveData, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        u uVar = new u();
        uVar.l(liveData, new a(new c0(uVar, lVar)));
        return uVar;
    }

    public static final u c(LiveData liveData, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "transform");
        u uVar = new u();
        uVar.l(liveData, new e0(uVar, lVar));
        return uVar;
    }
}
