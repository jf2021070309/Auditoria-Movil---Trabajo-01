package com.amazon.aps.iva.xw;

import androidx.lifecycle.LiveData;
/* compiled from: LiveDataExtensions.kt */
/* loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LiveDataExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements com.amazon.aps.iva.i5.w<T> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, Boolean> a;
        public final /* synthetic */ LiveData<T> b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<T, com.amazon.aps.iva.kb0.q> c;

        public a(LiveData liveData, com.amazon.aps.iva.xb0.l lVar, com.amazon.aps.iva.xb0.l lVar2) {
            this.a = lVar;
            this.b = liveData;
            this.c = lVar2;
        }

        @Override // com.amazon.aps.iva.i5.w
        public final void onChanged(T t) {
            if (this.a.invoke(t).booleanValue()) {
                this.b.j(this);
                this.c.invoke(t);
            }
        }
    }

    public static final <T> T a(LiveData<T> liveData) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        T d = liveData.d();
        com.amazon.aps.iva.yb0.j.c(d);
        return d;
    }

    public static final <T> void b(LiveData<T> liveData, com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xb0.l<? super T, Boolean> lVar, com.amazon.aps.iva.xb0.l<? super T, com.amazon.aps.iva.kb0.q> lVar2) {
        com.amazon.aps.iva.yb0.j.f(liveData, "<this>");
        com.amazon.aps.iva.yb0.j.f(oVar, "lifecycleOwner");
        com.amazon.aps.iva.yb0.j.f(lVar, "predicate");
        liveData.e(oVar, new a(liveData, lVar, lVar2));
    }
}
