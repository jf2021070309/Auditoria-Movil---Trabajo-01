package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzev implements zzde {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdc zze = zzdc.zza;
    private zzdc zzf = zzdc.zza;
    private zzdc zzg = zzdc.zza;
    private zzdc zzh = zzdc.zza;
    private boolean zzi;
    private zzeu zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzev() {
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzdcVar.zzb;
            }
            this.zze = zzdcVar;
            zzdc zzdcVar2 = new zzdc(i, zzdcVar.zzc, 2);
            this.zzf = zzdcVar2;
            this.zzi = true;
            return zzdcVar2;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzb() {
        if (this.zzf.zzb != -1) {
            if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
                return true;
            }
            return this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzeu zzeuVar = this.zzj;
            if (zzeuVar != null) {
                ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                int remaining = byteBuffer.remaining();
                this.zzn += remaining;
                zzeuVar.zzb(asShortBuffer);
                byteBuffer.position(byteBuffer.position() + remaining);
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzd() {
        zzeu zzeuVar = this.zzj;
        if (zzeuVar != null) {
            zzeuVar.zzd();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zze() {
        int zzf;
        zzeu zzeuVar = this.zzj;
        if (zzeuVar != null && (zzf = zzeuVar.zzf()) > 0) {
            if (this.zzk.capacity() < zzf) {
                ByteBuffer order = ByteBuffer.allocateDirect(zzf).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzeuVar.zzc(this.zzl);
            this.zzo += zzf;
            this.zzk.limit(zzf);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzf() {
        zzeu zzeuVar;
        return this.zzp && ((zzeuVar = this.zzj) == null || zzeuVar.zzf() == 0);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzg() {
        if (zzb()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                zzdc zzdcVar = this.zzg;
                this.zzj = new zzeu(zzdcVar.zzb, zzdcVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzeu zzeuVar = this.zzj;
                if (zzeuVar != null) {
                    zzeuVar.zze();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzh() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzdc.zza;
        this.zzf = zzdc.zza;
        this.zzg = zzdc.zza;
        this.zzh = zzdc.zza;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzi(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final long zzk(long j) {
        if (this.zzo >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            long j2 = this.zzn;
            zzeu zzeuVar = this.zzj;
            if (zzeuVar != null) {
                long zza = j2 - zzeuVar.zza();
                int i = this.zzh.zzb;
                int i2 = this.zzg.zzb;
                if (i == i2) {
                    return zzamq.zzH(j, zza, this.zzo);
                }
                return zzamq.zzH(j, zza * i, this.zzo * i2);
            }
            throw null;
        }
        return (long) (this.zzc * j);
    }
}
