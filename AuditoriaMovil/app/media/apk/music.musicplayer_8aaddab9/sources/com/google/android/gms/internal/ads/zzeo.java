package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzeo extends zzeb {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i2, ByteBuffer byteBuffer) {
        double d2 = i2;
        Double.isNaN(d2);
        int floatToIntBits = Float.floatToIntBits((float) (d2 * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final void zzc(ByteBuffer byteBuffer) {
        ByteBuffer zzi;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 == 536870912) {
            zzi = zzi((i2 / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), zzi);
                position += 3;
            }
        } else if (i3 != 805306368) {
            throw new IllegalStateException();
        } else {
            zzi = zzi(i2);
            while (position < limit) {
                zzo((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), zzi);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzeb
    public final zzdc zzk(zzdc zzdcVar) throws zzdd {
        int i2 = zzdcVar.zzd;
        if (zzamq.zzQ(i2)) {
            return i2 != 4 ? new zzdc(zzdcVar.zzb, zzdcVar.zzc, 4) : zzdc.zza;
        }
        throw new zzdd(zzdcVar);
    }
}
