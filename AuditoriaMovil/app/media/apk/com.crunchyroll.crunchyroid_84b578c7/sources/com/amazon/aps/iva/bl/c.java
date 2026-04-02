package com.amazon.aps.iva.bl;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: PlayerTimelineDataProvider.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<LiveData<h>> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final LiveData<h> invoke() {
        d dVar = this.h;
        return j.b(new b(dVar.a), dVar.b.invoke());
    }
}
