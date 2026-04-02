package com.facebook.ads.internal.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
/* loaded from: classes2.dex */
public class d {

    /* loaded from: classes2.dex */
    public interface a {
        c a();

        Collection<String> b();

        String c();
    }

    public static Collection<String> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            hashSet.add(jSONArray.optString(i));
        }
        return hashSet;
    }

    public static boolean a(Context context, a aVar, com.facebook.ads.internal.m.c cVar) {
        Collection<String> b;
        boolean z;
        c a2 = aVar.a();
        if (a2 == null || a2 == c.NONE || (b = aVar.b()) == null || b.isEmpty()) {
            return false;
        }
        Iterator<String> it = b.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (a(context, it.next())) {
                z = true;
                break;
            }
        }
        if (z == (a2 == c.INSTALLED)) {
            String c = aVar.c();
            if (TextUtils.isEmpty(c)) {
                return true;
            }
            cVar.b(c, null);
            return true;
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        } catch (RuntimeException e2) {
            return false;
        }
    }
}
