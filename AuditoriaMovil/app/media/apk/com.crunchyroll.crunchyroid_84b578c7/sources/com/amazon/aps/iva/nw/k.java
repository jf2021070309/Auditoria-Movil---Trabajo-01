package com.amazon.aps.iva.nw;

import com.crunchyroll.crunchyroid.R;
/* compiled from: RenewFailure.kt */
/* loaded from: classes2.dex */
public abstract class k {
    public final int a;
    public final int b;

    /* compiled from: RenewFailure.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k {
        public static final a c = new a();

        public a() {
            super(R.string.video_not_available, R.string.video_unavailable_offline);
        }
    }

    /* compiled from: RenewFailure.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k {
        public static final b c = new b();

        public b() {
            super(R.string.unable_to_renew, R.string.something_wrong);
        }
    }

    /* compiled from: RenewFailure.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k {
        public static final c c = new c();

        public c() {
            super(R.string.video_not_available, R.string.video_unavailable_current_location);
        }
    }

    public k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
