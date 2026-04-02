package com.fyber.inneractive.sdk.mraid;

import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.mraid.f;
import com.fyber.inneractive.sdk.util.aj;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m extends a {
    public m(Map<String, String> map, com.fyber.inneractive.sdk.m.d dVar, aj ajVar) {
        super(map, dVar, ajVar);
    }

    @Override // com.fyber.inneractive.sdk.mraid.b
    public final void d() {
        String b = b(ShareConstants.MEDIA_URI);
        if (b != null && !"".equals(b)) {
            this.c.a(b);
        } else {
            this.c.a(f.a.PLAY_VIDEO, "Video can't be played with null or empty URL");
        }
    }

    @Override // com.fyber.inneractive.sdk.mraid.a
    public final String a() {
        return b(ShareConstants.MEDIA_URI);
    }
}
