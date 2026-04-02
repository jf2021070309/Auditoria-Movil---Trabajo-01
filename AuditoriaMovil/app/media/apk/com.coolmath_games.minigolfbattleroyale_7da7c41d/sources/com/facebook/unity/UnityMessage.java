package com.facebook.unity;

import android.util.Log;
import com.facebook.internal.AnalyticsEvents;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class UnityMessage {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String methodName;
    private Map<String, Serializable> params = new HashMap();

    public UnityMessage(String str) {
        this.methodName = str;
    }

    public UnityMessage put(String str, Serializable serializable) {
        this.params.put(str, serializable);
        return this;
    }

    public UnityMessage putCancelled() {
        put(AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, true);
        return this;
    }

    public UnityMessage putID(String str) {
        put("id", str);
        return this;
    }

    public void sendError(String str) {
        put("error", str);
        send();
    }

    public void send() {
        String unityParams = new UnityParams(this.params).toString();
        String str = FB.TAG;
        Log.v(str, "sending to Unity " + this.methodName + "(" + unityParams + ")");
        try {
            UnityReflection.SendMessage("UnityFacebookSDKPlugin", this.methodName, unityParams);
        } catch (UnsatisfiedLinkError unused) {
            Log.v(FB.TAG, "message not send, Unity not initialized");
        }
    }

    public static UnityMessage createWithCallbackFromParams(String str, UnityParams unityParams) {
        UnityMessage unityMessage = new UnityMessage(str);
        if (unityParams.hasString(Constants.CALLBACK_ID_KEY).booleanValue()) {
            unityMessage.put(Constants.CALLBACK_ID_KEY, unityParams.getString(Constants.CALLBACK_ID_KEY));
        }
        return unityMessage;
    }
}
