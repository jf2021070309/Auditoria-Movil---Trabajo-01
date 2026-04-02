package com.applovin.impl.mediation.b;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d extends com.applovin.impl.sdk.e.a {
    private final String a;

    /* renamed from: c  reason: collision with root package name */
    private final String f3422c;

    /* renamed from: d  reason: collision with root package name */
    private final com.applovin.impl.mediation.a.f f3423d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f3424e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f3425f;

    /* renamed from: g  reason: collision with root package name */
    private final MaxError f3426g;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.f fVar, m mVar) {
        super("TaskFireMediationPostbacks", mVar);
        this.a = str;
        this.f3422c = e.a.d.a.a.k(str, "_urls");
        this.f3424e = Utils.toUrlSafeMap(map);
        this.f3426g = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.f3423d = fVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", fVar.P());
        if (fVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) fVar;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.m());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f3425f = hashMap;
    }

    private String a(String str, MaxError maxError) {
        int i2;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i2 = maxAdapterError.getThirdPartySdkErrorCode();
            str2 = maxAdapterError.getThirdPartySdkErrorMessage();
        } else {
            i2 = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUrlString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i2)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUrlString(str2));
    }

    private List<String> a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String str : map.keySet()) {
                next = next.replace(str, this.f3423d.g(map.get(str)));
            }
            arrayList.add(a(b(next, map2), maxError));
        }
        return arrayList;
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.f4020b.a(com.applovin.impl.sdk.c.a.f3922i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().U().a(com.applovin.impl.sdk.network.g.o().c(str).b("POST").b(this.f3425f).a(false).c(map).b(((Boolean) this.f4020b.a(com.applovin.impl.sdk.c.a.ab)).booleanValue()).a());
    }

    private void a(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().U().a(com.applovin.impl.sdk.network.g.o().c(str).a(false).b(this.f3425f).a());
        }
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, StringUtils.emptyIfNull(map.get(str2)));
        }
        return str;
    }

    private void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().X().dispatchPostbackRequest(h.b(d()).a(str).c(false).b(this.f3425f).a(), o.a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() { // from class: com.applovin.impl.mediation.b.d.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str2, int i2) {
                    d dVar = d.this;
                    dVar.d("Failed to fire postback with code: " + i2 + " and url: " + str2);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str2) {
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> f2 = this.f3423d.f(this.f3422c);
        Map<String, String> a = a();
        if (!((Boolean) d().a(com.applovin.impl.sdk.c.a.U)).booleanValue()) {
            List<String> a2 = a(f2, a, this.f3424e, this.f3426g);
            if (((Boolean) d().a(com.applovin.impl.sdk.c.a.f3923j)).booleanValue()) {
                a(a2);
                return;
            } else {
                b(a2);
                return;
            }
        }
        for (String str : f2) {
            Uri parse = Uri.parse(a(b(str, this.f3424e), this.f3426g));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(a.size());
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (a.containsKey(queryParameter)) {
                    hashMap.put(str2, this.f3423d.g(a.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }
}
