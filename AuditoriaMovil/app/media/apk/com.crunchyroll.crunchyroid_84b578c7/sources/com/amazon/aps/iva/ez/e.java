package com.amazon.aps.iva.ez;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
/* compiled from: Event.kt */
/* loaded from: classes2.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Event.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<d<? extends T>, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
            super(1);
            this.h = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Object obj) {
            Object a;
            d dVar = (d) obj;
            if (dVar != null && (a = dVar.a()) != null) {
                this.h.invoke(a);
            }
            return q.a;
        }
    }

    /* compiled from: Event.kt */
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

    public static final <T> void a(LiveData<d<T>> liveData, o oVar, com.amazon.aps.iva.xb0.l<? super T, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        liveData.e(oVar, new b(new a(lVar)));
    }
}
