package net.hockeyapp.android.metrics.model;

import java.io.Serializable;
import java.io.Writer;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Device implements Serializable, IJsonSerializable {
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
    private String p;

    public Device() {
        InitializeFields();
    }

    public String getId() {
        return this.a;
    }

    public void setId(String str) {
        this.a = str;
    }

    public String getIp() {
        return this.b;
    }

    public void setIp(String str) {
        this.b = str;
    }

    public String getLanguage() {
        return this.c;
    }

    public void setLanguage(String str) {
        this.c = str;
    }

    public String getLocale() {
        return this.d;
    }

    public void setLocale(String str) {
        this.d = str;
    }

    public String getModel() {
        return this.e;
    }

    public void setModel(String str) {
        this.e = str;
    }

    public String getNetwork() {
        return this.f;
    }

    public void setNetwork(String str) {
        this.f = str;
    }

    public String getNetworkName() {
        return this.g;
    }

    public void setNetworkName(String str) {
        this.g = str;
    }

    public String getOemName() {
        return this.h;
    }

    public void setOemName(String str) {
        this.h = str;
    }

    public String getOs() {
        return this.i;
    }

    public void setOs(String str) {
        this.i = str;
    }

    public String getOsVersion() {
        return this.j;
    }

    public void setOsVersion(String str) {
        this.j = str;
    }

    public String getRoleInstance() {
        return this.k;
    }

    public void setRoleInstance(String str) {
        this.k = str;
    }

    public String getRoleName() {
        return this.l;
    }

    public void setRoleName(String str) {
        this.l = str;
    }

    public String getScreenResolution() {
        return this.m;
    }

    public void setScreenResolution(String str) {
        this.m = str;
    }

    public String getType() {
        return this.n;
    }

    public void setType(String str) {
        this.n = str;
    }

    public String getMachineName() {
        return this.o;
    }

    public void setMachineName(String str) {
        this.o = str;
    }

    public String getVmName() {
        return this.p;
    }

    public void setVmName(String str) {
        this.p = str;
    }

    public void addToHashMap(Map<String, String> map) {
        if (this.a != null) {
            map.put("ai.device.id", this.a);
        }
        if (this.b != null) {
            map.put("ai.device.ip", this.b);
        }
        if (this.c != null) {
            map.put("ai.device.language", this.c);
        }
        if (this.d != null) {
            map.put("ai.device.locale", this.d);
        }
        if (this.e != null) {
            map.put("ai.device.model", this.e);
        }
        if (this.f != null) {
            map.put("ai.device.network", this.f);
        }
        if (this.g != null) {
            map.put("ai.device.networkName", this.g);
        }
        if (this.h != null) {
            map.put("ai.device.oemName", this.h);
        }
        if (this.i != null) {
            map.put("ai.device.os", this.i);
        }
        if (this.j != null) {
            map.put("ai.device.osVersion", this.j);
        }
        if (this.k != null) {
            map.put("ai.device.roleInstance", this.k);
        }
        if (this.l != null) {
            map.put("ai.device.roleName", this.l);
        }
        if (this.m != null) {
            map.put("ai.device.screenResolution", this.m);
        }
        if (this.n != null) {
            map.put("ai.device.type", this.n);
        }
        if (this.o != null) {
            map.put("ai.device.machineName", this.o);
        }
        if (this.p != null) {
            map.put("ai.device.vmName", this.p);
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
            writer.write("\"ai.device.id\":");
            writer.write(JsonHelper.convert(this.a));
            str = ",";
        }
        if (this.b != null) {
            writer.write(str + "\"ai.device.ip\":");
            writer.write(JsonHelper.convert(this.b));
            str = ",";
        }
        if (this.c != null) {
            writer.write(str + "\"ai.device.language\":");
            writer.write(JsonHelper.convert(this.c));
            str = ",";
        }
        if (this.d != null) {
            writer.write(str + "\"ai.device.locale\":");
            writer.write(JsonHelper.convert(this.d));
            str = ",";
        }
        if (this.e != null) {
            writer.write(str + "\"ai.device.model\":");
            writer.write(JsonHelper.convert(this.e));
            str = ",";
        }
        if (this.f != null) {
            writer.write(str + "\"ai.device.network\":");
            writer.write(JsonHelper.convert(this.f));
            str = ",";
        }
        if (this.g != null) {
            writer.write(str + "\"ai.device.networkName\":");
            writer.write(JsonHelper.convert(this.g));
            str = ",";
        }
        if (this.h != null) {
            writer.write(str + "\"ai.device.oemName\":");
            writer.write(JsonHelper.convert(this.h));
            str = ",";
        }
        if (this.i != null) {
            writer.write(str + "\"ai.device.os\":");
            writer.write(JsonHelper.convert(this.i));
            str = ",";
        }
        if (this.j != null) {
            writer.write(str + "\"ai.device.osVersion\":");
            writer.write(JsonHelper.convert(this.j));
            str = ",";
        }
        if (this.k != null) {
            writer.write(str + "\"ai.device.roleInstance\":");
            writer.write(JsonHelper.convert(this.k));
            str = ",";
        }
        if (this.l != null) {
            writer.write(str + "\"ai.device.roleName\":");
            writer.write(JsonHelper.convert(this.l));
            str = ",";
        }
        if (this.m != null) {
            writer.write(str + "\"ai.device.screenResolution\":");
            writer.write(JsonHelper.convert(this.m));
            str = ",";
        }
        if (this.n != null) {
            writer.write(str + "\"ai.device.type\":");
            writer.write(JsonHelper.convert(this.n));
            str = ",";
        }
        if (this.o != null) {
            writer.write(str + "\"ai.device.machineName\":");
            writer.write(JsonHelper.convert(this.o));
            str = ",";
        }
        if (this.p != null) {
            writer.write(str + "\"ai.device.vmName\":");
            writer.write(JsonHelper.convert(this.p));
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
