package net.hockeyapp.android.metrics.model;

import java.io.Serializable;
import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Application implements Serializable, IJsonSerializable {
    private String a;
    private String b;
    private String c;

    public Application() {
        InitializeFields();
    }

    public String getVer() {
        return this.a;
    }

    public void setVer(String str) {
        this.a = str;
    }

    public String getBuild() {
        return this.b;
    }

    public void setBuild(String str) {
        this.b = str;
    }

    public String getTypeId() {
        return this.c;
    }

    public void setTypeId(String str) {
        this.c = str;
    }

    public void addToHashMap(Map<String, String> map) {
        if (this.a != null) {
            map.put("ai.application.ver", this.a);
        }
        if (this.b != null) {
            map.put("ai.application.build", this.b);
        }
        if (this.c != null) {
            map.put("ai.application.typeId", this.c);
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
            writer.write("\"ai.application.ver\":");
            writer.write(JsonHelper.convert(this.a));
            str = ",";
        }
        if (this.b != null) {
            writer.write(str + "\"ai.application.build\":");
            writer.write(JsonHelper.convert(this.b));
            str = ",";
        }
        if (this.c != null) {
            writer.write(str + "\"ai.application.typeId\":");
            writer.write(JsonHelper.convert(this.c));
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
