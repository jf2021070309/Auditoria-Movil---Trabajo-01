package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzedb {
    private static final SparseArray<zzbbm> zzg;
    private final Context zza;
    private final zzdai zzb;
    private final TelephonyManager zzc;
    private final zzecu zzd;
    private final zzecq zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;
    private int zzh;

    static {
        SparseArray<zzbbm> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbm.CONNECTED);
        zzg.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbbm.CONNECTING);
        zzg.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbbm.CONNECTING);
        zzg.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbbm.CONNECTING);
        zzg.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbm.DISCONNECTING);
        zzg.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbbm.DISCONNECTED);
        zzg.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbbm.DISCONNECTED);
        zzg.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbbm.DISCONNECTED);
        zzg.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbbm.DISCONNECTED);
        zzg.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbbm.DISCONNECTED);
        zzg.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbm.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            zzg.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbbm.CONNECTING);
        }
        zzg.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbbm.CONNECTING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzedb(Context context, zzdai zzdaiVar, zzecu zzecuVar, zzecq zzecqVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = context;
        this.zzb = zzdaiVar;
        this.zzd = zzecuVar;
        this.zze = zzecqVar;
        this.zzc = (TelephonyManager) context.getSystemService("phone");
        this.zzf = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzbbd zzc(zzedb zzedbVar, Bundle bundle) {
        zzbaw zzd = zzbbd.zzd();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzedbVar.zzh = 2;
        } else {
            zzedbVar.zzh = 1;
            if (i == 0) {
                zzd.zza(2);
            } else if (i == 1) {
                zzd.zza(3);
            } else {
                zzd.zza(1);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zzd.zzb(i3);
        }
        return zzd.zzah();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ byte[] zze(zzedb zzedbVar, boolean z, ArrayList arrayList, zzbbd zzbbdVar, zzbbm zzbbmVar) {
        zzbbh zzj = zzbbi.zzj();
        zzj.zzd(arrayList);
        zzj.zzj(zzg(com.google.android.gms.ads.internal.zzt.zze().zzf(zzedbVar.zza.getContentResolver()) != 0));
        zzj.zzk(com.google.android.gms.ads.internal.zzt.zze().zzq(zzedbVar.zza, zzedbVar.zzc));
        zzj.zzb(zzedbVar.zzd.zzd());
        zzj.zzc(zzedbVar.zzd.zzh());
        zzj.zzf(zzedbVar.zzd.zzb());
        zzj.zzg(zzbbmVar);
        zzj.zze(zzbbdVar);
        zzj.zzl(zzedbVar.zzh);
        zzj.zzh(zzg(z));
        zzj.zza(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis());
        zzj.zzi(zzg(com.google.android.gms.ads.internal.zzt.zze().zze(zzedbVar.zza.getContentResolver()) != 0));
        return zzj.zzah().zzao();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzf(boolean z) {
        zzfsd.zzp(this.zzb.zza(), new zzeda(this, z), zzchg.zzf);
    }
}
