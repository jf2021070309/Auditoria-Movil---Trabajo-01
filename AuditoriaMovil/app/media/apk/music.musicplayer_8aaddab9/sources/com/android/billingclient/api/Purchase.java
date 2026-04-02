package com.android.billingclient.api;

import android.text.TextUtils;
import e.a.a.a.j;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class Purchase {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2935b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f2936c;

    /* loaded from: classes.dex */
    public static class a {
        public final List<Purchase> a;

        /* renamed from: b  reason: collision with root package name */
        public final j f2937b;

        public a(j jVar, List<Purchase> list) {
            this.a = list;
            this.f2937b = jVar;
        }
    }

    public Purchase(String str, String str2) throws JSONException {
        this.a = str;
        this.f2935b = str2;
        this.f2936c = new JSONObject(str);
    }

    public String a() {
        JSONObject jSONObject = this.f2936c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.f2936c.has("productIds")) {
            JSONArray optJSONArray = this.f2936c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (this.f2936c.has("productId")) {
            arrayList.add(this.f2936c.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Purchase) {
            Purchase purchase = (Purchase) obj;
            return TextUtils.equals(this.a, purchase.a) && TextUtils.equals(this.f2935b, purchase.f2935b);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? "Purchase. Json: ".concat(valueOf) : new String("Purchase. Json: ");
    }
}
