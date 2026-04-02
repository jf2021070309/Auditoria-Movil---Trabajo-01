package com.google.android.gms.internal.auth;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes.dex */
public final class zzcv extends zzcz<Double> {
    public zzcv(zzcx zzcxVar, String str, Double d2, boolean z) {
        super(zzcxVar, str, d2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzcz
    public final /* bridge */ /* synthetic */ Double zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", a.t(new StringBuilder(String.valueOf(zzc).length() + 27 + str.length()), "Invalid double value for ", zzc, ": ", str));
            return null;
        }
    }
}
