package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zzec extends zzeb {
    private int[] zzd;
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzi = zzi(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i2 : iArr) {
                zzi.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final zzdc zzk(zzdc zzdcVar) throws zzdd {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzdc.zza;
        }
        if (zzdcVar.zzd != 2) {
            throw new zzdd(zzdcVar);
        }
        boolean z = zzdcVar.zzc != iArr.length;
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                return z ? new zzdc(zzdcVar.zzb, length, 2) : zzdc.zza;
            }
            int i3 = iArr[i2];
            if (i3 >= zzdcVar.zzc) {
                throw new zzdd(zzdcVar);
            }
            z |= i3 != i2;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final void zzm() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final void zzn() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
