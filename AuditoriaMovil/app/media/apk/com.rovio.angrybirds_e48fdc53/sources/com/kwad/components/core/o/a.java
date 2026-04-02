package com.kwad.components.core.o;

import android.os.Bundle;
import com.kwad.sdk.api.proxy.IActivityProxy;
/* loaded from: classes.dex */
public class a extends IActivityProxy {
    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
    }
}
