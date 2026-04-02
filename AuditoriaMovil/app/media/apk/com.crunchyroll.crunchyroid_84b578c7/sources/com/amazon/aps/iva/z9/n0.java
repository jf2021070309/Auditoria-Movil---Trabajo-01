package com.amazon.aps.iva.z9;
/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum n0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n0.values().length];
            a = iArr;
            try {
                iArr[n0.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[n0.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[n0.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean useSoftwareRendering(int i, boolean z, int i2) {
        int i3 = a.a[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            return true;
        }
        if ((!z || i >= 28) && i2 <= 4 && i > 25) {
            return false;
        }
        return true;
    }
}
