package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.firebase.FirebaseError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.time.DurationKt;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int zzl(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
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
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 2274716:
                return 3;
            case 160:
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean zzm(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    private final void zzn(zzaqe zzaqeVar, long j) {
        int i;
        byte[] zzd2;
        if ("S_TEXT/UTF8".equals(zzaqeVar.zza)) {
            byte[] bArr = this.zzn.zza;
            long j2 = this.zzJ;
            if (j2 == -9223372036854775807L) {
                zzd2 = zzc;
            } else {
                int i2 = (int) (j2 / 3600000000L);
                long j3 = j2 - (i2 * 3600000000L);
                int i3 = (int) (j3 / 60000000);
                long j4 = j3 - (60000000 * i3);
                zzd2 = zzave.zzd(String.format(Locale.US, "%02d:%02d:%02d,%03d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) (j4 / 1000000)), Integer.valueOf((int) ((j4 - (i * DurationKt.NANOS_IN_MILLIS)) / 1000))));
            }
            System.arraycopy(zzd2, 0, bArr, 19, 12);
            zzapx zzapxVar = zzaqeVar.zzN;
            zzaux zzauxVar = this.zzn;
            zzapxVar.zzb(zzauxVar, zzauxVar.zze());
            this.zzY += this.zzn.zze();
        }
        zzaqeVar.zzN.zzc(j, this.zzP, this.zzY, 0, zzaqeVar.zzg);
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

    private final long zzp(long j) throws zzanp {
        long j2 = this.zzt;
        if (j2 == -9223372036854775807L) {
            throw new zzanp("Can't scale timecode prior to timecodeScale being set.");
        }
        return zzave.zzj(j, j2, 1000L);
    }

    private static int[] zzq(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    private final void zzr(zzapn zzapnVar, int i) throws IOException, InterruptedException {
        if (this.zzj.zze() >= i) {
            return;
        }
        if (this.zzj.zzh() < i) {
            zzaux zzauxVar = this.zzj;
            byte[] bArr = zzauxVar.zza;
            int length = bArr.length;
            zzauxVar.zzb(Arrays.copyOf(bArr, Math.max(length + length, i)), this.zzj.zze());
        }
        zzaux zzauxVar2 = this.zzj;
        zzapnVar.zzb(zzauxVar2.zza, zzauxVar2.zze(), i - this.zzj.zze(), false);
        this.zzj.zzf(i);
    }

    private final void zzs(zzapn zzapnVar, zzaqe zzaqeVar, int i) throws IOException, InterruptedException {
        int i2;
        if ("S_TEXT/UTF8".equals(zzaqeVar.zza)) {
            int i3 = i + 32;
            if (this.zzn.zzh() < i3) {
                this.zzn.zza = Arrays.copyOf(zzb, i3 + i);
            }
            zzapnVar.zzb(this.zzn.zza, 32, i, false);
            this.zzn.zzi(0);
            this.zzn.zzf(i3);
            return;
        }
        zzapx zzapxVar = zzaqeVar.zzN;
        if (!this.zzR) {
            if (zzaqeVar.zze) {
                this.zzP &= -1073741825;
                if (!this.zzS) {
                    zzapnVar.zzb(this.zzj.zza, 0, 1, false);
                    this.zzQ++;
                    byte b = this.zzj.zza[0];
                    if ((b & ByteCompanionObject.MIN_VALUE) != 128) {
                        this.zzV = b;
                        this.zzS = true;
                    } else {
                        throw new zzanp("Extension bit is set in signal byte");
                    }
                }
                byte b2 = this.zzV;
                if ((b2 & 1) == 1) {
                    int i4 = b2 & 2;
                    this.zzP |= 1073741824;
                    if (!this.zzT) {
                        zzapnVar.zzb(this.zzo.zza, 0, 8, false);
                        this.zzQ += 8;
                        this.zzT = true;
                        zzaux zzauxVar = this.zzj;
                        zzauxVar.zza[0] = (byte) ((i4 != 2 ? 0 : 128) | 8);
                        zzauxVar.zzi(0);
                        zzapxVar.zzb(this.zzj, 1);
                        this.zzY++;
                        this.zzo.zzi(0);
                        zzapxVar.zzb(this.zzo, 8);
                        this.zzY += 8;
                    }
                    if (i4 == 2) {
                        if (!this.zzU) {
                            zzapnVar.zzb(this.zzj.zza, 0, 1, false);
                            this.zzQ++;
                            this.zzj.zzi(0);
                            this.zzW = this.zzj.zzl();
                            this.zzU = true;
                        }
                        int i5 = this.zzW * 4;
                        this.zzj.zza(i5);
                        zzapnVar.zzb(this.zzj.zza, 0, i5, false);
                        this.zzQ += i5;
                        int i6 = (this.zzW >> 1) + 1;
                        int i7 = (i6 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzq;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.zzq = ByteBuffer.allocate(i7);
                        }
                        this.zzq.position(0);
                        this.zzq.putShort((short) i6);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.zzW;
                            if (i8 >= i2) {
                                break;
                            }
                            int zzu = this.zzj.zzu();
                            if (i8 % 2 == 0) {
                                this.zzq.putShort((short) (zzu - i9));
                            } else {
                                this.zzq.putInt(zzu - i9);
                            }
                            i8++;
                            i9 = zzu;
                        }
                        int i10 = (i - this.zzQ) - i9;
                        if ((i2 & 1) == 1) {
                            this.zzq.putInt(i10);
                        } else {
                            this.zzq.putShort((short) i10);
                            this.zzq.putInt(0);
                        }
                        this.zzp.zzb(this.zzq.array(), i7);
                        zzapxVar.zzb(this.zzp, i7);
                        this.zzY += i7;
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
        int zze = i + this.zzm.zze();
        if (!"V_MPEG4/ISO/AVC".equals(zzaqeVar.zza) && !"V_MPEGH/ISO/HEVC".equals(zzaqeVar.zza)) {
            while (true) {
                int i11 = this.zzQ;
                if (i11 >= zze) {
                    break;
                }
                zzt(zzapnVar, zzapxVar, zze - i11);
            }
        } else {
            byte[] bArr2 = this.zzi.zza;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i12 = zzaqeVar.zzO;
            int i13 = 4 - i12;
            while (this.zzQ < zze) {
                int i14 = this.zzX;
                if (i14 == 0) {
                    int min = Math.min(i12, this.zzm.zzd());
                    zzapnVar.zzb(bArr2, i13 + min, i12 - min, false);
                    if (min > 0) {
                        this.zzm.zzk(bArr2, i13, min);
                    }
                    this.zzQ += i12;
                    this.zzi.zzi(0);
                    this.zzX = this.zzi.zzu();
                    this.zzh.zzi(0);
                    zzapxVar.zzb(this.zzh, 4);
                    this.zzY += 4;
                } else {
                    this.zzX = i14 - zzt(zzapnVar, zzapxVar, i14);
                }
            }
        }
        if ("A_VORBIS".equals(zzaqeVar.zza)) {
            this.zzk.zzi(0);
            zzapxVar.zzb(this.zzk, 4);
            this.zzY += 4;
        }
    }

    private final int zzt(zzapn zzapnVar, zzapx zzapxVar, int i) throws IOException, InterruptedException {
        int zzd2;
        int zzd3 = this.zzm.zzd();
        if (zzd3 > 0) {
            zzd2 = Math.min(i, zzd3);
            zzapxVar.zzb(this.zzm, zzd2);
        } else {
            zzd2 = zzapxVar.zzd(zzapnVar, i, false);
        }
        this.zzQ += zzd2;
        this.zzY += zzd2;
        return zzd2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(int i, long j, long j2) throws zzanp {
        if (i == 160) {
            this.zzaa = false;
        } else if (i == 174) {
            this.zzw = new zzaqe(null);
        } else if (i == 187) {
            this.zzG = false;
        } else if (i == 19899) {
            this.zzy = -1;
            this.zzz = -1L;
        } else if (i == 20533) {
            this.zzw.zze = true;
        } else if (i == 21968) {
            this.zzw.zzq = true;
        } else if (i == 408125543) {
            long j3 = this.zzs;
            if (j3 != -1 && j3 != j) {
                throw new zzanp("Multiple Segment elements not supported");
            }
            this.zzs = j;
            this.zzr = j2;
        } else if (i != 475249515) {
            if (i == 524531317 && !this.zzx) {
                if (this.zzg && this.zzB != -1) {
                    this.zzA = true;
                    return;
                }
                this.zzab.zzc(new zzapu(this.zzv));
                this.zzx = true;
            }
        } else {
            this.zzE = new zzaus(32);
            this.zzF = new zzaus(32);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zzd(zzapp zzappVar) {
        this.zzab = zzappVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapo
    public final void zze(long j, long j2) {
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
                long j = this.zzC;
                if (j != -1) {
                    zzaptVar.zza = j;
                    this.zzC = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi(int i, double d) {
        if (i == 181) {
            this.zzw.zzI = (int) d;
        } else if (i == 17545) {
            this.zzu = (long) d;
        } else {
            switch (i) {
                case 21969:
                    this.zzw.zzw = (float) d;
                    return;
                case 21970:
                    this.zzw.zzx = (float) d;
                    return;
                case 21971:
                    this.zzw.zzy = (float) d;
                    return;
                case 21972:
                    this.zzw.zzz = (float) d;
                    return;
                case 21973:
                    this.zzw.zzA = (float) d;
                    return;
                case 21974:
                    this.zzw.zzB = (float) d;
                    return;
                case 21975:
                    this.zzw.zzC = (float) d;
                    return;
                case 21976:
                    this.zzw.zzD = (float) d;
                    return;
                case 21977:
                    this.zzw.zzE = (float) d;
                    return;
                case 21978:
                    this.zzw.zzF = (float) d;
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(int i, String str) throws zzanp {
        if (i == 134) {
            this.zzw.zza = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            zzaqe.zza(this.zzw, str);
        } else if ("webm".equals(str) || "matroska".equals(str)) {
        } else {
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw new zzanp(sb.toString());
        }
    }

    public zzaqf(int i) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzh(int i, long j) throws zzanp {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j);
            sb.append(" not supported");
            throw new zzanp(sb.toString());
        } else if (i == 20530) {
            if (j == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j);
            sb2.append(" not supported");
            throw new zzanp(sb2.toString());
        } else {
            switch (i) {
                case 131:
                    this.zzw.zzc = (int) j;
                    return;
                case 136:
                    this.zzw.zzL = j == 1;
                    return;
                case 155:
                    this.zzJ = zzp(j);
                    return;
                case 159:
                    this.zzw.zzG = (int) j;
                    return;
                case 176:
                    this.zzw.zzj = (int) j;
                    return;
                case 179:
                    this.zzE.zza(zzp(j));
                    return;
                case 186:
                    this.zzw.zzk = (int) j;
                    return;
                case 215:
                    this.zzw.zzb = (int) j;
                    return;
                case 231:
                    this.zzD = zzp(j);
                    return;
                case 241:
                    if (this.zzG) {
                        return;
                    }
                    this.zzF.zza(j);
                    this.zzG = true;
                    return;
                case 251:
                    this.zzaa = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j);
                    sb3.append(" not supported");
                    throw new zzanp(sb3.toString());
                case 17029:
                    if (j < 1 || j > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j);
                        sb4.append(" not supported");
                        throw new zzanp(sb4.toString());
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb5 = new StringBuilder(50);
                    sb5.append("EBMLReadVersion ");
                    sb5.append(j);
                    sb5.append(" not supported");
                    throw new zzanp(sb5.toString());
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j);
                    sb6.append(" not supported");
                    throw new zzanp(sb6.toString());
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j);
                    sb7.append(" not supported");
                    throw new zzanp(sb7.toString());
                case 21420:
                    this.zzz = j + this.zzs;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.zzw.zzp = 0;
                        return;
                    } else if (i2 == 1) {
                        this.zzw.zzp = 2;
                        return;
                    } else if (i2 == 3) {
                        this.zzw.zzp = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.zzw.zzp = 3;
                        return;
                    }
                case 21680:
                    this.zzw.zzl = (int) j;
                    return;
                case 21682:
                    this.zzw.zzn = (int) j;
                    return;
                case 21690:
                    this.zzw.zzm = (int) j;
                    return;
                case 21930:
                    this.zzw.zzM = j == 1;
                    return;
                case 22186:
                    this.zzw.zzJ = j;
                    return;
                case 22203:
                    this.zzw.zzK = j;
                    return;
                case 25188:
                    this.zzw.zzH = (int) j;
                    return;
                case 2352003:
                    this.zzw.zzd = (int) j;
                    return;
                case 2807729:
                    this.zzt = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.zzw.zzt = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.zzw.zzt = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (i4 == 16) {
                                    this.zzw.zzs = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.zzw.zzs = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.zzw.zzs = 3;
                            return;
                        case 21947:
                            zzaqe zzaqeVar = this.zzw;
                            zzaqeVar.zzq = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                zzaqeVar.zzr = 1;
                                return;
                            } else if (i5 == 9) {
                                zzaqeVar.zzr = 6;
                                return;
                            } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                zzaqeVar.zzr = 2;
                                return;
                            } else {
                                return;
                            }
                        case 21948:
                            this.zzw.zzu = (int) j;
                            return;
                        case 21949:
                            this.zzw.zzv = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ee, code lost:
        throw new com.google.android.gms.internal.ads.zzanp("EBML lacing sample size out of range.");
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzk(int r20, int r21, com.google.android.gms.internal.ads.zzapn r22) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqf.zzk(int, int, com.google.android.gms.internal.ads.zzapn):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(int i) throws zzanp {
        zzapv zzapuVar;
        zzaus zzausVar;
        zzaus zzausVar2;
        int i2;
        int i3 = 0;
        if (i == 160) {
            if (this.zzH != 2) {
                return;
            }
            if (!this.zzaa) {
                this.zzP |= 1;
            }
            zzn(this.zzf.get(this.zzN), this.zzI);
            this.zzH = 0;
        } else if (i == 174) {
            String str = this.zzw.zza;
            if ("V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str)) {
                zzaqe zzaqeVar = this.zzw;
                zzaqeVar.zzb(this.zzab, zzaqeVar.zzb);
                SparseArray<zzaqe> sparseArray = this.zzf;
                zzaqe zzaqeVar2 = this.zzw;
                sparseArray.put(zzaqeVar2.zzb, zzaqeVar2);
            }
            this.zzw = null;
        } else if (i == 19899) {
            int i4 = this.zzy;
            if (i4 != -1) {
                long j = this.zzz;
                if (j != -1) {
                    if (i4 == 475249515) {
                        this.zzB = j;
                        return;
                    }
                    return;
                }
            }
            throw new zzanp("Mandatory element SeekID or SeekPosition not found");
        } else if (i == 25152) {
            zzaqe zzaqeVar3 = this.zzw;
            if (zzaqeVar3.zze) {
                if (zzaqeVar3.zzg == null) {
                    throw new zzanp("Encrypted Track found but ContentEncKeyID was not found");
                }
                zzaqeVar3.zzi = new zzapk(new zzapj(zzamx.zzb, "video/webm", this.zzw.zzg.zzb, false));
            }
        } else if (i == 28032) {
            zzaqe zzaqeVar4 = this.zzw;
            if (zzaqeVar4.zze && zzaqeVar4.zzf != null) {
                throw new zzanp("Combining encryption and compression is not supported");
            }
        } else if (i == 357149030) {
            if (this.zzt == -9223372036854775807L) {
                this.zzt = 1000000L;
            }
            long j2 = this.zzu;
            if (j2 != -9223372036854775807L) {
                this.zzv = zzp(j2);
            }
        } else if (i == 374648427) {
            if (this.zzf.size() == 0) {
                throw new zzanp("No valid tracks were found");
            }
            this.zzab.zzbg();
        } else if (i == 475249515 && !this.zzx) {
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
                for (int i5 = 0; i5 < zzc2; i5++) {
                    jArr3[i5] = this.zzE.zzb(i5);
                    jArr[i5] = this.zzs + this.zzF.zzb(i5);
                }
                while (true) {
                    i2 = zzc2 - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    int i6 = i3 + 1;
                    iArr[i3] = (int) (jArr[i6] - jArr[i3]);
                    jArr2[i3] = jArr3[i6] - jArr3[i3];
                    i3 = i6;
                }
                iArr[i2] = (int) ((this.zzs + this.zzr) - jArr[i2]);
                jArr2[i2] = this.zzv - jArr3[i2];
                this.zzE = null;
                this.zzF = null;
                zzapuVar = new zzapm(iArr, jArr, jArr2, jArr3);
            }
            zzappVar.zzc(zzapuVar);
            this.zzx = true;
        }
    }
}
