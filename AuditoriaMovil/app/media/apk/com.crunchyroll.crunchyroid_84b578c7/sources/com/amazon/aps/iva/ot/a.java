package com.amazon.aps.iva.ot;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AssetStatusUiModel.kt */
/* loaded from: classes2.dex */
public abstract class a {
    public final int a;
    public final int b;
    public final long c;

    /* compiled from: AssetStatusUiModel.kt */
    /* renamed from: com.amazon.aps.iva.ot.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0584a extends a {
        public static final C0584a d = new C0584a();

        public C0584a() {
            super(0, 5);
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b d = new b();

        public b() {
            super(R.string.coming_soon, R.drawable.ic_coming_soon, com.amazon.aps.iva.ao.a.A);
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        public static a a(String str) {
            j.f(str, "status");
            switch (str.hashCode()) {
                case -733902135:
                    if (str.equals("available")) {
                        return C0584a.d;
                    }
                    break;
                case -665462704:
                    if (str.equals("unavailable")) {
                        return g.d;
                    }
                    break;
                case -318452137:
                    if (str.equals("premium")) {
                        return f.d;
                    }
                    break;
                case -108217148:
                    if (str.equals("matureBlocked")) {
                        return e.d;
                    }
                    break;
                case 1894333340:
                    if (str.equals("comingSoon")) {
                        return b.d;
                    }
                    break;
            }
            return C0584a.d;
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends a {
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(R.string.continue_watching_text, 4);
            j.f(str, "statusText");
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && j.a(this.d, ((d) obj).d)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return defpackage.b.c(new StringBuilder("ContinueWatching(statusText="), this.d, ")");
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final e d = new e();

        public e() {
            super(R.string.mature_label, 0, com.amazon.aps.iva.ao.a.y);
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class f extends a {
        public static final f d = new f();

        public f() {
            super(R.string.premium, 0, com.amazon.aps.iva.ao.a.y);
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends a {
        public static final g d = new g();

        public g() {
            super(R.string.unavailable, R.drawable.ic_cta_unavailable, com.amazon.aps.iva.ao.a.A);
        }
    }

    /* compiled from: AssetStatusUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class h extends a {
        public static final h d = new h();

        public h() {
            super(R.string.watched, R.drawable.ic_replay, com.amazon.aps.iva.ao.a.A);
        }
    }

    public a(int i, int i2, long j) {
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public a(int i, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? R.drawable.ic_cta_play : R.drawable.ic_play_card_cta, (i2 & 4) != 0 ? com.amazon.aps.iva.ao.a.y : 0L);
    }
}
