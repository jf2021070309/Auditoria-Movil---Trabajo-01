package com.facebook.ads.internal.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.q.a.m;
import com.facebook.ads.internal.q.a.p;
import com.facebook.ads.internal.q.a.r;
import com.facebook.share.internal.ShareConstants;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e {
    private static final String a = e.class.getName();
    private static final Object b = new Object();
    private static final Set<String> c = Collections.synchronizedSet(new HashSet());
    private static final Map<String, Integer> d = Collections.synchronizedMap(new HashMap());

    public static d a(Exception exc, Context context, Map<String, String> map) {
        try {
            d dVar = new d(m.b(), m.c(), new b(p.a(exc), map, true).a());
            try {
                a(dVar, context);
                return dVar;
            } catch (Exception e) {
                return dVar;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static JSONArray a(Context context) {
        return a(context, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x00b2, IOException -> 0x00b5, TryCatch #4 {IOException -> 0x00b5, blocks: (B:31:0x0087, B:33:0x008c, B:35:0x0091), top: B:87:0x0087, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091 A[Catch: all -> 0x00b2, IOException -> 0x00b5, TRY_LEAVE, TryCatch #4 {IOException -> 0x00b5, blocks: (B:31:0x0087, B:33:0x008c, B:35:0x0091), top: B:87:0x0087, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONArray a(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.f.e.a(android.content.Context, int):org.json.JSONArray");
    }

    private static JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", UUID.randomUUID().toString());
        jSONObject.put("type", dVar.a());
        jSONObject.put("time", r.a(dVar.b()));
        jSONObject.put("session_time", r.a(dVar.c()));
        jSONObject.put("session_id", dVar.d());
        jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, dVar.e() != null ? new JSONObject(dVar.e()) : new JSONObject());
        jSONObject.put("attempt", 0);
        return jSONObject;
    }

    public static void a(d dVar, Context context) {
        if (dVar == null || context == null) {
            return;
        }
        synchronized (b) {
            try {
                JSONObject a2 = a(dVar);
                FileOutputStream openFileOutput = context.openFileOutput("debuglogs", 32768);
                openFileOutput.write((a2.toString() + "\n").getBytes());
                openFileOutput.close();
                d(context);
            } catch (Exception e) {
                Log.e(a, "Failed to store crash", e);
            }
        }
    }

    public static void a(String str) {
        Integer num = d.get(str);
        if (num == null) {
            num = 0;
        } else {
            d.remove(str);
        }
        d.put(str, Integer.valueOf(num.intValue() + 1));
    }

    private static void a(String str, int i) {
        if (c.contains(str)) {
            throw new RuntimeException("finished event should not be updated to OngoingEvent.");
        }
        if (d.containsKey(str)) {
            d.remove(str);
        }
        d.put(str, Integer.valueOf(i));
    }

    public static int b(Context context) {
        return context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) - c.size();
    }

    private static void b(Context context, int i) {
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).edit();
        if (i < 0) {
            i = 0;
        }
        edit.putInt("EventCount", i).apply();
    }

    public static void b(String str) {
        if (d.containsKey(str)) {
            d.remove(str);
        }
        c.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x00dd, IOException -> 0x00e9, TryCatch #5 {IOException -> 0x00e9, blocks: (B:21:0x0065, B:23:0x006a, B:25:0x006f, B:27:0x0074), top: B:95:0x0065, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f A[Catch: all -> 0x00dd, IOException -> 0x00e9, TryCatch #5 {IOException -> 0x00e9, blocks: (B:21:0x0065, B:23:0x006a, B:25:0x006f, B:27:0x0074), top: B:95:0x0065, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[Catch: all -> 0x00dd, IOException -> 0x00e9, TRY_LEAVE, TryCatch #5 {IOException -> 0x00e9, blocks: (B:21:0x0065, B:23:0x006a, B:25:0x006f, B:27:0x0074), top: B:95:0x0065, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.f.e.c(android.content.Context):boolean");
    }

    public static boolean c(String str) {
        return c.contains(str) || d.containsKey(str);
    }

    private static void d(Context context) {
        b(context, context.getApplicationContext().getSharedPreferences("DEBUG_PREF", 0).getInt("EventCount", 0) + 1);
    }
}
