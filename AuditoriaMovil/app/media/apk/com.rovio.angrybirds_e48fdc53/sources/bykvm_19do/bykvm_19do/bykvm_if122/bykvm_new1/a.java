package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.msdk.adapter.config.ITTAdapterConfiguration;
import com.bytedance.msdk.adapter.util.Logger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements e {
    private Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> b = new ConcurrentHashMap();
    private f0 a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_void092.c.S();

    private List<String> a(Context context) {
        String str;
        List<ProviderInfo> queryContentProviders = context.getPackageManager().queryContentProviders(context.getApplicationInfo().processName, context.getApplicationInfo().uid, 131072);
        if (queryContentProviders == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        context.getPackageName();
        for (ProviderInfo providerInfo : queryContentProviders) {
            String str2 = providerInfo.name;
            char c = 65535;
            switch (str2.hashCode()) {
                case -2132028139:
                    if (str2.equals("com.baidu.mobads.sdk.api.BdFileProvider")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1630533804:
                    if (str2.equals("com.mbridge.msdk.foundation.tools.MBFileProvider")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1097984862:
                    if (str2.equals("com.sigmob.sdk.SigmobFileProvider")) {
                        c = 4;
                        break;
                    }
                    break;
                case 8917003:
                    if (str2.equals("com.tencent.klevin.utils.FileProvider")) {
                        c = 5;
                        break;
                    }
                    break;
                case 405711305:
                    if (str2.equals("com.google.android.gms.ads.MobileAdsInitProvider")) {
                        c = 6;
                        break;
                    }
                    break;
                case 787345346:
                    if (str2.equals("com.bykv.vk.openvk.TTFileProvider")) {
                        c = 1;
                        break;
                    }
                    break;
                case 980611709:
                    if (str2.equals("com.kwad.sdk.api.proxy.app.AdSdkFileProvider")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1010345138:
                    if (str2.equals("com.bytedance.sdk.openadsdk.TTFileProvider")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1011081416:
                    if (str2.equals("com.unity")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 1719438508:
                    if (str2.equals("com.qq.e.comm.GDTFileProvider")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str = "pangle";
                    break;
                case 1:
                    str = "pangle_custom";
                    break;
                case 2:
                    str = "gdt";
                    break;
                case 3:
                    str = "baidu";
                    break;
                case 4:
                    str = "sigmob";
                    break;
                case 5:
                    str = "klevin";
                    break;
                case 6:
                    str = "admob";
                    break;
                case 7:
                    str = "ks";
                    break;
                case '\b':
                    str = "mintegral";
                    break;
                case '\t':
                    str = "unity";
                    break;
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    private Set<String> a() {
        HashSet hashSet = new HashSet();
        if (this.b.size() != 0) {
            for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> entry : this.b.entrySet()) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a value = entry.getValue();
                if (value != null && !value.d()) {
                    hashSet.add(entry.getKey());
                }
            }
        }
        return hashSet;
    }

    private void a(JSONObject jSONObject) {
        this.b.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject optJSONObject = jSONObject.optJSONObject(next);
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a.a(next, optJSONObject);
            if (optJSONObject != null && a != null) {
                if (TextUtils.equals(next, "pangle") && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C()) {
                    this.b.put("pangle_custom", a);
                } else {
                    this.b.put(next, a);
                }
            }
        }
    }

    private void d() {
        String a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(this.a.d("adn_init_config"), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
        if (a == null || TextUtils.isEmpty(a)) {
            return;
        }
        try {
            a(new JSONObject(a));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a a(String str) {
        if (this.b.size() == 0) {
            d();
        }
        return this.b.get(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b() {
        List<String> a;
        synchronized (this) {
            Context d = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d();
            if (d != null) {
                Set<String> a2 = a();
                if (a2.size() != 0) {
                    int i = d.getApplicationInfo().targetSdkVersion;
                    Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 接入信息 start ---------------------");
                    Logger.d("TTMediationSDK_SDK_Init", "当前接入的GroMore SDK版本是：4.2.0.2");
                    if ((Build.VERSION.SDK_INT >= 24 || i >= 24) && (a = a(d)) != null) {
                        Iterator<String> it = a2.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            if (!"unity".equals(next) && !"pangle_custom".equals(next)) {
                                if ("pangle".equals(next) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().C()) {
                                    next = "pangle_custom";
                                }
                                if (a.contains(next)) {
                                    Logger.i("TTMediationSDK_SDK_Init", "已按要求接入三方广告sdk【" + next + "】");
                                } else {
                                    Logger.e("TTMediationSDK_SDK_Init", "未按要求接入三方广告sdk【" + next + "】，请检查接入配置");
                                }
                            }
                        }
                    }
                    Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 接入信息 end ---------------------");
                    Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 版本信息 start ---------------------");
                    for (String str : a2) {
                        if (!TextUtils.equals(str, "pangle")) {
                            ITTAdapterConfiguration a3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_int108.bykvm_if122.c.b().a(str);
                            if (a3 != null) {
                                a3.checkVersion();
                            } else {
                                Logger.e("TTMediationSDK_InitChecker", "没有引入" + str + "Adapter,请检查相关引入情况");
                            }
                        }
                    }
                    Logger.i("TTMediationSDK_SDK_Init", "------------------ GroMore 版本信息 end ---------------------");
                }
            }
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            a(jSONObject);
            String b = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONObject.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.b.a());
            if (b != null && !TextUtils.isEmpty(b)) {
                this.a.b("adn_init_config", b);
            }
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.bykvm_for12.a.k().b(jSONObject);
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public boolean c() {
        if (this.b.size() == 0) {
            d();
        }
        return this.b.isEmpty();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_new1.e
    public List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> g() {
        if (this.b.size() == 0) {
            d();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a> entry : this.b.entrySet()) {
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.a value = entry.getValue();
            if (value != null && value.d()) {
                arrayList.add(value);
            }
        }
        return arrayList;
    }
}
