package com.ss.android.downloadlib.addownload.o;

import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public class g {
    private static volatile g dr;
    private long ge = 0;
    private ConcurrentHashMap<String, q> o = new ConcurrentHashMap<>();
    private HashMap<String, Integer> g = new HashMap<>();
    private List<String> q = new CopyOnWriteArrayList();

    public static g dr() {
        if (dr == null) {
            synchronized (g.class) {
                if (dr == null) {
                    dr = new g();
                }
            }
        }
        return dr;
    }

    public void dr(String str, q qVar) {
        if (!TextUtils.isEmpty(str)) {
            this.o.put(str, qVar);
        }
    }

    public void dr(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.o.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long ge() {
        return this.ge;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        this.ge = System.currentTimeMillis();
    }

    public int ge(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (this.g == null) {
            this.g = new HashMap<>();
        }
        if (this.g.containsKey(str)) {
            return this.g.get(str).intValue();
        }
        return 0;
    }

    public static void dr(com.ss.android.downloadad.api.dr.ge geVar) {
        DownloadInfo downloadInfo;
        if (geVar == null || geVar.ge() <= 0 || (downloadInfo = Downloader.getInstance(wb.getContext()).getDownloadInfo(geVar.i())) == null) {
            return;
        }
        dr(downloadInfo);
    }

    public static void dr(DownloadInfo downloadInfo) {
        if (downloadInfo == null || DownloadSetting.obtain(downloadInfo.getId()).optInt("delete_file_after_install", 0) == 0) {
            return;
        }
        try {
            String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.isFile() && file.exists()) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
