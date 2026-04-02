package com.adcolony.sdk;

import bolts.MeasurementEvent;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.umeng.analytics.pro.bg;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AdColonyEventTracker {
    public static final String CUSTOM_EVENT_1 = "ADCT_CUSTOM_EVENT_1";
    public static final String CUSTOM_EVENT_2 = "ADCT_CUSTOM_EVENT_2";
    public static final String CUSTOM_EVENT_3 = "ADCT_CUSTOM_EVENT_3";
    public static final String CUSTOM_EVENT_4 = "ADCT_CUSTOM_EVENT_4";
    public static final String CUSTOM_EVENT_5 = "ADCT_CUSTOM_EVENT_5";
    public static final String LOGIN_DEFAULT = "ADCT_DEFAULT_LOGIN";
    public static final String LOGIN_FACEBOOK = "ADCT_FACEBOOK_LOGIN";
    public static final String LOGIN_GOOGLE = "ADCT_GOOGLE_LOGIN";
    public static final String LOGIN_LINKEDIN = "ADCT_LINKEDIN_LOGIN";
    public static final String LOGIN_OPENID = "ADCT_OPENID_LOGIN";
    public static final String LOGIN_TWITTER = "ADCT_TWITTER_LOGIN";
    public static final String REGISTRATION_CUSTOM = "ADCT_CUSTOM_REGISTRATION";
    public static final String REGISTRATION_DEFAULT = "ADCT_DEFAULT_REGISTRATION";
    public static final String REGISTRATION_FACEBOOK = "ADCT_FACEBOOK_REGISTRATION";
    public static final String REGISTRATION_GOOGLE = "ADCT_GOOGLE_REGISTRATION";
    public static final String REGISTRATION_LINKEDIN = "ADCT_LINKEDIN_REGISTRATION";
    public static final String REGISTRATION_OPENID = "ADCT_OPENID_REGISTRATION";
    public static final String REGISTRATION_TWITTER = "ADCT_TWITTER_REGISTRATION";
    public static final String SOCIAL_SHARING_CUSTOM = "ADCT_CUSTOM_SHARING";
    public static final String SOCIAL_SHARING_FACEBOOK = "ADCT_FACEBOOK_SHARING";
    public static final String SOCIAL_SHARING_FLICKR = "ADCT_FLICKR_SHARING";
    public static final String SOCIAL_SHARING_FOURSQUARE = "ADCT_FOURSQUARE_SHARING";
    public static final String SOCIAL_SHARING_GOOGLE = "ADCT_GOOGLE_SHARING";
    public static final String SOCIAL_SHARING_INSTAGRAM = "ADCT_INSTAGRAM_SHARING";
    public static final String SOCIAL_SHARING_LINKEDIN = "ADCT_LINKEDIN_SHARING";
    public static final String SOCIAL_SHARING_PINTEREST = "ADCT_PINTEREST_SHARING";
    public static final String SOCIAL_SHARING_SNAPCHAT = "ADCT_SNAPCHAT_SHARING";
    public static final String SOCIAL_SHARING_TUMBLR = "ADCT_TUMBLR_SHARING";
    public static final String SOCIAL_SHARING_TWITTER = "ADCT_TWITTER_SHARING";
    public static final String SOCIAL_SHARING_VIMEO = "ADCT_VIMEO_SHARING";
    public static final String SOCIAL_SHARING_VINE = "ADCT_VINE_SHARING";
    public static final String SOCIAL_SHARING_YOUTUBE = "ADCT_YOUTUBE_SHARING";
    private static final List<JSONObject> a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(JSONObject jSONObject) {
        synchronized (a) {
            if (200 > a.size()) {
                a.add(jSONObject);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        if (!af.z().equals("")) {
            synchronized (a) {
                for (JSONObject jSONObject : a) {
                    ADCNative.EventTracker__logEvent(jSONObject);
                }
                a.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        boolean z;
        synchronized (a) {
            z = a.size() != 0;
        }
        return z;
    }

    public static void logTransaction(String str, Integer num, Double d, String str2, String str3, String str4, String str5) {
        if (!a(str5, "logTransaction")) {
            if (str2 != null && str2.length() != 3) {
                au.g.b("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", str);
            hashMap.put("quantity", String.valueOf(num));
            hashMap.put(InAppPurchaseMetaData.KEY_PRICE, String.valueOf(d));
            hashMap.put("currency_code", str2);
            hashMap.put("receipt", str3);
            hashMap.put("store", str4);
            hashMap.put("description", str5);
            logEvent("transaction", hashMap);
        }
    }

    public static void logCreditsSpent(String str, Integer num, Double d, String str2) {
        if (str2 != null && str2.length() != 3) {
            au.g.b("Event logCreditsSpentWithName currency code is specified, but a three-letter ISO 4217 code, (e.g.: 'USD'). Event will not be sent.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("quantity", String.valueOf(num));
        hashMap.put("value", String.valueOf(d));
        hashMap.put("currency_code", str2);
        logEvent("credits_spent", hashMap);
    }

    public static void logPaymentInfoAdded() {
        logEvent("payment_info_added");
    }

    public static void logAchievementUnlocked(String str) {
        if (!a(str, "logAchievementUnlocked")) {
            HashMap hashMap = new HashMap();
            hashMap.put("description", str);
            logEvent("achievement_unlocked", hashMap);
        }
    }

    public static void logLevelAchieved(Integer num) {
        HashMap hashMap = new HashMap();
        hashMap.put("level_achieved", String.valueOf(num));
        logEvent("level_achieved", hashMap);
    }

    public static void logAppRated() {
        logEvent("app_rated");
    }

    public static void logActivated() {
        logEvent("activated");
    }

    public static void logTutorialCompleted() {
        logEvent("tutorial_completed");
    }

    public static void logSocialSharingEvent(String str, String str2) {
        if (!a(str2, "logSocialSharingEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("network", str);
            hashMap.put("description", str2);
            logEvent("social_sharing_event", hashMap);
        }
    }

    public static void logRegistrationCompleted(String str, String str2) {
        if (!a(str2, "logRegistrationCompleted")) {
            HashMap hashMap = new HashMap();
            hashMap.put("method", str);
            hashMap.put("description", str2);
            logEvent("registration_completed", hashMap);
        }
    }

    public static void logCustomEvent(String str, String str2) {
        if (!a(str2, "logCustomEvent")) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("description", str2);
            logEvent("custom_event", hashMap);
        }
    }

    public static void logAddToCart(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_cart", hashMap);
    }

    public static void logAddToWishlist(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", str);
        logEvent("add_to_wishlist", hashMap);
    }

    public static void logCheckoutInitiated() {
        logEvent("checkout_initiated");
    }

    public static void logContentView(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("content_id", str);
        hashMap.put("content_type", str2);
        logEvent("content_view", hashMap);
    }

    public static void logInvite() {
        logEvent("invite");
    }

    public static void logLogin(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("method", str);
        logEvent("login", hashMap);
    }

    public static void logReservation() {
        logEvent("reservation");
    }

    public static void logSearch(String str) {
        if (str != null && str.length() > 512) {
            au.g.b("logSearch searchString cannot exceed 512 characters. Event will not be sent.");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("search_string", str);
        logEvent("search", hashMap);
    }

    public static void logEvent(String str) {
        logEvent(str, null);
    }

    public static void logEvent(String str, HashMap<String, String> hashMap) {
        JSONObject a2 = as.a();
        as.a(a2, MeasurementEvent.MEASUREMENT_EVENT_NAME_KEY, str);
        JSONObject a3 = as.a();
        if (hashMap != null) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (entry.getValue() != null && !entry.getValue().equals("null")) {
                    as.a(a3, entry.getKey(), entry.getValue());
                }
            }
        }
        b(a3);
        as.a(a2, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, a3);
        ADCNative.EventTracker__logEvent(a2);
    }

    private static void b(JSONObject jSONObject) {
        as.a(jSONObject, bg.M, TimeZone.getDefault().getID());
        as.a(jSONObject, "action_time", String.valueOf(Math.round((float) (System.currentTimeMillis() / 1000))));
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() <= 512) {
            return false;
        }
        au.g.a("Description of event ").a(str2).b(" must be less than 512 characters");
        return true;
    }
}
