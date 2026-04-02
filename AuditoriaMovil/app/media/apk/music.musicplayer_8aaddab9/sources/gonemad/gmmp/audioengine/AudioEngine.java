package gonemad.gmmp.audioengine;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import e.h.g.s1;
import e.h.g.x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class AudioEngine {
    private static final String VERSION_FILE = "gmae.ver";
    public static AudioEngine m_Instance;
    public static Context s_Ctx;
    public static String s_LibPath;
    public static final AtomicBoolean s_LibsLoaded = new AtomicBoolean(false);
    private boolean m_AACDecoderFound;
    private boolean m_AudioTrackFound;
    private boolean m_MP3DecoderFound;

    private AudioEngine() {
        setOSLevel(Build.VERSION.SDK_INT);
        setLibraryPath(s_LibPath);
        load();
    }

    public static void ensureContext() {
        if (s_Ctx == null) {
            s_Ctx = x0.f8405d;
        }
    }

    public static AudioEngine getInstance() {
        ensureContext();
        if (m_Instance == null) {
            loadLibraries();
            m_Instance = new AudioEngine();
        }
        return m_Instance;
    }

    public static String getNativeLibPath() {
        return s_LibPath;
    }

    private static int getThreadPriority() {
        try {
            return Process.getThreadPriority(Process.myTid());
        } catch (Exception unused) {
            return 0;
        }
    }

    private native void load();

    public static void loadLibraries() {
        ensureContext();
        AtomicBoolean atomicBoolean = s_LibsLoaded;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                if (s_LibPath == null) {
                    throw new RuntimeException("AudioEngine.setup() must be called first!");
                }
                if (InstallUtil.sUseNativeLibPath) {
                    System.loadLibrary("avutil_gm");
                    System.loadLibrary("swresample_gm");
                    System.loadLibrary("avcodec_gm");
                    System.loadLibrary("avformat_gm");
                    System.loadLibrary("gm_audioengine");
                } else {
                    try {
                        System.load(new File(s_LibPath, "libavutil_gm.so").getAbsolutePath());
                        System.load(new File(s_LibPath, "libswresample_gm.so").getAbsolutePath());
                        System.load(new File(s_LibPath, "libavcodec_gm.so").getAbsolutePath());
                        System.load(new File(s_LibPath, "libavformat_gm.so").getAbsolutePath());
                        System.load(new File(s_LibPath, "libgm_audioengine.so").getAbsolutePath());
                    } catch (UnsatisfiedLinkError unused) {
                        System.loadLibrary("avutil_gm");
                        System.loadLibrary("swresample_gm");
                        System.loadLibrary("avcodec_gm");
                        System.loadLibrary("avformat_gm");
                        System.loadLibrary("gm_audioengine");
                    }
                }
                s_LibsLoaded.set(true);
            }
        }
    }

    private native void setLibraryPath(String str);

    private native void setOSLevel(int i2);

    private static boolean setThreadPriority(int i2) {
        try {
            Process.setThreadPriority(i2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v11, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b6 -> B:49:0x00bf). Please submit an issue!!! */
    public static void setup(boolean z) {
        boolean z2;
        ?? r8;
        ensureContext();
        synchronized (s_LibsLoaded) {
            File filesDir = x0.f8405d.getFilesDir();
            if (s_LibPath == null) {
                s_LibPath = filesDir.getAbsolutePath();
                z2 = false;
            } else {
                z2 = true;
            }
            InstallUtil.sUseNativeLibPath = !new File(x0.f8405d.getApplicationInfo().nativeLibraryDir, "libavcodec_gm.so").exists();
            s1.c("Use native lib path = " + InstallUtil.sUseNativeLibPath);
            if (z && !z2) {
                try {
                    r8 = x0.f8405d.getPackageManager().getPackageInfo(x0.f8405d.getPackageName(), 0).versionCode;
                } catch (PackageManager.NameNotFoundException e2) {
                    s1.l(e2, true);
                    r8 = 0;
                }
                ?? r2 = 4;
                r2 = 4;
                r2 = 4;
                r2 = 4;
                r2 = 4;
                if (new File(filesDir, VERSION_FILE).exists()) {
                    try {
                        byte[] bArr = new byte[4];
                        FileInputStream openFileInput = x0.f8405d.openFileInput(VERSION_FILE);
                        openFileInput.read(bArr);
                        openFileInput.close();
                        ByteBuffer put = ByteBuffer.allocate(4).put(bArr);
                        put.rewind();
                        if (put.getInt() != r8) {
                            InstallUtil.installNativeLibs(x0.f8405d);
                        } else {
                            if ((x0.f8405d.getApplicationInfo().flags & 2) != 0) {
                                InstallUtil.installNativeLibs(x0.f8405d);
                            }
                        }
                    } catch (Exception e3) {
                        s1.l(e3, true);
                    }
                } else {
                    InstallUtil.installNativeLibs(x0.f8405d);
                }
                try {
                    FileOutputStream openFileOutput = x0.f8405d.openFileOutput(VERSION_FILE, 0);
                    r2 = ByteBuffer.allocate(r2);
                    r8 = r2.putInt(r8).array();
                    openFileOutput.write((byte[]) r8);
                    openFileOutput.close();
                } catch (Exception e4) {
                    s1.l(e4, true);
                }
            }
        }
    }

    public static void shutdown() {
        m_Instance = null;
    }

    private native void unload();

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable unused) {
        }
        unload();
    }

    public native String getVersion();

    public boolean isAACDecoderFound() {
        return this.m_AACDecoderFound;
    }

    public boolean isAudioTrackFound() {
        return this.m_AudioTrackFound;
    }

    public boolean isMP3DecoderFound() {
        return this.m_MP3DecoderFound;
    }
}
