package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;
/* loaded from: classes.dex */
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
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbm zzbbmVar = zzbbm.CONNECTING;
        sparseArray.put(ordinal, zzbbmVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbbmVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbbmVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbm.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbm zzbbmVar2 = zzbbm.DISCONNECTED;
        sparseArray.put(ordinal2, zzbbmVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbbmVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbbmVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbbmVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbbmVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbm.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbbmVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbbmVar);
    }

    public zzedb(Context context, zzdai zzdaiVar, zzecu zzecuVar, zzecq zzecqVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = context;
        this.zzb = zzdaiVar;
        this.zzd = zzecuVar;
        this.zze = zzecqVar;
        this.zzc = (TelephonyManager) context.getSystemService("phone");
        this.zzf = zzgVar;
    }

    public static /* synthetic */ zzbbd zzc(zzedb zzedbVar, Bundle bundle) {
        zzbaw zzd = zzbbd.zzd();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        int i4 = 2;
        if (i2 == -1) {
            zzedbVar.zzh = 2;
        } else {
            zzedbVar.zzh = 1;
            if (i2 == 0) {
                zzd.zza(2);
            } else if (i2 != 1) {
                zzd.zza(1);
            } else {
                zzd.zza(3);
            }
            switch (i3) {
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
                    i4 = 3;
                    break;
                case 13:
                    i4 = 5;
                    break;
                default:
                    i4 = 1;
                    break;
            }
            zzd.zzb(i4);
        }
        return zzd.zzah();
    }

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
