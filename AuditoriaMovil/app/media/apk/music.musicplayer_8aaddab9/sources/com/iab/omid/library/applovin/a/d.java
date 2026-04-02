package com.iab.omid.library.applovin.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
/* loaded from: classes2.dex */
public final class d extends ContentObserver {
    private final Context a;

    /* renamed from: b  reason: collision with root package name */
    private final AudioManager f4758b;

    /* renamed from: c  reason: collision with root package name */
    private final a f4759c;

    /* renamed from: d  reason: collision with root package name */
    private final c f4760d;

    /* renamed from: e  reason: collision with root package name */
    private float f4761e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.a = context;
        this.f4758b = (AudioManager) context.getSystemService("audio");
        this.f4759c = aVar;
        this.f4760d = cVar;
    }

    private boolean a(float f2) {
        return f2 != this.f4761e;
    }

    private float c() {
        return this.f4759c.a(this.f4758b.getStreamVolume(3), this.f4758b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f4760d.a(this.f4761e);
    }

    public void a() {
        this.f4761e = c();
        d();
        this.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void b() {
        this.a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        float c2 = c();
        if (a(c2)) {
            this.f4761e = c2;
            d();
        }
    }
}
