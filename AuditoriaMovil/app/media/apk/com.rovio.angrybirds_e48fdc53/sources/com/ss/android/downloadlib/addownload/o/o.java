package com.ss.android.downloadlib.addownload.o;

import android.content.Context;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.io.File;
import java.util.List;
/* loaded from: classes3.dex */
public class o {
    public static void dr() {
        List<DownloadInfo> dr = com.ss.android.socialbase.appdownloader.g.wb().dr(wb.getContext());
        if (dr != null && dr.size() > 0) {
            for (int i = 0; i < dr.size(); i++) {
                DownloadInfo downloadInfo = dr.get(i);
                File file = new File(downloadInfo.getTempPath(), downloadInfo.getTempName());
                long lastModified = file.lastModified();
                long optInt = DownloadSetting.obtain(downloadInfo.getId()).optInt("download_file_expire_hours", 0) * 3600000;
                if (optInt <= 0) {
                    optInt = 604800000;
                }
                if (file.isFile() && file.exists() && System.currentTimeMillis() - lastModified >= optInt) {
                    dr(file);
                    Downloader.getInstance(wb.getContext()).clearDownloadData(downloadInfo.getId());
                }
            }
        }
    }

    public static void ge() {
        DownloadInfo downloadInfo;
        List successedDownloadInfosWithMimeType = Downloader.getInstance(wb.getContext()).getSuccessedDownloadInfosWithMimeType(AdBaseConstants.MIME_APK);
        if (successedDownloadInfosWithMimeType == null || successedDownloadInfosWithMimeType.isEmpty()) {
            return;
        }
        for (int i = 0; i < successedDownloadInfosWithMimeType.size(); i++) {
            if (((DownloadInfo) successedDownloadInfosWithMimeType.get(i)) != null) {
                String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
                File file = new File(str);
                if (file.exists()) {
                    long currentTimeMillis = System.currentTimeMillis() - file.lastModified();
                    long optInt = DownloadSetting.obtain(downloadInfo.getId()).optInt("download_complete_file_expire_hours", 0) * 3600000;
                    if (optInt <= 0) {
                        optInt = 604800000;
                    }
                    int i2 = (currentTimeMillis > optInt ? 1 : (currentTimeMillis == optInt ? 0 : -1));
                    boolean z = true;
                    if (i2 < 0 && !yk.q(wb.getContext(), str)) {
                        z = false;
                    }
                    if (z) {
                        dr(file);
                    }
                }
            }
        }
    }

    public static void dr(Context context) {
        File externalCacheDir;
        if (context != null && (externalCacheDir = context.getExternalCacheDir()) != null) {
            try {
                dr(externalCacheDir.getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0034 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void dr(java.io.File r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> L19
            java.lang.String r0 = "1"
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L30
            r1.write(r0)     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L30
            r1.close()     // Catch: java.lang.Exception -> L15 java.lang.Throwable -> L30
            goto L2b
        L15:
            r0 = move-exception
            goto L1d
        L17:
            r3 = move-exception
            goto L32
        L19:
            r1 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L1d:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L2b
            r1.close()     // Catch: java.lang.Exception -> L26
            goto L2b
        L26:
            r0 = move-exception
            r0.printStackTrace()
            goto L2c
        L2b:
        L2c:
            r3.delete()
            return
        L30:
            r3 = move-exception
            r0 = r1
        L32:
            if (r0 == 0) goto L3d
            r0.close()     // Catch: java.lang.Exception -> L38
            goto L3d
        L38:
            r0 = move-exception
            r0.printStackTrace()
            goto L3e
        L3d:
        L3e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.o.o.dr(java.io.File):void");
    }

    private static void dr(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = str.endsWith(File.separator) ? str + str2 : str + File.separator + str2;
                File file2 = new File(str3);
                if (file2.isFile()) {
                    file2.delete();
                }
                if (file2.isDirectory()) {
                    dr(str3);
                }
            }
        }
        file.delete();
    }
}
