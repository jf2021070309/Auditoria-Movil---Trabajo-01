package com.applovin.impl.adview;

import android.annotation.TargetApi;
import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.common.api.CommonStatusCodes;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class v {
    private JSONObject a;

    public v(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public Integer a() {
        int i2;
        String string = JsonUtils.getString(this.a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                i2 = 0;
            } else if ("never_allow".equalsIgnoreCase(string)) {
                i2 = 1;
            } else if ("compatibility_mode".equalsIgnoreCase(string)) {
                i2 = 2;
            }
            return Integer.valueOf(i2);
        }
        return null;
    }

    public WebSettings.PluginState b() {
        String string = JsonUtils.getString(this.a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if ("on".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if ("off".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    public Boolean c() {
        return JsonUtils.getBoolean(this.a, "allow_file_access", null);
    }

    public Boolean d() {
        return JsonUtils.getBoolean(this.a, "load_with_overview_mode", null);
    }

    public Boolean e() {
        return JsonUtils.getBoolean(this.a, "use_wide_view_port", null);
    }

    public Boolean f() {
        return JsonUtils.getBoolean(this.a, "allow_content_access", null);
    }

    public Boolean g() {
        return JsonUtils.getBoolean(this.a, "use_built_in_zoom_controls", null);
    }

    public Boolean h() {
        return JsonUtils.getBoolean(this.a, "display_zoom_controls", null);
    }

    public Boolean i() {
        return JsonUtils.getBoolean(this.a, "save_form_data", null);
    }

    public Boolean j() {
        return JsonUtils.getBoolean(this.a, "geolocation_enabled", null);
    }

    public Boolean k() {
        return JsonUtils.getBoolean(this.a, "need_initial_focus", null);
    }

    public Boolean l() {
        return JsonUtils.getBoolean(this.a, "allow_file_access_from_file_urls", null);
    }

    public Boolean m() {
        return JsonUtils.getBoolean(this.a, "allow_universal_access_from_file_urls", null);
    }

    public Boolean n() {
        return JsonUtils.getBoolean(this.a, "offscreen_pre_raster", null);
    }
}
