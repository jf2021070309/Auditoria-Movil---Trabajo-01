package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_case1;

import android.text.TextUtils;
/* loaded from: classes.dex */
public abstract class d {
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected int e;
    private boolean f;

    public d(String str, String str2, String str3, String str4, int i) {
        this.a = str;
        this.c = str3;
        this.e = i;
        this.b = str2;
        this.f = !TextUtils.isEmpty(str2);
        this.d = str4;
    }

    public boolean a() {
        return this.e == 1;
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public String g() {
        if (TextUtils.isEmpty(this.b)) {
            return this.a;
        }
        return this.a + "_" + this.b;
    }

    public boolean h() {
        return this.f;
    }
}
