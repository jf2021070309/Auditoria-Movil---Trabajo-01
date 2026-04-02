package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzne extends zznj {
    public zzne(int i, String str, Integer num) {
        super(1, str, num, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Integer.valueOf(cVar.optInt(zzl(), ((Integer) zzk()).intValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Integer) zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(zzl(), ((Integer) zzk()).intValue()));
    }
}
