package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
final class zzfc implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfc(zzfd zzfdVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfdVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzfd zzfdVar = this.zzc;
        zzfe zzfeVar = zzfdVar.zza;
        str = zzfdVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzfeVar.zza.zzav().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle zzd = zzbrVar.zzd(bundle);
            if (zzd == null) {
                zzfeVar.zza.zzau().zzb().zza("Install Referrer Service returned a null response");
            } else {
                bundle2 = zzd;
            }
        } catch (Exception e) {
            zzfeVar.zza.zzau().zzb().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzfeVar.zza.zzav().zzg();
        if (bundle2 != null) {
            long j = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzfeVar.zza.zzau().zze().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzfeVar.zza.zzau().zzb().zza("No referrer defined in Install Referrer response");
                } else {
                    zzfeVar.zza.zzau().zzk().zzb("InstallReferrer API result", string);
                    Bundle zzi = zzfeVar.zza.zzl().zzi(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (zzi == null) {
                        zzfeVar.zza.zzau().zzb().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zzi.getString(FirebaseAnalytics.Param.MEDIUM);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzfeVar.zza.zzau().zzb().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zzi.putLong("click_timestamp", j2);
                            }
                        }
                        if (j != zzfeVar.zza.zzd().zzd.zza()) {
                            if (zzfeVar.zza.zzF()) {
                                zzfeVar.zza.zzd().zzd.zzb(j);
                                zzfeVar.zza.zzau().zzk().zzb("Logging Install Referrer campaign from sdk with ", "referrer API");
                                zzi.putString("_cis", "referrer API");
                                zzfeVar.zza.zzk().zzs("auto", "_cmp", zzi);
                            }
                        } else {
                            zzfeVar.zza.zzau().zzk().zza("Install Referrer campaign has already been logged");
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzfeVar.zza.zzax(), serviceConnection);
    }
}
