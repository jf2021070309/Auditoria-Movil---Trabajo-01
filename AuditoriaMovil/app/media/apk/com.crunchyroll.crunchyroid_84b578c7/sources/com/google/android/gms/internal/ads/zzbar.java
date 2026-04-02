package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbar extends zzbax {
    public zzbar(int i, String str, Boolean bool) {
        super(i, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return Boolean.valueOf(cVar.optBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(zzn())));
        }
        return (Boolean) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(zzn(), ((Boolean) zzm()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(zzn(), ((Boolean) obj).booleanValue());
    }
}
