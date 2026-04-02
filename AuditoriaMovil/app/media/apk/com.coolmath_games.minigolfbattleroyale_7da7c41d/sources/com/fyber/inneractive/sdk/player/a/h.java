package com.fyber.inneractive.sdk.player.a;

import android.media.MediaExtractor;
import com.fyber.inneractive.sdk.player.a.b;
import java.util.Map;
/* loaded from: classes.dex */
public final class h extends b {
    @Override // com.fyber.inneractive.sdk.player.a.b
    public final /* bridge */ /* synthetic */ Map a() {
        return super.a();
    }

    @Override // com.fyber.inneractive.sdk.player.a.b
    public final int a(a aVar) {
        int i = b.a.c;
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(aVar.a().getAbsolutePath());
            for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
                String string = mediaExtractor.getTrackFormat(i2).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    i = b.a.a;
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            mediaExtractor.release();
        } catch (Throwable unused2) {
        }
        return i;
    }
}
