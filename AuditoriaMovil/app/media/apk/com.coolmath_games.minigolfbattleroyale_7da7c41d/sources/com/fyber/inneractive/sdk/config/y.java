package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class y implements z {
    public com.fyber.inneractive.sdk.a.a.a a;
    b b;
    private Map<UnitDisplayType, Map<String, String>> c = new HashMap();
    private Map<String, String> d = new HashMap();

    public final long a(String str) {
        try {
            return Long.parseLong(a(str, ""));
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final String a(String str, String str2) {
        String str3 = this.d.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public final void a(UnitDisplayType unitDisplayType, String str, String str2) {
        Map<String, String> map = this.c.get(unitDisplayType);
        if (map == null) {
            map = new HashMap<>();
            this.c.put(unitDisplayType, map);
        }
        map.put(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.z
    public final void b(String str, String str2) {
        this.d.put(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.z
    public final void a() {
        this.c.clear();
    }

    public final void a(com.fyber.inneractive.sdk.a.a.a.b bVar, int i) {
        this.a.a(bVar, i);
    }

    @Override // com.fyber.inneractive.sdk.config.z
    public final void b() {
        com.fyber.inneractive.sdk.a.a.a aVar = this.a;
        aVar.a(aVar.a);
        aVar.a(com.fyber.inneractive.sdk.a.a.a.b.NONE, com.fyber.inneractive.sdk.a.a.a.a.d);
    }

    public final void a(UnitDisplayType unitDisplayType, String... strArr) {
        for (String str : strArr) {
            a(unitDisplayType, str, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    public final String a(UnitDisplayType unitDisplayType, String str) {
        Map<String, String> map = this.c.get(unitDisplayType);
        return (map == null || map.get(str) == null) ? "" : map.get(str);
    }
}
