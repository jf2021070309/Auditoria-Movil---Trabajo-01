package net.hockeyapp.android.metrics.model;

import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class SessionStateData extends TelemetryData {
    private int a = 2;
    private SessionState b = SessionState.START;

    public SessionStateData() {
        InitializeFields();
        SetupAttributes();
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public String getEnvelopeName() {
        return "Microsoft.ApplicationInsights.SessionState";
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public String getBaseType() {
        return "SessionStateData";
    }

    public int getVer() {
        return this.a;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public void setVer(int i) {
        this.a = i;
    }

    public SessionState getState() {
        return this.b;
    }

    public void setState(SessionState sessionState) {
        this.b = sessionState;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public Map<String, String> getProperties() {
        return null;
    }

    @Override // net.hockeyapp.android.metrics.ITelemetry
    public void setProperties(Map<String, String> map) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.hockeyapp.android.metrics.model.Domain
    public String serializeContent(Writer writer) {
        writer.write(super.serializeContent(writer) + "\"ver\":");
        writer.write(JsonHelper.convert(Integer.valueOf(this.a)));
        writer.write(",\"state\":");
        writer.write(JsonHelper.convert(Integer.valueOf(this.b.getValue())));
        return ",";
    }

    public void SetupAttributes() {
    }

    @Override // net.hockeyapp.android.metrics.model.Domain
    protected void InitializeFields() {
        this.QualifiedName = "com.microsoft.applicationinsights.contracts.SessionStateData";
    }
}
