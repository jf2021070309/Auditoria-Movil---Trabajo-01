package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcdz implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzcfa zzd;
    private String zze = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdz(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzcfa zzcfaVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
        this.zzd = zzcfaVar;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Context context;
        if ("IABTCF_PurposeConsents".equals(str)) {
            String string = sharedPreferences.getString("IABTCF_PurposeConsents", "");
            if (string.isEmpty() || this.zze.equals(string)) {
                return;
            }
            this.zze = string;
            boolean z = string.charAt(0) != '1';
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzao)).booleanValue()) {
                this.zzc.zzB(z);
                if (((Boolean) zzbet.zzc().zzc(zzbjl.zzex)).booleanValue() && z && (context = this.zza) != null) {
                    context.deleteDatabase("OfflineUpload.db");
                }
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzaj)).booleanValue()) {
                this.zzd.zza();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
    }
}
