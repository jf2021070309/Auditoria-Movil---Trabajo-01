package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler;
import com.google.firebase.crashlytics.internal.log.LogFileManager;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CrashlyticsController {
    static final FilenameFilter APP_EXCEPTION_MARKER_FILTER = new FilenameFilter() { // from class: com.google.firebase.crashlytics.internal.common.-$$Lambda$CrashlyticsController$S4ND4vdF1CBimHR5Yfiv04HIz8k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean startsWith;
            startsWith = str.startsWith(CrashlyticsController.APP_EXCEPTION_MARKER_PREFIX);
            return startsWith;
        }
    };
    static final String APP_EXCEPTION_MARKER_PREFIX = ".ae";
    static final String FIREBASE_APPLICATION_EXCEPTION = "_ae";
    static final String FIREBASE_CRASH_TYPE = "fatal";
    static final int FIREBASE_CRASH_TYPE_FATAL = 1;
    static final String FIREBASE_TIMESTAMP = "timestamp";
    private static final String GENERATOR_FORMAT = "Crashlytics Android SDK/%s";
    static final String NATIVE_SESSION_DIR = "native-sessions";
    private final AnalyticsEventLogger analyticsEventLogger;
    private final AppData appData;
    private final CrashlyticsBackgroundWorker backgroundWorker;
    private final Context context;
    private CrashlyticsUncaughtExceptionHandler crashHandler;
    private final CrashlyticsFileMarker crashMarker;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FileStore fileStore;
    private final IdManager idManager;
    private final LogFileManager.DirectoryProvider logFileDirectoryProvider;
    private final LogFileManager logFileManager;
    private final CrashlyticsNativeComponent nativeComponent;
    private final SessionReportingCoordinator reportingCoordinator;
    private final String unityVersion;
    private final UserMetadata userMetadata;
    final TaskCompletionSource<Boolean> unsentReportsAvailable = new TaskCompletionSource<>();
    final TaskCompletionSource<Boolean> reportActionProvided = new TaskCompletionSource<>();
    final TaskCompletionSource<Void> unsentReportsHandled = new TaskCompletionSource<>();
    final AtomicBoolean checkForUnsentReportsCalled = new AtomicBoolean(false);

    private static File[] ensureFileArrayNotNull(File[] fileArr) {
        return fileArr == null ? new File[0] : fileArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CrashlyticsController(Context context, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, IdManager idManager, DataCollectionArbiter dataCollectionArbiter, FileStore fileStore, CrashlyticsFileMarker crashlyticsFileMarker, AppData appData, UserMetadata userMetadata, LogFileManager logFileManager, LogFileManager.DirectoryProvider directoryProvider, SessionReportingCoordinator sessionReportingCoordinator, CrashlyticsNativeComponent crashlyticsNativeComponent, AnalyticsEventLogger analyticsEventLogger) {
        this.context = context;
        this.backgroundWorker = crashlyticsBackgroundWorker;
        this.idManager = idManager;
        this.dataCollectionArbiter = dataCollectionArbiter;
        this.fileStore = fileStore;
        this.crashMarker = crashlyticsFileMarker;
        this.appData = appData;
        this.userMetadata = userMetadata;
        this.logFileManager = logFileManager;
        this.logFileDirectoryProvider = directoryProvider;
        this.nativeComponent = crashlyticsNativeComponent;
        this.unityVersion = appData.unityVersionProvider.getUnityVersion();
        this.analyticsEventLogger = analyticsEventLogger;
        this.reportingCoordinator = sessionReportingCoordinator;
    }

    private Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enableExceptionHandling(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, SettingsDataProvider settingsDataProvider) {
        openSession();
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = new CrashlyticsUncaughtExceptionHandler(new CrashlyticsUncaughtExceptionHandler.CrashListener() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.1
            @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsUncaughtExceptionHandler.CrashListener
            public void onUncaughtException(SettingsDataProvider settingsDataProvider2, Thread thread, Throwable th) {
                CrashlyticsController.this.handleUncaughtException(settingsDataProvider2, thread, th);
            }
        }, settingsDataProvider, uncaughtExceptionHandler, this.nativeComponent);
        this.crashHandler = crashlyticsUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(crashlyticsUncaughtExceptionHandler);
    }

    synchronized void handleUncaughtException(final SettingsDataProvider settingsDataProvider, final Thread thread, final Throwable th) {
        Logger logger = Logger.getLogger();
        logger.d("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            Utils.awaitEvenIfOnMainThread(this.backgroundWorker.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Task<Void> call() throws Exception {
                    long timestampSeconds = CrashlyticsController.getTimestampSeconds(currentTimeMillis);
                    String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                    if (currentSessionId != null) {
                        CrashlyticsController.this.crashMarker.create();
                        CrashlyticsController.this.reportingCoordinator.persistFatalEvent(th, thread, currentSessionId, timestampSeconds);
                        CrashlyticsController.this.doWriteAppExceptionMarker(currentTimeMillis);
                        CrashlyticsController.this.doCloseSessions(settingsDataProvider);
                        CrashlyticsController.this.doOpenSession();
                        if (CrashlyticsController.this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                            final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                            return settingsDataProvider.getAppSettings().onSuccessTask(executor, new SuccessContinuation<AppSettingsData, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.2.1
                                @Override // com.google.android.gms.tasks.SuccessContinuation
                                public Task<Void> then(AppSettingsData appSettingsData) throws Exception {
                                    if (appSettingsData == null) {
                                        Logger.getLogger().w("Received null app settings, cannot send reports at crash time.");
                                        return Tasks.forResult(null);
                                    }
                                    return Tasks.whenAll(CrashlyticsController.this.logAnalyticsAppExceptionEvents(), CrashlyticsController.this.reportingCoordinator.sendReports(executor));
                                }
                            });
                        }
                        return Tasks.forResult(null);
                    }
                    Logger.getLogger().e("Tried to write a fatal exception while no session was open.");
                    return Tasks.forResult(null);
                }
            }));
        } catch (Exception e) {
            Logger.getLogger().e("Error handling uncaught exception", e);
        }
    }

    private Task<Boolean> waitForReportAction() {
        if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
            Logger.getLogger().d("Automatic data collection is enabled. Allowing upload.");
            this.unsentReportsAvailable.trySetResult(false);
            return Tasks.forResult(true);
        }
        Logger.getLogger().d("Automatic data collection is disabled.");
        Logger.getLogger().v("Notifying that unsent reports are available.");
        this.unsentReportsAvailable.trySetResult(true);
        Task<TContinuationResult> onSuccessTask = this.dataCollectionArbiter.waitForAutomaticDataCollectionEnabled().onSuccessTask(new SuccessContinuation<Void, Boolean>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.3
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task<Boolean> then(Void r1) throws Exception {
                return Tasks.forResult(true);
            }
        });
        Logger.getLogger().d("Waiting for send/deleteUnsentReports to be called.");
        return Utils.race(onSuccessTask, this.reportActionProvided.getTask());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean didCrashOnPreviousExecution() {
        if (!this.crashMarker.isPresent()) {
            String currentSessionId = getCurrentSessionId();
            return currentSessionId != null && this.nativeComponent.hasCrashDataForSession(currentSessionId);
        }
        Logger.getLogger().v("Found previous crash marker.");
        this.crashMarker.remove();
        return Boolean.TRUE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Boolean> checkForUnsentReports() {
        if (!this.checkForUnsentReportsCalled.compareAndSet(false, true)) {
            Logger.getLogger().w("checkForUnsentReports should only be called once per execution.");
            return Tasks.forResult(false);
        }
        return this.unsentReportsAvailable.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> sendUnsentReports() {
        this.reportActionProvided.trySetResult(true);
        return this.unsentReportsHandled.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> deleteUnsentReports() {
        this.reportActionProvided.trySetResult(false);
        return this.unsentReportsHandled.getTask();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<Void> submitAllReports(Task<AppSettingsData> task) {
        if (!this.reportingCoordinator.hasReportsToSend()) {
            Logger.getLogger().v("No crash reports are available to be sent.");
            this.unsentReportsAvailable.trySetResult(false);
            return Tasks.forResult(null);
        }
        Logger.getLogger().v("Crash reports are available to be sent.");
        return waitForReportAction().onSuccessTask(new AnonymousClass4(task));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.common.CrashlyticsController$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements SuccessContinuation<Boolean, Void> {
        final /* synthetic */ Task val$appSettingsDataTask;

        AnonymousClass4(Task task) {
            this.val$appSettingsDataTask = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public Task<Void> then(final Boolean bool) throws Exception {
            return CrashlyticsController.this.backgroundWorker.submitTask(new Callable<Task<Void>>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Task<Void> call() throws Exception {
                    if (!bool.booleanValue()) {
                        Logger.getLogger().v("Deleting cached crash reports...");
                        CrashlyticsController.deleteFiles(CrashlyticsController.this.listAppExceptionMarkerFiles());
                        CrashlyticsController.this.reportingCoordinator.removeAllReports();
                        CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                        return Tasks.forResult(null);
                    }
                    Logger.getLogger().d("Sending cached crash reports...");
                    CrashlyticsController.this.dataCollectionArbiter.grantDataCollectionPermission(bool.booleanValue());
                    final Executor executor = CrashlyticsController.this.backgroundWorker.getExecutor();
                    return AnonymousClass4.this.val$appSettingsDataTask.onSuccessTask(executor, new SuccessContinuation<AppSettingsData, Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.4.1.1
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public Task<Void> then(AppSettingsData appSettingsData) throws Exception {
                            if (appSettingsData != null) {
                                CrashlyticsController.this.logAnalyticsAppExceptionEvents();
                                CrashlyticsController.this.reportingCoordinator.sendReports(executor);
                                CrashlyticsController.this.unsentReportsHandled.trySetResult(null);
                                return Tasks.forResult(null);
                            }
                            Logger.getLogger().w("Received null app settings at app startup. Cannot send cached reports");
                            return Tasks.forResult(null);
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeToLog(final long j, final String str) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.5
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                if (CrashlyticsController.this.isHandlingException()) {
                    return null;
                }
                CrashlyticsController.this.logFileManager.writeToLog(j, str);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void writeNonFatalException(final Thread thread, final Throwable th) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.backgroundWorker.submit(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.6
            @Override // java.lang.Runnable
            public void run() {
                if (CrashlyticsController.this.isHandlingException()) {
                    return;
                }
                long timestampSeconds = CrashlyticsController.getTimestampSeconds(currentTimeMillis);
                String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                if (currentSessionId != null) {
                    CrashlyticsController.this.reportingCoordinator.persistNonFatalEvent(th, thread, currentSessionId, timestampSeconds);
                } else {
                    Logger.getLogger().w("Tried to write a non-fatal exception while no session was open.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUserId(String str) {
        this.userMetadata.setUserId(str);
        cacheUserData(this.userMetadata);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomKey(String str, String str2) {
        try {
            this.userMetadata.setCustomKey(str, str2);
            cacheKeyData(this.userMetadata.getCustomKeys(), false);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCustomKeys(Map<String, String> map) {
        this.userMetadata.setCustomKeys(map);
        cacheKeyData(this.userMetadata.getCustomKeys(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setInternalKey(String str, String str2) {
        try {
            this.userMetadata.setInternalKey(str, str2);
            cacheKeyData(this.userMetadata.getInternalKeys(), true);
        } catch (IllegalArgumentException e) {
            Context context = this.context;
            if (context != null && CommonUtils.isAppDebuggable(context)) {
                throw e;
            }
            Logger.getLogger().e("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    private void cacheUserData(final UserMetadata userMetadata) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.7
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                String currentSessionId = CrashlyticsController.this.getCurrentSessionId();
                if (currentSessionId != null) {
                    CrashlyticsController.this.reportingCoordinator.persistUserId(currentSessionId);
                    new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeUserData(currentSessionId, userMetadata);
                    return null;
                }
                Logger.getLogger().d("Tried to cache user data while no session was open.");
                return null;
            }
        });
    }

    private void cacheKeyData(final Map<String, String> map, final boolean z) {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.8
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                new MetaDataStore(CrashlyticsController.this.getFilesDir()).writeKeyData(CrashlyticsController.this.getCurrentSessionId(), map, z);
                return null;
            }
        });
    }

    void openSession() {
        this.backgroundWorker.submit(new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.9
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                CrashlyticsController.this.doOpenSession();
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentSessionId() {
        List<String> listSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (listSortedOpenSessionIds.isEmpty()) {
            return null;
        }
        return listSortedOpenSessionIds.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean finalizeSessions(SettingsDataProvider settingsDataProvider) {
        this.backgroundWorker.checkRunningOnThread();
        if (isHandlingException()) {
            Logger.getLogger().w("Skipping session finalization because a crash has already occurred.");
            return Boolean.FALSE.booleanValue();
        }
        Logger.getLogger().v("Finalizing previously open sessions.");
        try {
            doCloseSessions(true, settingsDataProvider);
            Logger.getLogger().v("Closed all previously open sessions.");
            return true;
        } catch (Exception e) {
            Logger.getLogger().e("Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doOpenSession() {
        long currentTimestampSeconds = getCurrentTimestampSeconds();
        String clsuuid = new CLSUUID(this.idManager).toString();
        Logger logger = Logger.getLogger();
        logger.d("Opening a new session with ID " + clsuuid);
        this.nativeComponent.prepareNativeSession(clsuuid, String.format(Locale.US, GENERATOR_FORMAT, CrashlyticsCore.getVersion()), currentTimestampSeconds, StaticSessionData.create(createAppData(this.idManager, this.appData, this.unityVersion), createOsData(getContext()), createDeviceData(getContext())));
        this.logFileManager.setCurrentSession(clsuuid);
        this.reportingCoordinator.onBeginSession(clsuuid, currentTimestampSeconds);
    }

    void doCloseSessions(SettingsDataProvider settingsDataProvider) {
        doCloseSessions(false, settingsDataProvider);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void doCloseSessions(boolean z, SettingsDataProvider settingsDataProvider) {
        List<String> listSortedOpenSessionIds = this.reportingCoordinator.listSortedOpenSessionIds();
        if (listSortedOpenSessionIds.size() <= z) {
            Logger.getLogger().v("No open sessions to be closed.");
            return;
        }
        String str = listSortedOpenSessionIds.get(z ? 1 : 0);
        if (settingsDataProvider.getSettings().getFeaturesData().collectAnrs) {
            writeApplicationExitInfoEventIfRelevant(str);
        } else {
            Logger.getLogger().v("ANR feature disabled.");
        }
        if (this.nativeComponent.hasCrashDataForSession(str)) {
            finalizePreviousNativeSession(str);
            this.nativeComponent.finalizeSession(str);
        }
        this.reportingCoordinator.finalizeSessions(getCurrentTimestampSeconds(), z != 0 ? listSortedOpenSessionIds.get(0) : null);
    }

    File[] listNativeSessionFileDirectories() {
        return ensureFileArrayNotNull(getNativeSessionFilesDir().listFiles());
    }

    File[] listAppExceptionMarkerFiles() {
        return listFilesMatching(APP_EXCEPTION_MARKER_FILTER);
    }

    private File[] listFilesMatching(FilenameFilter filenameFilter) {
        return listFilesMatching(getFilesDir(), filenameFilter);
    }

    private static File[] listFilesMatching(File file, FilenameFilter filenameFilter) {
        return ensureFileArrayNotNull(file.listFiles(filenameFilter));
    }

    private void finalizePreviousNativeSession(String str) {
        Logger logger = Logger.getLogger();
        logger.v("Finalizing native report for session " + str);
        NativeSessionFileProvider sessionFileProvider = this.nativeComponent.getSessionFileProvider(str);
        File minidumpFile = sessionFileProvider.getMinidumpFile();
        if (minidumpFile == null || !minidumpFile.exists()) {
            Logger logger2 = Logger.getLogger();
            logger2.w("No minidump data found for session " + str);
            return;
        }
        long lastModified = minidumpFile.lastModified();
        LogFileManager logFileManager = new LogFileManager(this.context, this.logFileDirectoryProvider, str);
        File file = new File(getNativeSessionFilesDir(), str);
        if (!file.mkdirs()) {
            Logger.getLogger().w("Couldn't create directory to store native session files, aborting.");
            return;
        }
        doWriteAppExceptionMarker(lastModified);
        List<NativeSessionFile> nativeSessionFiles = getNativeSessionFiles(sessionFileProvider, str, getFilesDir(), logFileManager.getBytesForLog());
        NativeSessionFileGzipper.processNativeSessions(file, nativeSessionFiles);
        this.reportingCoordinator.finalizeSessionWithNativeEvent(str, nativeSessionFiles);
        logFileManager.clearLog();
    }

    private static long getCurrentTimestampSeconds() {
        return getTimestampSeconds(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getTimestampSeconds(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWriteAppExceptionMarker(long j) {
        try {
            File filesDir = getFilesDir();
            new File(filesDir, APP_EXCEPTION_MARKER_PREFIX + j).createNewFile();
        } catch (IOException e) {
            Logger.getLogger().w("Could not create app exception marker file.", e);
        }
    }

    private static StaticSessionData.AppData createAppData(IdManager idManager, AppData appData, String str) {
        return StaticSessionData.AppData.create(idManager.getAppIdentifier(), appData.versionCode, appData.versionName, idManager.getCrashlyticsInstallId(), DeliveryMechanism.determineFrom(appData.installerPackageName).getId(), str);
    }

    private static StaticSessionData.OsData createOsData(Context context) {
        return StaticSessionData.OsData.create(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.isRooted(context));
    }

    private static StaticSessionData.DeviceData createDeviceData(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return StaticSessionData.DeviceData.create(CommonUtils.getCpuArchitectureInt(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.getTotalRamInBytes(), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.isEmulator(context), CommonUtils.getDeviceState(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    UserMetadata getUserMetadata() {
        return this.userMetadata;
    }

    boolean isHandlingException() {
        CrashlyticsUncaughtExceptionHandler crashlyticsUncaughtExceptionHandler = this.crashHandler;
        return crashlyticsUncaughtExceptionHandler != null && crashlyticsUncaughtExceptionHandler.isHandlingException();
    }

    File getFilesDir() {
        return this.fileStore.getFilesDir();
    }

    File getNativeSessionFilesDir() {
        return new File(getFilesDir(), NATIVE_SESSION_DIR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> logAnalyticsAppExceptionEvents() {
        File[] listAppExceptionMarkerFiles;
        ArrayList arrayList = new ArrayList();
        for (File file : listAppExceptionMarkerFiles()) {
            try {
                arrayList.add(logAnalyticsAppExceptionEvent(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                Logger.getLogger().w("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    private Task<Void> logAnalyticsAppExceptionEvent(final long j) {
        if (firebaseCrashExists()) {
            Logger.getLogger().w("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return Tasks.forResult(null);
        }
        Logger.getLogger().d("Logging app exception event to Firebase Analytics");
        return Tasks.call(new ScheduledThreadPoolExecutor(1), new Callable<Void>() { // from class: com.google.firebase.crashlytics.internal.common.CrashlyticsController.10
            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Bundle bundle = new Bundle();
                bundle.putInt(CrashlyticsController.FIREBASE_CRASH_TYPE, 1);
                bundle.putLong("timestamp", j);
                CrashlyticsController.this.analyticsEventLogger.logEvent(CrashlyticsController.FIREBASE_APPLICATION_EXCEPTION, bundle);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(File[] fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    private static boolean firebaseCrashExists() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    static List<NativeSessionFile> getNativeSessionFiles(NativeSessionFileProvider nativeSessionFileProvider, String str, File file, byte[] bArr) {
        MetaDataStore metaDataStore = new MetaDataStore(file);
        File userDataFileForSession = metaDataStore.getUserDataFileForSession(str);
        File keysFileForSession = metaDataStore.getKeysFileForSession(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BytesBackedNativeSessionFile("logs_file", "logs", bArr));
        arrayList.add(new FileBackedNativeSessionFile("crash_meta_file", "metadata", nativeSessionFileProvider.getMetadataFile()));
        arrayList.add(new FileBackedNativeSessionFile("session_meta_file", "session", nativeSessionFileProvider.getSessionFile()));
        arrayList.add(new FileBackedNativeSessionFile("app_meta_file", "app", nativeSessionFileProvider.getAppFile()));
        arrayList.add(new FileBackedNativeSessionFile("device_meta_file", "device", nativeSessionFileProvider.getDeviceFile()));
        arrayList.add(new FileBackedNativeSessionFile("os_meta_file", "os", nativeSessionFileProvider.getOsFile()));
        arrayList.add(new FileBackedNativeSessionFile("minidump_file", "minidump", nativeSessionFileProvider.getMinidumpFile()));
        arrayList.add(new FileBackedNativeSessionFile("user_meta_file", "user", userDataFileForSession));
        arrayList.add(new FileBackedNativeSessionFile("keys_file", "keys", keysFileForSession));
        return arrayList;
    }

    private void writeApplicationExitInfoEventIfRelevant(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                LogFileManager logFileManager = new LogFileManager(this.context, this.logFileDirectoryProvider, str);
                UserMetadata userMetadata = new UserMetadata();
                userMetadata.setCustomKeys(new MetaDataStore(getFilesDir()).readKeyData(str));
                this.reportingCoordinator.persistRelevantAppExitInfoEvent(str, historicalProcessExitReasons, logFileManager, userMetadata);
                return;
            }
            Logger logger = Logger.getLogger();
            logger.v("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        Logger logger2 = Logger.getLogger();
        logger2.v("ANR feature enabled, but device is API " + Build.VERSION.SDK_INT);
    }
}
