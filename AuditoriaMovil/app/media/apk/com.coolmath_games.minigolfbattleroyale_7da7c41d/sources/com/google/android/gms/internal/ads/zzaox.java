package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaox extends zzari implements zzaut {
    private final zzaoi zzb;
    private final zzaot zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzaox(zzark zzarkVar, zzapl zzaplVar, boolean z, Handler handler, zzaoj zzaojVar) {
        super(1, zzarkVar, null, true);
        this.zzc = new zzaot(null, new zzaob[0], new zzaov(this, null));
        this.zzb = new zzaoi(handler, zzaojVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzI(zzaox zzaoxVar, boolean z) {
        zzaoxVar.zzh = true;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzanr
    public final boolean zzE() {
        return this.zzc.zzi() || super.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzanr
    public final boolean zzF() {
        return super.zzF() && this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final int zzJ(zzark zzarkVar, zzanm zzanmVar) throws zzarm {
        int i;
        int i2;
        String str = zzanmVar.zzf;
        if (zzauu.zza(str)) {
            int i3 = zzave.zza >= 21 ? 16 : 0;
            zzarg zza = zzarr.zza(str, false);
            if (zza == null) {
                return 1;
            }
            int i4 = 2;
            if (zzave.zza < 21 || (((i = zzanmVar.zzs) == -1 || zza.zzf(i)) && ((i2 = zzanmVar.zzr) == -1 || zza.zzg(i2)))) {
                i4 = 3;
            }
            return i3 | 4 | i4;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final zzarg zzK(zzark zzarkVar, zzanm zzanmVar, boolean z) throws zzarm {
        return super.zzK(zzarkVar, zzanmVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzL(zzarg zzargVar, MediaCodec mediaCodec, zzanm zzanmVar, MediaCrypto mediaCrypto) {
        String str = zzargVar.zza;
        boolean z = true;
        if (zzave.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzave.zzc) || (!zzave.zzb.startsWith("zeroflte") && !zzave.zzb.startsWith("herolte") && !zzave.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzanmVar.zzl(), (Surface) null, (MediaCrypto) null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzM(String str, long j, long j2) {
        this.zzb.zzc(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzN(zzanm zzanmVar) throws zzamy {
        super.zzN(zzanmVar);
        this.zzb.zzd(zzanmVar);
        this.zze = "audio/raw".equals(zzanmVar.zzf) ? zzanmVar.zzt : 2;
        this.zzf = zzanmVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzO(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzamy {
        int i;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        } else {
            i = integer;
            iArr = null;
        }
        try {
            this.zzc.zzc("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzaon e) {
            throw zzamy.zza(e, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final long zzP() {
        long zzb = this.zzc.zzb(zzF());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzh) {
                zzb = Math.max(this.zzg, zzb);
            }
            this.zzg = zzb;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final zzanq zzQ(zzanq zzanqVar) {
        return this.zzc.zzj(zzanqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaut
    public final zzanq zzR() {
        return this.zzc.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final boolean zzS(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzamy {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zze();
            return true;
        }
        try {
            if (this.zzc.zzf(byteBuffer, j3)) {
                mediaCodec.releaseOutputBuffer(i, false);
                this.zza.zzd++;
                return true;
            }
            return false;
        } catch (zzaoo | zzaos e) {
            throw zzamy.zza(e, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzanr
    public final zzaut zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzana
    public final void zzr(int i, Object obj) throws zzamy {
        if (i != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzs(boolean z) throws zzamy {
        super.zzs(z);
        this.zzb.zzb(this.zza);
        int i = zzy().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzu(long j, boolean z) throws zzamy {
        super.zzu(j, z);
        this.zzc.zzn();
        this.zzg = j;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected final void zzv() {
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    protected final void zzw() {
        this.zzc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    protected final void zzx() {
        try {
            this.zzc.zzo();
            try {
                super.zzx();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzx();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    protected final void zzT() throws zzamy {
        try {
            this.zzc.zzg();
        } catch (zzaos e) {
            throw zzamy.zza(e, zzz());
        }
    }
}
