package com.amazon.aps.iva.rw;

import com.amazon.aps.iva.ks.f;
import com.crunchyroll.crunchyroid.R;
/* compiled from: SyncQualityOptionImpl.kt */
/* loaded from: classes2.dex */
public abstract class b implements com.amazon.aps.iva.wg.b {
    public final int b;
    public final int c;
    public final f d;
    public final int e;
    public final int f;

    /* compiled from: SyncQualityOptionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static final a g = new a();

        public a() {
            super(R.string.sync_quality_high_title, R.string.sync_quality_high_description, f.a.a, 1280, 720);
        }
    }

    /* compiled from: SyncQualityOptionImpl.kt */
    /* renamed from: com.amazon.aps.iva.rw.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0686b extends b {
        public static final C0686b g = new C0686b();

        public C0686b() {
            super(R.string.sync_quality_low_title, R.string.sync_quality_low_description, f.b.a, 640, 360);
        }
    }

    /* compiled from: SyncQualityOptionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public static final c g = new c();

        public c() {
            super(R.string.sync_quality_medium_title, R.string.sync_quality_medium_description, f.c.a, 848, 480);
        }
    }

    public b(int i, int i2, f fVar, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = fVar;
        this.e = i3;
        this.f = i4;
    }

    @Override // com.amazon.aps.iva.wg.b
    public final f a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final Integer getDescription() {
        return Integer.valueOf(this.c);
    }

    @Override // com.amazon.aps.iva.wg.b
    public final int getHeight() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.p70.c
    public final int getTitle() {
        return this.b;
    }

    @Override // com.amazon.aps.iva.wg.b
    public final int getWidth() {
        return this.e;
    }
}
