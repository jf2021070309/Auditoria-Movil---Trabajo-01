package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzer extends zzfq implements zzalp {
    private final Context zzb;
    private final zzdp zzc;
    private final zzdw zzd;
    private int zze;
    private boolean zzf;
    private zzafv zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzahu zzl;

    public zzer(Context context, zzfm zzfmVar, zzfs zzfsVar, boolean z, Handler handler, zzdq zzdqVar, zzdw zzdwVar) {
        super(1, zzfmVar, zzfsVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zzdwVar;
        this.zzc = new zzdp(handler, zzdqVar);
        zzdwVar.zza(new zzep(this, null));
    }

    private final int zzaa(zzfo zzfoVar, zzafv zzafvVar) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(zzfoVar.zza) || (i2 = zzamq.zza) >= 24 || (i2 == 23 && zzamq.zzZ(this.zzb))) {
            return zzafvVar.zzm;
        }
        return -1;
    }

    private final void zzab() {
        long zzd = this.zzd.zzd(zzw());
        if (zzd != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzd = Math.max(this.zzh, zzd);
            }
            this.zzh = zzd;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final zzahf zzA() {
        return this.zzd.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzB(zzaf zzafVar) {
        if (!this.zzi || zzafVar.zzb()) {
            return;
        }
        if (Math.abs(zzafVar.zzd - this.zzh) > 500000) {
            this.zzh = zzafVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzC() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzD() throws zzaeg {
        try {
            this.zzd.zzi();
        } catch (zzdv e2) {
            throw zzaw(e2, e2.zzb, e2.zza, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i2, Object obj) throws zzaeg {
        if (i2 == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i2 == 3) {
            this.zzd.zzo((zzg) obj);
        } else if (i2 == 6) {
            this.zzd.zzq((zzh) obj);
        } else {
            switch (i2) {
                case 9:
                    this.zzd.zzn(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzp(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzahu) obj;
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final boolean zzF(long j2, long j3, zzgh zzghVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i3 & 2) != 0) {
            Objects.requireNonNull(zzghVar);
            zzghVar.zzh(i2, false);
            return true;
        } else if (z) {
            if (zzghVar != null) {
                zzghVar.zzh(i2, false);
            }
            ((zzfq) this).zza.zzf += i4;
            this.zzd.zzg();
            return true;
        } else {
            try {
                if (this.zzd.zzh(byteBuffer, j4, i4)) {
                    if (zzghVar != null) {
                        zzghVar.zzh(i2, false);
                    }
                    ((zzfq) this).zza.zze += i4;
                    return true;
                }
                return false;
            } catch (zzds e2) {
                throw zzaw(e2, e2.zzb, false, 5001);
            } catch (zzdv e3) {
                throw zzaw(e3, zzafvVar, e3.zza, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        if (zzalt.zza(zzafvVar.zzl)) {
            int i2 = zzamq.zza >= 21 ? 32 : 0;
            int i3 = zzafvVar.zzE;
            boolean zzY = zzfq.zzY(zzafvVar);
            if (zzY && this.zzd.zzb(zzafvVar) && (i3 == 0 || zzge.zza() != null)) {
                return i2 | 12;
            }
            if ((!"audio/raw".equals(zzafvVar.zzl) || this.zzd.zzb(zzafvVar)) && this.zzd.zzb(zzamq.zzN(2, zzafvVar.zzy, zzafvVar.zzz))) {
                List<zzfo> zze = zze(zzfsVar, zzafvVar, false);
                if (zze.isEmpty()) {
                    return 1;
                }
                if (zzY) {
                    zzfo zzfoVar = zze.get(0);
                    boolean zzc = zzfoVar.zzc(zzafvVar);
                    int i4 = 8;
                    if (zzc && zzfoVar.zzd(zzafvVar)) {
                        i4 = 16;
                    }
                    return (true != zzc ? 3 : 4) | i4 | i2;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
        zzfo zza;
        String str = zzafvVar.zzl;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.zzd.zzb(zzafvVar) || (zza = zzge.zza()) == null) {
            List<zzfo> zzd = zzge.zzd(zzge.zzc(str, false, false), zzafvVar);
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList = new ArrayList(zzd);
                arrayList.addAll(zzge.zzc("audio/eac3", false, false));
                zzd = arrayList;
            }
            return Collections.unmodifiableList(zzd);
        }
        return Collections.singletonList(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final boolean zzf(zzafv zzafvVar) {
        return this.zzd.zzb(zzafvVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzfq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzfl zzg(com.google.android.gms.internal.ads.zzfo r8, com.google.android.gms.internal.ads.zzafv r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzer.zzg(com.google.android.gms.internal.ads.zzfo, com.google.android.gms.internal.ads.zzafv, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzfl");
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i2;
        int i3;
        zzba zze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i4 = zze.zze;
        if (zzaa(zzfoVar, zzafvVar2) > this.zze) {
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

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final zzalp zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final float zzj(float f2, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        int i2 = -1;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            int i3 = zzafvVar2.zzz;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return i2 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzk(String str, long j2, long j3) {
        this.zzc.zzb(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzl(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzn = super.zzn(zzafwVar);
        this.zzc.zzc(zzafwVar.zza, zzn);
        return zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    public final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        int i2;
        zzafv zzafvVar2 = this.zzg;
        int[] iArr = null;
        if (zzafvVar2 != null) {
            zzafvVar = zzafvVar2;
        } else if (zzZ() != null) {
            int zzO = "audio/raw".equals(zzafvVar.zzl) ? zzafvVar.zzA : (zzamq.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? zzamq.zzO(mediaFormat.getInteger("v-bits-per-sample")) : "audio/raw".equals(zzafvVar.zzl) ? zzafvVar.zzA : 2 : mediaFormat.getInteger("pcm-encoding");
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN("audio/raw");
            zzaftVar.zzac(zzO);
            zzaftVar.zzad(zzafvVar.zzB);
            zzaftVar.zzae(zzafvVar.zzC);
            zzaftVar.zzaa(mediaFormat.getInteger("channel-count"));
            zzaftVar.zzab(mediaFormat.getInteger("sample-rate"));
            zzafv zzah = zzaftVar.zzah();
            if (this.zzf && zzah.zzy == 6 && (i2 = zzafvVar.zzy) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzafvVar.zzy; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzafvVar = zzah;
        }
        try {
            this.zzd.zze(zzafvVar, 0, iArr);
        } catch (zzdr e2) {
            throw zzaw(e2, e2.zza, false, 5001);
        }
    }

    public final void zzp() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        this.zzc.zza(((zzfq) this).zza);
        zzav();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzr(long j2, boolean z) throws zzaeg {
        super.zzr(j2, z);
        this.zzd.zzt();
        this.zzh = j2;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzs() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzt() {
        zzab();
        this.zzd.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzu() {
        this.zzk = true;
        try {
            this.zzd.zzt();
            try {
                super.zzu();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzu();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzu();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzu();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzw() {
        return super.zzw() && this.zzd.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzahv
    public final boolean zzx() {
        return this.zzd.zzk() || super.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final long zzy() {
        if (zzaf() == 2) {
            zzab();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzalp
    public final void zzz(zzahf zzahfVar) {
        this.zzd.zzl(zzahfVar);
    }
}
