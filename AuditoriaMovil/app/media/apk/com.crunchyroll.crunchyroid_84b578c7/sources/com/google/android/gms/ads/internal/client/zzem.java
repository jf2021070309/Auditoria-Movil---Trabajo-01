package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzem {
    private final String zza;
    private final Bundle zzb;
    private final String zzc;

    public zzem(String str, Bundle bundle, String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    public final Bundle zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        if (TextUtils.isEmpty(this.zzc)) {
            return "";
        }
        try {
            return new c(this.zzc).optString("request_id", "");
        } catch (b unused) {
            return "";
        }
    }
}
