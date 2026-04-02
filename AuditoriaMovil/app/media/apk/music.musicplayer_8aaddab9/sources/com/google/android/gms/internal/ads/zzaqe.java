package com.google.android.gms.internal.ads;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.Compressor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public final class zzaqe {
    public boolean zzL;
    public zzapx zzN;
    public int zzO;
    public String zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public boolean zze;
    public byte[] zzf;
    public zzapw zzg;
    public byte[] zzh;
    public zzapk zzi;
    public int zzj = -1;
    public int zzk = -1;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = 0;
    public byte[] zzo = null;
    public int zzp = -1;
    public boolean zzq = false;
    public int zzr = -1;
    public int zzs = -1;
    public int zzt = -1;
    public int zzu = 1000;
    public int zzv = 200;
    public float zzw = -1.0f;
    public float zzx = -1.0f;
    public float zzy = -1.0f;
    public float zzz = -1.0f;
    public float zzA = -1.0f;
    public float zzB = -1.0f;
    public float zzC = -1.0f;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public int zzG = 1;
    public int zzH = -1;
    public int zzI = 8000;
    public long zzJ = 0;
    public long zzK = 0;
    public boolean zzM = true;
    private String zzP = "eng";

    private zzaqe() {
    }

    public /* synthetic */ zzaqe(zzaqd zzaqdVar) {
    }

    private static List<byte[]> zzc(zzaux zzauxVar) throws zzanp {
        try {
            zzauxVar.zzj(16);
            if (zzauxVar.zzq() != 826496599) {
                return null;
            }
            int zzg = zzauxVar.zzg() + 20;
            byte[] bArr = zzauxVar.zza;
            while (true) {
                int length = bArr.length;
                if (zzg >= length - 4) {
                    throw new zzanp("Failed to find FourCC VC1 initialization data");
                }
                if (bArr[zzg] == 0 && bArr[zzg + 1] == 0 && bArr[zzg + 2] == 1 && bArr[zzg + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, zzg, length));
                }
                zzg++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzanp {
        int i2;
        int i3;
        try {
            if (bArr[0] == 2) {
                int i4 = 1;
                int i5 = 0;
                while (true) {
                    i2 = bArr[i4];
                    if (i2 != -1) {
                        break;
                    }
                    i5 += 255;
                    i4++;
                }
                int i6 = i4 + 1;
                int i7 = i5 + i2;
                int i8 = 0;
                while (true) {
                    i3 = bArr[i6];
                    if (i3 != -1) {
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
                        throw new zzanp("Error parsing vorbis codec private");
                    }
                    throw new zzanp("Error parsing vorbis codec private");
                }
                throw new zzanp("Error parsing vorbis codec private");
            }
            throw new zzanp("Error parsing vorbis codec private");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing vorbis codec private");
        }
    }

    private static boolean zze(zzaux zzauxVar) throws zzanp {
        UUID uuid;
        UUID uuid2;
        try {
            int zzn = zzauxVar.zzn();
            if (zzn == 1) {
                return true;
            }
            if (zzn == 65534) {
                zzauxVar.zzi(24);
                long zzs = zzauxVar.zzs();
                uuid = zzaqf.zzd;
                if (zzs == uuid.getMostSignificantBits()) {
                    long zzs2 = zzauxVar.zzs();
                    uuid2 = zzaqf.zzd;
                    if (zzs2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzanp("Error parsing MS/ACM codec private");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void zzb(zzapp zzappVar, int i2) throws zzanp {
        char c2;
        List<byte[]> list;
        List<byte[]> list2;
        int i3;
        int i4;
        ArrayList arrayList;
        int zzo;
        List<byte[]> list3;
        zzanm zze;
        int i5;
        int i6;
        zzavh zzavhVar;
        byte[] bArr;
        int i7;
        String str = this.zza;
        int i8 = 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str2 = "audio/raw";
        switch (c2) {
            case 0:
                str2 = "video/x-vnd.on2.vp8";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 1:
                str2 = "video/x-vnd.on2.vp9";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 2:
                str2 = "video/mpeg2";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 3:
            case 4:
            case 5:
                byte[] bArr2 = this.zzh;
                str2 = "video/mp4v-es";
                list2 = bArr2 == null ? null : Collections.singletonList(bArr2);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 6:
                zzavf zza = zzavf.zza(new zzaux(this.zzh));
                list = zza.zza;
                this.zzO = zza.zzb;
                str2 = "video/avc";
                list2 = list;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 7:
                zzavl zza2 = zzavl.zza(new zzaux(this.zzh));
                list = zza2.zza;
                this.zzO = zza2.zzb;
                str2 = "video/hevc";
                list2 = list;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\b':
                List<byte[]> zzc = zzc(new zzaux(this.zzh));
                if (zzc != null) {
                    str2 = "video/wvc1";
                    list2 = zzc;
                } else {
                    Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                    str2 = "video/x-unknown";
                    list2 = zzc;
                }
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\t':
                str2 = "video/x-unknown";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\n':
                List<byte[]> zzd = zzd(this.zzh);
                str2 = "audio/vorbis";
                i3 = -1;
                i4 = Compressor.BUFFER_SIZE;
                arrayList = zzd;
                break;
            case 11:
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.zzh);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzJ).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.zzK).array());
                str2 = "audio/opus";
                i3 = -1;
                i4 = 5760;
                arrayList = arrayList2;
                break;
            case '\f':
                str2 = "audio/mp4a-latm";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case '\r':
                str2 = "audio/mpeg-L2";
                arrayList = null;
                i3 = -1;
                i4 = 4096;
                break;
            case 14:
                str2 = "audio/mpeg";
                arrayList = null;
                i3 = -1;
                i4 = 4096;
                break;
            case 15:
                str2 = "audio/ac3";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 16:
                str2 = "audio/eac3";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 17:
                str2 = "audio/true-hd";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case ConnectionResult.SERVICE_UPDATING /* 18 */:
            case 19:
                str2 = "audio/vnd.dts";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 20:
                str2 = "audio/vnd.dts.hd";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                str2 = "audio/x-flac";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 22:
                if (zze(new zzaux(this.zzh))) {
                    zzo = zzave.zzo(this.zzH);
                    if (zzo == 0) {
                        int i9 = this.zzH;
                        StringBuilder sb = new StringBuilder(75);
                        sb.append("Unsupported PCM bit depth: ");
                        sb.append(i9);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        Log.w("MatroskaExtractor", sb.toString());
                    }
                    i3 = zzo;
                    list3 = null;
                    i4 = -1;
                    arrayList = list3;
                    break;
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                str2 = "audio/x-unknown";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
            case ConnectionResult.API_DISABLED /* 23 */:
                zzo = zzave.zzo(this.zzH);
                if (zzo == 0) {
                    int i10 = this.zzH;
                    StringBuilder sb2 = new StringBuilder(75);
                    sb2.append("Unsupported PCM bit depth: ");
                    sb2.append(i10);
                    sb2.append(". Setting mimeType to audio/x-unknown");
                    Log.w("MatroskaExtractor", sb2.toString());
                    str2 = "audio/x-unknown";
                    list2 = null;
                    i3 = -1;
                    list3 = list2;
                    i4 = -1;
                    arrayList = list3;
                    break;
                }
                i3 = zzo;
                list3 = null;
                i4 = -1;
                arrayList = list3;
            case 24:
                str2 = "application/x-subrip";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 25:
                str2 = "application/vobsub";
                list2 = Collections.singletonList(this.zzh);
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 26:
                str2 = "application/pgs";
                list2 = null;
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            case 27:
                byte[] bArr3 = this.zzh;
                str2 = "application/dvbsubs";
                list2 = Collections.singletonList(new byte[]{bArr3[0], bArr3[1], bArr3[2], bArr3[3]});
                i3 = -1;
                list3 = list2;
                i4 = -1;
                arrayList = list3;
                break;
            default:
                throw new zzanp("Unrecognized codec identifier.");
        }
        int i11 = (this.zzM ? 1 : 0) | (true != this.zzL ? 0 : 2);
        if (zzauu.zza(str2)) {
            zze = zzanm.zzc(Integer.toString(i2), str2, null, -1, i4, this.zzG, this.zzI, i3, -1, -1, arrayList, this.zzi, i11, this.zzP, null);
            i8 = 1;
        } else if (zzauu.zzb(str2)) {
            if (this.zzn == 0) {
                int i12 = this.zzl;
                i5 = -1;
                if (i12 == -1) {
                    i12 = this.zzj;
                }
                this.zzl = i12;
                int i13 = this.zzm;
                if (i13 == -1) {
                    i13 = this.zzk;
                }
                this.zzm = i13;
            } else {
                i5 = -1;
            }
            float f2 = (this.zzl == i5 || (i7 = this.zzm) == i5) ? -1.0f : (this.zzk * i6) / (this.zzj * i7);
            if (this.zzq) {
                if (this.zzw == -1.0f || this.zzx == -1.0f || this.zzy == -1.0f || this.zzz == -1.0f || this.zzA == -1.0f || this.zzB == -1.0f || this.zzC == -1.0f || this.zzD == -1.0f || this.zzE == -1.0f || this.zzF == -1.0f) {
                    bArr = null;
                } else {
                    bArr = new byte[25];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.put((byte) 0);
                    wrap.putShort((short) ((this.zzw * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzx * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzy * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzz * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzA * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzB * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzC * 50000.0f) + 0.5f));
                    wrap.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                    wrap.putShort((short) (this.zzE + 0.5f));
                    wrap.putShort((short) (this.zzF + 0.5f));
                    wrap.putShort((short) this.zzu);
                    wrap.putShort((short) this.zzv);
                }
                zzavhVar = new zzavh(this.zzr, this.zzt, this.zzs, bArr);
            } else {
                zzavhVar = null;
            }
            zze = zzanm.zza(Integer.toString(i2), str2, null, -1, i4, this.zzj, this.zzk, -1.0f, arrayList, -1, f2, this.zzo, this.zzp, zzavhVar, this.zzi);
        } else {
            if ("application/x-subrip".equals(str2)) {
                zze = zzanm.zzd(Integer.toString(i2), str2, null, -1, i11, this.zzP, -1, this.zzi, Long.MAX_VALUE, Collections.emptyList());
            } else if (!"application/vobsub".equals(str2) && !"application/pgs".equals(str2) && !"application/dvbsubs".equals(str2)) {
                throw new zzanp("Unexpected MIME type.");
            } else {
                zze = zzanm.zze(Integer.toString(i2), str2, null, -1, arrayList, this.zzP, this.zzi);
            }
            i8 = 3;
        }
        zzapx zzbf = zzappVar.zzbf(this.zzb, i8);
        this.zzN = zzbf;
        zzbf.zza(zze);
    }
}
