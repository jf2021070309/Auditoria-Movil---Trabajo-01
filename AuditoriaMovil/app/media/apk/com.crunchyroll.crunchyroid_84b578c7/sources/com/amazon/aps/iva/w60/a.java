package com.amazon.aps.iva.w60;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.toolbar.ToolbarDivider;
/* compiled from: ToolbarDivider.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<b> {
    public final /* synthetic */ ToolbarDivider h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ToolbarDivider toolbarDivider) {
        super(0);
        this.h = toolbarDivider;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final b invoke() {
        ToolbarDivider toolbarDivider = this.h;
        j.f(toolbarDivider, "view");
        return new c(toolbarDivider);
    }
}
