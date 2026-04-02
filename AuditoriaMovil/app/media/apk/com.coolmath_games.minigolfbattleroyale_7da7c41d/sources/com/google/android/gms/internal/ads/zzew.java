package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzew extends zzeb {
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
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.zzi + i2) - this.zzh.length;
        ByteBuffer zzi = zzi(length);
        int zzx = zzamq.zzx(length, 0, this.zzi);
        zzi.put(this.zzh, 0, zzx);
        int zzx2 = zzamq.zzx(length - zzx, 0, i2);
        byteBuffer.limit(byteBuffer.position() + zzx2);
        zzi.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - zzx2;
        int i4 = this.zzi - zzx;
        this.zzi = i4;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzx, bArr, 0, i4);
        byteBuffer.get(this.zzh, this.zzi, i3);
        this.zzi += i3;
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzeb, com.google.android.gms.internal.ads.zzde
    public final ByteBuffer zze() {
        int i;
        if (super.zzf() && (i = this.zzi) > 0) {
            zzi(i).put(this.zzh, 0, this.zzi).flip();
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
    protected final void zzl() {
        int i;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzm() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    protected final void zzn() {
        this.zzh = zzamq.zzf;
    }

    public final void zzo(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final long zzq() {
        return this.zzj;
    }
}
