package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import e.a.d.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzaqf implements zzapo {
    public static final zzapq zza = new zzaqb();
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final UUID zzd = new UUID(72057594037932032L, -9223371306706625679L);
    private boolean zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private zzaus zzE;
    private zzaus zzF;
    private boolean zzG;
    private int zzH;
    private long zzI;
    private long zzJ;
    private int zzK;
    private int zzL;
    private int[] zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private byte zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private zzapp zzab;
    private final zzaqa zzac;
    private final zzaqh zze;
    private final SparseArray<zzaqe> zzf;
    private final boolean zzg;
    private final zzaux zzh;
    private final zzaux zzi;
    private final zzaux zzj;
    private final zzaux zzk;
    private final zzaux zzl;
    private final zzaux zzm;
    private final zzaux zzn;
    private final zzaux zzo;
    private final zzaux zzp;
    private ByteBuffer zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private long zzv;
    private zzaqe zzw;
    private boolean zzx;
    private int zzy;
    private long zzz;

    public zzaqf() {
        this(0);
    }

    public zzaqf(int i2) {
        zzaqa zzaqaVar = new zzaqa();
        this.zzs = -1L;
        this.zzt = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzB = -1L;
        this.zzC = -1L;
        this.zzD = -9223372036854775807L;
        this.zzac = zzaqaVar;
        zzaqaVar.zzb(new zzaqc(this, null));
        this.zzg = true;
        this.zze = new zzaqh();
        this.zzf = new SparseArray<>();
        this.zzj = new zzaux(4);
        this.zzk = new zzaux(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzl = new zzaux(4);
        this.zzh = new zzaux(zzauv.zza);
        this.zzi = new zzaux(4);
        this.zzm = new zzaux();
        this.zzn = new zzaux();
        this.zzo = new zzaux(8);
        this.zzp = new zzaux();
    }

    public static final int zzl(int i2) {
        switch (i2) {
            case 131:
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
            case 155:
            case 159:
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
            case 179:
            case 186:
            case 215:
            case 231:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 22186:
            case 22203:
            case 25188:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzm(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    private final void zzn(zzaqe zzaqeVar, long j2) {
        byte[] zzd2;
        if ("S_TEXT/UTF8".equals(zzaqeVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j3 = this.zzJ;
            if (j3 == -9223372036854775807L) {
                zzd2 = zzc;
            } else {
                int i2 = (int) (j3 / 3600000000L);
                long j4 = j3 - (i2 * 3600000000L);
                int i3 = (int) (j4 / 60000000);
                long j5 = j4 - (60000000 * i3);
                int i4 = (int) (j5 / 1000000);
                zzd2 = zzave.zzd(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / 1000))));
            }
            System.arraycopy(zzd2, 0, bArr, 19, 12);
            zzapx zzapxVar = zzaqeVar.zzN;
            zzaux zzauxVar = this.zzn;
            zzapxVar.zzb(zzauxVar, zzauxVar.zze());
            this.zzY = this.zzn.zze() + this.zzY;
        }
        zzaqeVar.zzN.zzc(j2, this.zzP, this.zzY, 0, zzaqeVar.zzg);
        this.zzZ = true;
        zzo();
    }

    private final void zzo() {
        this.zzQ = 0;
        this.zzY = 0;
        this.zzX = 0;
        this.zzR = false;
        this.zzS = false;
        this.zzU = false;
        this.zzW = 0;
        this.zzV = (byte) 0;
        this.zzT = false;
        this.zzm.zzc();
    }

    private final long zzp(long j2) throws zzanp {
        long j3 = this.zzt;
        if (j3 != -9223372036854775807L) {
            return zzave.zzj(j2, j3, 1000L);
        }
        throw new zzanp("Can't scale timecode prior to timecodeScale being set.");
    }

    private static int[] zzq(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    private final void zzr(zzapn zzapnVar, int i2) throws IOException, InterruptedException {
        if (this.zzj.zze() >= i2) {
            return;
        }
        if (this.zzj.zzh() < i2) {
            zzaux zzauxVar = this.zzj;
            byte[] bArr = zzauxVar.zza;
            int length = bArr.length;
            zzauxVar.zzb(Arrays.copyOf(bArr, Math.max(length + length, i2)), this.zzj.zze());
        }
        zzaux zzauxVar2 = this.zzj;
        zzapnVar.zzb(zzauxVar2.zza, zzauxVar2.zze(), i2 - this.zzj.zze(), false);
        this.zzj.zzf(i2);
    }

    private final void zzs(zzapn zzapnVar, zzaqe zzaqeVar, int i2) throws IOException, InterruptedException {
        int i3;
        if ("S_TEXT/UTF8".equals(zzaqeVar.zza)) {
            int i4 = i2 + 32;
            if (this.zzn.zzh() < i4) {
                this.zzn.zza = Arrays.copyOf(zzb, i4 + i2);
            }
            zzapnVar.zzb(this.zzn.zza, 32, i2, false);
            this.zzn.zzi(0);
            this.zzn.zzf(i4);
            return;
        }
        zzapx zzapxVar = zzaqeVar.zzN;
        if (!this.zzR) {
            if (zzaqeVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzapnVar.zzb(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b2 = this.zzj.zza[0];
                    if ((b2 & 128) == 128) {
                        throw new zzanp("Extension bit is set in signal byte");
                    }
                    this.zzV = b2;
                    this.zzS = true;
                }
                byte b3 = this.zzV;
                if ((b3 & 1) == 1) {
                    int i5 = b3 & 2;
                    this.zzP |= 1073741824;
                    if (!this.zzT) {
                        zzapnVar.zzb(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzaux zzauxVar = this.zzj;
                        zzauxVar.zza[0] = (byte) ((i5 != 2 ? 0 : 128) | 8);
                        zzauxVar.zzi(0);
                        zzapxVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzi(0);
                        zzapxVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i5 == 2) {
                        if (!this.zzU) {
                            zzapnVar.zzb(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzi(0);
                            this.zzW = this.zzj.zzl();
                            this.zzU = true;
                        }
                        int i6 = this.zzW * 4;
                        this.zzj.zza(i6);
                        zzapnVar.zzb(this.zzj.zza, 0, i6, false);
                        this.zzQ += i6;
                        int i7 = (this.zzW >> 1) + 1;
                        int i8 = (i7 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i8) {
                            this.zzq = ByteBuffer.allocate(i8);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i7);
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            i3 = this.zzW;
                            if (i9 >= i3) {
                                break;
                            }
                            int zzu = this.zzj.zzu();
                            if (i9 % 2 == 0) {
                                this.zzq.putShort((short) (zzu - i10));
                            } else {
                                this.zzq.putInt(zzu - i10);
                            }
                            i9++;
                            i10 = zzu;
                        }
                        int i11 = (i2 - this.zzQ) - i10;
                        if ((i3 & 1) == 1) {
                            this.zzq.putInt(i11);
                        } else {
                            this.zzq.putShort((short) i11);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzb(this.zzq.array(), i8);
                        zzapxVar.zzb(this.zzp, i8);
                        this.zzY += i8;
                    }
                }
            } else {
                byte[] bArr = zzaqeVar.zzf;
                if (bArr != null) {
                    this.zzm.zzb(bArr, bArr.length);
                }
            }
            this.zzR = true;
        }
        int zze = this.zzm.zze() + i2;
        if (!"V_MPEG4/ISO/AVC".equals(zzaqeVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzaqeVar.zza)) {
            while (true) {
                int i12 = this.zzQ;
                if (i12 >= zze) {
                    break;
                }
                zzt(zzapnVar, zzapxVar, zze - i12);
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i13 = zzaqeVar.zzO;
            int i14 = 4 - i13;
            while (this.zzQ < zze) {
                int i15 = this.zzX;
                if (i15 == 0) {
                    int min = Math.min(i13, this.zzm.zzd());
                    zzapnVar.zzb(bArr2, i14 + min, i13 - min, false);
                    if (min > 0) {
                        this.zzm.zzk(bArr2, i14, min);
                    }
                    this.zzQ += i13;
                    this.zzi.zzi(0);
                    this.zzX = this.zzi.zzu();
                    this.zzh.zzi(0);
                    zzapxVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i15 - zzt(zzapnVar, zzapxVar, i15);
                }
            }
        }
        if ("A_VORBIS".equals(zzaqeVar.zza)) {
            this.zzk.zzi(0);
            zzapxVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    private final int zzt(zzapn zzapnVar, zzapx zzapxVar, int i2) throws IOException, InterruptedException {
        int zzd2;
        int zzd3 = this.zzm.zzd();
        if (zzd3 > 0) {
            zzd2 = Math.min(i2, zzd3);
            zzapxVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzapxVar.zzd(zzapnVar, i2, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    public final void zzb(int i2, long j2, long j3) throws zzanp {
        if (i2 == 160) {
            this.zzaa = false;
        } else if (i2 == 174) {
            this.zzw = new zzaqe(null);
        } else if (i2 == 187) {
            this.zzG = false;
        } else if (i2 == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
        } else if (i2 == 20533) {
            this.zzw.zze = true;
        } else if (i2 == 21968) {
            this.zzw.zzq = true;
        } else if (i2 == 408125543) {
            long j4 = this.zzs;
            if (j4 != -1 && j4 != j2) {
                throw new zzanp("Multiple Segment elements not supported");
            }
            this.zzs = j2;
            this.zzr = j3;
        } else if (i2 == 475249515) {
            this.zzE = new zzaus(32);
            this.zzF = new zzaus(32);
        } else if (i2 == 524531317 && !this.zzx) {
            if (this.zzg && this.zzB != -1) {
                this.zzA = true;
                return;
            }
            this.zzab.zzc(new zzapu(this.zzv));
            this.zzx = true;
        }
    }

    public final void zzc(int i2) throws zzanp {
        zzapv zzapuVar;
        zzaus zzausVar;
        zzaus zzausVar2;
        int i3;
        int i4 = 0;
        if (i2 == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzn(this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        } else if (i2 == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzaqe zzaqeVar = this.zzw;
                zzaqeVar.zzb(this.zzab, zzaqeVar.zzb);
                SparseArray<zzaqe> sparseArray = this.zzf;
                zzaqe zzaqeVar2 = this.zzw;
                sparseArray.put(zzaqeVar2.zzb, zzaqeVar2);
            }
            this.zzw = null;
        } else if (i2 == 19899) {
            int i5 = this.zzy;
            if (i5 != -1) {
                long j2 = this.zzz;
                if (j2 != -1) {
                    if (i5 == 475249515) {
                        this.zzB = j2;
                        return;
                    }
                    return;
                }
            }
            throw new zzanp("Mandatory element SeekID or SeekPosition not found");
        } else if (i2 == 25152) {
            zzaqe zzaqeVar3 = this.zzw;
            if (zzaqeVar3.zze) {
                if (zzaqeVar3.zzg == null) {
                    throw new zzanp("Encrypted Track found but ContentEncKeyID was not found");
                }
                zzaqeVar3.zzi = new zzapk(new zzapj(zzamx.zzb, "video/webm", this.zzw.zzg.zzb, false));
            }
        } else if (i2 == 28032) {
            zzaqe zzaqeVar4 = this.zzw;
            if (zzaqeVar4.zze && zzaqeVar4.zzf != null) {
                throw new zzanp("Combining encryption and compression is not supported");
            }
        } else if (i2 == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j3 = this.zzu;
            if (j3 != -9223372036854775807L) {
                this.zzv = zzp(j3);
            }
        } else if (i2 == 374648427) {
            if (this.zzf.size() == 0) {
                throw new zzanp("No valid tracks were found");
            }
            this.zzab.zzbg();
        } else if (i2 == 475249515 && !this.zzx) {
            zzapp zzappVar = this.zzab;
            if (this.zzs == -1 || this.zzv == -9223372036854775807L || (zzausVar = this.zzE) == null || zzausVar.zzc() == 0 || (zzausVar2 = this.zzF) == null || zzausVar2.zzc() != this.zzE.zzc()) {
                this.zzE = null;
                this.zzF = null;
                zzapuVar = new zzapu(this.zzv);
            } else {
                int zzc2 = this.zzE.zzc();
                int[] iArr = new int[zzc2];
                long[] jArr = new long[zzc2];
                long[] jArr2 = new long[zzc2];
                long[] jArr3 = new long[zzc2];
                for (int i6 = 0; i6 < zzc2; i6++) {
                    jArr3[i6] = this.zzE.zzb(i6);
                    jArr[i6] = this.zzF.zzb(i6) + this.zzs;
                }
                while (true) {
                    i3 = zzc2 - 1;
                    if (i4 >= i3) {
                        break;
                    }
                    int i7 = i4 + 1;
                    iArr[i4] = (int) (jArr[i7] - jArr[i4]);
                    jArr2[i4] = jArr3[i7] - jArr3[i4];
                    i4 = i7;
                }
                iArr[i3] = (int) ((this.zzs + this.zzr) - jArr[i3]);
                jArr2[i3] = this.zzv - jArr3[i3];
                this.zzE = null;
                this.zzF = null;
                zzapuVar = new zzapm(iArr, jArr, jArr2, jArr3);
            }
            zzappVar.zzc(zzapuVar);
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzab = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j2, long j3) {
        this.zzD = -9223372036854775807L;
        this.zzH = 0;
        this.zzac.zza();
        this.zze.zza();
        zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final boolean zzf(zzapn zzapnVar) throws IOException, InterruptedException {
        return new zzaqg().zza(zzapnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final int zzg(zzapn zzapnVar, zzapt zzaptVar) throws IOException, InterruptedException {
        this.zzZ = false;
        while (!this.zzZ) {
            if (!this.zzac.zzc(zzapnVar)) {
                return -1;
            }
            long zzh = zzapnVar.zzh();
            if (this.zzA) {
                this.zzC = zzh;
                zzaptVar.zza = this.zzB;
                this.zzA = false;
                return 1;
            } else if (this.zzx) {
                long j2 = this.zzC;
                if (j2 != -1) {
                    zzaptVar.zza = j2;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void zzh(int i2, long j2) throws zzanp {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw new zzanp(sb.toString());
        } else if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw new zzanp(sb2.toString());
        } else {
            switch (i2) {
                case 131:
                    this.zzw.zzc = (int) j2;
                    return;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    this.zzw.zzL = j2 == 1;
                    return;
                case 155:
                    this.zzJ = zzp(j2);
                    return;
                case 159:
                    this.zzw.zzG = (int) j2;
                    return;
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    this.zzw.zzj = (int) j2;
                    return;
                case 179:
                    this.zzE.zza(zzp(j2));
                    return;
                case 186:
                    this.zzw.zzk = (int) j2;
                    return;
                case 215:
                    this.zzw.zzb = (int) j2;
                    return;
                case 231:
                    this.zzD = zzp(j2);
                    return;
                case 241:
                    if (this.zzG) {
                        return;
                    }
                    this.zzF.zza(j2);
                    this.zzG = true;
                    return;
                case 251:
                    this.zzaa = true;
                    return;
                case 16980:
                    if (j2 == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j2);
                    sb3.append(" not supported");
                    throw new zzanp(sb3.toString());
                case 17029:
                    if (j2 < 1 || j2 > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j2);
                        sb4.append(" not supported");
                        throw new zzanp(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j2 == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j2);
                    sb5.append(" not supported");
                    throw new zzanp(sb5.toString());
                case 18401:
                    if (j2 == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j2);
                    sb6.append(" not supported");
                    throw new zzanp(sb6.toString());
                case 18408:
                    if (j2 == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j2);
                    sb7.append(" not supported");
                    throw new zzanp(sb7.toString());
                case 21420:
                    this.zzz = j2 + this.zzs;
                    return;
                case 21432:
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        this.zzw.zzp = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzw.zzp = 2;
                        return;
                    } else if (i3 == 3) {
                        this.zzw.zzp = 1;
                        return;
                    } else if (i3 != 15) {
                        return;
                    } else {
                        this.zzw.zzp = 3;
                        return;
                    }
                case 21680:
                    this.zzw.zzl = (int) j2;
                    return;
                case 21682:
                    this.zzw.zzn = (int) j2;
                    return;
                case 21690:
                    this.zzw.zzm = (int) j2;
                    return;
                case 21930:
                    this.zzw.zzM = j2 == 1;
                    return;
                case 22186:
                    this.zzw.zzJ = j2;
                    return;
                case 22203:
                    this.zzw.zzK = j2;
                    return;
                case 25188:
                    this.zzw.zzH = (int) j2;
                    return;
                case 2352003:
                    this.zzw.zzd = (int) j2;
                    return;
                case 2807729:
                    this.zzt = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            int i4 = (int) j2;
                            if (i4 == 1) {
                                this.zzw.zzt = 2;
                                return;
                            } else if (i4 != 2) {
                                return;
                            } else {
                                this.zzw.zzt = 1;
                                return;
                            }
                        case 21946:
                            int i5 = (int) j2;
                            if (i5 != 1) {
                                if (i5 == 16) {
                                    this.zzw.zzs = 6;
                                    return;
                                } else if (i5 == 18) {
                                    this.zzw.zzs = 7;
                                    return;
                                } else if (i5 != 6 && i5 != 7) {
                                    return;
                                }
                            }
                            this.zzw.zzs = 3;
                            return;
                        case 21947:
                            zzaqe zzaqeVar = this.zzw;
                            zzaqeVar.zzq = true;
                            int i6 = (int) j2;
                            if (i6 == 1) {
                                zzaqeVar.zzr = 1;
                                return;
                            } else if (i6 == 9) {
                                zzaqeVar.zzr = 6;
                                return;
                            } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                zzaqeVar.zzr = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzw.zzu = (int) j2;
                            return;
                        case 21949:
                            this.zzw.zzv = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzi(int i2, double d2) {
        if (i2 == 181) {
            this.zzw.zzI = (int) d2;
        } else if (i2 == 17545) {
            this.zzu = (long) d2;
        } else {
            switch (i2) {
                case 21969:
                    this.zzw.zzw = (float) d2;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d2;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d2;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d2;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d2;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d2;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d2;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d2;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d2;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d2;
                    return;
                default:
                    return;
            }
        }
    }

    public final void zzj(int i2, String str) throws zzanp {
        if (i2 == 134) {
            this.zzw.zza = str;
        } else if (i2 != 17026) {
            if (i2 != 2274716) {
                return;
            }
            zzaqe.zza(this.zzw, str);
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new zzanp(a.s(new StringBuilder(str.length() + 22), "DocType ", str, " not supported"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c5, code lost:
        throw new com.google.android.gms.internal.ads.zzanp("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzk(int r13, int r14, com.google.android.gms.internal.ads.zzapn r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqf.zzk(int, int, com.google.android.gms.internal.ads.zzapn):void");
    }
}
