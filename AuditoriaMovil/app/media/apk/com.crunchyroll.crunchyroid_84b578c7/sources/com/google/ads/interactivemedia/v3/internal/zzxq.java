package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzxq implements WildcardType, Serializable {
    private final Type zza;
    private final Type zzb;

    public zzxq(Type[] typeArr, Type[] typeArr2) {
        boolean z;
        boolean z2;
        int length = typeArr2.length;
        if (length <= 1) {
            z = true;
        } else {
            z = false;
        }
        zzxm.zza(z);
        if (typeArr.length == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzxm.zza(z2);
        if (length == 1) {
            Type type = typeArr2[0];
            type.getClass();
            zzxr.zzf(type);
            zzxm.zza(typeArr[0] == Object.class);
            this.zzb = zzxr.zzc(typeArr2[0]);
            this.zza = Object.class;
            return;
        }
        Type type2 = typeArr[0];
        type2.getClass();
        zzxr.zzf(type2);
        this.zzb = null;
        this.zza = zzxr.zzc(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof WildcardType) && zzxr.zzg(this, (WildcardType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.zzb;
        return type != null ? new Type[]{type} : zzxr.zza;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.zza};
    }

    public final int hashCode() {
        int i;
        Type type = this.zzb;
        if (type != null) {
            i = type.hashCode() + 31;
        } else {
            i = 1;
        }
        return i ^ (this.zza.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.zzb;
        if (type != null) {
            return "? super ".concat(String.valueOf(zzxr.zzb(type)));
        }
        Type type2 = this.zza;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends ".concat(String.valueOf(zzxr.zzb(type2)));
    }
}
