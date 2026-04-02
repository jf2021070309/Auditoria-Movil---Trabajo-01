package com.amazon.aps.iva.xw;

import com.google.android.material.appbar.AppBarLayout;
/* compiled from: AppBarLayoutExtensions.kt */
/* loaded from: classes2.dex */
public final class d extends AppBarLayout.Behavior.DragCallback {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> a;

    public d(com.amazon.aps.iva.xb0.a<Boolean> aVar) {
        this.a = aVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
    public final boolean canDrag(AppBarLayout appBarLayout) {
        com.amazon.aps.iva.yb0.j.f(appBarLayout, "appBarLayout");
        return this.a.invoke().booleanValue();
    }
}
