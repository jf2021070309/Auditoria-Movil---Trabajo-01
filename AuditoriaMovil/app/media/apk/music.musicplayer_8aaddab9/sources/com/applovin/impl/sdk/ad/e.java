package com.applovin.impl.sdk.ad;

import android.graphics.Point;
import android.graphics.PointF;
import android.net.Uri;
import com.applovin.impl.adview.i;
import com.applovin.impl.adview.s;
import com.applovin.impl.adview.v;
import com.applovin.impl.sdk.ac;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class e extends AppLovinAdImpl {
    private final List<Uri> a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f3861b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f3862c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<com.applovin.impl.sdk.b.c> f3863d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f3864e;

    /* renamed from: f  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f3865f;

    /* renamed from: g  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f3866g;

    /* renamed from: h  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f3867h;

    /* renamed from: i  reason: collision with root package name */
    private List<com.applovin.impl.sdk.d.a> f3868i;

    /* renamed from: j  reason: collision with root package name */
    private c f3869j;

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

        /* renamed from: b  reason: collision with root package name */
        public final int f3876b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3877c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3878d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3879e;

        private c() {
            this.a = AppLovinSdkUtils.dpToPx(e.this.sdk.L(), e.this.T());
            this.f3876b = AppLovinSdkUtils.dpToPx(e.this.sdk.L(), e.this.U());
            this.f3877c = AppLovinSdkUtils.dpToPx(e.this.sdk.L(), e.this.V());
            this.f3878d = AppLovinSdkUtils.dpToPx(e.this.sdk.L(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bL)).intValue());
            this.f3879e = AppLovinSdkUtils.dpToPx(e.this.sdk.L(), ((Integer) e.this.sdk.a(com.applovin.impl.sdk.c.b.bK)).intValue());
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        RESIZE_ASPECT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT
    }

    public e(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, m mVar) {
        super(jSONObject, jSONObject2, bVar, mVar);
        this.a = CollectionUtils.synchronizedList();
        this.f3861b = new AtomicBoolean();
        this.f3862c = new AtomicBoolean();
        this.f3863d = new AtomicReference<>();
    }

    private String b(PointF pointF, boolean z) {
        String stringFromAdObject = getStringFromAdObject("click_tracking_url", null);
        Map<String, String> c2 = c(pointF, z);
        if (stringFromAdObject != null) {
            return StringUtils.replace(stringFromAdObject, c2);
        }
        return null;
    }

    private List<Integer> b() {
        return getIntegerListFromAdObject("multi_close_style", null);
    }

    private i.a c(boolean z) {
        return z ? i.a.WHITE_ON_TRANSPARENT : i.a.WHITE_ON_BLACK;
    }

    private Map<String, String> c(PointF pointF, boolean z) {
        Point a2 = com.applovin.impl.sdk.utils.g.a(this.sdk.L());
        HashMap hashMap = new HashMap(5);
        hashMap.put(Utils.MACRO_CLCODE, getClCode());
        hashMap.put(Utils.MACRO_CLICK_X, String.valueOf(pointF.x));
        hashMap.put(Utils.MACRO_CLICK_Y, String.valueOf(pointF.y));
        hashMap.put(Utils.MACRO_SCREEN_WIDTH, String.valueOf(a2.x));
        hashMap.put(Utils.MACRO_SCREEN_HEIGHT, String.valueOf(a2.y));
        hashMap.put(Utils.MACRO_IS_VIDEO_CLICK, String.valueOf(z));
        return hashMap;
    }

    private String d() {
        String stringFromAdObject = getStringFromAdObject("video_end_url", null);
        if (stringFromAdObject != null) {
            return stringFromAdObject.replace(Utils.MACRO_CLCODE, getClCode());
        }
        return null;
    }

    public s A() {
        return new s(getJsonObjectFromAdObject("video_button_properties", null), this.sdk);
    }

    public boolean B() {
        return getBooleanFromAdObject("video_clickable", Boolean.FALSE);
    }

    public boolean C() {
        return getBooleanFromAdObject("lock_current_orientation", Boolean.FALSE);
    }

    public a D() {
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

    public List<String> E() {
        String stringFromAdObject = getStringFromAdObject("required_html_resources", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : Collections.emptyList();
    }

    public List<String> F() {
        String stringFromAdObject = getStringFromAdObject("resource_cache_prefix", null);
        return stringFromAdObject != null ? CollectionUtils.explode(stringFromAdObject) : this.sdk.b(com.applovin.impl.sdk.c.b.bv);
    }

    public String G() {
        return getStringFromAdObject("cache_prefix", null);
    }

    public boolean H() {
        return getBooleanFromAdObject("sscomt", Boolean.FALSE);
    }

    public String I() {
        return getStringFromFullResponse("event_id", null);
    }

    public boolean J() {
        return getBooleanFromAdObject("progress_bar_enabled", Boolean.FALSE);
    }

    public int K() {
        return getColorFromAdObject("progress_bar_color", -922746881);
    }

    public int L() {
        int videoCompletionPercent;
        synchronized (this.adObjectLock) {
            videoCompletionPercent = Utils.getVideoCompletionPercent(this.adObject);
        }
        return videoCompletionPercent;
    }

    public int M() {
        synchronized (this.adObjectLock) {
            int i2 = JsonUtils.getInt(this.adObject, "graphic_completion_percent", -1);
            if (i2 < 0 || i2 > 100) {
                return 90;
            }
            return i2;
        }
    }

    public int N() {
        return getIntFromAdObject("poststitial_shown_forward_delay_millis", -1);
    }

    public int O() {
        return getIntFromAdObject("poststitial_dismiss_forward_delay_millis", -1);
    }

    public boolean P() {
        return getBooleanFromAdObject("should_apply_mute_setting_to_poststitial", Boolean.FALSE);
    }

    public boolean Q() {
        return getBooleanFromAdObject("should_forward_close_button_tapped_to_poststitial", Boolean.FALSE);
    }

    public boolean R() {
        return getBooleanFromAdObject("forward_lifecycle_events_to_webview", Boolean.FALSE);
    }

    public c S() {
        if (this.f3869j == null) {
            this.f3869j = new c();
        }
        return this.f3869j;
    }

    public int T() {
        return getIntFromAdObject("close_button_size", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.co)).intValue());
    }

    public int U() {
        return getIntFromAdObject("close_button_top_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cp)).intValue());
    }

    public int V() {
        return getIntFromAdObject("close_button_horizontal_margin", ((Integer) this.sdk.a(com.applovin.impl.sdk.c.b.cn)).intValue());
    }

    public boolean W() {
        return getBooleanFromAdObject("lhs_close_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.cm));
    }

    public boolean X() {
        return getBooleanFromAdObject("lhs_skip_button", (Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.ct));
    }

    public long Y() {
        long longFromAdObject = getLongFromAdObject("report_reward_duration", -1L);
        if (longFromAdObject >= 0) {
            return TimeUnit.SECONDS.toMillis(longFromAdObject);
        }
        return -1L;
    }

    public int Z() {
        return getIntFromAdObject("report_reward_percent", -1);
    }

    public i.a a(int i2) {
        return i2 == 1 ? i.a.WHITE_ON_TRANSPARENT : i2 == 2 ? i.a.INVISIBLE : i2 == 3 ? i.a.TRANSPARENT_SKIP : i.a.WHITE_ON_BLACK;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_click_tracking_urls", this.adObject, c(pointF, true), null, aq(), w(), this.sdk);
        }
        return postbacks.isEmpty() ? a(pointF, true) : postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> a(PointF pointF, boolean z) {
        List<com.applovin.impl.sdk.d.a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, c(pointF, z), b(pointF, z), aq(), w(), this.sdk);
        }
        return postbacks;
    }

    public abstract void a();

    public void a(com.applovin.impl.sdk.b.c cVar) {
        this.f3863d.set(cVar);
    }

    public void a(boolean z) {
        try {
            synchronized (this.adObjectLock) {
                this.adObject.put("html_resources_cached", z);
            }
        } catch (Throwable unused) {
        }
    }

    public boolean aA() {
        return this.f3862c.get();
    }

    public void aB() {
        this.f3862c.set(true);
    }

    public com.applovin.impl.sdk.b.c aC() {
        return this.f3863d.getAndSet(null);
    }

    public boolean aD() {
        Boolean bool = Boolean.FALSE;
        return getBooleanFromAdObject("suep", bool) || (getBooleanFromAdObject("suepfs", bool) && e());
    }

    public boolean aE() {
        return getBooleanFromAdObject("rwvbv", Boolean.FALSE);
    }

    public long aF() {
        return getLongFromAdObject("vrsbt_ms", TimeUnit.SECONDS.toMillis(3L));
    }

    public boolean aG() {
        return getBooleanFromAdObject("upiosp", Boolean.FALSE);
    }

    public boolean aH() {
        return getBooleanFromAdObject("web_video", Boolean.FALSE);
    }

    public d aI() {
        String stringFromAdObject = getStringFromAdObject("video_gravity", null);
        return "top".equals(stringFromAdObject) ? d.TOP : "bottom".equals(stringFromAdObject) ? d.BOTTOM : "left".equals(stringFromAdObject) ? d.LEFT : "right".equals(stringFromAdObject) ? d.RIGHT : d.RESIZE_ASPECT;
    }

    public boolean aa() {
        return getBooleanFromAdObject("report_reward_percent_include_close_delay", Boolean.TRUE);
    }

    public AtomicBoolean ab() {
        return this.f3861b;
    }

    public boolean ac() {
        return getBooleanFromAdObject("show_nia", Boolean.FALSE);
    }

    public String ad() {
        return getStringFromAdObject("nia_title", "");
    }

    public String ae() {
        return getStringFromAdObject("nia_message", "");
    }

    public String af() {
        return getStringFromAdObject("nia_button_title", "");
    }

    public boolean ag() {
        return getBooleanFromAdObject("avoms", Boolean.FALSE);
    }

    public boolean ah() {
        return this.f3864e;
    }

    public boolean ai() {
        return getBooleanFromAdObject("show_rewarded_interstitial_overlay_alert", Boolean.valueOf(AppLovinAdType.AUTO_INCENTIVIZED == getType()));
    }

    public String aj() {
        return getStringFromAdObject("text_rewarded_inter_alert_title", "Watch a video to earn a reward!");
    }

    public String ak() {
        return getStringFromAdObject("text_rewarded_inter_alert_body", "");
    }

    public String al() {
        return getStringFromAdObject("text_rewarded_inter_alert_ok_action", "OK!");
    }

    public List<com.applovin.impl.sdk.d.a> am() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f3865f;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("video_end_urls", this.adObject, getClCode(), d(), this.sdk);
            this.f3865f = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> an() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f3866g;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("ad_closed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f3866g = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ao() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f3867h;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("app_killed_urls", this.adObject, getClCode(), (String) null, this.sdk);
            this.f3867h = postbacks;
        }
        return postbacks;
    }

    public List<com.applovin.impl.sdk.d.a> ap() {
        List<com.applovin.impl.sdk.d.a> postbacks;
        List<com.applovin.impl.sdk.d.a> list = this.f3868i;
        if (list != null) {
            return list;
        }
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("imp_urls", this.adObject, getClCode(), CollectionUtils.map(Utils.SHOWN_OUT_OF_CONTEXT_MACRO, String.valueOf(ah())), null, aq(), w(), this.sdk);
            this.f3868i = postbacks;
        }
        return postbacks;
    }

    public Map<String, String> aq() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        if (getBooleanFromAdObject("send_webview_http_headers", bool)) {
            hashMap.putAll(ac.b());
        }
        if (getBooleanFromAdObject("use_webview_ua_for_postbacks", bool)) {
            hashMap.put("User-Agent", ac.a());
        }
        return hashMap;
    }

    public boolean ar() {
        return getBooleanFromAdObject("playback_requires_user_action", Boolean.TRUE);
    }

    public String as() {
        String stringFromAdObject = getStringFromAdObject("base_url", "/");
        if ("null".equalsIgnoreCase(stringFromAdObject)) {
            return null;
        }
        return stringFromAdObject;
    }

    public boolean at() {
        return getBooleanFromAdObject("web_contents_debugging_enabled", Boolean.FALSE);
    }

    public v au() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("web_view_settings", null);
        if (jsonObjectFromAdObject != null) {
            return new v(jsonObjectFromAdObject);
        }
        return null;
    }

    public int av() {
        return getIntFromAdObject("whalt", Utils.isBML(getSize()) ? 1 : ((Boolean) this.sdk.a(com.applovin.impl.sdk.c.b.eQ)).booleanValue() ? 0 : -1);
    }

    public List<String> aw() {
        return CollectionUtils.explode(getStringFromAdObject("wls", ""));
    }

    public List<String> ax() {
        return CollectionUtils.explode(getStringFromAdObject("wlh", null));
    }

    public Uri ay() {
        String stringFromAdObject = getStringFromAdObject("mute_image", null);
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public Uri az() {
        String stringFromAdObject = getStringFromAdObject("unmute_image", "");
        if (StringUtils.isValidString(stringFromAdObject)) {
            return Uri.parse(stringFromAdObject);
        }
        return null;
    }

    public void b(Uri uri) {
        this.a.add(uri);
    }

    public void b(boolean z) {
        this.f3864e = z;
    }

    public abstract String c();

    public void c(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "mute_image", uri);
        }
    }

    public void d(Uri uri) {
        synchronized (this.adObjectLock) {
            JsonUtils.putObject(this.adObject, "unmute_image", uri);
        }
    }

    public boolean e() {
        this.sdk.B().e("DirectAd", "Attempting to invoke isVideoStream() from base ad class");
        return false;
    }

    public Uri g() {
        this.sdk.B().e("DirectAd", "Attempting to invoke getVideoUri() from base ad class");
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return Collections.emptyList();
    }

    public Uri i() {
        this.sdk.B().e("DirectAd", "Attempting to invoke getClickDestinationUri() from base ad class");
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public abstract boolean isOpenMeasurementEnabled();

    public Uri j() {
        this.sdk.B().e("DirectAd", "Attempting to invoke getVideoClickDestinationUri() from base ad class");
        return null;
    }

    public b n() {
        b bVar = b.DEFAULT;
        String upperCase = getStringFromAdObject("ad_target", bVar.toString()).toUpperCase(Locale.ENGLISH);
        return "ACTIVITY_PORTRAIT".equalsIgnoreCase(upperCase) ? b.ACTIVITY_PORTRAIT : "ACTIVITY_LANDSCAPE".equalsIgnoreCase(upperCase) ? b.ACTIVITY_LANDSCAPE : bVar;
    }

    public long o() {
        return getLongFromAdObject("close_delay", 0L);
    }

    public long p() {
        return TimeUnit.SECONDS.toMillis(getLongFromAdObject("close_delay_max_buffering_time_seconds", 5L));
    }

    public long q() {
        List<Integer> r = r();
        long longFromAdObject = getLongFromAdObject("close_delay_graphic", (r == null || r.size() <= 0) ? 0L : r.get(0).intValue());
        if (longFromAdObject == -1 || longFromAdObject == -2) {
            return 0L;
        }
        return longFromAdObject;
    }

    public List<Integer> r() {
        return getIntegerListFromAdObject("multi_close_delay_graphic", null);
    }

    public i.a s() {
        List<Integer> b2 = b();
        int intFromAdObject = getIntFromAdObject("close_style", (b2 == null || b2.size() <= 0) ? -1 : b2.get(0).intValue());
        return intFromAdObject == -1 ? c(hasVideoUrl()) : a(intFromAdObject);
    }

    public List<i.a> t() {
        List<Integer> b2 = b();
        if (b2 != null) {
            ArrayList arrayList = new ArrayList(b2.size());
            for (Integer num : b2) {
                arrayList.add(a(num.intValue()));
            }
            return arrayList;
        }
        return null;
    }

    public i.a u() {
        int intFromAdObject = getIntFromAdObject("skip_style", -1);
        return intFromAdObject == -1 ? s() : a(intFromAdObject);
    }

    public boolean v() {
        return getBooleanFromAdObject("dismiss_on_skip", Boolean.FALSE);
    }

    public boolean w() {
        return getBooleanFromAdObject("fire_postbacks_from_webview", Boolean.FALSE);
    }

    public boolean x() {
        return getBooleanFromAdObject("html_resources_cached", Boolean.FALSE);
    }

    public List<Uri> y() {
        return this.a;
    }

    public String z() {
        JSONObject jsonObjectFromAdObject = getJsonObjectFromAdObject("video_button_properties", null);
        return jsonObjectFromAdObject != null ? JsonUtils.getString(jsonObjectFromAdObject, "video_button_html", "") : "";
    }
}
