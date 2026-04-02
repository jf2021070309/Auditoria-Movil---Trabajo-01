package com.amazon.aps.iva.ln;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.ya0.f;
import com.ellation.crunchyroll.presentation.startup.StartupActivity;
/* compiled from: SingularLinkHandler.kt */
/* loaded from: classes2.dex */
public final class b {
    public final Context a;
    public final LiveData<Activity> b;
    public final Class<? extends Activity> c = StartupActivity.class;
    public final Handler d;

    public b(f fVar, v vVar) {
        this.a = fVar;
        this.b = vVar;
        this.d = new Handler(fVar.getMainLooper());
    }
}
