package com.kwad.sdk.core.scene;

import android.text.TextUtils;
import com.facebook.internal.NativeProtocol;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.response.a.a;
import com.kwad.sdk.utils.u;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class URLPackage extends a implements Serializable {
    public static final String KEY_AUTHOR_ID = "authorId";
    public static final String KEY_CHANNEL_ID = "channelId";
    public static final String KEY_TUBE_ID = "tubeId";
    private static final long serialVersionUID = -7365796297335816787L;
    public String identity;
    public transient JSONObject mJsonObjectParams;
    public int page;

    public URLPackage() {
    }

    public URLPackage(String str, int i) {
        this.page = i;
        this.identity = str;
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterParseJson(JSONObject jSONObject) {
        super.afterParseJson(jSONObject);
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString(NativeProtocol.WEB_DIALOG_PARAMS);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        try {
            this.mJsonObjectParams = new JSONObject(optString);
        } catch (JSONException e) {
            c.printStackTrace(e);
        }
    }

    @Override // com.kwad.sdk.core.response.a.a
    public void afterToJson(JSONObject jSONObject) {
        super.afterToJson(jSONObject);
        JSONObject jSONObject2 = this.mJsonObjectParams;
        if (jSONObject2 != null) {
            u.putValue(jSONObject, NativeProtocol.WEB_DIALOG_PARAMS, jSONObject2.toString());
        }
    }

    public void putParams(String str, long j) {
        if (this.mJsonObjectParams == null) {
            this.mJsonObjectParams = new JSONObject();
        }
        u.putValue(this.mJsonObjectParams, str, j);
    }
}
