package com.kwai.adclient.kscommerciallogger.model;

import android.text.TextUtils;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class c {
    private final d art;
    private final BusinessType biz;
    private final String category;
    private final String eventId;
    private final JSONObject extraParam;
    private final JSONObject msg;
    private final SubBusinessType subBiz;
    private final String tag;

    /* loaded from: classes3.dex */
    public static class a {
        private BusinessType aNK;
        private SubBusinessType aNL;
        private d aNM;
        private JSONObject aNN;
        private final String mCategory;
        private String mEventId;
        private String mTag;
        private JSONObject msg;

        private a(String str) {
            this.mCategory = str;
        }

        public static a Le() {
            return new a(ILoggerReporter.Category.ERROR_LOG);
        }

        public static a Lf() {
            return new a(ILoggerReporter.Category.APM_LOG);
        }

        public final c Lg() {
            if (com.kwai.adclient.kscommerciallogger.a.KU().isDebug()) {
                if (TextUtils.isEmpty(this.mCategory) || TextUtils.isEmpty(this.mTag) || TextUtils.isEmpty(this.mEventId)) {
                    throw new IllegalArgumentException("param is error, please check it");
                }
                if (com.kwai.adclient.kscommerciallogger.a.KU().KW() && !com.kwai.adclient.kscommerciallogger.b.fZ(this.mEventId)) {
                    throw new IllegalArgumentException("event_id format error, please check it");
                }
            } else if (TextUtils.isEmpty(this.mCategory) || TextUtils.isEmpty(this.mTag) || TextUtils.isEmpty(this.mEventId)) {
                return null;
            } else {
                if (com.kwai.adclient.kscommerciallogger.a.KU().KW() && !com.kwai.adclient.kscommerciallogger.b.fZ(this.mEventId)) {
                    return null;
                }
            }
            if (com.kwai.adclient.kscommerciallogger.a.KU().KV() != null) {
                this.aNN = com.kwai.adclient.kscommerciallogger.a.KU().KV();
            }
            return new c(this, (byte) 0);
        }

        public final a R(JSONObject jSONObject) {
            this.msg = jSONObject;
            return this;
        }

        public final a b(SubBusinessType subBusinessType) {
            this.aNL = subBusinessType;
            return this;
        }

        public final a b(d dVar) {
            this.aNM = dVar;
            return this;
        }

        public final a c(BusinessType businessType) {
            this.aNK = businessType;
            return this;
        }

        public final a ga(String str) {
            this.mTag = str;
            return this;
        }

        public final a gb(String str) {
            this.mEventId = str;
            return this;
        }
    }

    private c(a aVar) {
        this.category = aVar.mCategory;
        this.biz = aVar.aNK;
        this.subBiz = aVar.aNL;
        this.tag = aVar.mTag;
        this.art = aVar.aNM;
        this.extraParam = aVar.aNN;
        this.eventId = aVar.mEventId;
        this.msg = aVar.msg == null ? new JSONObject() : aVar.msg;
    }

    /* synthetic */ c(a aVar, byte b) {
        this(aVar);
    }

    public final String KX() {
        return this.category;
    }

    public final BusinessType KY() {
        return this.biz;
    }

    public final SubBusinessType KZ() {
        return this.subBiz;
    }

    public final d La() {
        return this.art;
    }

    public final JSONObject Lb() {
        return this.msg;
    }

    public final JSONObject Lc() {
        return this.extraParam;
    }

    public final String Ld() {
        return this.eventId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            BusinessType businessType = this.biz;
            if (businessType != null) {
                jSONObject.put("biz", businessType.value);
            }
            SubBusinessType subBusinessType = this.subBiz;
            if (subBusinessType != null) {
                jSONObject.put("sub_biz", subBusinessType.value);
            }
            jSONObject.put("tag", this.tag);
            d dVar = this.art;
            if (dVar != null) {
                jSONObject.put("type", dVar.getValue());
            }
            JSONObject jSONObject2 = this.msg;
            if (jSONObject2 != null) {
                jSONObject.put("msg", jSONObject2);
            }
            JSONObject jSONObject3 = this.extraParam;
            if (jSONObject3 != null) {
                jSONObject.put("extra_param", jSONObject3);
            }
            jSONObject.put("event_id", this.eventId);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
