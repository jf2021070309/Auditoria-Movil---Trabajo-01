package com.ss.android.socialbase.downloader.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.ads.AudienceNetworkActivity;
import com.flurry.android.Constants;
import com.ss.android.dr.o;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.impls.DownloadProxy;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.RandomAccessOutputStream;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.http2.StreamResetException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class DownloadUtils {
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final int CHUNKED_CONTENT_LENGTH = -1;
    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_RANGE = "Content-Range";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final int DEFAULT_MIN_TIME_INTERVAL = 1000;
    public static final String ETAG = "Etag";
    private static final String EXTERNAL_STORAGE_PERMISSION = "android.permission.WRITE_EXTERNAL_STORAGE";
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final String HEADER_TAG_DOWNLOAD_CACHE = "download-tc21-1-15";
    public static final String IF_MODIFIED_SINCE = "if-modified-since";
    public static final String LAST_MODIFIED = "last-modified";
    public static final String LAST_MODIFIED_CASE = "Last-Modified";
    private static final long ONE_KB = 1024;
    private static final long ONE_MB = 1048576;
    public static final String TRANSFER_ENCODING = "Transfer-Encoding";
    public static final String VALUE_CHUNKED = "chunked";
    public static final String X_CACHE = "X-Cache";
    private static ConnectivityManager connectivityManager;
    private static Boolean sIsDownloaderProcess;
    private static Boolean sIsMainProcess;
    private static final String TAG = DownloadUtils.class.getSimpleName();
    private static final Pattern CONTENT_RANGE_RIGHT_VALUE = Pattern.compile(".*\\d+ *- *(\\d+) */ *\\d+");
    private static String sCurProcessName = null;
    private static volatile SparseArray<Boolean> saveTempFileStatusMap = new SparseArray<>();
    private static volatile SparseArray<List<ITempFileSaveCompleteCallback>> saveTempFileListeners = new SparseArray<>();
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static Pattern CONTENT_DISPOSITION_QUOTED_PATTERN = null;
    private static Pattern CONTENT_DISPOSITION_NON_QUOTED_PATTERN = null;

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        return toHexString(bArr, 0, bArr.length);
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = bArr[i5 + i] & Constants.UNKNOWN;
            int i7 = i4 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[i6 >> 4];
            i4 = i7 + 1;
            cArr[i7] = cArr2[i6 & 15];
        }
        return new String(cArr, 0, i3);
    }

    public static String hexToString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return new String(bArr, AudienceNetworkActivity.WEBVIEW_ENCODING);
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static long getContentLength(IDownloadHeadHttpConnection iDownloadHeadHttpConnection) {
        if (iDownloadHeadHttpConnection == null) {
            return -1L;
        }
        String respHeadFieldIgnoreCase = getRespHeadFieldIgnoreCase(iDownloadHeadHttpConnection, CONTENT_LENGTH);
        if (TextUtils.isEmpty(respHeadFieldIgnoreCase) && DownloadExpSwitchCode.isSwitchEnable(1)) {
            return parseContentLengthFromContentRange(iDownloadHeadHttpConnection);
        }
        try {
            return Long.parseLong(respHeadFieldIgnoreCase);
        } catch (NumberFormatException e) {
            return -1L;
        }
    }

    public static long parseContentLengthFromContentRange(IDownloadHeadHttpConnection iDownloadHeadHttpConnection) {
        if (iDownloadHeadHttpConnection == null) {
            return -1L;
        }
        String respHeadFieldIgnoreCase = getRespHeadFieldIgnoreCase(iDownloadHeadHttpConnection, CONTENT_RANGE);
        if (TextUtils.isEmpty(respHeadFieldIgnoreCase)) {
            return -1L;
        }
        try {
            Matcher matcher = Pattern.compile("bytes (\\d+)-(\\d+)/\\d+").matcher(respHeadFieldIgnoreCase);
            if (matcher.find()) {
                return (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            }
        } catch (Exception e) {
            String str = TAG;
            Logger.w(str, "parse content-length from content-range failed " + e);
        }
        return -1L;
    }

    public static long parseContentRangeOfInstanceLength(String str) {
        if (str == null) {
            return -1L;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException e) {
                String str2 = TAG;
                Logger.w(str2, "parse instance length failed with " + str);
            }
        }
        return -1L;
    }

    private static String parseContentDisposition(String str) {
        Matcher matcher;
        if (str == null) {
            return null;
        }
        try {
            if (CONTENT_DISPOSITION_QUOTED_PATTERN == null) {
                CONTENT_DISPOSITION_QUOTED_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
            }
            matcher = CONTENT_DISPOSITION_QUOTED_PATTERN.matcher(str);
        } catch (Exception e) {
        }
        if (matcher.find()) {
            return matcher.group(1);
        }
        if (CONTENT_DISPOSITION_NON_QUOTED_PATTERN == null) {
            CONTENT_DISPOSITION_NON_QUOTED_PATTERN = Pattern.compile("attachment;\\s*filename\\s*=\\s*(.*)");
        }
        Matcher matcher2 = CONTENT_DISPOSITION_NON_QUOTED_PATTERN.matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    public static String getFileNameFromConnection(IDownloadHeadHttpConnection iDownloadHeadHttpConnection, String str) {
        String parseContentDisposition = parseContentDisposition(iDownloadHeadHttpConnection.getResponseHeaderField(CONTENT_DISPOSITION));
        if (TextUtils.isEmpty(parseContentDisposition)) {
            return md5Hex(str);
        }
        return parseContentDisposition;
    }

    public static RandomAccessOutputStream createOutputStream(DownloadInfo downloadInfo, String str, String str2, int i) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        boolean z = false;
        if (file.exists() && file.isDirectory()) {
            throw new BaseException((int) DownloadErrorCode.ERROR_TEMP_FILE_IS_DIRECTORY, new IOException(String.format("path is :%s, path is directory:%B:", str, Boolean.valueOf(file.isDirectory()))));
        }
        if (!file.exists()) {
            try {
                File file2 = new File(str);
                if (!file2.exists() || !file2.isDirectory()) {
                    if (!file2.exists()) {
                        if (!file2.mkdirs() && !file2.exists()) {
                            if (DownloadSetting.obtain(downloadInfo).optInt(DownloadSettingKeys.OPT_MKDIR_FAILED, 0) == 1) {
                                int i2 = 0;
                                while (!z) {
                                    int i3 = i2 + 1;
                                    if (i2 >= 3) {
                                        break;
                                    }
                                    try {
                                        Thread.sleep(10L);
                                        z = file2.mkdirs();
                                        i2 = i3;
                                    } catch (InterruptedException e) {
                                    }
                                }
                                if (!z) {
                                    if (getAvailableSpaceBytes(downloadInfo.getSavePath()) < 16384) {
                                        throw new BaseException(1006, "download savePath directory can not created:" + str);
                                    }
                                    throw new BaseException((int) DownloadErrorCode.ERROR_SAVE_PATH_CREATE_FAILED, "download savePath directory can not created:" + str);
                                }
                            } else {
                                throw new BaseException((int) DownloadErrorCode.ERROR_SAVE_PATH_CREATE_FAILED, "download savePath directory can not created:" + str);
                            }
                        }
                    } else {
                        file2.delete();
                        if (!file2.mkdirs() && !file2.exists()) {
                            throw new BaseException((int) DownloadErrorCode.ERROR_SAVE_PATH_NOT_DIRECTORY, "download savePath is not directory:path=" + str);
                        }
                        throw new BaseException((int) DownloadErrorCode.ERROR_SAVE_PATH_NOT_DIRECTORY, "download savePath is not directory:" + str);
                    }
                }
                file.createNewFile();
            } catch (IOException e2) {
                throw new BaseException((int) DownloadErrorCode.ERROR_TEMP_FILE_CREATE_FAILED, e2);
            }
        }
        return new RandomAccessOutputStream(file, i);
    }

    public static List<DownloadChunk> parseHostChunkList(List<DownloadChunk> list) {
        SparseArray sparseArray = new SparseArray();
        SparseArray sparseArray2 = new SparseArray();
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.isHostChunk()) {
                    sparseArray.put(downloadChunk.getChunkIndex(), downloadChunk);
                    List<DownloadChunk> list2 = (List) sparseArray2.get(downloadChunk.getChunkIndex());
                    if (list2 != null) {
                        for (DownloadChunk downloadChunk2 : list2) {
                            downloadChunk2.setHostChunk(downloadChunk);
                        }
                        downloadChunk.setSubChunkList(list2);
                    }
                } else {
                    DownloadChunk downloadChunk3 = (DownloadChunk) sparseArray.get(downloadChunk.getHostChunkIndex());
                    if (downloadChunk3 != null) {
                        List<DownloadChunk> subChunkList = downloadChunk3.getSubChunkList();
                        if (subChunkList == null) {
                            subChunkList = new ArrayList<>();
                            downloadChunk3.setSubChunkList(subChunkList);
                        }
                        downloadChunk.setHostChunk(downloadChunk3);
                        subChunkList.add(downloadChunk);
                    } else {
                        List list3 = (List) sparseArray2.get(downloadChunk.getHostChunkIndex());
                        if (list3 == null) {
                            list3 = new ArrayList();
                            sparseArray2.put(downloadChunk.getHostChunkIndex(), list3);
                        }
                        list3.add(downloadChunk);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return list;
    }

    public static String getTargetFilePath(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return String.format("%s%s%s", str, File.separator, str2);
    }

    public static String getTempFilePath(String str, String str2, String str3) {
        String targetFilePath;
        if ((TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            targetFilePath = getTargetFilePath(str2, str3);
        } else {
            targetFilePath = getTargetFilePath(str, str3);
        }
        if (TextUtils.isEmpty(targetFilePath)) {
            return null;
        }
        return String.format("%s.tp", targetFilePath);
    }

    public static String getTempFileSavePath(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return str;
    }

    public static String getTempFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format("%s.tp", str);
    }

    public static long getTotalOffset(List<DownloadChunk> list) {
        long j = 0;
        for (DownloadChunk downloadChunk : list) {
            j += downloadChunk.getDownloadChunkBytes();
        }
        return j;
    }

    public static void deleteAllDownloadFiles(DownloadInfo downloadInfo) {
        deleteAllDownloadFiles(downloadInfo, true);
    }

    public static void deleteAllDownloadFiles(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo == null) {
            return;
        }
        if (z) {
            try {
                deleteFile(downloadInfo.getSavePath(), downloadInfo.getName());
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        deleteFile(downloadInfo.getTempPath(), downloadInfo.getTempName());
        if (downloadInfo.isSavePathRedirected()) {
            clearAntiHijackDir(downloadInfo);
        }
        if (z) {
            String md5Hex = md5Hex(downloadInfo.getUrl());
            if (!TextUtils.isEmpty(md5Hex) && !TextUtils.isEmpty(downloadInfo.getSavePath()) && downloadInfo.getSavePath().contains(md5Hex)) {
                deleteDirIfEmpty(downloadInfo.getSavePath());
            }
        }
    }

    public static void clearAntiHijackDir(DownloadInfo downloadInfo) {
        DownloadSetting obtain;
        JSONObject optJSONObject;
        if (downloadInfo != null && (optJSONObject = (obtain = DownloadSetting.obtain(downloadInfo.getId())).optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR)) != null) {
            String optString = optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_INSTALL_DESC);
            if (!TextUtils.isEmpty(optString)) {
                deleteFile(downloadInfo.getSavePath(), optString);
            }
            String title = downloadInfo.getTitle();
            if (TextUtils.isEmpty(title)) {
                title = downloadInfo.getName();
            }
            String redirectSavePath = getRedirectSavePath(title, obtain);
            String savePath = downloadInfo.getSavePath();
            if (!TextUtils.isEmpty(redirectSavePath) && !TextUtils.isEmpty(savePath)) {
                File file = new File(redirectSavePath);
                for (File file2 = new File(savePath); file != null && file2 != null && file2.isDirectory() && TextUtils.equals(file.getName(), file2.getName()); file2 = file2.getParentFile()) {
                    deleteDirIfEmpty(file2.getPath());
                    file = file.getParentFile();
                }
            }
        }
    }

    private static boolean deleteDirIfEmpty(String str) {
        String str2 = TAG;
        Log.w(str2, "deleteDirIfEmpty on thread: " + Thread.currentThread());
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isDirectory()) {
                if (!file.delete()) {
                    Log.w(str2, "deleteDirIfEmpty return false");
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static void deleteFile(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            File file = new File(str, str2);
            if (file.exists()) {
                String str3 = TAG;
                Log.e(str3, "deleteFile: " + str + "/" + str2);
                file.delete();
            }
        }
    }

    public static boolean checkPermission(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) ? false : true;
    }

    public static boolean isFileDownloaded(DownloadInfo downloadInfo) {
        return isFileDownloaded(downloadInfo, downloadInfo.isForce(), downloadInfo.getMd5());
    }

    public static boolean isFileDownloaded(DownloadInfo downloadInfo, boolean z, String str) {
        if (z || TextUtils.isEmpty(downloadInfo.getSavePath()) || TextUtils.isEmpty(downloadInfo.getName())) {
            return false;
        }
        try {
            if (new File(downloadInfo.getSavePath(), downloadInfo.getName()).exists()) {
                if (checkMd5Valid(downloadInfo.getSavePath(), downloadInfo.getName(), str)) {
                    return true;
                }
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isFileDownloaded(String str, String str2, boolean z) {
        if (z || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (new File(str, str2).exists()) {
                if (checkMd5Valid(str, str2, null)) {
                    return true;
                }
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean isFileDownloaded(String str, String str2, String str3, boolean z) {
        if (z || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (new File(str, str2).exists()) {
                if (checkMd5Valid(str, str2, str3)) {
                    return true;
                }
            }
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean cacheExpired(DownloadInfo downloadInfo) {
        boolean z = false;
        if (!downloadInfo.isDeleteCacheIfCheckFailed() && TextUtils.isEmpty(downloadInfo.getLastModified())) {
            Logger.d(TAG, "dcache::last modify is emtpy, so just return cache");
        } else {
            String str = TAG;
            Logger.d(str, "dcache::curt=" + System.currentTimeMillis() + " expired=" + downloadInfo.getCacheExpiredTime());
            if (System.currentTimeMillis() > downloadInfo.getCacheExpiredTime()) {
                z = true;
            }
        }
        String str2 = TAG;
        Logger.d(str2, "cacheExpired::dcache::name=" + downloadInfo.getName() + " expired=" + z);
        return z;
    }

    public static int checkMd5Status(String str, String str2, String str3) {
        return o.dr(str3, new File(str, str2));
    }

    public static boolean checkMd5Valid(String str, String str2, String str3) {
        return isMd5Valid(checkMd5Status(str, str2, str3));
    }

    public static boolean isMd5Valid(int i) {
        return i == 0 || i == 2;
    }

    public static int checkMd5Status(File file, String str) {
        return o.dr(str, file);
    }

    public static boolean checkMd5Valid(File file, String str) {
        return isMd5Valid(o.dr(str, file));
    }

    public static String getMd5StatusMsg(int i) {
        String str = "ttmd5 check code = " + i + ", ";
        if (i != 99) {
            switch (i) {
                case 0:
                    return str + "md5 match";
                case 1:
                    return str + "md5 not match";
                case 2:
                    return str + "md5 empty";
                case 3:
                    return str + "ttmd5 version not support";
                case 4:
                    return str + "ttmd5 tag parser error";
                case 5:
                    return str + "file not exist";
                case 6:
                    return str + "get file md5 error";
                default:
                    return str;
            }
        }
        return str + "unknown error";
    }

    public static long getAvailableSpaceBytes(String str) throws BaseException {
        try {
            StatFs statFs = new StatFs(str);
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getAvailableBytes();
            }
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (IllegalArgumentException e) {
            throw new BaseException((int) DownloadErrorCode.ERROR_NO_SDCARD_PERMISSION, e);
        } catch (Throwable th) {
            throw new BaseException((int) DownloadErrorCode.ERROR_GET_AVAILABLE_SPACE, th);
        }
    }

    public static double byteToMb(long j) {
        return j / 1048576.0d;
    }

    public static void saveFileAsTargetName(DownloadInfo downloadInfo, IDownloadMonitorDepend iDownloadMonitorDepend, ITempFileSaveCompleteCallback iTempFileSaveCompleteCallback) {
        boolean z;
        BaseException baseException;
        boolean z2;
        String str = TAG;
        Logger.d(str, "saveFileAsTargetName targetName is " + downloadInfo.getTargetFilePath());
        try {
            synchronized (saveTempFileStatusMap) {
                if (saveTempFileStatusMap.get(downloadInfo.getId()) == Boolean.TRUE) {
                    Logger.d(str, "has another same task is saving temp file");
                    if (iTempFileSaveCompleteCallback != null) {
                        List<ITempFileSaveCompleteCallback> list = saveTempFileListeners.get(downloadInfo.getId());
                        if (list == null) {
                            list = new ArrayList<>();
                            saveTempFileListeners.put(downloadInfo.getId(), list);
                        }
                        list.add(iTempFileSaveCompleteCallback);
                    }
                    return;
                }
                Logger.d(str, "saveTempFileStatusMap put id:" + downloadInfo.getId());
                saveTempFileStatusMap.put(downloadInfo.getId(), Boolean.TRUE);
                File file = new File(downloadInfo.getTempPath(), downloadInfo.getTempName());
                File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                boolean isSavePathSecurity = isSavePathSecurity(downloadInfo.getSavePath());
                if (file2.exists()) {
                    Logger.d(str, "targetFile exist");
                    int checkMd5Status = checkMd5Status(file2, downloadInfo.getMd5());
                    if (isMd5Valid(checkMd5Status)) {
                        Logger.d(str, "tempFile not exist , targetFile exists and md5 check valid");
                        downloadInfo.setTTMd5CheckStatus(checkMd5Status);
                        if (iTempFileSaveCompleteCallback != null) {
                            iTempFileSaveCompleteCallback.onSuccess();
                        }
                        handleTempSaveCallback(downloadInfo.getId(), true, null);
                        z = false;
                    } else {
                        if (!file.exists()) {
                            BaseException baseException2 = new BaseException(1005, String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s", downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName(), getMd5StatusMsg(checkMd5Status)));
                            if (iTempFileSaveCompleteCallback != null) {
                                iTempFileSaveCompleteCallback.onFailed(baseException2);
                            }
                            handleTempSaveCallback(downloadInfo.getId(), false, baseException2);
                            z = false;
                        } else {
                            z = true;
                        }
                        if (isSavePathSecurity && !file2.delete()) {
                            if (!z) {
                                if (iDownloadMonitorDepend != null) {
                                    DownloadMonitorHelper.monitorSendWithTaskMonitor(iDownloadMonitorDepend, downloadInfo, new BaseException((int) DownloadErrorCode.ERROR_TEMP_TO_TARGET_FAILED, "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"), downloadInfo.getStatus());
                                }
                            } else {
                                BaseException baseException3 = new BaseException((int) DownloadErrorCode.ERROR_TARGET_FILE_DELETE_FAILED, "delete targetPath file existed with md5 check invalid status:" + getMd5StatusMsg(checkMd5Status));
                                if (iTempFileSaveCompleteCallback != null) {
                                    iTempFileSaveCompleteCallback.onFailed(baseException3);
                                }
                                handleTempSaveCallback(downloadInfo.getId(), false, baseException3);
                                z = false;
                            }
                        }
                    }
                } else if (!file.exists()) {
                    BaseException baseException4 = new BaseException(1005, String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist", downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName()));
                    if (iTempFileSaveCompleteCallback != null) {
                        iTempFileSaveCompleteCallback.onFailed(baseException4);
                    }
                    handleTempSaveCallback(downloadInfo.getId(), false, baseException4);
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    try {
                        int optInt = DownloadSetting.obtain(downloadInfo.getId()).optInt(DownloadSettingKeys.DOWNLOAD_FINISH_CHECK_TTMD5, 2);
                        if (optInt > 0) {
                            int checkMd5Status2 = checkMd5Status(file, downloadInfo.getMd5());
                            downloadInfo.setTTMd5CheckStatus(checkMd5Status2);
                            if (optInt >= 2 && !isMd5Valid(checkMd5Status2)) {
                                BaseException baseException5 = new BaseException((int) DownloadErrorCode.ERROR_MD5_INVALID, getMd5StatusMsg(checkMd5Status2));
                                if (iTempFileSaveCompleteCallback != null) {
                                    iTempFileSaveCompleteCallback.onFailed(baseException5);
                                }
                                handleTempSaveCallback(downloadInfo.getId(), false, baseException5);
                                deleteAllDownloadFiles(downloadInfo, isSavePathSecurity);
                                return;
                            }
                        }
                        z2 = !moveFile(file, file2);
                        baseException = null;
                    } catch (BaseException e) {
                        if (!DownloadSetting.obtain(downloadInfo.getId()).optBugFix(DownloadSettingKeys.BugFix.FIX_FILE_RENAME_FAILED)) {
                            baseException = e;
                            z2 = false;
                        } else {
                            baseException = e;
                            z2 = true;
                        }
                    }
                    if (z2) {
                        if (baseException == null) {
                            baseException = new BaseException((int) DownloadErrorCode.ERROR_TEMP_TO_TARGET_FAILED, String.format("Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)", downloadInfo.getTempPath(), downloadInfo.getTempName(), downloadInfo.getSavePath(), downloadInfo.getName()));
                        }
                        if (iTempFileSaveCompleteCallback != null) {
                            iTempFileSaveCompleteCallback.onFailed(baseException);
                        }
                        handleTempSaveCallback(downloadInfo.getId(), false, baseException);
                        return;
                    }
                    if (iTempFileSaveCompleteCallback != null) {
                        iTempFileSaveCompleteCallback.onSuccess();
                    }
                    handleTempSaveCallback(downloadInfo.getId(), true, null);
                }
            }
        } catch (Throwable th) {
            Logger.d(TAG, "saveFileAsTargetName throwable " + th.getMessage());
            if (iTempFileSaveCompleteCallback != null) {
                iTempFileSaveCompleteCallback.onFailed(new BaseException((int) DownloadErrorCode.ERROR_TEMP_TO_TARGET_FAILED, getErrorMsgWithTagPrefix(th, "saveFileAsTargetName")));
            }
        }
    }

    private static void handleTempSaveCallback(int i, boolean z, BaseException baseException) {
        synchronized (saveTempFileStatusMap) {
            List<ITempFileSaveCompleteCallback> list = saveTempFileListeners.get(i);
            if (list != null) {
                for (ITempFileSaveCompleteCallback iTempFileSaveCompleteCallback : list) {
                    if (iTempFileSaveCompleteCallback != null) {
                        if (z) {
                            iTempFileSaveCompleteCallback.onSuccess();
                        } else {
                            iTempFileSaveCompleteCallback.onFailed(baseException);
                        }
                    }
                }
            }
            String str = TAG;
            Logger.d(str, "handleTempSaveCallback id:" + i);
            saveTempFileStatusMap.remove(i);
        }
    }

    public static void copyFileFromExistFileWithSameName(DownloadInfo downloadInfo, String str) throws BaseException {
        if (downloadInfo == null || TextUtils.isEmpty(str) || str.equals(downloadInfo.getName())) {
            return;
        }
        File file = new File(downloadInfo.getSavePath(), str);
        File file2 = new File(downloadInfo.getSavePath(), downloadInfo.getName());
        String str2 = TAG;
        Log.e(str2, "copyFileFromExistFileWithSameName: existFile:" + file.getPath() + " targetFile:" + file2.getPath());
        if (file2.exists() && !file2.canWrite()) {
            throw new BaseException(1001, "targetPath file exists but read-only");
        }
        if (!copyFile(file, file2)) {
            throw new BaseException(1001, String.format("Can't copy the exist file(%s/%s) to the target file(%s/%s)", downloadInfo.getSavePath(), str, downloadInfo.getSavePath(), downloadInfo.getName()));
        }
    }

    public static boolean copyFile(File file, File file2) throws BaseException {
        return copyFile(file, file2, true);
    }

    public static boolean copyFile(File file, File file2, boolean z) throws BaseException {
        if (file != null && file2 != null) {
            try {
                if (file.exists() && !file.isDirectory() && !file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                        throw new BaseException((int) DownloadErrorCode.ERROR_TARGET_DIR_MKDIR_FAILED, "Destination '" + parentFile + "' directory cannot be created");
                    }
                    String str = TAG;
                    Log.e(str, "copyFile: srcFile:" + file.getPath() + " destFile:" + file2.getPath());
                    if (file2.exists() && !file2.canWrite()) {
                        throw new IOException("Destination '" + file2 + "' exists but is read-only");
                    }
                    doCopyFile(file, file2, z);
                    return true;
                }
            } catch (BaseException e) {
                throw e;
            } catch (Throwable th) {
                parseException(th, "CopyFile");
                return false;
            }
        }
        return false;
    }

    private static void doCopyFile(File file, File file2, boolean z) throws IOException {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileChannel channel2 = fileOutputStream.getChannel();
            try {
                long size = channel.size();
                long j = 0;
                while (j < size) {
                    long j2 = size - j;
                    long transferFrom = channel2.transferFrom(channel, j, j2 > FILE_COPY_BUFFER_SIZE ? 31457280L : j2);
                    if (transferFrom == 0) {
                        break;
                    }
                    j += transferFrom;
                }
                if (channel2 != null) {
                    channel2.close();
                }
                fileOutputStream.close();
                if (channel != null) {
                    channel.close();
                }
                fileInputStream.close();
                long length = file.length();
                long length2 = file2.length();
                if (length == length2) {
                    if (z) {
                        file2.setLastModified(file.lastModified());
                        return;
                    }
                    return;
                }
                throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (channel2 != null) {
                        try {
                            channel2.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    fileInputStream.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }

    public static boolean moveFile(File file, File file2) throws BaseException {
        String str = TAG;
        Log.e(str, "moveFile1: src:" + file.getPath() + " dest:" + file2.getPath());
        boolean renameTo = file.renameTo(file2);
        if (!renameTo) {
            renameTo = copyFile(file, file2);
            try {
                Log.e(str, "moveFile2: src:" + file.getPath() + " dest:" + file2.getPath());
                file.delete();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return renameTo;
    }

    public static boolean isFileExist(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return new File(str, str2).exists();
    }

    public static boolean canAcceptPartial(int i, String str) {
        if (DownloadExpSwitchCode.isSwitchEnable(16777216)) {
            return i == 206 || i == 1;
        } else if (i >= 400) {
            return false;
        } else {
            return i == 206 || i == 1 || "bytes".equals(str);
        }
    }

    public static boolean isResponseDataFromBegin(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    public static boolean isResponseCodeValid(int i) {
        return i == 206 || i == 200;
    }

    public static boolean isChunkedTask(long j) {
        return j == -1;
    }

    public static boolean isChunkedTask(IDownloadHeadHttpConnection iDownloadHeadHttpConnection) {
        if (iDownloadHeadHttpConnection == null) {
            return false;
        }
        return DownloadExpSwitchCode.isSwitchEnable(8) ? VALUE_CHUNKED.equals(iDownloadHeadHttpConnection.getResponseHeaderField(TRANSFER_ENCODING)) || getContentLength(iDownloadHeadHttpConnection) == -1 : getContentLength(iDownloadHeadHttpConnection) == -1;
    }

    public static List<HttpHeader> add0_0RangeHeader(List<HttpHeader> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        arrayList.add(new HttpHeader("Range", "bytes=0-0"));
        return arrayList;
    }

    public static List<HttpHeader> addRangeHeader(List<HttpHeader> list, String str, DownloadChunk downloadChunk) {
        return addRangeHeader(list, str, downloadChunk.getCurOffset(), downloadChunk.getEndOffset());
    }

    public static List<HttpHeader> addRangeHeader(List<HttpHeader> list, String str, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader("If-Match", str));
        }
        arrayList.add(new HttpHeader("Accept-Encoding", "identity"));
        String format = j2 <= 0 ? String.format("bytes=%s-", String.valueOf(j)) : String.format("bytes=%s-%s", String.valueOf(j), String.valueOf(j2));
        arrayList.add(new HttpHeader("Range", format));
        String str2 = TAG;
        Logger.d(str2, " range CurrentOffset:" + j + " EndOffset:" + j2 + ", range = " + format);
        return arrayList;
    }

    public static File getDatabaseFile(Context context, boolean z, String str) {
        File file;
        String str2 = "";
        try {
            str2 = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError e) {
        } catch (NullPointerException e2) {
        }
        if (z && "mounted".equals(str2) && hasExternalStoragePermission(context)) {
            file = getExternalDBFile(str);
        } else {
            file = null;
        }
        if (file == null) {
            file = context.getDatabasePath(str);
        }
        if (file == null) {
            return new File("/data/data/" + context.getPackageName() + "/database/", str);
        }
        return file;
    }

    private static boolean hasExternalStoragePermission(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    private static File getExternalDBFile(String str) {
        File file = null;
        if (!isSdcardAvailable() || !isSdcardWritable()) {
            return null;
        }
        try {
            Context appContext = DownloadComponentManager.getAppContext();
            File externalFilesDir = appContext.getExternalFilesDir("database" + File.separator + str);
            if (externalFilesDir == null) {
                return null;
            }
            try {
                if (!externalFilesDir.exists()) {
                    externalFilesDir.createNewFile();
                }
                if (Logger.debug()) {
                    String str2 = TAG;
                    Logger.d(str2, "download db path:" + externalFilesDir.getAbsolutePath());
                    return externalFilesDir;
                }
                return externalFilesDir;
            } catch (Exception e) {
                e = e;
                file = externalFilesDir;
                e.printStackTrace();
                return file;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void ensureDirExists(String str) {
        if (str == null) {
            return;
        }
        ensureDirExists(new File(str));
    }

    private static void ensureDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    private static boolean isSdcardAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    private static boolean isSdcardWritable() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception e) {
            return false;
        }
    }

    public static long getMaxBytesOverMobile() {
        return 2147483648L;
    }

    public static boolean isDownloadSuccessAndFileNotExist(int i, String str, String str2) {
        if (i == -3 && !isFileExist(str, str2)) {
            return true;
        }
        return false;
    }

    public static ConnectivityManager getConnectivityManager(Context context) {
        ConnectivityManager connectivityManager2 = connectivityManager;
        if (connectivityManager2 == null) {
            ConnectivityManager connectivityManager3 = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager = connectivityManager3;
            return connectivityManager3;
        }
        return connectivityManager2;
    }

    public static boolean isWifi(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager2 = getConnectivityManager(context);
            if (connectivityManager2 != null && (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) != null && activeNetworkInfo.isAvailable()) {
                return 1 == activeNetworkInfo.getType();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager2 = getConnectivityManager(context);
            if (connectivityManager2 == null || (activeNetworkInfo = connectivityManager2.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnected();
        } catch (Exception e) {
            return false;
        }
    }

    public static String md5Hex(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(str.getBytes("UTF-8"));
                    return toHexString(messageDigest.digest());
                }
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static String getCurProcessName(Context context) {
        String str = sCurProcessName;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String curProcessNameByApplication = getCurProcessNameByApplication();
        sCurProcessName = curProcessNameByApplication;
        if (!TextUtils.isEmpty(curProcessNameByApplication)) {
            return sCurProcessName;
        }
        String curProcessNameByActivityThread = getCurProcessNameByActivityThread();
        sCurProcessName = curProcessNameByActivityThread;
        if (!TextUtils.isEmpty(curProcessNameByActivityThread)) {
            return sCurProcessName;
        }
        String curProcessNameByActivityManager = getCurProcessNameByActivityManager(context);
        sCurProcessName = curProcessNameByActivityManager;
        if (!TextUtils.isEmpty(curProcessNameByActivityManager)) {
            return sCurProcessName;
        }
        String curProcessNameFromProc = getCurProcessNameFromProc();
        sCurProcessName = curProcessNameFromProc;
        return curProcessNameFromProc;
    }

    private static String getCurProcessNameFromProc() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                if (Logger.debug()) {
                    Logger.d("Process", "get processName = " + sb.toString());
                }
                String sb2 = sb.toString();
                safeClose(bufferedReader);
                return sb2;
            } catch (Throwable th) {
                safeClose(bufferedReader);
                return null;
            }
        } catch (Throwable th2) {
            bufferedReader = null;
        }
    }

    private static String getCurProcessNameByApplication() {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String processName = Application.getProcessName();
                if (!TextUtils.isEmpty(processName) && Logger.debug()) {
                    Logger.d("Process", "processName = " + processName);
                }
                return processName;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private static String getCurProcessNameByActivityThread() {
        String str;
        Throwable th;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (!(invoke instanceof String)) {
                return null;
            }
            str = (String) invoke;
            try {
                if (!TextUtils.isEmpty(str) && Logger.debug()) {
                    Logger.d("Process", "processName = " + str);
                }
                return str;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return str;
            }
        } catch (Throwable th3) {
            str = null;
            th = th3;
        }
    }

    private static String getCurProcessNameByActivityManager(Context context) {
        if (context == null) {
            return null;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        if (Logger.debug()) {
                            Logger.d("Process", "processName = " + runningAppProcessInfo.processName);
                        }
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean isMainProcess() {
        Boolean bool = sIsMainProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        String curProcessName = getCurProcessName(DownloadComponentManager.getAppContext());
        boolean z = false;
        if (curProcessName != null && curProcessName.contains(":")) {
            sIsMainProcess = false;
        } else {
            if (curProcessName != null && curProcessName.equals(DownloadComponentManager.getAppContext().getPackageName())) {
                z = true;
            }
            sIsMainProcess = Boolean.valueOf(z);
        }
        return sIsMainProcess.booleanValue();
    }

    public static boolean needNotifyDownloaderProcess() {
        return !isDownloaderProcess() && DownloadComponentManager.isDownloadInMultiProcess() && DownloadProxy.get(true).isServiceAlive();
    }

    public static boolean isDownloaderProcess() {
        Boolean bool = sIsDownloaderProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        String curProcessName = getCurProcessName(DownloadComponentManager.getAppContext());
        if (curProcessName != null) {
            if (curProcessName.equals(DownloadComponentManager.getAppContext().getPackageName() + ":downloader")) {
                sIsDownloaderProcess = true;
                return sIsDownloaderProcess.booleanValue();
            }
        }
        sIsDownloaderProcess = false;
        return sIsDownloaderProcess.booleanValue();
    }

    public static boolean isProcessNameSame(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        String curProcessName = getCurProcessName(DownloadComponentManager.getAppContext());
        return curProcessName != null && curProcessName.equals(str);
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static String getLoggerTag(String str) {
        return Logger.downloaderTag(str);
    }

    public static String getEncodedStr(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                sb.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static boolean isTimeOutException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        if (!(th instanceof SocketTimeoutException)) {
            if (TextUtils.isEmpty(throwableMsg)) {
                return false;
            }
            if (!throwableMsg.contains("time out") && !throwableMsg.contains("Time-out")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isForbiddenException(Throwable th) {
        DownloadHttpException downloadHttpException;
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        if (!(th instanceof DownloadHttpException) || (((downloadHttpException = (DownloadHttpException) th) == null || downloadHttpException.getHttpStatusCode() != 403) && (TextUtils.isEmpty(throwableMsg) || !throwableMsg.contains("403")))) {
            return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Forbidden");
        }
        return true;
    }

    public static boolean isNetNotAvailableException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("network not available");
    }

    public static boolean isConnectionException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Exception in connect");
    }

    public static boolean isResponseCodeError(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        if (TextUtils.isEmpty(throwableMsg)) {
            return false;
        }
        return throwableMsg.contains("Requested Range Not Satisfiable") || throwableMsg.contains("Precondition Failed");
    }

    public static boolean isResponseCode412Error(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Precondition Failed");
    }

    public static boolean isResponseCode416Error(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Requested Range Not Satisfiable");
    }

    public static boolean isResponseCode304Error(Throwable th) {
        return DownloadComponentManager.getTTNetHandler().isResponseCode304Error(th);
    }

    public static boolean isHttpDataDirtyError(BaseException baseException) {
        return baseException != null && baseException.getErrorCode() == 1051;
    }

    public static boolean isResponseCodeError(BaseException baseException) {
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHttpsError(BaseException baseException) {
        if (baseException == null) {
            return false;
        }
        return baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException));
    }

    public static void parseException(Throwable th, String str) throws BaseException {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            str2 = str;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            baseException.setErrorMsg(str2 + "-" + baseException.getErrorMessage());
            throw baseException;
        } else if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, getErrorMsgWithTagPrefix(th, str2));
        } else {
            if (isTimeOutException(th)) {
                throw new BaseException((int) DownloadErrorCode.ERROR_TIME_OUT, getErrorMsgWithTagPrefix(th, str2));
            }
            if (isResponseCode412Error(th)) {
                throw new DownloadHttpException(1004, 412, getErrorMsgWithTagPrefix(th, str2));
            }
            if (isResponseCode416Error(th)) {
                throw new DownloadHttpException(1004, 416, getErrorMsgWithTagPrefix(th, str2));
            }
            if (isForbiddenException(th)) {
                throw new BaseException((int) DownloadErrorCode.ERROR_DOWNLOAD_FORBIDDEN, getErrorMsgWithTagPrefix(th, str2));
            }
            if (isNetNotAvailableException(th)) {
                throw new BaseException((int) DownloadErrorCode.ERROR_NETWORK_NOT_AVAILABLE, getErrorMsgWithTagPrefix(th, str2));
            }
            if (isConnectionException(th)) {
                throw new BaseException((int) DownloadErrorCode.ERROR_NETWORK_CONNECTION_IO, getErrorMsgWithTagPrefix(th, str2));
            }
            if (th instanceof IOException) {
                parseTTNetException(th, str);
                parseIOException((IOException) th, str);
                return;
            }
            throw new BaseException(1000, getErrorMsgWithTagPrefix(th, str2));
        }
    }

    private static void parseTTNetException(Throwable th, String str) throws DownloadTTNetException {
        DownloadTTNetException translateTTNetException = DownloadComponentManager.getTTNetHandler().translateTTNetException(th, null);
        if (translateTTNetException == null) {
            translateTTNetException = DownloadComponentManager.getTTNetHandler().translateTTNetException(th.getCause(), null);
        }
        if (translateTTNetException != null) {
            throw new DownloadTTNetException(translateTTNetException.getErrorCode(), getErrorMsgWithTagPrefix(translateTTNetException, str)).setRequestLog(translateTTNetException.getRequestLog());
        }
    }

    public static void parseIOException(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String errorMsgWithTagPrefix = getErrorMsgWithTagPrefix(iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_NETWORK_CONNECTION_IO, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnknownHostException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_UNKNOWN_HOST, errorMsgWithTagPrefix);
        }
        if (iOException instanceof NoRouteToHostException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_NO_ROUTE_TO_HOST, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnknownServiceException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_UNKNOWN_SERVICE, errorMsgWithTagPrefix);
        }
        if (iOException instanceof PortUnreachableException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_PORT_UNREACHABLE, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SocketTimeoutException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_TIME_OUT, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SocketException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_SOCKET, errorMsgWithTagPrefix);
        }
        if (iOException instanceof HttpRetryException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_HTTP_RETRY, errorMsgWithTagPrefix);
        }
        if (iOException instanceof ProtocolException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_PROTOCOL, errorMsgWithTagPrefix);
        }
        if (iOException instanceof MalformedURLException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_MALFORMED_URL, errorMsgWithTagPrefix);
        }
        if (iOException instanceof FileNotFoundException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_FILE_NOT_FOUND, errorMsgWithTagPrefix);
        }
        if (iOException instanceof InterruptedIOException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_INTERRUPTED_IO, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_UNSUPPORTED_ENCODING, errorMsgWithTagPrefix);
        }
        if (iOException instanceof EOFException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_EOF, errorMsgWithTagPrefix);
        }
        if (iOException instanceof StreamResetException) {
            throw new BaseException((int) DownloadErrorCode.ERROR_STREAM_RESET, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SSLException) {
            throw new BaseException(1011, errorMsgWithTagPrefix);
        }
        if (isInsufficientSpaceError(iOException)) {
            throw new BaseException(1006, errorMsgWithTagPrefix);
        }
        throw new BaseException((int) DownloadErrorCode.ERROR_IO, errorMsgWithTagPrefix);
    }

    public static boolean isInsufficientSpaceError(Throwable th) {
        if (th == null) {
            return false;
        }
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            int errorCode = baseException.getErrorCode();
            if (errorCode == 1006) {
                return true;
            }
            if (errorCode == 1023 || errorCode == 1039 || errorCode == 1040 || errorCode == 1054 || errorCode == 1064) {
                String message = baseException.getMessage();
                return !TextUtils.isEmpty(message) && message.contains("ENOSPC");
            }
        } else if (th instanceof IOException) {
            String throwableMsg = getThrowableMsg(th);
            return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("ENOSPC");
        }
        return false;
    }

    public static boolean isNetworkError(Throwable th) {
        if (th instanceof BaseException) {
            int errorCode = ((BaseException) th).getErrorCode();
            return errorCode == 1055 || errorCode == 1023 || errorCode == 1041 || errorCode == 1022 || errorCode == 1048 || errorCode == 1056 || errorCode == 1057 || errorCode == 1058 || errorCode == 1059 || errorCode == 1060 || errorCode == 1061 || errorCode == 1067 || errorCode == 1049 || errorCode == 1047 || errorCode == 1051 || errorCode == 1004 || errorCode == 1011 || errorCode == 1002 || errorCode == 1013;
        }
        return false;
    }

    public static boolean canChunkDowngradeRetry(BaseException baseException, DownloadInfo downloadInfo) {
        if (baseException == null) {
            return false;
        }
        int errorCode = baseException.getErrorCode();
        if (errorCode == 1000 || errorCode == 1032 || errorCode == 1033 || errorCode == 1034 || errorCode == 1008 || errorCode == 1026 || errorCode == 1027 || errorCode == 1044 || errorCode == 1020) {
            return true;
        }
        return (errorCode == 1049 || errorCode == 1055 || errorCode == 1006 || downloadInfo == null || downloadInfo.getCurBytes() >= 8388608) ? false : true;
    }

    public static String getErrorMsgWithTagPrefix(Throwable th, String str) {
        if (str == null) {
            return getThrowableMsg(th);
        }
        return str + "-" + getThrowableMsg(th);
    }

    public static String getThrowableMsg(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            return th.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "throwable getMsg error";
        }
    }

    public static ListenerType convertListenerType(int i) {
        ListenerType listenerType = ListenerType.MAIN;
        if (i == ListenerType.SUB.ordinal()) {
            return ListenerType.SUB;
        }
        if (i == ListenerType.NOTIFICATION.ordinal()) {
            return ListenerType.NOTIFICATION;
        }
        return listenerType;
    }

    public static <K> HashMap<Integer, K> sparseArrayToHashMap(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i));
        }
        return hashMap;
    }

    public static <K> void sparseArrayPutAll(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (map == null || sparseArray == null) {
            return;
        }
        for (Integer num : map.keySet()) {
            if (num != null) {
                sparseArray.put(num.intValue(), map.get(num));
            }
        }
    }

    public static long getFirstOffset(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return -1L;
        }
        List<DownloadChunk> downloadChunk = DownloadComponentManager.getDownloadCache().getDownloadChunk(downloadInfo.getId());
        if (downloadInfo.getChunkCount() == 1) {
            return downloadInfo.getCurBytes();
        }
        if (downloadChunk == null || downloadChunk.size() <= 1) {
            return 0L;
        }
        long firstChunkCurOffset = getFirstChunkCurOffset(downloadChunk);
        if (firstChunkCurOffset >= 0) {
            return firstChunkCurOffset;
        }
        return 0L;
    }

    private static long getFirstChunkCurOffset(List<DownloadChunk> list) {
        if (list == null || list.isEmpty()) {
            return -1L;
        }
        long j = -1;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null && (downloadChunk.getCurrentOffset() <= downloadChunk.getEndOffset() || downloadChunk.getEndOffset() == 0)) {
                if (j == -1 || j > downloadChunk.getCurrentOffset()) {
                    j = downloadChunk.getCurrentOffset();
                }
            }
        }
        return j;
    }

    public static long getCurByte(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0L;
        }
        List<DownloadChunk> downloadChunk = DownloadComponentManager.getDownloadCache().getDownloadChunk(downloadInfo.getId());
        int chunkCount = downloadInfo.getChunkCount();
        boolean z = chunkCount > 1;
        if (!downloadInfo.isBreakpointAvailable()) {
            return 0L;
        }
        if (z) {
            if (downloadChunk == null || chunkCount != downloadChunk.size()) {
                return 0L;
            }
            return getTotalOffset(downloadChunk);
        }
        return downloadInfo.getCurBytes();
    }

    public static boolean isHeaderEqual(List<HttpHeader> list, List<HttpHeader> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public static void safeClose(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static void safeClose(Cursor... cursorArr) {
        if (cursorArr == null) {
            return;
        }
        for (Cursor cursor : cursorArr) {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static String getFixLengthString(String str, int i) {
        if (i == 0) {
            return "";
        }
        if (TextUtils.isEmpty(str) || str.length() <= i) {
            return str;
        }
        return str.substring(0, i);
    }

    public static String getRedirectSavePath(String str, DownloadSetting downloadSetting) {
        JSONObject optJSONObject;
        if (downloadSetting != null && (optJSONObject = downloadSetting.optJSONObject(DownloadSettingKeys.KEY_ANTI_HIJACK_DIR)) != null) {
            String optString = optJSONObject.optString(DownloadSettingKeys.AntiHijackDir.KEY_ANTI_HIJACK_DIR_NAME);
            if (!TextUtils.isEmpty(optString) && optString.startsWith("/")) {
                optString = optString.substring(1);
            }
            if (TextUtils.isEmpty(optString)) {
                return optString;
            }
            if (!optString.contains("%s")) {
                optString = optString + str;
            } else {
                try {
                    optString = String.format(optString, str);
                } catch (Throwable th) {
                }
            }
            return optString.length() > 255 ? optString.substring(optString.length() - 255) : optString;
        }
        return "";
    }

    public static String getDownloadPath() {
        return getValidDownloadPath(Downloader.getInstance(DownloadComponentManager.getAppContext()).getGlobalSaveDir(), true);
    }

    public static String getDownloadTempPath() {
        return getValidDownloadPath(Downloader.getInstance(DownloadComponentManager.getAppContext()).getGlobalSaveTempDir(), false);
    }

    private static String getValidDownloadPath(File file, boolean z) {
        Context appContext = DownloadComponentManager.getAppContext();
        if (isValidDirectory(file)) {
            return file.getAbsolutePath();
        }
        int i = appContext.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT >= 29 && ((i == 29 && !Environment.isExternalStorageLegacy()) || i > 29)) {
            File externalFilesDir = appContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (isValidDirectory(externalFilesDir)) {
                return externalFilesDir.getAbsolutePath();
            }
        } else {
            if (z) {
                File externalDownloadPath = getExternalDownloadPath();
                if (isValidDirectory(externalDownloadPath)) {
                    return externalDownloadPath.getAbsolutePath();
                }
            }
            File externalFilesDir2 = appContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
            if (isValidDirectory(externalFilesDir2)) {
                return externalFilesDir2.getAbsolutePath();
            }
        }
        return appContext.getFilesDir().getAbsolutePath();
    }

    public static boolean isSavePathSecurity(String str) {
        Context appContext;
        if (DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.SAVE_PATH_SECURITY) <= 0 || (appContext = DownloadComponentManager.getAppContext()) == null || TextUtils.isEmpty(str) || str.startsWith("/data")) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Android/data/");
        sb.append(appContext.getPackageName());
        return str.contains(sb.toString());
    }

    public static boolean isValidDirectory(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
            if (!file.isDirectory()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static File getExternalDownloadPath() {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception e) {
            str = "";
        }
        if ("mounted".equals(str)) {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        }
        return null;
    }

    public static void addThrottleNetSpeed(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new HttpHeader(DownloadConstants.EXTRA_THROTTLE_NET_SPEED, String.valueOf(throttleNetSpeed)));
        }
    }

    public static void addTTNetProtectTimeout(List<HttpHeader> list, DownloadInfo downloadInfo) {
        long ttnetProtectTimeout = downloadInfo.getTtnetProtectTimeout();
        if (ttnetProtectTimeout > 300) {
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_PROTECT_TIMEOUT, String.valueOf(ttnetProtectTimeout)));
        }
    }

    public static long cost(long j) {
        return System.currentTimeMillis() - j;
    }

    public static String getRespHeadFieldIgnoreCase(IDownloadHeadHttpConnection iDownloadHeadHttpConnection, String str) {
        if (iDownloadHeadHttpConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String responseHeaderField = iDownloadHeadHttpConnection.getResponseHeaderField(str);
        if (!DownloadSetting.obtainGlobal().optBugFix(DownloadSettingKeys.BugFix.BUGFIX_FIX_GET_HTTP_RESP_HEAD_IGNORE_CASE, true)) {
            return responseHeaderField;
        }
        if (TextUtils.isEmpty(responseHeaderField)) {
            responseHeaderField = iDownloadHeadHttpConnection.getResponseHeaderField(str.toLowerCase());
        }
        if (TextUtils.isEmpty(responseHeaderField)) {
            return iDownloadHeadHttpConnection.getResponseHeaderField(str.toUpperCase());
        }
        return responseHeaderField;
    }

    public static int getInt(Object obj, int i) {
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            return i;
        }
    }

    public static String getString(Object obj, String str) {
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            return str;
        }
    }

    public static boolean getBoolean(Object obj, boolean z) {
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            return z;
        }
    }

    public static boolean isWaitWifiAndInNet(BaseException baseException, DownloadInfo downloadInfo) {
        return downloadInfo != null && downloadInfo.isOnlyWifi() && isNetworkConnected(DownloadComponentManager.getAppContext());
    }

    public static boolean isNoWifiAndInNet() {
        Context appContext = DownloadComponentManager.getAppContext();
        return (appContext == null || isWifi(appContext) || !isNetworkConnected(appContext)) ? false : true;
    }

    public static long parserMaxAge(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        Matcher matcher = Pattern.compile("max-age=([0-9]+)").matcher(str);
        if (matcher.find()) {
            try {
                return Long.parseLong(matcher.group(1));
            } catch (Throwable th) {
                th.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static String generateDistinctDirectory(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String md5Hex = md5Hex(str2);
            if (!TextUtils.isEmpty(md5Hex) && !str.contains(md5Hex)) {
                return new File(str, md5Hex).getAbsolutePath();
            }
        }
        return str;
    }

    public static boolean hasDownloadCacheHeader(List<HttpHeader> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (HttpHeader httpHeader : list) {
            if (httpHeader != null && !TextUtils.isEmpty(httpHeader.getName()) && !TextUtils.isEmpty(httpHeader.getValue()) && HEADER_TAG_DOWNLOAD_CACHE.equals(httpHeader.getName()) && HEADER_TAG_DOWNLOAD_CACHE.equals(httpHeader.getValue())) {
                return true;
            }
        }
        return false;
    }
}
