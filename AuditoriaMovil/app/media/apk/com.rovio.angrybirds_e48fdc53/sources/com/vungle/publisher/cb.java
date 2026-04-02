package com.vungle.publisher;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import com.vungle.publisher.bd;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class cb extends ContentObserver {
    private static final Handler f = new Handler();
    @Inject
    lm a;
    @Inject
    bd.a b;
    @Inject
    qg c;
    @Inject
    Context d;
    private volatile int e;
    private boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public cb() {
        super(f);
        this.g = false;
    }

    public void a() {
        this.e = this.a.a();
        this.g = true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        try {
            super.onChange(z);
            int i = this.e;
            int a = this.a.a();
            this.e = a;
            if (a != i) {
                Logger.v(Logger.DEVICE_TAG, "volume changed " + i + " --> " + a);
                this.c.a(this.b.a(i));
            }
        } catch (Exception e) {
            Logger.e(Logger.DEVICE_TAG, e);
        }
    }

    public void b() {
        if (!this.g) {
            a();
        }
        this.d.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.d.getContentResolver().unregisterContentObserver(this);
    }
}
