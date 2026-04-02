package com.amazon.aps.iva.oc0;
/* compiled from: Modality.kt */
/* loaded from: classes4.dex */
public enum b0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a Companion = new a();

    /* compiled from: Modality.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static b0 a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return b0.SEALED;
            }
            if (z2) {
                return b0.ABSTRACT;
            }
            if (z3) {
                return b0.OPEN;
            }
            return b0.FINAL;
        }
    }
}
