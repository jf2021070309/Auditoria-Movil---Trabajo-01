package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.f;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public b f3612b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3613c;

    /* renamed from: d  reason: collision with root package name */
    public SpannedString f3614d;

    /* renamed from: e  reason: collision with root package name */
    public SpannedString f3615e;

    /* renamed from: f  reason: collision with root package name */
    public String f3616f;

    /* renamed from: g  reason: collision with root package name */
    public String f3617g;

    /* renamed from: h  reason: collision with root package name */
    public int f3618h;

    /* renamed from: i  reason: collision with root package name */
    public int f3619i;

    /* renamed from: j  reason: collision with root package name */
    public int f3620j;

    /* renamed from: k  reason: collision with root package name */
    public int f3621k;

    /* renamed from: l  reason: collision with root package name */
    public int f3622l;

    /* renamed from: m  reason: collision with root package name */
    public int f3623m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3624n;

    /* loaded from: classes.dex */
    public static class a {
        public final b a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3625b;

        /* renamed from: c  reason: collision with root package name */
        public SpannedString f3626c;

        /* renamed from: d  reason: collision with root package name */
        public SpannedString f3627d;

        /* renamed from: e  reason: collision with root package name */
        public String f3628e;

        /* renamed from: f  reason: collision with root package name */
        public String f3629f;

        /* renamed from: g  reason: collision with root package name */
        public int f3630g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3631h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f3632i = -16777216;

        /* renamed from: j  reason: collision with root package name */
        public int f3633j = -16777216;

        /* renamed from: k  reason: collision with root package name */
        public int f3634k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f3635l = 0;

        /* renamed from: m  reason: collision with root package name */
        public boolean f3636m;

        public a(b bVar) {
            this.a = bVar;
        }

        public a a(int i2) {
            this.f3631h = i2;
            return this;
        }

        public a a(Context context) {
            this.f3631h = R.drawable.applovin_ic_disclosure_arrow;
            this.f3635l = f.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public a a(SpannedString spannedString) {
            this.f3626c = spannedString;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a a(boolean z) {
            this.f3625b = z;
            return this;
        }

        public c a() {
            return new c(this);
        }

        public a b(int i2) {
            this.f3633j = i2;
            return this;
        }

        public a b(SpannedString spannedString) {
            this.f3627d = spannedString;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a b(boolean z) {
            this.f3636m = z;
            return this;
        }

        public a c(int i2) {
            this.f3635l = i2;
            return this;
        }

        public a c(String str) {
            this.f3628e = str;
            return this;
        }

        public a d(String str) {
            this.f3629f = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);
        

        /* renamed from: g  reason: collision with root package name */
        private final int f3643g;

        b(int i2) {
            this.f3643g = i2;
        }

        public int a() {
            return this.f3643g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.list_section_centered;
            }
            if (this == SIMPLE) {
                return 17367043;
            }
            return this == DETAIL ? R.layout.list_item_detail : R.layout.list_item_right_detail;
        }
    }

    private c(a aVar) {
        this.f3618h = 0;
        this.f3619i = 0;
        this.f3620j = -16777216;
        this.f3621k = -16777216;
        this.f3622l = 0;
        this.f3623m = 0;
        this.f3612b = aVar.a;
        this.f3613c = aVar.f3625b;
        this.f3614d = aVar.f3626c;
        this.f3615e = aVar.f3627d;
        this.f3616f = aVar.f3628e;
        this.f3617g = aVar.f3629f;
        this.f3618h = aVar.f3630g;
        this.f3619i = aVar.f3631h;
        this.f3620j = aVar.f3632i;
        this.f3621k = aVar.f3633j;
        this.f3622l = aVar.f3634k;
        this.f3623m = aVar.f3635l;
        this.f3624n = aVar.f3636m;
    }

    public c(b bVar) {
        this.f3618h = 0;
        this.f3619i = 0;
        this.f3620j = -16777216;
        this.f3621k = -16777216;
        this.f3622l = 0;
        this.f3623m = 0;
        this.f3612b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public static int h() {
        return b.COUNT.a();
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public boolean b() {
        return this.f3613c;
    }

    public int c() {
        return this.f3621k;
    }

    public SpannedString c_() {
        return this.f3615e;
    }

    public boolean d_() {
        return this.f3624n;
    }

    public int e() {
        return this.f3618h;
    }

    public int f() {
        return this.f3619i;
    }

    public int g() {
        return this.f3623m;
    }

    public int i() {
        return this.f3612b.a();
    }

    public int j() {
        return this.f3612b.b();
    }

    public SpannedString k() {
        return this.f3614d;
    }

    public String l() {
        return this.f3616f;
    }

    public String m() {
        return this.f3617g;
    }

    public int n() {
        return this.f3620j;
    }

    public int o() {
        return this.f3622l;
    }
}
