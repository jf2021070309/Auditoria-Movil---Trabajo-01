package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzyn implements Cloneable, zzxj {
    public static final zzyn zza = new zzyn();
    private List zzb = Collections.emptyList();
    private final List zzc = Collections.emptyList();

    private final boolean zzf(Class cls, boolean z) {
        List<zzqz> list;
        if (z) {
            list = this.zzb;
        } else {
            list = this.zzc;
        }
        for (zzqz zzqzVar : list) {
        }
        return false;
    }

    private static final boolean zzg(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0) {
            return false;
        }
        if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
            return false;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        boolean z;
        boolean z2;
        Class zzc = zzactVar.zzc();
        boolean zzg = zzg(zzc);
        if (!zzg) {
            zzf(zzc, true);
            z = false;
        } else {
            z = true;
        }
        if (!zzg) {
            zzf(zzc, false);
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z) {
            return null;
        }
        return new zzym(this, z2, true, zzwmVar, zzactVar);
    }

    /* renamed from: zzb */
    public final zzyn clone() {
        try {
            return (zzyn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean zzc(Class cls, boolean z) {
        if (!zzg(cls)) {
            zzf(cls, z);
            return false;
        }
        return true;
    }

    public final boolean zzd(Field field, boolean z) {
        List<zzqz> list;
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || zzg(field.getType())) {
            return true;
        }
        if (z) {
            list = this.zzb;
        } else {
            list = this.zzc;
        }
        if (!list.isEmpty()) {
            for (zzqz zzqzVar : list) {
                zzqy zzqyVar = (zzqy) zzwd.zza(field).getAnnotation(zzqy.class);
                if (zzqyVar != null && Arrays.asList(zzqyVar.zzb()).contains(zzwd.zzb(field))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final zzyn zze(zzqz zzqzVar, boolean z, boolean z2) {
        zzyn clone = clone();
        ArrayList arrayList = new ArrayList(this.zzb);
        clone.zzb = arrayList;
        arrayList.add(zzqzVar);
        return clone;
    }
}
