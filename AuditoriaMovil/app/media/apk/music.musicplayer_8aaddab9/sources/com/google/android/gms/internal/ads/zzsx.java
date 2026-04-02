package com.google.android.gms.internal.ads;

import android.util.Log;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzsx implements zztb {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzame zzc = new zzame(new byte[7], 7);
    private final zzamf zzd = new zzamf(Arrays.copyOf(zza, 10));
    private final String zze;
    private String zzf;
    private zzox zzg;
    private zzox zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private zzox zzu;
    private long zzv;

    public zzsx(boolean z, String str) {
        zzi();
        this.zzn = -1;
        this.zzo = -1;
        this.zzr = -9223372036854775807L;
        this.zzt = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
    }

    public static boolean zzf(int i2) {
        return (i2 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzm = false;
        zzi();
    }

    private final boolean zzh(zzamf zzamfVar, byte[] bArr, int i2) {
        int min = Math.min(zzamfVar.zzd(), i2 - this.zzj);
        zzamfVar.zzm(bArr, this.zzj, min);
        int i3 = this.zzj + min;
        this.zzj = i3;
        return i3 == i2;
    }

    private final void zzi() {
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 256;
    }

    private final void zzj(zzox zzoxVar, long j2, int i2, int i3) {
        this.zzi = 4;
        this.zzj = i2;
        this.zzu = zzoxVar;
        this.zzv = j2;
        this.zzs = i3;
    }

    private final void zzk() {
        this.zzi = 3;
        this.zzj = 0;
    }

    private static final boolean zzl(byte b2, byte b3) {
        return zzf((b3 & 255) | 65280);
    }

    private static final boolean zzm(zzamf zzamfVar, byte[] bArr, int i2) {
        if (zzamfVar.zzd() < i2) {
            return false;
        }
        zzamfVar.zzm(bArr, 0, i2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zza() {
        this.zzt = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzb(zznx zznxVar, zzun zzunVar) {
        zzunVar.zza();
        this.zzf = zzunVar.zzc();
        zzox zzB = zznxVar.zzB(zzunVar.zzb(), 1);
        this.zzg = zzB;
        this.zzu = zzB;
        if (!this.zzb) {
            this.zzh = new zznt();
            return;
        }
        zzunVar.zza();
        zzox zzB2 = zznxVar.zzB(zzunVar.zzb(), 5);
        this.zzh = zzB2;
        zzaft zzaftVar = new zzaft();
        zzaftVar.zzD(zzunVar.zzc());
        zzaftVar.zzN("application/id3");
        zzB2.zzs(zzaftVar.zzah());
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzc(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.zzt = j2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zzd(zzamf zzamfVar) throws zzaha {
        int i2;
        int i3;
        int i4;
        Objects.requireNonNull(this.zzg);
        int i5 = zzamq.zza;
        while (zzamfVar.zzd() > 0) {
            int i6 = this.zzi;
            int i7 = 13;
            int i8 = 2;
            if (i6 == 0) {
                byte[] zzi = zzamfVar.zzi();
                int zzg = zzamfVar.zzg();
                int zze = zzamfVar.zze();
                while (true) {
                    if (zzg >= zze) {
                        zzamfVar.zzh(zzg);
                        break;
                    }
                    i2 = zzg + 1;
                    i3 = zzi[zzg] & 255;
                    if (this.zzk == 512 && zzl((byte) -1, (byte) i3)) {
                        if (!this.zzm) {
                            int i9 = i2 - 2;
                            zzamfVar.zzh(i9 + 1);
                            if (zzm(zzamfVar, this.zzc.zza, 1)) {
                                this.zzc.zzd(4);
                                int zzh = this.zzc.zzh(1);
                                int i10 = this.zzn;
                                if (i10 == -1 || zzh == i10) {
                                    if (this.zzo != -1) {
                                        if (!zzm(zzamfVar, this.zzc.zza, 1)) {
                                            break;
                                        }
                                        this.zzc.zzd(i8);
                                        if (this.zzc.zzh(4) == this.zzo) {
                                            zzamfVar.zzh(i9 + 2);
                                        }
                                    }
                                    if (!zzm(zzamfVar, this.zzc.zza, 4)) {
                                        break;
                                    }
                                    this.zzc.zzd(14);
                                    int zzh2 = this.zzc.zzh(i7);
                                    if (zzh2 >= 7) {
                                        byte[] zzi2 = zzamfVar.zzi();
                                        int zze2 = zzamfVar.zze();
                                        int i11 = i9 + zzh2;
                                        if (i11 >= zze2) {
                                            break;
                                        } else if ((r8 = zzi2[i11]) == -1) {
                                        }
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    int i12 = this.zzk;
                    int i13 = i12 | i3;
                    if (i13 == 329) {
                        i4 = 768;
                    } else if (i13 == 511) {
                        i4 = AdRequest.MAX_CONTENT_URL_LENGTH;
                    } else if (i13 == 836) {
                        i4 = 1024;
                    } else if (i13 == 1075) {
                        this.zzi = 2;
                        this.zzj = 3;
                        this.zzs = 0;
                        this.zzd.zzh(0);
                        zzamfVar.zzh(i2);
                        break;
                    } else if (i12 != 256) {
                        this.zzk = 256;
                        zzg = i2 - 1;
                        i7 = 13;
                        i8 = 2;
                    } else {
                        zzg = i2;
                        i7 = 13;
                        i8 = 2;
                    }
                    this.zzk = i4;
                    zzg = i2;
                    i7 = 13;
                    i8 = 2;
                }
                this.zzp = (i3 & 8) >> 3;
                this.zzl = 1 == ((i3 & 1) ^ 1);
                if (this.zzm) {
                    zzk();
                } else {
                    this.zzi = 1;
                    this.zzj = 0;
                }
                zzamfVar.zzh(i2);
            } else if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        int min = Math.min(zzamfVar.zzd(), this.zzs - this.zzj);
                        this.zzu.zzy(zzamfVar, min);
                        int i14 = this.zzj + min;
                        this.zzj = i14;
                        int i15 = this.zzs;
                        if (i14 == i15) {
                            long j2 = this.zzt;
                            if (j2 != -9223372036854775807L) {
                                this.zzu.zzv(j2, 1, i15, 0, null);
                                this.zzt += this.zzv;
                            }
                            zzi();
                        }
                    } else {
                        if (zzh(zzamfVar, this.zzc.zza, true != this.zzl ? 5 : 7)) {
                            this.zzc.zzd(0);
                            if (this.zzq) {
                                this.zzc.zzf(10);
                            } else {
                                int zzh3 = this.zzc.zzh(2) + 1;
                                if (zzh3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(zzh3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.zzc.zzf(5);
                                int zzh4 = this.zzc.zzh(3);
                                int i16 = this.zzo;
                                byte[] bArr = {(byte) (((i16 >> 1) & 7) | 16), (byte) (((zzh4 << 3) & SyslogConstants.LOG_CLOCK) | ((i16 << 7) & 128))};
                                zzmv zza2 = zzmx.zza(bArr);
                                zzaft zzaftVar = new zzaft();
                                zzaftVar.zzD(this.zzf);
                                zzaftVar.zzN("audio/mp4a-latm");
                                zzaftVar.zzK(zza2.zzc);
                                zzaftVar.zzaa(zza2.zzb);
                                zzaftVar.zzab(zza2.zza);
                                zzaftVar.zzP(Collections.singletonList(bArr));
                                zzaftVar.zzG(this.zze);
                                zzafv zzah = zzaftVar.zzah();
                                this.zzr = 1024000000 / zzah.zzz;
                                this.zzg.zzs(zzah);
                                this.zzq = true;
                            }
                            this.zzc.zzf(4);
                            int zzh5 = this.zzc.zzh(13) - 7;
                            if (this.zzl) {
                                zzh5 -= 2;
                            }
                            zzj(this.zzg, this.zzr, 0, zzh5);
                        }
                    }
                } else if (zzh(zzamfVar, this.zzd.zzi(), 10)) {
                    this.zzh.zzy(this.zzd, 10);
                    this.zzd.zzh(6);
                    zzj(this.zzh, 0L, 10, 10 + this.zzd.zzA());
                }
            } else if (zzamfVar.zzd() != 0) {
                this.zzc.zza[0] = zzamfVar.zzi()[zzamfVar.zzg()];
                this.zzc.zzd(2);
                int zzh6 = this.zzc.zzh(4);
                int i17 = this.zzo;
                if (i17 == -1 || zzh6 == i17) {
                    if (!this.zzm) {
                        this.zzm = true;
                        this.zzn = this.zzp;
                        this.zzo = zzh6;
                    }
                    zzk();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zztb
    public final void zze() {
    }
}
