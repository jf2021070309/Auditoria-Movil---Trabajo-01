package com.kwad.sdk.core.config.item;

import android.content.Context;
import android.content.SharedPreferences;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class c extends b<Integer> {
    public c() {
        super("batchReportCacheType", 2);
    }

    public static int aT(Context context) {
        SharedPreferences sharedPreferences;
        com.kwad.sdk.core.e.c.d("batchReportCacheType", "loadBatchReportCacheType");
        if (context == null || (sharedPreferences = context.getSharedPreferences("ksadsdk_rep", 0)) == null) {
            return 2;
        }
        return sharedPreferences.getInt("batchReportCacheType", 2);
    }

    private static void h(Context context, int i) {
        SharedPreferences sharedPreferences;
        com.kwad.sdk.core.e.c.d("batchReportCacheType", "saveBatchReportCacheType");
        if (context == null || (sharedPreferences = context.getSharedPreferences("ksadsdk_rep", 0)) == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt("batchReportCacheType", i);
        edit.apply();
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void a(SharedPreferences sharedPreferences) {
        setValue(Integer.valueOf(aT(ServiceProvider.HA())));
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void b(SharedPreferences.Editor editor) {
        h(ServiceProvider.HA(), getValue().intValue());
    }

    @Override // com.kwad.sdk.core.config.item.b
    public final void h(JSONObject jSONObject) {
        setValue(jSONObject != null ? Integer.valueOf(jSONObject.optInt(getKey(), zY().intValue())) : zY());
    }
}
