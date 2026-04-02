package com.amazon.aps.iva.co;

import com.crunchyroll.crunchyroid.R;
/* compiled from: MigrationOption.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final int a;

    /* compiled from: MigrationOption.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a b = new a();

        public a() {
            super(R.string.migration_watch_data_combine);
        }
    }

    /* compiled from: MigrationOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b b = new b();

        public b() {
            super(R.string.migration_watch_data_replace);
        }
    }

    /* compiled from: MigrationOption.kt */
    /* renamed from: com.amazon.aps.iva.co.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0182c extends c {
        public static final C0182c b = new C0182c();

        public C0182c() {
            super(R.string.migration_watch_data_save);
        }
    }

    public c(int i) {
        this.a = i;
    }
}
