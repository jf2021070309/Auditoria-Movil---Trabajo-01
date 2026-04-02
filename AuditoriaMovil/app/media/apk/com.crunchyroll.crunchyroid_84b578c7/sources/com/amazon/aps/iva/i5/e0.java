package com.amazon.aps.iva.i5;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.i5.u;
/* compiled from: Transformations.kt */
/* loaded from: classes.dex */
public final class e0 implements w<Object> {
    public LiveData<Object> a;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Object, LiveData<Object>> b;
    public final /* synthetic */ u<Object> c;

    /* compiled from: Transformations.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Object, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ u<Object> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u<Object> uVar) {
            super(1);
            this.h = uVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Object obj) {
            this.h.k(obj);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public e0(u uVar, com.amazon.aps.iva.xb0.l lVar) {
        this.b = lVar;
        this.c = uVar;
    }

    @Override // com.amazon.aps.iva.i5.w
    public final void onChanged(Object obj) {
        u.a<?> e;
        LiveData<Object> invoke = this.b.invoke(obj);
        LiveData<?> liveData = this.a;
        if (liveData == invoke) {
            return;
        }
        u<Object> uVar = this.c;
        if (liveData != null && (e = uVar.l.e(liveData)) != null) {
            e.a.j(e);
        }
        this.a = invoke;
        if (invoke != null) {
            uVar.l(invoke, new d0.a(new a(uVar)));
        }
    }
}
