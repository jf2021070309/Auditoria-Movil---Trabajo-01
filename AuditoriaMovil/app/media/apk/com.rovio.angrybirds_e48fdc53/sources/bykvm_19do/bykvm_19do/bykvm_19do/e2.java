package bykvm_19do.bykvm_19do.bykvm_19do;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e2 {
    boolean a;
    boolean b;
    boolean c;
    boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.d = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(boolean z, boolean z2, boolean z3) {
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        RandomAccessFile randomAccessFile;
        IOException e;
        RandomAccessFile randomAccessFile2;
        File file;
        byte[] bArr;
        int read;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            String str3 = Environment.getExternalStorageDirectory().getPath() + "/Android/data/com.snssdk.api.embed/cache";
            String str4 = str3 + "/" + str;
            FileLock fileLock = null;
            try {
                file = new File(str3);
            } catch (IOException e2) {
                e = e2;
                randomAccessFile2 = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
            }
            if (file.exists() || file.mkdirs()) {
                File file2 = new File(str4);
                randomAccessFile2 = new RandomAccessFile(file2, "rwd");
                try {
                    try {
                        fileLock = randomAccessFile2.getChannel().lock();
                        if (file2.isFile() && (read = randomAccessFile2.read((bArr = new byte[129]), 0, 129)) > 0 && read < 129) {
                            String str5 = new String(bArr, 0, read, "UTF-8");
                            if (k2.a(str5)) {
                                if (fileLock != null) {
                                    try {
                                        fileLock.release();
                                    } catch (Exception e3) {
                                    }
                                }
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception e4) {
                                }
                                return str5;
                            }
                        }
                        byte[] bytes = str2.getBytes("UTF-8");
                        randomAccessFile2.setLength(0L);
                        randomAccessFile2.write(bytes);
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e5) {
                            }
                        }
                    } catch (IOException e6) {
                        e = e6;
                        if (Build.VERSION.SDK_INT >= 23) {
                            if (v1.i().c.checkSelfPermission(com.kuaishou.weapon.p0.g.i) != 0) {
                                throw new SecurityException(e);
                            }
                            l0.a(e);
                        }
                        if (fileLock != null) {
                            try {
                                fileLock.release();
                            } catch (Exception e7) {
                            }
                        }
                        if (randomAccessFile2 == null) {
                            return str2;
                        }
                        randomAccessFile2.close();
                        return str2;
                    }
                    try {
                        randomAccessFile2.close();
                        return str2;
                    } catch (Exception e8) {
                        return str2;
                    }
                } catch (Throwable th2) {
                    randomAccessFile = randomAccessFile2;
                    th = th2;
                    if (0 != 0) {
                        try {
                            fileLock.release();
                        } catch (Exception e9) {
                        }
                    }
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Exception e10) {
                        }
                    }
                    throw th;
                }
            }
            return str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a(JSONObject jSONObject);
}
