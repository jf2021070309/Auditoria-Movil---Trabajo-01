package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzflh extends zzflg {
    private final char zza;

    public zzflh(char c2) {
        this.zza = c2;
    }

    public final String toString() {
        int i2 = this.zza;
        char[] cArr = {CoreConstants.ESCAPE_CHAR, 'u', 0, 0, 0, 0};
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i2 & 15);
            i2 >>= 4;
        }
        String copyValueOf = String.copyValueOf(cArr);
        return a.s(new StringBuilder(String.valueOf(copyValueOf).length() + 18), "CharMatcher.is('", copyValueOf, "')");
    }

    @Override // com.google.android.gms.internal.ads.zzflk
    public final boolean zza(char c2) {
        return c2 == this.zza;
    }
}
