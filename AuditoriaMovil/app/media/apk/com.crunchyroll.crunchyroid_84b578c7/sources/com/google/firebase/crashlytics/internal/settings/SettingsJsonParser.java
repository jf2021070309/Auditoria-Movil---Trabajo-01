package com.google.firebase.crashlytics.internal.settings;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
/* loaded from: classes4.dex */
public class SettingsJsonParser {
    private final CurrentTimeProvider currentTimeProvider;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = currentTimeProvider;
    }

    private static SettingsJsonTransform getJsonTransformForVersion(int i) {
        if (i != 3) {
            return new DefaultSettingsJsonTransform();
        }
        return new SettingsV3JsonTransform();
    }

    public SettingsData parseSettingsJson(c cVar) throws b {
        return getJsonTransformForVersion(cVar.getInt("settings_version")).buildFromJson(this.currentTimeProvider, cVar);
    }
}
