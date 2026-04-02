package com.kwad.framework.filedownloader.d;
/* loaded from: classes.dex */
public final class d {
    public static boolean bA(int i) {
        return i < 0;
    }

    public static boolean bB(int i) {
        return i > 0;
    }

    public static boolean f(com.kwad.framework.filedownloader.a aVar) {
        return aVar.ta() == 0 || aVar.ta() == 3;
    }

    public static boolean r(int i, int i2) {
        if ((i == 3 || i == 5 || i != i2) && !bA(i)) {
            if (i <= 0 || i > 6 || i2 < 10 || i2 > 11) {
                if (i == 1) {
                    return i2 != 0;
                } else if (i == 2) {
                    return (i2 == 0 || i2 == 1 || i2 == 6) ? false : true;
                } else if (i == 3) {
                    return (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 6) ? false : true;
                } else if (i == 5) {
                    return (i2 == 1 || i2 == 6) ? false : true;
                } else if (i != 6) {
                    return true;
                } else {
                    return (i2 == 0 || i2 == 1) ? false : true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean s(int i, int i2) {
        if ((i == 3 || i == 5 || i != i2) && !bA(i)) {
            if (i2 == -2 || i2 == -1) {
                return true;
            }
            if (i == 0) {
                return i2 == 10;
            } else if (i == 1) {
                return i2 == 6;
            } else if (i == 2 || i == 3) {
                return i2 == -3 || i2 == 3 || i2 == 5;
            } else if (i == 5 || i == 6) {
                return i2 == 2 || i2 == 5;
            } else if (i == 10) {
                return i2 == 11;
            } else if (i != 11) {
                return false;
            } else {
                return i2 == -4 || i2 == -3 || i2 == 1;
            }
        }
        return false;
    }
}
