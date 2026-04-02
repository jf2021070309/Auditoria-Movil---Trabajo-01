package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.c.a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* renamed from: com.ironsource.mediationsdk.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0119m {

    /* renamed from: com.ironsource.mediationsdk.m$a */
    /* loaded from: classes2.dex */
    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.m$b */
    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.g gVar, b bVar) {
        String str;
        if (a(ironSourceBannerLayout)) {
            str = null;
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        }
        if (gVar == null || TextUtils.isEmpty(gVar.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = gVar == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
            return;
        }
        IronLog.INTERNAL.error(str);
        bVar.a(str);
    }

    public static void a(String str, Object obj) {
        a.C0083a.a.a(str, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, ConcurrentHashMap<String, O> concurrentHashMap, a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!com.ironsource.mediationsdk.utils.c.b(ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (O o : concurrentHashMap.values()) {
                if (o.h()) {
                    Map<String, Object> c = o.c();
                    if (c != null) {
                        hashMap.put(o.k(), c);
                        sb = new StringBuilder("2");
                        sb.append(o.k());
                        sb.append(",");
                        sb2.append(sb.toString());
                    }
                } else if (!o.h()) {
                    arrayList.add(o.k());
                    sb = new StringBuilder("1");
                    sb.append(o.k());
                    sb.append(",");
                    sb2.append(sb.toString());
                }
            }
        }
        aVar.a(hashMap, arrayList, sb2);
    }

    public static void a(String str, JSONObject jSONObject) {
        com.ironsource.environment.c.a aVar = a.C0083a.a;
        if (jSONObject == null) {
            return;
        }
        try {
            Object obj = aVar.a.get(str);
            if (!(obj instanceof JSONObject)) {
                aVar.a(str, jSONObject);
                return;
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.putOpt(next, jSONObject.opt(next));
            }
            aVar.a(str, jSONObject2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Map<String, Object> map) {
        com.ironsource.environment.c.a aVar = a.C0083a.a;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    if (map.containsKey(str)) {
                        aVar.a(str, map.get(str));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }
}
