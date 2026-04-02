package com.amazon.aps.iva.m1;

import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.o0.y1;
import com.amazon.aps.iva.xb0.l;
/* compiled from: InputModeManager.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final l<a, Boolean> a;
    public final y1 b;

    public c(int i, AndroidComposeView.c cVar) {
        this.a = cVar;
        this.b = com.amazon.aps.iva.cq.b.c0(new a(i));
    }

    @Override // com.amazon.aps.iva.m1.b
    public final int a() {
        return ((a) this.b.getValue()).a;
    }
}
