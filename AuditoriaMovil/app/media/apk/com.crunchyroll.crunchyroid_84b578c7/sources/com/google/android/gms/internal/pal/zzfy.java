package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzfy extends zzgc {
    public zzfy(int i, String str, Long l) {
        super(1, str, l, null);
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Long.valueOf(cVar.optLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzl())));
        }
        return (Long) zzk();
    }

    @Override // com.google.android.gms.internal.pal.zzgc
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzl(), ((Long) zzk()).longValue()));
    }
}
