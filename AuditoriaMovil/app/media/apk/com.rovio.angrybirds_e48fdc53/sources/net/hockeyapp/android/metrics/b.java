package net.hockeyapp.android.metrics;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import net.hockeyapp.android.utils.HockeyLog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class b {
    private static final Object d = new Object();
    private static final Integer e = 50;
    protected final File a;
    protected WeakReference<Sender> b;
    protected ArrayList<File> c;
    private final WeakReference<Context> f;

    protected b(Context context, File file, Sender sender) {
        this.f = new WeakReference<>(context);
        this.c = new ArrayList<>(51);
        this.a = file;
        this.b = new WeakReference<>(sender);
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Sender sender) {
        this(context, new File(context.getFilesDir().getAbsolutePath() + "/net.hockeyapp.android/telemetry/"), null);
        a(sender);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(String[] strArr) {
        if (!c()) {
            HockeyLog.warn("HA-MetricsPersistence", "Failed to persist file: Too many files on disk.");
            e().triggerSending();
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(str);
        }
        if (a(sb.toString())) {
            e().triggerSending();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean a(java.lang.String r8) {
        /*
            r7 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            java.lang.Object r4 = net.hockeyapp.android.metrics.b.d     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La8
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> La8
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r2.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.File r6 = r7.a     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "/"
            java.lang.StringBuilder r2 = r2.append(r6)     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L68
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68
            r1 = 1
            r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L68
            byte[] r1 = r8.getBytes()     // Catch: java.lang.Throwable -> Lab
            r2.write(r1)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = "HA-MetricsPersistence"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = "Saving data to: "
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lab
            net.hockeyapp.android.utils.HockeyLog.warn(r1, r3)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> La6
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L94
        L63:
            boolean r0 = r0.booleanValue()
            return r0
        L68:
            r1 = move-exception
            r2 = r3
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lab
            throw r1     // Catch: java.lang.Exception -> L6c java.lang.Throwable -> La6
        L6c:
            r1 = move-exception
        L6d:
            java.lang.String r3 = "HA-MetricsPersistence"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Throwable -> La6
            java.lang.String r5 = "Failed to save data with exception: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Throwable -> La6
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La6
            net.hockeyapp.android.utils.HockeyLog.warn(r3, r1)     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L8f
            goto L63
        L8f:
            r1 = move-exception
            r1.printStackTrace()
            goto L63
        L94:
            r1 = move-exception
            r1.printStackTrace()
            goto L63
        L99:
            r0 = move-exception
            r2 = r3
        L9b:
            if (r2 == 0) goto La0
            r2.close()     // Catch: java.io.IOException -> La1
        La0:
            throw r0
        La1:
            r1 = move-exception
            r1.printStackTrace()
            goto La0
        La6:
            r0 = move-exception
            goto L9b
        La8:
            r1 = move-exception
            r2 = r3
            goto L6d
        Lab:
            r1 = move-exception
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: net.hockeyapp.android.metrics.b.a(java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a(File file) {
        StringBuilder sb = new StringBuilder();
        if (file != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    try {
                        synchronized (d) {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                                while (true) {
                                    int read = bufferedReader2.read();
                                    if (read == -1) {
                                        break;
                                    }
                                    sb.append((char) read);
                                }
                                if (bufferedReader2 != null) {
                                    try {
                                        bufferedReader2.close();
                                    } catch (IOException e2) {
                                        HockeyLog.warn("HA-MetricsPersistence", "Error closing stream." + e2.getMessage());
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                try {
                                    throw th;
                                } catch (Exception e3) {
                                    e = e3;
                                    bufferedReader = null;
                                    HockeyLog.warn("HA-MetricsPersistence", "Error reading telemetry data from file with exception message " + e.getMessage());
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e4) {
                                            HockeyLog.warn("HA-MetricsPersistence", "Error closing stream." + e4.getMessage());
                                        }
                                    }
                                    return sb.toString();
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedReader = null;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e5) {
                                            HockeyLog.warn("HA-MetricsPersistence", "Error closing stream." + e5.getMessage());
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a() {
        return b() != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public File b() {
        File file;
        File[] listFiles;
        synchronized (d) {
            if (this.a != null && (listFiles = this.a.listFiles()) != null && listFiles.length > 0) {
                for (int i = 0; i <= listFiles.length - 1; i++) {
                    file = listFiles[i];
                    if (!this.c.contains(file)) {
                        HockeyLog.info("HA-MetricsPersistence", "The directory " + file.toString() + " (ADDING TO SERVED AND RETURN)");
                        this.c.add(file);
                        break;
                    }
                    HockeyLog.info("HA-MetricsPersistence", "The directory " + file.toString() + " (WAS ALREADY SERVED)");
                }
            }
            if (this.a != null) {
                HockeyLog.info("HA-MetricsPersistence", "The directory " + this.a.toString() + " did not contain any unserved files");
            }
            file = null;
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(File file) {
        if (file != null) {
            synchronized (d) {
                if (!file.delete()) {
                    HockeyLog.warn("HA-MetricsPersistence", "Error deleting telemetry file " + file.toString());
                } else {
                    HockeyLog.warn("HA-MetricsPersistence", "Successfully deleted telemetry file at: " + file.toString());
                    this.c.remove(file);
                }
            }
            return;
        }
        HockeyLog.warn("HA-MetricsPersistence", "Couldn't delete file, the reference to the file was null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(File file) {
        synchronized (d) {
            if (file != null) {
                this.c.remove(file);
            }
        }
    }

    protected boolean c() {
        Context f;
        boolean z = false;
        synchronized (d) {
            if (f().getFilesDir() != null) {
                String str = f.getFilesDir().getAbsolutePath() + "/net.hockeyapp.android/telemetry/";
                if (!TextUtils.isEmpty(str)) {
                    File[] listFiles = new File(str).listFiles();
                    if (listFiles != null && listFiles.length < e.intValue()) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    protected void d() {
        if (this.a != null && !this.a.exists()) {
            if (this.a.mkdirs()) {
                HockeyLog.info("HA-MetricsPersistence", "Successfully created directory");
            } else {
                HockeyLog.info("HA-MetricsPersistence", "Error creating directory");
            }
        }
    }

    private Context f() {
        if (this.f == null) {
            return null;
        }
        return this.f.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Sender e() {
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Sender sender) {
        this.b = new WeakReference<>(sender);
    }
}
