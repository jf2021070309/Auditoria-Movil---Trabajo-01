package com.vungle.publisher;

import com.vungle.publisher.log.Logger;
import java.io.File;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class qo {
    @Inject
    Provider<String> a;
    @Inject
    Provider<String> b;

    public void a() {
        Logger.d(Logger.FILE_TAG, "deleting ad temp directory");
        a(this.a.get());
    }

    public void b() {
        Logger.d(Logger.FILE_TAG, "deleting old ad temp directory");
        a(this.b.get());
    }

    void a(String str) {
        try {
            if (new File(str).exists()) {
                qr.a(str);
            } else {
                Logger.v(Logger.FILE_TAG, "ad temp directory does not exist " + str);
            }
        } catch (Exception e) {
            Logger.d(Logger.FILE_TAG, "error deleting ad temp directory " + str);
        }
    }
}
