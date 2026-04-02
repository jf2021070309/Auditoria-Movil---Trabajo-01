package com.applovin.impl.sdk.c;

import android.net.Uri;
import com.applovin.impl.a.j;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.sdk.AppLovinAdSize;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b<T> implements Comparable {
    private final String c;
    private final T d;
    private static final List<?> a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);
    private static final Map<String, b<?>> b = new HashMap(512);
    public static final b<Boolean> V = a("is_disabled", false);
    public static final b<String> W = a("device_id", "");
    public static final b<Boolean> X = a("rss", true);
    public static final b<String> Y = a("device_token", "");
    public static final b<Long> Z = a("publisher_id", 0L);
    public static final b<Boolean> aa = a("is_verbose_logging", false);
    public static final b<String> ab = a("sc", "");
    public static final b<String> ac = a("sc2", "");
    public static final b<String> ad = a("sc3", "");
    public static final b<String> ae = a("server_installed_at", "");
    public static final b<Boolean> af = a("track_network_response_codes", false);
    public static final b<Boolean> ag = a("submit_network_response_codes", false);
    public static final b<Boolean> ah = a("clear_network_response_codes_on_request", true);
    public static final b<Boolean> ai = a("clear_completion_callback_on_failure", false);
    public static final b<Long> aj = a("sicd_ms", 0L);
    public static final b<Integer> ak = a("logcat_max_line_size", 1000);
    public static final b<Integer> al = a("stps", 32);
    public static final b<Boolean> am = a("ustp", false);
    public static final b<Boolean> an = a("exception_handler_enabled", true);
    public static final b<Boolean> ao = a("publisher_can_show_consent_dialog", true);
    public static final b<String> ap = a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
    public static final b<Boolean> aq = a("consent_dialog_immersive_mode_on", false);
    public static final b<Long> ar = a("consent_dialog_show_from_alert_delay_ms", 450L);
    public static final b<Boolean> as = a("alert_consent_for_dialog_rejected", false);
    public static final b<Boolean> at = a("alert_consent_for_dialog_closed", false);
    public static final b<Boolean> au = a("alert_consent_for_dialog_closed_with_back_button", false);
    public static final b<Boolean> av = a("alert_consent_after_init", false);
    public static final b<Long> aw = a("alert_consent_after_init_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> ax = a("alert_consent_after_dialog_rejection_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(30)));
    public static final b<Long> ay = a("alert_consent_after_dialog_close_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> az = a("alert_consent_after_dialog_close_with_back_button_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<Long> aA = a("alert_consent_after_cancel_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Long> aB = a("alert_consent_reschedule_interval_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
    public static final b<String> aC = a("text_alert_consent_title", "Make this App Better and Stay Free!");
    public static final b<String> aD = a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
    public static final b<String> aE = a("text_alert_consent_yes_option", "I Agree");
    public static final b<String> aF = a("text_alert_consent_no_option", "Cancel");
    public static final b<Long> aG = a("ttc_max_click_duration_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> aH = a("ttc_max_click_distance_dp", 10);
    public static final b<Integer> aI = a("ttc_acrs", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.DISABLED.ordinal()));
    public static final b<Integer> aJ = a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
    public static final b<Integer> aK = a("ttc_edge_buffer_dp", 0);
    public static final b<String> aL = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
    public static final b<String> aM = a("fetch_settings_endpoint", "https://ms.applovin.com/");
    public static final b<String> aN = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> aO = a("adserver_endpoint", "https://a.applovin.com/");
    public static final b<String> aP = a("adserver_backup_endpoint", "https://a.applvn.com/");
    public static final b<String> aQ = a("api_endpoint", "https://d.applovin.com/");
    public static final b<String> aR = a("api_backup_endpoint", "https://d.applvn.com/");
    public static final b<String> aS = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
    public static final b<String> aT = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
    public static final b<String> aU = a("fetch_variables_endpoint", "https://ms.applovin.com/");
    public static final b<String> aV = a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
    public static final b<String> aW = a("token_type_prefixes_r", "4!");
    public static final b<String> aX = a("token_type_prefixes_arj", "json_v3!");
    public static final b<String> aY = a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");
    public static final b<String> aZ = a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
    public static final b<Boolean> ba = a("persist_super_properties", true);
    public static final b<Integer> bb = a("super_property_string_max_length", 1024);
    public static final b<Integer> bc = a("super_property_url_max_length", 1024);
    public static final b<Long> bd = a("cached_advertising_info_ttl_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(10)));
    public static final b<Boolean> be = a("use_per_format_cache_queues", true);
    public static final b<Boolean> bf = a("cache_cleanup_enabled", false);
    public static final b<Long> bg = a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1)));
    public static final b<Integer> bh = a("cache_max_size_mb", -1);
    public static final b<String> bi = a("precache_delimiters", ")]',");
    public static final b<Boolean> bj = a("ad_resource_caching_enabled", true);
    public static final b<Boolean> bk = a("fail_ad_load_on_failed_video_cache", true);
    public static final b<String> bl = a("resource_cache_prefix", "https://vid.applovin.com/,https://pdn.applovin.com/,https://img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://pdn.applovin.com/,http://img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://cdnjs.cloudflare.com/");
    public static final b<String> bm = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
    public static final b<Integer> bn = a("vr_retry_count_v1", 1);
    public static final b<Integer> bo = a("cr_retry_count_v1", 1);
    public static final b<Boolean> bp = a("incent_warning_enabled", false);
    public static final b<String> bq = a("text_incent_warning_title", "Attention!");
    public static final b<String> br = a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
    public static final b<String> bs = a("text_incent_warning_close_option", "Close");
    public static final b<String> bt = a("text_incent_warning_continue_option", "Keep Watching");
    public static final b<Boolean> bu = a("incent_nonvideo_warning_enabled", false);
    public static final b<String> bv = a("text_incent_nonvideo_warning_title", "Attention!");
    public static final b<String> bw = a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
    public static final b<String> bx = a("text_incent_nonvideo_warning_close_option", "Close");
    public static final b<String> by = a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
    public static final b<Boolean> bz = a("check_webview_has_gesture", false);
    public static final b<Integer> bA = a("close_button_touch_area", 0);
    public static final b<Integer> bB = a("close_button_outside_touch_area", 0);
    public static final b<Boolean> bC = a("creative_debugger_enabled", false);
    public static final b<Long> bD = a("viewability_adview_imp_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Integer> bE = a("viewability_adview_banner_min_width", 320);
    public static final b<Integer> bF = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
    public static final b<Integer> bG = a("viewability_adview_mrec_min_width", Integer.valueOf(AppLovinAdSize.MREC.getWidth()));
    public static final b<Integer> bH = a("viewability_adview_mrec_min_height", Integer.valueOf(AppLovinAdSize.MREC.getHeight()));
    public static final b<Integer> bI = a("viewability_adview_leader_min_width", 728);
    public static final b<Integer> bJ = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
    public static final b<Float> bK = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
    public static final b<Long> bL = a("viewability_timer_min_visible_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<Long> bM = a("viewability_timer_interval_ms", 100L);
    public static final b<Integer> bN = a("expandable_close_button_size", 27);
    public static final b<Integer> bO = a("expandable_h_close_button_margin", 10);
    public static final b<Integer> bP = a("expandable_t_close_button_margin", 10);
    public static final b<Boolean> bQ = a("expandable_lhs_close_button", false);
    public static final b<Integer> bR = a("expandable_close_button_touch_area", 0);
    public static final b<Boolean> bS = a("iaad", false);
    public static final b<Integer> bT = a("auxiliary_operations_threads", 3);
    public static final b<Integer> bU = a("caching_operations_threads", 8);
    public static final b<Long> bV = a("fullscreen_ad_pending_display_state_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Long> bW = a("fullscreen_ad_showing_state_timeout_ms", Long.valueOf(TimeUnit.MINUTES.toMillis(2)));
    public static final b<Boolean> bX = a("lhs_close_button_video", false);
    public static final b<Integer> bY = a("close_button_right_margin_video", 4);
    public static final b<Integer> bZ = a("close_button_size_video", 30);
    public static final b<Integer> ca = a("close_button_top_margin_video", 8);
    public static final b<Boolean> cb = a("show_close_on_exit", true);
    public static final b<Integer> cc = a("video_countdown_clock_margin", 10);
    public static final b<Integer> cd = a("video_countdown_clock_gravity", 83);
    public static final b<Integer> ce = a("countdown_clock_size", 32);
    public static final b<Integer> cf = a("countdown_clock_stroke_size", 4);
    public static final b<Integer> cg = a("countdown_clock_text_size", 28);
    public static final b<Boolean> ch = a("draw_countdown_clock", true);
    public static final b<Boolean> ci = a("force_back_button_enabled_always", false);
    public static final b<Boolean> cj = a("force_back_button_enabled_close_button", false);
    public static final b<Boolean> ck = a("force_back_button_enabled_poststitial", false);
    public static final b<Long> cl = a("inter_display_delay", 200L);
    public static final b<Boolean> cm = a("lock_specific_orientation", false);
    public static final b<Boolean> cn = a("lhs_skip_button", true);
    public static final b<String> co = a("soft_buttons_resource_id", "config_showNavigationBar");
    public static final b<Boolean> cp = a("countdown_toggleable", false);
    public static final b<Boolean> cq = a("track_app_killed", false);
    public static final b<Boolean> cr = a("mute_controls_enabled", false);
    public static final b<Boolean> cs = a("allow_user_muting", true);
    public static final b<Boolean> ct = a("mute_videos", false);
    public static final b<Boolean> cu = a("show_mute_by_default", false);
    public static final b<Boolean> cv = a("mute_with_user_settings", true);
    public static final b<Integer> cw = a("mute_button_size", 32);
    public static final b<Integer> cx = a("mute_button_margin", 10);
    public static final b<Integer> cy = a("mute_button_gravity", 85);
    public static final b<Boolean> cz = a("video_immersive_mode_enabled", false);
    public static final b<Long> cA = a("progress_bar_step", 25L);
    public static final b<Integer> cB = a("progress_bar_scale", 10000);
    public static final b<Integer> cC = a("progress_bar_vertical_padding", -8);
    public static final b<Long> cD = a("video_resume_delay", 250L);
    public static final b<Boolean> cE = a("is_video_skippable", false);
    public static final b<Integer> cF = a("vs_buffer_indicator_size", 50);
    public static final b<Boolean> cG = a("video_zero_length_as_computed", false);
    public static final b<Long> cH = a("set_poststitial_muted_initial_delay_ms", 500L);
    public static final b<Integer> cI = a("minepsv", -1);
    public static final b<Integer> cJ = a("maxepsv", -1);
    public static final b<Boolean> cK = a("pctfnc", false);
    public static final b<Integer> cL = a("submit_postback_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> cM = a("submit_postback_retries", 4);
    public static final b<Integer> cN = a("max_postback_attempts", 3);
    public static final b<Boolean> cO = a("fppopq", false);
    public static final b<Boolean> cP = a("retry_on_all_errors", false);
    public static final b<Integer> cQ = a("get_retry_delay_v1", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> cR = a("http_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> cS = a("http_socket_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(20)));
    public static final b<Boolean> cT = a("force_ssl", false);
    public static final b<Integer> cU = a("fetch_ad_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> cV = a("fetch_ad_retry_count_v1", 1);
    public static final b<Boolean> cW = a("faer", false);
    public static final b<Boolean> cX = a("faroae", false);
    public static final b<Integer> cY = a("submit_data_retry_count_v1", 1);
    public static final b<Integer> cZ = a("response_buffer_size", 16000);
    public static final b<Integer> da = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> db = a("fetch_basic_settings_retry_count", 3);
    public static final b<Boolean> dc = a("fetch_basic_settings_on_reconnect", false);
    public static final b<Boolean> dd = a("skip_fetch_basic_settings_if_not_connected", false);
    public static final b<Integer> de = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(2)));
    public static final b<Integer> df = a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(5)));
    public static final b<Boolean> dg = a("idflrwbe", false);
    public static final b<Boolean> dh = a("falawpr", false);
    public static final b<Boolean> di = a("sort_query_parameters", false);
    public static final b<Long> dj = a("communicator_request_timeout_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(10)));
    public static final b<Integer> dk = a("communicator_request_retry_count", 3);
    public static final b<Long> dl = a("communicator_request_retry_delay_ms", Long.valueOf(TimeUnit.SECONDS.toMillis(2)));
    public static final b<Integer> dm = a("ad_session_minutes", 60);
    public static final b<Boolean> dn = a("session_tracking_cooldown_on_event_fire", true);

    /* renamed from: do  reason: not valid java name */
    public static final b<Long> f0do = a("session_tracking_resumed_cooldown_minutes", 90L);
    public static final b<Long> dp = a("session_tracking_paused_cooldown_minutes", 90L);
    public static final b<Boolean> dq = a("qq", false);
    public static final b<Boolean> dr = a("qq1", true);
    public static final b<Boolean> ds = a("qq3", true);
    public static final b<Boolean> dt = a("qq4", true);
    public static final b<Boolean> du = a("qq5", true);
    public static final b<Boolean> dv = a("qq6", true);
    public static final b<Boolean> dw = a("qq7", true);
    public static final b<Boolean> dx = a("qq8", true);
    public static final b<Boolean> dy = a("pui", true);
    public static final b<String> dz = a("plugin_version", "");
    public static final b<Boolean> dA = a("hgn", false);
    public static final b<Boolean> dB = a("cso", false);
    public static final b<Boolean> dC = a("cfs", false);
    public static final b<Boolean> dD = a("cmi", false);
    public static final b<Boolean> dE = a("crat", false);
    public static final b<Boolean> dF = a("cvs", false);
    public static final b<Boolean> dG = a("caf", false);
    public static final b<Boolean> dH = a("cf", false);
    public static final b<Boolean> dI = a("cnr", false);
    public static final b<Boolean> dJ = a("adr", false);
    public static final b<Float> dK = a("volume_normalization_factor", Float.valueOf(6.6666665f));
    public static final b<Boolean> dL = a("system_user_agent_collection_enabled", false);
    public static final b<Boolean> dM = a("user_agent_collection_enabled", false);
    public static final b<Boolean> dN = a("http_headers_collection_enabled", false);
    public static final b<String> dO = a("webview_package_name", "com.google.android.webview");
    public static final b<Boolean> dP = a("collect_device_angle", false);
    public static final b<Boolean> dQ = a("collect_device_movement", false);
    public static final b<Float> dR = a("movement_degradation", Float.valueOf(0.75f));
    public static final b<Integer> dS = a("device_sensor_period_ms", Integer.valueOf((int) IronSourceConstants.INTERSTITIAL_DAILY_CAPPED));
    public static final b<Boolean> dT = a("dte", true);
    public static final b<Boolean> dU = a("idcw", false);
    public static final b<Long> dV = a("anr_debug_thread_refresh_time_ms", -1L);
    public static final b<Boolean> dW = a("is_track_ad_info", true);
    public static final b<Boolean> dX = a("submit_ad_stats_enabled", false);
    public static final b<Integer> dY = a("submit_ad_stats_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Integer> dZ = a("submit_ad_stats_retry_count", 1);
    public static final b<Integer> ea = a("submit_ad_stats_max_count", 500);
    public static final b<Boolean> eb = a("asdm", false);
    public static final b<String> ec = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
    public static final b<String> ed = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
    public static final b<Integer> ee = a("vast_max_response_length", 640000);
    public static final b<Integer> ef = a("vast_max_wrapper_depth", 5);
    public static final b<Long> eg = a("vast_progress_tracking_countdown_step", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
    public static final b<String> eh = a("vast_unsupported_video_extensions", "ogv,flv");
    public static final b<String> ei = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
    public static final b<Boolean> ej = a("vast_validate_with_extension_if_no_video_type", true);
    public static final b<Integer> ek = a("vast_video_selection_policy", Integer.valueOf(j.a.MEDIUM.ordinal()));
    public static final b<Integer> el = a("vast_wrapper_resolution_retry_count_v1", 1);
    public static final b<Integer> em = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(30)));
    public static final b<Boolean> en = a("ree", true);
    public static final b<Boolean> eo = a("btee", true);
    public static final b<Long> ep = a("server_timestamp_ms", 0L);
    public static final b<Long> eq = a("device_timestamp_ms", 0L);
    public static final b<Integer> er = a("gzip_min_length", 0);
    public static final b<Boolean> es = a("gzip_encoding_default", false);
    public static final b<Boolean> et = a("fetch_settings_gzip", false);
    public static final b<Boolean> eu = a("device_init_gzip", false);
    public static final b<Boolean> ev = a("fetch_ad_gzip", false);
    public static final b<Boolean> ew = a("event_tracking_gzip", false);
    public static final b<Boolean> ex = a("submit_ad_stats_gzip", false);
    public static final b<Boolean> ey = a("reward_postback_gzip", false);
    public static final b<Boolean> ez = a("zt_flush_gzip", false);
    public static final b<Boolean> eA = a("force_rerender", false);
    public static final b<Boolean> eB = a("daostr", false);
    public static final b<Boolean> eC = a("tctlaa", false);
    public static final b<Boolean> eD = a("rwvdv", false);
    public static final b<Boolean> eE = a("handle_render_process_gone", true);
    public static final b<Boolean> eF = a("comcr", true);
    public static final b<Boolean> eG = a("gcoas", false);
    public static final b<Boolean> eH = a("teorpc", false);
    public static final b<Boolean> eI = a("rmpibt", false);
    public static final b<Boolean> eJ = a("spbcioa", false);
    public static final b<Boolean> eK = a("set_webview_render_process_client", false);
    public static final b<Boolean> eL = a("disable_webview_hardware_acceleration", false);
    public static final b<Integer> eM = a("mmbfas", -1);
    public static final b<Boolean> eN = a("fvrunc", false);
    public static final b<Boolean> eO = a("dsaovcf", false);
    public static final b<Boolean> eP = a("daoar", false);
    public static final b<String> eQ = a("config_consent_dialog_state", "unknown");
    public static final b<String> eR = a("country_code", "");
    public static final b<String> eS = a("c_sticky_topics", "user_engagement_sdk_init,adjust_init,safedk_init,max_ad_events,send_http_request,adapter_initialization_status,privacy_setting_updated,network_sdk_version_updated");
    public static final b<Boolean> eT = a("zt_enabled", true);
    public static final b<String> eU = a("zt_endpoint", "https://a.applovin.com/");
    public static final b<String> eV = a("zt_backup_endpoint", "https://a.applvn.com/");
    public static final b<Integer> eW = a("zt_timeout_ms", Integer.valueOf((int) TimeUnit.SECONDS.toMillis(10)));
    public static final b<Long> eX = a("zt_flush_interval_s", -1L);
    public static final b<Boolean> eY = a("zt_bg_aware_timer", true);
    public static final b<Boolean> eZ = a("zt_flush_on_impression", true);
    public static final b<Boolean> fa = a("zt_flush_on_app_bg", false);
    public static final b<Boolean> fb = a("zt_continue_through_error", true);

    public b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.c = str;
        this.d = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T> b<T> a(String str, T t) {
        if (t != null) {
            if (!a.contains(t.getClass())) {
                throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
            }
            b<T> bVar = new b<>(str, t);
            if (!b.containsKey(str)) {
                b.put(str, bVar);
                return bVar;
            }
            throw new IllegalArgumentException("Setting has already been used: " + str);
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static Collection<b<?>> c() {
        return Collections.synchronizedCollection(b.values());
    }

    public T a(Object obj) {
        return (T) this.d.getClass().cast(obj);
    }

    public String a() {
        return this.c;
    }

    public T b() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof b) {
            return this.c.compareTo(((b) obj).a());
        }
        return 0;
    }
}
