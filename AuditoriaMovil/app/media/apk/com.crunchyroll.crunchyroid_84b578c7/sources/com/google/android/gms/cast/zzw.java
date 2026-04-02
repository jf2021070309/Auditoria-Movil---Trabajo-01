package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.CastUtils;
import java.util.Collection;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzw {
    private final String zza;
    private final String zzb;
    private final Collection zzc;

    public /* synthetic */ zzw(String str, String str2, Collection collection, boolean z, boolean z2, zzv zzvVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = collection;
    }

    public static /* bridge */ /* synthetic */ String zza(zzw zzwVar) {
        StringBuilder sb = new StringBuilder(zzwVar.zza);
        String str = zzwVar.zzb;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(String.valueOf(zzwVar.zzb)));
            }
        }
        Collection collection = zzwVar.zzc;
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (zzwVar.zzb == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z = true;
                for (String str2 : zzwVar.zzc) {
                    CastUtils.throwIfInvalidNamespace(str2);
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(CastUtils.zzc(str2));
                    z = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (zzwVar.zzb == null && zzwVar.zzc == null) {
            sb.append("/");
        }
        if (zzwVar.zzc == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }
}
