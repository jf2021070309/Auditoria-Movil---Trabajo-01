package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzew extends zzeb {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzamq.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.zzi + i3) - this.zzh.length;
        ByteBuffer zzi = zzi(length);
        int zzx = zzamq.zzx(length, 0, this.zzi);
        zzi.put(this.zzh, 0, zzx);
        int zzx2 = zzamq.zzx(length - zzx, 0, i3);
        byteBuffer.limit(byteBuffer.position() + zzx2);
        zzi.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - zzx2;
        int i5 = this.zzi - zzx;
        this.zzi = i5;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzx, bArr, 0, i5);
        byteBuffer.get(this.zzh, this.zzi, i4);
        this.zzi += i4;
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zze() {
        int i2;
        if (super.zzf() && (i2 = this.zzi) > 0) {
            zzi(i2).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final boolean zzf() {
        return super.zzf() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final zzdc zzk(zzdc zzdcVar) throws zzdd {
        if (zzdcVar.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzdc.zza : zzdcVar;
        }
        throw new zzdd(zzdcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final void zzl() {
        int i2;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i2 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final void zzm() {
        if (this.zzf) {
            this.zzf = false;
            int i2 = this.zze;
            int i3 = this.zzb.zze;
            this.zzh = new byte[i2 * i3];
            this.zzg = this.zzd * i3;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final void zzn() {
        this.zzh = zzamq.zzf;
    }

    public final void zzo(int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final long zzq() {
        return this.zzj;
    }
}
