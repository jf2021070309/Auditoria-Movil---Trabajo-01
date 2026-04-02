package com.amazon.aps.iva.q2;
/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ t h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar) {
        super(0);
        this.h = tVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        com.amazon.aps.iva.s1.q parentLayoutCoordinates;
        boolean z;
        t tVar = this.h;
        parentLayoutCoordinates = tVar.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null && tVar.m22getPopupContentSizebOM6tXw() != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
