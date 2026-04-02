package com.facebook.ads.internal.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.ads.internal.j.a;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e extends a {
    private static final String d = e.class.getSimpleName();
    private final Uri e;
    private final Map<String, String> f;

    public e(Context context, com.facebook.ads.internal.m.c cVar, String str, Uri uri, Map<String, String> map) {
        super(context, cVar, str);
        this.e = uri;
        this.f = map;
    }

    private Intent a(f fVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        if (!TextUtils.isEmpty(fVar.a()) && !TextUtils.isEmpty(fVar.b())) {
            intent.setComponent(new ComponentName(fVar.a(), fVar.b()));
        }
        if (!TextUtils.isEmpty(fVar.c())) {
            intent.setData(Uri.parse(fVar.c()));
        }
        return intent;
    }

    private Intent b(f fVar) {
        if (!TextUtils.isEmpty(fVar.a()) && d.a(this.a, fVar.a())) {
            String c = fVar.c();
            if (TextUtils.isEmpty(c) || !(c.startsWith("tel:") || c.startsWith("telprompt:"))) {
                PackageManager packageManager = this.a.getPackageManager();
                if (TextUtils.isEmpty(fVar.b()) && TextUtils.isEmpty(c)) {
                    return packageManager.getLaunchIntentForPackage(fVar.a());
                }
                Intent a = a(fVar);
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(a, 65536);
                if (a.getComponent() == null) {
                    Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (next.activityInfo.packageName.equals(fVar.a())) {
                            a.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                            break;
                        }
                    }
                }
                if (queryIntentActivities.isEmpty() || a.getComponent() == null) {
                    return null;
                }
                return a;
            }
            return new Intent("android.intent.action.CALL", Uri.parse(c));
        }
        return null;
    }

    private List<f> e() {
        String queryParameter = this.e.getQueryParameter("appsite_data");
        if (TextUtils.isEmpty(queryParameter) || "[]".equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(queryParameter).optJSONArray("android");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    f a = f.a(optJSONArray.optJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                return arrayList;
            }
            return arrayList;
        } catch (JSONException e) {
            Log.w(d, "Error parsing appsite_data", e);
            return arrayList;
        }
    }

    private boolean f() {
        List<Intent> d2 = d();
        if (d2 == null) {
            return false;
        }
        for (Intent intent : d2) {
            try {
                this.a.startActivity(intent);
                return true;
            } catch (Exception e) {
                Log.d(d, "Failed to open app intent, falling back", e);
            }
        }
        return false;
    }

    private boolean g() {
        com.facebook.ads.internal.q.c.g gVar = new com.facebook.ads.internal.q.c.g();
        try {
            com.facebook.ads.internal.q.c.g.a(gVar, this.a, c(), this.c);
            return true;
        } catch (Exception e) {
            Log.d(d, "Failed to open market url: " + this.e.toString(), e);
            String queryParameter = this.e.getQueryParameter("store_url_web_fallback");
            if (queryParameter != null && queryParameter.length() > 0) {
                try {
                    com.facebook.ads.internal.q.c.g.a(gVar, this.a, Uri.parse(queryParameter), this.c);
                } catch (Exception e2) {
                    Log.d(d, "Failed to open fallback url: " + queryParameter, e2);
                }
            }
            return false;
        }
    }

    @Override // com.facebook.ads.internal.a.a
    public a.EnumC0112a a() {
        return a.EnumC0112a.OPEN_STORE;
    }

    @Override // com.facebook.ads.internal.a.a
    public void b() {
        this.f.put(f() ? "opened_deeplink" : g() ? "opened_store_url" : "opened_store_fallback_url", String.valueOf(true));
        a(this.f);
    }

    protected Uri c() {
        String queryParameter = this.e.getQueryParameter("store_url");
        return !TextUtils.isEmpty(queryParameter) ? Uri.parse(queryParameter) : Uri.parse(String.format("market://details?id=%s", this.e.getQueryParameter("store_id")));
    }

    protected List<Intent> d() {
        List<f> e = e();
        ArrayList arrayList = new ArrayList();
        if (e != null) {
            for (f fVar : e) {
                Intent b = b(fVar);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        }
        return arrayList;
    }
}
