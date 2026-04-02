package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzapg extends zzapb {
    public final zzape zza = new zzape();
    public ByteBuffer zzb;
    public long zzc;

    public zzapg(int i2) {
    }

    private final ByteBuffer zzj(int i2) {
        ByteBuffer byteBuffer = this.zzb;
        StringBuilder w = a.w(44, "Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i2);
        w.append(")");
        throw new IllegalStateException(w.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void zzh(int i2) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzj(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzb.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            return;
        }
        ByteBuffer zzj = zzj(i3);
        if (position > 0) {
            this.zzb.position(0);
            this.zzb.limit(position);
            zzj.put(this.zzb);
        }
        this.zzb = zzj;
    }

    public final boolean zzi() {
        return zzg(1073741824);
    }
}
