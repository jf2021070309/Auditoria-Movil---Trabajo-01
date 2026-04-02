package net.hockeyapp.android.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
/* loaded from: classes4.dex */
public class SimpleMultipartEntity {
    private static final char[] a = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private String e;
    private boolean c = false;
    private boolean b = false;
    private ByteArrayOutputStream d = new ByteArrayOutputStream();

    public SimpleMultipartEntity() {
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            stringBuffer.append(a[random.nextInt(a.length)]);
        }
        this.e = stringBuffer.toString();
    }

    public String getBoundary() {
        return this.e;
    }

    public void writeFirstBoundaryIfNeeds() {
        if (!this.c) {
            this.d.write(("--" + this.e + "\r\n").getBytes());
        }
        this.c = true;
    }

    public void writeLastBoundaryIfNeeds() {
        if (!this.b) {
            try {
                this.d.write(("\r\n--" + this.e + "--\r\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.b = true;
        }
    }

    public void addPart(String str, String str2) {
        writeFirstBoundaryIfNeeds();
        this.d.write(("Content-Disposition: form-data; name=\"" + str + "\"\r\n").getBytes());
        this.d.write("Content-Type: text/plain; charset=UTF-8\r\n".getBytes());
        this.d.write("Content-Transfer-Encoding: 8bit\r\n\r\n".getBytes());
        this.d.write(str2.getBytes());
        this.d.write(("\r\n--" + this.e + "\r\n").getBytes());
    }

    public void addPart(String str, File file, boolean z) {
        addPart(str, file.getName(), new FileInputStream(file), z);
    }

    public void addPart(String str, String str2, InputStream inputStream, boolean z) {
        addPart(str, str2, inputStream, "application/octet-stream", z);
    }

    public void addPart(String str, String str2, InputStream inputStream, String str3, boolean z) {
        writeFirstBoundaryIfNeeds();
        try {
            this.d.write(("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n").getBytes());
            this.d.write(("Content-Type: " + str3 + "\r\n").getBytes());
            this.d.write("Content-Transfer-Encoding: binary\r\n\r\n".getBytes());
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                this.d.write(bArr, 0, read);
            }
            this.d.flush();
            if (z) {
                writeLastBoundaryIfNeeds();
            } else {
                this.d.write(("\r\n--" + this.e + "\r\n").getBytes());
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public long getContentLength() {
        writeLastBoundaryIfNeeds();
        return this.d.toByteArray().length;
    }

    public String getContentType() {
        return "multipart/form-data; boundary=" + getBoundary();
    }

    public ByteArrayOutputStream getOutputStream() {
        writeLastBoundaryIfNeeds();
        return this.d;
    }
}
