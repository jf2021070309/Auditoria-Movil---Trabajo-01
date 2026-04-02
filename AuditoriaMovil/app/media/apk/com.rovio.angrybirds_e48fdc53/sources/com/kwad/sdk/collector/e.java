package com.kwad.sdk.collector;

import android.os.Build;
import com.kwad.sdk.utils.m;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.io.IOException;
/* loaded from: classes.dex */
public final class e {
    public static String ck(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return new String(com.kwad.sdk.core.a.c.AI().encode(m.k(q.U(new File(str)))));
            } catch (IOException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        return null;
    }
}
