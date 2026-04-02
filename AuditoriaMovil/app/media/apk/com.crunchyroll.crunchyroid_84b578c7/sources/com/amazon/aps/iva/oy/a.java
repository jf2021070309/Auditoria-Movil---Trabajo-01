package com.amazon.aps.iva.oy;

import com.crunchyroll.crunchyroid.R;
/* compiled from: InAppUpdateStatus.kt */
/* loaded from: classes2.dex */
public abstract class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* compiled from: InAppUpdateStatus.kt */
    /* renamed from: com.amazon.aps.iva.oy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0587a extends a {
        public static final C0587a i = new C0587a();

        public C0587a() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b i = new b();

        public b() {
            super(R.string.in_app_updates_install_message, R.string.in_app_updates_install_now, R.string.in_app_updates_install_later, 0, 0, R.dimen.in_app_install_positive_button_horizontal_padding, 120);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public static final c i = new c();

        public c() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static final d i = new d();

        public d() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final e i = new e();

        public e() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class f extends a {
        public static final f i = new f();

        public f() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class g extends a {
        public static final g i = new g();

        public g() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class h extends a {
        public static final h i = new h();

        public h() {
            super(0, 0, 0, 0, 0, 0, 255);
        }
    }

    /* compiled from: InAppUpdateStatus.kt */
    /* loaded from: classes2.dex */
    public static final class i extends a {
        public final int i;

        public i(int i) {
            super(R.string.in_app_updates_update_message, R.string.in_app_updates_update, R.string.in_app_updates_not_now, R.color.primary, R.color.cr_black_pearl, R.dimen.in_app_update_positive_button_horizontal_padding, 80);
            this.i = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof i) && this.i == ((i) obj).i) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.i);
        }

        public final String toString() {
            return defpackage.e.f(new StringBuilder("InAppUpdateReadyForDownload(versionCode="), this.i, ")");
        }
    }

    public a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        i2 = (i8 & 1) != 0 ? 0 : i2;
        i3 = (i8 & 2) != 0 ? 0 : i3;
        i4 = (i8 & 4) != 0 ? 0 : i4;
        int i9 = i8 & 8;
        int i10 = R.color.transparent;
        i5 = i9 != 0 ? R.color.transparent : i5;
        i10 = (i8 & 16) == 0 ? 0 : i10;
        i6 = (i8 & 32) != 0 ? R.color.primary : i6;
        int i11 = (i8 & 64) != 0 ? R.color.primary : 0;
        i7 = (i8 & 128) != 0 ? R.dimen.in_app_update_positive_button_horizontal_padding : i7;
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i10;
        this.f = i6;
        this.g = i11;
        this.h = i7;
    }
}
