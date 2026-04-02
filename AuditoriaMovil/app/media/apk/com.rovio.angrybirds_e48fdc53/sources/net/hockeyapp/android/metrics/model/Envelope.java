package net.hockeyapp.android.metrics.model;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map;
import net.hockeyapp.android.metrics.JsonHelper;
/* loaded from: classes4.dex */
public class Envelope implements IJsonSerializable {
    private String b;
    private String c;
    private String e;
    private long f;
    private String g;
    private long h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private Map<String, String> n;
    private Map<String, Extension> o;
    private Base p;
    private int a = 1;
    private int d = 100;

    public Envelope() {
        InitializeFields();
    }

    public int getVer() {
        return this.a;
    }

    public void setVer(int i) {
        this.a = i;
    }

    public String getName() {
        return this.b;
    }

    public void setName(String str) {
        this.b = str;
    }

    public String getTime() {
        return this.c;
    }

    public void setTime(String str) {
        this.c = str;
    }

    public int getSampleRate() {
        return this.d;
    }

    public void setSampleRate(int i) {
        this.d = i;
    }

    public String getEpoch() {
        return this.e;
    }

    public void setEpoch(String str) {
        this.e = str;
    }

    public long getSeqNum() {
        return this.f;
    }

    public void setSeqNum(long j) {
        this.f = j;
    }

    public String getIKey() {
        return this.g;
    }

    public void setIKey(String str) {
        this.g = str;
    }

    public long getFlags() {
        return this.h;
    }

    public void setFlags(long j) {
        this.h = j;
    }

    public String getOs() {
        return this.i;
    }

    public void setOs(String str) {
        this.i = str;
    }

    public String getOsVer() {
        return this.j;
    }

    public void setOsVer(String str) {
        this.j = str;
    }

    public String getAppId() {
        return this.k;
    }

    public void setAppId(String str) {
        this.k = str;
    }

    public String getAppVer() {
        return this.l;
    }

    public void setAppVer(String str) {
        this.l = str;
    }

    public String getCV() {
        return this.m;
    }

    public void setCV(String str) {
        this.m = str;
    }

    public Map<String, String> getTags() {
        if (this.n == null) {
            this.n = new LinkedHashMap();
        }
        return this.n;
    }

    public void setTags(Map<String, String> map) {
        this.n = map;
    }

    public Map<String, Extension> getExt() {
        if (this.o == null) {
            this.o = new LinkedHashMap();
        }
        return this.o;
    }

    public void setExt(Map<String, Extension> map) {
        this.o = map;
    }

    public Base getData() {
        return this.p;
    }

    public void setData(Base base) {
        this.p = base;
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
        writer.write("\"ver\":");
        writer.write(JsonHelper.convert(Integer.valueOf(this.a)));
        writer.write(",\"name\":");
        writer.write(JsonHelper.convert(this.b));
        writer.write(",\"time\":");
        writer.write(JsonHelper.convert(this.c));
        String str = ",";
        if (this.d > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            writer.write(",\"sampleRate\":");
            writer.write(JsonHelper.convert(Integer.valueOf(this.d)));
            str = ",";
        }
        if (this.e != null) {
            writer.write(str + "\"epoch\":");
            writer.write(JsonHelper.convert(this.e));
            str = ",";
        }
        if (this.f != 0) {
            writer.write(str + "\"seqNum\":");
            writer.write(JsonHelper.convert(Long.valueOf(this.f)));
            str = ",";
        }
        if (this.g != null) {
            writer.write(str + "\"iKey\":");
            writer.write(JsonHelper.convert(this.g));
            str = ",";
        }
        if (this.h != 0) {
            writer.write(str + "\"flags\":");
            writer.write(JsonHelper.convert(Long.valueOf(this.h)));
            str = ",";
        }
        if (this.i != null) {
            writer.write(str + "\"os\":");
            writer.write(JsonHelper.convert(this.i));
            str = ",";
        }
        if (this.j != null) {
            writer.write(str + "\"osVer\":");
            writer.write(JsonHelper.convert(this.j));
            str = ",";
        }
        if (this.k != null) {
            writer.write(str + "\"appId\":");
            writer.write(JsonHelper.convert(this.k));
            str = ",";
        }
        if (this.l != null) {
            writer.write(str + "\"appVer\":");
            writer.write(JsonHelper.convert(this.l));
            str = ",";
        }
        if (this.m != null) {
            writer.write(str + "\"cV\":");
            writer.write(JsonHelper.convert(this.m));
            str = ",";
        }
        if (this.n != null) {
            writer.write(str + "\"tags\":");
            JsonHelper.writeDictionary(writer, this.n);
            str = ",";
        }
        if (this.o != null) {
            writer.write(str + "\"ext\":");
            JsonHelper.writeDictionary(writer, this.o);
            str = ",";
        }
        if (this.p != null) {
            writer.write(str + "\"data\":");
            JsonHelper.writeJsonSerializable(writer, this.p);
            return ",";
        }
        return str;
    }

    protected void InitializeFields() {
    }
}
