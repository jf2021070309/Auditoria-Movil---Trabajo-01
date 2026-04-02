package com.google.android.gms.internal.auth;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzct extends zzcz<Long> {
    public zzct(zzcx zzcxVar, String str, Long l2, boolean z) {
        super(zzcxVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    public final /* bridge */ /* synthetic */ Long zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", a.t(new StringBuilder(String.valueOf(zzc).length() + 25 + str.length()), "Invalid long value for ", zzc, ": ", str));
            return null;
        }
    }
}
