package com.kwad.sdk.core.network;

import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.av;
import com.kwad.sdk.utils.bc;
import java.io.File;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class e {
    private static volatile e aoS;
    private String aoT = Be();

    private e() {
    }

    public static e Bc() {
        if (aoS == null) {
            synchronized (e.class) {
                if (aoS == null) {
                    aoS = new e();
                }
            }
        }
        return aoS;
    }

    private static String Be() {
        try {
            return com.kwad.sdk.utils.q.a(new File(av.cQ(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext())), Charset.forName("UTF-8"));
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }

    private static void cY(String str) {
        try {
            com.kwad.sdk.utils.q.a(new File(av.cQ(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext())), str, Charset.forName("UTF-8"), false);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    public final String Bd() {
        return this.aoT;
    }

    public final void cX(String str) {
        if (bc.isEquals(this.aoT, str)) {
            return;
        }
        this.aoT = str;
        cY(str);
    }
}
