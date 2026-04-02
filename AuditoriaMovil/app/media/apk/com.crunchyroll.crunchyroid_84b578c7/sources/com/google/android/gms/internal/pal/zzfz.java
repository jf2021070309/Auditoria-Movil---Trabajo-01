package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzfz extends zzgc {
    public zzfz(int i, String str, Float f) {
        super(1, str, f, null);
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Float.valueOf((float) cVar.optDouble(zzl(), ((Float) zzk()).floatValue()));
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Float) zzk();
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzl(), ((Float) zzk()).floatValue()));
    }
}
