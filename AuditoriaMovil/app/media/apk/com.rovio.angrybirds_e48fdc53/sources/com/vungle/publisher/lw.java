package com.vungle.publisher;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.vungle.publisher.ji;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.json.JSONException;
import org.json.JSONObject;
@Singleton
/* loaded from: classes4.dex */
public class lw extends WebChromeClient {
    @Inject
    qg a;

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        Logger.v(Logger.AD_TAG, "js prompt: " + str2);
        boolean startsWith = str2.startsWith("vungle:");
        if (startsWith) {
            String str4 = null;
            try {
                str4 = str2.substring("vungle:".length());
                JSONObject jSONObject = new JSONObject(str4);
                String string = jSONObject.getString("method");
                jSONObject.getString(NativeProtocol.WEB_DIALOG_PARAMS);
                a(string);
            } catch (IndexOutOfBoundsException e) {
                Logger.w(Logger.AD_TAG, "no javascript method call");
            } catch (JSONException e2) {
                Logger.w(Logger.AD_TAG, "invalid json " + str4, e2);
            } catch (Exception e3) {
                Logger.e(Logger.AD_TAG, e3);
            }
            jsPromptResult.cancel();
        }
        return startsWith;
    }

    boolean a(String str) {
        if ("close".equalsIgnoreCase(str)) {
            this.a.a(new ao());
            return true;
        } else if ("download".equalsIgnoreCase(str)) {
            this.a.a(new aa(ji.a.postroll_click));
            return true;
        } else if (ShareConstants.WEB_DIALOG_PARAM_PRIVACY.equalsIgnoreCase(str)) {
            this.a.a(new aq());
            return true;
        } else {
            Logger.w(Logger.AD_TAG, "unknown javascript method: " + str);
            return false;
        }
    }
}
