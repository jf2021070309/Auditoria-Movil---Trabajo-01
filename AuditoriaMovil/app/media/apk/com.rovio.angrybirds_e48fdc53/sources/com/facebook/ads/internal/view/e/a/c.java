package com.facebook.ads.internal.view.e.a;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
/* loaded from: classes2.dex */
public abstract class c extends RelativeLayout implements b {
    private com.facebook.ads.internal.view.e.b a;

    public c(Context context) {
        super(context);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.a = bVar;
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        b();
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.facebook.ads.internal.view.e.b getVideoView() {
        return this.a;
    }
}
