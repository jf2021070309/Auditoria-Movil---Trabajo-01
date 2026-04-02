package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzza extends zzzd {
    final /* synthetic */ Method zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzza(Method method) {
        super(null);
        this.zza = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzd
    public final boolean zza(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.zza.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
