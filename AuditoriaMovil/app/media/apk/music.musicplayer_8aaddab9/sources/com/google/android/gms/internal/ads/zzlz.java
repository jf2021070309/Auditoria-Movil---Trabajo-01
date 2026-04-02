package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.common.Scopes;
import e.a.d.a.a;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzlz extends zzfq {
    private static final int[] zzb = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private float zzF;
    private zzy zzG;
    private int zzH;
    private zzma zzI;
    private final Context zze;
    private final zzmi zzf;
    private final zzmt zzg;
    private final boolean zzh;
    private zzly zzi;
    private boolean zzj;
    private boolean zzk;
    private Surface zzl;
    private zzlu zzm;
    private boolean zzn;
    private int zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private long zzy;
    private long zzz;

    public zzlz(Context context, zzfm zzfmVar, zzfs zzfsVar, long j2, boolean z, Handler handler, zzmu zzmuVar, int i2) {
        super(2, zzfmVar, zzfsVar, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzf = new zzmi(applicationContext);
        this.zzg = new zzmt(handler, zzmuVar);
        this.zzh = "NVIDIA".equals(zzamq.zzc);
        this.zzt = -9223372036854775807L;
        this.zzC = -1;
        this.zzD = -1;
        this.zzF = -1.0f;
        this.zzo = 1;
        this.zzH = 0;
        this.zzG = null;
    }

    private static List<zzfo> zzaA(zzfs zzfsVar, zzafv zzafvVar, boolean z, boolean z2) throws zzfy {
        Pair<Integer, Integer> zzf;
        String str = zzafvVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        List<zzfo> zzd2 = zzge.zzd(zzge.zzc(str, z, z2), zzafvVar);
        if ("video/dolby-vision".equals(str) && (zzf = zzge.zzf(zzafvVar)) != null) {
            int intValue = ((Integer) zzf.first).intValue();
            if (intValue == 16 || intValue == 256) {
                zzd2.addAll(zzge.zzc("video/hevc", z, z2));
            } else if (intValue == 512) {
                zzd2.addAll(zzge.zzc("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(zzd2);
    }

    private final boolean zzaB(zzfo zzfoVar) {
        return zzamq.zza >= 23 && !zzab(zzfoVar.zza) && (!zzfoVar.zzf || zzlu.zza(this.zze));
    }

    private final void zzaC() {
        int i2 = this.zzC;
        if (i2 == -1) {
            if (this.zzD == -1) {
                return;
            }
            i2 = -1;
        }
        zzy zzyVar = this.zzG;
        if (zzyVar != null && zzyVar.zzb == i2 && zzyVar.zzc == this.zzD && zzyVar.zzd == this.zzE && zzyVar.zze == this.zzF) {
            return;
        }
        zzy zzyVar2 = new zzy(i2, this.zzD, this.zzE, this.zzF);
        this.zzG = zzyVar2;
        this.zzg.zzf(zzyVar2);
    }

    private final void zzaD() {
        zzy zzyVar = this.zzG;
        if (zzyVar != null) {
            this.zzg.zzf(zzyVar);
        }
    }

    private static boolean zzaE(long j2) {
        return j2 < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaF(zzfo zzfoVar, zzafv zzafvVar) {
        char c2;
        int i2;
        int intValue;
        int i3 = zzafvVar.zzq;
        int i4 = zzafvVar.zzr;
        if (i3 == -1 || i4 == -1) {
            return -1;
        }
        String str = zzafvVar.zzl;
        int i5 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> zzf = zzge.zzf(zzafvVar);
            str = (zzf == null || !((intValue = ((Integer) zzf.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 == 2) {
                String str2 = zzamq.zzd;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(zzamq.zzc) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && zzfoVar.zzf)))) {
                    return -1;
                }
                i2 = zzamq.zzw(i4, 16) * zzamq.zzw(i3, 16) * 256;
            } else if (c2 != 3) {
                if (c2 != 4 && c2 != 5) {
                    return -1;
                }
                i2 = i3 * i4;
                i5 = 4;
            }
            return (i2 * 3) / (i5 + i5);
        }
        i2 = i3 * i4;
        return (i2 * 3) / (i5 + i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x074d, code lost:
        if (r7 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zzab(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlz.zzab(java.lang.String):boolean");
    }

    public static int zzy(zzfo zzfoVar, zzafv zzafvVar) {
        if (zzafvVar.zzm != -1) {
            int size = zzafvVar.zzn.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzafvVar.zzn.get(i3).length;
            }
            return zzafvVar.zzm + i2;
        }
        return zzaF(zzfoVar, zzafvVar);
    }

    public final void zzA(zzgh zzghVar, int i2, long j2) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzh(i2, true);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzfq) this).zza.zze++;
        this.zzw = 0;
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzB(zzaf zzafVar) throws zzaeg {
        this.zzx++;
        int i2 = zzamq.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzC() {
        this.zzp = false;
        int i2 = zzamq.zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i2, Object obj) throws zzaeg {
        if (i2 != 1) {
            if (i2 == 7) {
                this.zzI = (zzma) obj;
                return;
            } else if (i2 == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            } else if (i2 != 4) {
                if (i2 != 5) {
                    return;
                }
                this.zzf.zza(((Integer) obj).intValue());
                return;
            } else {
                this.zzo = ((Integer) obj).intValue();
                zzgh zzZ = zzZ();
                if (zzZ != null) {
                    zzZ.zzn(this.zzo);
                    return;
                }
                return;
            }
        }
        zzlu zzluVar = obj instanceof Surface ? (Surface) obj : null;
        if (zzluVar == null) {
            zzlu zzluVar2 = this.zzm;
            if (zzluVar2 != null) {
                zzluVar = zzluVar2;
            } else {
                zzfo zzK = zzK();
                if (zzK != null && zzaB(zzK)) {
                    zzluVar = zzlu.zzb(this.zze, zzK.zzf);
                    this.zzm = zzluVar;
                }
            }
        }
        if (this.zzl == zzluVar) {
            if (zzluVar == null || zzluVar == this.zzm) {
                return;
            }
            zzaD();
            if (this.zzn) {
                this.zzg.zzg(this.zzl);
                return;
            }
            return;
        }
        this.zzl = zzluVar;
        this.zzf.zzd(zzluVar);
        this.zzn = false;
        int zzaf = zzaf();
        zzgh zzZ2 = zzZ();
        if (zzZ2 != null) {
            if (zzamq.zza < 23 || zzluVar == null || this.zzj) {
                zzN();
                zzI();
            } else {
                zzZ2.zzl(zzluVar);
            }
        }
        if (zzluVar == null || zzluVar == this.zzm) {
            this.zzG = null;
            this.zzp = false;
            int i3 = zzamq.zza;
            return;
        }
        zzaD();
        this.zzp = false;
        int i4 = zzamq.zza;
        if (zzaf == 2) {
            this.zzt = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final boolean zzF(long j2, long j3, zzgh zzghVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg {
        boolean z3;
        int zzay;
        Objects.requireNonNull(zzghVar);
        if (this.zzs == -9223372036854775807L) {
            this.zzs = j2;
        }
        if (j4 != this.zzy) {
            this.zzf.zzh(j4);
            this.zzy = j4;
        }
        long zzX = zzX();
        long j5 = j4 - zzX;
        if (z && !z2) {
            zzz(zzghVar, i2, j5);
            return true;
        }
        float zzW = zzW();
        int zzaf = zzaf();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d2 = j4 - j2;
        double d3 = zzW;
        Double.isNaN(d2);
        Double.isNaN(d3);
        long j6 = (long) (d2 / d3);
        if (zzaf == 2) {
            j6 -= elapsedRealtime - j3;
        }
        if (this.zzl == this.zzm) {
            if (zzaE(j6)) {
                zzz(zzghVar, i2, j5);
                zzb(j6);
                return true;
            }
            return false;
        }
        long j7 = elapsedRealtime - this.zzz;
        boolean z4 = this.zzr ? !this.zzp : zzaf == 2 || this.zzq;
        if (this.zzt == -9223372036854775807L && j2 >= zzX && (z4 || (zzaf == 2 && zzaE(j6) && j7 > 100000))) {
            long nanoTime = System.nanoTime();
            if (zzamq.zza >= 21) {
                zzaa(zzghVar, i2, j5, nanoTime);
            } else {
                zzA(zzghVar, i2, j5);
            }
            zzb(j6);
            return true;
        } else if (zzaf != 2 || j2 == this.zzs) {
            return false;
        } else {
            long nanoTime2 = System.nanoTime();
            long zzk = this.zzf.zzk((j6 * 1000) + nanoTime2);
            long j8 = (zzk - nanoTime2) / 1000;
            long j9 = this.zzt;
            if (j8 < -500000 && !z2 && (zzay = zzay(j2)) != 0) {
                zzaz zzazVar = ((zzfq) this).zza;
                zzazVar.zzi++;
                int i5 = this.zzx + zzay;
                if (j9 != -9223372036854775807L) {
                    zzazVar.zzf += i5;
                } else {
                    zza(i5);
                }
                zzP();
                return false;
            } else if (zzaE(j8) && !z2) {
                if (j9 != -9223372036854775807L) {
                    zzz(zzghVar, i2, j5);
                    z3 = true;
                } else {
                    zzamo.zza("dropVideoBuffer");
                    zzghVar.zzh(i2, false);
                    zzamo.zzb();
                    z3 = true;
                    zza(1);
                }
                zzb(j8);
                return z3;
            } else if (zzamq.zza >= 21) {
                if (j8 < 50000) {
                    zzaa(zzghVar, i2, j5, zzk);
                    zzb(j8);
                    return true;
                }
                return false;
            } else if (j8 < 30000) {
                if (j8 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j8) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                zzA(zzghVar, i2, j5);
                zzb(j8);
                return true;
            } else {
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final boolean zzJ(zzfo zzfoVar) {
        return this.zzl != null || zzaB(zzfoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final void zzM(float f2, float f3) throws zzaeg {
        super.zzM(f2, f3);
        this.zzf.zzf(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzR() {
        super.zzR();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzlx(th, zzfoVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    @TargetApi(29)
    public final void zzU(zzaf zzafVar) throws zzaeg {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzafVar.zze;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzgh zzZ = zzZ();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    zzZ.zzm(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzV(long j2) {
        super.zzV(j2);
        this.zzx--;
    }

    public final void zza(int i2) {
        zzaz zzazVar = ((zzfq) this).zza;
        zzazVar.zzg += i2;
        this.zzv += i2;
        int i3 = this.zzw + i2;
        this.zzw = i3;
        zzazVar.zzh = Math.max(i3, zzazVar.zzh);
    }

    public final void zzaa(zzgh zzghVar, int i2, long j2, long j3) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzi(i2, j3);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        ((zzfq) this).zza.zze++;
        this.zzw = 0;
        zzp();
    }

    public final void zzb(long j2) {
        zzaz zzazVar = ((zzfq) this).zza;
        zzazVar.zzj += j2;
        zzazVar.zzk++;
        this.zzA += j2;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        int i2 = 0;
        if (zzalt.zzb(zzafvVar.zzl)) {
            boolean z = zzafvVar.zzo != null;
            List<zzfo> zzaA = zzaA(zzfsVar, zzafvVar, z, false);
            if (z && zzaA.isEmpty()) {
                zzaA = zzaA(zzfsVar, zzafvVar, false, false);
            }
            if (zzaA.isEmpty()) {
                return 1;
            }
            if (zzfq.zzY(zzafvVar)) {
                zzfo zzfoVar = zzaA.get(0);
                boolean zzc2 = zzfoVar.zzc(zzafvVar);
                int i3 = true != zzfoVar.zzd(zzafvVar) ? 8 : 16;
                if (zzc2) {
                    List<zzfo> zzaA2 = zzaA(zzfsVar, zzafvVar, z, true);
                    if (!zzaA2.isEmpty()) {
                        zzfo zzfoVar2 = zzaA2.get(0);
                        if (zzfoVar2.zzc(zzafvVar) && zzfoVar2.zzd(zzafvVar)) {
                            i2 = 32;
                        }
                    }
                }
                return (true != zzc2 ? 3 : 4) | i3 | i2;
            }
            return 2;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
        return zzaA(zzfsVar, zzafvVar, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    @TargetApi(17)
    public final zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f2) {
        String str;
        zzly zzlyVar;
        String str2;
        String str3;
        Point point;
        Pair<Integer, Integer> zzf;
        int zzaF;
        zzlu zzluVar = this.zzm;
        if (zzluVar != null && zzluVar.zza != zzfoVar.zzf) {
            zzluVar.release();
            this.zzm = null;
        }
        String str4 = zzfoVar.zzc;
        zzafv[] zzau = zzau();
        int i2 = zzafvVar.zzq;
        int i3 = zzafvVar.zzr;
        int zzy = zzy(zzfoVar, zzafvVar);
        int length = zzau.length;
        if (length == 1) {
            if (zzy != -1 && (zzaF = zzaF(zzfoVar, zzafvVar)) != -1) {
                zzy = Math.min((int) (zzy * 1.5f), zzaF);
            }
            zzlyVar = new zzly(i2, i3, zzy);
            str = str4;
        } else {
            boolean z = false;
            for (int i4 = 0; i4 < length; i4++) {
                zzafv zzafvVar2 = zzau[i4];
                if (zzafvVar.zzx != null && zzafvVar2.zzx == null) {
                    zzaft zza = zzafvVar2.zza();
                    zza.zzZ(zzafvVar.zzx);
                    zzafvVar2 = zza.zzah();
                }
                if (zzfoVar.zze(zzafvVar, zzafvVar2).zzd != 0) {
                    int i5 = zzafvVar2.zzq;
                    z |= i5 == -1 || zzafvVar2.zzr == -1;
                    i2 = Math.max(i2, i5);
                    i3 = Math.max(i3, zzafvVar2.zzr);
                    zzy = Math.max(zzy, zzy(zzfoVar, zzafvVar2));
                }
            }
            if (z) {
                String str5 = "x";
                String str6 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", a.S(66, "Resolutions unknown. Codec max resolution: ", i2, "x", i3));
                int i6 = zzafvVar.zzr;
                int i7 = zzafvVar.zzq;
                int i8 = i6 > i7 ? i6 : i7;
                int i9 = i6 <= i7 ? i6 : i7;
                float f3 = i9 / i8;
                int[] iArr = zzb;
                str = str4;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f3);
                    if (i11 <= i8 || i12 <= i9) {
                        break;
                    }
                    int i13 = i8;
                    int i14 = i9;
                    if (zzamq.zza >= 21) {
                        int i15 = i6 <= i7 ? i11 : i12;
                        if (i6 <= i7) {
                            i11 = i12;
                        }
                        point = zzfoVar.zzg(i15, i11);
                        str2 = str6;
                        str3 = str5;
                        if (zzfoVar.zzf(point.x, point.y, zzafvVar.zzs)) {
                            break;
                        }
                        i10++;
                        iArr = iArr2;
                        i8 = i13;
                        i9 = i14;
                        str5 = str3;
                        str6 = str2;
                    } else {
                        str2 = str6;
                        str3 = str5;
                        try {
                            int zzw = zzamq.zzw(i11, 16) * 16;
                            int zzw2 = zzamq.zzw(i12, 16) * 16;
                            if (zzw * zzw2 <= zzge.zze()) {
                                int i16 = i6 <= i7 ? zzw : zzw2;
                                if (i6 <= i7) {
                                    zzw = zzw2;
                                }
                                point = new Point(i16, zzw);
                            } else {
                                i10++;
                                iArr = iArr2;
                                i8 = i13;
                                i9 = i14;
                                str5 = str3;
                                str6 = str2;
                            }
                        } catch (zzfy unused) {
                        }
                    }
                }
                str2 = str6;
                str3 = str5;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    zzaft zza2 = zzafvVar.zza();
                    zza2.zzS(i2);
                    zza2.zzT(i3);
                    zzy = Math.max(zzy, zzaF(zzfoVar, zza2.zzah()));
                    Log.w(str2, a.S(57, "Codec max resolution adjusted to: ", i2, str3, i3));
                }
            } else {
                str = str4;
            }
            zzlyVar = new zzly(i2, i3, zzy);
        }
        this.zzi = zzlyVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzafvVar.zzq);
        mediaFormat.setInteger("height", zzafvVar.zzr);
        zzalq.zza(mediaFormat, zzafvVar.zzn);
        float f4 = zzafvVar.zzs;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        zzalq.zzb(mediaFormat, "rotation-degrees", zzafvVar.zzt);
        zzj zzjVar = zzafvVar.zzx;
        if (zzjVar != null) {
            zzalq.zzb(mediaFormat, "color-transfer", zzjVar.zzc);
            zzalq.zzb(mediaFormat, "color-standard", zzjVar.zza);
            zzalq.zzb(mediaFormat, "color-range", zzjVar.zzb);
            byte[] bArr = zzjVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(zzafvVar.zzl) && (zzf = zzge.zzf(zzafvVar)) != null) {
            zzalq.zzb(mediaFormat, Scopes.PROFILE, ((Integer) zzf.first).intValue());
        }
        mediaFormat.setInteger("max-width", zzlyVar.zza);
        mediaFormat.setInteger("max-height", zzlyVar.zzb);
        zzalq.zzb(mediaFormat, "max-input-size", zzlyVar.zzc);
        if (zzamq.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (!zzaB(zzfoVar)) {
                throw new IllegalStateException();
            }
            if (this.zzm == null) {
                this.zzm = zzlu.zzb(this.zze, zzfoVar.zzf);
            }
            this.zzl = this.zzm;
        }
        return zzfl.zzb(zzfoVar, mediaFormat, zzafvVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i2;
        int i3;
        zzba zze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i4 = zze.zze;
        int i5 = zzafvVar2.zzq;
        zzly zzlyVar = this.zzi;
        if (i5 > zzlyVar.zza || zzafvVar2.zzr > zzlyVar.zzb) {
            i4 |= 256;
        }
        if (zzy(zzfoVar, zzafvVar2) > this.zzi.zzc) {
            i4 |= 64;
        }
        String str = zzfoVar.zza;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = zze.zzd;
            i3 = 0;
        }
        return new zzba(str, zzafvVar, zzafvVar2, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final float zzj(float f2, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        float f3 = -1.0f;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            float f4 = zzafvVar2.zzs;
            if (f4 != -1.0f) {
                f3 = Math.max(f3, f4);
            }
        }
        if (f3 == -1.0f) {
            return -1.0f;
        }
        return f3 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzk(String str, long j2, long j3) {
        this.zzg.zzb(str, j2, j3);
        this.zzj = zzab(str);
        zzfo zzK = zzK();
        Objects.requireNonNull(zzK);
        boolean z = false;
        if (zzamq.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzK.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] zzb2 = zzK.zzb();
            int length = zzb2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (zzb2[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzl(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzn = super.zzn(zzafwVar);
        this.zzg.zzc(zzafwVar.zza, zzn);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) {
        zzgh zzZ = zzZ();
        if (zzZ != null) {
            zzZ.zzn(this.zzo);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzC = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzD = integer;
        float f2 = zzafvVar.zzu;
        this.zzF = f2;
        if (zzamq.zza >= 21) {
            int i2 = zzafvVar.zzt;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.zzC;
                this.zzC = integer;
                this.zzD = i3;
                this.zzF = 1.0f / f2;
            }
        } else {
            this.zzE = zzafvVar.zzt;
        }
        this.zzf.zzg(zzafvVar.zzs);
    }

    public final void zzp() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzg(this.zzl);
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        zzav();
        this.zzg.zza(((zzfq) this).zza);
        this.zzf.zzb();
        this.zzq = z2;
        this.zzr = false;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzr(long j2, boolean z) throws zzaeg {
        super.zzr(j2, z);
        this.zzp = false;
        int i2 = zzamq.zza;
        this.zzf.zze();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzs() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzt() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i2 = this.zzB;
        if (i2 != 0) {
            this.zzg.zze(this.zzA, i2);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzu() {
        this.zzG = null;
        this.zzp = false;
        int i2 = zzamq.zza;
        this.zzn = false;
        this.zzf.zzj();
        try {
            super.zzu();
        } finally {
            this.zzg.zzi(((zzfq) this).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    @TargetApi(17)
    public final void zzv() {
        try {
            super.zzv();
        } finally {
            zzlu zzluVar = this.zzm;
            if (zzluVar != null) {
                if (this.zzl == zzluVar) {
                    this.zzl = null;
                }
                zzluVar.release();
                this.zzm = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzx() {
        zzlu zzluVar;
        if (super.zzx() && (this.zzp || (((zzluVar = this.zzm) != null && this.zzl == zzluVar) || zzZ() == null))) {
            this.zzt = -9223372036854775807L;
            return true;
        } else if (this.zzt == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
    }

    public final void zzz(zzgh zzghVar, int i2, long j2) {
        zzamo.zza("skipVideoBuffer");
        zzghVar.zzh(i2, false);
        zzamo.zzb();
        ((zzfq) this).zza.zzf++;
    }
}
