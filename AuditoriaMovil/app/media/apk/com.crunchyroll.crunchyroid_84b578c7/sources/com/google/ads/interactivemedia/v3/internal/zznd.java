package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zznd extends zznj {
    public zznd(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Boolean.valueOf(cVar.optBoolean(zzl(), ((Boolean) zzk()).booleanValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Boolean) zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzl(), ((Boolean) zzk()).booleanValue()));
    }
}
