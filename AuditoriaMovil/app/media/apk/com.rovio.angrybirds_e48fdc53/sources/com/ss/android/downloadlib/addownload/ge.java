package com.ss.android.downloadlib.addownload;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
/* loaded from: classes3.dex */
public class ge {
    private static volatile ge dr;
    private Handler ge = null;

    public static ge dr() {
        if (dr == null) {
            synchronized (ge.class) {
                if (dr == null) {
                    dr = new ge();
                }
            }
        }
        return dr;
    }

    public void dr(Context context, DownloadInfo downloadInfo) {
        if (!ge() || downloadInfo == null) {
            return;
        }
        try {
            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.ge == null) {
            this.ge = new Handler(Looper.getMainLooper());
        }
        final String url = downloadInfo.getUrl();
        Downloader.getInstance(context).clearDownloadData(downloadInfo.getId());
        this.ge.post(new Runnable() { // from class: com.ss.android.downloadlib.addownload.ge.1
            @Override // java.lang.Runnable
            public void run() {
                wb.o().dr(3, wb.getContext(), null, "下载失败，请重试！", null, 0);
                q dr2 = com.ss.android.downloadlib.rb.dr().dr(url);
                if (dr2 != null) {
                    dr2.rb();
                }
            }
        });
    }

    public boolean ge() {
        return wb.ll().optInt("forbid_invalidte_download_file_install", 0) == 1;
    }
}
