package com.google.android.gms.ads;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (b unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final c zzb() throws b {
        c zzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            zzb.put("Response Info", "null");
        } else {
            zzb.put("Response Info", responseInfo.zzd());
        }
        return zzb;
    }
}
