package com.vungle.publisher;

import android.content.ContentValues;
import android.database.Cursor;
import com.vungle.publisher.ei;
import com.vungle.publisher.env.r;
import com.vungle.publisher.log.Logger;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class ge {
    b<?> a;
    String b;
    Integer c;
    @Inject
    com.vungle.publisher.env.i d;
    @Inject
    r e;

    /* loaded from: classes4.dex */
    public interface b<A extends cn> extends gd<A> {
        String a();

        boolean t();

        boolean u();
    }

    String a() {
        return this.a.f();
    }

    String b() {
        return this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Integer num) {
        this.c = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File d() {
        String f = f();
        if (f == null) {
            return null;
        }
        return new File(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        File d = d();
        if (d == null) {
            Logger.w(Logger.PREPARE_TAG, "null " + this.a.o() + " file for ad " + a());
            return false;
        } else if (d.exists()) {
            Logger.v(Logger.PREPARE_TAG, d.getAbsolutePath() + " exists, " + d.length() + " bytes");
            return true;
        } else {
            Logger.w(Logger.PREPARE_TAG, d.getAbsolutePath() + " missing ");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        return qr.a(b(), this.a.a());
    }

    ei.b g() {
        return this.a.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        this.a.r();
        return this.a.s();
    }

    int i() {
        File d = d();
        if (d == null) {
            return 0;
        }
        return (int) d.length();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        boolean t = this.a.t();
        if (t) {
            ei.a aVar = ei.a.ready;
            Logger.i(Logger.PREPARE_TAG, g() + " " + aVar + " for ad_id " + a());
            this.a.b(aVar);
        } else {
            if (this.e.a()) {
                Logger.i(Logger.PREPARE_TAG, "debug mode: post-processing failed for " + this.a.B() + " - not deleting " + f());
            } else {
                Logger.d(Logger.PREPARE_TAG, "post-processing failed for " + this.a.B() + " - deleting " + f());
                this.a.r();
            }
            this.a.b(ei.a.aware);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        ei.a aVar;
        boolean u = this.a.u();
        String a2 = a();
        ei.b g = g();
        if (u) {
            Logger.i(Logger.PREPARE_TAG, g + " verified for ad_id " + a2);
            aVar = ei.a.ready;
        } else {
            Logger.w(Logger.PREPARE_TAG, g + " failed verification; reprocessing ad_id " + a2);
            aVar = ei.a.aware;
        }
        this.a.b(aVar);
        return u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return a(true);
    }

    boolean a(boolean z) {
        if (!this.d.l()) {
            throw new qm();
        }
        String a2 = a();
        ei.b g = g();
        if (this.c == null) {
            String str = g + " size " + this.c + " for ad_id: " + a2;
            if (z) {
                Logger.d(Logger.PREPARE_TAG, str);
                return true;
            }
            Logger.w(Logger.PREPARE_TAG, str);
        } else {
            int i = i();
            if (i == this.c.intValue()) {
                Logger.d(Logger.PREPARE_TAG, g + " disk size matched size " + this.c + " for ad_id: " + a2);
                return true;
            }
            Logger.d(Logger.PREPARE_TAG, g + " disk size " + i + " failed to match size " + this.c + " for ad_id: " + a2);
            if (e()) {
                Logger.d(Logger.PREPARE_TAG, "ignoring " + g + " size mismatch - file exists");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        File d = d();
        Logger.d(Logger.PREPARE_TAG, "deleting " + d);
        return d != null && d.delete();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ContentValues contentValues) {
        contentValues.put("url", this.b);
        contentValues.put("size", this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Cursor cursor) {
        a(ce.e(cursor, "url"));
        a(ce.c(cursor, "size"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(StringBuilder sb) {
        dp.a(sb, "url", this.b);
        dp.a(sb, "size", this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<ge> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ge a(b<?> bVar) {
            ge geVar = this.a.get();
            geVar.a = bVar;
            return geVar;
        }
    }
}
