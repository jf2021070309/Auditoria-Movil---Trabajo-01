package com.google.android.gms.internal.auth;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzcu extends zzcz<Boolean> {
    public zzcu(zzcx zzcxVar, String str, Boolean bool, boolean z) {
        super(zzcxVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzcz
    public final /* bridge */ /* synthetic */ Boolean zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String zzc = super.zzc();
        String str = (String) obj;
        Log.e("PhenotypeFlag", a.t(new StringBuilder(String.valueOf(zzc).length() + 28 + str.length()), "Invalid boolean value for ", zzc, ": ", str));
        return null;
    }
}
