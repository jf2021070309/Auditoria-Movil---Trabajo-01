package com.amazon.aps.iva.wk;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AdsTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.a<LiveData<a>> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(0);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final LiveData<a> invoke() {
        e eVar = this.h;
        return j.b(new c(eVar.a), eVar.b.invoke());
    }
}
