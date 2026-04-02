package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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
        if (!"OMX.google.raw.decoder".equals(zzfoVar.zza) || zzamq.zza >= 24 || (zzamq.zza == 23 && zzamq.zzZ(this.zzb))) {
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
    protected final void zzB(zzaf zzafVar) {
        if (!this.zzi || zzafVar.zzb()) {
            return;
        }
        if (Math.abs(zzafVar.zzd - this.zzh) > 500000) {
            this.zzh = zzafVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzC() {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahr
    public final void zzE(int i, Object obj) throws zzaeg {
        if (i == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i == 3) {
            this.zzd.zzo((zzg) obj);
        } else if (i != 6) {
            switch (i) {
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
        } else {
            this.zzd.zzq((zzh) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzahw
    public final String zzc() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final int zzd(zzfs zzfsVar, zzafv zzafvVar) throws zzfy {
        if (zzalt.zza(zzafvVar.zzl)) {
            int i = zzamq.zza >= 21 ? 32 : 0;
            int i2 = zzafvVar.zzE;
            boolean zzY = zzY(zzafvVar);
            if (zzY && this.zzd.zzb(zzafvVar) && (i2 == 0 || zzge.zza() != null)) {
                return i | 12;
            }
            if ((!"audio/raw".equals(zzafvVar.zzl) || this.zzd.zzb(zzafvVar)) && this.zzd.zzb(zzamq.zzN(2, zzafvVar.zzy, zzafvVar.zzz))) {
                List<zzfo> zze = zze(zzfsVar, zzafvVar, false);
                if (zze.isEmpty()) {
                    return 1;
                }
                if (zzY) {
                    zzfo zzfoVar = zze.get(0);
                    boolean zzc = zzfoVar.zzc(zzafvVar);
                    int i3 = 8;
                    if (zzc && zzfoVar.zzd(zzafvVar)) {
                        i3 = 16;
                    }
                    return (true != zzc ? 3 : 4) | i3 | i;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final List<zzfo> zze(zzfs zzfsVar, zzafv zzafvVar, boolean z) throws zzfy {
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
    protected final boolean zzf(zzafv zzafvVar) {
        return this.zzd.zzb(zzafvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzfl zzg(zzfo zzfoVar, zzafv zzafvVar, MediaCrypto mediaCrypto, float f) {
        zzafv[] zzau = zzau();
        int zzaa = zzaa(zzfoVar, zzafvVar);
        if (zzau.length != 1) {
            for (zzafv zzafvVar2 : zzau) {
                if (zzfoVar.zze(zzafvVar, zzafvVar2).zzd != 0) {
                    zzaa = Math.max(zzaa, zzaa(zzfoVar, zzafvVar2));
                }
            }
        }
        this.zze = zzaa;
        this.zzf = zzamq.zza < 24 && "OMX.SEC.aac.dec".equals(zzfoVar.zza) && "samsung".equals(zzamq.zzc) && (zzamq.zzb.startsWith("zeroflte") || zzamq.zzb.startsWith("herolte") || zzamq.zzb.startsWith("heroqlte"));
        String str = zzfoVar.zzc;
        int i = this.zze;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", zzafvVar.zzy);
        mediaFormat.setInteger("sample-rate", zzafvVar.zzz);
        zzalq.zza(mediaFormat, zzafvVar.zzn);
        zzalq.zzb(mediaFormat, "max-input-size", i);
        if (zzamq.zza >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (zzamq.zza != 23 || (!"ZTE B2017G".equals(zzamq.zzd) && !"AXON 7 mini".equals(zzamq.zzd)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (zzamq.zza <= 28 && "audio/ac4".equals(zzafvVar.zzl)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (zzamq.zza >= 24 && this.zzd.zzc(zzamq.zzN(4, zzafvVar.zzy, zzafvVar.zzz)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        this.zzg = (!"audio/raw".equals(zzfoVar.zzb) || "audio/raw".equals(zzafvVar.zzl)) ? null : zzafvVar;
        return zzfl.zza(zzfoVar, mediaFormat, zzafvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final zzba zzh(zzfo zzfoVar, zzafv zzafvVar, zzafv zzafvVar2) {
        int i;
        int i2;
        zzba zze = zzfoVar.zze(zzafvVar, zzafvVar2);
        int i3 = zze.zze;
        if (zzaa(zzfoVar, zzafvVar2) > this.zze) {
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

    @Override // com.google.android.gms.internal.ads.zzadv, com.google.android.gms.internal.ads.zzahv
    public final zzalp zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final float zzj(float f, zzafv zzafvVar, zzafv[] zzafvVarArr) {
        int i = -1;
        for (zzafv zzafvVar2 : zzafvVarArr) {
            int i2 = zzafvVar2.zzz;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzk(String str, long j, long j2) {
        this.zzc.zzb(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzl(String str) {
        this.zzc.zzf(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzm(Exception exc) {
        zzaln.zzb("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zzj(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq
    public final zzba zzn(zzafw zzafwVar) throws zzaeg {
        zzba zzn = super.zzn(zzafwVar);
        this.zzc.zzc(zzafwVar.zza, zzn);
        return zzn;
    }

    public final void zzp() {
        this.zzj = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzq(boolean z, boolean z2) throws zzaeg {
        super.zzq(z, z2);
        this.zzc.zza(this.zza);
        zzav();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzadv
    public final void zzr(long j, boolean z) throws zzaeg {
        super.zzr(j, z);
        this.zzd.zzt();
        this.zzh = j;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzs() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    protected final void zzt() {
        zzab();
        this.zzd.zzs();
    }

    /* JADX INFO: Access modifiers changed from: protected */
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

    /* JADX INFO: Access modifiers changed from: protected */
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

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzD() throws zzaeg {
        try {
            this.zzd.zzi();
        } catch (zzdv e) {
            throw zzaw(e, e.zzb, e.zza, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final boolean zzF(long j, long j2, zzgh zzghVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzafv zzafvVar) throws zzaeg {
        if (byteBuffer != null) {
            if (this.zzg != null && (i2 & 2) != 0) {
                if (zzghVar != null) {
                    zzghVar.zzh(i, false);
                    return true;
                }
                throw null;
            } else if (z) {
                if (zzghVar != null) {
                    zzghVar.zzh(i, false);
                }
                this.zza.zzf += i3;
                this.zzd.zzg();
                return true;
            } else {
                try {
                    if (this.zzd.zzh(byteBuffer, j3, i3)) {
                        if (zzghVar != null) {
                            zzghVar.zzh(i, false);
                        }
                        this.zza.zze += i3;
                        return true;
                    }
                    return false;
                } catch (zzds e) {
                    throw zzaw(e, e.zzb, false, IronSourceConstants.errorCode_biddingDataException);
                } catch (zzdv e2) {
                    throw zzaw(e2, zzafvVar, e2.zza, IronSourceConstants.errorCode_isReadyException);
                }
            }
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfq
    protected final void zzo(zzafv zzafvVar, MediaFormat mediaFormat) throws zzaeg {
        int i;
        int i2;
        zzafv zzafvVar2 = this.zzg;
        int[] iArr = null;
        if (zzafvVar2 != null) {
            zzafvVar = zzafvVar2;
        } else if (zzZ() != null) {
            if ("audio/raw".equals(zzafvVar.zzl)) {
                i = zzafvVar.zzA;
            } else if (zzamq.zza < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = zzamq.zzO(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = "audio/raw".equals(zzafvVar.zzl) ? zzafvVar.zzA : 2;
                }
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            zzaft zzaftVar = new zzaft();
            zzaftVar.zzN("audio/raw");
            zzaftVar.zzac(i);
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
        } catch (zzdr e) {
            throw zzaw(e, e.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }
}
