package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzyl {
    private final Map zza;
    private final List zzb;

    public zzyl(Map map, boolean z, List list) {
        this.zza = map;
        this.zzb = list;
    }

    public static String zzb(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public final String toString() {
        return this.zza.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.zzyz zza(com.google.ads.interactivemedia.v3.internal.zzact r11) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzyl.zza(com.google.ads.interactivemedia.v3.internal.zzact):com.google.ads.interactivemedia.v3.internal.zzyz");
    }
}
