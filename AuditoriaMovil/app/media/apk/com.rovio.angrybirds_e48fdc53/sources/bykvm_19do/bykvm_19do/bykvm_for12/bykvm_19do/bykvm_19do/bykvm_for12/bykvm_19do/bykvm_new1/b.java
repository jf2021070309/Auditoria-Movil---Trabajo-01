package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.i;
import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.j;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.sdk.component.panglarmor.SoftDecTool;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.a<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> {
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    private final boolean a = b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements d {
        a(b bVar) {
        }
    }

    private bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a(byte[] bArr, Map<String, String> map, String str) {
        int i;
        boolean z;
        boolean z2;
        String str2;
        try {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
            i g = b2.g();
            f f = g.f();
            f.a(g.d());
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    f.a(entry.getKey(), entry.getValue());
                }
            }
            f.a(str, bArr);
            f.a("User-Agent", b2.k());
            e i2 = f.i();
            if (i2 == null) {
                return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(false, 510, "RSP IS NULL", false, "error");
            }
            boolean z3 = false;
            if (i2 == null || !i2.isSuccess() || TextUtils.isEmpty(i2.c())) {
                i = 0;
                z = false;
            } else {
                JSONObject jSONObject = new JSONObject(i2.c());
                z = b(jSONObject);
                i = e(jSONObject);
            }
            int a2 = i2.a();
            String str3 = i2.d() != null ? i2.d().get("x-tt-logid") : "error";
            boolean z4 = !z && a2 == 200;
            String b3 = i2.b();
            b3 = (b3 == null || TextUtils.isEmpty(b3)) ? "DEFAULT OK" : "DEFAULT OK";
            if (i != 0) {
                str2 = "RSP FAIL";
                z2 = true;
            } else {
                z3 = z;
                i = a2;
                z2 = z4;
                str2 = b3;
            }
            b(bArr, map, str);
            return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(z3, i, str2, z2, str3);
        } catch (Throwable th) {
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("NetApiImpl", "uploadEvent error" + th.getMessage());
            return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(false, 511, th.getMessage(), false, "error");
        }
    }

    private Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadUtils.CONTENT_TYPE, "application/octet-stream;tt-data=a");
        return hashMap;
    }

    private void b(byte[] bArr, Map<String, String> map, String str) {
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2;
        i g;
        if (bArr == null || bArr.length == 0 || (b2 = j.m().b()) == null || (g = b2.g()) == null || !g.e()) {
            return;
        }
        f f = g.f();
        f.a(g.a());
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                f.a(entry.getKey(), entry.getValue());
            }
        }
        f.a(str, bArr);
        f.a("User-Agent", b2.k());
        f.a(new a(this));
    }

    private static boolean b() {
        if (!new File("/system/bin/su").exists()) {
            if (!new File("/system/xbin/su").exists()) {
                return false;
            }
        }
        return true;
    }

    private Map<String, String> c(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadUtils.CONTENT_TYPE, "application/json; charset=utf-8");
        if (f(jSONObject)) {
            hashMap.put("Content-Encoding", "union_sdk_encode");
        }
        return hashMap;
    }

    public static byte[] d(JSONObject jSONObject) {
        return jSONObject == null ? new byte[0] : jSONObject.toString().getBytes(StandardCharsets.UTF_8);
    }

    private int e(JSONObject jSONObject) {
        int indexOf;
        if (jSONObject == null) {
            return 0;
        }
        try {
            String optString = jSONObject.optString("s_sig_ts");
            if (optString != null && (indexOf = optString.indexOf("_")) >= 5) {
                String substring = optString.substring(0, indexOf);
                String substring2 = optString.substring(indexOf + 1);
                JSONObject i = j.m().b().g().i();
                String optString2 = i != null ? i.optString("device_id") : "";
                if (SoftDecTool.signVerifyMD5withRSA(optString2 + "_" + substring, substring2)) {
                    return Math.abs((System.currentTimeMillis() / 1000) - Long.valueOf(substring).longValue()) > 300 ? 513 : 0;
                }
            }
        } catch (Throwable th) {
        }
        return 512;
    }

    private boolean f(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.a
    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        i g;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a2;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b bVar;
        int length;
        boolean z;
        int i;
        String str;
        StringBuilder sb;
        byte[] d;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a3;
        String str2;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        Object[] objArr = null;
        if (b2 == null) {
            return null;
        }
        try {
            if (!b2.f() || (g = b2.g()) == null || list == null || list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String str3 = "2ndreqid";
            String str4 = "1streqid";
            String str5 = "";
            int i2 = 0;
            for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
                try {
                    if (TextUtils.equals(TTLogUtil.TAG_EVENT_SHOW, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.c(aVar))) {
                        String a4 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(aVar.b());
                        if (i2 == 0) {
                            str2 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.e(aVar);
                        } else {
                            str3 = bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.e(aVar);
                            str2 = str3;
                        }
                        str5 = a4;
                        str4 = str2;
                        i2 = 1;
                    }
                    try {
                        JSONObject b3 = aVar.b();
                        String optString = b3.optString("event");
                        JSONObject optJSONObject = b3.optJSONObject(NativeProtocol.WEB_DIALOG_PARAMS);
                        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                            arrayList.add(aVar);
                        } else {
                            arrayList2.add(aVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        r3 = i2;
                        i2 = r3;
                        try {
                            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("NetApiImpl", "uploadEvent error" + th.getMessage());
                            return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(false, 509, th.getMessage(), false, "error");
                        } finally {
                            if (i2 != 0 && 0 != 0) {
                                int length2 = objArr.length;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b("NetApiImpl", "uploadEvent error" + th.getMessage());
                    return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(false, 509, th.getMessage(), false, "error");
                }
            }
            if (!arrayList.isEmpty()) {
                String h = b2.h();
                if ("v3".equalsIgnoreCase(h)) {
                    JSONObject a5 = g.a(a(arrayList, false), true, this.a);
                    d = g.b(a5);
                    if (d == null) {
                        JSONObject a6 = g.a(a5);
                        d = d(a6);
                        a3 = a(d, c(a6), "application/json; charset=utf-8");
                    } else {
                        a3 = a(d, a(), "application/octet-stream;tt-data=a");
                    }
                } else if ("all".equalsIgnoreCase(h)) {
                    JSONObject a7 = g.a(a(arrayList, true), true, this.a);
                    byte[] b4 = g.b(a7);
                    if (b4 == null) {
                        JSONObject a8 = g.a(a7);
                        a(d(a8), c(a8), "application/json; charset=utf-8");
                    } else {
                        a(b4, a(), "application/octet-stream;tt-data=a");
                    }
                    JSONObject a9 = g.a(b(arrayList), this.a);
                    d = d(a9);
                    a3 = a(d, c(a9), "application/json; charset=utf-8");
                } else {
                    JSONObject a10 = g.a(arrayList, this.a);
                    d = d(a10);
                    a3 = a(d, c(a10), "application/json; charset=utf-8");
                }
                byte[] bArr = d;
                bVar = a3;
                if (i2 == 0) {
                    return bVar;
                }
                length = bArr != null ? bArr.length : 0;
                if (bVar == null) {
                    return bVar;
                }
                z = bVar.a;
                i = bVar.b;
                str = bVar.c;
                sb = new StringBuilder();
            } else if (arrayList2.isEmpty()) {
                return null;
            } else {
                JSONObject a11 = g.a(arrayList2, false, this.a);
                byte[] b5 = g.b(a11);
                if (b5 == null) {
                    JSONObject a12 = g.a(a11);
                    b5 = d(a12);
                    a2 = a(b5, c(a12), "application/json; charset=utf-8");
                } else {
                    a2 = a(b5, a(), "application/octet-stream;tt-data=a");
                }
                byte[] bArr2 = b5;
                bVar = a2;
                if (i2 == 0) {
                    return bVar;
                }
                length = bArr2 != null ? bArr2.length : 0;
                if (bVar == null) {
                    return bVar;
                }
                z = bVar.a;
                i = bVar.b;
                str = bVar.c;
                sb = new StringBuilder();
            }
            sb.append(str4);
            sb.append("|");
            sb.append(str3);
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.a.a(z, i, str, sb.toString(), length, str5);
            return bVar;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_new1.a
    public bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b a(JSONObject jSONObject) {
        i g;
        String str;
        boolean z;
        int i;
        boolean z2;
        e i2;
        boolean z3;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.g b2 = j.m().b();
        if (b2 == null || !b2.f() || jSONObject == null || jSONObject.length() <= 0 || (g = b2.g()) == null) {
            return null;
        }
        JSONObject a2 = g.a(jSONObject);
        f f = g.f();
        f.a(g.g());
        f.b(a2.toString());
        f.a("User-Agent", b2.k());
        String str2 = "error unknown";
        int i3 = 0;
        try {
            i2 = f.i();
        } catch (Throwable th) {
            str = "error unknown";
            z = false;
            i = 0;
            z2 = false;
        }
        if (i2 == null) {
            return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(false, 0, "error unknown", false, "ignore");
        }
        boolean z4 = true;
        if (!i2.isSuccess() || TextUtils.isEmpty(i2.c())) {
            z3 = false;
            z4 = false;
        } else {
            JSONObject jSONObject2 = new JSONObject(i2.c());
            int optInt = jSONObject2.optInt(PluginConstants.KEY_ERROR_CODE, -1);
            str2 = jSONObject2.optString(ShareConstants.WEB_DIALOG_PARAM_DATA, "");
            z3 = optInt == 20000;
            if (optInt != 60005) {
                z4 = false;
            }
        }
        try {
            i3 = i2.a();
            if (!i2.isSuccess()) {
                str2 = i2.b();
            }
        } catch (Throwable th2) {
        }
        str = str2;
        i = i3;
        z2 = z4;
        z = z3;
        return new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_if122.bykvm_for12.b(z, i, str, z2, "ignore");
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> a(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject b2 = aVar.b();
                jSONObject.putOpt("event", b2.optString(TTDownloadField.TT_LABEL));
                long optLong = b2.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(optLong));
                jSONObject.putOpt("datetime", b.format(new Date(optLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> keys = b2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.equals(next, TTDownloadField.TT_LABEL)) {
                        jSONObject2.putOpt(next, b2.opt(next));
                    }
                }
                if (z) {
                    jSONObject2.putOpt("_ad_staging_flag", 3);
                }
                jSONObject.putOpt(NativeProtocol.WEB_DIALOG_PARAMS, jSONObject2);
                arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(aVar.i(), jSONObject));
            } catch (Exception e) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(e.getMessage());
            }
        }
        return arrayList;
    }

    public List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> b(List<bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a> list) {
        ArrayList arrayList = new ArrayList();
        for (bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.a aVar : list) {
            try {
                JSONObject b2 = aVar.b();
                JSONObject jSONObject = new JSONObject();
                Iterator<String> keys = b2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.putOpt(next, b2.opt(next));
                }
                jSONObject.putOpt("_ad_staging_flag", 1);
                arrayList.add(new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_int108.bykvm_19do.a(aVar.i(), jSONObject));
            } catch (Exception e) {
                bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_for12.c.b(e.getMessage());
            }
        }
        return arrayList;
    }

    public boolean b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE).equalsIgnoreCase("success");
            } catch (Throwable th) {
            }
        }
        return false;
    }
}
