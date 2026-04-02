package com.amazon.aps.iva.v1;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.amazon.aps.iva.p3.g0;
import java.util.HashMap;
import java.util.WeakHashMap;
/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
public final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ AndroidComposeView h;
    public final /* synthetic */ com.amazon.aps.iva.p2.a i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AndroidComposeView androidComposeView, com.amazon.aps.iva.p2.a aVar) {
        super(0);
        this.h = androidComposeView;
        this.i = aVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        AndroidComposeView androidComposeView = this.h;
        x0 androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
        com.amazon.aps.iva.p2.a aVar = this.i;
        androidViewsHandler$ui_release.removeViewInLayout(aVar);
        HashMap<androidx.compose.ui.node.e, com.amazon.aps.iva.p2.a> layoutNodeToHolder = androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        androidx.compose.ui.node.e remove = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(aVar);
        com.amazon.aps.iva.yb0.h0.c(layoutNodeToHolder);
        layoutNodeToHolder.remove(remove);
        WeakHashMap<View, com.amazon.aps.iva.p3.r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
        g0.d.s(aVar, 0);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
