package com.amazon.aps.iva.p2;

import android.content.Context;
import com.amazon.aps.iva.o0.g0;
import com.amazon.aps.iva.x0.i;
import com.amazon.aps.iva.yb0.l;
/* compiled from: AndroidView.android.kt */
/* loaded from: classes.dex */
public final class e extends l implements com.amazon.aps.iva.xb0.a<androidx.compose.ui.node.e> {
    public final /* synthetic */ Context h;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<Context, Object> i;
    public final /* synthetic */ g0 j;
    public final /* synthetic */ i k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, com.amazon.aps.iva.xb0.l<? super Context, Object> lVar, g0 g0Var, i iVar, int i) {
        super(0);
        this.h = context;
        this.i = lVar;
        this.j = g0Var;
        this.k = iVar;
        this.l = i;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final androidx.compose.ui.node.e invoke() {
        return new g(this.h, this.i, this.j, this.k, this.l).getLayoutNode();
    }
}
