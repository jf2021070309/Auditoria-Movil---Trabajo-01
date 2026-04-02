package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.fyber.inneractive.sdk.player.a.g;
import java.io.File;
/* loaded from: classes.dex */
public final class d implements g.d {
    public Bitmap a;
    private File b;

    @Override // com.fyber.inneractive.sdk.player.a.g.d
    public final void a(File file) {
        long currentTimeMillis = System.currentTimeMillis();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(file.getPath());
                mediaMetadataRetriever.extractMetadata(8192);
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(1L);
                this.a = frameAtTime;
                if (frameAtTime != null && frameAtTime.getWidth() > 0 && this.a.getHeight() > 0) {
                    this.b = file;
                }
            } catch (Throwable th) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            IAlog.b("Failed getting frame from video file%s", q.a(e));
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused2) {
            IAlog.a("FirstFrameDownloadMediaProcessor processing finished in %dms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    @Override // com.fyber.inneractive.sdk.player.a.g.d
    public final boolean b(File file) {
        File file2 = this.b;
        return (file2 == null || file == null || !file2.getAbsolutePath().equals(file.getAbsolutePath())) ? false : true;
    }
}
