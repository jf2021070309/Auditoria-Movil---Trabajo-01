package com.google.android.gms.internal.pal;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaej implements zzaer {
    private final zzaef zza;
    private final zzafi zzb;
    private final boolean zzc;
    private final zzacn zzd;

    private zzaej(zzafi zzafiVar, zzacn zzacnVar, zzaef zzaefVar) {
        this.zzb = zzafiVar;
        this.zzc = zzacnVar.zzh(zzaefVar);
        this.zzd = zzacnVar;
        this.zza = zzaefVar;
    }

    public static zzaej zzc(zzafi zzafiVar, zzacn zzacnVar, zzaef zzaefVar) {
        return new zzaej(zzafiVar, zzacnVar, zzaefVar);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zza(Object obj) {
        zzafi zzafiVar = this.zzb;
        int zzb = zzafiVar.zzb(zzafiVar.zzd(obj));
        if (!this.zzc) {
            return zzb;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final Object zze() {
        return this.zza.zzaB().zzap();
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzg(Object obj, Object obj2) {
        zzaet.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzaet.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzh(Object obj, zzaeq zzaeqVar, zzacm zzacmVar) throws IOException {
        boolean zzO;
        zzafi zzafiVar = this.zzb;
        zzacn zzacnVar = this.zzd;
        Object zzc = zzafiVar.zzc(obj);
        zzacr zzb = zzacnVar.zzb(obj);
        while (zzaeqVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzaeqVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzc2 = zzacnVar.zzc(zzacmVar, this.zza, zzd >>> 3);
                        if (zzc2 != null) {
                            zzacnVar.zzf(zzaeqVar, zzc2, zzacmVar, zzb);
                        } else {
                            zzO = zzafiVar.zzq(zzc, zzaeqVar);
                        }
                    } else {
                        zzO = zzaeqVar.zzO();
                    }
                    if (!zzO) {
                        return;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    zzaby zzabyVar = null;
                    while (zzaeqVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzaeqVar.zzd();
                        if (zzd2 == 16) {
                            i = zzaeqVar.zzj();
                            obj2 = zzacnVar.zzc(zzacmVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj2 != null) {
                                zzacnVar.zzf(zzaeqVar, obj2, zzacmVar, zzb);
                            } else {
                                zzabyVar = zzaeqVar.zzp();
                            }
                        } else if (!zzaeqVar.zzO()) {
                            break;
                        }
                    }
                    if (zzaeqVar.zzd() == 12) {
                        if (zzabyVar != null) {
                            if (obj2 != null) {
                                zzacnVar.zzg(zzabyVar, obj2, zzacmVar, zzb);
                            } else {
                                zzafiVar.zzk(zzc, i, zzabyVar);
                            }
                        }
                    } else {
                        throw zzadi.zzb();
                    }
                }
            } finally {
                zzafiVar.zzn(obj, zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzabl zzablVar) throws IOException {
        zzacz zzaczVar = (zzacz) obj;
        if (zzaczVar.zzc == zzafj.zzc()) {
            zzaczVar.zzc = zzafj.zze();
        }
        zzacw zzacwVar = (zzacw) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final void zzj(Object obj, zzaga zzagaVar) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final boolean zzk(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.pal.zzaer
    public final boolean zzl(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
