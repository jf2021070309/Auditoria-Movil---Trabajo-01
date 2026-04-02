package com.amazon.aps.iva.v1;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.compose.ui.node.e, Boolean> {
    public static final i0 h = new i0();

    public i0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(androidx.compose.ui.node.e eVar) {
        boolean z;
        androidx.compose.ui.node.e eVar2 = eVar;
        com.amazon.aps.iva.yb0.j.f(eVar2, "it");
        com.amazon.aps.iva.a2.l s = eVar2.s();
        boolean z2 = true;
        if (s != null && s.c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !s.d(com.amazon.aps.iva.a2.k.h)) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
