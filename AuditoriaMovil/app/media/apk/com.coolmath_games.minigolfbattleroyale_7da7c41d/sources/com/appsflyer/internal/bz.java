package com.appsflyer.internal;
/* loaded from: classes.dex */
public final class bz {
    public static char[] valueOf(long j, char[] cArr) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i = 4;
        int i2 = 0;
        for (int i3 = 0; i3 < cArr.length; i3++) {
            if ((((j >>> i3) & 1) != 1 || i2 >= 4) && i < length) {
                cArr2[i] = cArr[i3];
                i++;
            } else {
                cArr2[i2] = cArr[i3];
                i2++;
            }
        }
        return cArr2;
    }
}
