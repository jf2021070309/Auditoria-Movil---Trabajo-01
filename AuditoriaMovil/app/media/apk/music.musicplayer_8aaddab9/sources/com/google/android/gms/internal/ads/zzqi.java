package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zzqi implements zznu {
    public static final zzoa zza = zzqd.zza;
    private static final byte[] zzb = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] zzc = zzamq.zzs("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] zzd = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID zze = new UUID(72057594037932032L, -9223371306706625679L);
    private static final Map<String, Integer> zzf;
    private boolean zzA;
    private int zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private long zzG;
    private zzalo zzH;
    private zzalo zzI;
    private boolean zzJ;
    private boolean zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private int[] zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private int zzW;
    private int zzX;
    private int zzY;
    private boolean zzZ;
    private boolean zzaa;
    private boolean zzab;
    private int zzac;
    private byte zzad;
    private boolean zzae;
    private zznx zzaf;
    private final zzqb zzag;
    private final zzqk zzg;
    private final SparseArray<zzqg> zzh;
    private final boolean zzi;
    private final zzamf zzj;
    private final zzamf zzk;
    private final zzamf zzl;
    private final zzamf zzm;
    private final zzamf zzn;
    private final zzamf zzo;
    private final zzamf zzp;
    private final zzamf zzq;
    private final zzamf zzr;
    private final zzamf zzs;
    private ByteBuffer zzt;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private zzqg zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        zzf = Collections.unmodifiableMap(hashMap);
    }

    public zzqi() {
        this(0);
    }

    public zzqi(int i2) {
        zzqb zzqbVar = new zzqb();
        this.zzv = -1L;
        this.zzw = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzE = -1L;
        this.zzF = -1L;
        this.zzG = -9223372036854775807L;
        this.zzag = zzqbVar;
        zzqbVar.zza(new zzqe(this, null));
        this.zzi = true;
        this.zzg = new zzqk();
        this.zzh = new SparseArray<>();
        this.zzl = new zzamf(4);
        this.zzm = new zzamf(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzn = new zzamf(4);
        this.zzj = new zzamf(zzalw.zza);
        this.zzk = new zzamf(4);
        this.zzo = new zzamf();
        this.zzp = new zzamf();
        this.zzq = new zzamf(8);
        this.zzr = new zzamf();
        this.zzs = new zzamf();
        this.zzQ = new int[1];
    }

    public static final int zzn(int i2) {
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
            case 238:
            case 241:
            case 251:
            case 16871:
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
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
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
            case 165:
            case 16877:
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
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public static final boolean zzo(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    @EnsuresNonNull({"currentTrack"})
    private final void zzp(int i2) throws zzaha {
        if (this.zzz != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw zzaha.zzb(sb.toString(), null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    private final void zzq(int i2) throws zzaha {
        if (this.zzH == null || this.zzI == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw zzaha.zzb(sb.toString(), null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9 A[EDGE_INSN: B:52:0x00b9->B:41:0x00b9 ?: BREAK  , SYNTHETIC] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzr(com.google.android.gms.internal.ads.zzqg r17, long r18, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzr(com.google.android.gms.internal.ads.zzqg, long, int, int, int):void");
    }

    private final void zzs(zznv zznvVar, int i2) throws IOException {
        if (this.zzl.zze() >= i2) {
            return;
        }
        if (this.zzl.zzj() < i2) {
            zzamf zzamfVar = this.zzl;
            int zzj = zzamfVar.zzj();
            zzamfVar.zzc(Math.max(zzj + zzj, i2));
        }
        ((zznp) zznvVar).zza(this.zzl.zzi(), this.zzl.zze(), i2 - this.zzl.zze(), false);
        this.zzl.zzf(i2);
    }

    @RequiresNonNull({"#2.output"})
    private final int zzt(zznv zznvVar, zzqg zzqgVar, int i2) throws IOException {
        int i3;
        if ("S_TEXT/UTF8".equals(zzqgVar.zzb)) {
            zzv(zznvVar, zzb, i2);
            int i4 = this.zzX;
            zzu();
            return i4;
        } else if ("S_TEXT/ASS".equals(zzqgVar.zzb)) {
            zzv(zznvVar, zzd, i2);
            int i5 = this.zzX;
            zzu();
            return i5;
        } else {
            zzox zzoxVar = zzqgVar.zzV;
            if (!this.zzZ) {
                if (zzqgVar.zzg) {
                    this.zzT &= -1073741825;
                    if (!this.zzaa) {
                        ((zznp) zznvVar).zza(this.zzl.zzi(), 0, 1, false);
                        this.zzW++;
                        if ((this.zzl.zzi()[0] & 128) == 128) {
                            throw zzaha.zzb("Extension bit is set in signal byte", null);
                        }
                        this.zzad = this.zzl.zzi()[0];
                        this.zzaa = true;
                    }
                    byte b2 = this.zzad;
                    if ((b2 & 1) == 1) {
                        int i6 = b2 & 2;
                        this.zzT |= 1073741824;
                        if (!this.zzae) {
                            ((zznp) zznvVar).zza(this.zzq.zzi(), 0, 8, false);
                            this.zzW += 8;
                            this.zzae = true;
                            this.zzl.zzi()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                            this.zzl.zzh(0);
                            zzoxVar.zzu(this.zzl, 1, 1);
                            this.zzX++;
                            this.zzq.zzh(0);
                            zzoxVar.zzu(this.zzq, 8, 1);
                            this.zzX += 8;
                        }
                        if (i6 == 2) {
                            if (!this.zzab) {
                                ((zznp) zznvVar).zza(this.zzl.zzi(), 0, 1, false);
                                this.zzW++;
                                this.zzl.zzh(0);
                                this.zzac = this.zzl.zzn();
                                this.zzab = true;
                            }
                            int i7 = this.zzac * 4;
                            this.zzl.zza(i7);
                            ((zznp) zznvVar).zza(this.zzl.zzi(), 0, i7, false);
                            this.zzW += i7;
                            int i8 = (this.zzac >> 1) + 1;
                            int i9 = (i8 * 6) + 2;
                            ByteBuffer byteBuffer = this.zzt;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.zzt = ByteBuffer.allocate(i9);
                            }
                            this.zzt.position(0);
                            this.zzt.putShort((short) i8);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i3 = this.zzac;
                                if (i10 >= i3) {
                                    break;
                                }
                                int zzB = this.zzl.zzB();
                                if (i10 % 2 == 0) {
                                    this.zzt.putShort((short) (zzB - i11));
                                } else {
                                    this.zzt.putInt(zzB - i11);
                                }
                                i10++;
                                i11 = zzB;
                            }
                            int i12 = (i2 - this.zzW) - i11;
                            if ((i3 & 1) == 1) {
                                this.zzt.putInt(i12);
                            } else {
                                this.zzt.putShort((short) i12);
                                this.zzt.putInt(0);
                            }
                            this.zzr.zzb(this.zzt.array(), i9);
                            zzoxVar.zzu(this.zzr, i9, 1);
                            this.zzX += i9;
                        }
                    }
                } else {
                    byte[] bArr = zzqgVar.zzh;
                    if (bArr != null) {
                        this.zzo.zzb(bArr, bArr.length);
                    }
                }
                if (zzqgVar.zzf > 0) {
                    this.zzT |= 268435456;
                    this.zzs.zza(0);
                    this.zzl.zza(4);
                    this.zzl.zzi()[0] = (byte) ((i2 >> 24) & 255);
                    this.zzl.zzi()[1] = (byte) ((i2 >> 16) & 255);
                    this.zzl.zzi()[2] = (byte) ((i2 >> 8) & 255);
                    this.zzl.zzi()[3] = (byte) (i2 & 255);
                    zzoxVar.zzu(this.zzl, 4, 2);
                    this.zzX += 4;
                }
                this.zzZ = true;
            }
            int zze2 = this.zzo.zze() + i2;
            if (!"V_MPEG4/ISO/AVC".equals(zzqgVar.zzb) && !"V_MPEGH/ISO/HEVC".equals(zzqgVar.zzb)) {
                if (zzqgVar.zzS != null) {
                    zzakt.zzd(this.zzo.zze() == 0);
                    zzqgVar.zzS.zzb(zznvVar);
                }
                while (true) {
                    int i13 = this.zzW;
                    if (i13 >= zze2) {
                        break;
                    }
                    int zzx = zzx(zznvVar, zzoxVar, zze2 - i13);
                    this.zzW += zzx;
                    this.zzX += zzx;
                }
            } else {
                byte[] zzi = this.zzk.zzi();
                zzi[0] = 0;
                zzi[1] = 0;
                zzi[2] = 0;
                int i14 = zzqgVar.zzW;
                int i15 = 4 - i14;
                while (this.zzW < zze2) {
                    int i16 = this.zzY;
                    if (i16 == 0) {
                        int min = Math.min(i14, this.zzo.zzd());
                        ((zznp) zznvVar).zza(zzi, i15 + min, i14 - min, false);
                        if (min > 0) {
                            this.zzo.zzm(zzi, i15, min);
                        }
                        this.zzW += i14;
                        this.zzk.zzh(0);
                        this.zzY = this.zzk.zzB();
                        this.zzj.zzh(0);
                        zzov.zzb(zzoxVar, this.zzj, 4);
                        this.zzX += 4;
                    } else {
                        int zzx2 = zzx(zznvVar, zzoxVar, i16);
                        this.zzW += zzx2;
                        this.zzX += zzx2;
                        this.zzY -= zzx2;
                    }
                }
            }
            if ("A_VORBIS".equals(zzqgVar.zzb)) {
                this.zzm.zzh(0);
                zzov.zzb(zzoxVar, this.zzm, 4);
                this.zzX += 4;
            }
            int i17 = this.zzX;
            zzu();
            return i17;
        }
    }

    private final void zzu() {
        this.zzW = 0;
        this.zzX = 0;
        this.zzY = 0;
        this.zzZ = false;
        this.zzaa = false;
        this.zzab = false;
        this.zzac = 0;
        this.zzad = (byte) 0;
        this.zzae = false;
        this.zzo.zza(0);
    }

    private final void zzv(zznv zznvVar, byte[] bArr, int i2) throws IOException {
        int length = bArr.length;
        int i3 = i2 + 32;
        if (this.zzp.zzj() < i3) {
            zzamf zzamfVar = this.zzp;
            byte[] copyOf = Arrays.copyOf(bArr, i3 + i2);
            zzamfVar.zzb(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, this.zzp.zzi(), 0, 32);
        }
        ((zznp) zznvVar).zza(this.zzp.zzi(), 32, i2, false);
        this.zzp.zzh(0);
        this.zzp.zzf(i3);
    }

    private static byte[] zzw(long j2, String str, long j3) {
        zzakt.zza(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * 3600) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return zzamq.zzs(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    private final int zzx(zznv zznvVar, zzox zzoxVar, int i2) throws IOException {
        int zzd2 = this.zzo.zzd();
        if (zzd2 > 0) {
            int min = Math.min(i2, zzd2);
            zzov.zzb(zzoxVar, this.zzo, min);
            return min;
        }
        return zzov.zza(zzoxVar, zznvVar, i2, false);
    }

    private final long zzy(long j2) throws zzaha {
        long j3 = this.zzw;
        if (j3 != -9223372036854775807L) {
            return zzamq.zzH(j2, j3, 1000L);
        }
        throw zzaha.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static int[] zzz(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length;
        return length >= i2 ? iArr : new int[Math.max(length + length, i2)];
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final boolean zza(zznv zznvVar) throws IOException {
        return new zzqj().zza(zznvVar);
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzb(zznx zznxVar) {
        this.zzaf = zznxVar;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final int zzc(zznv zznvVar, zzoq zzoqVar) throws IOException {
        this.zzK = false;
        while (!this.zzK) {
            if (!this.zzag.zzc(zznvVar)) {
                for (int i2 = 0; i2 < this.zzh.size(); i2++) {
                    zzqg valueAt = this.zzh.valueAt(i2);
                    zzqg.zze(valueAt);
                    zzqh zzqhVar = valueAt.zzS;
                    if (zzqhVar != null) {
                        zzqhVar.zzd(valueAt);
                    }
                }
                return -1;
            }
            long zzn = zznvVar.zzn();
            if (this.zzD) {
                this.zzF = zzn;
                zzoqVar.zza = this.zzE;
                this.zzD = false;
                return 1;
            } else if (this.zzA) {
                long j2 = this.zzF;
                if (j2 != -1) {
                    zzoqVar.zza = j2;
                    this.zzF = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zznu
    public final void zzd(long j2, long j3) {
        this.zzG = -9223372036854775807L;
        this.zzL = 0;
        this.zzag.zzb();
        this.zzg.zza();
        zzu();
        for (int i2 = 0; i2 < this.zzh.size(); i2++) {
            zzqh zzqhVar = this.zzh.valueAt(i2).zzS;
            if (zzqhVar != null) {
                zzqhVar.zza();
            }
        }
    }

    public final void zzh(int i2, long j2, long j3) throws zzaha {
        zzakt.zze(this.zzaf);
        if (i2 == 160) {
            this.zzV = false;
        } else if (i2 == 174) {
            this.zzz = new zzqg(null);
        } else if (i2 == 187) {
            this.zzJ = false;
        } else if (i2 == 19899) {
            this.zzB = -1;
            this.zzC = -1L;
        } else if (i2 == 20533) {
            zzp(i2);
            this.zzz.zzg = true;
        } else if (i2 == 21968) {
            zzp(i2);
            this.zzz.zzw = true;
        } else if (i2 == 408125543) {
            long j4 = this.zzv;
            if (j4 != -1 && j4 != j2) {
                throw zzaha.zzb("Multiple Segment elements not supported", null);
            }
            this.zzv = j2;
            this.zzu = j3;
        } else if (i2 == 475249515) {
            this.zzH = new zzalo(32);
            this.zzI = new zzalo(32);
        } else if (i2 == 524531317 && !this.zzA) {
            if (this.zzi && this.zzE != -1) {
                this.zzD = true;
                return;
            }
            this.zzaf.zzD(new zzos(this.zzy, 0L));
            this.zzA = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0252, code lost:
        if (r3.equals("V_AV1") != false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(int r22) throws com.google.android.gms.internal.ads.zzaha {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzi(int):void");
    }

    public final void zzj(int i2, long j2) throws zzaha {
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw zzaha.zzb(sb.toString(), null);
        } else if (i2 == 20530) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw zzaha.zzb(sb2.toString(), null);
        } else {
            switch (i2) {
                case 131:
                    zzp(i2);
                    this.zzz.zzd = (int) j2;
                    return;
                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                    zzp(i2);
                    this.zzz.zzU = j2 == 1;
                    return;
                case 155:
                    this.zzN = zzy(j2);
                    return;
                case 159:
                    zzp(i2);
                    this.zzz.zzN = (int) j2;
                    return;
                case SyslogConstants.LOG_LOCAL6 /* 176 */:
                    zzp(i2);
                    this.zzz.zzl = (int) j2;
                    return;
                case 179:
                    zzq(i2);
                    this.zzH.zza(zzy(j2));
                    return;
                case 186:
                    zzp(i2);
                    this.zzz.zzm = (int) j2;
                    return;
                case 215:
                    zzp(i2);
                    this.zzz.zzc = (int) j2;
                    return;
                case 231:
                    this.zzG = zzy(j2);
                    return;
                case 238:
                    this.zzU = (int) j2;
                    return;
                case 241:
                    if (this.zzJ) {
                        return;
                    }
                    zzq(i2);
                    this.zzI.zza(j2);
                    this.zzJ = true;
                    return;
                case 251:
                    this.zzV = true;
                    return;
                case 16871:
                    zzp(i2);
                    zzqg.zza(this.zzz, (int) j2);
                    return;
                case 16980:
                    if (j2 == 3) {
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("ContentCompAlgo ");
                    sb3.append(j2);
                    sb3.append(" not supported");
                    throw zzaha.zzb(sb3.toString(), null);
                case 17029:
                    if (j2 < 1 || j2 > 2) {
                        StringBuilder sb4 = new StringBuilder(53);
                        sb4.append("DocTypeReadVersion ");
                        sb4.append(j2);
                        sb4.append(" not supported");
                        throw zzaha.zzb(sb4.toString(), null);
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
                    throw zzaha.zzb(sb5.toString(), null);
                case 18401:
                    if (j2 == 5) {
                        return;
                    }
                    StringBuilder sb6 = new StringBuilder(49);
                    sb6.append("ContentEncAlgo ");
                    sb6.append(j2);
                    sb6.append(" not supported");
                    throw zzaha.zzb(sb6.toString(), null);
                case 18408:
                    if (j2 == 1) {
                        return;
                    }
                    StringBuilder sb7 = new StringBuilder(56);
                    sb7.append("AESSettingsCipherMode ");
                    sb7.append(j2);
                    sb7.append(" not supported");
                    throw zzaha.zzb(sb7.toString(), null);
                case 21420:
                    this.zzC = j2 + this.zzv;
                    return;
                case 21432:
                    zzp(i2);
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        this.zzz.zzv = 0;
                        return;
                    } else if (i3 == 1) {
                        this.zzz.zzv = 2;
                        return;
                    } else if (i3 == 3) {
                        this.zzz.zzv = 1;
                        return;
                    } else if (i3 != 15) {
                        return;
                    } else {
                        this.zzz.zzv = 3;
                        return;
                    }
                case 21680:
                    zzp(i2);
                    this.zzz.zzn = (int) j2;
                    return;
                case 21682:
                    zzp(i2);
                    this.zzz.zzp = (int) j2;
                    return;
                case 21690:
                    zzp(i2);
                    this.zzz.zzo = (int) j2;
                    return;
                case 21930:
                    zzp(i2);
                    this.zzz.zzT = j2 == 1;
                    return;
                case 21998:
                    zzp(i2);
                    this.zzz.zzf = (int) j2;
                    return;
                case 22186:
                    zzp(i2);
                    this.zzz.zzQ = j2;
                    return;
                case 22203:
                    zzp(i2);
                    this.zzz.zzR = j2;
                    return;
                case 25188:
                    zzp(i2);
                    this.zzz.zzO = (int) j2;
                    return;
                case 30321:
                    zzp(i2);
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        this.zzz.zzq = 0;
                        return;
                    } else if (i4 == 1) {
                        this.zzz.zzq = 1;
                        return;
                    } else if (i4 == 2) {
                        this.zzz.zzq = 2;
                        return;
                    } else if (i4 != 3) {
                        return;
                    } else {
                        this.zzz.zzq = 3;
                        return;
                    }
                case 2352003:
                    zzp(i2);
                    this.zzz.zze = (int) j2;
                    return;
                case 2807729:
                    this.zzw = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            zzp(i2);
                            int i5 = (int) j2;
                            if (i5 == 1) {
                                this.zzz.zzz = 2;
                                return;
                            } else if (i5 != 2) {
                                return;
                            } else {
                                this.zzz.zzz = 1;
                                return;
                            }
                        case 21946:
                            zzp(i2);
                            int zzb2 = zzj.zzb((int) j2);
                            if (zzb2 != -1) {
                                this.zzz.zzy = zzb2;
                                return;
                            }
                            return;
                        case 21947:
                            zzp(i2);
                            this.zzz.zzw = true;
                            int zza2 = zzj.zza((int) j2);
                            if (zza2 != -1) {
                                this.zzz.zzx = zza2;
                                return;
                            }
                            return;
                        case 21948:
                            zzp(i2);
                            this.zzz.zzA = (int) j2;
                            return;
                        case 21949:
                            zzp(i2);
                            this.zzz.zzB = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzk(int i2, double d2) throws zzaha {
        if (i2 == 181) {
            zzp(i2);
            this.zzz.zzP = (int) d2;
        } else if (i2 == 17545) {
            this.zzx = (long) d2;
        } else {
            switch (i2) {
                case 21969:
                    zzp(i2);
                    this.zzz.zzC = (float) d2;
                    return;
                case 21970:
                    zzp(i2);
                    this.zzz.zzD = (float) d2;
                    return;
                case 21971:
                    zzp(i2);
                    this.zzz.zzE = (float) d2;
                    return;
                case 21972:
                    zzp(i2);
                    this.zzz.zzF = (float) d2;
                    return;
                case 21973:
                    zzp(i2);
                    this.zzz.zzG = (float) d2;
                    return;
                case 21974:
                    zzp(i2);
                    this.zzz.zzH = (float) d2;
                    return;
                case 21975:
                    zzp(i2);
                    this.zzz.zzI = (float) d2;
                    return;
                case 21976:
                    zzp(i2);
                    this.zzz.zzJ = (float) d2;
                    return;
                case 21977:
                    zzp(i2);
                    this.zzz.zzK = (float) d2;
                    return;
                case 21978:
                    zzp(i2);
                    this.zzz.zzL = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            zzp(i2);
                            this.zzz.zzr = (float) d2;
                            return;
                        case 30324:
                            zzp(i2);
                            this.zzz.zzs = (float) d2;
                            return;
                        case 30325:
                            zzp(i2);
                            this.zzz.zzt = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public final void zzl(int i2, String str) throws zzaha {
        if (i2 == 134) {
            zzp(i2);
            this.zzz.zzb = str;
        } else if (i2 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder(str.length() + 22);
            sb.append("DocType ");
            sb.append(str);
            sb.append(" not supported");
            throw zzaha.zzb(sb.toString(), null);
        } else if (i2 == 21358) {
            zzp(i2);
            this.zzz.zza = str;
        } else if (i2 != 2274716) {
        } else {
            zzp(i2);
            zzqg.zzc(this.zzz, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0284, code lost:
        throw com.google.android.gms.internal.ads.zzaha.zzb("EBML lacing sample size out of range.", null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzm(int r19, int r20, com.google.android.gms.internal.ads.zznv r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzm(int, int, com.google.android.gms.internal.ads.zznv):void");
    }
}
