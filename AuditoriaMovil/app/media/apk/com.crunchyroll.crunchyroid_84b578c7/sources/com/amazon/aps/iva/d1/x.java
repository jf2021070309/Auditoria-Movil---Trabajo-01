package com.amazon.aps.iva.d1;
/* compiled from: FocusState.kt */
/* loaded from: classes.dex */
public enum x implements w {
    Active,
    ActiveParent,
    Captured,
    Inactive;

    /* compiled from: FocusState.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public boolean getHasFocus() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw new com.amazon.aps.iva.kb0.h();
    }

    public boolean isCaptured() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return false;
    }

    @Override // com.amazon.aps.iva.d1.w
    public boolean isFocused() {
        int i = a.a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i != 3 && i != 4) {
            throw new com.amazon.aps.iva.kb0.h();
        }
        return false;
    }
}
