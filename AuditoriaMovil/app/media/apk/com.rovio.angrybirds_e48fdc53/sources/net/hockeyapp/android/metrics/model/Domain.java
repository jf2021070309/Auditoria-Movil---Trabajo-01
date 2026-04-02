package net.hockeyapp.android.metrics.model;

import java.io.Writer;
import java.util.LinkedHashMap;
/* loaded from: classes4.dex */
public class Domain implements IJsonSerializable {
    public LinkedHashMap<String, String> Attributes = new LinkedHashMap<>();
    public String QualifiedName;

    public Domain() {
        InitializeFields();
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
        return "";
    }

    protected void InitializeFields() {
    }
}
