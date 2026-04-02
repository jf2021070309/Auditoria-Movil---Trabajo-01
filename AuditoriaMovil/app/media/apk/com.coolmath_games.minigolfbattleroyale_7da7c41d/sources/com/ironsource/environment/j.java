package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import com.ironsource.environment.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class j {
    public static JSONObject a(ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        com.ironsource.environment.c.a aVar = a.C0083a.a;
        aVar.a(applicationContext);
        JSONObject jSONObject2 = new JSONObject(com.ironsource.environment.c.b.a(aVar.a));
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (jSONObject2.has(next)) {
                jSONObject.put(next, jSONObject2.opt(next));
            }
        }
        return jSONObject;
    }

    public static void a(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public static String b(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }
}
