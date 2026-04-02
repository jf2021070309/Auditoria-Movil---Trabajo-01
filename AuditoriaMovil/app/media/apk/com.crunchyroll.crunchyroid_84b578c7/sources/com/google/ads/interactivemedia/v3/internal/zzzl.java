package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzzl implements zzxj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Type componentType;
        Type zzd = zzactVar.zzd();
        boolean z = zzd instanceof GenericArrayType;
        if (!z && (!(zzd instanceof Class) || !((Class) zzd).isArray())) {
            return null;
        }
        if (z) {
            componentType = ((GenericArrayType) zzd).getGenericComponentType();
        } else {
            componentType = ((Class) zzd).getComponentType();
        }
        return new zzzm(zzwmVar, zzwmVar.zza(zzact.zzb(componentType)), zzxr.zza(componentType));
    }
}
