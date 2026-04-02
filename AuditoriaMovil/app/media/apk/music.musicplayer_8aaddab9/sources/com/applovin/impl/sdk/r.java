package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.util.FileSize;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    private final m f4275b;

    /* renamed from: c  reason: collision with root package name */
    private final v f4276c;
    private final String a = "FileManager";

    /* renamed from: d  reason: collision with root package name */
    private final Object f4277d = new Object();

    public r(m mVar) {
        this.f4275b = mVar;
        this.f4276c = mVar.B();
    }

    private long a() {
        long longValue = ((Long) this.f4275b.a(com.applovin.impl.sdk.c.b.bq)).longValue();
        if (longValue < 0 || !b()) {
            return -1L;
        }
        return longValue;
    }

    private long a(long j2) {
        return j2 / FileSize.MB_COEFFICIENT;
    }

    private void a(long j2, Context context) {
        v vVar;
        String str;
        if (b()) {
            long intValue = ((Integer) this.f4275b.a(com.applovin.impl.sdk.c.b.br)).intValue();
            if (intValue == -1) {
                vVar = this.f4276c;
                str = "Cache has no maximum size set; skipping drop...";
            } else {
                int i2 = (a(j2) > intValue ? 1 : (a(j2) == intValue ? 0 : -1));
                vVar = this.f4276c;
                if (i2 > 0) {
                    vVar.b("FileManager", "Cache has exceeded maximum size; dropping...");
                    for (File file : d(context)) {
                        b(file);
                    }
                    this.f4275b.T().a(com.applovin.impl.sdk.d.f.f3999f);
                    return;
                }
                str = "Cache is present but under size limit; not dropping...";
            }
            vVar.b("FileManager", str);
        }
    }

    private boolean a(File file, String str, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        if (file == null || !file.exists() || file.isDirectory()) {
            ByteArrayOutputStream a = a(str, list, z, eVar);
            if (eVar != null && a != null) {
                eVar.a(a.size());
            }
            return a(a, file);
        }
        v vVar = this.f4276c;
        vVar.b("FileManager", "File exists for " + str);
        if (eVar != null) {
            eVar.b(file.length());
            return true;
        }
        return true;
    }

    private boolean b() {
        return ((Boolean) this.f4275b.a(com.applovin.impl.sdk.c.b.bp)).booleanValue();
    }

    private boolean b(ByteArrayOutputStream byteArrayOutputStream, File file) {
        boolean z;
        FileOutputStream fileOutputStream;
        v vVar = this.f4276c;
        StringBuilder y = e.a.d.a.a.y("Writing resource to filesystem: ");
        y.append(file.getName());
        vVar.b("FileManager", y.toString());
        synchronized (this.f4277d) {
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th) {
                th = th;
            }
            try {
                byteArrayOutputStream.writeTo(fileOutputStream);
                z = true;
                Utils.close(fileOutputStream, this.f4275b);
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                this.f4276c.b("FileManager", "Unable to write data to file.", e);
                Utils.close(fileOutputStream2, this.f4275b);
                z = false;
                return z;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                this.f4276c.b("FileManager", "Unknown failure to write file.", th);
                Utils.close(fileOutputStream2, this.f4275b);
                z = false;
                return z;
            }
        }
        return z;
    }

    private boolean b(File file) {
        boolean delete;
        v vVar = this.f4276c;
        StringBuilder y = e.a.d.a.a.y("Removing file ");
        y.append(file.getName());
        y.append(" from filesystem...");
        vVar.b("FileManager", y.toString());
        synchronized (this.f4277d) {
            try {
                try {
                    delete = file.delete();
                } catch (Exception e2) {
                    v vVar2 = this.f4276c;
                    vVar2.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e2);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return delete;
    }

    private long c(Context context) {
        long j2;
        boolean z;
        long a = a();
        boolean z2 = a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        synchronized (this.f4277d) {
            List<String> b2 = this.f4275b.b(com.applovin.impl.sdk.c.b.bw);
            j2 = 0;
            for (File file : d(context)) {
                if (!z2 || b2.contains(file.getName()) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= a) {
                    z = false;
                } else {
                    v vVar = this.f4276c;
                    vVar.b("FileManager", "File " + file.getName() + " has expired, removing...");
                    z = b(file);
                }
                if (z) {
                    this.f4275b.T().a(com.applovin.impl.sdk.d.f.f3998e);
                } else {
                    j2 += file.length();
                }
            }
        }
        return j2;
    }

    private List<File> d(Context context) {
        List<File> asList;
        File e2 = e(context);
        if (e2.isDirectory()) {
            synchronized (this.f4277d) {
                asList = Arrays.asList(e2.listFiles());
            }
            return asList;
        }
        return Collections.emptyList();
    }

    private File e(Context context) {
        return new File(context.getFilesDir(), "al");
    }

    public ByteArrayOutputStream a(File file) {
        FileInputStream fileInputStream;
        IOException e2;
        if (file == null) {
            return null;
        }
        v vVar = this.f4276c;
        StringBuilder y = e.a.d.a.a.y("Reading resource from filesystem: ");
        y.append(file.getName());
        vVar.b("FileManager", y.toString());
        synchronized (this.f4277d) {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream.read(bArr, 0, 1024);
                            if (read < 0) {
                                Utils.close(fileInputStream, this.f4275b);
                                return byteArrayOutputStream;
                            }
                            try {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } catch (Exception unused) {
                                Utils.close(byteArrayOutputStream, this.f4275b);
                                Utils.close(fileInputStream, this.f4275b);
                                return null;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.f4276c.b("FileManager", "Unknown failure to read file.", th);
                        Utils.close(fileInputStream, this.f4275b);
                        return null;
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    this.f4276c.c("FileManager", "File not found. " + e);
                    Utils.close(fileInputStream, this.f4275b);
                    return null;
                } catch (IOException e4) {
                    e2 = e4;
                    this.f4276c.b("FileManager", "Failed to read file: " + file.getName() + e2);
                    Utils.close(fileInputStream, this.f4275b);
                    return null;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
                fileInputStream = null;
            } catch (IOException e6) {
                e2 = e6;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.ByteArrayOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.applovin.impl.sdk.v] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    public ByteArrayOutputStream a(String str, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        InputStream inputStream;
        Closeable closeable = null;
        if (z && !Utils.isDomainWhitelisted(str, list)) {
            this.f4276c.b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            return null;
        }
        if (((Boolean) this.f4275b.a(com.applovin.impl.sdk.c.b.cT)).booleanValue() && !str.contains("https://")) {
            this.f4276c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            str = str.replace("http://", "https://");
        }
        ?? r9 = this.f4276c;
        ?? r10 = "Loading " + str + "...";
        r9.b("FileManager", r10);
        try {
            try {
                r9 = new ByteArrayOutputStream();
                try {
                    r10 = (HttpURLConnection) new URL(str).openConnection();
                } catch (IOException e2) {
                    e = e2;
                    r10 = 0;
                    r9 = r9;
                    inputStream = r10;
                    this.f4276c.b("FileManager", "Error loading " + str, e);
                    eVar.a(e);
                    Utils.close(inputStream, this.f4275b);
                    Utils.close(r9, this.f4275b);
                    Utils.disconnect(r10, this.f4275b);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    r10 = 0;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = "...";
            }
            try {
                r10.setConnectTimeout(((Integer) this.f4275b.a(com.applovin.impl.sdk.c.b.cR)).intValue());
                r10.setReadTimeout(((Integer) this.f4275b.a(com.applovin.impl.sdk.c.b.cS)).intValue());
                r10.setDefaultUseCaches(true);
                r10.setUseCaches(true);
                r10.setAllowUserInteraction(false);
                r10.setInstanceFollowRedirects(true);
                int responseCode = r10.getResponseCode();
                eVar.a(responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    inputStream = r10.getInputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 1024);
                            if (read < 0) {
                                this.f4276c.b("FileManager", "Loaded resource at " + str);
                                Utils.close(inputStream, this.f4275b);
                                Utils.close(r9, this.f4275b);
                                Utils.disconnect(r10, this.f4275b);
                                return r9;
                            }
                            try {
                                r9.write(bArr, 0, read);
                            } catch (Exception unused) {
                                Utils.close(r9, this.f4275b);
                                Utils.close(inputStream, this.f4275b);
                                Utils.close(r9, this.f4275b);
                                Utils.disconnect(r10, this.f4275b);
                                return null;
                            }
                        }
                    } catch (IOException e3) {
                        e = e3;
                        this.f4276c.b("FileManager", "Error loading " + str, e);
                        eVar.a(e);
                        Utils.close(inputStream, this.f4275b);
                        Utils.close(r9, this.f4275b);
                        Utils.disconnect(r10, this.f4275b);
                        return null;
                    }
                }
                Utils.close(null, this.f4275b);
                Utils.close(r9, this.f4275b);
                Utils.disconnect(r10, this.f4275b);
                return null;
            } catch (IOException e4) {
                e = e4;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Utils.close(closeable, this.f4275b);
                Utils.close(r9, this.f4275b);
                Utils.disconnect(r10, this.f4275b);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            r9 = 0;
            r10 = 0;
        } catch (Throwable th4) {
            th = th4;
            r9 = 0;
            r10 = 0;
        }
    }

    public File a(String str, Context context) {
        File file;
        if (!StringUtils.isValidString(str)) {
            this.f4276c.b("FileManager", "Nothing to look up, skipping...");
            return null;
        }
        v vVar = this.f4276c;
        vVar.b("FileManager", "Looking up cached resource: " + str);
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.f4277d) {
            File e2 = e(context);
            file = new File(e2, str);
            e2.mkdirs();
        }
        return file;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            this.f4276c.b("FileManager", "Nothing to cache, skipping...");
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (StringUtils.isValidString(lastPathSegment) && StringUtils.isValidString(str2)) {
            lastPathSegment = e.a.d.a.a.k(str2, lastPathSegment);
        }
        String str3 = lastPathSegment;
        File a = a(str3, context);
        if (a(a, str, list, z, eVar)) {
            v vVar = this.f4276c;
            vVar.b("FileManager", "Caching succeeded for file " + str3);
            return z2 ? Uri.fromFile(a).toString() : str3;
        }
        return null;
    }

    public void a(Context context) {
        if (b() && this.f4275b.c()) {
            this.f4276c.b("FileManager", "Compacting cache...");
            synchronized (this.f4277d) {
                a(c(context), context);
            }
        }
    }

    public boolean a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        v vVar = this.f4276c;
        StringBuilder y = e.a.d.a.a.y("Caching ");
        y.append(file.getAbsolutePath());
        y.append("...");
        vVar.b("FileManager", y.toString());
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            v vVar2 = this.f4276c;
            StringBuilder y2 = e.a.d.a.a.y("No data for ");
            y2.append(file.getAbsolutePath());
            vVar2.d("FileManager", y2.toString());
            return false;
        } else if (!b(byteArrayOutputStream, file)) {
            v vVar3 = this.f4276c;
            StringBuilder y3 = e.a.d.a.a.y("Unable to cache ");
            y3.append(file.getAbsolutePath());
            vVar3.e("FileManager", y3.toString());
            return false;
        } else {
            v vVar4 = this.f4276c;
            vVar4.b("FileManager", "Caching completed for " + file);
            return true;
        }
    }

    public boolean a(File file, String str, List<String> list, com.applovin.impl.sdk.d.e eVar) {
        return a(file, str, list, true, eVar);
    }

    public void b(Context context) {
        try {
            a(".nomedia", context);
            File file = new File(e(context), ".nomedia");
            if (file.exists()) {
                return;
            }
            v vVar = this.f4276c;
            vVar.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            if (file.createNewFile()) {
                return;
            }
            this.f4276c.e("FileManager", "Failed to create .nomedia file");
        } catch (IOException e2) {
            this.f4276c.b("FileManager", "Failed to create .nomedia file", e2);
        }
    }

    public boolean b(String str, Context context) {
        boolean z;
        synchronized (this.f4277d) {
            File a = a(str, context);
            z = (a == null || !a.exists() || a.isDirectory()) ? false : true;
        }
        return z;
    }
}
