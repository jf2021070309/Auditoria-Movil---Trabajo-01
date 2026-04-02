package com.amazon.aps.iva.e70;

import android.view.View;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CollapsibleToolbarLayout.kt */
/* loaded from: classes2.dex */
public final class c extends l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view) {
        super(0);
        this.h = view;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.h.isNestedScrollingEnabled());
    }
}
