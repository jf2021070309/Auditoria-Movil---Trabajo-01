package net.hockeyapp.android.metrics.model;

import java.io.Serializable;
import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Internal implements Serializable, IJsonSerializable {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;

    public Internal() {
        InitializeFields();
    }

    public String getSdkVersion() {
        return this.a;
    }

    public void setSdkVersion(String str) {
        this.a = str;
    }

    public String getAgentVersion() {
        return this.b;
    }

    public void setAgentVersion(String str) {
        this.b = str;
    }

    public String getDataCollectorReceivedTime() {
        return this.c;
    }

    public void setDataCollectorReceivedTime(String str) {
        this.c = str;
    }

    public String getProfileId() {
        return this.d;
    }

    public void setProfileId(String str) {
        this.d = str;
    }

    public String getProfileClassId() {
        return this.e;
    }

    public void setProfileClassId(String str) {
        this.e = str;
    }

    public String getAccountId() {
        return this.f;
    }

    public void setAccountId(String str) {
        this.f = str;
    }

    public String getApplicationName() {
        return this.g;
    }

    public void setApplicationName(String str) {
        this.g = str;
    }

    public String getInstrumentationKey() {
        return this.h;
    }

    public void setInstrumentationKey(String str) {
        this.h = str;
    }

    public String getTelemetryItemId() {
        return this.i;
    }

    public void setTelemetryItemId(String str) {
        this.i = str;
    }

    public String getApplicationType() {
        return this.j;
    }

    public void setApplicationType(String str) {
        this.j = str;
    }

    public String getRequestSource() {
        return this.k;
    }

    public void setRequestSource(String str) {
        this.k = str;
    }

    public String getFlowType() {
        return this.l;
    }

    public void setFlowType(String str) {
        this.l = str;
    }

    public String getIsAudit() {
        return this.m;
    }

    public void setIsAudit(String str) {
        this.m = str;
    }

    public String getTrackingSourceId() {
        return this.n;
    }

    public void setTrackingSourceId(String str) {
        this.n = str;
    }

    public String getTrackingType() {
        return this.o;
    }

    public void setTrackingType(String str) {
        this.o = str;
    }

    public void addToHashMap(Map<String, String> map) {
        if (this.a != null) {
            map.put("ai.internal.sdkVersion", this.a);
        }
        if (this.b != null) {
            map.put("ai.internal.agentVersion", this.b);
        }
        if (this.c != null) {
            map.put("ai.internal.dataCollectorReceivedTime", this.c);
        }
        if (this.d != null) {
            map.put("ai.internal.profileId", this.d);
        }
        if (this.e != null) {
            map.put("ai.internal.profileClassId", this.e);
        }
        if (this.f != null) {
            map.put("ai.internal.accountId", this.f);
        }
        if (this.g != null) {
            map.put("ai.internal.applicationName", this.g);
        }
        if (this.h != null) {
            map.put("ai.internal.instrumentationKey", this.h);
        }
        if (this.i != null) {
            map.put("ai.internal.telemetryItemId", this.i);
        }
        if (this.j != null) {
            map.put("ai.internal.applicationType", this.j);
        }
        if (this.k != null) {
            map.put("ai.internal.requestSource", this.k);
        }
        if (this.l != null) {
            map.put("ai.internal.flowType", this.l);
        }
        if (this.m != null) {
            map.put("ai.internal.isAudit", this.m);
        }
        if (this.n != null) {
            map.put("ai.internal.trackingSourceId", this.n);
        }
        if (this.o != null) {
            map.put("ai.internal.trackingType", this.o);
        }
    }

    @Override // net.hockeyapp.android.metrics.model.IJsonSerializable
    public void serialize(Writer writer) {
        if (writer == null) {
            throw new IllegalArgumentException("writer");
        }
        writer.write(123);
        serializeContent(writer);
        writer.write(125);
    }

    protected String serializeContent(Writer writer) {
        String str = "";
        if (this.a != null) {
            writer.write("\"ai.internal.sdkVersion\":");
            writer.write(JsonHelper.convert(this.a));
            str = ",";
        }
        if (this.b != null) {
            writer.write(str + "\"ai.internal.agentVersion\":");
            writer.write(JsonHelper.convert(this.b));
            str = ",";
        }
        if (this.c != null) {
            writer.write(str + "\"ai.internal.dataCollectorReceivedTime\":");
            writer.write(JsonHelper.convert(this.c));
            str = ",";
        }
        if (this.d != null) {
            writer.write(str + "\"ai.internal.profileId\":");
            writer.write(JsonHelper.convert(this.d));
            str = ",";
        }
        if (this.e != null) {
            writer.write(str + "\"ai.internal.profileClassId\":");
            writer.write(JsonHelper.convert(this.e));
            str = ",";
        }
        if (this.f != null) {
            writer.write(str + "\"ai.internal.accountId\":");
            writer.write(JsonHelper.convert(this.f));
            str = ",";
        }
        if (this.g != null) {
            writer.write(str + "\"ai.internal.applicationName\":");
            writer.write(JsonHelper.convert(this.g));
            str = ",";
        }
        if (this.h != null) {
            writer.write(str + "\"ai.internal.instrumentationKey\":");
            writer.write(JsonHelper.convert(this.h));
            str = ",";
        }
        if (this.i != null) {
            writer.write(str + "\"ai.internal.telemetryItemId\":");
            writer.write(JsonHelper.convert(this.i));
            str = ",";
        }
        if (this.j != null) {
            writer.write(str + "\"ai.internal.applicationType\":");
            writer.write(JsonHelper.convert(this.j));
            str = ",";
        }
        if (this.k != null) {
            writer.write(str + "\"ai.internal.requestSource\":");
            writer.write(JsonHelper.convert(this.k));
            str = ",";
        }
        if (this.l != null) {
            writer.write(str + "\"ai.internal.flowType\":");
            writer.write(JsonHelper.convert(this.l));
            str = ",";
        }
        if (this.m != null) {
            writer.write(str + "\"ai.internal.isAudit\":");
            writer.write(JsonHelper.convert(this.m));
            str = ",";
        }
        if (this.n != null) {
            writer.write(str + "\"ai.internal.trackingSourceId\":");
            writer.write(JsonHelper.convert(this.n));
            str = ",";
        }
        if (this.o != null) {
            writer.write(str + "\"ai.internal.trackingType\":");
            writer.write(JsonHelper.convert(this.o));
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
