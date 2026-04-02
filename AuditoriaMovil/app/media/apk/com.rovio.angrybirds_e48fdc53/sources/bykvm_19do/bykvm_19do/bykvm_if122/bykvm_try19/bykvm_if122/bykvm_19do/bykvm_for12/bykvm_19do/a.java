package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.bykvm_19do;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a implements bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.bykvm_for12.a {
    private static final Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> b = new HashMap();
    private String a;

    private a(String str) {
        this.a = str;
    }

    public static bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_multi_sp";
        }
        Map<String, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a> map = b;
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a aVar = map.get(str);
        if (aVar == null) {
            a aVar2 = new a(str);
            map.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public String a(String str, String str2) {
        return b.a(this.a, str, str2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a() {
        b.a(this.a);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str) {
        b.a(this.a, str);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, float f) {
        b.a(this.a, str, Float.valueOf(f));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, int i) {
        b.a(this.a, str, Integer.valueOf(i));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, long j) {
        b.a(this.a, str, Long.valueOf(j));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void a(String str, boolean z) {
        b.a(this.a, str, Boolean.valueOf(z));
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public float b(String str, float f) {
        return b.a(this.a, str, f);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public int b(String str, int i) {
        return b.a(this.a, str, i);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public long b(String str, long j) {
        return b.a(this.a, str, j);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public Map<String, ?> b() {
        return b.b(this.a);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public void b(String str, String str2) {
        b.c(this.a, str, str2);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.bykvm_if122.bykvm_19do.a
    public boolean b(String str, boolean z) {
        return b.a(this.a, str, z);
    }
}
