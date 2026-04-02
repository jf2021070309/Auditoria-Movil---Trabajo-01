package com.flurry.sdk;

import com.flurry.sdk.lb;
import com.flurry.sdk.ld;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class lc {
    public static final Integer a = 50;
    private static final String d = lc.class.getSimpleName();
    String b;
    LinkedHashMap<String, List<String>> c;

    public lc(String str) {
        this.b = str + "Main";
        b(this.b);
    }

    private void b(String str) {
        this.c = new LinkedHashMap<>();
        ArrayList<String> arrayList = new ArrayList();
        if (c(str)) {
            List<String> d2 = d(str);
            if (d2 != null && d2.size() > 0) {
                arrayList.addAll(d2);
                for (String str2 : arrayList) {
                    e(str2);
                }
            }
            f(str);
        } else {
            List<ld> list = (List) new kh(ka.a().a.getFileStreamPath(g(this.b)), str, 1, new ll<List<ld>>() { // from class: com.flurry.sdk.lc.1
                @Override // com.flurry.sdk.ll
                public final li<List<ld>> a(int i) {
                    return new lh(new ld.a());
                }
            }).a();
            if (list == null) {
                ko.c(d, "New main file also not found. returning..");
                return;
            }
            for (ld ldVar : list) {
                arrayList.add(ldVar.a);
            }
        }
        for (String str3 : arrayList) {
            this.c.put(str3, h(str3));
        }
    }

    private synchronized boolean c(String str) {
        File fileStreamPath;
        fileStreamPath = ka.a().a.getFileStreamPath(".FlurrySenderIndex.info." + str);
        ko.a(5, d, "isOldIndexFilePresent: for " + str + fileStreamPath.exists());
        return fileStreamPath.exists();
    }

    private synchronized List<String> d(String str) {
        ArrayList arrayList;
        DataInputStream dataInputStream;
        Throwable th;
        int readUnsignedShort;
        ArrayList arrayList2 = null;
        synchronized (this) {
            ma.b();
            ko.a(5, d, "Reading Index File for " + str + " file name:" + ka.a().a.getFileStreamPath(".FlurrySenderIndex.info." + str));
            File fileStreamPath = ka.a().a.getFileStreamPath(".FlurrySenderIndex.info." + str);
            if (fileStreamPath.exists()) {
                ko.a(5, d, "Reading Index File for " + str + " Found file.");
                try {
                    dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                    try {
                        readUnsignedShort = dataInputStream.readUnsignedShort();
                    } catch (Throwable th2) {
                        arrayList = null;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    dataInputStream = null;
                    arrayList = null;
                    th = th3;
                }
                if (readUnsignedShort == 0) {
                    ma.a((Closeable) dataInputStream);
                } else {
                    arrayList = new ArrayList(readUnsignedShort);
                    for (int i = 0; i < readUnsignedShort; i++) {
                        try {
                            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                            ko.a(4, d, "read iter " + i + " dataLength = " + readUnsignedShort2);
                            byte[] bArr = new byte[readUnsignedShort2];
                            dataInputStream.readFully(bArr);
                            arrayList.add(new String(bArr));
                        } catch (Throwable th4) {
                            th = th4;
                            ko.a(6, d, "Error when loading persistent file", th);
                            ma.a((Closeable) dataInputStream);
                            arrayList2 = arrayList;
                            return arrayList2;
                        }
                    }
                    dataInputStream.readUnsignedShort();
                    ma.a((Closeable) dataInputStream);
                }
            } else {
                ko.a(5, d, "Agent cache file doesn't exist.");
                arrayList = null;
            }
            arrayList2 = arrayList;
        }
        return arrayList2;
    }

    private void e(String str) {
        List<String> d2 = d(str);
        if (d2 == null) {
            ko.c(d, "No old file to replace");
            return;
        }
        for (String str2 : d2) {
            byte[] i = i(str2);
            if (i == null) {
                ko.a(6, d, "File does not exist");
            } else {
                a(str2, i);
                ma.b();
                ko.a(5, d, "Deleting  block File for " + str2 + " file name:" + ka.a().a.getFileStreamPath(".flurrydatasenderblock." + str2));
                File fileStreamPath = ka.a().a.getFileStreamPath(".flurrydatasenderblock." + str2);
                if (fileStreamPath.exists()) {
                    ko.a(5, d, "Found file for " + str2 + ". Deleted - " + fileStreamPath.delete());
                }
            }
        }
        a(str, d2, ".YFlurrySenderIndex.info.");
        f(str);
    }

    private static void f(String str) {
        ma.b();
        ko.a(5, d, "Deleting Index File for " + str + " file name:" + ka.a().a.getFileStreamPath(".FlurrySenderIndex.info." + str));
        File fileStreamPath = ka.a().a.getFileStreamPath(".FlurrySenderIndex.info." + str);
        if (fileStreamPath.exists()) {
            ko.a(5, d, "Found file for " + str + ". Deleted - " + fileStreamPath.delete());
        }
    }

    private static String g(String str) {
        return ".YFlurrySenderIndex.info." + str;
    }

    private synchronized List<String> h(String str) {
        ArrayList arrayList;
        ma.b();
        ko.a(5, d, "Reading Index File for " + str + " file name:" + ka.a().a.getFileStreamPath(g(str)));
        arrayList = new ArrayList();
        for (ld ldVar : (List) new kh(ka.a().a.getFileStreamPath(g(str)), ".YFlurrySenderIndex.info.", 1, new ll<List<ld>>() { // from class: com.flurry.sdk.lc.2
            @Override // com.flurry.sdk.ll
            public final li<List<ld>> a(int i) {
                return new lh(new ld.a());
            }
        }).a()) {
            arrayList.add(ldVar.a);
        }
        return arrayList;
    }

    private static byte[] i(String str) {
        DataInputStream dataInputStream;
        byte[] bArr = null;
        ma.b();
        ko.a(5, d, "Reading block File for " + str + " file name:" + ka.a().a.getFileStreamPath(".flurrydatasenderblock." + str));
        File fileStreamPath = ka.a().a.getFileStreamPath(".flurrydatasenderblock." + str);
        if (fileStreamPath.exists()) {
            ko.a(5, d, "Reading Index File for " + str + " Found file.");
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                try {
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    if (readUnsignedShort != 0) {
                        bArr = new byte[readUnsignedShort];
                        dataInputStream.readFully(bArr);
                        dataInputStream.readUnsignedShort();
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        ko.a(6, d, "Error when loading persistent file", th);
                        return bArr;
                    } finally {
                        ma.a((Closeable) dataInputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
            }
        } else {
            ko.a(4, d, "Agent cache file doesn't exist.");
        }
        return bArr;
    }

    private synchronized void a(String str, byte[] bArr) {
        ma.b();
        ko.a(5, d, "Saving Block File for " + str + " file name:" + ka.a().a.getFileStreamPath(lb.a(str)));
        new kh(ka.a().a.getFileStreamPath(lb.a(str)), ".yflurrydatasenderblock.", 1, new ll<lb>() { // from class: com.flurry.sdk.lc.3
            @Override // com.flurry.sdk.ll
            public final li<lb> a(int i) {
                return new lb.a();
            }
        }).a(new lb(bArr));
    }

    private synchronized void a(String str, List<String> list, String str2) {
        ma.b();
        ko.a(5, d, "Saving Index File for " + str + " file name:" + ka.a().a.getFileStreamPath(g(str)));
        kh khVar = new kh(ka.a().a.getFileStreamPath(g(str)), str2, 1, new ll<List<ld>>() { // from class: com.flurry.sdk.lc.4
            @Override // com.flurry.sdk.ll
            public final li<List<ld>> a(int i) {
                return new lh(new ld.a());
            }
        });
        ArrayList arrayList = new ArrayList();
        for (String str3 : list) {
            arrayList.add(new ld(str3));
        }
        khVar.a(arrayList);
    }

    public final synchronized void a(lb lbVar, String str) {
        LinkedList linkedList;
        boolean z = false;
        synchronized (this) {
            ko.a(4, d, "addBlockInfo" + str);
            String str2 = lbVar.a;
            List<String> list = this.c.get(str);
            if (list == null) {
                ko.a(4, d, "New Data Key");
                linkedList = new LinkedList();
                z = true;
            } else {
                linkedList = list;
            }
            linkedList.add(str2);
            if (linkedList.size() > a.intValue()) {
                j(linkedList.get(0));
                linkedList.remove(0);
            }
            this.c.put(str, linkedList);
            a(str, linkedList, ".YFlurrySenderIndex.info.");
            if (z) {
                a();
            }
        }
    }

    private boolean j(String str) {
        return new kh(ka.a().a.getFileStreamPath(lb.a(str)), ".yflurrydatasenderblock.", 1, new ll<lb>() { // from class: com.flurry.sdk.lc.5
            @Override // com.flurry.sdk.ll
            public final li<lb> a(int i) {
                return new lb.a();
            }
        }).b();
    }

    private synchronized void a() {
        LinkedList linkedList = new LinkedList(this.c.keySet());
        new kh(ka.a().a.getFileStreamPath(g(this.b)), ".YFlurrySenderIndex.info.", 1, new ll<List<ld>>() { // from class: com.flurry.sdk.lc.6
            @Override // com.flurry.sdk.ll
            public final li<List<ld>> a(int i) {
                return new lh(new ld.a());
            }
        }).b();
        if (!linkedList.isEmpty()) {
            a(this.b, linkedList, this.b);
        }
    }

    public final boolean a(String str, String str2) {
        List<String> list = this.c.get(str2);
        boolean z = false;
        if (list != null) {
            j(str);
            z = list.remove(str);
        }
        if (list != null && !list.isEmpty()) {
            this.c.put(str2, list);
            a(str2, list, ".YFlurrySenderIndex.info.");
        } else {
            k(str2);
        }
        return z;
    }

    private synchronized boolean k(String str) {
        boolean b;
        ma.b();
        kh khVar = new kh(ka.a().a.getFileStreamPath(g(str)), ".YFlurrySenderIndex.info.", 1, new ll<List<ld>>() { // from class: com.flurry.sdk.lc.7
            @Override // com.flurry.sdk.ll
            public final li<List<ld>> a(int i) {
                return new lh(new ld.a());
            }
        });
        List<String> a2 = a(str);
        if (a2 != null) {
            ko.a(4, d, "discardOutdatedBlocksForDataKey: notSentBlocks = " + a2.size());
            for (String str2 : a2) {
                j(str2);
                ko.a(4, d, "discardOutdatedBlocksForDataKey: removed block = " + str2);
            }
        }
        this.c.remove(str);
        b = khVar.b();
        a();
        return b;
    }

    public final List<String> a(String str) {
        return this.c.get(str);
    }
}
