package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzezz {
    public final zzcdv zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final int zzM;
    public final int zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final String zzQ;
    public final zzfau zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final int zzU;
    public final String zzV;
    public final int zzW;
    public final String zzX;
    public final boolean zzY;
    public final zzbzw zzZ;
    public final List<String> zza;
    public final boolean zzaa;
    public final zzbdn zzab;
    public final String zzac;
    public final boolean zzad;
    public final JSONObject zzae;
    public final boolean zzaf;
    public final JSONObject zzag;
    public final boolean zzah;
    public final String zzai;
    public final boolean zzaj;
    public final int zzb;
    public final List<String> zzc;
    public final List<String> zzd;
    public final List<String> zze;
    public final int zzf;
    public final List<String> zzg;
    public final List<String> zzh;
    public final List<String> zzi;
    public final List<String> zzj;
    public final String zzk;
    public final String zzl;
    public final zzccl zzm;
    public final List<String> zzn;
    public final List<String> zzo;
    public final List<String> zzp;
    public final int zzq;
    public final List<zzfaa> zzr;
    public final zzfae zzs;
    public final List<String> zzt;
    public final List<zzfaa> zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    public zzezz(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        List<String> list2;
        char c2;
        List<String> emptyList = Collections.emptyList();
        List<String> emptyList2 = Collections.emptyList();
        List<String> emptyList3 = Collections.emptyList();
        List<String> emptyList4 = Collections.emptyList();
        List<String> emptyList5 = Collections.emptyList();
        Collections.emptyList();
        List<String> emptyList6 = Collections.emptyList();
        List<String> emptyList7 = Collections.emptyList();
        List<String> emptyList8 = Collections.emptyList();
        List<String> emptyList9 = Collections.emptyList();
        List<String> emptyList10 = Collections.emptyList();
        List<zzfaa> emptyList11 = Collections.emptyList();
        List<String> emptyList12 = Collections.emptyList();
        List<zzfaa> emptyList13 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        List zzi = zzfoj.zzi();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject3;
        JSONObject jSONObject8 = jSONObject4;
        JSONObject jSONObject9 = jSONObject5;
        JSONObject jSONObject10 = jSONObject6;
        List list3 = zzi;
        zzfae zzfaeVar = null;
        zzcdv zzcdvVar = null;
        zzbzw zzbzwVar = null;
        zzbdn zzbdnVar = null;
        String str = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i3 = -1;
        int i4 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i5 = 0;
        int i6 = -1;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        List<String> list4 = emptyList12;
        List<zzfaa> list5 = emptyList13;
        JSONObject jSONObject11 = jSONObject;
        JSONObject jSONObject12 = jSONObject2;
        zzccl zzcclVar = null;
        String str12 = str11;
        int i7 = 0;
        int i8 = 0;
        List<zzfaa> list6 = emptyList11;
        String str13 = str12;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str14 = nextName == null ? "" : nextName;
            switch (str14.hashCode()) {
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_signals")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("omid_settings")) {
                        c2 = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("play_prewarm_options")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_interscroller")) {
                        c2 = '5';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("backend_query_id")) {
                        c2 = '/';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_custom_close_blocked")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("orientation")) {
                        c2 = CoreConstants.PERCENT_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("enable_omid")) {
                        c2 = CoreConstants.SINGLE_QUOTE_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("buffer_click_url_as_ready_to_ping")) {
                        c2 = '>';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("showable_impression_type")) {
                        c2 = CoreConstants.COMMA_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_cover")) {
                        c2 = '6';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_sizes")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("adapters")) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("test_mode_enabled")) {
                        c2 = CoreConstants.DOUBLE_QUOTE_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("extras")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_event_value")) {
                        c2 = '3';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_rendered_attribution")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_urls")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_type")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_scroll_aware")) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("fill_urls")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allocation_id")) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_complete_urls")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("active_view")) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("valid_from_timestamp")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("click_urls")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("safe_browsing")) {
                        c2 = 26;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("imp_urls")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rtb_native_required_assets")) {
                        c2 = '9';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_timeout_ms")) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_close_time_ms")) {
                        c2 = CoreConstants.DASH_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("content_url")) {
                        c2 = ';';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_close_button_enabled")) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("force_disable_hardware_acceleration")) {
                        c2 = '<';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("watermark")) {
                        c2 = CoreConstants.DOT;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("native_required_asset_viewability")) {
                        c2 = CoreConstants.COLON_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_offline_ad")) {
                        c2 = '8';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_custom_click_gesture")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad")) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(FacebookAdapter.KEY_ID)) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("data")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_test_label")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("qdata")) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_load_urls")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_closable_area_disabled")) {
                        c2 = CoreConstants.DOLLAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_timeout_ms")) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_dialog_string")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("reward_granted_urls")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("container_sizes")) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("impression_type")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER)) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rewards")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("cache_hit_urls")) {
                        c2 = '=';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_owned_ad_view")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("bid_response")) {
                        c2 = CoreConstants.LEFT_PARENTHESIS_CHAR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_start_urls")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_network_class_name")) {
                        c2 = '7';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_reward_urls")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("use_third_party_container_height")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("renderers")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_analytics_logging_enabled")) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rule_line_external_id")) {
                        c2 = '4';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str14.equals("manual_tracking_urls")) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 1:
                    i8 = zzb(jsonReader.nextString());
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 5:
                    i7 = zzc(jsonReader.nextInt());
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 7:
                    com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case '\b':
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case '\t':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case '\n':
                    str12 = jsonReader.nextString();
                    break;
                case 11:
                    str13 = jsonReader.nextString();
                    break;
                case '\f':
                    zzcclVar = zzccl.zza(com.google.android.gms.ads.internal.util.zzbx.zzd(jsonReader));
                    break;
                case '\r':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 14:
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    continue;
                    emptyList10 = list2;
                case 15:
                    list2 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 16:
                    i2 = jsonReader.nextInt();
                    break;
                case 17:
                    list6 = zzfaa.zza(jsonReader);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    zzfaeVar = new zzfae(jsonReader);
                    break;
                case 19:
                    list5 = zzfaa.zza(jsonReader);
                    break;
                case 20:
                    list4 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    str3 = jsonReader.nextString();
                    break;
                case 24:
                    str4 = jsonReader.nextString();
                    break;
                case 25:
                    str5 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader).toString();
                    break;
                case 26:
                    zzcdvVar = zzcdv.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    break;
                case 27:
                    str6 = jsonReader.nextString();
                    break;
                case 28:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case 29:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i3 = zzd(jsonReader.nextString());
                    break;
                case '&':
                    i4 = jsonReader.nextInt();
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i5 = jsonReader.nextInt();
                    break;
                case '-':
                    i6 = jsonReader.nextInt();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case SyslogConstants.LOG_LPR /* 48 */:
                    z11 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbzwVar = zzbzw.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    break;
                case '2':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '3':
                    zzbdnVar = zzbdn.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    break;
                case '4':
                    str10 = jsonReader.nextString();
                    break;
                case '5':
                    z13 = jsonReader.nextBoolean();
                    break;
                case '6':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 55 */:
                    str11 = jsonReader.nextString();
                    break;
                case SyslogConstants.LOG_NEWS /* 56 */:
                    z14 = jsonReader.nextBoolean();
                    break;
                case '9':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case ':':
                    z15 = jsonReader.nextBoolean();
                    break;
                case ';':
                    str = jsonReader.nextString();
                    break;
                case '<':
                    z16 = jsonReader.nextBoolean();
                    break;
                case '=':
                    list3 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case '>':
                    z17 = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
            emptyList9 = list;
            emptyList10 = list2;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i8;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i7;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str12;
        this.zzl = str13;
        this.zzm = zzcclVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = i2;
        this.zzr = list6;
        this.zzs = zzfaeVar;
        this.zzt = list4;
        this.zzu = list5;
        this.zzw = str2;
        this.zzv = jSONObject11;
        this.zzx = str3;
        this.zzy = str4;
        this.zzz = str5;
        this.zzA = zzcdvVar;
        this.zzB = str6;
        this.zzC = jSONObject12;
        this.zzD = jSONObject7;
        this.zzF = z;
        this.zzG = z2;
        this.zzH = z3;
        this.zzI = z4;
        this.zzJ = z5;
        this.zzK = z6;
        this.zzL = z7;
        this.zzM = i3;
        this.zzN = i4;
        this.zzP = z8;
        this.zzQ = str7;
        this.zzR = new zzfau(jSONObject8);
        this.zzS = z9;
        this.zzT = z10;
        this.zzU = i5;
        this.zzV = str8;
        this.zzW = i6;
        this.zzX = str9;
        this.zzY = z11;
        this.zzZ = zzbzwVar;
        this.zzaa = z12;
        this.zzab = zzbdnVar;
        this.zzac = str10;
        this.zzad = z13;
        this.zzae = jSONObject9;
        this.zzE = str11;
        this.zzaf = z14;
        this.zzag = jSONObject10;
        this.zzah = z15;
        this.zzai = str;
        this.zzaj = z16;
        this.zze = list3;
        this.zzO = z17;
    }

    public static String zza(int i2) {
        switch (i2) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str) || "app_open_ad_v2".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i2) {
        if (i2 == 0 || i2 == 1) {
            return i2;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
