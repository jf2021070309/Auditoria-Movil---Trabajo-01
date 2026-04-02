package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzyh implements zzyz {
    final /* synthetic */ Type zza;

    public zzyh(Type type) {
        this.zza = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        Type type = this.zza;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new zzws("Invalid EnumMap type: ".concat(String.valueOf(this.zza.toString())));
        }
        throw new zzws("Invalid EnumMap type: ".concat(String.valueOf(type.toString())));
    }
}
