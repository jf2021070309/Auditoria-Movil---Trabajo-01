package com.google.android.gms.internal.measurement;

import android.util.Log;
import e.a.d.a.a;
/* loaded from: classes2.dex */
public final class zzhp extends zzhu<Double> {
    public zzhp(zzhr zzhrVar, String str, Double d2, boolean z) {
        super(zzhrVar, "measurement.test.double_flag", d2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzhu
    public final /* bridge */ /* synthetic */ Double zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String zzc = super.zzc();
            String str = (String) obj;
            Log.e("PhenotypeFlag", a.t(new StringBuilder(str.length() + String.valueOf(zzc).length() + 27), "Invalid double value for ", zzc, ": ", str));
            return null;
        }
    }
}
