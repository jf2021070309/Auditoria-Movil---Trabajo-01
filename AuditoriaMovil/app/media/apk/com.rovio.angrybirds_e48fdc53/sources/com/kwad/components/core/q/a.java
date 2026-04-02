package com.kwad.components.core.q;

import com.kwad.sdk.api.core.SpeedLimitApi;
import java.io.InputStream;
/* loaded from: classes.dex */
public class a implements SpeedLimitApi {
    @Override // com.kwad.sdk.api.core.SpeedLimitApi
    public InputStream wrapInputStream(InputStream inputStream) {
        b.pN();
        return b.wrapInputStream(inputStream);
    }
}
