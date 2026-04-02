package com.amazon.aps.iva.dz;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.u;
import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.f;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: SingleSourceMediatorLiveData.kt */
/* loaded from: classes2.dex */
public final class a<T> extends u<T> {
    public LiveData<T> m;

    /* compiled from: SingleSourceMediatorLiveData.kt */
    /* renamed from: com.amazon.aps.iva.dz.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0210a implements w, f {
        public final /* synthetic */ l a;

        public C0210a(b bVar) {
            this.a = bVar;
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

    /* compiled from: SingleSourceMediatorLiveData.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements l<T, q> {
        public final /* synthetic */ a<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar) {
            super(1);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Object obj) {
            this.h.k(obj);
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(LiveData<T> liveData) {
        u.a<?> e;
        j.f(liveData, FirebaseAnalytics.Param.SOURCE);
        LiveData<T> liveData2 = this.m;
        if (liveData2 != null && (e = this.l.e(liveData2)) != null) {
            e.a.j(e);
        }
        l(liveData, new C0210a(new b(this)));
        this.m = liveData;
    }
}
