package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzxp implements ParameterizedType, Serializable {
    private final Type zza;
    private final Type zzb;
    private final Type[] zzc;

    public zzxp(Type type, Type type2, Type... typeArr) {
        Type zzc;
        boolean z;
        type2.getClass();
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z2 = true;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getEnclosingClass() != null) {
                z = false;
            } else {
                z = true;
            }
            if (type == null && !z) {
                z2 = false;
            }
            zzxm.zza(z2);
        }
        if (type == null) {
            zzc = null;
        } else {
            zzc = zzxr.zzc(type);
        }
        this.zza = zzc;
        this.zzb = zzxr.zzc(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.zzc = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type type3 = this.zzc[i];
            type3.getClass();
            zzxr.zzf(type3);
            Type[] typeArr3 = this.zzc;
            typeArr3[i] = zzxr.zzc(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ParameterizedType) && zzxr.zzg(this, (ParameterizedType) obj)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.zzc.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.zza;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.zzb;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.zzc) ^ this.zzb.hashCode();
        Type type = this.zza;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        int length = this.zzc.length;
        if (length == 0) {
            return zzxr.zzb(this.zzb);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(zzxr.zzb(this.zzb));
        sb.append("<");
        sb.append(zzxr.zzb(this.zzc[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(zzxr.zzb(this.zzc[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
