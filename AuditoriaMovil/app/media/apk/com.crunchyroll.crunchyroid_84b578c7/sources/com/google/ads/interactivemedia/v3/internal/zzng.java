package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzng extends zznj {
    public zzng(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Float.valueOf((float) cVar.optDouble(zzl(), ((Float) zzk()).floatValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Float) zzk();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zznj
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzl(), ((Float) zzk()).floatValue()));
    }
}
