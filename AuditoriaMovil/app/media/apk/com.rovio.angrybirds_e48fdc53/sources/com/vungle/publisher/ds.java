package com.vungle.publisher;

import android.content.ContentValues;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
/* loaded from: classes4.dex */
public class ds {
    cz<?, ?, ?, ?> a;

    public int a() {
        Long l = this.a.o;
        Long l2 = this.a.d;
        String B = this.a.B();
        if (l == null) {
            Logger.w(Logger.REPORT_TAG, "download end millis null for " + B);
            return -1;
        } else if (l.longValue() < 0) {
            return 0;
        } else {
            if (l2 == null) {
                Logger.w(Logger.REPORT_TAG, "insert timestamp millis null for " + B);
                return -1;
            }
            return (int) (l.longValue() - l2.longValue());
        }
    }

    void a(Long l) {
        this.a.o = l;
        Logger.d(Logger.REPORT_TAG, "setting ad download end millis " + l + " (duration " + a() + " ms) for " + this.a.B());
    }

    public void b(Long l) {
        a(l);
        this.a.e_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContentValues a(ContentValues contentValues) {
        contentValues.put("download_end_millis", this.a.o);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Singleton
    /* loaded from: classes4.dex */
    public static class a {
        @Inject
        Provider<ds> a;

        public ds a(cz<?, ?, ?, ?> czVar) {
            ds dsVar = this.a.get();
            dsVar.a = czVar;
            return dsVar;
        }
    }
}
