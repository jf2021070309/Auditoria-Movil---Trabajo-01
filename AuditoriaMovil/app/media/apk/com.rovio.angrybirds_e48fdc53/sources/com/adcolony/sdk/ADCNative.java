package com.adcolony.sdk;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ADCNative {
    static ADCNative lock = new ADCNative();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void EventTracker__logEvent(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeCreateSceneController(int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeCreateTexture(int i, int i2, int i3, String str, ByteBuffer byteBuffer, int i4, int i5, int i6, int i7);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeDeleteSceneController(int i, int i2);

    static native void nativeHelloWorld();

    static native boolean nativeIsArm();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native boolean nativeNeonSupported();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native void nativeRender(int i, int i2, int i3, int i4);

    ADCNative() {
    }

    static void Logger__logNative(String[] strArr) {
        a.b(strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void EventTracker__logEvent(final JSONObject jSONObject) {
        final ADCVMModule aDCVMModule = (ADCVMModule) com.adcolony.sdk.a.a().n().e().get(1);
        if (aDCVMModule == null || af.z().equals("")) {
            AdColonyEventTracker.a(jSONObject);
            return;
        }
        ExecutorService e = aDCVMModule.e();
        if (e != null) {
            e.submit(new Runnable() { // from class: com.adcolony.sdk.ADCNative.1
                @Override // java.lang.Runnable
                public void run() {
                    long d = ADCVMModule.this.d();
                    ADCNative.a(jSONObject);
                    ADCNative.EventTracker__logEvent(d, ("ADC3__EventTracker__logEvent(" + jSONObject.toString() + ")").getBytes(Charset.forName("UTF-8")));
                }
            });
        } else {
            au.g.b("ExecutorService is null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(JSONObject jSONObject) {
        JSONObject f = as.f(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
        if (ADCVMModule.a) {
            as.a(f, "api_key", "bb2cf0647ba654d7228dd3f9405bbc6a");
        } else {
            as.a(f, "api_key", af.z());
        }
        try {
            jSONObject.remove(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
            jSONObject.put(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes2.dex */
    private static class a {
        static int a = 4;
        static int b = 0;
        static int c = 1;
        static int d = 2;
        static int e = 3;

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String[] strArr) {
            if (strArr != null && strArr.length == a) {
                b.a(Integer.parseInt(strArr[b]), Integer.parseInt(strArr[c]), strArr[d], Boolean.parseBoolean(strArr[e]));
            }
        }
    }
}
