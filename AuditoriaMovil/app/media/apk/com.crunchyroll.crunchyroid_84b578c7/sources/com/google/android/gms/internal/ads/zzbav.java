package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.aps.iva.if0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbav extends zzbax {
    public zzbav(int i, String str, String str2) {
        super(1, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zza(c cVar) {
        return cVar.optString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(zzn()));
        }
        return (String) zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(zzn(), (String) zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzbax
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putString(zzn(), (String) obj);
    }
}
