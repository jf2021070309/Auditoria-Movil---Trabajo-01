package com.google.firebase.crashlytics.internal.settings;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
/* loaded from: classes4.dex */
class DefaultSettingsJsonTransform implements SettingsJsonTransform {
    private static AppSettingsData buildAppDataFrom(c cVar) throws b {
        return new AppSettingsData(cVar.getString("status"), cVar.getString(ImagesContract.URL), cVar.getString("reports_url"), cVar.getString("ndk_reports_url"), cVar.optBoolean("update_required", false));
    }

    private static FeaturesSettingsData buildFeaturesSessionDataFrom(c cVar) {
        return new FeaturesSettingsData(cVar.optBoolean("collect_reports", true), cVar.optBoolean("collect_anrs", false));
    }

    private static SessionSettingsData buildSessionDataFrom(c cVar) {
        return new SessionSettingsData(cVar.optInt("max_custom_exception_events", 8), 4);
    }

    public static Settings defaultSettings(CurrentTimeProvider currentTimeProvider) {
        c cVar = new c();
        return new SettingsData(getExpiresAtFrom(currentTimeProvider, 3600L, cVar), null, buildSessionDataFrom(cVar), buildFeaturesSessionDataFrom(cVar), 0, 3600);
    }

    private static long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long j, c cVar) {
        if (cVar.has("expires_at")) {
            return cVar.optLong("expires_at");
        }
        return (j * 1000) + currentTimeProvider.getCurrentTimeMillis();
    }

    private c toAppJson(AppSettingsData appSettingsData) throws b {
        return new c().put("status", appSettingsData.status).put(ImagesContract.URL, appSettingsData.url).put("reports_url", appSettingsData.reportsUrl).put("ndk_reports_url", appSettingsData.ndkReportsUrl).put("update_required", appSettingsData.updateRequired);
    }

    private c toFeaturesJson(FeaturesSettingsData featuresSettingsData) throws b {
        return new c().put("collect_reports", featuresSettingsData.collectReports);
    }

    private c toSessionJson(SessionSettingsData sessionSettingsData) throws b {
        return new c().put("max_custom_exception_events", sessionSettingsData.maxCustomExceptionEvents).put("max_complete_sessions_count", sessionSettingsData.maxCompleteSessionsCount);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public SettingsData buildFromJson(CurrentTimeProvider currentTimeProvider, c cVar) throws b {
        int optInt = cVar.optInt("settings_version", 0);
        int optInt2 = cVar.optInt("cache_duration", 3600);
        return new SettingsData(getExpiresAtFrom(currentTimeProvider, optInt2, cVar), buildAppDataFrom(cVar.getJSONObject("app")), buildSessionDataFrom(cVar.getJSONObject("session")), buildFeaturesSessionDataFrom(cVar.getJSONObject("features")), optInt, optInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public c toJson(SettingsData settingsData) throws b {
        return new c().put("expires_at", settingsData.expiresAtMillis).put("cache_duration", settingsData.cacheDuration).put("settings_version", settingsData.settingsVersion).put("features", toFeaturesJson(settingsData.featuresData)).put("app", toAppJson(settingsData.appData)).put("session", toSessionJson(settingsData.sessionData));
    }
}
