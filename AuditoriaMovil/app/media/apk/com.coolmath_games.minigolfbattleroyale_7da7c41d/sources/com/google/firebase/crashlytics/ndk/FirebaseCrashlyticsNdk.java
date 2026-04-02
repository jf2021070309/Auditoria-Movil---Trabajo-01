package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.NativeSessionFileProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class FirebaseCrashlyticsNdk implements CrashlyticsNativeComponent {
    private static final String FILES_PATH = ".com.google.firebase.crashlytics-ndk";
    private static FirebaseCrashlyticsNdk instance;
    private final CrashpadController controller;
    private String currentSessionId;
    private boolean installHandlerDuringPrepareSession;
    private SignalHandlerInstaller signalHandlerInstaller;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface SignalHandlerInstaller {
        void installHandler();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FirebaseCrashlyticsNdk create(Context context, boolean z) {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = new FirebaseCrashlyticsNdk(new CrashpadController(context, new JniNativeApi(context), new NdkCrashFilesManager(new File(context.getFilesDir(), FILES_PATH))), z);
        instance = firebaseCrashlyticsNdk;
        return firebaseCrashlyticsNdk;
    }

    FirebaseCrashlyticsNdk(CrashpadController crashpadController, boolean z) {
        this.controller = crashpadController;
        this.installHandlerDuringPrepareSession = z;
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForCurrentSession() {
        String str = this.currentSessionId;
        return str != null && hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public boolean hasCrashDataForSession(String str) {
        return this.controller.hasCrashDataForSession(str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public synchronized void prepareNativeSession(final String str, final String str2, final long j, final StaticSessionData staticSessionData) {
        this.currentSessionId = str;
        SignalHandlerInstaller signalHandlerInstaller = new SignalHandlerInstaller() { // from class: com.google.firebase.crashlytics.ndk.-$$Lambda$FirebaseCrashlyticsNdk$uWXEmlTQlEwiUIn6o2ZyerrhSEM
            @Override // com.google.firebase.crashlytics.ndk.FirebaseCrashlyticsNdk.SignalHandlerInstaller
            public final void installHandler() {
                FirebaseCrashlyticsNdk.this.lambda$prepareNativeSession$0$FirebaseCrashlyticsNdk(str, str2, j, staticSessionData);
            }
        };
        this.signalHandlerInstaller = signalHandlerInstaller;
        if (this.installHandlerDuringPrepareSession) {
            signalHandlerInstaller.installHandler();
        }
    }

    public /* synthetic */ void lambda$prepareNativeSession$0$FirebaseCrashlyticsNdk(String str, String str2, long j, StaticSessionData staticSessionData) {
        Logger logger = Logger.getLogger();
        logger.d("Initializing native session: " + str);
        if (this.controller.initialize(str, str2, j, staticSessionData)) {
            return;
        }
        Logger logger2 = Logger.getLogger();
        logger2.w("Failed to initialize Crashlytics NDK for session " + str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public void finalizeSession(String str) {
        Logger logger = Logger.getLogger();
        logger.d("Finalizing native session: " + str);
        if (this.controller.finalizeSession(str)) {
            return;
        }
        Logger logger2 = Logger.getLogger();
        logger2.w("Could not finalize native session: " + str);
    }

    @Override // com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent
    public NativeSessionFileProvider getSessionFileProvider(String str) {
        return new SessionFilesProvider(this.controller.getFilesForSession(str));
    }

    public synchronized void installSignalHandler() {
        if (this.signalHandlerInstaller != null) {
            this.signalHandlerInstaller.installHandler();
            return;
        }
        if (this.installHandlerDuringPrepareSession) {
            Logger.getLogger().w("Native signal handler already installed; skipping re-install.");
        } else {
            Logger.getLogger().d("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.installHandlerDuringPrepareSession = true;
        }
    }

    public static FirebaseCrashlyticsNdk getInstance() {
        FirebaseCrashlyticsNdk firebaseCrashlyticsNdk = instance;
        if (firebaseCrashlyticsNdk != null) {
            return firebaseCrashlyticsNdk;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }
}
