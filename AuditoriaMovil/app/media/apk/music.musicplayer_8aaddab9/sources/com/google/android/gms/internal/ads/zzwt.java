package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public final class zzwt {
    public static final Comparator<byte[]> zza = new zzws();
    private final List<byte[]> zzb = new ArrayList();
    private final List<byte[]> zzc = new ArrayList(64);
    private int zzd = 0;

    public zzwt(int i2) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] remove = this.zzb.remove(0);
            this.zzc.remove(remove);
            this.zzd -= remove.length;
        }
    }

    public final synchronized byte[] zza(int i2) {
        for (int i3 = 0; i3 < this.zzc.size(); i3++) {
            byte[] bArr = this.zzc.get(i3);
            int length = bArr.length;
            if (length >= i2) {
                this.zzd -= length;
                this.zzc.remove(i3);
                this.zzb.remove(bArr);
                return bArr;
            }
        }
        return new byte[i2];
    }

    public final synchronized void zzb(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzc, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzc.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }
}
