package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements AppLovinCommunicatorSubscriber {
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f3673b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3674c;

    /* renamed from: d  reason: collision with root package name */
    private String f3675d;

    public b(m mVar) {
        this.a = mVar;
        d<String> dVar = d.C;
        this.f3675d = (String) mVar.b((d<d<String>>) dVar, (d<String>) null);
        mVar.b(dVar);
        if (StringUtils.isValidString(this.f3675d)) {
            this.f3674c = true;
        }
        d<Boolean> dVar2 = d.D;
        this.f3673b = ((Boolean) mVar.b((d<d<Boolean>>) dVar2, (d<Boolean>) Boolean.FALSE)).booleanValue();
        mVar.b(dVar2);
        AppLovinCommunicator.getInstance(mVar.L()).subscribe(this, "test_mode_settings");
    }

    public void a(String str) {
        this.f3675d = str;
    }

    public void a(JSONObject jSONObject) {
        if (this.f3673b) {
            return;
        }
        this.f3673b = JsonUtils.containsCaseInsensitiveString(this.a.V().l().f4259b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.a.V().g() || this.a.V().n();
    }

    public void a(boolean z) {
        this.f3674c = z;
    }

    public boolean a() {
        return this.f3673b;
    }

    public void b(String str) {
        this.a.a((d<d<String>>) d.C, (d<String>) str);
    }

    public boolean b() {
        return this.f3674c;
    }

    public String c() {
        return this.f3675d;
    }

    public void d() {
        this.a.a((d<d<Boolean>>) d.D, (d<Boolean>) Boolean.TRUE);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return b.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("test_mode_settings".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = BundleUtils.getString("force_ad_network", messageData);
            if (StringUtils.isValidString(string)) {
                this.f3674c = true;
                this.f3675d = string;
            }
            String string2 = BundleUtils.getString("test_mode_network_next_session", messageData);
            if (StringUtils.isValidString(string2)) {
                d();
                b(string2);
            }
        }
    }
}
