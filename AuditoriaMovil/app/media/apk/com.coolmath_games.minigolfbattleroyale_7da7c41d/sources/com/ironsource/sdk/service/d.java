package com.ironsource.sdk.service;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.ironsource.environment.h;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {
    private static final String a = d.class.getSimpleName();
    private static final ArrayList<String> b = new ArrayList<String>() { // from class: com.ironsource.sdk.service.d.1
        {
            add("com.google.market");
            add("com.android.vending");
        }
    };

    private static JSONObject a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> b2 = b(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                final boolean contains = b2.contains(next.trim().toLowerCase());
                jSONObject.put(next, new JSONObject() { // from class: com.ironsource.sdk.service.d.2
                    {
                        put("isInstalled", contains);
                    }
                });
            }
        } catch (Exception e) {
            com.ironsource.sdk.a.d.a(f.m, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a("generalmessage", arrayList.toString()).a);
            Logger.d(a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    public static boolean a(Context context) {
        JSONObject a2 = a(context, b);
        Iterator<String> keys = a2.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a2.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    private static ArrayList<String> b(Context context) {
        List<ApplicationInfo> q = h.q(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo applicationInfo : q) {
            if (applicationInfo != null) {
                arrayList.add(applicationInfo.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
