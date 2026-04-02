package com.google.android.gms.internal.measurement;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzhn extends zzhu<Long> {
    public zzhn(zzhr zzhrVar, String str, Long l2, boolean z) {
        super(zzhrVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Long zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", a.t(new StringBuilder(str.length() + String.valueOf(zzc).length() + 25), "Invalid long value for ", zzc, ": ", str));
            return null;
        }
    }
}
