package com.amazon.aps.iva.y30;

import com.crunchyroll.crunchyroid.R;
/* compiled from: PreferenceHeader.kt */
/* loaded from: classes2.dex */
public enum c {
    SWITCH_PROFILE(R.string.key_switch_profile, R.id.id_preference_switch_profile, R.string.switch_profile),
    MEMBERSHIP_PLAN(R.string.key_membership_plan, R.id.id_preference_membership_plan, R.string.membership_plan),
    PERSISTENT_MESSAGE_CENTER(R.string.key_persistent_message_center, R.id.id_preference_persistent_message_center, R.string.persistent_message_center_notifications),
    FREE_TRIAL_MEMBERSHIP(R.string.key_membership_plan, R.id.id_preference_free_membership, R.string.membership_plan),
    PREMIUM_MEMBERSHIP(R.string.key_membership_plan, R.id.id_preference_premium_membership, R.string.membership_plan),
    MEMBERSHIP_CARD(R.string.key_membership_card, R.id.id_preference_membership_card, R.string.membership_card),
    CHANGE_PHONE(R.string.key_change_phone, R.id.id_preference_change_phone, R.string.change_phone),
    CHANGE_EMAIL(R.string.key_change_email, R.id.id_preference_change_email, R.string.change_email),
    REDEEM_PROMO_CODE(R.string.key_redeem_promo_code, R.id.id_preference_redeem_promo_code, R.string.redeem_promo_code),
    PREFERRED_SUBTITLE_CC_LANGUAGE(R.string.key_preferred_subtitle_cc_language, R.id.id_preferred_subtitle_cc_language, R.string.preferred_subtitle_cc_language),
    PREFERRED_AUDIO_LANGUAGE(R.string.key_preferred_audio_language, R.id.id_preferred_audio_language, R.string.preferred_audio_language),
    SHOW_CLOSED_CAPTIONS(R.string.key_show_closed_captions, R.id.id_preference_show_closed_captions, 0, 4, null),
    CHANGE_PASSWORD(R.string.key_change_password, R.id.id_preference_change_password, R.string.change_password_screen_title),
    NEED_HELP(R.string.key_help_center, R.id.id_preference_need_help, 0, 4, null),
    SHOW_MATURE_CONTENT(R.string.key_show_mature_content, R.id.id_preference_show_mature_content, 0, 4, null),
    NOTIFICATIONS(R.string.key_notifications, R.id.id_preference_notifications, R.string.label_notification_settings),
    CONNECTED_APPS(R.string.key_connected_apps, R.id.id_preference_connected_apps, R.string.connected_apps_screen_title),
    SYNC_OVER_CELLULAR(R.string.key_switch_sync_over_cellular, R.id.id_preference_switch_sync_over_cellular, 0, 4, null),
    SYNC_QUALITY(R.string.key_sync_quality, R.id.id_preference_sync_quality, R.string.sync_quality),
    DO_NOT_SELL(R.string.key_do_not_sell, R.id.id_preference_do_not_sell_my_personal_information, R.string.do_not_sell_my_personal_information),
    ACCOUNT_DELETE(R.string.key_account_deletion, R.id.id_preference_account_deletion, R.string.account_deletion),
    WHATSAPP_HELP(R.string.key_whatsapp_help, R.id.id_preference_whatsapp_help, R.string.whatsapp_help),
    STREAM_OVER_CELLULAR(R.string.key_switch_stream_over_cellular, R.id.id_preference_switch_stream_over_cellular, 0, 4, null),
    MATURITY_RESTRICTIONS(R.string.key_maturity_restrictions, R.id.id_maturity_restrictions, R.string.maturity_restrictions),
    SIGN_OUT(R.string.key_log_out, R.id.id_preference_log_out, 0, 4, null),
    DEFAULT(0, 0, R.string.my_account, 3, null);
    
    public static final a Companion = new a();
    private final int keyId;
    private final int prefNameResId;
    private final int resId;

    /* compiled from: PreferenceHeader.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    c(int i, int i2, int i3) {
        this.keyId = i;
        this.resId = i2;
        this.prefNameResId = i3;
    }

    public final int getKeyId() {
        return this.keyId;
    }

    public final int getPrefNameResId() {
        return this.prefNameResId;
    }

    public final int getResId() {
        return this.resId;
    }

    /* synthetic */ c(int i, int i2, int i3, int i4, com.amazon.aps.iva.yb0.e eVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
