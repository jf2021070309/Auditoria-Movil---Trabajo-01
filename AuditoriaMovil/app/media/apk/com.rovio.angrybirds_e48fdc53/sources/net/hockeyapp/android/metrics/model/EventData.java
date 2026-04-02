package net.hockeyapp.android.metrics.model;

import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class EventData extends TelemetryData {
    private int a = 2;
    private String b;
    private Map<String, String> c;
    private Map<String, Double> d;

    public EventData() {
        InitializeFields();
        SetupAttributes();
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public String getEnvelopeName() {
        return "Microsoft.ApplicationInsights.Event";
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public String getBaseType() {
        return "EventData";
    }

    public int getVer() {
        return this.a;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public void setVer(int i) {
        this.a = i;
    }

    public String getName() {
        return this.b;
    }

    public void setName(String str) {
        this.b = str;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public Map<String, String> getProperties() {
        if (this.c == null) {
            this.c = new LinkedHashMap();
        }
        return this.c;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public void setProperties(Map<String, String> map) {
        this.c = map != null ? new LinkedHashMap(map) : null;
    }

    public Map<String, Double> getMeasurements() {
        if (this.d == null) {
            this.d = new LinkedHashMap();
        }
        return this.d;
    }

    public void setMeasurements(Map<String, Double> map) {
        this.d = map != null ? new LinkedHashMap(map) : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.hockeyapp.android.metrics.model.Domain
    public String serializeContent(Writer writer) {
        writer.write(super.serializeContent(writer) + "\"ver\":");
        writer.write(JsonHelper.convert(Integer.valueOf(this.a)));
        writer.write(",\"name\":");
        writer.write(JsonHelper.convert(this.b));
        String str = ",";
        if (this.c != null) {
            writer.write(",\"properties\":");
            JsonHelper.writeDictionary(writer, this.c);
            str = ",";
        }
        if (this.d != null) {
            writer.write(str + "\"measurements\":");
            JsonHelper.writeDictionary(writer, this.d);
            return ",";
        }
        return str;
    }

    public void SetupAttributes() {
    }

    @Override // net.hockeyapp.android.metrics.model.Domain
    protected void InitializeFields() {
        this.QualifiedName = "com.microsoft.applicationinsights.contracts.EventData";
    }
}
