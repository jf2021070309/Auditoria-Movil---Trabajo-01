package com.kwad.sdk.core.report;

import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class p {
    public SubBusinessType ars;
    public com.kwai.adclient.kscommerciallogger.model.d art;
    public BusinessType biz;
    public String category;
    public String eventId;
    public JSONObject msg;
    public String suffixRatio;
    public String tag;

    /* loaded from: classes.dex */
    public static class a {
        private String category;
        private String eventId;
        private JSONObject msg;
        private String tag;
        private BusinessType biz = BusinessType.OTHER;
        private SubBusinessType subBiz = SubBusinessType.OTHER;
        private com.kwai.adclient.kscommerciallogger.model.d art = com.kwai.adclient.kscommerciallogger.model.d.aNO;
        private String suffixRatio = "";

        public final a C(JSONObject jSONObject) {
            this.msg = jSONObject;
            return this;
        }

        public final p Cc() {
            return new p(this.category, this.biz, this.subBiz, this.art, this.eventId, this.tag, this.suffixRatio, this.msg, (byte) 0);
        }

        public final a a(SubBusinessType subBusinessType) {
            this.subBiz = subBusinessType;
            return this;
        }

        public final a a(com.kwai.adclient.kscommerciallogger.model.d dVar) {
            this.art = dVar;
            return this;
        }

        public final a b(BusinessType businessType) {
            this.biz = businessType;
            return this;
        }

        public final a dA(String str) {
            this.eventId = str;
            return this;
        }

        public final a dB(String str) {
            this.tag = str;
            return this;
        }

        public final a dz(String str) {
            this.category = str;
            return this;
        }
    }

    private p(String str, BusinessType businessType, SubBusinessType subBusinessType, com.kwai.adclient.kscommerciallogger.model.d dVar, String str2, String str3, String str4, JSONObject jSONObject) {
        this.biz = BusinessType.OTHER;
        this.ars = SubBusinessType.OTHER;
        this.art = com.kwai.adclient.kscommerciallogger.model.d.aNO;
        this.category = str;
        this.biz = businessType;
        this.ars = subBusinessType;
        this.art = dVar;
        this.eventId = str2;
        this.tag = str3;
        this.suffixRatio = str4;
        this.msg = jSONObject;
    }

    /* synthetic */ p(String str, BusinessType businessType, SubBusinessType subBusinessType, com.kwai.adclient.kscommerciallogger.model.d dVar, String str2, String str3, String str4, JSONObject jSONObject, byte b) {
        this(str, businessType, subBusinessType, dVar, str2, str3, str4, jSONObject);
    }
}
