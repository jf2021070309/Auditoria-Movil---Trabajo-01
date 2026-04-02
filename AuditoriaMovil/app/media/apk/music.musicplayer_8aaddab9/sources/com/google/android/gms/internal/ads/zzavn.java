package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
public final class zzavn extends zzari {
    private int zzA;
    private final Context zzb;
    private final zzavp zzc;
    private final zzavx zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzanm[] zzg;
    private zzavm zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzavn(Context context, zzark zzarkVar, long j2, Handler handler, zzavy zzavyVar, int i2) {
        super(2, zzarkVar, null, false);
        boolean z = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzavp(context);
        this.zzd = new zzavx(handler, zzavyVar);
        if (zzave.zza <= 22 && "foster".equals(zzave.zzb) && "NVIDIA".equals(zzave.zzc)) {
            z = true;
        }
        this.zze = z;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private final boolean zzR(boolean z) {
        return zzave.zza >= 23 && (!z || zzavk.zza(this.zzb));
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        int i2 = this.zzv;
        int i3 = this.zzr;
        if (i2 == i3 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzf(i3, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzad() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzf(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private final void zzae() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zze(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private static boolean zzaf(long j2) {
        return j2 < -30000;
    }

    private static int zzag(zzanm zzanmVar) {
        int i2 = zzanmVar.zzm;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzanr
    public final boolean zzE() {
        Surface surface;
        if (super.zzE() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzW() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        } else if (this.zzl == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzl) {
                return true;
            }
            this.zzl = -9223372036854775807L;
            return false;
        }
    }

    public final void zzH(MediaCodec mediaCodec, int i2, long j2) {
        zzavc.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i2, false);
        zzavc.zzb();
        ((zzari) this).zza.zze++;
    }

    public final void zzI(MediaCodec mediaCodec, int i2, long j2) {
        zzac();
        zzavc.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, true);
        zzavc.zzb();
        ((zzari) this).zza.zzd++;
        this.zzo = 0;
        zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final int zzJ(zzark zzarkVar, zzanm zzanmVar) throws zzarm {
        boolean z;
        int i2;
        int i3;
        String str = zzanmVar.zzf;
        if (zzauu.zzb(str)) {
            zzapk zzapkVar = zzanmVar.zzi;
            if (zzapkVar != null) {
                z = false;
                for (int i4 = 0; i4 < zzapkVar.zza; i4++) {
                    z |= zzapkVar.zza(i4).zzc;
                }
            } else {
                z = false;
            }
            zzarg zza = zzarr.zza(str, z);
            if (zza == null) {
                return 1;
            }
            boolean zzd = zza.zzd(zzanmVar.zzc);
            if (zzd && (i2 = zzanmVar.zzj) > 0 && (i3 = zzanmVar.zzk) > 0) {
                if (zzave.zza >= 21) {
                    zzd = zza.zze(i2, i3, zzanmVar.zzl);
                } else {
                    zzd = i2 * i3 <= zzarr.zzc();
                    if (!zzd) {
                        String.valueOf(zzave.zze).length();
                    }
                }
            }
            return (true != zzd ? 2 : 3) | (true != zza.zzb ? 4 : 8) | (true == zza.zzc ? 16 : 0);
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzL(zzarg zzargVar, MediaCodec mediaCodec, zzanm zzanmVar, MediaCrypto mediaCrypto) throws zzarm {
        char c2;
        int i2;
        zzanm[] zzanmVarArr = this.zzg;
        int i3 = zzanmVar.zzj;
        int i4 = zzanmVar.zzk;
        int i5 = zzanmVar.zzg;
        if (i5 == -1) {
            String str = zzanmVar.zzf;
            if (i3 != -1 && i4 != -1) {
                int i6 = 4;
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
                    if (c2 != 2) {
                        if (c2 != 3) {
                            if (c2 == 4 || c2 == 5) {
                                i2 = i3 * i4;
                                i5 = (i2 * 3) / (i6 + i6);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzave.zzd)) {
                        i2 = zzave.zze(i4, 16) * zzave.zze(i3, 16) * 256;
                        i6 = 2;
                        i5 = (i2 * 3) / (i6 + i6);
                    }
                }
                i2 = i3 * i4;
                i6 = 2;
                i5 = (i2 * 3) / (i6 + i6);
            }
            i5 = -1;
        }
        int length = zzanmVarArr.length;
        zzavm zzavmVar = new zzavm(i3, i4, i5);
        this.zzh = zzavmVar;
        boolean z = this.zze;
        MediaFormat zzl = zzanmVar.zzl();
        zzl.setInteger("max-width", zzavmVar.zza);
        zzl.setInteger("max-height", zzavmVar.zzb);
        int i7 = zzavmVar.zzc;
        if (i7 != -1) {
            zzl.setInteger("max-input-size", i7);
        }
        if (z) {
            zzl.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzaup.zzd(zzR(zzargVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzavk.zzb(this.zzb, zzargVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(zzl, this.zzi, (MediaCrypto) null, 0);
        int i8 = zzave.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzM(String str, long j2, long j3) {
        this.zzd.zzc(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzN(zzanm zzanmVar) throws zzamy {
        super.zzN(zzanmVar);
        this.zzd.zzd(zzanmVar);
        float f2 = zzanmVar.zzn;
        if (f2 == -1.0f) {
            f2 = 1.0f;
        }
        this.zzq = f2;
        this.zzp = zzag(zzanmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzO(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        this.zzr = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.zzs = integer;
        float f2 = this.zzq;
        this.zzu = f2;
        if (zzave.zza >= 21) {
            int i2 = this.zzp;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.zzr;
                this.zzr = integer;
                this.zzs = i3;
                this.zzu = 1.0f / f2;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void zzP(MediaCodec mediaCodec, int i2, long j2, long j3) {
        zzac();
        zzavc.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i2, j3);
        zzavc.zzb();
        ((zzari) this).zza.zzd++;
        this.zzo = 0;
        zzQ();
    }

    public final void zzQ() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final boolean zzS(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) {
        while (true) {
            int i4 = this.zzA;
            if (i4 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j5 = jArr[0];
            if (j4 < j5) {
                break;
            }
            this.zzz = j5;
            int i5 = i4 - 1;
            this.zzA = i5;
            System.arraycopy(jArr, 1, jArr, 0, i5);
        }
        long j6 = j4 - this.zzz;
        if (z) {
            zzH(mediaCodec, i2, j6);
            return true;
        }
        long j7 = j4 - j2;
        if (this.zzi == this.zzj) {
            if (zzaf(j7)) {
                zzH(mediaCodec, i2, j6);
                return true;
            }
            return false;
        } else if (!this.zzk) {
            if (zzave.zza >= 21) {
                zzP(mediaCodec, i2, j6, System.nanoTime());
            } else {
                zzI(mediaCodec, i2, j6);
            }
            return true;
        } else if (zze() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zzc = this.zzc.zzc(j4, ((j7 - ((elapsedRealtime * 1000) - j3)) * 1000) + nanoTime);
            long j8 = (zzc - nanoTime) / 1000;
            if (!zzaf(j8)) {
                if (zzave.zza >= 21) {
                    if (j8 < 50000) {
                        zzP(mediaCodec, i2, j6, zzc);
                        return true;
                    }
                } else if (j8 < 30000) {
                    if (j8 > 11000) {
                        try {
                            Thread.sleep((j8 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    zzI(mediaCodec, i2, j6);
                    return true;
                }
                return false;
            }
            zzavc.zza("dropVideoBuffer");
            mediaCodec.releaseOutputBuffer(i2, false);
            zzavc.zzb();
            zzapf zzapfVar = ((zzari) this).zza;
            zzapfVar.zzf++;
            this.zzn++;
            int i6 = this.zzo + 1;
            this.zzo = i6;
            zzapfVar.zzg = Math.max(i6, zzapfVar.zzg);
            if (this.zzn == -1) {
                zzae();
            }
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final boolean zzV(zzarg zzargVar) {
        return this.zzi != null || zzR(zzargVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzZ(zzapg zzapgVar) {
        int i2 = zzave.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final boolean zzaa(MediaCodec mediaCodec, boolean z, zzanm zzanmVar, zzanm zzanmVar2) {
        if (zzanmVar.zzf.equals(zzanmVar2.zzf) && zzag(zzanmVar) == zzag(zzanmVar2)) {
            if (z || (zzanmVar.zzj == zzanmVar2.zzj && zzanmVar.zzk == zzanmVar2.zzk)) {
                int i2 = zzanmVar2.zzj;
                zzavm zzavmVar = this.zzh;
                return i2 <= zzavmVar.zza && zzanmVar2.zzk <= zzavmVar.zzb && zzanmVar2.zzg <= zzavmVar.zzc;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzana
    public final void zzr(int i2, Object obj) throws zzamy {
        if (i2 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzarg zzX = zzX();
                    if (zzX != null && zzR(zzX.zzd)) {
                        surface = zzavk.zzb(this.zzb, zzX.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi == surface) {
                if (surface == null || surface == this.zzj) {
                    return;
                }
                zzad();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                    return;
                }
                return;
            }
            this.zzi = surface;
            int zze = zze();
            if (zze == 1 || zze == 2) {
                MediaCodec zzW = zzW();
                if (zzave.zza < 23 || zzW == null || surface == null) {
                    zzY();
                    zzU();
                } else {
                    zzW.setOutputSurface(surface);
                }
            }
            if (surface == null || surface == this.zzj) {
                zzab();
                this.zzk = false;
                int i3 = zzave.zza;
                return;
            }
            zzad();
            this.zzk = false;
            int i4 = zzave.zza;
            if (zze == 2) {
                this.zzl = -9223372036854775807L;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzs(boolean z) throws zzamy {
        super.zzs(z);
        int i2 = zzy().zzb;
        this.zzd.zzb(((zzari) this).zza);
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzt(zzanm[] zzanmVarArr, long j2) throws zzamy {
        this.zzg = zzanmVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j2;
            return;
        }
        int i2 = this.zzA;
        if (i2 == 10) {
            long j3 = this.zzf[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.w("MediaCodecVideoRenderer", sb.toString());
        } else {
            this.zzA = i2 + 1;
        }
        this.zzf[this.zzA - 1] = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzu(long j2, boolean z) throws zzamy {
        super.zzu(j2, z);
        this.zzk = false;
        int i2 = zzave.zza;
        this.zzo = 0;
        int i3 = this.zzA;
        if (i3 != 0) {
            this.zzz = this.zzf[i3 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzv() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzw() {
        zzae();
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzx() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i2 = zzave.zza;
        this.zzc.zzb();
        try {
            super.zzx();
        } finally {
            ((zzari) this).zza.zza();
            this.zzd.zzh(((zzari) this).zza);
        }
    }
}
