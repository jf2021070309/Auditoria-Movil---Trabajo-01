package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
@TargetApi(16)
/* loaded from: classes.dex */
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
    public final int zzJ(zzark zzarkVar, zzanm zzanmVar) throws zzarm {
        int i2;
        int i3;
        String str = zzanmVar.zzf;
        if (zzauu.zza(str)) {
            int i4 = zzave.zza;
            int i5 = i4 >= 21 ? 16 : 0;
            zzarg zza = zzarr.zza(str, false);
            if (zza == null) {
                return 1;
            }
            int i6 = 2;
            if (i4 < 21 || (((i2 = zzanmVar.zzs) == -1 || zza.zzf(i2)) && ((i3 = zzanmVar.zzr) == -1 || zza.zzg(i3)))) {
                i6 = 3;
            }
            return i5 | 4 | i6;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final zzarg zzK(zzark zzarkVar, zzanm zzanmVar, boolean z) throws zzarm {
        return super.zzK(zzarkVar, zzanmVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzari
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzL(com.google.android.gms.internal.ads.zzarg r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzanm r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zza
            int r7 = com.google.android.gms.internal.ads.zzave.zza
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzave.zzc
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzave.zzb
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r3.zzd = r0
            android.media.MediaFormat r4 = r6.zzl()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaox.zzL(com.google.android.gms.internal.ads.zzarg, android.media.MediaCodec, com.google.android.gms.internal.ads.zzanm, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzM(String str, long j2, long j3) {
        this.zzb.zzc(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzN(zzanm zzanmVar) throws zzamy {
        super.zzN(zzanmVar);
        this.zzb.zzd(zzanmVar);
        this.zze = "audio/raw".equals(zzanmVar.zzf) ? zzanmVar.zzt : 2;
        this.zzf = zzanmVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzO(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzamy {
        int i2;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i3 = this.zzf;
            if (i3 < 6) {
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < this.zzf; i4++) {
                    iArr2[i4] = i4;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i2 = 6;
        } else {
            i2 = integer;
            iArr = null;
        }
        try {
            this.zzc.zzc("audio/raw", i2, integer2, this.zze, 0, iArr);
        } catch (zzaon e2) {
            throw zzamy.zza(e2, zzz());
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
    public final boolean zzS(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z) throws zzamy {
        if (z) {
            mediaCodec.releaseOutputBuffer(i2, false);
            ((zzari) this).zza.zze++;
            this.zzc.zze();
            return true;
        }
        try {
            if (this.zzc.zzf(byteBuffer, j4)) {
                mediaCodec.releaseOutputBuffer(i2, false);
                ((zzari) this).zza.zzd++;
                return true;
            }
            return false;
        } catch (zzaoo | zzaos e2) {
            throw zzamy.zza(e2, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final void zzT() throws zzamy {
        try {
            this.zzc.zzg();
        } catch (zzaos e2) {
            throw zzamy.zza(e2, zzz());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzanr
    public final zzaut zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzamw, com.google.android.gms.internal.ads.zzana
    public final void zzr(int i2, Object obj) throws zzamy {
        if (i2 != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzs(boolean z) throws zzamy {
        super.zzs(z);
        this.zzb.zzb(((zzari) this).zza);
        int i2 = zzy().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzu(long j2, boolean z) throws zzamy {
        super.zzu(j2, z);
        this.zzc.zzn();
        this.zzg = j2;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzv() {
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzamw
    public final void zzw() {
        this.zzc.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzari, com.google.android.gms.internal.ads.zzamw
    public final void zzx() {
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
}
