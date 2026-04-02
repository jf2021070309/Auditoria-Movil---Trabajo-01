package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.ndk.SessionFiles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public class CrashpadController {
    private static final String APP_METADATA_FILE = "app.json";
    private static final String DEVICE_METADATA_FILE = "device.json";
    private static final String OS_METADATA_FILE = "os.json";
    private static final String SESSION_METADATA_FILE = "session.json";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Context context;
    private final CrashFilesManager filesManager;
    private final NativeApi nativeApi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CrashpadController(Context context, NativeApi nativeApi, CrashFilesManager crashFilesManager) {
        this.context = context;
        this.nativeApi = nativeApi;
        this.filesManager = crashFilesManager;
    }

    public boolean initialize(String str, String str2, long j, StaticSessionData staticSessionData) {
        this.filesManager.cleanOldSessionFileDirectories();
        File sessionFileDirectory = this.filesManager.getSessionFileDirectory(str);
        if (sessionFileDirectory != null) {
            try {
                if (this.nativeApi.initialize(sessionFileDirectory.getCanonicalPath(), this.context.getAssets())) {
                    writeBeginSession(str, str2, j);
                    writeSessionApp(str, staticSessionData.appData());
                    writeSessionOs(str, staticSessionData.osData());
                    writeSessionDevice(str, staticSessionData.deviceData());
                    return true;
                }
                return false;
            } catch (IOException e) {
                Logger.getLogger().e("Error initializing Crashlytics NDK", e);
                return false;
            }
        }
        return false;
    }

    public boolean hasCrashDataForSession(String str) {
        File file;
        return this.filesManager.hasSessionFileDirectory(str) && (file = getFilesForSession(str).minidump) != null && file.exists();
    }

    public boolean finalizeSession(String str) {
        this.filesManager.deleteSessionFileDirectory(str);
        this.filesManager.cleanOldSessionFileDirectories();
        return true;
    }

    public SessionFiles getFilesForSession(String str) {
        File sessionFileDirectory = this.filesManager.getSessionFileDirectory(str);
        File file = new File(sessionFileDirectory, "pending");
        Logger logger = Logger.getLogger();
        logger.v("Minidump directory: " + file.getAbsolutePath());
        File singleFileWithExtension = getSingleFileWithExtension(file, ".dmp");
        Logger logger2 = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Minidump file ");
        sb.append((singleFileWithExtension == null || !singleFileWithExtension.exists()) ? "does not exist" : "exists");
        logger2.v(sb.toString());
        SessionFiles.Builder builder = new SessionFiles.Builder();
        if (sessionFileDirectory != null && sessionFileDirectory.exists() && file.exists()) {
            builder.minidumpFile(getSingleFileWithExtension(file, ".dmp")).metadataFile(getSingleFileWithExtension(sessionFileDirectory, ".device_info")).sessionFile(new File(sessionFileDirectory, SESSION_METADATA_FILE)).appFile(new File(sessionFileDirectory, APP_METADATA_FILE)).deviceFile(new File(sessionFileDirectory, DEVICE_METADATA_FILE)).osFile(new File(sessionFileDirectory, OS_METADATA_FILE));
        }
        return builder.build();
    }

    public void writeBeginSession(String str, String str2, long j) {
        writeSessionJsonFile(this.filesManager, str, SessionMetadataJsonSerializer.serializeBeginSession(str, str2, j), SESSION_METADATA_FILE);
    }

    public void writeSessionApp(String str, StaticSessionData.AppData appData) {
        writeSessionJsonFile(this.filesManager, str, SessionMetadataJsonSerializer.serializeSessionApp(appData.appIdentifier(), appData.versionCode(), appData.versionName(), appData.installUuid(), appData.deliveryMechanism(), !TextUtils.isEmpty(appData.unityVersion()) ? appData.unityVersion() : ""), APP_METADATA_FILE);
    }

    public void writeSessionOs(String str, StaticSessionData.OsData osData) {
        writeSessionJsonFile(this.filesManager, str, SessionMetadataJsonSerializer.serializeSessionOs(osData.osRelease(), osData.osCodeName(), osData.isRooted()), OS_METADATA_FILE);
    }

    public void writeSessionDevice(String str, StaticSessionData.DeviceData deviceData) {
        writeSessionJsonFile(this.filesManager, str, SessionMetadataJsonSerializer.serializeSessionDevice(deviceData.arch(), deviceData.model(), deviceData.availableProcessors(), deviceData.totalRam(), deviceData.diskSpace(), deviceData.isEmulator(), deviceData.state(), deviceData.manufacturer(), deviceData.modelClass()), DEVICE_METADATA_FILE);
    }

    private static void writeSessionJsonFile(CrashFilesManager crashFilesManager, String str, String str2, String str3) {
        writeTextFile(new File(crashFilesManager.getSessionFileDirectory(str), str3), str2);
    }

    private static void writeTextFile(File file, String str) {
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close " + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.closeOrLog(bufferedWriter2, "Failed to close " + file);
            throw th;
        }
    }

    private static File getSingleFileWithExtension(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }
}
