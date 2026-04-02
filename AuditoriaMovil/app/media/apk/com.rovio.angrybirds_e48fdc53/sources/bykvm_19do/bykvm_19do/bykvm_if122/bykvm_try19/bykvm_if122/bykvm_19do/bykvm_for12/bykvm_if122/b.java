package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_if122;

import android.content.Context;
import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.c;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.a {
    private static final Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> b = new HashMap();
    private a a;

    private b(String str, Context context) {
        this.a = a.a(str, context);
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_multi_sp";
        }
        if (context == null) {
            context = c.a();
        }
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> map = b;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = map.get(str);
        if (aVar == null) {
            b bVar = new b(str, context);
            map.put(str, bVar);
            return bVar;
        }
        return aVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public String a(String str, String str2) {
        return this.a.a(str, str2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a() {
        this.a.a();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str) {
        this.a.a(str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, float f) {
        this.a.b(str, f);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, int i) {
        this.a.b(str, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, long j) {
        this.a.b(str, j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, boolean z) {
        this.a.b(str, z);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public float b(String str, float f) {
        return this.a.a(str, f);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public int b(String str, int i) {
        return this.a.a(str, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public long b(String str, long j) {
        return this.a.a(str, j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public Map<String, ?> b() {
        return this.a.b();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void b(String str, String str2) {
        this.a.b(str, str2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public boolean b(String str, boolean z) {
        return this.a.a(str, z);
    }
}
