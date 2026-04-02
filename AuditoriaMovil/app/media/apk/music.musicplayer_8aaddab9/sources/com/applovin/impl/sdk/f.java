package com.applovin.impl.sdk;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdContentRating;
import com.applovin.sdk.AppLovinGender;
import com.applovin.sdk.AppLovinTargetingData;
import com.google.android.gms.common.Scopes;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class f implements AppLovinTargetingData {
    private final Map<String, String> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f4096b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Integer f4097c = null;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinGender f4098d = null;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinAdContentRating f4099e = null;

    /* renamed from: f  reason: collision with root package name */
    private String f4100f = null;

    /* renamed from: g  reason: collision with root package name */
    private String f4101g = null;

    /* renamed from: h  reason: collision with root package name */
    private List<String> f4102h = null;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f4103i = null;

    private void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f4096b) {
            if (StringUtils.isValidString(str2)) {
                this.a.put(str, str2);
            } else {
                this.a.remove(str);
            }
        }
    }

    public Map<String, String> a() {
        HashMap hashMap;
        synchronized (this.f4096b) {
            hashMap = new HashMap(this.a);
        }
        return hashMap;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void clearAll() {
        synchronized (this.f4096b) {
            this.a.clear();
        }
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getEmail() {
        return this.f4100f;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinGender getGender() {
        return this.f4098d;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getInterests() {
        return this.f4103i;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public List<String> getKeywords() {
        return this.f4102h;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public AppLovinAdContentRating getMaximumAdContentRating() {
        return this.f4099e;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public String getPhoneNumber() {
        return this.f4101g;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public Integer getYearOfBirth() {
        return this.f4097c;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setEmail(String str) {
        a(Scopes.EMAIL, str != null ? StringUtils.toFullSHA1Hash(str.toLowerCase().trim()) : str);
        this.f4100f = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setGender(AppLovinGender appLovinGender) {
        String str;
        if (appLovinGender != null) {
            if (appLovinGender == AppLovinGender.FEMALE) {
                str = "F";
            } else if (appLovinGender == AppLovinGender.MALE) {
                str = "M";
            } else if (appLovinGender == AppLovinGender.OTHER) {
                str = "O";
            }
            a("gender", str);
            this.f4098d = appLovinGender;
        }
        str = null;
        a("gender", str);
        this.f4098d = appLovinGender;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setInterests(List<String> list) {
        a("interests", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f4103i = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setKeywords(List<String> list) {
        a("keywords", list == null ? null : CollectionUtils.implode(list, list.size()));
        this.f4102h = list;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setMaximumAdContentRating(AppLovinAdContentRating appLovinAdContentRating) {
        a("maximum_ad_content_rating", (appLovinAdContentRating == null || appLovinAdContentRating == AppLovinAdContentRating.NONE) ? null : Integer.toString(appLovinAdContentRating.ordinal()));
        this.f4099e = appLovinAdContentRating;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setPhoneNumber(String str) {
        a("phone_number", str != null ? StringUtils.toFullSHA1Hash(str.replaceAll("[^0-9]", "")) : str);
        this.f4101g = str;
    }

    @Override // com.applovin.sdk.AppLovinTargetingData
    public void setYearOfBirth(Integer num) {
        a("year_of_birth", num == null ? null : Integer.toString(num.intValue()));
        this.f4097c = num;
    }
}
