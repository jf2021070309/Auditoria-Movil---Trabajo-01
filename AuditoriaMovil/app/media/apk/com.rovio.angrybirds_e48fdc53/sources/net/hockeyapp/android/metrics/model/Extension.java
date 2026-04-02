package net.hockeyapp.android.metrics.model;

import java.io.Writer;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Extension implements IJsonSerializable {
    private String a = "1.0";

    public Extension() {
        InitializeFields();
    }

    public String getVer() {
        return this.a;
    }

    public void setVer(String str) {
        this.a = str;
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
        if (this.a != null) {
            writer.write("\"ver\":");
            writer.write(JsonHelper.convert(this.a));
            return ",";
        }
        return "";
    }

    protected void InitializeFields() {
    }
}
