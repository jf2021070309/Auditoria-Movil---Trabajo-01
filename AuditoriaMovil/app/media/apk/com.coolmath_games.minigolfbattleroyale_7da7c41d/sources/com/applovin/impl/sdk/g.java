package com.applovin.impl.sdk;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.g;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class g implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {
    private final k a;
    private final AppLovinCommunicator b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(k kVar) {
        this.a = kVar;
        this.b = AppLovinCommunicator.getInstance(kVar.J());
        if (kVar.e()) {
            return;
        }
        this.b.a(kVar);
        this.b.subscribe(this, com.applovin.impl.communicator.c.a);
    }

    private Bundle b(com.applovin.impl.mediation.a.a aVar) {
        Bundle bundle = new Bundle();
        bundle.putString("id", aVar.e());
        bundle.putString("network_name", aVar.K());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.j());
        bundle.putString(FirebaseAnalytics.Param.AD_FORMAT, aVar.getFormat().getLabel());
        if (StringUtils.isValidString(aVar.getCreativeId())) {
            bundle.putString("creative_id", aVar.getCreativeId());
        }
        bundle.putAll(JsonUtils.toBundle(aVar.a()));
        return bundle;
    }

    public void a() {
        a(new Bundle(), "privacy_setting_updated");
    }

    public void a(Bundle bundle, String str) {
        if (this.a.e()) {
            return;
        }
        this.b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.a.b(com.applovin.impl.sdk.c.b.eS).contains(str)));
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Bundle b = b(aVar);
        b.putAll(JsonUtils.toBundle(aVar.b()));
        b.putString("country_code", this.a.r().getCountryCode());
        a(b, "max_revenue_events");
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        Bundle b = b(aVar);
        b.putString("type", str);
        r z = this.a.z();
        z.b("CommunicatorService", "Sending \"max_ad_events\" message: " + b);
        a(b, "max_ad_events");
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("adapter_class", str);
        bundle.putInt("init_status", initializationStatus.getCode());
        a(bundle, "adapter_initialization_status");
    }

    public void a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("adapter_class", str2);
        bundle.putString("sdk_version", str);
        a(bundle, "network_sdk_version_updated");
    }

    public void a(String str, String str2, int i, Object obj, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("id", str);
        bundle.putString("url", str2);
        bundle.putInt("code", i);
        bundle.putBundle(SDKConstants.PARAM_A2U_BODY, JsonUtils.toBundle(obj));
        bundle.putBoolean("success", z);
        BundleUtils.putString("error_message", str3, bundle);
        a(bundle, "receive_http_response");
    }

    public void a(JSONObject jSONObject, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.x());
        bundle.putString("applovin_random_token", this.a.o());
        bundle.putString("compass_random_token", this.a.n());
        bundle.putString("device_type", AppLovinSdkUtils.isTablet(this.a.J()) ? "tablet" : "phone");
        bundle.putString("init_success", String.valueOf(z));
        bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(com.applovin.impl.mediation.c.c.a(this.a)));
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", new JSONObject());
        Bundle bundle2 = (Bundle) bundle.clone();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "user_engagement_sdk_settings", new JSONObject());
        JsonUtils.putString(jSONObject3, "lsc", "Y29tLmFuZHJvaWQudmVuZGluZy5saWNlbnNpbmcuSUxpY2Vuc2luZ1NlcnZpY2U=");
        JsonUtils.putString(jSONObject3, "psp", "Y29tLmFuZHJvaWQudmVuZGluZw==");
        bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
        a(bundle2, "user_engagement_sdk_init");
        Bundle bundle3 = (Bundle) bundle.clone();
        bundle3.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject())));
        r z2 = this.a.z();
        z2.b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
        a(bundle3, "safedk_init");
        Bundle bundle4 = (Bundle) bundle.clone();
        bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
        a(bundle4, "adjust_init");
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        long j;
        if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
            Map<String, Object> map = BundleUtils.toMap(messageData.getBundle("post_body"));
            Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
            String string = messageData.getString("id", "");
            if (!map.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.x());
            }
            this.a.S().a(new g.a().c(messageData.getString("url")).d(messageData.getString("backup_url")).a(stringMap).c(map).b(stringMap2).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.en)).booleanValue()).a(string).a());
        } else if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.a.t().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            }
        } else {
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.a.a(com.applovin.impl.sdk.c.b.dj)).longValue();
            int i = messageData2.getInt("retry_count", ((Integer) this.a.a(com.applovin.impl.sdk.c.b.dk)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.a.a(com.applovin.impl.sdk.c.b.dl)).longValue();
            Map<String, Object> map2 = BundleUtils.toMap(messageData2.getBundle("post_body"));
            if (messageData2.getBoolean("include_data_collector_info", true)) {
                Map<String, Object> g = this.a.T().g();
                Map<String, Object> d = this.a.T().d();
                j = millis2;
                g.put("server_installed_at", this.a.a(com.applovin.impl.sdk.c.b.ae));
                g.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.x());
                map2.put("app", g);
                map2.put("device", d);
            } else {
                j = millis2;
            }
            this.a.Q().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.c.a(this.a).a(messageData2.getString("url")).c(messageData2.getString("backup_url")).a(BundleUtils.toStringMap(messageData2.getBundle("query_params"))).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(new JSONObject(map2)).b((int) millis).a(i).c((int) j).a((c.a) new JSONObject()).c(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.a), o.a.MAIN);
        }
    }
}
