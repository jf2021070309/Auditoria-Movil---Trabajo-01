package com.umeng.ccg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.ac;
import com.umeng.analytics.pro.ad;
import com.umeng.analytics.pro.ae;
import com.umeng.analytics.pro.ag;
import com.umeng.analytics.pro.ai;
import com.umeng.analytics.pro.ao;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.as;
import com.umeng.analytics.pro.z;
import com.umeng.ccg.b;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Monitor.java */
/* loaded from: classes3.dex */
public class c implements b.a {
    private static final String a = "iucc";
    private static final String b = as.b().b(as.C);
    private static JSONObject c = null;
    private static final String[] d = {com.umeng.ccg.a.e, com.umeng.ccg.a.f, com.umeng.ccg.a.g};
    private static ArrayList<aa> e = null;
    private static ArrayList<aa> f = null;
    private static ArrayList<aa> g = null;
    private static C0318c j = new C0318c();
    private volatile String h = "";
    private Map<String, a> i = new HashMap();

    /* compiled from: Monitor.java */
    /* loaded from: classes3.dex */
    public class a {
        private JSONArray b;
        private String c;

        public JSONArray a() {
            return this.b;
        }

        public String b() {
            return this.c;
        }

        public a(JSONArray jSONArray, String str) {
            this.b = jSONArray;
            this.c = str;
        }
    }

    /* compiled from: Monitor.java */
    /* renamed from: com.umeng.ccg.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0318c extends BroadcastReceiver {
        public long a(ArrayList<aa> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    aa aaVar = arrayList.get(i);
                    if (aaVar instanceof ab) {
                        return ((ab) aaVar).c();
                    }
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<aa> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_ON");
                    if (b(c.e)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_on event.");
                        com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 301, c.a(), null, a(c.e) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_OFF");
                    if (b(c.f)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_off event.");
                        com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 302, c.a(), null, a(c.f) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_USER_PRESENT");
                    if (b(c.g)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_unlock event.");
                        com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 303, c.a(), null, a(c.g) * 1000);
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_unlock event.");
                }
            } catch (Throwable th) {
            }
        }
    }

    public static void a(Context context, String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(j, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Monitor.java */
    /* loaded from: classes3.dex */
    public static class b {
        private static final c a = new c();

        private b() {
        }
    }

    public static c a() {
        return b.a;
    }

    public void a(Context context) {
        com.umeng.ccg.b.a(context, 105, a(), null);
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has(PluginConstants.KEY_ERROR_CODE)) {
            try {
                if (200 == Integer.valueOf(jSONObject.optInt(PluginConstants.KEY_ERROR_CODE)).intValue() && jSONObject.has(com.umeng.ccg.a.a)) {
                    if (jSONObject.has("ts")) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Throwable th) {
                return false;
            }
        }
        return false;
    }

    private long b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ts")) {
            try {
                return jSONObject.optLong("ts");
            } catch (Throwable th) {
            }
        }
        return 0L;
    }

    private JSONObject b(Context context) {
        FileInputStream fileInputStream;
        try {
            File filesDir = context.getFilesDir();
            String str = b;
            if (!new File(filesDir, str).exists()) {
                return null;
            }
            try {
                fileInputStream = context.openFileInput(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(ar.a(HelperUtils.readStreamToByteArray(fileInputStream), UMConfigure.sAppkey.getBytes())));
                    try {
                        ao.a(fileInputStream);
                        return jSONObject;
                    } catch (Throwable th) {
                        return jSONObject;
                    }
                } catch (Throwable th2) {
                    ao.a(fileInputStream);
                    return null;
                }
            } catch (Throwable th3) {
                fileInputStream = null;
            }
        } catch (Throwable th4) {
            return null;
        }
    }

    private void a(Context context, JSONObject jSONObject, String str) {
        try {
            long b2 = b(jSONObject);
            byte[] a2 = ar.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (a2 != null && a2.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), b));
                fileOutputStream.write(a2);
                fileOutputStream.flush();
                ao.a(fileOutputStream);
                a(context, str, b2);
                UMRTLog.i(UMRTLog.RTLOG_TAG, "saveConfigFile success.");
            }
        } catch (Throwable th) {
        }
    }

    private void c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(a, new UMImprintChangeCallback() { // from class: com.umeng.ccg.c.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 107, c.a(), str2);
            }
        });
    }

    private void a(String str, aa aaVar) {
        if (com.umeng.ccg.a.e.equalsIgnoreCase(str)) {
            if (e == null) {
                e = new ArrayList<>();
            }
            e.add(aaVar);
        }
        if (com.umeng.ccg.a.f.equalsIgnoreCase(str)) {
            if (f == null) {
                f = new ArrayList<>();
            }
            f.add(aaVar);
        }
        if (com.umeng.ccg.a.g.equalsIgnoreCase(str)) {
            if (g == null) {
                g = new ArrayList<>();
            }
            g.add(aaVar);
        }
    }

    private z a(String str, JSONObject jSONObject) {
        z zVar;
        z zVar2;
        boolean z;
        boolean z2;
        boolean z3;
        JSONArray optJSONArray;
        if (jSONObject == null || !(jSONObject instanceof JSONObject)) {
            return null;
        }
        try {
            if (!jSONObject.has(com.umeng.ccg.a.h)) {
                zVar2 = null;
            } else {
                JSONArray optJSONArray2 = jSONObject.optJSONArray(com.umeng.ccg.a.h);
                if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                    zVar2 = null;
                } else {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray2.get(0);
                    if (jSONObject2.has(com.umeng.ccg.a.i)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jSONObject2.has(com.umeng.ccg.a.l)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (jSONObject2.has(com.umeng.ccg.a.m)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z || !z2 || !z3) {
                        return null;
                    }
                    try {
                        int optInt = jSONObject2.optInt(com.umeng.ccg.a.i);
                        long optLong = jSONObject2.optLong(com.umeng.ccg.a.l);
                        long optLong2 = jSONObject2.optLong(com.umeng.ccg.a.m);
                        String optString = jSONObject2.optString(com.umeng.ccg.a.n);
                        ArrayList arrayList = new ArrayList();
                        if (jSONObject2.has(com.umeng.ccg.a.j)) {
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.umeng.ccg.a.j);
                            HashSet hashSet = new HashSet();
                            if (optJSONArray3 != null) {
                                int length = optJSONArray3.length();
                                int i = 0;
                                while (i < length) {
                                    hashSet.add(Integer.valueOf(optJSONArray3.getInt(i)));
                                    i++;
                                    optJSONArray3 = optJSONArray3;
                                }
                            }
                            if (hashSet.size() > 0) {
                                ai aiVar = new ai(hashSet);
                                if (Arrays.asList(d).contains(str)) {
                                    a(str, aiVar);
                                } else {
                                    arrayList.add(aiVar);
                                }
                            }
                        }
                        if (jSONObject2.has(com.umeng.ccg.a.k)) {
                            String optString2 = jSONObject2.optString(com.umeng.ccg.a.k);
                            if (!TextUtils.isEmpty(optString2)) {
                                ag agVar = new ag(optString2);
                                HashSet hashSet2 = new HashSet();
                                for (int i2 = 1; i2 <= 24; i2++) {
                                    if (agVar.a(i2)) {
                                        hashSet2.add(Integer.valueOf(i2));
                                    }
                                }
                                if (hashSet2.size() > 0) {
                                    ac acVar = new ac(hashSet2);
                                    if (Arrays.asList(d).contains(str)) {
                                        a(str, acVar);
                                    } else {
                                        arrayList.add(acVar);
                                    }
                                }
                            }
                        }
                        arrayList.add(new ae(optInt));
                        ad adVar = new ad(str, optLong);
                        String[] strArr = d;
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, adVar);
                        } else {
                            arrayList.add(adVar);
                        }
                        ab abVar = new ab(optLong2);
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, abVar);
                            arrayList.add(abVar);
                        } else {
                            arrayList.add(abVar);
                        }
                        zVar = new z(str, arrayList);
                        try {
                            zVar.a(optString);
                            String str2 = "";
                            if (jSONObject.has("sdk") && (optJSONArray = jSONObject.optJSONArray("sdk")) != null && (optJSONArray instanceof JSONArray)) {
                                Map<String, a> map = this.i;
                                if (map != null && !map.containsKey(str)) {
                                    this.i.put(str, new a(new JSONArray(optJSONArray.toString()), optString));
                                }
                                int length2 = optJSONArray.length();
                                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                    str2 = str2 + optJSONArray.getString(i3);
                                    if (i3 < length2 - 1) {
                                        str2 = str2 + ",";
                                    }
                                }
                            }
                            zVar.b(str2);
                            return zVar;
                        } catch (Throwable th) {
                            return zVar;
                        }
                    } catch (Throwable th2) {
                        return null;
                    }
                }
            }
            return zVar2;
        } catch (Throwable th3) {
            zVar = null;
        }
    }

    private void c(JSONObject jSONObject) {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        if (jSONObject == null || !(jSONObject instanceof JSONObject) || !jSONObject.has(com.umeng.ccg.a.a)) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(com.umeng.ccg.a.a);
            if (!optJSONObject.has(com.umeng.ccg.a.b)) {
                zVar = null;
            } else {
                zVar = a(com.umeng.ccg.a.b, optJSONObject.optJSONObject(com.umeng.ccg.a.b));
            }
            if (!optJSONObject.has(com.umeng.ccg.a.c)) {
                zVar2 = null;
            } else {
                zVar2 = a(com.umeng.ccg.a.c, optJSONObject.optJSONObject(com.umeng.ccg.a.c));
            }
            if (!optJSONObject.has(com.umeng.ccg.a.d)) {
                zVar3 = null;
            } else {
                zVar3 = a(com.umeng.ccg.a.d, optJSONObject.optJSONObject(com.umeng.ccg.a.d));
            }
            if (!optJSONObject.has(com.umeng.ccg.a.e)) {
                zVar4 = null;
            } else {
                zVar4 = a(com.umeng.ccg.a.e, optJSONObject.optJSONObject(com.umeng.ccg.a.e));
            }
            if (!optJSONObject.has(com.umeng.ccg.a.f)) {
                zVar5 = null;
            } else {
                zVar5 = a(com.umeng.ccg.a.f, optJSONObject.optJSONObject(com.umeng.ccg.a.f));
            }
            z a2 = optJSONObject.has(com.umeng.ccg.a.g) ? a(com.umeng.ccg.a.g, optJSONObject.optJSONObject(com.umeng.ccg.a.g)) : null;
            ArrayList arrayList = new ArrayList();
            if (zVar != null) {
                arrayList.add(zVar);
            }
            if (zVar2 != null) {
                arrayList.add(zVar2);
            }
            if (zVar3 != null) {
                arrayList.add(zVar3);
            }
            if (zVar4 != null) {
                arrayList.add(zVar4);
            }
            if (zVar5 != null) {
                arrayList.add(zVar5);
            }
            if (a2 != null) {
                arrayList.add(a2);
            }
            com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 202, a(), arrayList);
        } catch (Throwable th) {
        }
    }

    private void a(Context context, String str, long j2) {
        SharedPreferences a2;
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split("@");
                if (split.length == 4 && (a2 = ap.a(context)) != null) {
                    long parseLong = Long.parseLong(split[0]);
                    String str2 = split[1];
                    SharedPreferences.Editor edit = a2.edit();
                    edit.putLong(ap.c, j2);
                    edit.putLong(ap.d, parseLong);
                    edit.putString(ap.e, str2).commit();
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "updateTsS1S2 : ts = " + j2 + "; s1 = " + parseLong + "; s2 = " + str2);
                }
            } catch (Throwable th) {
            }
        }
    }

    private Long d(Context context) {
        try {
            SharedPreferences a2 = ap.a(context);
            if (a2 != null) {
                return Long.valueOf(a2.getLong(ap.d, 0L));
            }
            return 0L;
        } catch (Throwable th) {
            return 0L;
        }
    }

    private String e(Context context) {
        try {
            SharedPreferences a2 = ap.a(context);
            return a2 != null ? a2.getString(ap.e, "") : "";
        } catch (Throwable th) {
            return "";
        }
    }

    private void a(String str) {
        try {
            String[] split = str.split("@");
            if (split.length != 4) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            if (!TextUtils.isEmpty(this.h)) {
                String[] split2 = this.h.split("@");
                if (split2.length == 2) {
                    long parseLong2 = Long.parseLong(split2[0]);
                    String str3 = split2[1];
                    if (parseLong2 == parseLong && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences a2 = ap.a(UMGlobalContext.getAppContext());
            if (a2 != null) {
                if (a2.getLong(ap.c, 0L) != parseLong) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.h = String.valueOf(parseLong) + "@" + str2;
                    com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 101, a(), str);
                    return;
                }
                d(UMGlobalContext.getAppContext());
                if (!e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                    this.h = String.valueOf(parseLong) + "@" + str2;
                    com.umeng.ccg.b.a(UMGlobalContext.getAppContext(), 101, a(), str);
                }
            }
        } catch (Throwable th) {
        }
    }

    private void b(String str) {
        String str2 = ap.b + str;
        SharedPreferences a2 = ap.a(UMGlobalContext.getAppContext());
        if (a2 != null) {
            a2.edit().putLong(str2, System.currentTimeMillis()).commit();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x028f A[Catch: all -> 0x02bb, TryCatch #14 {all -> 0x02bb, blocks: (B:101:0x0268, B:103:0x026d, B:105:0x0273, B:107:0x027a, B:109:0x0280, B:111:0x0288, B:114:0x028f, B:115:0x0292), top: B:209:0x0268 }] */
    @Override // com.umeng.ccg.b.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r18, int r19) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.ccg.c.a(java.lang.Object, int):void");
    }
}
