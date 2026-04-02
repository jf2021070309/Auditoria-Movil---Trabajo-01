package com.applovin.impl.sdk;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
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
public class p {
    private final k b;
    private final r c;
    private final String a = "FileManager";
    private final Object d = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(k kVar) {
        this.b = kVar;
        this.c = kVar.z();
    }

    private long a() {
        long longValue = ((Long) this.b.a(com.applovin.impl.sdk.c.b.bg)).longValue();
        if (longValue < 0 || !b()) {
            return -1L;
        }
        return longValue;
    }

    private long a(long j) {
        return j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    private void a(long j, Context context) {
        r rVar;
        String str;
        if (b()) {
            long intValue = ((Integer) this.b.a(com.applovin.impl.sdk.c.b.bh)).intValue();
            if (intValue == -1) {
                rVar = this.c;
                str = "Cache has no maximum size set; skipping drop...";
            } else if (a(j) > intValue) {
                this.c.b("FileManager", "Cache has exceeded maximum size; dropping...");
                for (File file : d(context)) {
                    b(file);
                }
                this.b.R().a(com.applovin.impl.sdk.d.f.f);
                return;
            } else {
                rVar = this.c;
                str = "Cache is present but under size limit; not dropping...";
            }
            rVar.b("FileManager", str);
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
        r rVar = this.c;
        rVar.b("FileManager", "File exists for " + str);
        if (eVar != null) {
            eVar.b(file.length());
            return true;
        }
        return true;
    }

    private boolean b() {
        return ((Boolean) this.b.a(com.applovin.impl.sdk.c.b.bf)).booleanValue();
    }

    private boolean b(ByteArrayOutputStream byteArrayOutputStream, File file) {
        k kVar;
        boolean z;
        r rVar = this.c;
        rVar.b("FileManager", "Writing resource to filesystem: " + file.getName());
        synchronized (this.d) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    byteArrayOutputStream.writeTo(fileOutputStream2);
                    z = true;
                    Utils.close(fileOutputStream2, this.b);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    this.c.b("FileManager", "Unable to write data to file.", e);
                    kVar = this.b;
                    Utils.close(fileOutputStream, kVar);
                    z = false;
                    return z;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    this.c.b("FileManager", "Unknown failure to write file.", th);
                    kVar = this.b;
                    Utils.close(fileOutputStream, kVar);
                    z = false;
                    return z;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return z;
    }

    private boolean b(File file) {
        boolean delete;
        r rVar = this.c;
        rVar.b("FileManager", "Removing file " + file.getName() + " from filesystem...");
        synchronized (this.d) {
            try {
                try {
                    delete = file.delete();
                } catch (Exception e) {
                    r rVar2 = this.c;
                    rVar2.b("FileManager", "Failed to remove file " + file.getName() + " from filesystem!", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return delete;
    }

    private long c(Context context) {
        long j;
        boolean z;
        long a = a();
        boolean z2 = a != -1;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        synchronized (this.d) {
            List<String> b = this.b.b(com.applovin.impl.sdk.c.b.bm);
            j = 0;
            for (File file : d(context)) {
                if (!z2 || b.contains(file.getName()) || seconds - TimeUnit.MILLISECONDS.toSeconds(file.lastModified()) <= a) {
                    z = false;
                } else {
                    r rVar = this.c;
                    rVar.b("FileManager", "File " + file.getName() + " has expired, removing...");
                    z = b(file);
                }
                if (z) {
                    this.b.R().a(com.applovin.impl.sdk.d.f.e);
                } else {
                    j += file.length();
                }
            }
        }
        return j;
    }

    private List<File> d(Context context) {
        List<File> asList;
        File e = e(context);
        if (e.isDirectory()) {
            synchronized (this.d) {
                asList = Arrays.asList(e.listFiles());
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
        if (file == null) {
            return null;
        }
        this.c.b("FileManager", "Reading resource from filesystem: " + file.getName());
        synchronized (this.d) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e = e;
                fileInputStream = null;
            } catch (IOException e2) {
                e = e2;
                fileInputStream = null;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
            }
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            Utils.close(fileInputStream, this.b);
                            return byteArrayOutputStream;
                        }
                        try {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } catch (Exception unused) {
                            Utils.close(byteArrayOutputStream, this.b);
                            Utils.close(fileInputStream, this.b);
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.c.b("FileManager", "Unknown failure to read file.", th);
                    Utils.close(fileInputStream, this.b);
                    return null;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
                this.c.c("FileManager", "File not found. " + e);
                Utils.close(fileInputStream, this.b);
                return null;
            } catch (IOException e4) {
                e = e4;
                this.c.b("FileManager", "Failed to read file: " + file.getName() + e);
                Utils.close(fileInputStream, this.b);
                return null;
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
    /* JADX WARN: Type inference failed for: r9v5, types: [com.applovin.impl.sdk.r] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.Closeable] */
    public ByteArrayOutputStream a(String str, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        InputStream inputStream;
        Closeable closeable = null;
        if (z && !Utils.isDomainWhitelisted(str, list)) {
            this.c.b("FileManager", "Domain is not whitelisted, skipping precache for url: " + str);
            return null;
        }
        if (((Boolean) this.b.a(com.applovin.impl.sdk.c.b.cT)).booleanValue() && !str.contains("https://")) {
            this.c.d("FileManager", "Plaintext HTTP operation requested; upgrading to HTTPS due to universal SSL setting...");
            str = str.replace("http://", "https://");
        }
        ?? r9 = this.c;
        ?? r10 = "Loading " + str + "...";
        r9.b("FileManager", r10);
        try {
            try {
                r9 = new ByteArrayOutputStream();
                try {
                    r10 = (HttpURLConnection) new URL(str).openConnection();
                } catch (IOException e) {
                    e = e;
                    r10 = 0;
                    r9 = r9;
                    inputStream = r10;
                    this.c.b("FileManager", "Error loading " + str, e);
                    eVar.a(e);
                    Utils.close(inputStream, this.b);
                    Utils.close(r9, this.b);
                    Utils.disconnect(r10, this.b);
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
                r10.setConnectTimeout(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cR)).intValue());
                r10.setReadTimeout(((Integer) this.b.a(com.applovin.impl.sdk.c.b.cS)).intValue());
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
                                this.c.b("FileManager", "Loaded resource at " + str);
                                Utils.close(inputStream, this.b);
                                Utils.close(r9, this.b);
                                Utils.disconnect(r10, this.b);
                                return r9;
                            }
                            try {
                                r9.write(bArr, 0, read);
                            } catch (Exception unused) {
                                Utils.close(r9, this.b);
                                Utils.close(inputStream, this.b);
                                Utils.close(r9, this.b);
                                Utils.disconnect(r10, this.b);
                                return null;
                            }
                        }
                    } catch (IOException e2) {
                        e = e2;
                        this.c.b("FileManager", "Error loading " + str, e);
                        eVar.a(e);
                        Utils.close(inputStream, this.b);
                        Utils.close(r9, this.b);
                        Utils.disconnect(r10, this.b);
                        return null;
                    }
                }
                Utils.close(null, this.b);
                Utils.close(r9, this.b);
                Utils.disconnect(r10, this.b);
                return null;
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Utils.close(closeable, this.b);
                Utils.close(r9, this.b);
                Utils.disconnect(r10, this.b);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
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
            this.c.b("FileManager", "Nothing to look up, skipping...");
            return null;
        }
        r rVar = this.c;
        rVar.b("FileManager", "Looking up cached resource: " + str);
        if (str.contains("icon")) {
            str = str.replace("/", "_").replace(".", "_");
        }
        synchronized (this.d) {
            File e = e(context);
            file = new File(e, str);
            e.mkdirs();
        }
        return file;
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, com.applovin.impl.sdk.d.e eVar) {
        return a(context, str, str2, list, z, false, eVar);
    }

    public String a(Context context, String str, String str2, List<String> list, boolean z, boolean z2, com.applovin.impl.sdk.d.e eVar) {
        if (!StringUtils.isValidString(str)) {
            this.c.b("FileManager", "Nothing to cache, skipping...");
            return null;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (StringUtils.isValidString(lastPathSegment) && StringUtils.isValidString(str2)) {
            lastPathSegment = str2 + lastPathSegment;
        }
        String str3 = lastPathSegment;
        File a = a(str3, context);
        if (a(a, str, list, z, eVar)) {
            this.c.b("FileManager", "Caching succeeded for file " + str3);
            return z2 ? Uri.fromFile(a).toString() : str3;
        }
        return null;
    }

    public void a(Context context) {
        if (b() && this.b.c()) {
            this.c.b("FileManager", "Compacting cache...");
            synchronized (this.d) {
                a(c(context), context);
            }
        }
    }

    public boolean a(ByteArrayOutputStream byteArrayOutputStream, File file) {
        if (file == null) {
            return false;
        }
        r rVar = this.c;
        rVar.b("FileManager", "Caching " + file.getAbsolutePath() + "...");
        if (byteArrayOutputStream == null || byteArrayOutputStream.size() <= 0) {
            r rVar2 = this.c;
            rVar2.d("FileManager", "No data for " + file.getAbsolutePath());
            return false;
        } else if (b(byteArrayOutputStream, file)) {
            r rVar3 = this.c;
            rVar3.b("FileManager", "Caching completed for " + file);
            return true;
        } else {
            r rVar4 = this.c;
            rVar4.e("FileManager", "Unable to cache " + file.getAbsolutePath());
            return false;
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
            r rVar = this.c;
            rVar.b("FileManager", "Creating .nomedia file at " + file.getAbsolutePath());
            if (file.createNewFile()) {
                return;
            }
            this.c.e("FileManager", "Failed to create .nomedia file");
        } catch (IOException e) {
            this.c.b("FileManager", "Failed to create .nomedia file", e);
        }
    }

    public boolean b(String str, Context context) {
        boolean z;
        synchronized (this.d) {
            File a = a(str, context);
            z = (a == null || !a.exists() || a.isDirectory()) ? false : true;
        }
        return z;
    }
}
