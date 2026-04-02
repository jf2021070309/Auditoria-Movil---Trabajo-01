package com.fyber.inneractive.sdk.e;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.d.g;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
/* loaded from: classes.dex */
public interface b extends InneractiveAdRenderer {
    void a(int i);

    void a(ViewGroup viewGroup);

    boolean a(View view);

    boolean a(g gVar);

    void c();

    void d();

    void e();

    void f();

    int g();

    int h();

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    void initialize(InneractiveAdSpot inneractiveAdSpot);
}
