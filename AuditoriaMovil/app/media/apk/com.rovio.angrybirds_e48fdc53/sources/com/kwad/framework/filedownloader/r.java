package com.kwad.framework.filedownloader;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.framework.filedownloader.a;
import com.kwad.framework.filedownloader.services.c;
import java.io.File;
import java.util.List;
/* loaded from: classes.dex */
public class r {
    private static final Object abK = new Object();
    private static final Object abM = new Object();
    private w abL;
    private volatile v abN;

    /* loaded from: classes.dex */
    static final class a {
        private static final r abO = new r();
    }

    public static void a(Context context, c.b bVar) {
        if (com.kwad.framework.filedownloader.f.d.aeU) {
            com.kwad.framework.filedownloader.f.d.c(r.class, "init Downloader with params: %s %s", context, bVar);
        }
        if (context == null) {
            throw new IllegalArgumentException("the provided context must not be null!");
        }
        com.kwad.framework.filedownloader.f.c.ao(context.getApplicationContext());
        com.kwad.framework.filedownloader.download.b.us().a(bVar);
    }

    private static void a(e eVar) {
        f.tE().a("event.service.connect.changed", eVar);
    }

    public static com.kwad.framework.filedownloader.a aY(String str) {
        return new c(str);
    }

    public static void an(Context context) {
        com.kwad.framework.filedownloader.f.c.ao(context.getApplicationContext());
    }

    private int bb(int i) {
        List<a.InterfaceC0227a> aW = h.tG().aW(i);
        if (aW.isEmpty()) {
            com.kwad.framework.filedownloader.f.d.d(this, "request pause but not exist %d", Integer.valueOf(i));
            return 0;
        }
        for (a.InterfaceC0227a interfaceC0227a : aW) {
            interfaceC0227a.ti().pause();
        }
        return aW.size();
    }

    public static r tZ() {
        return a.abO;
    }

    public static boolean ub() {
        return n.tR().isConnected();
    }

    public final boolean i(int i, String str) {
        bb(i);
        if (n.tR().ba(i)) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            File file = new File(com.kwad.framework.filedownloader.f.f.bp(str));
            if (file.exists()) {
                file.delete();
            }
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
            return true;
        }
        return false;
    }

    public final void ua() {
        if (ub()) {
            return;
        }
        n.tR().am(com.kwad.framework.filedownloader.f.c.vP());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final w uc() {
        if (this.abL == null) {
            synchronized (abK) {
                if (this.abL == null) {
                    this.abL = new ab();
                }
            }
        }
        return this.abL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final v ud() {
        if (this.abN == null) {
            synchronized (abM) {
                if (this.abN == null) {
                    this.abN = new z();
                    a((e) this.abN);
                }
            }
        }
        return this.abN;
    }
}
