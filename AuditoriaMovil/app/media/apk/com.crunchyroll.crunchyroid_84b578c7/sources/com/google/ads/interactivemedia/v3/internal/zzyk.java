package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzyk implements zzyz {
    final /* synthetic */ Constructor zza;

    public zzyk(Constructor constructor) {
        this.zza = constructor;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        try {
            return this.zza.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw zzacg.zzb(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e.e("Failed to invoke constructor '", zzacg.zzc(this.zza), "' with no args"), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e.e("Failed to invoke constructor '", zzacg.zzc(this.zza), "' with no args"), e3.getCause());
        }
    }
}
