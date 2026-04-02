package com.fyber.inneractive.sdk.external;
/* loaded from: classes.dex */
public enum InneractiveErrorCode {
    NO_FILL("No Ad Found.", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS),
    SERVER_INTERNAL_ERROR("Server Internal Error.", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    SERVER_INVALID_RESPONSE("Failed Due To Invalid Server Response.", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    SDK_INTERNAL_ERROR("SDK Internal Error.", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    CANCELLED("Ad Request Was Cancelled.", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    CONNECTION_TIMEOUT("Connection Timed Out.", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS),
    CONNECTION_ERROR("Network Connection Error.", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    LOAD_TIMEOUT("Failed Due To load timeout", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS),
    IN_FLIGHT_TIMEOUT("Failed Due To in flight timeout", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS),
    UNKNOWN_APP_ID("Unknown App ID.", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    INVALID_INPUT("User Entered Invalid Input.", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    ERROR_CODE_NATIVE_VIDEO_NOT_SUPPORTED("Native Video Not Supported", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    NATIVE_ADS_NOT_SUPPORTED_FOR_OS("Native ads not supported for this Android version", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    ERROR_CONFIGURATION_MISMATCH("Internal Configuration Error", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    ERROR_CONFIGURATION_NO_SUCH_SPOT("Invalid spot supplied", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS),
    SPOT_DISABLED("Selected spot is not active", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    UNSUPPORTED_SPOT("Unsupported Spot", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    NON_SECURE_CONTENT_DETECTED("Non secure content detected", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    UNSPECIFIED("Unspecified Error.", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    SDK_NOT_INITIALIZED("SDK was not initialized. Did you forget to call InneractiveAdManager.init(...)?", Metricable.INCLUDED_IN_FAILED_METRICS, Metricable.INCLUDED_IN_FAILED_METRICS),
    SDK_NOT_INITIALIZED_OR_CONFIG_ERROR("Invalid App Id", Metricable.EXCLUDED_IN_FAILED_METRICS, Metricable.EXCLUDED_IN_FAILED_METRICS);
    
    private final String a;
    private final Metricable b;
    private final Metricable c;

    /* loaded from: classes.dex */
    public enum Metricable {
        INCLUDED_IN_FAILED_METRICS,
        EXCLUDED_IN_FAILED_METRICS
    }

    InneractiveErrorCode(String str, Metricable metricable, Metricable metricable2) {
        this.a = str;
        this.b = metricable;
        this.c = metricable2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }

    public final Metricable getMetricable() {
        return this.b;
    }

    public final boolean shouldSendTimeMetric() {
        return this.c == Metricable.INCLUDED_IN_FAILED_METRICS;
    }
}
