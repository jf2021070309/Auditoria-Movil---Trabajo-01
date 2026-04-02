package com.amazon.aps.iva.u00;

import com.crunchyroll.crunchyroid.R;
/* compiled from: BulkDownloadTextState.kt */
/* loaded from: classes2.dex */
public abstract class o {
    public final int a;
    public final Integer b;

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends o {
        public static final a c = new a();

        public a() {
            super(Integer.valueOf((int) R.string.synced), R.color.cr_teal);
        }
    }

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends o {
        public static final b c = new b();

        public b() {
            super(Integer.valueOf((int) R.string.syncing_all), R.color.cr_teal);
        }
    }

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends o {
        public static final c c = new c();

        public c() {
            super(Integer.valueOf((int) R.string.sync_manage), R.color.color_white);
        }
    }

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class d extends o {
        public static final d c = new d();

        public d() {
            super(Integer.valueOf((int) R.string.sync_all), R.color.color_white);
        }
    }

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class e extends o {
        public static final e c = new e();

        public e() {
            super(null, R.color.cr_white_opacity_40);
        }
    }

    /* compiled from: BulkDownloadTextState.kt */
    /* loaded from: classes2.dex */
    public static final class f extends o {
        public static final f c = new f();

        public f() {
            super(Integer.valueOf((int) R.string.unavailable), R.color.cr_white_opacity_40);
        }
    }

    public o(Integer num, int i) {
        this.a = i;
        this.b = num;
    }
}
