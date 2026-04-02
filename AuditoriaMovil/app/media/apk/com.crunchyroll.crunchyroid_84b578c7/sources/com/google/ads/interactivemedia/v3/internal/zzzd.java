package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
abstract class zzzd {
    public static final zzzd zzb;

    static {
        zzzd zzzdVar = null;
        if (zzyo.zza()) {
            try {
                zzzdVar = new zzza(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzzdVar == null) {
            zzzdVar = new zzzb();
        }
        zzb = zzzdVar;
    }

    public /* synthetic */ zzzd(zzzc zzzcVar) {
    }

    public abstract boolean zza(AccessibleObject accessibleObject, Object obj);
}
