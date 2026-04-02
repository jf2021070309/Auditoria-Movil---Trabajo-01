package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_if122.bykvm_19do;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_if122.a {
    private static final Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> a = new HashMap();
    private static volatile boolean b = false;
    private static volatile boolean c = true;

    private a(String str, boolean z) {
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a a(Context context, String str, boolean z) {
        if (!b) {
            b = a(context);
        }
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_keva";
        }
        if (c) {
            try {
                Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> map = a;
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = map.get(str);
                if (aVar == null) {
                    aVar = new a(str, z);
                    map.put(str, aVar);
                }
                return aVar;
            } catch (Throwable th) {
                c = false;
                return null;
            }
        }
        return null;
    }

    private static boolean a(Context context) {
        if (context == null) {
            context = c.a();
        }
        return context != null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public String a(String str, String str2) {
        return null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a() {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, float f) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, int i) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, long j) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, boolean z) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public float b(String str, float f) {
        return 0.0f;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public int b(String str, int i) {
        return 0;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public long b(String str, long j) {
        return 0L;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public Map<String, ?> b() {
        return null;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void b(String str, String str2) {
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public boolean b(String str, boolean z) {
        return false;
    }
}
