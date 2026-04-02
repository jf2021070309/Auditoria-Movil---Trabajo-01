package com.applovin.impl.sdk;

import android.os.Bundle;
import android.view.View;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.network.g;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class i implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final AppLovinCommunicator f4113b;

    public i(m mVar) {
        this.a = mVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(mVar.L());
        this.f4113b = appLovinCommunicator;
        if (mVar.e()) {
            return;
        }
        appLovinCommunicator.a(mVar);
        appLovinCommunicator.subscribe(this, com.applovin.impl.communicator.c.a);
    }

    private Bundle b(com.applovin.impl.mediation.a.a aVar) {
        View x;
        String str;
        Bundle bundle = new Bundle();
        bundle.putString(FacebookAdapter.KEY_ID, aVar.f());
        bundle.putString("network_name", aVar.P());
        bundle.putString("max_ad_unit_id", aVar.getAdUnitId());
        bundle.putString("third_party_ad_placement_id", aVar.m());
        bundle.putString("ad_format", aVar.getFormat().getLabel());
        if (StringUtils.isValidString(aVar.getCreativeId())) {
            bundle.putString("creative_id", aVar.getCreativeId());
        }
        bundle.putAll(JsonUtils.toBundle(aVar.b()));
        if (aVar instanceof com.applovin.impl.mediation.a.b) {
            if (((com.applovin.impl.mediation.a.b) aVar).x() != null) {
                str = x.getClass().getName() + '@' + Integer.toHexString(x.hashCode());
            } else {
                str = "N/A";
            }
            bundle.putString("ad_view", str);
        }
        return bundle;
    }

    public void a() {
        a(new Bundle(), "privacy_setting_updated");
    }

    public void a(Bundle bundle, String str) {
        if (this.a.e()) {
            return;
        }
        this.f4113b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.a.b(com.applovin.impl.sdk.c.b.fa).contains(str)));
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        Bundle b2 = b(aVar);
        b2.putAll(JsonUtils.toBundle(aVar.c()));
        b2.putString("country_code", this.a.s().getCountryCode());
        BundleUtils.putStringIfValid("user_segment", this.a.q().getName(), b2);
        a(b2, "max_revenue_events");
    }

    public void a(com.applovin.impl.mediation.a.a aVar, String str) {
        Bundle b2 = b(aVar);
        b2.putString("type", str);
        v B = this.a.B();
        B.b("CommunicatorService", "Sending \"max_ad_events\" message: " + b2);
        a(b2, "max_ad_events");
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

    public void a(String str, String str2, int i2, Object obj, String str3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(FacebookAdapter.KEY_ID, str);
        bundle.putString(ImagesContract.URL, str2);
        bundle.putInt("code", i2);
        bundle.putBundle("body", JsonUtils.toBundle(obj));
        bundle.putBoolean("success", z);
        BundleUtils.putString("error_message", str3, bundle);
        a(bundle, "receive_http_response");
    }

    public void a(String str, String str2, String str3) {
        String maybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
        String maybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
        Bundle bundle = new Bundle();
        bundle.putString("request_url", str2);
        bundle.putString("request_body", maybeConvertToIndentedString);
        bundle.putString("response", maybeConvertToIndentedString2);
        a(bundle, "responses");
    }

    public void a(JSONObject jSONObject, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.z());
        bundle.putString("applovin_random_token", this.a.o());
        bundle.putString("compass_random_token", this.a.n());
        bundle.putString("device_type", AppLovinSdkUtils.isTablet(this.a.L()) ? "tablet" : "phone");
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
        v B = this.a.B();
        B.b("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
        a(bundle3, "safedk_init");
        Bundle bundle4 = (Bundle) bundle.clone();
        bundle4.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "adjust_settings", new JSONObject())));
        a(bundle4, "adjust_init");
        Bundle bundle5 = (Bundle) bundle.clone();
        bundle5.putBundle("settings", JsonUtils.toBundle(JsonUtils.getJSONObject(jSONObject2, "discovery_settings", new JSONObject())));
        a(bundle5, "discovery_init");
    }

    public boolean a(String str) {
        return com.applovin.impl.communicator.c.a.contains(str);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Map<String, Object> map;
        int i2;
        if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
            Map<String, Object> map2 = BundleUtils.toMap(messageData.getBundle("post_body"));
            Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
            String string = messageData.getString(FacebookAdapter.KEY_ID, "");
            if (!map2.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                map2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.z());
            }
            this.a.U().a(new g.a().c(messageData.getString(ImagesContract.URL)).d(messageData.getString("backup_url")).a(stringMap).c(map2).b(stringMap2).a(((Boolean) this.a.a(com.applovin.impl.sdk.c.b.et)).booleanValue()).a(string).a());
        } else if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
            if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.a.u().addCustomQueryParams(Utils.stringifyObjectMap(BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
            } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.a.u().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            } else if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                this.a.E().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
            }
        } else {
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.a.a(com.applovin.impl.sdk.c.b.dj)).longValue();
            int i3 = messageData2.getInt("retry_count", ((Integer) this.a.a(com.applovin.impl.sdk.c.b.dk)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.a.a(com.applovin.impl.sdk.c.b.dl)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            long j2 = millis2;
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.a.V().a(null, false, false))));
                }
                i2 = i3;
                map = null;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map<String, Object> h2 = this.a.V().h();
                    Map<String, Object> d2 = this.a.V().d();
                    if (d2.containsKey("idfv") && d2.containsKey("idfv_scope")) {
                        i2 = i3;
                        String str = (String) d2.get("idfv");
                        int intValue = ((Integer) d2.get("idfv_scope")).intValue();
                        d2.remove("idfv");
                        d2.remove("idfv_scope");
                        h2.put("idfv", str);
                        h2.put("idfv_scope", Integer.valueOf(intValue));
                    } else {
                        i2 = i3;
                    }
                    h2.put("server_installed_at", this.a.a(com.applovin.impl.sdk.c.b.al));
                    h2.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.a.z());
                    map.put("app", h2);
                    map.put("device", d2);
                } else {
                    i2 = i3;
                }
            }
            this.a.S().a(new com.applovin.impl.sdk.network.a(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.c.a(this.a).a(messageData2.getString(ImagesContract.URL)).c(messageData2.getString("backup_url")).a(stringMap3).b(string2).b(BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).b((int) millis).a(i2).c((int) j2).a((c.a) new JSONObject()).c(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.a), o.a.MAIN);
        }
    }
}
