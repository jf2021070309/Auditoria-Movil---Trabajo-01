package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzfoj {
    private final String zza;
    private final zzfoh zzb;
    private zzfoh zzc;

    public /* synthetic */ zzfoj(String str, zzfoi zzfoiVar) {
        zzfoh zzfohVar = new zzfoh(null);
        this.zzb = zzfohVar;
        this.zzc = zzfohVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfoh zzfohVar = this.zzb.zzb;
        String str = "";
        while (zzfohVar != null) {
            Object obj = zzfohVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfohVar = zzfohVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfoj zza(Object obj) {
        zzfoh zzfohVar = new zzfoh(null);
        this.zzc.zzb = zzfohVar;
        this.zzc = zzfohVar;
        zzfohVar.zza = obj;
        return this;
    }
}
