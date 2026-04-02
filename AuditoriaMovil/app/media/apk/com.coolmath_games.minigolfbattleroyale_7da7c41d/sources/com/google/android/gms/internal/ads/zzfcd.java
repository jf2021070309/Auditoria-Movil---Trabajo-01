package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.LongCompanionObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfcd implements zzfcc {
    private final ConcurrentHashMap<zzfcm, zzfcb> zza;
    private final zzfcj zzb;
    private final zzfcf zzc = new zzfcf();

    public zzfcd(zzfcj zzfcjVar) {
        this.zza = new ConcurrentHashMap<>(zzfcjVar.zzd);
        this.zzb = zzfcjVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfcj> creator = zzfcj.CREATOR;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzeG)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry<zzfcm, zzfcb> entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(entry.getKey().hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < entry.getValue().zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = entry.getValue().zzc(); zzc < this.zzb.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(entry.getValue().zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized zzfcl<?, ?> zza(zzfcm zzfcmVar) {
        zzfcl<?, ?> zzfclVar;
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            zzfclVar = zzfcbVar.zzb();
            if (zzfclVar == null) {
                this.zzc.zzb();
            }
            zzfcz zzh = zzfcbVar.zzh();
            if (zzfclVar != null) {
                zzazo zza = zzazu.zza();
                zzazm zza2 = zzazn.zza();
                zza2.zzd(2);
                zzazq zza3 = zzazr.zza();
                zza3.zza(zzh.zza);
                zza3.zzb(zzh.zzb);
                zza2.zzb(zza3);
                zza.zza(zza2);
                zzfclVar.zza.zzP().zze().zzc(zza.zzah());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfclVar = null;
        }
        return zzfclVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zzb(zzfcm zzfcmVar, zzfcl<?, ?> zzfclVar) {
        boolean zza;
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        zzfclVar.zzd = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
        if (zzfcbVar == null) {
            zzfcj zzfcjVar = this.zzb;
            zzfcbVar = new zzfcb(zzfcjVar.zzd, zzfcjVar.zze * 1000);
            int size = this.zza.size();
            zzfcj zzfcjVar2 = this.zzb;
            if (size == zzfcjVar2.zzc) {
                int i = zzfcjVar2.zzg;
                int i2 = i - 1;
                zzfcm zzfcmVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = LongCompanionObject.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry<zzfcm, zzfcb> entry : this.zza.entrySet()) {
                        if (entry.getValue().zzd() < j) {
                            j = entry.getValue().zzd();
                            zzfcmVar2 = entry.getKey();
                        }
                    }
                    if (zzfcmVar2 != null) {
                        this.zza.remove(zzfcmVar2);
                    }
                } else if (i2 == 1) {
                    for (Map.Entry<zzfcm, zzfcb> entry2 : this.zza.entrySet()) {
                        if (entry2.getValue().zze() < j) {
                            j = entry2.getValue().zze();
                            zzfcmVar2 = entry2.getKey();
                        }
                    }
                    if (zzfcmVar2 != null) {
                        this.zza.remove(zzfcmVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (Map.Entry<zzfcm, zzfcb> entry3 : this.zza.entrySet()) {
                        if (entry3.getValue().zzf() < i3) {
                            i3 = entry3.getValue().zzf();
                            zzfcmVar2 = entry3.getKey();
                        }
                    }
                    if (zzfcmVar2 != null) {
                        this.zza.remove(zzfcmVar2);
                    }
                }
                this.zzc.zzd();
            }
            this.zza.put(zzfcmVar, zzfcbVar);
            this.zzc.zzc();
        }
        zza = zzfcbVar.zza(zzfclVar);
        this.zzc.zze();
        zzfce zzf = this.zzc.zzf();
        zzfcz zzh = zzfcbVar.zzh();
        if (zzfclVar != null) {
            zzazo zza2 = zzazu.zza();
            zzazm zza3 = zzazn.zza();
            zza3.zzd(2);
            zzazs zza4 = zzazt.zza();
            zza4.zza(zzf.zza);
            zza4.zzb(zzf.zzb);
            zza4.zzc(zzh.zzb);
            zza3.zzc(zza4);
            zza2.zza(zza3);
            zzfclVar.zza.zzP().zze().zzd(zza2.zzah());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final synchronized boolean zzc(zzfcm zzfcmVar) {
        zzfcb zzfcbVar = this.zza.get(zzfcmVar);
        if (zzfcbVar != null) {
            return zzfcbVar.zzc() < this.zzb.zzd;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    @Deprecated
    public final zzfcm zzd(zzbdg zzbdgVar, String str, zzbdr zzbdrVar) {
        return new zzfcn(zzbdgVar, str, new zzcbn(this.zzb.zza).zza().zzk, this.zzb.zzf, zzbdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final zzfcj zze() {
        return this.zzb;
    }
}
