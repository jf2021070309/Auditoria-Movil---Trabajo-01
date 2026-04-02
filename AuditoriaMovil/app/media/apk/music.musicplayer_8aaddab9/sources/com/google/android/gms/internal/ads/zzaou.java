package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzaou implements zzaob {
    private int zzb;
    private int zzc;
    private int[] zzd;
    private boolean zze;
    private int[] zzf;
    private ByteBuffer zzg;
    private ByteBuffer zzh;
    private boolean zzi;

    public zzaou() {
        ByteBuffer byteBuffer = zzaob.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zza(int i2, int i3, int i4) throws zzaoa {
        boolean z = !Arrays.equals(this.zzd, this.zzf);
        int[] iArr = this.zzd;
        this.zzf = iArr;
        if (iArr == null) {
            this.zze = false;
            return z;
        } else if (i4 != 2) {
            throw new zzaoa(i2, i3, i4);
        } else {
            if (!z && this.zzc == i2 && this.zzb == i3) {
                return false;
            }
            this.zzc = i2;
            this.zzb = i3;
            this.zze = i3 != iArr.length;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.zzf;
                if (i5 >= iArr2.length) {
                    return true;
                }
                int i6 = iArr2[i5];
                if (i6 >= i3) {
                    throw new zzaoa(i2, i3, 2);
                }
                this.zze = (i6 != i5) | this.zze;
                i5++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final int zzc() {
        int[] iArr = this.zzf;
        return iArr == null ? this.zzb : iArr.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final int zzd() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = this.zzb;
        int length = ((limit - position) / (i2 + i2)) * this.zzf.length;
        int i3 = length + length;
        if (this.zzg.capacity() < i3) {
            this.zzg = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.zzg.clear();
        }
        while (position < limit) {
            for (int i4 : this.zzf) {
                this.zzg.putShort(byteBuffer.getShort(i4 + i4 + position));
            }
            int i5 = this.zzb;
            position += i5 + i5;
        }
        byteBuffer.position(limit);
        this.zzg.flip();
        this.zzh = this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzf() {
        this.zzi = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final ByteBuffer zzg() {
        ByteBuffer byteBuffer = this.zzh;
        this.zzh = zzaob.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final boolean zzh() {
        return this.zzi && this.zzh == zzaob.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzi() {
        this.zzh = zzaob.zza;
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaob
    public final void zzj() {
        zzi();
        this.zzg = zzaob.zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzf = null;
        this.zze = false;
    }

    public final void zzk(int[] iArr) {
        this.zzd = iArr;
    }
}
