package com.ss.android.downloadlib.o;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.downloader.constants.DbJsonConstants;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.File;
/* loaded from: classes3.dex */
public class dr implements IDownloadCompleteHandler {
    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public void handle(DownloadInfo downloadInfo) throws BaseException {
        if (downloadInfo != null && dr(downloadInfo)) {
            dr(wb.getContext(), downloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public boolean needHandle(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            return com.ss.android.downloadlib.rb.q.ge(DownloadSetting.obtain(downloadInfo.getId()));
        }
        return false;
    }

    private boolean dr(DownloadInfo downloadInfo) {
        String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        File file = new File(str);
        String dr = com.ss.android.socialbase.appdownloader.bn.dr.q.dr(wb.getContext(), com.ss.android.socialbase.appdownloader.o.dr(downloadInfo, file), str);
        boolean z = false;
        if (!TextUtils.isEmpty(dr)) {
            String str2 = dr + ".apk";
            if (str2.equals(downloadInfo.getName())) {
                return true;
            }
            try {
                z = file.renameTo(new File(downloadInfo.getSavePath() + File.separator + str2));
                if (z) {
                    downloadInfo.setName(str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    private void dr(Context context, final DownloadInfo downloadInfo) {
        String str = downloadInfo.getSavePath() + File.separator + downloadInfo.getName();
        Cursor query = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new String[]{"_id"}, "_data=? ", new String[]{str}, null);
        if (query == null || !query.moveToFirst()) {
            MediaScannerConnection.scanFile(context, new String[]{str}, new String[]{AdBaseConstants.MIME_APK}, new MediaScannerConnection.OnScanCompletedListener() { // from class: com.ss.android.downloadlib.o.dr.1
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str2, Uri uri) {
                    if (uri != null) {
                        downloadInfo.safePutToDBJsonData(DbJsonConstants.CONTENT_URI, uri.toString());
                        DownloadComponentManager.getDownloadCache().updateDownloadInfo(downloadInfo);
                    }
                }
            });
        } else {
            downloadInfo.safePutToDBJsonData(DbJsonConstants.CONTENT_URI, ContentUris.withAppendedId(MediaStore.Files.getContentUri("external"), query.getInt(query.getColumnIndex("_id"))).toString());
        }
        DownloadUtils.safeClose(query);
    }
}
