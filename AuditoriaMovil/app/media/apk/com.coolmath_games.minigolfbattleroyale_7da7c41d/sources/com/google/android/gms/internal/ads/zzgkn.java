package com.google.android.gms.internal.ads;

import android.util.Log;
import com.facebook.internal.security.CertificateUtil;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgkn extends zzgks {
    final String zza;

    public zzgkn(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgks
    public final void zza(String str) {
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
