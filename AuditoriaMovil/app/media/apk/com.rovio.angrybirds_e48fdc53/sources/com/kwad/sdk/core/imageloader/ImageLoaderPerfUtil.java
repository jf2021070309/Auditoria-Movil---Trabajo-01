package com.kwad.sdk.core.imageloader;

import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.y;
/* loaded from: classes.dex */
public class ImageLoaderPerfUtil {
    private static final String TAG = ImageLoaderPerfUtil.class.getSimpleName();

    public static ImageLoaderInfo getInfo() {
        ImageLoaderInfo imageLoaderInfo = new ImageLoaderInfo();
        imageLoaderInfo.totalCount = y.ID();
        imageLoaderInfo.successCount = y.IE();
        imageLoaderInfo.failedCount = y.IF();
        imageLoaderInfo.duration = y.IC();
        return imageLoaderInfo;
    }

    public static void report() {
        g.execute(new aw() { // from class: com.kwad.sdk.core.imageloader.ImageLoaderPerfUtil.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                ImageLoaderInfo info = ImageLoaderPerfUtil.getInfo();
                if (info.totalCount == 0) {
                    c.w(ImageLoaderPerfUtil.TAG, "info.totalCount == 0");
                    return;
                }
                String str = ImageLoaderPerfUtil.TAG;
                c.d(str, "ImageLoaderInfo:" + info.toJson().toString());
                KSLoggerReporter.A(info.toJson());
            }
        });
    }
}
