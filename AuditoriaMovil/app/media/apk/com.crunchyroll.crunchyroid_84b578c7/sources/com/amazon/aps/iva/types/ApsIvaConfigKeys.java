package com.amazon.aps.iva.types;
/* loaded from: classes.dex */
public enum ApsIvaConfigKeys {
    AMAZON_SIMID_CONTAINER_HTML("amazonSimidContainerHtml"),
    AMAZON_SIMID_CONTAINER_JS_INTERFACE_NAME("amazonSimidContainerJsInterfaceName"),
    METRIC_LOGGER_HTTP_URL("metricLoggerHttpUrl"),
    SHARED_PREFERENCES_EXPIRY_TIME("apsIvaConfigCacheExpiryTime"),
    FEATURE_FLAGS("featureFlags"),
    METRIC_SAMPLING_RATES("metricSamplingRates");
    
    private final String apsIvaConfigKeyName;

    ApsIvaConfigKeys(String str) {
        this.apsIvaConfigKeyName = str;
    }

    public String getConfigKeyName() {
        return this.apsIvaConfigKeyName;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.apsIvaConfigKeyName;
    }
}
