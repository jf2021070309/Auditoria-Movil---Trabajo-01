package com.google.firebase.crashlytics.internal.settings;

import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
/* loaded from: classes4.dex */
interface SettingsJsonTransform {
    SettingsData buildFromJson(CurrentTimeProvider currentTimeProvider, c cVar) throws b;

    c toJson(SettingsData settingsData) throws b;
}
