package net.hockeyapp.android.metrics.model;

import java.io.Writer;
import java.util.LinkedHashMap;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Base implements IJsonSerializable {
    public LinkedHashMap<String, String> Attributes;
    public String QualifiedName;
    private String a;

    public Base() {
        InitializeFields();
        this.Attributes = new LinkedHashMap<>();
    }

    public String getBaseType() {
        return this.a;
    }

    public void setBaseType(String str) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public String serializeContent(Writer writer) {
        if (this.a != null) {
            writer.write("\"baseType\":");
            writer.write(JsonHelper.convert(this.a));
            return ",";
        }
        return "";
    }

    protected void InitializeFields() {
    }
}
