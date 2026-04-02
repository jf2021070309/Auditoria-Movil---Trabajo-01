package com.amazon.aps.iva.y30;
/* compiled from: SettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class m0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, String> {
    public static final m0 h = new m0();

    public m0() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final String invoke(Integer num) {
        int intValue = num.intValue();
        if (intValue > 0) {
            return String.valueOf(intValue);
        }
        return null;
    }
}
