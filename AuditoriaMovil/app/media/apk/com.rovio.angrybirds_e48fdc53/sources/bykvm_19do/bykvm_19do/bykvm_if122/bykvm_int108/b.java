package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h;
import com.bytedance.msdk.adapter.config.IGMInitAdnResult;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.v2.ad.custom.bean.GMCustomInitConfig;
import com.bytedance.msdk.api.v2.ad.custom.init.GMCustomAdapterConfiguration;
import com.bytedance.msdk.base.TTBaseAd;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements IGMInitAdnResult {
        final /* synthetic */ GMCustomInitConfig a;

        a(GMCustomInitConfig gMCustomInitConfig) {
            this.a = gMCustomInitConfig;
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void fail(AdError adError) {
            if (adError != null) {
                String aDNName = this.a.getADNName();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(aDNName, new Pair(false, "errorCode = " + adError.code + " errorMessage = " + adError.message));
            }
        }

        @Override // com.bytedance.msdk.adapter.config.IGMInitAdnResult
        public void success() {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(this.a.getADNName(), new Pair(true, ""));
        }
    }

    private static String a(GMCustomAdapterConfiguration gMCustomAdapterConfiguration) {
        return gMCustomAdapterConfiguration == null ? "customAdapterConfiguration 为null" : TextUtils.isEmpty(gMCustomAdapterConfiguration.getNetworkSdkVersion()) ? "自定义ADN 初始化失败 getNetworkSdkVersion()返字符串不能为空" : TextUtils.isEmpty(gMCustomAdapterConfiguration.getAdapterSdkVersion()) ? "自定义ADN 初始化失败 getAdapterSdkVersion()返字符串不能为空" : "";
    }

    public static void a(Context context) {
        List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> g = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_19do.a.s().g();
        if (g == null) {
            h.a("", (TTBaseAd) null, (AdSlot) null, (k) null, new AdError(AdError.ERROR_CODE_CUSTOM_INIT, "获取的自定义Adapter总配置为null"));
            return;
        }
        for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a aVar : g) {
            GMCustomInitConfig c = aVar.c();
            try {
                a(context, c, new a(c));
            } catch (Exception e) {
                e.printStackTrace();
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.a(c.getADNName(), new Pair(false, e.toString()));
                h.a(c.getADNName(), (TTBaseAd) null, (AdSlot) null, (k) null, new AdError(AdError.ERROR_CODE_CUSTOM_INIT, e.toString()));
            }
        }
    }

    private static void a(Context context, GMCustomInitConfig gMCustomInitConfig, IGMInitAdnResult iGMInitAdnResult) throws Exception {
        if (gMCustomInitConfig == null || TextUtils.isEmpty(gMCustomInitConfig.getAdnInitClassName())) {
            if (gMCustomInitConfig != null) {
                throw new Exception("自定义ADN初始化失败，获取的自定义Adapter单条配置初始化类名为空");
            }
            throw new Exception("自定义ADN初始化失败，获取的自定义Adapter单条配置为null");
        }
        try {
            Class<?> cls = Class.forName(gMCustomInitConfig.getAdnInitClassName());
            if (a(cls)) {
                try {
                    GMCustomAdapterConfiguration b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.d().b(gMCustomInitConfig.getADNName());
                    if (b == null) {
                        Object newInstance = cls.newInstance();
                        if (!(newInstance instanceof GMCustomAdapterConfiguration)) {
                            throw new Exception("自定义ADN初始化失败，初始化对象类型错误，对象类型为" + GMCustomAdapterConfiguration.class.getName());
                        }
                        GMCustomAdapterConfiguration gMCustomAdapterConfiguration = (GMCustomAdapterConfiguration) newInstance;
                        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.b.d().a(gMCustomInitConfig.getADNName(), gMCustomAdapterConfiguration);
                        a(context, gMCustomInitConfig, gMCustomAdapterConfiguration);
                    } else if (!b.isInit()) {
                        a(context, gMCustomInitConfig, b);
                    }
                    iGMInitAdnResult.success();
                } catch (IllegalAccessException e) {
                    throw new Exception("自定义ADN初始化失败，IllegalAccessException");
                } catch (InstantiationException e2) {
                    throw new Exception("自定义ADN舒适化失败，InstantiationException");
                }
            }
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            throw new Exception("自定义ADN初始化失败，ClassNotFoundException");
        }
    }

    private static void a(Context context, GMCustomInitConfig gMCustomInitConfig, GMCustomAdapterConfiguration gMCustomAdapterConfiguration) {
        String aDNName;
        AdError adError;
        if (context == null) {
            aDNName = gMCustomInitConfig.getADNName();
            adError = new AdError(AdError.ERROR_CODE_CUSTOM_INIT, "context为null");
        } else {
            String a2 = a(gMCustomAdapterConfiguration);
            if (TextUtils.isEmpty(a2)) {
                try {
                    gMCustomAdapterConfiguration.initializeInnerADN(context.getApplicationContext(), gMCustomInitConfig, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().h());
                    return;
                } catch (Exception e) {
                    String aDNName2 = gMCustomInitConfig.getADNName();
                    h.a(aDNName2, (TTBaseAd) null, (AdSlot) null, (k) null, new AdError(AdError.ERROR_CODE_CUSTOM_INIT, "调用自定义Adapter初始化方法出现异常 " + e.getClass().getName()));
                    e.printStackTrace();
                    return;
                }
            }
            aDNName = gMCustomInitConfig.getADNName();
            adError = new AdError(AdError.ERROR_CODE_CUSTOM_INIT, a2);
        }
        h.a(aDNName, (TTBaseAd) null, (AdSlot) null, (k) null, adError);
    }

    private static boolean a(Class<?> cls) {
        String b;
        if (a(cls, GMCustomAdapterConfiguration.class)) {
            b = b(cls, GMCustomAdapterConfiguration.class);
        } else {
            b = "自定义ADN初始化失败  ---------  初始化类 " + cls.getSimpleName() + " 需要继承自自定义ADN的初始化Adapter类 " + GMCustomAdapterConfiguration.class.getSimpleName();
        }
        if (TextUtils.isEmpty(b)) {
            return true;
        }
        Logger.e("TTMediationSDK_SDK_Init", b);
        h.a("", (TTBaseAd) null, (AdSlot) null, (k) null, new AdError(AdError.ERROR_CODE_CUSTOM_INIT, b));
        return false;
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        do {
            cls = cls.getSuperclass();
            if (cls == null) {
                return false;
            }
        } while (cls != cls2);
        return true;
    }

    public static String b(Class<?> cls, Class<?> cls2) {
        Method[] methods;
        for (Method method : cls2.getMethods()) {
            HashSet hashSet = new HashSet();
            for (Method method2 : Object.class.getMethods()) {
                hashSet.add(method2.getName());
            }
            if (!hashSet.contains(method.getName())) {
                try {
                    cls.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                    return "自定义ADN校验API失败接入API不符合版本需求，不符合的API的方法名为 " + method.getName();
                }
            }
        }
        return "";
    }
}
