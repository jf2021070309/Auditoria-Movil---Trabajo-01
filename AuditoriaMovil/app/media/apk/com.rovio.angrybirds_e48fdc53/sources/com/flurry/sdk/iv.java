package com.flurry.sdk;

import android.os.Build;
import com.flurry.sdk.iw;
import com.flurry.sdk.ku;
import com.flurry.sdk.kw;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
/* loaded from: classes2.dex */
public class iv {
    public static final String a = iv.class.getName();
    private static iv c = null;
    public String b;
    private kh<List<iw>> d;
    private List<iw> e;
    private boolean f;

    private iv() {
    }

    public static synchronized iv a() {
        iv ivVar;
        synchronized (iv.class) {
            if (c == null) {
                iv ivVar2 = new iv();
                c = ivVar2;
                ivVar2.d = new kh<>(ka.a().a.getFileStreamPath(".yflurrypulselogging." + Long.toString(ma.i(ka.a().d), 16)), ".yflurrypulselogging.", 1, new ll<List<iw>>() { // from class: com.flurry.sdk.iv.1
                    @Override // com.flurry.sdk.ll
                    public final li<List<iw>> a(int i) {
                        return new lh(new iw.a());
                    }
                });
                ivVar2.f = ((Boolean) lr.a().a("UseHttps")).booleanValue();
                ko.a(4, a, "initSettings, UseHttps = " + ivVar2.f);
                ivVar2.e = ivVar2.d.a();
                if (ivVar2.e == null) {
                    ivVar2.e = new ArrayList();
                }
            }
            ivVar = c;
        }
        return ivVar;
    }

    public final synchronized void a(iu iuVar) {
        try {
            this.e.add(new iw(iuVar.d()));
            ko.a(4, a, "Saving persistent Pulse logging data.");
            this.d.a(this.e);
        } catch (IOException e) {
            ko.a(6, a, "Error when generating pulse log report in addReport part");
        }
    }

    public final synchronized void b() {
        try {
            a(d());
        } catch (IOException e) {
            ko.a(6, a, "Report not send due to exception in generate data");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private synchronized void a(byte[] bArr) {
        String str;
        if (!jt.a().b) {
            ko.a(5, a, "Reports were not sent! No Internet connection!");
        } else if (bArr == 0 || bArr.length == 0) {
            ko.a(3, a, "No report need be sent");
        } else {
            if (this.b != null) {
                str = this.b;
            } else {
                str = "https://data.flurry.col/pcr.do";
            }
            ko.a(4, a, "PulseLoggingManager: start upload data " + Arrays.toString(bArr) + " to " + str);
            ku kuVar = new ku();
            kuVar.g = str;
            kuVar.u = 100000;
            kuVar.h = kw.a.kPost;
            kuVar.k = true;
            kuVar.a(DownloadUtils.CONTENT_TYPE, "application/octet-stream");
            kuVar.c = new le();
            kuVar.b = bArr;
            kuVar.a = new ku.a<byte[], Void>() { // from class: com.flurry.sdk.iv.2
                @Override // com.flurry.sdk.ku.a
                public final /* synthetic */ void a(ku<byte[], Void> kuVar2, Void r7) {
                    int i = kuVar2.q;
                    if (i <= 0) {
                        ko.e(iv.a, "Server Error: " + i);
                    } else if (i < 200 || i >= 300) {
                        ko.a(3, iv.a, "Pulse logging report sent unsuccessfully, HTTP response:" + i);
                    } else {
                        ko.a(3, iv.a, "Pulse logging report sent successfully HTTP response:" + i);
                        iv.this.e.clear();
                        iv.this.d.a(iv.this.e);
                    }
                }
            };
            jy.a().a((Object) this, (iv) kuVar);
        }
    }

    private byte[] d() {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] byteArray;
        DataOutputStream dataOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        } catch (IOException e) {
            e = e;
        } catch (Throwable th) {
            th = th;
            dataOutputStream = null;
        }
        try {
            if (this.e == null || this.e.isEmpty()) {
                byteArray = byteArrayOutputStream.toByteArray();
                ma.a(dataOutputStream);
            } else {
                dataOutputStream.writeShort(1);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeUTF(ka.a().d);
                dataOutputStream.writeUTF(jw.a().g());
                dataOutputStream.writeShort(kb.b());
                dataOutputStream.writeShort(3);
                jw.a();
                dataOutputStream.writeUTF(jw.c());
                dataOutputStream.writeBoolean(jn.a().c());
                ArrayList<ib> arrayList = new ArrayList();
                for (Map.Entry entry : Collections.unmodifiableMap(jn.a().a).entrySet()) {
                    ib ibVar = new ib();
                    ibVar.a = ((jv) entry.getKey()).c;
                    if (((jv) entry.getKey()).d) {
                        ibVar.b = new String((byte[]) entry.getValue());
                    } else {
                        ibVar.b = ma.b((byte[]) entry.getValue());
                    }
                    arrayList.add(ibVar);
                }
                dataOutputStream.writeShort(arrayList.size());
                for (ib ibVar2 : arrayList) {
                    dataOutputStream.writeShort(ibVar2.a);
                    byte[] bytes = ibVar2.b.getBytes();
                    dataOutputStream.writeShort(bytes.length);
                    dataOutputStream.write(bytes);
                }
                dataOutputStream.writeShort(6);
                dataOutputStream.writeShort(io.b - 1);
                dataOutputStream.writeUTF(Build.MODEL);
                dataOutputStream.writeShort(io.c - 1);
                dataOutputStream.writeUTF(Build.BOARD);
                dataOutputStream.writeShort(io.d - 1);
                dataOutputStream.writeUTF(Build.ID);
                dataOutputStream.writeShort(io.e - 1);
                dataOutputStream.writeUTF(Build.DEVICE);
                dataOutputStream.writeShort(io.f - 1);
                dataOutputStream.writeUTF(Build.PRODUCT);
                dataOutputStream.writeShort(io.g - 1);
                dataOutputStream.writeUTF(Build.VERSION.RELEASE);
                dataOutputStream.writeShort(this.e.size());
                for (iw iwVar : this.e) {
                    dataOutputStream.write(iwVar.a);
                }
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray2);
                dataOutputStream.writeInt((int) crc32.getValue());
                byteArray = byteArrayOutputStream.toByteArray();
                ma.a(dataOutputStream);
            }
            return byteArray;
        } catch (IOException e2) {
            e = e2;
            dataOutputStream2 = dataOutputStream;
            try {
                ko.a(6, a, "Error when generating report", e);
                throw e;
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                ma.a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            ma.a(dataOutputStream);
            throw th;
        }
    }
}
