package com.google.firebase.crashlytics.internal.settings;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import java.util.Locale;
/* loaded from: classes4.dex */
class SettingsV3JsonTransform implements SettingsJsonTransform {
    private static final String CRASHLYTICS_APP_URL = "https://update.crashlytics.com/spi/v1/platforms/android/apps";
    private static final String CRASHLYTICS_APP_URL_FORMAT = "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s";
    private static final String NDK_REPORTS_URL_FORMAT = "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps";
    private static final String REPORTS_URL_FORMAT = "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports";

    private static AppSettingsData buildAppDataFrom(c cVar, c cVar2) throws b {
        String format;
        String string = cVar2.getString("status");
        boolean equals = AppSettingsData.STATUS_NEW.equals(string);
        String string2 = cVar.getString("bundle_id");
        String string3 = cVar.getString("org_id");
        if (equals) {
            format = CRASHLYTICS_APP_URL;
        } else {
            format = String.format(Locale.US, CRASHLYTICS_APP_URL_FORMAT, string2);
        }
        String str = format;
        Locale locale = Locale.US;
        return new AppSettingsData(string, str, String.format(locale, REPORTS_URL_FORMAT, string2), String.format(locale, NDK_REPORTS_URL_FORMAT, string2), string2, string3, cVar2.optBoolean("update_required", false), cVar2.optInt("report_upload_variant", 0), cVar2.optInt("native_report_upload_variant", 0));
    }

    private static FeaturesSettingsData buildFeaturesSessionDataFrom(c cVar) {
        return new FeaturesSettingsData(cVar.optBoolean("collect_reports", true), cVar.optBoolean("collect_anrs", false));
    }

    private static SessionSettingsData defaultSessionData() {
        return new SessionSettingsData(8, 4);
    }

    private static long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long j, c cVar) {
        if (cVar.has("expires_at")) {
            return cVar.optLong("expires_at");
        }
        return (j * 1000) + currentTimeProvider.getCurrentTimeMillis();
    }

    private c toAppJson(AppSettingsData appSettingsData) throws b {
        return new c().put("status", appSettingsData.status).put("update_required", appSettingsData.updateRequired).put("report_upload_variant", appSettingsData.reportUploadVariant).put("native_report_upload_variant", appSettingsData.nativeReportUploadVariant);
    }

    private c toFabricJson(AppSettingsData appSettingsData) throws b {
        return new c().put("bundle_id", appSettingsData.bundleId).put("org_id", appSettingsData.organizationId);
    }

    private c toFeaturesJson(FeaturesSettingsData featuresSettingsData) throws b {
        return new c().put("collect_reports", featuresSettingsData.collectReports);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public SettingsData buildFromJson(CurrentTimeProvider currentTimeProvider, c cVar) throws b {
        int optInt = cVar.optInt("settings_version", 0);
        int optInt2 = cVar.optInt("cache_duration", 3600);
        return new SettingsData(getExpiresAtFrom(currentTimeProvider, optInt2, cVar), buildAppDataFrom(cVar.getJSONObject("fabric"), cVar.getJSONObject("app")), defaultSessionData(), buildFeaturesSessionDataFrom(cVar.getJSONObject("features")), optInt, optInt2);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform
    public c toJson(SettingsData settingsData) throws b {
        return new c().put("expires_at", settingsData.expiresAtMillis).put("cache_duration", settingsData.cacheDuration).put("settings_version", settingsData.settingsVersion).put("features", toFeaturesJson(settingsData.featuresData)).put("app", toAppJson(settingsData.appData)).put("fabric", toFabricJson(settingsData.appData));
    }
}
