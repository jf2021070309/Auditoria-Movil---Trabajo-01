package com.facebook.ads.internal.protocol;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class h {
    private final a a;
    private final Long b;
    private final String c;
    private final String d;

    /* loaded from: classes2.dex */
    private enum a {
        ID,
        CREATIVE,
        NONE
    }

    public h(Context context, String str, String str2, f fVar) {
        if (TextUtils.isEmpty(str)) {
            this.a = a.NONE;
            this.b = null;
            this.d = null;
            this.c = null;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            switch (a.valueOf(jSONObject.getString("type").toUpperCase())) {
                case ID:
                    this.a = a.ID;
                    this.b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.d = jSONObject.getString("device_id");
                    this.c = null;
                    break;
                case CREATIVE:
                    this.a = a.CREATIVE;
                    this.b = Long.valueOf(jSONObject.getString("bid_id"));
                    this.d = jSONObject.getString("device_id");
                    this.c = new JSONObject(jSONObject.getString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD)).toString();
                    break;
                default:
                    throw new b(AdErrorType.BID_PAYLOAD_ERROR, "Unsupported BidPayload type " + jSONObject.getString("type"));
            }
            if (!jSONObject.getString("sdk_version").equals("4.28.1")) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for SDK version %s being used on SDK version %s", this.b, jSONObject.getString("sdk_version"), "4.28.1"));
            }
            if (!jSONObject.getString("resolved_placement_id").equals(str2)) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for placement %s being used on placement %s", this.b, jSONObject.getString("resolved_placement_id"), str2));
            }
            if (jSONObject.getInt(MessengerShareContentUtility.ATTACHMENT_TEMPLATE_TYPE) != fVar.a()) {
                throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for template %s being used on template %s", this.b, Integer.valueOf(jSONObject.getInt(MessengerShareContentUtility.ATTACHMENT_TEMPLATE_TYPE)), fVar));
            }
        } catch (JSONException e) {
            com.facebook.ads.internal.q.d.a.a(e, context);
            throw new b(AdErrorType.BID_PAYLOAD_ERROR, "Invalid BidPayload", e);
        }
    }

    public void a(String str) {
        if (!this.d.equals(str)) {
            throw new b(AdErrorType.BID_IMPRESSION_MISMATCH, String.format("Bid %d for IDFA %s being used on IDFA %s", this.b, this.d, str));
        }
    }

    public boolean a() {
        return this.a == a.CREATIVE;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.a != a.NONE;
    }

    public String d() {
        if (this.b == null) {
            return null;
        }
        return this.b.toString();
    }
}
