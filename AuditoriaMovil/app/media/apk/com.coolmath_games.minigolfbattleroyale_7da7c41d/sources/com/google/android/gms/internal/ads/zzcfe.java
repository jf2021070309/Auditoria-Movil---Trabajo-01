package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcfe implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcfg zza;
    private final String zzb;

    public zzcfe(zzcfg zzcfgVar, String str) {
        this.zza = zzcfgVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcff> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcff zzcffVar : list) {
                zzcffVar.zza(sharedPreferences, this.zzb, str);
            }
        }
    }
}
