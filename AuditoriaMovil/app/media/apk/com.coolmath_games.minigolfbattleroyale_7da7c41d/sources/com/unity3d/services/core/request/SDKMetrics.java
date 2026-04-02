package com.unity3d.services.core.request;

import android.text.TextUtils;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class SDKMetrics {
    private static ISDKMetrics _instance = new NullInstance();

    public static void setConfiguration(Configuration configuration) {
        if (configuration == null) {
            DeviceLog.debug("Metrics will not be sent from the device for this session due to misconfiguration");
            return;
        }
        ISDKMetrics iSDKMetrics = _instance;
        if (iSDKMetrics instanceof MetricInstance) {
            ((MetricInstance) iSDKMetrics).shutdown();
        }
        if (configuration.getMetricSampleRate() >= new Random().nextInt(99) + 1) {
            _instance = new MetricInstance(configuration.getMetricsUrl());
            return;
        }
        DeviceLog.debug("Metrics will not be sent from the device for this session");
        _instance = new NullInstance();
    }

    public static ISDKMetrics getInstance() {
        return _instance;
    }

    /* loaded from: classes2.dex */
    private static final class NullInstance implements ISDKMetrics {
        private NullInstance() {
        }

        @Override // com.unity3d.services.core.request.ISDKMetrics
        public void sendEvent(String str) {
            DeviceLog.debug("Metric " + str + " was skipped from being sent");
        }

        @Override // com.unity3d.services.core.request.ISDKMetrics
        public void sendEventWithTags(String str, Map<String, String> map) {
            sendEvent(str);
        }
    }

    /* loaded from: classes2.dex */
    private static final class MetricInstance implements ISDKMetrics {
        private final ExecutorService _executorService = Executors.newSingleThreadExecutor();
        private final String _metricsUrl;

        public MetricInstance(String str) {
            this._metricsUrl = str;
        }

        protected void shutdown() {
            this._executorService.shutdown();
        }

        @Override // com.unity3d.services.core.request.ISDKMetrics
        public void sendEvent(String str) {
            sendEventWithTags(str, null);
        }

        @Override // com.unity3d.services.core.request.ISDKMetrics
        public void sendEventWithTags(final String str, final Map<String, String> map) {
            if (TextUtils.isEmpty(str)) {
                DeviceLog.debug("Metric event not sent due to being nil or empty: " + str);
            } else if (TextUtils.isEmpty(this._metricsUrl)) {
                DeviceLog.debug("Metric: " + str + " was not sent to nil or empty endpoint: " + this._metricsUrl);
            } else if (this._executorService.isShutdown()) {
                DeviceLog.debug("Metric " + str + " was not sent due to misconfiguration");
            } else {
                this._executorService.submit(new Runnable() { // from class: com.unity3d.services.core.request.SDKMetrics.MetricInstance.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            String str2 = "";
                            if (map != null) {
                                JSONObject jSONObject = new JSONObject(map);
                                str2 = ",\"t\":" + jSONObject.toString();
                            }
                            WebRequest webRequest = new WebRequest(MetricInstance.this._metricsUrl, "POST", null);
                            webRequest.setBody("{\"m\":[{\"n\":\"" + str + "\"" + str2 + "}],\"t\":{\"iso\":\"" + Device.getNetworkCountryISO() + "\",\"plt\":\"android\",\"sdv\":\"" + SdkProperties.getVersionName() + "\"}}");
                            webRequest.makeRequest();
                            if (webRequest.getResponseCode() / 100 == 2) {
                                DeviceLog.debug("Metric " + str + " sent to " + MetricInstance.this._metricsUrl);
                                return;
                            }
                            DeviceLog.debug("Metric " + str + " failed to send with response code: " + webRequest.getResponseCode());
                        } catch (Exception e) {
                            DeviceLog.debug("Metric " + str + " failed to send from exception: " + e.getMessage());
                        }
                    }
                });
            }
        }
    }
}
