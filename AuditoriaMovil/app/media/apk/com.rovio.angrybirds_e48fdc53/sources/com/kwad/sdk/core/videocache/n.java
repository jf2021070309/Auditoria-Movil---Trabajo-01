package com.kwad.sdk.core.videocache;

import android.content.Context;
import com.kwad.sdk.utils.av;
import java.io.File;
/* loaded from: classes.dex */
public final class n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static File bk(Context context) {
        return new File(av.cL(context), "video-cache");
    }
}
