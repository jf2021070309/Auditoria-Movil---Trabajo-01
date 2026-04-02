package com.google.android.gms.internal.consent_sdk;

import android.util.JsonWriter;
import java.io.IOException;
/* loaded from: classes.dex */
public enum zzbs {
    DEBUG_PARAM_UNKNOWN,
    ALWAYS_SHOW,
    GEO_OVERRIDE_EEA,
    GEO_OVERRIDE_NON_EEA;

    public final void zza(JsonWriter jsonWriter) throws IOException {
        int i2 = zzbq.zzb[ordinal()];
        if (i2 == 1) {
            jsonWriter.value("DEBUG_PARAM_UNKNOWN");
        } else if (i2 == 2) {
            jsonWriter.value("ALWAYS_SHOW");
        } else if (i2 == 3) {
            jsonWriter.value("GEO_OVERRIDE_EEA");
        } else if (i2 != 4) {
        } else {
            jsonWriter.value("GEO_OVERRIDE_NON_EEA");
        }
    }
}
