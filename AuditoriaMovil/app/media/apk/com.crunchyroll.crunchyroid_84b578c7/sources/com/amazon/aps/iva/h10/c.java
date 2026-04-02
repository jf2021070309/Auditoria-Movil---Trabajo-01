package com.amazon.aps.iva.h10;

import com.crunchyroll.crunchyroid.R;
/* compiled from: DownloadsEmptyStateInteractor.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final int a;
    public final Integer b;
    public final int c;
    public final boolean d;
    public final boolean e;

    /* compiled from: DownloadsEmptyStateInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a f = new a();

        public a() {
            super(R.drawable.empty_downloads_non_offline_benefit_image, Integer.valueOf((int) R.string.downloads_empty_non_offline_benefit_title), R.string.dowloads_empty_free_subtitle_format, 24);
        }
    }

    /* compiled from: DownloadsEmptyStateInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b f = new b();

        public b() {
            super(R.drawable.empty_downloads_offline_benefit_image, null, R.string.downloads_empty_offline_benefit_subtitle, false, true);
        }
    }

    /* compiled from: DownloadsEmptyStateInteractor.kt */
    /* renamed from: com.amazon.aps.iva.h10.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0316c extends c {
        public static final C0316c f = new C0316c();

        public C0316c() {
            super(R.drawable.empty_downloads_offline_benefit_image, null, R.string.downloads_empty_offline_benefit_subtitle, 16);
        }
    }

    /* compiled from: DownloadsEmptyStateInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class d extends c {
        public static final d f = new d();

        public d() {
            super(R.drawable.empty_downloads_non_offline_benefit_image, Integer.valueOf((int) R.string.downloads_empty_non_offline_benefit_title), R.string.dowloads_empty_anonymous_subtitle_format, 16);
        }
    }

    /* compiled from: DownloadsEmptyStateInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class e extends c {
        public static final e f = new e();

        public e() {
            super(R.drawable.empty_downloads_non_offline_benefit_image, Integer.valueOf((int) R.string.downloads_empty_non_offline_benefit_title), R.string.downloads_empty_premium_subtitle_format, 24);
        }
    }

    public /* synthetic */ c(int i, Integer num, int i2, int i3) {
        this(i, num, i2, (i3 & 8) != 0, false);
    }

    public c(int i, Integer num, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = num;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
