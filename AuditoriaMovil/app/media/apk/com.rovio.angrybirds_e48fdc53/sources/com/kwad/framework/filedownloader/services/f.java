package com.kwad.framework.filedownloader.services;

import android.content.Intent;
/* loaded from: classes.dex */
public final class f {
    public static void f(com.kwad.framework.filedownloader.d.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException();
        }
        if (cVar.ta() != -3) {
            throw new IllegalStateException();
        }
        Intent intent = new Intent("filedownloader.intent.action.completed");
        intent.putExtra("model", cVar);
        com.kwad.framework.filedownloader.f.c.vP().sendBroadcast(intent);
    }
}
