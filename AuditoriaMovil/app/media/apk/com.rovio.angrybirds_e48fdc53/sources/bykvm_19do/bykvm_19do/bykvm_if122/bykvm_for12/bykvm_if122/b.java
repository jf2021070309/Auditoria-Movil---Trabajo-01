package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.c;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.n;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.q;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements a<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> {
    private static volatile boolean c = true;
    private static volatile boolean d = true;
    public static volatile boolean e;
    public static volatile boolean f;
    private int a = 0;
    private int b = 0;

    public b(Context context) {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g a(java.lang.String r3, byte[] r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            r2 = this;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b r5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a r5 = r5.a()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c r5 = r5.c()
            r5.b(r3)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L()
            java.lang.String r3 = r3.q()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            java.lang.String r0 = "X-Tt-Env"
            r5.a(r0, r3)
            java.lang.String r3 = "x-use-ppe"
            java.lang.String r0 = "1"
            r5.a(r3, r0)
        L29:
            java.lang.String r3 = com.bytedance.msdk.base.b.b
            java.lang.String r0 = "User-Agent"
            r5.a(r0, r3)
            r5.a(r6, r4)
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b r3 = r5.b()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L8e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4c
            java.lang.String r0 = r3.a()     // Catch: org.json.JSONException -> L4c
            r6.<init>(r0)     // Catch: org.json.JSONException -> L4c
            boolean r6 = r2.b(r6)     // Catch: org.json.JSONException -> L4c
            if (r6 == 0) goto L8e
            r6 = r4
            goto L8f
        L4c:
            r6 = move-exception
            int r0 = r2.b
            int r1 = r0 + 1
            r2.b = r1
            r1 = 20
            if (r0 >= r1) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "exception: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "doUploadAdEvent"
            a(r1, r0)
        L71:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ignore:"
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "uploadEvent"
            com.bytedance.msdk.adapter.util.Logger.e(r1, r0)
            r6.printStackTrace()
        L8e:
            r6 = r5
        L8f:
            if (r3 == 0) goto L96
            int r0 = r3.b()
            goto L97
        L96:
            r0 = r5
        L97:
            if (r6 != 0) goto La0
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto La0
            java.lang.String r3 = "server say not success"
            goto Laa
        La0:
            if (r3 == 0) goto La7
            java.lang.String r3 = r3.d()
            goto La9
        La7:
            java.lang.String r3 = "error unknown"
        La9:
            r4 = r5
        Laa:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g r5 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g
            r5.<init>(r6, r0, r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.a(java.lang.String, byte[], java.util.Map, java.lang.String):bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(boolean r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "4"
            java.lang.String r1 = "1"
            r2 = 0
            if (r4 == 0) goto L15
            boolean r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.d
            if (r4 == 0) goto Le
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.d = r2
            goto L1b
        Le:
            boolean r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.f
            if (r4 == 0) goto L24
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.f = r2
            goto L2b
        L15:
            boolean r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.c
            if (r4 == 0) goto L1d
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.c = r2
        L1b:
            r0 = r1
            goto L2b
        L1d:
            boolean r4 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.e
            if (r4 == 0) goto L24
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.e = r2
            goto L2b
        L24:
            if (r5 == 0) goto L29
            java.lang.String r0 = "3"
            goto L2b
        L29:
            java.lang.String r0 = "2"
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.a(boolean, boolean):java.lang.String");
    }

    private Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadUtils.CONTENT_TYPE, "application/json; charset=utf-8");
        return hashMap;
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                String a = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a();
                String str = 2 + a + bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.b(jSONObject.toString(), bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.a.a(a));
                if (TextUtils.isEmpty(str)) {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } else {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, str);
                    jSONObject2.put("cypher", 2);
                }
            } catch (Throwable th) {
                try {
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject.toString());
                    jSONObject2.put("cypher", 0);
                } catch (Throwable th2) {
                }
            }
        }
        return jSONObject2;
    }

    public static void a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ts", Long.valueOf(System.currentTimeMillis()));
            jSONObject.putOpt("v3_Id", str);
            jSONObject.putOpt("v3_err_msg", str2);
            f0.a(jSONObject);
        } catch (Throwable th) {
        }
    }

    public static byte[] a(byte[] bArr, int i) {
        if (bArr != null && i > 0) {
            try {
                if (bArr.length == i) {
                    return q.a(bArr, i);
                }
            } catch (Throwable th) {
                a("encrypt", "exception: " + th.toString());
                th.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("inputData is ");
        sb.append(bArr == null ? "null" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        a("encrypt", sb.toString());
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g b(java.lang.String r3, byte[] r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6) {
        /*
            r2 = this;
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b r5 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.b.b()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.a r5 = r5.a()
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_if122.c r5 = r5.c()
            r5.b(r3)
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b r3 = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L()
            java.lang.String r3 = r3.q()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            java.lang.String r0 = "X-Tt-Env"
            r5.a(r0, r3)
            java.lang.String r3 = "x-use-ppe"
            java.lang.String r0 = "1"
            r5.a(r3, r0)
        L29:
            java.lang.String r3 = com.bytedance.msdk.base.b.b
            java.lang.String r0 = "User-Agent"
            r5.a(r0, r3)
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r0 = "union_sdk_encode"
            r5.a(r3, r0)
            r5.a(r6, r4)
            bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.b r3 = r5.b()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L95
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L53
            java.lang.String r0 = r3.a()     // Catch: org.json.JSONException -> L53
            r6.<init>(r0)     // Catch: org.json.JSONException -> L53
            boolean r6 = r2.b(r6)     // Catch: org.json.JSONException -> L53
            if (r6 == 0) goto L95
            r6 = r4
            goto L96
        L53:
            r6 = move-exception
            int r0 = r2.b
            int r1 = r0 + 1
            r2.b = r1
            r1 = 20
            if (r0 >= r1) goto L78
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "exception: "
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "doUploadAdEvent"
            a(r1, r0)
        L78:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ignore:"
            r0.append(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "uploadEvent"
            com.bytedance.msdk.adapter.util.Logger.e(r1, r0)
            r6.printStackTrace()
        L95:
            r6 = r5
        L96:
            if (r3 == 0) goto L9d
            int r0 = r3.b()
            goto L9e
        L9d:
            r0 = r5
        L9e:
            if (r6 != 0) goto La7
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto La7
            java.lang.String r3 = "server say not success"
            goto Lb1
        La7:
            if (r3 == 0) goto Lae
            java.lang.String r3 = r3.d()
            goto Lb0
        Lae:
            java.lang.String r3 = "error unknown"
        Lb0:
            r4 = r5
        Lb1:
            bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g r5 = new bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g
            r5.<init>(r6, r0, r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.b(java.lang.String, byte[], java.util.Map, java.lang.String):bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g");
    }

    private String b(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a aVar : list) {
                jSONArray.put(aVar.b);
            }
            jSONObject.put("stats_list", jSONArray);
            JSONObject a = a(jSONObject);
            a.putOpt("ad_sdk_version", "4.2.0.2");
            return a.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private Map<String, String> b() {
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadUtils.CONTENT_TYPE, "application/octet-stream;tt-data=a");
        return hashMap;
    }

    private boolean b(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.optInt(PluginConstants.KEY_ERROR_CODE) != 20000) {
                    if ("success".equals(jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_MESSAGE))) {
                    }
                }
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private byte[] c(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> r3) {
        /*
            r2 = this;
            byte[] r3 = r2.e(r3)
            java.lang.String r0 = "buildAdEventV3Body"
            if (r3 != 0) goto Le
            java.lang.String r1 = "zipData is null"
        La:
            a(r0, r1)
            goto L14
        Le:
            int r1 = r3.length
            if (r1 > 0) goto L14
            java.lang.String r1 = "zipData len 0"
            goto La
        L14:
            int r1 = r3.length
            byte[] r3 = a(r3, r1)
            if (r3 != 0) goto L21
            java.lang.String r1 = "data is null"
        L1d:
            a(r0, r1)
            goto L27
        L21:
            int r1 = r3.length
            if (r1 > 0) goto L27
            java.lang.String r1 = "data len 0"
            goto L1d
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.c(java.util.List):byte[]");
    }

    private byte[] d(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
        try {
            return a(c.a(f(list)).toString());
        } catch (Throwable th) {
            a("buildAdEventV3Body2", "exception: " + th.toString());
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[]] */
    private byte[] e(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = 0;
        GZIPOutputStream gZIPOutputStream3 = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONObject f2 = f(list);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        try {
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(f2.toString().getBytes());
            gZIPOutputStream.close();
        } catch (Exception e4) {
            e = e4;
            gZIPOutputStream3 = gZIPOutputStream;
            a("buildAdEventV3BodyRaw", "exception: " + e.toString());
            e.printStackTrace();
            if (gZIPOutputStream3 != null) {
                gZIPOutputStream3.close();
            }
            gZIPOutputStream2 = byteArrayOutputStream.toByteArray();
            return gZIPOutputStream2;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            if (gZIPOutputStream2 != 0) {
                try {
                    gZIPOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
        gZIPOutputStream2 = byteArrayOutputStream.toByteArray();
        return gZIPOutputStream2;
    }

    private JSONObject f(List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> list) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_user_agent", n.j());
            jSONObject.put("client_ip", n.a());
            jSONObject.put("header", n.i());
            JSONArray jSONArray = new JSONArray();
            for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a aVar : list) {
                jSONArray.put(aVar.b);
            }
            jSONObject.put("event_v3", jSONArray);
            jSONObject.put("magic_tag", "ss_app_log");
            jSONObject.put("_gen_time", System.currentTimeMillis());
        } catch (JSONException e2) {
            a("getAdEventV3Json", "exception: " + e2.toString());
            e2.printStackTrace();
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066 A[Catch: all -> 0x0149, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0149, blocks: (B:5:0x000d, B:8:0x0015, B:9:0x0023, B:11:0x0029, B:13:0x0033, B:14:0x0037, B:15:0x003b, B:17:0x0041, B:20:0x0049, B:26:0x005c, B:29:0x0066, B:43:0x00eb, B:21:0x004d, B:23:0x0053), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb A[Catch: all -> 0x0149, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0149, blocks: (B:5:0x000d, B:8:0x0015, B:9:0x0023, B:11:0x0029, B:13:0x0033, B:14:0x0037, B:15:0x003b, B:17:0x0041, B:20:0x0049, B:26:0x005c, B:29:0x0066, B:43:0x00eb, B:21:0x004d, B:23:0x0053), top: B:64:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0155  */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g a(java.util.List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.a> r20) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.b.a(java.util.List):bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.g");
    }

    public byte[] a(String str) {
        try {
            return str == null ? new byte[0] : str.getBytes(AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (UnsupportedEncodingException e2) {
            return new byte[0];
        }
    }
}
