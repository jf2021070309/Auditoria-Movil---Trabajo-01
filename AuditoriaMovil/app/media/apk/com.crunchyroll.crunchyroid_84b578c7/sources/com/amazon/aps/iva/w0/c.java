package com.amazon.aps.iva.w0;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.o;
import com.amazon.aps.iva.o0.q1;
import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.o0.v0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: LiveDataAdapter.kt */
/* loaded from: classes.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.l<v0, u0> {
    public final /* synthetic */ LiveData<Object> h;
    public final /* synthetic */ o i;
    public final /* synthetic */ q1<Object> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LiveData<Object> liveData, o oVar, q1<Object> q1Var) {
        super(1);
        this.h = liveData;
        this.i = oVar;
        this.j = q1Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final u0 invoke(v0 v0Var) {
        j.f(v0Var, "$this$DisposableEffect");
        b bVar = new b(this.j);
        o oVar = this.i;
        LiveData<Object> liveData = this.h;
        liveData.e(oVar, bVar);
        return new a(liveData, bVar);
    }
}
