package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
/* loaded from: classes2.dex */
final class AutoValue_StaticSessionData_AppData extends StaticSessionData.AppData {
    private final String appIdentifier;
    private final int deliveryMechanism;
    private final String installUuid;
    private final String unityVersion;
    private final String versionCode;
    private final String versionName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_StaticSessionData_AppData(String str, String str2, String str3, String str4, int i, String str5) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.appIdentifier = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.versionCode = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.versionName = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.installUuid = str4;
        this.deliveryMechanism = i;
        this.unityVersion = str5;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String appIdentifier() {
        return this.appIdentifier;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionCode() {
        return this.versionCode;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String versionName() {
        return this.versionName;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String installUuid() {
        return this.installUuid;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public int deliveryMechanism() {
        return this.deliveryMechanism;
    }

    @Override // com.google.firebase.crashlytics.internal.model.StaticSessionData.AppData
    public String unityVersion() {
        return this.unityVersion;
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.appIdentifier + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", installUuid=" + this.installUuid + ", deliveryMechanism=" + this.deliveryMechanism + ", unityVersion=" + this.unityVersion + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StaticSessionData.AppData) {
            StaticSessionData.AppData appData = (StaticSessionData.AppData) obj;
            if (this.appIdentifier.equals(appData.appIdentifier()) && this.versionCode.equals(appData.versionCode()) && this.versionName.equals(appData.versionName()) && this.installUuid.equals(appData.installUuid()) && this.deliveryMechanism == appData.deliveryMechanism()) {
                String str = this.unityVersion;
                if (str == null) {
                    if (appData.unityVersion() == null) {
                        return true;
                    }
                } else if (str.equals(appData.unityVersion())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((this.appIdentifier.hashCode() ^ 1000003) * 1000003) ^ this.versionCode.hashCode()) * 1000003) ^ this.versionName.hashCode()) * 1000003) ^ this.installUuid.hashCode()) * 1000003) ^ this.deliveryMechanism) * 1000003;
        String str = this.unityVersion;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }
}
