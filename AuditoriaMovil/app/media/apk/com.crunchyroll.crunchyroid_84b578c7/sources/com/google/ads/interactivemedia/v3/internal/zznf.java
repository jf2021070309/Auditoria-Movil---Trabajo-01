package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zznf extends zznj {
    public zznf(int i, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Long.valueOf(cVar.optLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Long) zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzl(), ((Long) zzk()).longValue()));
    }
}
