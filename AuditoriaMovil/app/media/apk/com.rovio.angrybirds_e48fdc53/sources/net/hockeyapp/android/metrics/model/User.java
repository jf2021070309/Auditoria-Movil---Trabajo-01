package net.hockeyapp.android.metrics.model;

import java.io.Serializable;
import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class User implements Serializable, IJsonSerializable {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public User() {
        InitializeFields();
    }

    public String getAccountAcquisitionDate() {
        return this.a;
    }

    public void setAccountAcquisitionDate(String str) {
        this.a = str;
    }

    public String getAccountId() {
        return this.b;
    }

    public void setAccountId(String str) {
        this.b = str;
    }

    public String getUserAgent() {
        return this.c;
    }

    public void setUserAgent(String str) {
        this.c = str;
    }

    public String getId() {
        return this.d;
    }

    public void setId(String str) {
        this.d = str;
    }

    public String getStoreRegion() {
        return this.e;
    }

    public void setStoreRegion(String str) {
        this.e = str;
    }

    public String getAuthUserId() {
        return this.f;
    }

    public void setAuthUserId(String str) {
        this.f = str;
    }

    public String getAnonUserAcquisitionDate() {
        return this.g;
    }

    public void setAnonUserAcquisitionDate(String str) {
        this.g = str;
    }

    public String getAuthUserAcquisitionDate() {
        return this.h;
    }

    public void setAuthUserAcquisitionDate(String str) {
        this.h = str;
    }

    public void addToHashMap(Map<String, String> map) {
        if (this.a != null) {
            map.put("ai.user.accountAcquisitionDate", this.a);
        }
        if (this.b != null) {
            map.put("ai.user.accountId", this.b);
        }
        if (this.c != null) {
            map.put("ai.user.userAgent", this.c);
        }
        if (this.d != null) {
            map.put("ai.user.id", this.d);
        }
        if (this.e != null) {
            map.put("ai.user.storeRegion", this.e);
        }
        if (this.f != null) {
            map.put("ai.user.authUserId", this.f);
        }
        if (this.g != null) {
            map.put("ai.user.anonUserAcquisitionDate", this.g);
        }
        if (this.h != null) {
            map.put("ai.user.authUserAcquisitionDate", this.h);
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
            writer.write("\"ai.user.accountAcquisitionDate\":");
            writer.write(JsonHelper.convert(this.a));
            str = ",";
        }
        if (this.b != null) {
            writer.write(str + "\"ai.user.accountId\":");
            writer.write(JsonHelper.convert(this.b));
            str = ",";
        }
        if (this.c != null) {
            writer.write(str + "\"ai.user.userAgent\":");
            writer.write(JsonHelper.convert(this.c));
            str = ",";
        }
        if (this.d != null) {
            writer.write(str + "\"ai.user.id\":");
            writer.write(JsonHelper.convert(this.d));
            str = ",";
        }
        if (this.e != null) {
            writer.write(str + "\"ai.user.storeRegion\":");
            writer.write(JsonHelper.convert(this.e));
            str = ",";
        }
        if (this.f != null) {
            writer.write(str + "\"ai.user.authUserId\":");
            writer.write(JsonHelper.convert(this.f));
            str = ",";
        }
        if (this.g != null) {
            writer.write(str + "\"ai.user.anonUserAcquisitionDate\":");
            writer.write(JsonHelper.convert(this.g));
            str = ",";
        }
        if (this.h != null) {
            writer.write(str + "\"ai.user.authUserAcquisitionDate\":");
            writer.write(JsonHelper.convert(this.h));
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
