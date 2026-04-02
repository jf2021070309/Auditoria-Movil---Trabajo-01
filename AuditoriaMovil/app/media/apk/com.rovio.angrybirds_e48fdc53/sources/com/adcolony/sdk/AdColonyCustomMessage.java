package com.adcolony.sdk;

import com.facebook.share.internal.ShareConstants;
import java.util.concurrent.RejectedExecutionException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyCustomMessage {
    String a;
    String b;

    public AdColonyCustomMessage(String str, String str2) {
        if (q.d(str) || q.d(str2)) {
            this.a = str;
            this.b = str2;
        }
    }

    public String getMessage() {
        return this.b;
    }

    public String getType() {
        return this.a;
    }

    public AdColonyCustomMessage set(String str, String str2) {
        this.a = str;
        this.b = str2;
        return this;
    }

    public void send() {
        try {
            AdColony.a.execute(new Runnable() { // from class: com.adcolony.sdk.AdColonyCustomMessage.1
                @Override // java.lang.Runnable
                public void run() {
                    AdColony.a();
                    JSONObject a = as.a();
                    as.a(a, "type", AdColonyCustomMessage.this.a);
                    as.a(a, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, AdColonyCustomMessage.this.b);
                    new d("CustomMessage.native_send", 1, a).a();
                }
            });
        } catch (RejectedExecutionException e) {
        }
    }
}
