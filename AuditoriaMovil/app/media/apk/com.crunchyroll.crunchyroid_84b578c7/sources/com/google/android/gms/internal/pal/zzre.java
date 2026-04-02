package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzre {
    private ArrayList zza = new ArrayList();
    private zzrb zzb = zzrb.zza;
    private Integer zzc = null;

    public final zzre zza(zzkj zzkjVar, int i, zzks zzksVar) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzrg(zzkjVar, i, zzksVar, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzre zzb(zzrb zzrbVar) {
        if (this.zza != null) {
            this.zzb = zzrbVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzre zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzri zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((zzrg) arrayList.get(i)).zza() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzri zzriVar = new zzri(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzriVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
