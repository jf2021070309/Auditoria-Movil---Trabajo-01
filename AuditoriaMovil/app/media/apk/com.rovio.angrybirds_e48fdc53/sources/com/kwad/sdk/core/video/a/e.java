package com.kwad.sdk.core.video.a;

import android.content.Context;
import com.kwad.sdk.core.report.i;
import com.kwad.sdk.core.report.r;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.am;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class e {
    private static AtomicBoolean awa;
    private static int awd;
    private static int awb = -1;
    private static boolean RU = false;
    private static final AtomicBoolean Zy = new AtomicBoolean(false);
    private static final AtomicBoolean awc = new AtomicBoolean(false);

    public static int Dr() {
        return awd;
    }

    private static boolean Ds() {
        AtomicBoolean atomicBoolean = awa;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
        awa = atomicBoolean2;
        return atomicBoolean2.get();
    }

    public static c a(Context context, boolean z, boolean z2, boolean z3) {
        c bVar;
        boolean z4;
        try {
            if (yD() && z2 && Ds()) {
                com.kwad.sdk.core.e.c.i("MediaPlayerImpl", "constructPlayer KwaiMediaPlayer");
                bVar = new d();
                awd = 2;
                ((d) bVar).bf(z);
            } else {
                com.kwad.sdk.core.e.c.i("MediaPlayerImpl", "constructPlayer AndroidMediaPlayer");
                bVar = new b();
                awd = 1;
            }
            z4 = false;
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.e("MediaPlayerImpl", "constructPlayer exception, using AndroidMediaPlayer", th);
            if (!RU) {
                RU = true;
                com.kwad.sdk.service.c.gatherException(th);
            }
            bVar = new b();
            awd = 1;
            z4 = true;
        }
        int a = am.a(yD(), ServiceProvider.get(com.kwad.sdk.service.a.e.class) != null && ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal(), z2, Ds(), z4, z3, bVar.getMediaPlayerType());
        com.kwad.sdk.core.e.c.cW("player v=" + Integer.toBinaryString(a));
        if (awb != a) {
            awb = a;
            cy(a);
        }
        return bVar;
    }

    private static void cy(int i) {
        r rVar = new r(10212L);
        rVar.ase = i;
        i.a2(rVar);
    }

    private static boolean yD() {
        return awc.get() || com.kwad.framework.a.a.HU.booleanValue();
    }
}
