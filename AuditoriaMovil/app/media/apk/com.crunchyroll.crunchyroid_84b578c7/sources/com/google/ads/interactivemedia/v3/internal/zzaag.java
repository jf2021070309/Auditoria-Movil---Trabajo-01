package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaag implements zzxj {
    private final zzyl zza;
    private final zzwf zzb;
    private final zzyn zzc;
    private final zzzt zzd;
    private final List zze;

    public zzaag(zzyl zzylVar, zzwf zzwfVar, zzyn zzynVar, zzzt zzztVar, List list) {
        this.zza = zzylVar;
        this.zzb = zzwfVar;
        this.zzc = zzynVar;
        this.zzd = zzztVar;
        this.zze = list;
    }

    public static /* bridge */ /* synthetic */ void zzb(Object obj, AccessibleObject accessibleObject) {
        if (true == Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (zzze.zza(accessibleObject, obj)) {
            return;
        }
        throw new zzws(zzacg.zze(accessibleObject, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map zzc(com.google.ads.interactivemedia.v3.internal.zzwm r38, com.google.ads.interactivemedia.v3.internal.zzact r39, java.lang.Class r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzaag.zzc(com.google.ads.interactivemedia.v3.internal.zzwm, com.google.ads.interactivemedia.v3.internal.zzact, java.lang.Class, boolean, boolean):java.util.Map");
    }

    private final boolean zzd(Field field, boolean z) {
        if (!this.zzc.zzc(field.getType(), z) && !this.zzc.zzd(field, z)) {
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        boolean z;
        Class zzc = zzactVar.zzc();
        if (!Object.class.isAssignableFrom(zzc)) {
            return null;
        }
        int zze = zzze.zze(this.zze, zzc);
        if (zze != 4) {
            if (zze == 3) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = z;
            if (zzacg.zzi(zzc)) {
                return new zzaaf(zzc, zzc(zzwmVar, zzactVar, zzc, z2, true), z2);
            }
            return new zzaae(this.zza.zza(zzactVar), zzc(zzwmVar, zzactVar, zzc, z2, false));
        }
        throw new zzws(e.e("ReflectionAccessFilter does not permit using reflection for ", String.valueOf(zzc), ". Register a TypeAdapter for this type or adjust the access filter."));
    }
}
