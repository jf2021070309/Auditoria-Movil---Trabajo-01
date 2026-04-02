package net.hockeyapp.android.metrics.model;

import java.io.Serializable;
import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Session implements Serializable, IJsonSerializable {
    private String a;
    private String b;
    private String c;

    public Session() {
        InitializeFields();
    }

    public String getId() {
        return this.a;
    }

    public void setId(String str) {
        this.a = str;
    }

    public String getIsFirst() {
        return this.b;
    }

    public void setIsFirst(String str) {
        this.b = str;
    }

    public String getIsNew() {
        return this.c;
    }

    public void setIsNew(String str) {
        this.c = str;
    }

    public void addToHashMap(Map<String, String> map) {
        if (this.a != null) {
            map.put("ai.session.id", this.a);
        }
        if (this.b != null) {
            map.put("ai.session.isFirst", this.b);
        }
        if (this.c != null) {
            map.put("ai.session.isNew", this.c);
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
            writer.write("\"ai.session.id\":");
            writer.write(JsonHelper.convert(this.a));
            str = ",";
        }
        if (this.b != null) {
            writer.write(str + "\"ai.session.isFirst\":");
            writer.write(JsonHelper.convert(this.b));
            str = ",";
        }
        if (this.c != null) {
            writer.write(str + "\"ai.session.isNew\":");
            writer.write(JsonHelper.convert(this.c));
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
