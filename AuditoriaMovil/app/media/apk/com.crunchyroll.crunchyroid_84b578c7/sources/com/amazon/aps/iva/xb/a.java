package com.amazon.aps.iva.xb;

import android.app.Activity;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.IInAppMessageViewWrapper;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements IWebViewClientStateListener {
    public final /* synthetic */ IInAppMessageViewWrapper a;
    public final /* synthetic */ BrazeInAppMessageManager b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ a(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        this.a = iInAppMessageViewWrapper;
        this.b = brazeInAppMessageManager;
        this.c = activity;
    }

    public final void a() {
        BrazeInAppMessageManager.c(this.a, this.b, this.c);
    }
}
