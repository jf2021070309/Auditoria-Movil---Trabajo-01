package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class zzckl {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzxs zzxsVar;
        zzxr zzxrVar;
        long j2 = this.zza;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzxp> it = new zzxn(new zzckk(duplicate), zzckn.zzb).zzd().iterator();
            while (true) {
                zzxsVar = null;
                if (!it.hasNext()) {
                    zzxrVar = null;
                    break;
                }
                zzxp next = it.next();
                if (next instanceof zzxr) {
                    zzxrVar = (zzxr) next;
                    break;
                }
            }
            Iterator<zzxp> it2 = zzxrVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzxp next2 = it2.next();
                if (next2 instanceof zzxs) {
                    zzxsVar = (zzxs) next2;
                    break;
                }
            }
            long zze = (zzxsVar.zze() * 1000) / zzxsVar.zzd();
            this.zza = zze;
            return zze;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
