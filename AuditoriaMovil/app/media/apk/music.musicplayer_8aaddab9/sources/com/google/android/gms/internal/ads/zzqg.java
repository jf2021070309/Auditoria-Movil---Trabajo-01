package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class zzqg {
    public byte[] zzM;
    public zzqh zzS;
    public boolean zzT;
    public zzox zzV;
    public int zzW;
    private int zzX;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzow zzi;
    public byte[] zzj;
    public zzn zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = 0;
    public int zzq = -1;
    public float zzr = 0.0f;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public byte[] zzu = null;
    public int zzv = -1;
    public boolean zzw = false;
    public int zzx = -1;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = 1000;
    public int zzB = 200;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public int zzN = 1;
    public int zzO = -1;
    public int zzP = 8000;
    public long zzQ = 0;
    public long zzR = 0;
    public boolean zzU = true;
    private String zzY = "eng";

    private zzqg() {
    }

    public /* synthetic */ zzqg(zzqf zzqfVar) {
    }

    private static Pair<String, List<byte[]>> zzf(zzamf zzamfVar) throws zzaha {
        try {
            zzamfVar.zzk(16);
            long zzu = zzamfVar.zzu();
            if (zzu == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (zzu == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (zzu != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            }
            int zzg = zzamfVar.zzg() + 20;
            byte[] zzi = zzamfVar.zzi();
            while (true) {
                int length = zzi.length;
                if (zzg >= length - 4) {
                    throw zzaha.zzb("Failed to find FourCC VC1 initialization data", null);
                }
                if (zzi[zzg] == 0 && zzi[zzg + 1] == 0 && zzi[zzg + 2] == 1 && zzi[zzg + 3] == 15) {
                    return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(zzi, zzg, length)));
                }
                zzg++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing FourCC private data", null);
        }
    }

    private static List<byte[]> zzg(byte[] bArr) throws zzaha {
        int i2;
        int i3;
        try {
            if (bArr[0] == 2) {
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    i2 = bArr[i4] & 255;
                    if (i2 != 255) {
                        break;
                    }
                    i5 += 255;
                    i4++;
                }
                int i6 = i4 + 1;
                int i7 = i5 + i2;
                int i8 = 0;
                while (true) {
                    i3 = bArr[i6] & 255;
                    if (i3 != 255) {
                        break;
                    }
                    i8 += 255;
                    i6++;
                }
                int i9 = i6 + 1;
                int i10 = i8 + i3;
                if (bArr[i9] == 1) {
                    byte[] bArr2 = new byte[i7];
                    System.arraycopy(bArr, i9, bArr2, 0, i7);
                    int i11 = i9 + i7;
                    if (bArr[i11] == 3) {
                        int i12 = i11 + i10;
                        if (bArr[i12] == 5) {
                            int length = bArr.length - i12;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i12, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw zzaha.zzb("Error parsing vorbis codec private", null);
                    }
                    throw zzaha.zzb("Error parsing vorbis codec private", null);
                }
                throw zzaha.zzb("Error parsing vorbis codec private", null);
            }
            throw zzaha.zzb("Error parsing vorbis codec private", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzamf zzamfVar) throws zzaha {
        UUID uuid;
        UUID uuid2;
        try {
            int zzp = zzamfVar.zzp();
            if (zzp == 1) {
                return true;
            }
            if (zzp == 65534) {
                zzamfVar.zzh(24);
                long zzx = zzamfVar.zzx();
                uuid = zzqi.zze;
                if (zzx == uuid.getMostSignificantBits()) {
                    long zzx2 = zzamfVar.zzx();
                    uuid2 = zzqi.zze;
                    if (zzx2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzaha.zzb("Error parsing MS/ACM codec private", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    private final byte[] zzi(String str) throws zzaha {
        byte[] bArr = this.zzj;
        if (bArr == null) {
            String valueOf = String.valueOf(str);
            throw zzaha.zzb(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    public final void zzd(zznx zznxVar, int i2) throws zzaha {
        char c2;
        List<byte[]> list;
        String str;
        int i3;
        String str2;
        List<byte[]> list2;
        ArrayList arrayList;
        int zzO;
        byte[] bArr;
        zzfoj zzfojVar;
        int i4;
        zzj zzjVar;
        Map map;
        Map map2;
        byte[] bArr2;
        int i5;
        Map map3;
        zznr zza;
        List<byte[]> list3;
        String str3 = this.zzb;
        int i6 = 1;
        int i7 = 0;
        int i8 = 3;
        switch (str3.hashCode()) {
            case -2095576542:
                if (str3.equals("V_MPEG4/ISO/AP")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -2095575984:
                if (str3.equals("V_MPEG4/ISO/SP")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1985379776:
                if (str3.equals("A_MS/ACM")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -1784763192:
                if (str3.equals("A_TRUEHD")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -1730367663:
                if (str3.equals("A_VORBIS")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1482641358:
                if (str3.equals("A_MPEG/L2")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1482641357:
                if (str3.equals("A_MPEG/L3")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -1373388978:
                if (str3.equals("V_MS/VFW/FOURCC")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -933872740:
                if (str3.equals("S_DVBSUB")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case -538363189:
                if (str3.equals("V_MPEG4/ISO/ASP")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -538363109:
                if (str3.equals("V_MPEG4/ISO/AVC")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -425012669:
                if (str3.equals("S_VOBSUB")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case -356037306:
                if (str3.equals("A_DTS/LOSSLESS")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 62923557:
                if (str3.equals("A_AAC")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 62923603:
                if (str3.equals("A_AC3")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 62927045:
                if (str3.equals("A_DTS")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 82318131:
                if (str3.equals("V_AV1")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 82338133:
                if (str3.equals("V_VP8")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 82338134:
                if (str3.equals("V_VP9")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99146302:
                if (str3.equals("S_HDMV/PGS")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 444813526:
                if (str3.equals("V_THEORA")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 542569478:
                if (str3.equals("A_DTS/EXPRESS")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 635596514:
                if (str3.equals("A_PCM/FLOAT/IEEE")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 725948237:
                if (str3.equals("A_PCM/INT/BIG")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 725957860:
                if (str3.equals("A_PCM/INT/LIT")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 738597099:
                if (str3.equals("S_TEXT/ASS")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 855502857:
                if (str3.equals("V_MPEGH/ISO/HEVC")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1422270023:
                if (str3.equals("S_TEXT/UTF8")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1809237540:
                if (str3.equals("V_MPEG2")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1950749482:
                if (str3.equals("A_EAC3")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 1950789798:
                if (str3.equals("A_FLAC")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 1951062397:
                if (str3.equals("A_OPUS")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str4 = "audio/raw";
        switch (c2) {
            case 0:
                str4 = "video/x-vnd.on2.vp8";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 1:
                str4 = "video/x-vnd.on2.vp9";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 2:
                str4 = "video/av01";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 3:
                str4 = "video/mpeg2";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 4:
            case 5:
            case 6:
                byte[] bArr3 = this.zzj;
                str4 = "video/mp4v-es";
                zzfojVar = bArr3 == null ? null : Collections.singletonList(bArr3);
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 7:
                zzne zza2 = zzne.zza(new zzamf(zzi(str3)));
                list = zza2.zza;
                this.zzW = zza2.zzb;
                str = zza2.zzf;
                str4 = "video/avc";
                i3 = -1;
                i8 = -1;
                List<byte[]> list4 = list;
                str2 = str;
                list2 = list4;
                break;
            case '\b':
                zzok zza3 = zzok.zza(new zzamf(zzi(str3)));
                list = zza3.zza;
                this.zzW = zza3.zzb;
                str = zza3.zzc;
                str4 = "video/hevc";
                i3 = -1;
                i8 = -1;
                List<byte[]> list42 = list;
                str2 = str;
                list2 = list42;
                break;
            case '\t':
                Pair<String, List<byte[]>> zzf = zzf(new zzamf(zzi(str3)));
                str4 = (String) zzf.first;
                zzfojVar = (List) zzf.second;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case '\n':
                str4 = "video/x-unknown";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 11:
                List<byte[]> zzg = zzg(zzi(str3));
                str4 = "audio/vorbis";
                str2 = null;
                i3 = Compressor.BUFFER_SIZE;
                arrayList = zzg;
                i8 = -1;
                list2 = arrayList;
                break;
            case '\f':
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(zzi(this.zzb));
                ByteBuffer allocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList2.add(allocate.order(byteOrder).putLong(this.zzQ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzR).array());
                str4 = "audio/opus";
                str2 = null;
                i3 = 5760;
                arrayList = arrayList2;
                i8 = -1;
                list2 = arrayList;
                break;
            case '\r':
                List<byte[]> singletonList = Collections.singletonList(zzi(str3));
                zzmv zza4 = zzmx.zza(this.zzj);
                this.zzP = zza4.zza;
                this.zzN = zza4.zzb;
                str2 = zza4.zzc;
                str4 = "audio/mp4a-latm";
                list3 = singletonList;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 14:
                str4 = "audio/mpeg-L2";
                arrayList = null;
                str2 = null;
                i3 = 4096;
                i8 = -1;
                list2 = arrayList;
                break;
            case 15:
                str4 = "audio/mpeg";
                arrayList = null;
                str2 = null;
                i3 = 4096;
                i8 = -1;
                list2 = arrayList;
                break;
            case 16:
                str4 = "audio/ac3";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 17:
                str4 = "audio/eac3";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
                this.zzS = new zzqh();
                str4 = "audio/true-hd";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 19:
            case 20:
                str4 = "audio/vnd.dts";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                str4 = "audio/vnd.dts.hd";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 22:
                str4 = "audio/flac";
                zzfojVar = Collections.singletonList(zzi(str3));
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                if (zzh(new zzamf(zzi(str3)))) {
                    zzO = zzamq.zzO(this.zzO);
                    if (zzO == 0) {
                        int i9 = this.zzO;
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i9);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb.toString());
                    }
                    i8 = zzO;
                    list2 = null;
                    str2 = null;
                    i3 = -1;
                    break;
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                str4 = "audio/x-unknown";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 24:
                zzO = zzamq.zzO(this.zzO);
                if (zzO == 0) {
                    int i10 = this.zzO;
                    StringBuilder sb2 = new StringBuilder(89);
                    sb2.append("Unsupported little endian PCM bit depth: ");
                    sb2.append(i10);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb2.toString());
                    str4 = "audio/x-unknown";
                    zzfojVar = null;
                    str2 = null;
                    list3 = zzfojVar;
                    i3 = -1;
                    arrayList = list3;
                    i8 = -1;
                    list2 = arrayList;
                    break;
                }
                i8 = zzO;
                list2 = null;
                str2 = null;
                i3 = -1;
                break;
            case 25:
                int i11 = this.zzO;
                if (i11 != 8) {
                    if (i11 != 16) {
                        StringBuilder sb3 = new StringBuilder(86);
                        sb3.append("Unsupported big endian PCM bit depth: ");
                        sb3.append(i11);
                        sb3.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb3.toString());
                        str4 = "audio/x-unknown";
                        zzfojVar = null;
                        str2 = null;
                        list3 = zzfojVar;
                        i3 = -1;
                        arrayList = list3;
                        i8 = -1;
                        list2 = arrayList;
                        break;
                    } else {
                        list2 = null;
                        str2 = null;
                        i3 = -1;
                        i8 = 268435456;
                        break;
                    }
                }
                list2 = null;
                str2 = null;
                i3 = -1;
                break;
            case 26:
                int i12 = this.zzO;
                if (i12 != 32) {
                    StringBuilder sb4 = new StringBuilder(90);
                    sb4.append("Unsupported floating point PCM bit depth: ");
                    sb4.append(i12);
                    sb4.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb4.toString());
                    str4 = "audio/x-unknown";
                    zzfojVar = null;
                    str2 = null;
                    list3 = zzfojVar;
                    i3 = -1;
                    arrayList = list3;
                    i8 = -1;
                    list2 = arrayList;
                    break;
                } else {
                    list2 = null;
                    str2 = null;
                    i3 = -1;
                    i8 = 4;
                    break;
                }
            case 27:
                str4 = "application/x-subrip";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 28:
                bArr = zzqi.zzc;
                str4 = "text/x-ssa";
                zzfojVar = zzfoj.zzk(bArr, zzi(this.zzb));
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 29:
                str4 = "application/vobsub";
                zzfojVar = zzfoj.zzj(zzi(str3));
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 30:
                str4 = "application/pgs";
                zzfojVar = null;
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            case 31:
                byte[] bArr4 = new byte[4];
                System.arraycopy(zzi(str3), 0, bArr4, 0, 4);
                str4 = "application/dvbsubs";
                zzfojVar = zzfoj.zzj(bArr4);
                str2 = null;
                list3 = zzfojVar;
                i3 = -1;
                arrayList = list3;
                i8 = -1;
                list2 = arrayList;
                break;
            default:
                throw zzaha.zzb("Unrecognized codec identifier.", null);
        }
        byte[] bArr5 = this.zzM;
        if (bArr5 != null && (zza = zznr.zza(new zzamf(bArr5))) != null) {
            str2 = zza.zza;
            str4 = "video/dolby-vision";
        }
        String str5 = str4;
        int i13 = (this.zzU ? 1 : 0) | (true != this.zzT ? 0 : 2);
        zzaft zzaftVar = new zzaft();
        if (zzalt.zza(str5)) {
            zzaftVar.zzaa(this.zzN);
            zzaftVar.zzab(this.zzP);
            zzaftVar.zzac(i8);
        } else if (zzalt.zzb(str5)) {
            if (this.zzp == 0) {
                int i14 = this.zzn;
                i4 = -1;
                if (i14 == -1) {
                    i14 = this.zzl;
                }
                this.zzn = i14;
                int i15 = this.zzo;
                if (i15 == -1) {
                    i15 = this.zzm;
                }
                this.zzo = i15;
            } else {
                i4 = -1;
            }
            int i16 = this.zzn;
            float f2 = (i16 == i4 || (i5 = this.zzo) == i4) ? -1.0f : (this.zzm * i16) / (this.zzl * i5);
            if (this.zzw) {
                if (this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f || this.zzG == -1.0f || this.zzH == -1.0f || this.zzI == -1.0f || this.zzJ == -1.0f || this.zzK == -1.0f || this.zzL == -1.0f) {
                    bArr2 = null;
                } else {
                    byte[] bArr6 = new byte[25];
                    ByteBuffer order = ByteBuffer.wrap(bArr6).order(ByteOrder.LITTLE_ENDIAN);
                    order.put((byte) 0);
                    order.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                    order.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                    order.putShort((short) (this.zzK + 0.5f));
                    order.putShort((short) (this.zzL + 0.5f));
                    order.putShort((short) this.zzA);
                    order.putShort((short) this.zzB);
                    bArr2 = bArr6;
                }
                zzjVar = new zzj(this.zzx, this.zzz, this.zzy, bArr2);
            } else {
                zzjVar = null;
            }
            if (this.zza != null) {
                map = zzqi.zzf;
                if (map.containsKey(this.zza)) {
                    map2 = zzqi.zzf;
                    i4 = ((Integer) map2.get(this.zza)).intValue();
                }
            }
            if (this.zzq == 0 && Float.compare(this.zzr, 0.0f) == 0 && Float.compare(this.zzs, 0.0f) == 0) {
                if (Float.compare(this.zzt, 0.0f) != 0) {
                    if (Float.compare(this.zzs, 90.0f) == 0) {
                        i7 = 90;
                    } else if (Float.compare(this.zzs, -180.0f) == 0 || Float.compare(this.zzs, 180.0f) == 0) {
                        i7 = 180;
                    } else if (Float.compare(this.zzs, -90.0f) == 0) {
                        i7 = 270;
                    }
                }
                zzaftVar.zzS(this.zzl);
                zzaftVar.zzT(this.zzm);
                zzaftVar.zzW(f2);
                zzaftVar.zzV(i7);
                zzaftVar.zzX(this.zzu);
                zzaftVar.zzY(this.zzv);
                zzaftVar.zzZ(zzjVar);
                i6 = 2;
            }
            i7 = i4;
            zzaftVar.zzS(this.zzl);
            zzaftVar.zzT(this.zzm);
            zzaftVar.zzW(f2);
            zzaftVar.zzV(i7);
            zzaftVar.zzX(this.zzu);
            zzaftVar.zzY(this.zzv);
            zzaftVar.zzZ(zzjVar);
            i6 = 2;
        } else if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
            throw zzaha.zzb("Unexpected MIME type.", null);
        } else {
            i6 = 3;
        }
        if (this.zza != null) {
            map3 = zzqi.zzf;
            if (!map3.containsKey(this.zza)) {
                zzaftVar.zzF(this.zza);
            }
        }
        zzaftVar.zzE(i2);
        zzaftVar.zzN(str5);
        zzaftVar.zzO(i3);
        zzaftVar.zzG(this.zzY);
        zzaftVar.zzH(i13);
        zzaftVar.zzP(list2);
        zzaftVar.zzK(str2);
        zzaftVar.zzQ(this.zzk);
        zzafv zzah = zzaftVar.zzah();
        zzox zzB = zznxVar.zzB(this.zzc, i6);
        this.zzV = zzB;
        zzB.zzs(zzah);
    }
}
