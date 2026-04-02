package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzflr {
    private final String zza;
    private final zzflq zzb;
    private zzflq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzflr(String str, zzflp zzflpVar) {
        zzflq zzflqVar = new zzflq(null);
        this.zzb = zzflqVar;
        this.zzc = zzflqVar;
        if (str == null) {
            throw null;
        }
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzflq zzflqVar = this.zzb.zzb;
        String str = "";
        while (zzflqVar != null) {
            Object obj = zzflqVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzflqVar = zzflqVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzflr zza(@CheckForNull Object obj) {
        zzflq zzflqVar = new zzflq(null);
        this.zzc.zzb = zzflqVar;
        this.zzc = zzflqVar;
        zzflqVar.zza = obj;
        return this;
    }
}
