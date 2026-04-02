package com.amazon.aps.iva.metrics.types;

import com.amazon.aps.iva.a9.w;
import com.amazon.aps.iva.types.EnvironmentData;
import com.amazon.aps.iva.va.c;
import com.google.gson.Gson;
/* loaded from: classes.dex */
public class MetricEvent implements Event {
    private final String TAG;
    private String appId;
    private DeviceInfo deviceInfo;
    private final transient Gson gson;
    private final String metricName;
    private final MetricType metricType;
    private long milliseconds;
    private final String namespace;
    private String pubUUID;
    private Severity severity;
    private String version;

    public MetricEvent(String str, Severity severity) {
        this.severity = Severity.INFO;
        this.appId = "";
        this.pubUUID = "";
        this.version = "ApsIvaSdk-1.0";
        this.namespace = "ApsIvaSdk";
        this.TAG = getClass().getSimpleName();
        this.gson = w.c().b();
        this.deviceInfo = c.b().a();
        this.metricName = str;
        this.severity = severity;
        this.metricType = MetricType.COUNT;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MetricEvent;
    }

    @Override // com.amazon.aps.iva.metrics.types.Event
    public void decorateEvent(EnvironmentData environmentData) {
        this.appId = environmentData.getAppId();
        this.pubUUID = environmentData.getPubUUID();
        this.version = environmentData.getVersion();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricEvent)) {
            return false;
        }
        MetricEvent metricEvent = (MetricEvent) obj;
        if (!metricEvent.canEqual(this) || this.milliseconds != metricEvent.milliseconds) {
            return false;
        }
        String metricName = getMetricName();
        String metricName2 = metricEvent.getMetricName();
        if (metricName != null ? !metricName.equals(metricName2) : metricName2 != null) {
            return false;
        }
        Severity severity = getSeverity();
        Severity severity2 = metricEvent.getSeverity();
        if (severity != null ? !severity.equals(severity2) : severity2 != null) {
            return false;
        }
        MetricType metricType = this.metricType;
        MetricType metricType2 = metricEvent.metricType;
        if (metricType != null ? !metricType.equals(metricType2) : metricType2 != null) {
            return false;
        }
        String str = this.appId;
        String str2 = metricEvent.appId;
        if (str != null ? !str.equals(str2) : str2 != null) {
            return false;
        }
        String str3 = this.pubUUID;
        String str4 = metricEvent.pubUUID;
        if (str3 != null ? !str3.equals(str4) : str4 != null) {
            return false;
        }
        String str5 = this.version;
        String str6 = metricEvent.version;
        if (str5 != null ? !str5.equals(str6) : str6 != null) {
            return false;
        }
        if (!"ApsIvaSdk".equals("ApsIvaSdk")) {
            return false;
        }
        String str7 = this.TAG;
        String str8 = metricEvent.TAG;
        if (str7 != null ? !str7.equals(str8) : str8 != null) {
            return false;
        }
        DeviceInfo deviceInfo = this.deviceInfo;
        DeviceInfo deviceInfo2 = metricEvent.deviceInfo;
        if (deviceInfo != null ? deviceInfo.equals(deviceInfo2) : deviceInfo2 == null) {
            return true;
        }
        return false;
    }

    public String getMetricName() {
        return this.metricName;
    }

    @Override // com.amazon.aps.iva.metrics.types.Event
    public Severity getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        long j = this.milliseconds;
        String metricName = getMetricName();
        int i = (((int) (j ^ (j >>> 32))) + 59) * 59;
        int i2 = 43;
        if (metricName == null) {
            hashCode = 43;
        } else {
            hashCode = metricName.hashCode();
        }
        int i3 = i + hashCode;
        Severity severity = getSeverity();
        int i4 = i3 * 59;
        if (severity == null) {
            hashCode2 = 43;
        } else {
            hashCode2 = severity.hashCode();
        }
        int i5 = i4 + hashCode2;
        MetricType metricType = this.metricType;
        int i6 = i5 * 59;
        if (metricType == null) {
            hashCode3 = 43;
        } else {
            hashCode3 = metricType.hashCode();
        }
        int i7 = i6 + hashCode3;
        String str = this.appId;
        int i8 = i7 * 59;
        if (str == null) {
            hashCode4 = 43;
        } else {
            hashCode4 = str.hashCode();
        }
        int i9 = i8 + hashCode4;
        String str2 = this.pubUUID;
        int i10 = i9 * 59;
        if (str2 == null) {
            hashCode5 = 43;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i11 = i10 + hashCode5;
        String str3 = this.version;
        int i12 = i11 * 59;
        if (str3 == null) {
            hashCode6 = 43;
        } else {
            hashCode6 = str3.hashCode();
        }
        int hashCode8 = "ApsIvaSdk".hashCode() + ((i12 + hashCode6) * 59);
        String str4 = this.TAG;
        int i13 = hashCode8 * 59;
        if (str4 == null) {
            hashCode7 = 43;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i14 = i13 + hashCode7;
        DeviceInfo deviceInfo = this.deviceInfo;
        int i15 = i14 * 59;
        if (deviceInfo != null) {
            i2 = deviceInfo.hashCode();
        }
        return i15 + i2;
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String toJsonPayload() {
        return this.gson.toJson(this);
    }

    public MetricEvent(String str, long j) {
        this.severity = Severity.INFO;
        this.appId = "";
        this.pubUUID = "";
        this.version = "ApsIvaSdk-1.0";
        this.namespace = "ApsIvaSdk";
        this.TAG = getClass().getSimpleName();
        this.gson = w.c().b();
        this.deviceInfo = c.b().a();
        this.metricName = str;
        this.metricType = MetricType.MILLISECONDS;
        this.milliseconds = j;
    }

    public MetricEvent(String str, MetricType metricType, String str2, String str3, String str4, long j, DeviceInfo deviceInfo) {
        this.severity = Severity.INFO;
        this.appId = "";
        this.pubUUID = "";
        this.version = "ApsIvaSdk-1.0";
        this.namespace = "ApsIvaSdk";
        this.TAG = getClass().getSimpleName();
        this.gson = w.c().b();
        c.b().a();
        this.metricName = str;
        this.metricType = metricType;
        this.appId = str2;
        this.pubUUID = str3;
        this.version = str4;
        this.milliseconds = j;
        this.deviceInfo = deviceInfo;
    }

    public MetricEvent(String str, Severity severity, MetricType metricType, String str2, String str3, String str4, DeviceInfo deviceInfo) {
        this.severity = Severity.INFO;
        this.appId = "";
        this.pubUUID = "";
        this.version = "ApsIvaSdk-1.0";
        this.namespace = "ApsIvaSdk";
        this.TAG = getClass().getSimpleName();
        this.gson = w.c().b();
        c.b().a();
        this.metricName = str;
        this.severity = severity;
        this.metricType = metricType;
        this.appId = str2;
        this.pubUUID = str3;
        this.version = str4;
        this.deviceInfo = deviceInfo;
    }
}
