package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzezz(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List<String> list;
        List<String> list2;
        char c;
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
        boolean z = true;
        int i = -1;
        int i2 = -1;
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
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i4 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i5 = 0;
        boolean z12 = false;
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
        int i6 = 0;
        int i7 = 0;
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
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(AdUnitActivity.EXTRA_ORIENTATION)) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("buffer_click_url_as_ready_to_ping")) {
                        c = Typography.greater;
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("test_mode_enabled")) {
                        c = Typography.quote;
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("fill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_complete_urls")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("valid_from_timestamp")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rtb_native_required_assets")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_timeout_ms")) {
                        c = Typography.amp;
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals(ShareConstants.STORY_DEEP_LINK_URL)) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("force_disable_hardware_acceleration")) {
                        c = Typography.less;
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("native_required_asset_viewability")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_offline_ad")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("id")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_closable_area_disabled")) {
                        c = Typography.dollar;
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 673261304:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("reward_granted_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("transaction_id")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rewards")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("cache_hit_urls")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("video_reward_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str14.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str14.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 1:
                    i7 = zzb(jsonReader.nextString());
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
                    i6 = zzc(jsonReader.nextInt());
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
                    i3 = jsonReader.nextInt();
                    break;
                case 17:
                    list6 = zzfaa.zza(jsonReader);
                    break;
                case 18:
                    zzfaeVar = new zzfae(jsonReader);
                    break;
                case 19:
                    list5 = zzfaa.zza(jsonReader);
                    break;
                case 20:
                    list4 = com.google.android.gms.ads.internal.util.zzbx.zzb(jsonReader);
                    break;
                case 21:
                    str2 = jsonReader.nextString();
                    break;
                case 22:
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case 23:
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
                    z2 = jsonReader.nextBoolean();
                    break;
                case 31:
                    z3 = jsonReader.nextBoolean();
                    break;
                case ' ':
                    z4 = jsonReader.nextBoolean();
                    break;
                case '!':
                    z5 = jsonReader.nextBoolean();
                    break;
                case '\"':
                    z6 = jsonReader.nextBoolean();
                    break;
                case '#':
                    z7 = jsonReader.nextBoolean();
                    break;
                case '$':
                    z8 = jsonReader.nextBoolean();
                    break;
                case '%':
                    i = zzd(jsonReader.nextString());
                    break;
                case '&':
                    i4 = jsonReader.nextInt();
                    break;
                case '\'':
                    z9 = jsonReader.nextBoolean();
                    break;
                case '(':
                    str7 = jsonReader.nextString();
                    break;
                case ')':
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader);
                    break;
                case '*':
                    z10 = jsonReader.nextBoolean();
                    break;
                case '+':
                    z11 = jsonReader.nextBoolean();
                    break;
                case ',':
                    i5 = jsonReader.nextInt();
                    break;
                case '-':
                    i2 = jsonReader.nextInt();
                    break;
                case '.':
                    str8 = jsonReader.nextString();
                    break;
                case '/':
                    str9 = jsonReader.nextString();
                    break;
                case '0':
                    z12 = jsonReader.nextBoolean();
                    break;
                case '1':
                    zzbzwVar = zzbzw.zza(com.google.android.gms.ads.internal.util.zzbx.zzc(jsonReader));
                    break;
                case '2':
                    z = jsonReader.nextBoolean();
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
                case '7':
                    str11 = jsonReader.nextString();
                    break;
                case '8':
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
        this.zzb = i7;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i6;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str12;
        this.zzl = str13;
        this.zzm = zzcclVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = i3;
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
        this.zzF = z2;
        this.zzG = z3;
        this.zzH = z4;
        this.zzI = z5;
        this.zzJ = z6;
        this.zzK = z7;
        this.zzL = z8;
        this.zzM = i;
        this.zzN = i4;
        this.zzP = z9;
        this.zzQ = str7;
        this.zzR = new zzfau(jSONObject8);
        this.zzS = z10;
        this.zzT = z11;
        this.zzU = i5;
        this.zzV = str8;
        this.zzW = i2;
        this.zzX = str9;
        this.zzY = z12;
        this.zzZ = zzbzwVar;
        this.zzaa = z;
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

    public static String zza(int i) {
        switch (i) {
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
        if (IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE.equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if (AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE.equals(str)) {
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

    private static int zzc(int i) {
        if (i == 0 || i == 1) {
            return i;
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
