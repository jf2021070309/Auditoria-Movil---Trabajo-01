package com.adcolony.sdk;

import com.adcolony.sdk.av;
import com.facebook.share.internal.ShareConstants;
import java.util.Date;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class am extends av {
    static final ar a = new ar("adcolony_fatal_reports", "3.2.0", "Production");
    private JSONObject d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public am a(JSONObject jSONObject) {
        a aVar = new a();
        aVar.a(jSONObject);
        aVar.a(as.b(jSONObject, ShareConstants.WEB_DIALOG_PARAM_MESSAGE));
        try {
            aVar.a(new Date(Long.parseLong(as.b(jSONObject, "timestamp"))));
        } catch (NumberFormatException e) {
        }
        aVar.a(a);
        aVar.a(-1);
        return (am) aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSONObject a() {
        return this.d;
    }

    /* loaded from: classes2.dex */
    private class a extends av.a {
        a() {
            this.b = new am();
        }

        a a(JSONObject jSONObject) {
            ((am) this.b).d = jSONObject;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.adcolony.sdk.av.a
        public av.a a(Date date) {
            as.a(((am) this.b).d, "timestamp", av.b.format(date));
            return super.a(date);
        }
    }
}
