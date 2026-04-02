package com.ss.android.downloadlib.o;

import com.ss.android.download.api.config.cu;
import com.ss.android.downloadad.api.constant.AdBaseConstants;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import java.io.File;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class o implements IDownloadCompleteHandler {
    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public void handle(DownloadInfo downloadInfo) throws BaseException {
        JSONObject jSONObject;
        cu wb = wb.wb();
        if (downloadInfo != null && wb != null) {
            String packageName = downloadInfo.getPackageName();
            String targetFilePath = downloadInfo.getTargetFilePath();
            File dr = dr(packageName, targetFilePath);
            com.ss.android.downloadad.api.dr.ge dr2 = com.ss.android.downloadlib.addownload.ge.bn.dr().dr(downloadInfo);
            if (dr2 == null) {
                jSONObject = null;
            } else {
                jSONObject = yk.dr(dr2.rb());
            }
            wb.dr(packageName, targetFilePath, dr, jSONObject);
            downloadInfo.setMimeType(AdBaseConstants.MIME_APK);
            downloadInfo.setName(dr.getName());
            downloadInfo.setMd5(null);
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler
    public boolean needHandle(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            return com.ss.android.download.api.o.ge.dr(DownloadSetting.obtain(downloadInfo.getId()), downloadInfo.getMimeType());
        }
        return false;
    }

    private File dr(String str, String str2) {
        File file = new File(str2);
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            str = name.substring(0, lastIndexOf);
        }
        return new File(file.getParent(), str + ".apk");
    }
}
