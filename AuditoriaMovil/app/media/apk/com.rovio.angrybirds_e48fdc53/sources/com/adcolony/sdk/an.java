package com.adcolony.sdk;

import com.facebook.share.internal.ShareConstants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class an {
    private LinkedList<Runnable> a = new LinkedList<>();
    private boolean b;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(d dVar) {
        JSONObject b = dVar.b();
        String b2 = as.b(b, "filepath");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            int c = as.c(b, "offset");
            int c2 = as.c(b, "size");
            boolean d = as.d(b, "gunzip");
            String b3 = as.b(b, "output_filepath");
            InputStream nVar = new n(new FileInputStream(b2), c, c2);
            if (d) {
                nVar = new GZIPInputStream(nVar, 1024);
            }
            if (b3.equals("")) {
                StringBuilder sb = new StringBuilder(nVar.available());
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = nVar.read(bArr, 0, 1024);
                    if (read < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, "ISO-8859-1"));
                }
                as.b(a, "size", sb.length());
                as.a(a, ShareConstants.WEB_DIALOG_PARAM_DATA, sb.toString());
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(b3);
                byte[] bArr2 = new byte[1024];
                int i = 0;
                while (true) {
                    int read2 = nVar.read(bArr2, 0, 1024);
                    if (read2 < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr2, 0, read2);
                    i += read2;
                }
                fileOutputStream.close();
                as.b(a, "size", i);
            }
            nVar.close();
            as.a(a, "success", true);
            dVar.a(a).a();
            return true;
        } catch (IOException e) {
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        } catch (OutOfMemoryError e2) {
            au.g.b("Out of memory error - disabling AdColony.");
            a.a().a(true);
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(d dVar) {
        JSONObject b = dVar.b();
        String b2 = as.b(b, "filepath");
        String b3 = as.b(b, "bundle_path");
        JSONArray g = as.g(b, "bundle_filenames");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            File file = new File(b3);
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, com.kuaishou.weapon.p0.t.k);
            byte[] bArr = new byte[4];
            byte[] bArr2 = new byte[32];
            randomAccessFile.readInt();
            int readInt = randomAccessFile.readInt();
            JSONArray jSONArray = new JSONArray();
            byte[] bArr3 = new byte[1024];
            for (int i = 0; i < readInt; i++) {
                randomAccessFile.seek((i * 44) + 8);
                randomAccessFile.read(bArr2);
                new String(bArr2);
                randomAccessFile.readInt();
                int readInt2 = randomAccessFile.readInt();
                int readInt3 = randomAccessFile.readInt();
                jSONArray.put(readInt3);
                try {
                    String str = b2 + g.get(i);
                    randomAccessFile.seek(readInt2);
                    FileOutputStream fileOutputStream = new FileOutputStream(str);
                    int i2 = readInt3 / 1024;
                    int i3 = readInt3 % 1024;
                    for (int i4 = 0; i4 < i2; i4++) {
                        randomAccessFile.read(bArr3, 0, 1024);
                        fileOutputStream.write(bArr3, 0, 1024);
                    }
                    randomAccessFile.read(bArr3, 0, i3);
                    fileOutputStream.write(bArr3, 0, i3);
                    fileOutputStream.close();
                } catch (JSONException e) {
                    au.g.a("Could extract file name at index ").a(i).a(" unpacking ad unit bundle at").b(b3);
                    as.a(a, "success", false);
                    dVar.a(a).a();
                    return false;
                }
            }
            randomAccessFile.close();
            file.delete();
            as.a(a, "success", true);
            as.a(a, "file_sizes", jSONArray);
            dVar.a(a).a();
            return true;
        } catch (IOException e2) {
            au.h.a("Failed to find or open ad unit bundle at path: ").b(b3);
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        } catch (OutOfMemoryError e3) {
            au.g.b("Out of memory error - disabling AdColony.");
            a.a().a(true);
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        a.a("FileSystem.save", new f() { // from class: com.adcolony.sdk.an.1
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.a(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.delete", new f() { // from class: com.adcolony.sdk.an.2
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.a(dVar, new File(as.b(dVar.b(), "filepath")));
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.listing", new f() { // from class: com.adcolony.sdk.an.3
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.b(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.load", new f() { // from class: com.adcolony.sdk.an.4
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.c(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.rename", new f() { // from class: com.adcolony.sdk.an.5
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.d(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.exists", new f() { // from class: com.adcolony.sdk.an.6
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.e(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.extract", new f() { // from class: com.adcolony.sdk.an.7
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.f(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.unpack_bundle", new f() { // from class: com.adcolony.sdk.an.8
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.g(dVar);
                        an.this.b();
                    }
                });
            }
        });
        a.a("FileSystem.create_directory", new f() { // from class: com.adcolony.sdk.an.9
            @Override // com.adcolony.sdk.f
            public void a(final d dVar) {
                an.this.a(new Runnable() { // from class: com.adcolony.sdk.an.9.1
                    @Override // java.lang.Runnable
                    public void run() {
                        an.this.h(dVar);
                        an.this.b();
                    }
                });
            }
        });
    }

    boolean a(d dVar) {
        JSONObject b = dVar.b();
        String b2 = as.b(b, "filepath");
        String b3 = as.b(b, ShareConstants.WEB_DIALOG_PARAM_DATA);
        String b4 = as.b(b, "encoding");
        boolean z = b4 != null && b4.equals("utf8");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            a(b2, b3, z);
            as.a(a, "success", true);
            dVar.a(a).a();
            return true;
        } catch (IOException e) {
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, boolean z) {
        BufferedWriter bufferedWriter = z ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str), "UTF-8")) : new BufferedWriter(new OutputStreamWriter(new FileOutputStream(str)));
        bufferedWriter.write(str2);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    boolean a(d dVar, File file) {
        a.a().l().b();
        JSONObject a = as.a();
        if (a(file)) {
            as.a(a, "success", true);
            dVar.a(a).a();
            return true;
        }
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(File file) {
        boolean z = false;
        try {
            if (file.isDirectory()) {
                if (file.list().length == 0) {
                    z = file.delete();
                } else {
                    String[] list = file.list();
                    if (0 < list.length) {
                        z = a(new File(file, list[0]));
                    } else if (file.list().length == 0) {
                        z = file.delete();
                    }
                }
            } else {
                z = file.delete();
            }
        } catch (Exception e) {
        }
        return z;
    }

    boolean b(d dVar) {
        String b = as.b(dVar.b(), "filepath");
        a.a().l().b();
        JSONObject a = as.a();
        String[] list = new File(b).list();
        if (list != null) {
            JSONArray b2 = as.b();
            for (String str : list) {
                JSONObject a2 = as.a();
                as.a(a2, "filename", str);
                if (new File(b + str).isDirectory()) {
                    as.a(a2, "is_folder", true);
                } else {
                    as.a(a2, "is_folder", false);
                }
                as.a(b2, a2);
            }
            as.a(a, "success", true);
            as.a(a, "entries", b2);
            dVar.a(a).a();
            return true;
        }
        as.a(a, "success", false);
        dVar.a(a).a();
        return false;
    }

    String c(d dVar) {
        boolean z = true;
        JSONObject b = dVar.b();
        String b2 = as.b(b, "filepath");
        String b3 = as.b(b, "encoding");
        if (b3 == null || !b3.equals("utf8")) {
            z = false;
        }
        a.a().l().b();
        JSONObject a = as.a();
        try {
            StringBuilder a2 = a(b2, z);
            as.a(a, "success", true);
            as.a(a, ShareConstants.WEB_DIALOG_PARAM_DATA, a2.toString());
            dVar.a(a).a();
            return a2.toString();
        } catch (IOException e) {
            as.a(a, "success", false);
            dVar.a(a).a();
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringBuilder a(String str, boolean z) {
        File file = new File(str);
        StringBuilder sb = new StringBuilder((int) file.length());
        BufferedReader bufferedReader = z ? new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8")) : new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> b(String str, boolean z) {
        File file = new File(str);
        int length = (int) file.length();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = z ? new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), "UTF-8")) : new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath())));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                arrayList.add(readLine);
            } else {
                bufferedReader.close();
                return arrayList;
            }
        }
    }

    boolean d(d dVar) {
        boolean z = true;
        JSONObject b = dVar.b();
        String b2 = as.b(b, "filepath");
        String b3 = as.b(b, "new_filepath");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            if (new File(b2).renameTo(new File(b3))) {
                as.a(a, "success", true);
                dVar.a(a).a();
            } else {
                as.a(a, "success", false);
                dVar.a(a).a();
                z = false;
            }
            return z;
        } catch (Exception e) {
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
    }

    boolean e(d dVar) {
        String b = as.b(dVar.b(), "filepath");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            boolean a2 = a(b);
            as.a(a, "result", a2);
            as.a(a, "success", true);
            dVar.a(a).a();
            return a2;
        } catch (Exception e) {
            as.a(a, "result", false);
            as.a(a, "success", false);
            dVar.a(a).a();
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        return new File(str).exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h(d dVar) {
        boolean z = true;
        String b = as.b(dVar.b(), "filepath");
        a.a().l().b();
        JSONObject a = as.a();
        try {
            if (new File(b).mkdir()) {
                as.a(a, "success", true);
                dVar.a(a).a();
            } else {
                as.a(a, "success", false);
                z = false;
            }
            return z;
        } catch (Exception e) {
            as.a(a, "success", false);
            dVar.a(a).a();
            return false;
        }
    }

    void a(Runnable runnable) {
        if (this.a.isEmpty() && !this.b) {
            this.b = true;
            runnable.run();
            return;
        }
        this.a.push(runnable);
    }

    void b() {
        this.b = false;
        if (!this.a.isEmpty()) {
            this.b = true;
            this.a.removeLast().run();
        }
    }
}
