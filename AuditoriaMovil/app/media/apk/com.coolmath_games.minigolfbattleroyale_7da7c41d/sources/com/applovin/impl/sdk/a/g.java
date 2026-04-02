package com.applovin.impl.sdk.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.j;
import com.applovin.impl.adview.u;
import com.applovin.impl.adview.x;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class g extends AppLovinAdBase {
    private final List<Uri> a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private final AtomicReference<com.applovin.impl.sdk.b.c> d;
    private boolean e;
    private List<com.applovin.impl.sdk.d.a> f;
    private List<com.applovin.impl.sdk.d.a> g;
    private List<com.applovin.impl.sdk.d.a> h;
    private List<com.applovin.impl.sdk.d.a> i;
    private c j;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        DISMISS,
        DO_NOT_DISMISS
    }

    /* loaded from: classes.dex */
    public enum b {
        DEFAULT,
        ACTIVITY_PORTRAIT,
        ACTIVITY_LANDSCAPE
    }

    /* loaded from: classes.dex */
    public class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private c() {
            this.a = AppLovinSdkUtils.dpToPx(g.this.sdk.J(), g.this.X());
            this.b = AppLovinSdkUtils.dpToPx(g.this.sdk.J(), g.this.Y());
            this.c = AppLovinSdkUtils.dpToPx(g.this.sdk.J(), g.this.Z());
            this.d = AppLovinSdkUtils.dpToPx(g.this.sdk.J(), ((Integer) g.this.sdk.a(com.applovin.impl.sdk.c.b.bB)).intValue());
            this.e = AppLovinSdkUtils.dpToPx(g.this.sdk.J(), ((Integer) g.this.sdk.a(com.applovin.impl.sdk.c.b.bA)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        RESIZE_ASPECT,
        RESIZE_ASPECT_FILL,
        RESIZE
    }

    public g(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.a.b bVar, k kVar) {
        super(jSONObject, jSONObject2, bVar, kVar);
        this.a = CollectionUtils.synchronizedList();
        this.b = new AtomicBoolean();
        this.c = new AtomicBoolean();
        this.d = new AtomicReference<>();
    }

    private String b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> c2 = c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c2);
        }
        return null;
    }

    private j.a c(boolean z) {
        return z ? j.a.WHITE_ON_TRANSPARENT : j.a.WHITE_ON_BLACK;
    }

    private String c() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    private Map<String, String> c(PointF pointF, boolean z) {
        Point a2 = com.applovin.impl.sdk.utils.f.a(this.sdk.J());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a2.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a2.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return hashMap;
    }

    public List<Uri> A() {
        return this.a;
    }

    public String B() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }

    public u C() {
        return new u(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean D() {
        return getBooleanFromAdObject("video_clickable", false);
    }

    public boolean E() {
        return getBooleanFromAdObject("lock_current_orientation", false);
    }

    public int F() {
        return getIntFromAdObject("countdown_length", 0);
    }

    public int G() {
        return getColorFromAdObject("countdown_color", -922746881);
    }

    public int H() {
        return getColorFromAdObject("graphic_background_color", hasVideoUrl() ? ViewCompat.MEASURED_STATE_MASK : -1157627904);
    }

    public a I() {
        String stringFromAdObject = getStringFromAdObject("poststitial_dismiss_type", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            if ("dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DISMISS;
            }
            if ("no_dismiss".equalsIgnoreCase(stringFromAdObject)) {
                return a.DO_NOT_DISMISS;
            }
        }
        return a.UNSPECIFIED;
    }

    public List<String> J() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.b(com.applovin.impl.sdk.c.b.bl);
    }

    public String K() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean L() {
        return getBooleanFromAdObject("sscomt", false);
    }

    public String M() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean N() {
        return getBooleanFromAdObject("progress_bar_enabled", false);
    }

    public int O() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int P() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    public int Q() {
        synchronized (this.adObjectLock) {
            int i = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i < 0 || i > 100) {
                return 90;
            }
            return i;
        }
    }

    public int R() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int S() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean T() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", false);
    }

    public boolean U() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", false);
    }

    public boolean V() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", false);
    }

    public c W() {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public int X() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.bZ)).intValue());
    }

    public int Y() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.ca)).intValue());
    }

    public int Z() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.bY)).intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j.a a(int i) {
        return i == 1 ? j.a.WHITE_ON_TRANSPARENT : i == 2 ? j.a.INVISIBLE : j.a.WHITE_ON_BLACK;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, c(pointF, true), null, au(), y(), this.sdk);
        }
        return postbacks.isEmpty() ? a(pointF, true) : postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, c(pointF, z), b(pointF, z), au(), y(), this.sdk);
        }
        return postbacks;
    }

    public abstract void a();

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.d.set(cVar);
    }

    public void a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    public List<String> aA() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> aB() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public boolean aC() {
        return getBooleanFromAdObject("ibbdfs", false);
    }

    public boolean aD() {
        return getBooleanFromAdObject("ibbdfc", false);
    }

    public Uri aE() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri aF() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public boolean aG() {
        return this.c.get();
    }

    public void aH() {
        this.c.set(true);
    }

    public com.applovin.impl.sdk.b.c aI() {
        return this.d.getAndSet(null);
    }

    public boolean aJ() {
        return getBooleanFromAdObject("suep", false) || (getBooleanFromAdObject("suepfs", false) && f());
    }

    public boolean aK() {
        return getBooleanFromAdObject("rwvbv", false);
    }

    public long aL() {
        return getLongFromAdObject("vrsbt_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public boolean aM() {
        return getBooleanFromAdObject("upiosp", false);
    }

    public boolean aN() {
        return getBooleanFromAdObject("web_video", false);
    }

    public boolean aa() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.bX));
    }

    public boolean ab() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cn));
    }

    public long ac() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int ad() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public boolean ae() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", true);
    }

    public AtomicBoolean af() {
        return this.b;
    }

    public boolean ag() {
        return getBooleanFromAdObject("show_nia", false);
    }

    public String ah() {
        return getStringFromAdObject("nia_title", "");
    }

    public String ai() {
        return getStringFromAdObject("nia_message", "");
    }

    public String aj() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean ak() {
        return getBooleanFromAdObject("avoms", false);
    }

    public boolean al() {
        return this.e;
    }

    public boolean am() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String an() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String ao() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String ap() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> aq() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), c(), this.sdk);
            this.f = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ar() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.g = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> as() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.h = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> at() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.i;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), CollectionUtils.map(Utils.SHOWN_OUT_OF_CONTEXT_MACRO, String.valueOf(al())), null, au(), y(), this.sdk);
            this.i = postbacks;
        }
        return postbacks;
    }

    public Map<String, String> au() {
        HashMap hashMap = new HashMap();
        if (getBooleanFromAdObject("send_webview_http_headers", false)) {
            hashMap.putAll(y.b());
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", false)) {
            hashMap.put("User-Agent", y.a());
        }
        return hashMap;
    }

    public boolean av() {
        return getBooleanFromAdObject("playback_requires_user_action", true);
    }

    public String aw() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean ax() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", false);
    }

    public x ay() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new x(jsonObjectFromAdObject);
        }
        return null;
    }

    public int az() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eL)).booleanValue() ? 0 : -1);
    }

    public abstract JSONObject b();

    public void b(Uri uri) {
        this.a.add(uri);
    }

    public void b(boolean z) {
        this.e = z;
    }

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    public abstract String d();

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public boolean f() {
        this.sdk.z().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public Uri h() {
        this.sdk.z().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    public Uri j() {
        this.sdk.z().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    public Uri k() {
        this.sdk.z().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    public boolean p() {
        return getBooleanFromAdObject("fs_2", false);
    }

    public b q() {
        String upperCase = getStringFromAdObject("ad_target", b.DEFAULT.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? b.ACTIVITY_LANDSCAPE : b.DEFAULT;
    }

    public String r() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long s() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long t() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long u() {
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", 0L);
        if (p()) {
            if (longFromAdObject == -1 || longFromAdObject == -2) {
                return 0L;
            }
            return longFromAdObject;
        }
        return longFromAdObject;
    }

    public j.a v() {
        int intFromAdObject = getIntFromAdObject("close_style", -1);
        return intFromAdObject == -1 ? c(hasVideoUrl()) : a(intFromAdObject);
    }

    public j.a w() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? v() : a(intFromAdObject);
    }

    public boolean x() {
        return getBooleanFromAdObject("dismiss_on_skip", false);
    }

    public boolean y() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", false);
    }

    public boolean z() {
        return getBooleanFromAdObject("html_resources_cached", false);
    }
}
