package com.google.android.gms.games.internal.player;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-games@@21.0.0 */
/* loaded from: classes.dex */
public final class zzd {
    public final String name;
    public final String zzbe;
    public final String zzbj;
    public final String zzce;
    public final String zzhz;
    public final String zzia;
    public final String zzib;
    public final String zzic;
    public final String zzid;
    public final String zzie;
    public final String zzif;
    public final String zzig;
    public final String zzih;
    public final String zzii;
    public final String zzij;
    public final String zzik;
    public final String zzil;
    public final String zzim;
    public final String zzin;
    public final String zzio;
    private final String zzip;
    public final String zziq;
    public final String zzir;
    public final String zzis;
    public final String zzit;
    public final String zziu;
    public final String zziv;
    public final String zziw;
    public final String zzix;
    public final String zziy;
    public final String zziz;
    public final String zzja;
    public final String zzjb;
    @Deprecated
    private final String zzjc;
    @Deprecated
    private final String zzjd;
    @Deprecated
    private final String zzje;
    public final String zzjf;
    public final String zzjg;
    public final String zzjh;
    public final String zzji;
    private final String zzjj;
    public final String zzjk;

    public zzd(String str) {
        String concat;
        if (TextUtils.isEmpty(null)) {
            this.zzhz = "external_player_id";
            this.zzia = "profile_name";
            this.zzib = "profile_icon_image_uri";
            this.zzic = "profile_icon_image_url";
            this.zzid = "profile_hi_res_image_uri";
            this.zzie = "profile_hi_res_image_url";
            this.zzif = "last_updated";
            this.zzig = "is_in_circles";
            this.zzih = "played_with_timestamp";
            this.zzii = "current_xp_total";
            this.zzij = "current_level";
            this.zzik = "current_level_min_xp";
            this.zzil = "current_level_max_xp";
            this.zzim = "next_level";
            this.zzin = "next_level_max_xp";
            this.zzio = "last_level_up_timestamp";
            this.zzbe = "player_title";
            this.zzip = "has_all_public_acls";
            this.zziq = "is_profile_visible";
            this.zzir = "most_recent_external_game_id";
            this.zzis = "most_recent_game_name";
            this.zzit = "most_recent_activity_timestamp";
            this.zziu = "most_recent_game_icon_uri";
            this.zziv = "most_recent_game_hi_res_uri";
            this.zziw = "most_recent_game_featured_uri";
            this.zzix = "has_debug_access";
            this.zzbj = "gamer_tag";
            this.name = "real_name";
            this.zziy = "banner_image_landscape_uri";
            this.zziz = "banner_image_landscape_url";
            this.zzja = "banner_image_portrait_uri";
            this.zzjb = "banner_image_portrait_url";
            this.zzjc = "gamer_friend_status";
            this.zzjd = "gamer_friend_update_timestamp";
            this.zzje = "is_muted";
            this.zzjf = "total_unlocked_achievements";
            this.zzjg = com.google.android.gms.games.internal.zzd.zzda;
            this.zzjh = com.google.android.gms.games.internal.zzd.zzdb;
            this.zzji = com.google.android.gms.games.internal.zzd.zzdc;
            this.zzjj = "profile_creation_timestamp";
            this.zzce = com.google.android.gms.games.internal.zzd.zzdd;
            concat = "friends_list_visibility";
        } else {
            this.zzhz = "external_player_id".length() != 0 ? "null".concat("external_player_id") : new String("null");
            this.zzia = "profile_name".length() != 0 ? "null".concat("profile_name") : new String("null");
            this.zzib = "profile_icon_image_uri".length() != 0 ? "null".concat("profile_icon_image_uri") : new String("null");
            this.zzic = "profile_icon_image_url".length() != 0 ? "null".concat("profile_icon_image_url") : new String("null");
            this.zzid = "profile_hi_res_image_uri".length() != 0 ? "null".concat("profile_hi_res_image_uri") : new String("null");
            this.zzie = "profile_hi_res_image_url".length() != 0 ? "null".concat("profile_hi_res_image_url") : new String("null");
            this.zzif = "last_updated".length() != 0 ? "null".concat("last_updated") : new String("null");
            this.zzig = "is_in_circles".length() != 0 ? "null".concat("is_in_circles") : new String("null");
            this.zzih = "played_with_timestamp".length() != 0 ? "null".concat("played_with_timestamp") : new String("null");
            this.zzii = "current_xp_total".length() != 0 ? "null".concat("current_xp_total") : new String("null");
            this.zzij = "current_level".length() != 0 ? "null".concat("current_level") : new String("null");
            this.zzik = "current_level_min_xp".length() != 0 ? "null".concat("current_level_min_xp") : new String("null");
            this.zzil = "current_level_max_xp".length() != 0 ? "null".concat("current_level_max_xp") : new String("null");
            this.zzim = "next_level".length() != 0 ? "null".concat("next_level") : new String("null");
            this.zzin = "next_level_max_xp".length() != 0 ? "null".concat("next_level_max_xp") : new String("null");
            this.zzio = "last_level_up_timestamp".length() != 0 ? "null".concat("last_level_up_timestamp") : new String("null");
            this.zzbe = "player_title".length() != 0 ? "null".concat("player_title") : new String("null");
            this.zzip = "has_all_public_acls".length() != 0 ? "null".concat("has_all_public_acls") : new String("null");
            this.zziq = "is_profile_visible".length() != 0 ? "null".concat("is_profile_visible") : new String("null");
            this.zzir = "most_recent_external_game_id".length() != 0 ? "null".concat("most_recent_external_game_id") : new String("null");
            this.zzis = "most_recent_game_name".length() != 0 ? "null".concat("most_recent_game_name") : new String("null");
            this.zzit = "most_recent_activity_timestamp".length() != 0 ? "null".concat("most_recent_activity_timestamp") : new String("null");
            this.zziu = "most_recent_game_icon_uri".length() != 0 ? "null".concat("most_recent_game_icon_uri") : new String("null");
            this.zziv = "most_recent_game_hi_res_uri".length() != 0 ? "null".concat("most_recent_game_hi_res_uri") : new String("null");
            this.zziw = "most_recent_game_featured_uri".length() != 0 ? "null".concat("most_recent_game_featured_uri") : new String("null");
            this.zzix = "has_debug_access".length() != 0 ? "null".concat("has_debug_access") : new String("null");
            this.zzbj = "gamer_tag".length() != 0 ? "null".concat("gamer_tag") : new String("null");
            this.name = "real_name".length() != 0 ? "null".concat("real_name") : new String("null");
            this.zziy = "banner_image_landscape_uri".length() != 0 ? "null".concat("banner_image_landscape_uri") : new String("null");
            this.zziz = "banner_image_landscape_url".length() != 0 ? "null".concat("banner_image_landscape_url") : new String("null");
            this.zzja = "banner_image_portrait_uri".length() != 0 ? "null".concat("banner_image_portrait_uri") : new String("null");
            this.zzjb = "banner_image_portrait_url".length() != 0 ? "null".concat("banner_image_portrait_url") : new String("null");
            this.zzjc = "gamer_friend_status".length() != 0 ? "null".concat("gamer_friend_status") : new String("null");
            this.zzjd = "gamer_friend_update_timestamp".length() != 0 ? "null".concat("gamer_friend_update_timestamp") : new String("null");
            this.zzje = "is_muted".length() != 0 ? "null".concat("is_muted") : new String("null");
            this.zzjf = "total_unlocked_achievements".length() != 0 ? "null".concat("total_unlocked_achievements") : new String("null");
            String valueOf = String.valueOf(com.google.android.gms.games.internal.zzd.zzda);
            this.zzjg = valueOf.length() != 0 ? "null".concat(valueOf) : new String("null");
            String valueOf2 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdb);
            this.zzjh = valueOf2.length() != 0 ? "null".concat(valueOf2) : new String("null");
            String valueOf3 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdc);
            this.zzji = valueOf3.length() != 0 ? "null".concat(valueOf3) : new String("null");
            this.zzjj = "profile_creation_timestamp".length() != 0 ? "null".concat("profile_creation_timestamp") : new String("null");
            String valueOf4 = String.valueOf(com.google.android.gms.games.internal.zzd.zzdd);
            this.zzce = valueOf4.length() != 0 ? "null".concat(valueOf4) : new String("null");
            concat = "friends_list_visibility".length() != 0 ? "null".concat("friends_list_visibility") : new String("null");
        }
        this.zzjk = concat;
    }
}
