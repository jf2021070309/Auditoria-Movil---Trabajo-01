package com.ss.android.downloadlib.rb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.config.de;
import com.ss.android.download.api.constant.BaseConstants;
import com.ss.android.downloadlib.activity.JumpKllkActivity;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.bg;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class xu {
    public static com.ss.android.downloadlib.addownload.ge.rb dr(Context context, Uri uri) {
        if (context == null || uri == null || !BaseConstants.SCHEME_MARKET.equals(uri.getScheme())) {
            return new com.ss.android.downloadlib.addownload.ge.rb(6, 12);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!yk.dr(context, intent)) {
                return new com.ss.android.downloadlib.addownload.ge.rb(6, 13);
            }
            String ll = com.ss.android.socialbase.appdownloader.bn.q.ll();
            if (yk.g(context, ll) && !com.ss.android.socialbase.appdownloader.bn.q.bn()) {
                intent.setPackage(ll);
            }
            if (DownloadSetting.obtainGlobal().optBugFix("fix_jump_market")) {
                intent.addFlags(335544320);
            } else if (!(context instanceof Activity)) {
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            }
            if (DownloadSetting.obtainGlobal().optInt("test_jump_market_failed") == 1) {
                com.ss.android.downloadlib.q.o.dr().dr(false, "jump market error");
                return new com.ss.android.downloadlib.addownload.ge.rb(6, 25);
            }
            intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.ge.rb(5);
        } catch (Exception e) {
            return new com.ss.android.downloadlib.addownload.ge.rb(6, 14);
        }
    }

    public static com.ss.android.downloadlib.addownload.ge.rb dr(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.ge.rb(6, 11);
        }
        if (com.ss.android.socialbase.appdownloader.bn.q.bn() && yk.g(context, "com.sec.android.app.samsungapps")) {
            return g(context, str);
        }
        return dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str));
    }

    public static com.ss.android.downloadlib.addownload.ge.rb dr(Context context, com.ss.android.downloadlib.addownload.ge.q qVar, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.ge.rb(6, 11);
        }
        if (com.ss.android.socialbase.appdownloader.bn.q.bn() && yk.g(context, "com.sec.android.app.samsungapps")) {
            return g(context, str);
        }
        if (!qVar.ge.isAd() || !qVar.g.enableAM()) {
            return dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str));
        }
        JSONArray optJSONArray = com.ss.android.downloadlib.addownload.wb.ll().optJSONArray("am_plans");
        if (com.ss.android.socialbase.appdownloader.bn.q.ge() && com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONArray, "am_0")) {
            ge(context, qVar, str);
            return new com.ss.android.downloadlib.addownload.ge.rb(7, "am_m1");
        } else if (com.ss.android.socialbase.appdownloader.bn.q.g() && com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONArray, "am_3")) {
            return o(context, qVar, str);
        } else {
            if (com.ss.android.socialbase.appdownloader.bn.q.q() && com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONArray, "am_2")) {
                g(context, qVar, str);
                return new com.ss.android.downloadlib.addownload.ge.rb(7, "am_m2");
            } else if (com.ss.android.socialbase.appdownloader.bn.q.ge() && com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONArray, "am_6")) {
                return dr(context, dr(qVar));
            } else {
                if (com.ss.android.socialbase.appdownloader.bn.q.o() && com.ss.android.socialbase.appdownloader.bn.dr.dr(optJSONArray, "am_5")) {
                    q(context, qVar, str);
                    return new com.ss.android.downloadlib.addownload.ge.rb(7, "am_v1");
                }
                return dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str));
            }
        }
    }

    private static com.ss.android.downloadlib.addownload.ge.rb g(Context context, String str) {
        try {
            Uri parse = Uri.parse("https://www.samsungapps.com/appquery/appDetail.as?appId=" + str);
            Intent intent = new Intent();
            intent.setClassName("com.sec.android.app.samsungapps", "com.sec.android.app.samsungapps.Main");
            intent.setData(parse);
            if (!(context instanceof Activity)) {
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            }
            intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.ge.rb(5);
        } catch (Exception e) {
            return new com.ss.android.downloadlib.addownload.ge.rb(6, 14);
        }
    }

    private static void ge(final Context context, final com.ss.android.downloadlib.addownload.ge.q qVar, final String str) {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.rb.xu.1
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
                final String optString = ll.optString("s");
                final JSONObject jSONObject = new JSONObject();
                String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("x"), optString);
                JSONObject jSONObject2 = new JSONObject();
                yk.dr(jSONObject2, "p", str);
                yk.dr(jSONObject2, "i", Build.VERSION.INCREMENTAL);
                yk.dr(jSONObject2, com.kuaishou.weapon.p0.t.m, Build.MODEL);
                yk.dr(jSONObject2, "im", com.ss.android.downloadlib.dr.dr.ge.dr(context));
                yk.dr(jSONObject2, com.kuaishou.weapon.p0.t.t, com.ss.android.downloadlib.dr.dr.ge.ge(context));
                yk.dr(jSONObject2, bg.aI, com.kuaishou.weapon.p0.t.m);
                byte[] bytes = jSONObject2.toString().getBytes();
                com.ss.android.downloadlib.addownload.wb.g().dr(dr, com.ss.android.downloadlib.addownload.wb.lp().dr(bytes, bytes.length), "application/octet-stream;tt-data=a", 0, new de() { // from class: com.ss.android.downloadlib.rb.xu.1.1
                    @Override // com.ss.android.download.api.config.de
                    public void dr(String str2) {
                        xu.ge(context, str, str2, qVar, jSONObject, ll, optString);
                    }

                    @Override // com.ss.android.download.api.config.de
                    public void dr(Throwable th) {
                        Context context2 = context;
                        com.ss.android.downloadlib.ge.dr.dr(xu.dr(context2, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
                        yk.dr(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                        com.ss.android.downloadlib.addownload.ge.q qVar2 = qVar;
                        JSONObject jSONObject3 = jSONObject;
                        xu.ge(qVar2, jSONObject3, 4, 1, BaseConstants.MARKET_PREFIX + str);
                    }
                });
            }
        });
    }

    private static String dr(String str, JSONObject jSONObject, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(jSONObject.optString("g"), str2);
        String dr2 = com.ss.android.socialbase.appdownloader.bn.o.dr(jSONObject.optString(bg.aG), str2);
        if (!TextUtils.isEmpty(dr) && !TextUtils.isEmpty(dr2)) {
            return str.replace(dr, dr2);
        }
        return str;
    }

    private static com.ss.android.downloadlib.addownload.ge.rb o(Context context, com.ss.android.downloadlib.addownload.ge.q qVar, String str) {
        Intent intent = new Intent(context, JumpKllkActivity.class);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("p", str);
        intent.putExtra("id", qVar.dr);
        intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        JSONObject jSONObject = new JSONObject();
        try {
            context.startActivity(intent);
            return new com.ss.android.downloadlib.addownload.ge.rb(7, "am_kllk2");
        } catch (Throwable th) {
            ge(qVar, jSONObject, 1, 3, BaseConstants.MARKET_PREFIX + str);
            return dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str));
        }
    }

    public static void dr(Context context, String str, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.downloadlib.addownload.ge.q q = com.ss.android.downloadlib.addownload.ge.bn.dr().q(j);
        try {
            JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
            String optString = ll.optString("s");
            String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("aa"), optString);
            String dr2 = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("ac"), optString);
            String dr3 = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("af"), optString);
            boolean dr4 = com.ss.android.socialbase.appdownloader.bn.dr.dr(ll, context, dr2);
            StringBuilder sb = new StringBuilder(String.format(dr, str, dr3, dr2));
            Intent intent = new Intent("android.intent.action.VIEW");
            String ll2 = com.ss.android.socialbase.appdownloader.bn.q.ll();
            if (yk.g(context, ll2)) {
                intent.setPackage(ll2);
            }
            if (z) {
                sb.append(com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("ae"), optString));
            } else {
                intent.addFlags(335544320);
            }
            yk.dr(jSONObject, "mf", Boolean.valueOf(dr4));
            yk.dr(jSONObject, "if", Boolean.valueOf(z));
            intent.setData(Uri.parse(sb.toString()));
            intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
            context.startActivity(intent);
            com.ss.android.downloadlib.ge.dr.dr("am_kllk2", jSONObject, q, true);
            if (dr4) {
                ge(q, jSONObject, -1, 3, sb.toString());
            } else {
                ge(q, jSONObject, 3, 3, sb.toString());
            }
        } catch (Exception e) {
            Context context2 = com.ss.android.downloadlib.addownload.wb.getContext();
            com.ss.android.downloadlib.ge.dr.dr(dr(context2, Uri.parse(BaseConstants.MARKET_PREFIX + str)), q, true);
            ge(q, jSONObject, 2, 3, BaseConstants.MARKET_PREFIX + str);
        }
    }

    private static boolean q(Context context, String str) {
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.wb.getContext();
        }
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
                if (DownloadSetting.obtainGlobal().optBugFix("fix_app_link_flag")) {
                    intent.addFlags(32768);
                }
            }
            intent.setData(Uri.parse(str));
            intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
            String ll = com.ss.android.socialbase.appdownloader.bn.q.ll();
            if (yk.g(com.ss.android.downloadlib.addownload.wb.getContext(), ll)) {
                intent.setPackage(ll);
            }
            if (yk.dr(com.ss.android.downloadlib.addownload.wb.getContext(), intent)) {
                try {
                    context.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean dr(Activity activity, String str, HashMap<String, String> hashMap) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(BaseConstants.MARKET_PREFIX + str));
        intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        intent.putExtra("param", hashMap);
        String ll = com.ss.android.socialbase.appdownloader.bn.q.ll();
        if (yk.g(com.ss.android.downloadlib.addownload.wb.getContext(), ll)) {
            intent.setPackage(ll);
        }
        if (yk.dr(com.ss.android.downloadlib.addownload.wb.getContext(), intent)) {
            try {
                activity.startActivity(intent);
                return true;
            } catch (Exception e) {
                com.ss.android.downloadlib.q.o.dr().dr(e, "start v1");
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(Context context, String str, String str2, com.ss.android.downloadlib.addownload.ge.q qVar, JSONObject jSONObject, JSONObject jSONObject2, String str3) {
        yk.dr(jSONObject, "ttdownloader_type", (Object) 1);
        try {
            String dr = dr(com.ss.android.socialbase.appdownloader.bn.o.dr(new JSONObject(str2).optString("a")), jSONObject2, str3);
            yk.dr(jSONObject, "open_url", dr);
            if (q(context, dr)) {
                ge(qVar, jSONObject, -1, 1, dr);
                com.ss.android.downloadlib.ge.dr.dr("am_m1", jSONObject, qVar, true);
            } else {
                com.ss.android.downloadlib.ge.dr.dr(dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
                ge(qVar, jSONObject, 2, 1, BaseConstants.MARKET_PREFIX + str);
            }
        } catch (Exception e) {
            com.ss.android.downloadlib.ge.dr.dr(dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
            ge(qVar, jSONObject, 3, 1, BaseConstants.MARKET_PREFIX + str);
        }
    }

    private static void g(final Context context, final com.ss.android.downloadlib.addownload.ge.q qVar, final String str) {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.rb.xu.2
            @Override // java.lang.Runnable
            public void run() {
                Context context2 = context;
                com.ss.android.downloadlib.ge.dr.dr(xu.dr(context2, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
                    Thread.sleep(ll.optInt("m2_delay_millis", 1000));
                    com.ss.android.downloadlib.dr.ge.dr.dr().dr(context, true);
                    com.ss.android.downloadlib.dr.ge.ge geVar = new com.ss.android.downloadlib.dr.ge.ge();
                    geVar.dr = 1;
                    geVar.ge = 0;
                    String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("v"), ll.optString("s"));
                    geVar.o = String.format(dr, str);
                    com.ss.android.downloadlib.dr.ge.dr.dr().dr(geVar, (com.ss.android.downloadlib.dr.ge.g) null);
                    com.ss.android.downloadlib.dr.ge.dr.dr().ge();
                    xu.ge(qVar, jSONObject, -1, 2, String.format(dr, str));
                } catch (Throwable th) {
                    th.printStackTrace();
                    com.ss.android.downloadlib.addownload.ge.q qVar2 = qVar;
                    xu.ge(qVar2, jSONObject, 1, 2, BaseConstants.MARKET_PREFIX + str);
                }
            }
        });
    }

    private static void q(final Context context, final com.ss.android.downloadlib.addownload.ge.q qVar, final String str) {
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.rb.xu.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
                String optString = ll.optString("s");
                final JSONObject jSONObject = new JSONObject();
                String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("x"), optString);
                JSONObject jSONObject2 = new JSONObject();
                yk.dr(jSONObject2, bg.aI, "v");
                yk.dr(jSONObject2, "p", str);
                byte[] bytes = jSONObject2.toString().getBytes();
                com.ss.android.downloadlib.addownload.wb.g().dr(dr, com.ss.android.downloadlib.addownload.wb.lp().dr(bytes, bytes.length), "application/octet-stream;tt-data=a", 0, new de() { // from class: com.ss.android.downloadlib.rb.xu.3.1
                    @Override // com.ss.android.download.api.config.de
                    public void dr(String str2) {
                        xu.ge(context, str, str2, qVar, jSONObject);
                    }

                    @Override // com.ss.android.download.api.config.de
                    public void dr(Throwable th) {
                        Context context2 = context;
                        com.ss.android.downloadlib.ge.dr.dr(xu.dr(context2, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
                        yk.dr(jSONObject, "ttdownloader_message", th != null ? th.getMessage() : "null");
                        com.ss.android.downloadlib.addownload.ge.q qVar2 = qVar;
                        JSONObject jSONObject3 = jSONObject;
                        xu.ge(qVar2, jSONObject3, 7, 5, BaseConstants.MARKET_PREFIX + str);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(Context context, String str, String str2, com.ss.android.downloadlib.addownload.ge.q qVar, JSONObject jSONObject) {
        yk.dr(jSONObject, "ttdownloader_type", (Object) 5);
        try {
            String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(new JSONObject(str2).optString("a"));
            if (!TextUtils.isEmpty(dr)) {
                TTDelegateActivity.dr(str, qVar.dr, dr, jSONObject);
            } else {
                com.ss.android.downloadlib.ge.dr.dr(dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
                ge(qVar, jSONObject, 5, 5, BaseConstants.MARKET_PREFIX + str);
            }
        } catch (Exception e) {
            com.ss.android.downloadlib.ge.dr.dr(dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str)), qVar, true);
            ge(qVar, jSONObject, 6, 5, BaseConstants.MARKET_PREFIX + str);
        }
    }

    public static void dr(Activity activity, String str, long j, String str2, String str3) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str3);
        } catch (JSONException e) {
            jSONObject = new JSONObject();
        }
        com.ss.android.downloadlib.addownload.ge.q q = com.ss.android.downloadlib.addownload.ge.bn.dr().q(j);
        try {
            JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
            boolean dr = com.ss.android.socialbase.appdownloader.bn.dr.dr(ll, activity, com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("bg"), ll.optString("s")));
            HashMap<String, String> ge = yk.ge(new JSONObject(str2));
            if (dr && !ge.isEmpty() && dr(activity, str, ge)) {
                ge(q, jSONObject, -1, 5, BaseConstants.MARKET_PREFIX + str);
                com.ss.android.downloadlib.ge.dr.dr("am_v1", jSONObject, q, true);
                return;
            }
            int i = dr ? ge.isEmpty() ? 1 : 2 : 3;
            ge(q, jSONObject, i, 5, BaseConstants.MARKET_PREFIX + str);
            com.ss.android.downloadlib.ge.dr.dr(dr(activity, Uri.parse(BaseConstants.MARKET_PREFIX + str)), q, true);
        } catch (Exception e2) {
            Context context = com.ss.android.downloadlib.addownload.wb.getContext();
            com.ss.android.downloadlib.ge.dr.dr(dr(context, Uri.parse(BaseConstants.MARKET_PREFIX + str)), q, true);
            ge(q, jSONObject, 4, 5, BaseConstants.MARKET_PREFIX + str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(com.ss.android.downloadlib.addownload.ge.q qVar, JSONObject jSONObject, int i, int i2, String str) {
        yk.dr(jSONObject, "error_code", Integer.valueOf(i));
        yk.dr(jSONObject, "ttdownloader_type", Integer.valueOf(i2));
        yk.dr(jSONObject, "rmu", str);
        yk.dr(jSONObject, com.ss.android.socialbase.appdownloader.bn.q.ll(), Integer.valueOf(yk.ge(com.ss.android.downloadlib.addownload.wb.getContext(), com.ss.android.socialbase.appdownloader.bn.q.ll())));
        com.ss.android.downloadlib.g.dr.dr().ge("am_result", jSONObject, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.ge.rb ge(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.ge.rb(4, 11);
        }
        if (context == null) {
            context = com.ss.android.downloadlib.addownload.wb.getContext();
        }
        Intent bn = yk.bn(context, str);
        if (bn == null) {
            return new com.ss.android.downloadlib.addownload.ge.rb(4, 22);
        }
        bn.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        try {
            context.startActivity(bn);
            return new com.ss.android.downloadlib.addownload.ge.rb(3);
        } catch (Exception e) {
            return new com.ss.android.downloadlib.addownload.ge.rb(4, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.ge.rb dr(Context context, String str, com.ss.android.downloadad.api.dr.dr drVar) {
        Intent bn = yk.bn(context, str);
        if (bn == null) {
            return new com.ss.android.downloadlib.addownload.ge.rb(4, 22);
        }
        if (Build.VERSION.SDK_INT >= 26 && com.ss.android.downloadlib.addownload.wb.ll().optInt("open_package_mode") == 1 && com.ss.android.downloadlib.addownload.wb.t() != null && com.ss.android.downloadlib.addownload.wb.t().dr() && drVar.lp()) {
            TTDelegateActivity.ge(str, drVar);
            return new com.ss.android.downloadlib.addownload.ge.rb(3);
        }
        bn.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        try {
            context.startActivity(bn);
            return new com.ss.android.downloadlib.addownload.ge.rb(3);
        } catch (Exception e) {
            return new com.ss.android.downloadlib.addownload.ge.rb(4, 23);
        }
    }

    static com.ss.android.downloadlib.addownload.ge.rb dr(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        return dr(com.ss.android.downloadlib.addownload.wb.getContext(), str, drVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.ge.rb ge(String str, com.ss.android.downloadad.api.dr.dr drVar) {
        if (TextUtils.isEmpty(str)) {
            return new com.ss.android.downloadlib.addownload.ge.rb(2, 21);
        }
        Context context = com.ss.android.downloadlib.addownload.wb.getContext();
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
        intent.putExtra("open_url", str);
        intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
        if (DownloadSetting.obtainGlobal().optBugFix("fix_app_link_flag")) {
            intent.addFlags(DownloadExpSwitchCode.BACK_BUGFIX_SIGBUS);
        }
        if (yk.ge(context, intent)) {
            if (com.ss.android.downloadlib.addownload.wb.ll().optInt("open_url_mode") == 0 && com.ss.android.downloadlib.addownload.wb.t() != null && com.ss.android.downloadlib.addownload.wb.t().dr() && Build.VERSION.SDK_INT >= 26 && drVar.lp()) {
                TTDelegateActivity.dr(str, drVar);
            } else {
                try {
                    com.ss.android.downloadlib.addownload.wb.getContext().startActivity(intent);
                } catch (Exception e) {
                    return new com.ss.android.downloadlib.addownload.ge.rb(2);
                }
            }
            return new com.ss.android.downloadlib.addownload.ge.rb(1);
        }
        return new com.ss.android.downloadlib.addownload.ge.rb(2, 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.ss.android.downloadlib.addownload.ge.rb dr(com.ss.android.downloadad.api.dr.ge geVar, String str, String str2) {
        com.ss.android.downloadlib.addownload.ge.rb ge = ge(str, geVar);
        if (!com.ss.android.downloadlib.ge.bn.dr(geVar)) {
            return ge;
        }
        if (ge.getType() == 2) {
            return dr(str2, geVar);
        }
        return ge;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean o(Context context, String str) {
        if (context == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            intent.addFlags(DownloadExpSwitchCode.BUGFIX_GETPACKAGEINFO_BY_UNZIP);
            intent.putExtra("open_url", str);
            intent.putExtra(BaseConstants.START_ONLY_FOR_ANDROID, true);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static Uri dr(com.ss.android.downloadlib.addownload.ge.q qVar) {
        String q = qVar.q();
        Uri.Builder builder = new Uri.Builder();
        JSONObject jSONObject = new JSONObject();
        JSONObject ll = com.ss.android.downloadlib.addownload.wb.ll();
        String dr = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString(as.t), ll.optString("s"));
        builder.scheme(BaseConstants.SCHEME_MARKET).authority("details").appendQueryParameter("id", q);
        if (!TextUtils.isEmpty(dr)) {
            builder.appendPath(dr);
        }
        Uri build = builder.build();
        ge(qVar, jSONObject, -1, 6, build.toString());
        return build;
    }
}
