package com.google.android.gms.internal.ads;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzts implements zzuo {
    private final zztb zza;
    private final zzame zzb = new zzame(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzamn zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzts(zztb zztbVar) {
        this.zza = zztbVar;
    }

    private final void zzd(int i2) {
        this.zzc = i2;
        this.zzd = 0;
    }

    private final boolean zze(zzamf zzamfVar, byte[] bArr, int i2) {
        int min = Math.min(zzamfVar.zzd(), i2 - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzamfVar.zzk(min);
        } else {
            zzamfVar.zzm(bArr, this.zzd, min);
        }
        int i3 = this.zzd + min;
        this.zzd = i3;
        return i3 == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zza(zzamn zzamnVar, zznx zznxVar, zzun zzunVar) {
        this.zze = zzamnVar;
        this.zza.zzb(zznxVar, zzunVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzuo
    public final void zzc(zzamf zzamfVar, int i2) throws zzaha {
        int i3;
        long j2;
        zzakt.zze(this.zze);
        int i4 = -1;
        int i5 = 2;
        if ((i2 & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i7);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.zza.zze();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        while (zzamfVar.zzd() > 0) {
            int i8 = this.zzc;
            if (i8 != 0) {
                if (i8 == 1) {
                    if (zze(zzamfVar, this.zzb.zza, 9)) {
                        int i9 = 0;
                        this.zzb.zzd(0);
                        int zzh = this.zzb.zzh(24);
                        if (zzh != 1) {
                            a.D(41, "Unexpected start code prefix: ", zzh, "PesReader");
                            i3 = -1;
                            this.zzj = -1;
                        } else {
                            this.zzb.zzf(8);
                            int zzh2 = this.zzb.zzh(16);
                            this.zzb.zzf(5);
                            this.zzk = this.zzb.zzg();
                            this.zzb.zzf(2);
                            this.zzf = this.zzb.zzg();
                            this.zzg = this.zzb.zzg();
                            this.zzb.zzf(6);
                            int zzh3 = this.zzb.zzh(8);
                            this.zzi = zzh3;
                            if (zzh2 == 0) {
                                this.zzj = -1;
                            } else {
                                int i10 = (zzh2 - 3) - zzh3;
                                this.zzj = i10;
                                if (i10 < 0) {
                                    a.D(47, "Found negative packet payload size: ", i10, "PesReader");
                                    i3 = -1;
                                    this.zzj = -1;
                                    i9 = 2;
                                }
                            }
                            i3 = -1;
                            i9 = 2;
                        }
                        zzd(i9);
                        i4 = i3;
                    }
                    i4 = -1;
                } else if (i8 != i5) {
                    int zzd = zzamfVar.zzd();
                    int i11 = this.zzj;
                    int i12 = i11 != i4 ? zzd - i11 : 0;
                    if (i12 > 0) {
                        zzd -= i12;
                        zzamfVar.zzf(zzamfVar.zzg() + zzd);
                    }
                    this.zza.zzd(zzamfVar);
                    int i13 = this.zzj;
                    if (i13 != i4) {
                        int i14 = i13 - zzd;
                        this.zzj = i14;
                        if (i14 == 0) {
                            this.zza.zze();
                            zzd(1);
                        }
                    }
                } else {
                    if (zze(zzamfVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzamfVar, null, this.zzi)) {
                        this.zzb.zzd(0);
                        if (this.zzf) {
                            this.zzb.zzf(4);
                            int zzh4 = this.zzb.zzh(3);
                            this.zzb.zzf(1);
                            int zzh5 = this.zzb.zzh(15);
                            this.zzb.zzf(1);
                            long zzh6 = (zzh4 << 30) | (zzh5 << 15) | this.zzb.zzh(15);
                            this.zzb.zzf(1);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzf(4);
                                int zzh7 = this.zzb.zzh(3);
                                this.zzb.zzf(1);
                                int zzh8 = this.zzb.zzh(15);
                                this.zzb.zzf(1);
                                int zzh9 = this.zzb.zzh(15);
                                this.zzb.zzf(1);
                                this.zze.zze((zzh8 << 15) | (zzh7 << 30) | zzh9);
                                this.zzh = true;
                            }
                            j2 = this.zze.zze(zzh6);
                        } else {
                            j2 = -9223372036854775807L;
                        }
                        i2 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(j2, i2);
                        zzd(3);
                        i4 = -1;
                    }
                }
            } else {
                zzamfVar.zzk(zzamfVar.zzd());
            }
            i5 = 2;
        }
    }
}
