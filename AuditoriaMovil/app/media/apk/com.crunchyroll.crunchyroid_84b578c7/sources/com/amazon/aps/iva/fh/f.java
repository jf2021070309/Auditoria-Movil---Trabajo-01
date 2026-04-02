package com.amazon.aps.iva.fh;

import android.app.Application;
import com.amazon.aps.iva.yb0.j;
import com.google.gson.Gson;
/* compiled from: AppLaunchesStore.kt */
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.xe.c<a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Application application, Gson gson) {
        super(new e(application, gson));
        j.f(application, "context");
        j.f(gson, "gson");
    }
}
