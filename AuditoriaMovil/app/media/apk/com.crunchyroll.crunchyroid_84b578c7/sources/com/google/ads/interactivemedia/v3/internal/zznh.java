package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zznh extends zznj {
    public zznh(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return cVar.optString(zzl(), (String) zzk());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzl()));
        }
        return (String) zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzl(), (String) zzk());
    }
}
