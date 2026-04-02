package com.facebook.ads.internal.j;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
/* loaded from: classes2.dex */
public class b {
    private static final List<a> a = new ArrayList();

    public static String a() {
        synchronized (a) {
            if (a.isEmpty()) {
                return "";
            }
            ArrayList<a> arrayList = new ArrayList(a);
            a.clear();
            JSONArray jSONArray = new JSONArray();
            for (a aVar : arrayList) {
                jSONArray.put(aVar.a());
            }
            return jSONArray.toString();
        }
    }

    public static void a(a aVar) {
        synchronized (a) {
            a.add(aVar);
        }
    }
}
