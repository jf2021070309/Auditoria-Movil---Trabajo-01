package com.ss.android.download.api.model;

import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o {
    private final String bn;
    private final String cu;
    private String dr;
    private final boolean g;
    private final String ge;
    private final String il;
    private final JSONObject ll;
    private final String o;
    private final long q;
    private final long rb;
    private final int t;
    private final boolean v;
    private final List<String> wb;
    private final JSONObject x;
    private final JSONObject xu;
    private final Object yk;

    o(dr drVar) {
        this.dr = drVar.dr;
        this.ge = drVar.ge;
        this.o = drVar.o;
        this.g = drVar.g;
        this.q = drVar.q;
        this.bn = drVar.bn;
        this.rb = drVar.rb;
        this.xu = drVar.xu;
        this.ll = drVar.ll;
        this.wb = drVar.t;
        this.t = drVar.yk;
        this.yk = drVar.cu;
        this.v = drVar.il;
        this.il = drVar.x;
        this.x = drVar.lp;
        this.cu = drVar.v;
    }

    /* loaded from: classes3.dex */
    public static class dr {
        private String bn;
        private Object cu;
        private String dr;
        private String ge;
        private JSONObject ll;
        private JSONObject lp;
        private String o;
        private long q;
        private long rb;
        private List<String> t;
        private String v;
        private Map<String, Object> wb;
        private String x;
        private JSONObject xu;
        private int yk;
        private boolean g = false;
        private boolean il = false;

        public dr dr(boolean z) {
            this.il = z;
            return this;
        }

        public dr dr(String str) {
            this.ge = str;
            return this;
        }

        public dr ge(String str) {
            this.o = str;
            return this;
        }

        public dr dr(long j) {
            this.q = j;
            return this;
        }

        public dr ge(long j) {
            this.rb = j;
            return this;
        }

        public dr o(String str) {
            this.bn = str;
            return this;
        }

        public dr ge(boolean z) {
            this.g = z;
            return this;
        }

        public dr dr(JSONObject jSONObject) {
            this.xu = jSONObject;
            return this;
        }

        public dr ge(JSONObject jSONObject) {
            this.ll = jSONObject;
            return this;
        }

        public dr dr(List<String> list) {
            this.t = list;
            return this;
        }

        public dr dr(int i) {
            this.yk = i;
            return this;
        }

        public dr dr(Object obj) {
            this.cu = obj;
            return this;
        }

        public dr g(String str) {
            this.v = str;
            return this;
        }

        public o dr() {
            if (TextUtils.isEmpty(this.dr)) {
                this.dr = BaseConstants.CATEGORY_UMENG;
            }
            JSONObject jSONObject = new JSONObject();
            if (this.xu == null) {
                this.xu = new JSONObject();
            }
            try {
                Map<String, Object> map = this.wb;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : this.wb.entrySet()) {
                        if (!this.xu.has(entry.getKey())) {
                            this.xu.putOpt(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (this.il) {
                    this.x = this.o;
                    JSONObject jSONObject2 = new JSONObject();
                    this.lp = jSONObject2;
                    if (this.g) {
                        jSONObject2.put(BaseConstants.EVENT_LABEL_AD_EXTRA_DATA, this.xu.toString());
                    } else {
                        Iterator<String> keys = this.xu.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            this.lp.put(next, this.xu.get(next));
                        }
                    }
                    this.lp.put("category", this.dr);
                    this.lp.put("tag", this.ge);
                    this.lp.put("value", this.q);
                    this.lp.put("ext_value", this.rb);
                    if (!TextUtils.isEmpty(this.v)) {
                        this.lp.put("refer", this.v);
                    }
                    JSONObject jSONObject3 = this.ll;
                    if (jSONObject3 != null) {
                        this.lp = com.ss.android.download.api.o.ge.dr(jSONObject3, this.lp);
                    }
                    if (this.g) {
                        if (!this.lp.has("log_extra") && !TextUtils.isEmpty(this.bn)) {
                            this.lp.put("log_extra", this.bn);
                        }
                        this.lp.put(BaseConstants.EVENT_LABEL_IS_AD_EVENT, "1");
                    }
                }
                if (this.g) {
                    jSONObject.put(BaseConstants.EVENT_LABEL_AD_EXTRA_DATA, this.xu.toString());
                    if (!jSONObject.has("log_extra") && !TextUtils.isEmpty(this.bn)) {
                        jSONObject.put("log_extra", this.bn);
                    }
                    jSONObject.put(BaseConstants.EVENT_LABEL_IS_AD_EVENT, "1");
                } else {
                    jSONObject.put("extra", this.xu);
                }
                if (!TextUtils.isEmpty(this.v)) {
                    jSONObject.putOpt("refer", this.v);
                }
                JSONObject jSONObject4 = this.ll;
                if (jSONObject4 != null) {
                    jSONObject = com.ss.android.download.api.o.ge.dr(jSONObject4, jSONObject);
                }
                this.xu = jSONObject;
            } catch (Exception e) {
                wb.i().dr(e, "DownloadEventModel build");
            }
            return new o(this);
        }
    }

    public String dr() {
        return this.dr;
    }

    public String ge() {
        return this.ge;
    }

    public String o() {
        return this.o;
    }

    public boolean g() {
        return this.g;
    }

    public long q() {
        return this.q;
    }

    public String bn() {
        return this.bn;
    }

    public long rb() {
        return this.rb;
    }

    public JSONObject xu() {
        return this.xu;
    }

    public JSONObject ll() {
        return this.ll;
    }

    public List<String> wb() {
        return this.wb;
    }

    public int t() {
        return this.t;
    }

    public Object yk() {
        return this.yk;
    }

    public boolean cu() {
        return this.v;
    }

    public String v() {
        return this.il;
    }

    public JSONObject il() {
        return this.x;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("category: ");
        sb.append(this.dr);
        sb.append("\ttag: ");
        sb.append(this.ge);
        sb.append("\tlabel: ");
        sb.append(this.o);
        sb.append("\nisAd: ");
        sb.append(this.g);
        sb.append("\tadId: ");
        sb.append(this.q);
        sb.append("\tlogExtra: ");
        sb.append(this.bn);
        sb.append("\textValue: ");
        sb.append(this.rb);
        sb.append("\nextJson: ");
        sb.append(this.xu);
        sb.append("\nparamsJson: ");
        sb.append(this.ll);
        sb.append("\nclickTrackUrl: ");
        List<String> list = this.wb;
        sb.append(list != null ? list.toString() : "");
        sb.append("\teventSource: ");
        sb.append(this.t);
        sb.append("\textraObject: ");
        Object obj = this.yk;
        sb.append(obj != null ? obj.toString() : "");
        sb.append("\nisV3: ");
        sb.append(this.v);
        sb.append("\tV3EventName: ");
        sb.append(this.il);
        sb.append("\tV3EventParams: ");
        JSONObject jSONObject = this.x;
        sb.append(jSONObject != null ? jSONObject.toString() : "");
        return sb.toString();
    }
}
