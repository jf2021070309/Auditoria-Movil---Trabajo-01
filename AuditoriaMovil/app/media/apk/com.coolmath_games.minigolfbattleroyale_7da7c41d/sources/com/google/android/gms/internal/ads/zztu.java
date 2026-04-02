package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zztu implements zznk {
    private final zzamn zza;
    private final zzamf zzb = new zzamf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zztu(zzamn zzamnVar, zztt zzttVar) {
        this.zza = zzamnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final zznj zza(zznv zznvVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzn = zznvVar.zzn();
        int min = (int) Math.min(20000L, zznvVar.zzo() - zzn);
        this.zzb.zza(min);
        ((zznp) zznvVar).zzh(this.zzb.zzi(), 0, min, false);
        zzamf zzamfVar = this.zzb;
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (zzamfVar.zzd() >= 4) {
            if (zztv.zzh(zzamfVar.zzi(), zzamfVar.zzg()) != 442) {
                zzamfVar.zzk(1);
            } else {
                zzamfVar.zzk(4);
                long zze = zztw.zze(zzamfVar);
                if (zze != -9223372036854775807L) {
                    long zze2 = this.zza.zze(zze);
                    if (zze2 > j) {
                        if (j3 == -9223372036854775807L) {
                            return zznj.zzd(zze2, zzn);
                        }
                        j2 = i2;
                    } else if (100000 + zze2 > j) {
                        j2 = zzamfVar.zzg();
                    } else {
                        i2 = zzamfVar.zzg();
                        j3 = zze2;
                    }
                    return zznj.zzf(zzn + j2);
                }
                int zze3 = zzamfVar.zze();
                if (zzamfVar.zzd() < 10) {
                    zzamfVar.zzh(zze3);
                } else {
                    zzamfVar.zzk(9);
                    int zzn2 = zzamfVar.zzn() & 7;
                    if (zzamfVar.zzd() < zzn2) {
                        zzamfVar.zzh(zze3);
                    } else {
                        zzamfVar.zzk(zzn2);
                        if (zzamfVar.zzd() < 4) {
                            zzamfVar.zzh(zze3);
                        } else {
                            if (zztv.zzh(zzamfVar.zzi(), zzamfVar.zzg()) == 443) {
                                zzamfVar.zzk(4);
                                int zzo = zzamfVar.zzo();
                                if (zzamfVar.zzd() < zzo) {
                                    zzamfVar.zzh(zze3);
                                } else {
                                    zzamfVar.zzk(zzo);
                                }
                            }
                            while (true) {
                                if (zzamfVar.zzd() < 4 || (zzh = zztv.zzh(zzamfVar.zzi(), zzamfVar.zzg())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzamfVar.zzk(4);
                                if (zzamfVar.zzd() >= 2) {
                                    zzamfVar.zzh(Math.min(zzamfVar.zze(), zzamfVar.zzg() + zzamfVar.zzo()));
                                } else {
                                    zzamfVar.zzh(zze3);
                                    break;
                                }
                            }
                        }
                    }
                }
                i = zzamfVar.zzg();
            }
        }
        return j3 != -9223372036854775807L ? zznj.zze(j3, zzn + i) : zznj.zza;
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzb() {
        zzamf zzamfVar = this.zzb;
        byte[] bArr = zzamq.zzf;
        int length = bArr.length;
        zzamfVar.zzb(bArr, 0);
    }
}
