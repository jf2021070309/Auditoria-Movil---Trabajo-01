package com.google.android.gms.internal.ads;

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
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    public zzlz(Context context, zzfm zzfmVar, zzfs zzfsVar, long j, boolean z, Handler handler, zzmu zzmuVar, int i) {
        super(2, zzfmVar, zzfsVar, false, 30.0f);
        this.zze = context.getApplicationContext();
        this.zzf = new zzmi(this.zze);
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
        int i = this.zzC;
        if (i == -1) {
            if (this.zzD == -1) {
                return;
            }
            i = -1;
        }
        zzy zzyVar = this.zzG;
        if (zzyVar != null && zzyVar.zzb == i && zzyVar.zzc == this.zzD && zzyVar.zzd == this.zzE && zzyVar.zze == this.zzF) {
            return;
        }
        zzy zzyVar2 = new zzy(i, this.zzD, this.zzE, this.zzF);
        this.zzG = zzyVar2;
        this.zzg.zzf(zzyVar2);
    }

    private final void zzaD() {
        zzy zzyVar = this.zzG;
        if (zzyVar != null) {
            this.zzg.zzf(zzyVar);
        }
    }

    private static boolean zzaE(long j) {
        return j < -30000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int zzaF(zzfo zzfoVar, zzafv zzafvVar) {
        boolean z;
        int i;
        int intValue;
        int i2 = zzafvVar.zzq;
        int i3 = zzafvVar.zzr;
        if (i2 == -1 || i3 == -1) {
            return -1;
        }
        String str = zzafvVar.zzl;
        int i4 = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> zzf = zzge.zzf(zzafvVar);
            str = (zzf == null || !((intValue = ((Integer) zzf.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (z && !z) {
            if (!z) {
                if (!z) {
                    if (!z && !z) {
                        return -1;
                    }
                    i = i2 * i3;
                    i4 = 4;
                }
            } else if ("BRAVIA 4K 2015".equals(zzamq.zzd) || ("Amazon".equals(zzamq.zzc) && ("KFSOWI".equals(zzamq.zzd) || ("AFTS".equals(zzamq.zzd) && zzfoVar.zzf)))) {
                return -1;
            } else {
                i = zzamq.zzw(i2, 16) * zzamq.zzw(i3, 16) * 256;
            }
            return (i * 3) / (i4 + i4);
        }
        i = i2 * i3;
        return (i * 3) / (i4 + i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0355, code lost:
        if (r1.equals("602LV") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x074e, code lost:
        if (r7 != 2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final boolean zzab(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 2778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlz.zzab(java.lang.String):boolean");
    }

    protected static int zzy(zzfo zzfoVar, zzafv zzafvVar) {
        if (zzafvVar.zzm != -1) {
            int size = zzafvVar.zzn.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzafvVar.zzn.get(i2).length;
            }
            return zzafvVar.zzm + i;
        }
        return zzaF(zzfoVar, zzafvVar);
    }

    protected final void zzA(zzgh zzghVar, int i, long j) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzh(i, true);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzB(zzaf zzafVar) throws zzaeg {
        this.zzx++;
        int i = zzamq.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzC() {
        this.zzp = false;
        int i = zzamq.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
        if (r16 > 100000) goto L88;
     */
    @Override // com.google.android.gms.internal.ads.zzfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean zzF(long r23, long r25, com.google.android.gms.internal.ads.zzgh r27, java.nio.ByteBuffer r28, int r29, int r30, int r31, long r32, boolean r34, boolean r35, com.google.android.gms.internal.ads.zzafv r36) throws com.google.android.gms.internal.ads.zzaeg {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlz.zzF(long, long, com.google.android.gms.internal.ads.zzgh, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.gms.internal.ads.zzafv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final boolean zzJ(zzfo zzfoVar) {
        return this.zzl != null || zzaB(zzfoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final void zzM(float f, float f2) throws zzaeg {
        super.zzM(f, f2);
        this.zzf.zzf(f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzR() {
        super.zzR();
        this.zzx = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfn zzT(Throwable th, zzfo zzfoVar) {
        return new zzlx(th, zzfoVar, this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzU(zzaf zzafVar) throws zzaeg {
        if (this.zzk) {
            ByteBuffer byteBuffer = zzafVar.zze;
            if (byteBuffer == null) {
                throw null;
            }
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzV(long j) {
        super.zzV(j);
        this.zzx--;
    }

    protected final void zza(int i) {
        zzaz zzazVar = this.zza;
        zzazVar.zzg += i;
        this.zzv += i;
        int i2 = this.zzw + i;
        this.zzw = i2;
        zzazVar.zzh = Math.max(i2, zzazVar.zzh);
    }

    protected final void zzaa(zzgh zzghVar, int i, long j, long j2) {
        zzaC();
        zzamo.zza("releaseOutputBuffer");
        zzghVar.zzi(i, j2);
        zzamo.zzb();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zza.zze++;
        this.zzw = 0;
        zzp();
    }

    protected final void zzb(long j) {
        zzaz zzazVar = this.zza;
        zzazVar.zzj += j;
        zzazVar.zzk++;
        this.zzA += j;
        this.zzB++;
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        int i = 0;
        if (zzalt.zzb(zzafvVar.zzl)) {
            boolean z = zzafvVar.zzo != null;
            List<zzfo> zzaA = zzaA(zzfsVar, zzafvVar, z, false);
            if (z && zzaA.isEmpty()) {
                zzaA = zzaA(zzfsVar, zzafvVar, false, false);
            }
            if (zzaA.isEmpty()) {
                return 1;
            }
            if (zzY(zzafvVar)) {
                zzfo zzfoVar = zzaA.get(0);
                boolean zzc2 = zzfoVar.zzc(zzafvVar);
                int i2 = true != zzfoVar.zzd(zzafvVar) ? 8 : 16;
                if (zzc2) {
                    List<zzfo> zzaA2 = zzaA(zzfsVar, zzafvVar, z, true);
                    if (!zzaA2.isEmpty()) {
                        zzfo zzfoVar2 = zzaA2.get(0);
                        if (zzfoVar2.zzc(zzafvVar) && zzfoVar2.zzd(zzafvVar)) {
                            i = 32;
                        }
                    }
                }
                return (true != zzc2 ? 3 : 4) | i2 | i;
            }
            return 2;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
        return zzaA(zzfsVar, zzafvVar, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f) {
        String str;
        zzly zzlyVar;
        int i;
        String str2;
        Point point;
        Pair<Integer, Integer> zzf;
        int zzaF;
        zzlu zzluVar = this.zzm;
        if (zzluVar != null && zzluVar.zza != zzfoVar.zzf) {
            zzluVar.release();
            this.zzm = null;
        }
        String str3 = zzfoVar.zzc;
        zzafv[] zzau = zzau();
        int i2 = zzafvVar.zzq;
        int i3 = zzafvVar.zzr;
        int zzy = zzy(zzfoVar, zzafvVar);
        int length = zzau.length;
        if (length != 1) {
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
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(i2);
                sb.append("x");
                sb.append(i3);
                String str4 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i6 = zzafvVar.zzr;
                int i7 = zzafvVar.zzq;
                int i8 = i6 > i7 ? i6 : i7;
                int i9 = i6 <= i7 ? i6 : i7;
                float f2 = i9 / i8;
                int[] iArr = zzb;
                str = str3;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f2);
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
                        i = zzy;
                        str2 = str4;
                        if (zzfoVar.zzf(point.x, point.y, zzafvVar.zzs)) {
                            break;
                        }
                        i10++;
                        iArr = iArr2;
                        i8 = i13;
                        i9 = i14;
                        zzy = i;
                        str4 = str2;
                    } else {
                        i = zzy;
                        str2 = str4;
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
                                zzy = i;
                                str4 = str2;
                            }
                        } catch (zzfy unused) {
                        }
                    }
                }
                i = zzy;
                str2 = str4;
                point = null;
                if (point != null) {
                    i2 = Math.max(i2, point.x);
                    i3 = Math.max(i3, point.y);
                    zzaft zza2 = zzafvVar.zza();
                    zza2.zzS(i2);
                    zza2.zzT(i3);
                    zzy = Math.max(i, zzaF(zzfoVar, zza2.zzah()));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(i2);
                    sb2.append("x");
                    sb2.append(i3);
                    Log.w(str2, sb2.toString());
                } else {
                    zzy = i;
                }
            } else {
                str = str3;
            }
            zzlyVar = new zzly(i2, i3, zzy);
        } else {
            if (zzy != -1 && (zzaF = zzaF(zzfoVar, zzafvVar)) != -1) {
                zzy = Math.min((int) (zzy * 1.5f), zzaF);
            }
            zzlyVar = new zzly(i2, i3, zzy);
            str = str3;
        }
        this.zzi = zzlyVar;
        boolean z2 = this.zzh;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzafvVar.zzq);
        mediaFormat.setInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzafvVar.zzr);
        zzalq.zza(mediaFormat, zzafvVar.zzn);
        float f3 = zzafvVar.zzs;
        if (f3 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f3);
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
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z2) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.zzl == null) {
            if (zzaB(zzfoVar)) {
                if (this.zzm == null) {
                    this.zzm = zzlu.zzb(this.zze, zzfoVar.zzf);
                }
                this.zzl = this.zzm;
            } else {
                throw new IllegalStateException();
            }
        }
        return zzfl.zzb(zzfoVar, mediaFormat, zzafvVar, this.zzl, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i;
        int i2;
        zzba zze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i3 = zze.zze;
        int i4 = zzafvVar2.zzq;
        zzly zzlyVar = this.zzi;
        if (i4 > zzlyVar.zza || zzafvVar2.zzr > zzlyVar.zzb) {
            i3 |= 256;
        }
        if (zzy(zzfoVar, zzafvVar2) > this.zzi.zzc) {
            i3 |= 64;
        }
        String str = zzfoVar.zza;
        if (i3 != 0) {
            i2 = 0;
            i = i3;
        } else {
            i = 0;
            i2 = zze.zzd;
        }
        return new zzba(str, zzafvVar, zzafvVar2, i2, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        float f2 = -1.0f;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            float f3 = zzafvVar2.zzs;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzk(String str, long j, long j2) {
        this.zzg.zzb(str, j, j2);
        this.zzj = zzab(str);
        zzfo zzK = zzK();
        if (zzK != null) {
            boolean z = false;
            if (zzamq.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzK.zzb)) {
                MediaCodecInfo.CodecProfileLevel[] zzb2 = zzK.zzb();
                int length = zzb2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (zzb2[i].profile == 16384) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            this.zzk = z;
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzl(String str) {
        this.zzg.zzh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzj(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzn = super.zzn(zzafwVar);
        this.zzg.zzc(zzafwVar.zza, zzn);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        zzgh zzZ = zzZ();
        if (zzZ != null) {
            zzZ.zzn(this.zzo);
        }
        if (mediaFormat != null) {
            boolean z = false;
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            }
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
            }
            this.zzC = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
            }
            this.zzD = integer2;
            this.zzF = zzafvVar.zzu;
            if (zzamq.zza >= 21) {
                int i = zzafvVar.zzt;
                if (i == 90 || i == 270) {
                    int i2 = this.zzC;
                    this.zzC = this.zzD;
                    this.zzD = i2;
                    this.zzF = 1.0f / this.zzF;
                }
            } else {
                this.zzE = zzafvVar.zzt;
            }
            this.zzf.zzg(zzafvVar.zzs);
            return;
        }
        throw null;
    }

    final void zzp() {
        this.zzr = true;
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        this.zzg.zzg(this.zzl);
        this.zzn = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        zzav();
        this.zzg.zza(this.zza);
        this.zzf.zzb();
        this.zzq = z2;
        this.zzr = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzr(long j, boolean z) throws zzaeg {
        super.zzr(j, z);
        this.zzp = false;
        int i = zzamq.zza;
        this.zzf.zze();
        this.zzy = -9223372036854775807L;
        this.zzs = -9223372036854775807L;
        this.zzw = 0;
        this.zzt = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzs() {
        this.zzv = 0;
        this.zzu = SystemClock.elapsedRealtime();
        this.zzz = SystemClock.elapsedRealtime() * 1000;
        this.zzA = 0L;
        this.zzB = 0;
        this.zzf.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzt() {
        this.zzt = -9223372036854775807L;
        if (this.zzv > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzg.zzd(this.zzv, elapsedRealtime - this.zzu);
            this.zzv = 0;
            this.zzu = elapsedRealtime;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zze(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        this.zzf.zzi();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzu() {
        this.zzG = null;
        this.zzp = false;
        int i = zzamq.zza;
        this.zzn = false;
        this.zzf.zzj();
        try {
            super.zzu();
        } finally {
            this.zzg.zzi(this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
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
        if (!super.zzx() || (!this.zzp && (((zzluVar = this.zzm) == null || this.zzl != zzluVar) && zzZ() != null))) {
            if (this.zzt == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < this.zzt) {
                return true;
            }
            this.zzt = -9223372036854775807L;
            return false;
        }
        this.zzt = -9223372036854775807L;
        return true;
    }

    protected final void zzz(zzgh zzghVar, int i, long j) {
        zzamo.zza("skipVideoBuffer");
        zzghVar.zzh(i, false);
        zzamo.zzb();
        this.zza.zzf++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.Surface] */
    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i, Object obj) throws zzaeg {
        if (i != 1) {
            if (i == 7) {
                this.zzI = (zzma) obj;
                return;
            } else if (i == 10) {
                int intValue = ((Integer) obj).intValue();
                if (this.zzH != intValue) {
                    this.zzH = intValue;
                    return;
                }
                return;
            } else if (i != 4) {
                if (i != 5) {
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
        if (this.zzl != zzluVar) {
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
                int i2 = zzamq.zza;
                return;
            }
            zzaD();
            this.zzp = false;
            int i3 = zzamq.zza;
            if (zzaf == 2) {
                this.zzt = -9223372036854775807L;
            }
        } else if (zzluVar == null || zzluVar == this.zzm) {
        } else {
            zzaD();
            if (this.zzn) {
                this.zzg.zzg(this.zzl);
            }
        }
    }
}
