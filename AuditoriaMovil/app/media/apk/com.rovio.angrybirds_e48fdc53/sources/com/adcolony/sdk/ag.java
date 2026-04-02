package com.adcolony.sdk;

import com.facebook.share.internal.ShareConstants;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ag implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ag() {
        a.a("CustomMessage.controller_send", this);
    }

    @Override // com.adcolony.sdk.f
    public void a(d dVar) {
        JSONObject b = dVar.b();
        final String b2 = as.b(b, "type");
        final String b3 = as.b(b, ShareConstants.WEB_DIALOG_PARAM_MESSAGE);
        q.a(new Runnable() { // from class: com.adcolony.sdk.ag.1
            @Override // java.lang.Runnable
            public void run() {
                au.d.b("Received custom message " + b3 + " of type " + b2);
                try {
                    AdColonyCustomMessageListener adColonyCustomMessageListener = a.a().w().get(b2);
                    if (adColonyCustomMessageListener != null) {
                        adColonyCustomMessageListener.onAdColonyCustomMessage(new AdColonyCustomMessage(b2, b3));
                    }
                } catch (RuntimeException e) {
                }
            }
        });
    }
}
