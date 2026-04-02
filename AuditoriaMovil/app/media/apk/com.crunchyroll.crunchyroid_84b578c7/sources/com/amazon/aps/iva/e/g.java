package com.amazon.aps.iva.e;

import android.content.Context;
import androidx.activity.ComponentActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements com.amazon.aps.iva.g.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentActivity b;

    public /* synthetic */ g(ComponentActivity componentActivity, int i) {
        this.a = i;
        this.b = componentActivity;
    }

    @Override // com.amazon.aps.iva.g.b
    public final void a(Context context) {
        int i = this.a;
        ComponentActivity componentActivity = this.b;
        switch (i) {
            case 0:
                ComponentActivity.di(componentActivity, context);
                return;
            default:
                androidx.fragment.app.h.hi((androidx.fragment.app.h) componentActivity, context);
                return;
        }
    }
}
