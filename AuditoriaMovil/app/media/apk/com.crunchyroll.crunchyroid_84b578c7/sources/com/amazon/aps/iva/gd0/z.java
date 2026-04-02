package com.amazon.aps.iva.gd0;
/* compiled from: SignatureBuildingComponents.kt */
/* loaded from: classes4.dex */
public final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, CharSequence> {
    public static final z h = new z();

    public z() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final CharSequence invoke(String str) {
        String str2 = str;
        com.amazon.aps.iva.yb0.j.f(str2, "it");
        if (str2.length() > 1) {
            return "L" + str2 + ';';
        }
        return str2;
    }
}
