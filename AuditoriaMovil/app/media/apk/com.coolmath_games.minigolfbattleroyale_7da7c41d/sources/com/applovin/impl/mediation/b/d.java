package com.applovin.impl.mediation.b;

import android.net.Uri;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.k;
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
    private final String c;
    private final com.applovin.impl.mediation.a.e d;
    private final Map<String, String> e;
    private final Map<String, String> f;
    private final MaxError g;

    public d(String str, Map<String, String> map, MaxError maxError, com.applovin.impl.mediation.a.e eVar, k kVar) {
        super("TaskFireMediationPostbacks", kVar);
        this.a = str;
        this.c = str + "_urls";
        this.e = Utils.toUrlSafeMap(map);
        this.g = maxError != null ? maxError : new MaxErrorImpl(-1);
        this.d = eVar;
        HashMap hashMap = new HashMap(7);
        hashMap.put("AppLovin-Event-Type", str);
        hashMap.put("AppLovin-Ad-Network-Name", eVar.K());
        if (eVar instanceof com.applovin.impl.mediation.a.a) {
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) eVar;
            hashMap.put("AppLovin-Ad-Unit-Id", aVar.getAdUnitId());
            hashMap.put("AppLovin-Ad-Format", aVar.getFormat().getLabel());
            hashMap.put("AppLovin-Third-Party-Ad-Placement-ID", aVar.j());
        }
        if (maxError != null) {
            hashMap.put("AppLovin-Error-Code", String.valueOf(maxError.getCode()));
            hashMap.put("AppLovin-Error-Message", maxError.getMessage());
        }
        this.f = hashMap;
    }

    private String a(String str, MaxError maxError) {
        int i;
        String str2;
        if (maxError instanceof MaxAdapterError) {
            MaxAdapterError maxAdapterError = (MaxAdapterError) maxError;
            i = maxAdapterError.getThirdPartySdkErrorCode();
            str2 = maxAdapterError.getThirdPartySdkErrorMessage();
        } else {
            i = 0;
            str2 = "";
        }
        return str.replace("{ERROR_CODE}", String.valueOf(maxError.getCode())).replace("{ERROR_MESSAGE}", StringUtils.encodeUrlString(maxError.getMessage())).replace("{THIRD_PARTY_SDK_ERROR_CODE}", String.valueOf(i)).replace("{THIRD_PARTY_SDK_ERROR_MESSAGE}", StringUtils.encodeUrlString(str2));
    }

    private List<String> a(List<String> list, Map<String, String> map, Map<String, String> map2, MaxError maxError) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            for (String str : map.keySet()) {
                next = next.replace(str, this.d.e(map.get(str)));
            }
            arrayList.add(a(b(next, map2), maxError));
        }
        return arrayList;
    }

    private Map<String, String> a() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) this.b.a(com.applovin.impl.sdk.c.a.i)));
        } catch (JSONException unused) {
            return Collections.EMPTY_MAP;
        }
    }

    private void a(String str, Map<String, Object> map) {
        d().S().a(com.applovin.impl.sdk.network.g.o().c(str).b("POST").b(this.f).a(false).c(map).b(((Boolean) this.b.a(com.applovin.impl.sdk.c.a.U)).booleanValue()).a());
    }

    private void a(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().S().a(com.applovin.impl.sdk.network.g.o().c(str).a(false).b(this.f).a());
        }
    }

    private String b(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replace(str2, map.get(str2));
        }
        return str;
    }

    private void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            d().V().dispatchPostbackRequest(h.b(d()).a(str).c(false).b(this.f).a(), o.a.MEDIATION_POSTBACKS, new AppLovinPostbackListener() { // from class: com.applovin.impl.mediation.b.d.1
                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackFailure(String str2, int i) {
                    d dVar = d.this;
                    dVar.d("Failed to fire postback with code: " + i + " and url: " + str2);
                }

                @Override // com.applovin.sdk.AppLovinPostbackListener
                public void onPostbackSuccess(String str2) {
                }
            });
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List<String> d = this.d.d(this.c);
        Map<String, String> a = a();
        if (!((Boolean) d().a(com.applovin.impl.sdk.c.a.R)).booleanValue()) {
            List<String> a2 = a(d, a, this.e, this.g);
            if (((Boolean) d().a(com.applovin.impl.sdk.c.a.j)).booleanValue()) {
                a(a2);
                return;
            } else {
                b(a2);
                return;
            }
        }
        for (String str : d) {
            Uri parse = Uri.parse(a(b(str, this.e), this.g));
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            HashMap hashMap = new HashMap(a.size());
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (a.containsKey(queryParameter)) {
                    hashMap.put(str2, this.d.e(a.get(queryParameter)));
                } else {
                    clearQuery.appendQueryParameter(str2, queryParameter);
                }
            }
            a(clearQuery.build().toString(), hashMap);
        }
    }
}
