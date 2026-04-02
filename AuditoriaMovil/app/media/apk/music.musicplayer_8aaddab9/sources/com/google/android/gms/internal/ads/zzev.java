package com.google.android.gms.internal.ads;

import ch.qos.logback.core.util.FileSize;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzev implements zzde {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzdc zze;
    private zzdc zzf;
    private zzdc zzg;
    private zzdc zzh;
    private boolean zzi;
    private zzeu zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzev() {
        zzdc zzdcVar = zzdc.zza;
        this.zze = zzdcVar;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zzde.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final zzdc zza(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            int i2 = this.zzb;
            if (i2 == -1) {
                i2 = zzdcVar.zzb;
            }
            this.zze = zzdcVar;
            zzdc zzdcVar2 = new zzdc(i2, zzdcVar.zzc, 2);
            this.zzf = zzdcVar2;
            this.zzi = true;
            return zzdcVar2;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean zzb() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzeu zzeuVar = this.zzj;
            Objects.requireNonNull(zzeuVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzeuVar.zzb(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
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
        this.zzm = zzde.zza;
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
            zzdc zzdcVar = this.zze;
            this.zzg = zzdcVar;
            zzdc zzdcVar2 = this.zzf;
            this.zzh = zzdcVar2;
            if (this.zzi) {
                this.zzj = new zzeu(zzdcVar.zzb, zzdcVar.zzc, this.zzc, this.zzd, zzdcVar2.zzb);
            } else {
                zzeu zzeuVar = this.zzj;
                if (zzeuVar != null) {
                    zzeuVar.zze();
                }
            }
        }
        this.zzm = zzde.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzh() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzdc zzdcVar = zzdc.zza;
        this.zze = zzdcVar;
        this.zzf = zzdcVar;
        this.zzg = zzdcVar;
        this.zzh = zzdcVar;
        ByteBuffer byteBuffer = zzde.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    public final void zzi(float f2) {
        if (this.zzc != f2) {
            this.zzc = f2;
            this.zzi = true;
        }
    }

    public final void zzj(float f2) {
        if (this.zzd != f2) {
            this.zzd = f2;
            this.zzi = true;
        }
    }

    public final long zzk(long j2) {
        zzeu zzeuVar;
        if (this.zzo < FileSize.KB_COEFFICIENT) {
            double d2 = this.zzc;
            double d3 = j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            return (long) (d2 * d3);
        }
        long j3 = this.zzn;
        Objects.requireNonNull(this.zzj);
        long zza = j3 - zzeuVar.zza();
        int i2 = this.zzh.zzb;
        int i3 = this.zzg.zzb;
        return i2 == i3 ? zzamq.zzH(j2, zza, this.zzo) : zzamq.zzH(j2, zza * i2, this.zzo * i3);
    }
}
