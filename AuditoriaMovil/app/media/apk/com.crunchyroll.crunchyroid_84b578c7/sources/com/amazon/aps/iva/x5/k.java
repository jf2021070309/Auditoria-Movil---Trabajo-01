package com.amazon.aps.iva.x5;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.t5.a;
import com.amazon.aps.iva.t5.g0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: CachedContentIndex.java */
/* loaded from: classes.dex */
public final class k {
    public final HashMap<String, j> a = new HashMap<>();
    public final SparseArray<String> b = new SparseArray<>();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final c e;
    public c f;

    /* compiled from: CachedContentIndex.java */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public static final String[] e = {"id", "key", "metadata"};
        public final com.amazon.aps.iva.v5.b a;
        public final SparseArray<j> b = new SparseArray<>();
        public String c;
        public String d;

        public a(com.amazon.aps.iva.v5.b bVar) {
            this.a = bVar;
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final boolean a() throws com.amazon.aps.iva.v5.a {
            try {
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (com.amazon.aps.iva.v5.d.a(readableDatabase, 1, str) != -1) {
                    return true;
                }
                return false;
            } catch (SQLException e2) {
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void b(HashMap<String, j> hashMap) throws IOException {
            SparseArray<j> sparseArray = this.b;
            if (sparseArray.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    j valueAt = sparseArray.valueAt(i);
                    if (valueAt == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = this.d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        h(writableDatabase, valueAt);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void c(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = com.amazon.aps.iva.oa.a.a("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void d(j jVar, boolean z) {
            SparseArray<j> sparseArray = this.b;
            int i = jVar.a;
            if (z) {
                sparseArray.delete(i);
            } else {
                sparseArray.put(i, null);
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void delete() throws com.amazon.aps.iva.v5.a {
            com.amazon.aps.iva.v5.b bVar = this.a;
            String str = this.c;
            str.getClass();
            try {
                String concat = "ExoPlayerCacheIndex".concat(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                int i = com.amazon.aps.iva.v5.d.a;
                try {
                    if (g0.b0(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (SQLException e2) {
                    throw new com.amazon.aps.iva.v5.a(e2);
                }
            } catch (SQLException e3) {
                throw new com.amazon.aps.iva.v5.a(e3);
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void e(HashMap<String, j> hashMap) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                i(writableDatabase);
                for (j jVar : hashMap.values()) {
                    h(writableDatabase, jVar);
                }
                writableDatabase.setTransactionSuccessful();
                this.b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e2) {
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void f(j jVar) {
            this.b.put(jVar.a, jVar);
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) throws IOException {
            boolean z;
            com.amazon.aps.iva.v5.b bVar = this.a;
            if (this.b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            com.amazon.aps.iva.cq.b.C(z);
            try {
                SQLiteDatabase readableDatabase = bVar.getReadableDatabase();
                String str = this.c;
                str.getClass();
                if (com.amazon.aps.iva.v5.d.a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    i(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                }
                SQLiteDatabase readableDatabase2 = bVar.getReadableDatabase();
                String str2 = this.d;
                str2.getClass();
                Cursor query = readableDatabase2.query(str2, e, null, null, null, null, null);
                while (query.moveToNext()) {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new j(i, string, k.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                }
                query.close();
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new com.amazon.aps.iva.v5.a(e2);
            }
        }

        public final void h(SQLiteDatabase sQLiteDatabase, j jVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.b(jVar.e, new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(jVar.a));
            contentValues.put("key", jVar.b);
            contentValues.put("metadata", byteArray);
            String str = this.d;
            str.getClass();
            sQLiteDatabase.replaceOrThrow(str, null, contentValues);
        }

        public final void i(SQLiteDatabase sQLiteDatabase) throws com.amazon.aps.iva.v5.a {
            String str = this.c;
            str.getClass();
            com.amazon.aps.iva.v5.d.b(sQLiteDatabase, 1, str, 1);
            String str2 = this.d;
            str2.getClass();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }
    }

    /* compiled from: CachedContentIndex.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a() throws IOException;

        void b(HashMap<String, j> hashMap) throws IOException;

        void c(long j);

        void d(j jVar, boolean z);

        void delete() throws IOException;

        void e(HashMap<String, j> hashMap) throws IOException;

        void f(j jVar);

        void g(HashMap<String, j> hashMap, SparseArray<String> sparseArray) throws IOException;
    }

    public k(com.amazon.aps.iva.v5.b bVar, File file) {
        a aVar = new a(bVar);
        b bVar2 = new b(new File(file, "cached_content_index.exi"));
        this.e = aVar;
        this.f = bVar2;
    }

    public static n a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = g0.e;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(c0.a("Invalid value size: ", readInt2));
            }
        }
        return new n(hashMap);
    }

    public static void b(n nVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> entrySet = nVar.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry<String, byte[]> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public final j c(String str) {
        return this.a.get(str);
    }

    public final j d(String str) {
        int keyAt;
        HashMap<String, j> hashMap = this.a;
        j jVar = hashMap.get(str);
        if (jVar == null) {
            SparseArray<String> sparseArray = this.b;
            int size = sparseArray.size();
            int i = 0;
            if (size == 0) {
                keyAt = 0;
            } else {
                keyAt = sparseArray.keyAt(size - 1) + 1;
            }
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
            j jVar2 = new j(keyAt, str, n.c);
            hashMap.put(str, jVar2);
            sparseArray.put(keyAt, str);
            this.d.put(keyAt, true);
            this.e.f(jVar2);
            return jVar2;
        }
        return jVar;
    }

    public final void e(long j) throws IOException {
        c cVar;
        c cVar2 = this.e;
        cVar2.c(j);
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.c(j);
        }
        boolean a2 = cVar2.a();
        SparseArray<String> sparseArray = this.b;
        HashMap<String, j> hashMap = this.a;
        if (!a2 && (cVar = this.f) != null && cVar.a()) {
            this.f.g(hashMap, sparseArray);
            cVar2.e(hashMap);
        } else {
            cVar2.g(hashMap, sparseArray);
        }
        c cVar4 = this.f;
        if (cVar4 != null) {
            cVar4.delete();
            this.f = null;
        }
    }

    public final void f(String str) {
        HashMap<String, j> hashMap = this.a;
        j jVar = hashMap.get(str);
        if (jVar != null && jVar.c.isEmpty() && jVar.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = this.d;
            int i = jVar.a;
            boolean z = sparseBooleanArray.get(i);
            this.e.d(jVar, z);
            SparseArray<String> sparseArray = this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, null);
            this.c.put(i, true);
        }
    }

    public final void g() throws IOException {
        this.e.b(this.a);
        SparseBooleanArray sparseBooleanArray = this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.d.clear();
    }

    /* compiled from: CachedContentIndex.java */
    /* loaded from: classes.dex */
    public static class b implements c {
        public final boolean a = false;
        public final Cipher b = null;
        public final SecretKeySpec c = null;
        public final SecureRandom d = null;
        public final com.amazon.aps.iva.t5.a e;
        public boolean f;
        public p g;

        public b(File file) {
            this.e = new com.amazon.aps.iva.t5.a(file);
        }

        public static int h(j jVar, int i) {
            int hashCode = jVar.b.hashCode() + (jVar.a * 31);
            if (i < 2) {
                long a = l.a(jVar.e);
                return (hashCode * 31) + ((int) (a ^ (a >>> 32)));
            }
            return (hashCode * 31) + jVar.e.hashCode();
        }

        public static j i(int i, DataInputStream dataInputStream) throws IOException {
            n a;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                m mVar = new m();
                Long valueOf = Long.valueOf(readLong);
                HashMap hashMap = mVar.a;
                valueOf.getClass();
                hashMap.put("exo_len", valueOf);
                mVar.b.remove("exo_len");
                a = n.c.b(mVar);
            } else {
                a = k.a(dataInputStream);
            }
            return new j(readInt, readUTF, a);
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final boolean a() {
            com.amazon.aps.iva.t5.a aVar = this.e;
            if (!aVar.a.exists() && !aVar.b.exists()) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void b(HashMap<String, j> hashMap) throws IOException {
            if (!this.f) {
                return;
            }
            e(hashMap);
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void d(j jVar, boolean z) {
            this.f = true;
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void delete() {
            com.amazon.aps.iva.t5.a aVar = this.e;
            aVar.a.delete();
            aVar.b.delete();
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void e(HashMap<String, j> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            Cipher cipher = this.b;
            com.amazon.aps.iva.t5.a aVar = this.e;
            try {
                a.C0731a a = aVar.a();
                p pVar = this.g;
                if (pVar == null) {
                    this.g = new p(a);
                } else {
                    pVar.a(a);
                }
                p pVar2 = this.g;
                dataOutputStream = new DataOutputStream(pVar2);
                try {
                    dataOutputStream.writeInt(2);
                    boolean z = this.a;
                    dataOutputStream.writeInt(z ? 1 : 0);
                    if (z) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.d;
                        int i = g0.a;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            cipher.init(1, this.c, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(pVar2, cipher));
                        } catch (InvalidAlgorithmParameterException e) {
                            e = e;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(hashMap.size());
                    int i2 = 0;
                    for (j jVar : hashMap.values()) {
                        dataOutputStream.writeInt(jVar.a);
                        dataOutputStream.writeUTF(jVar.b);
                        k.b(jVar.e, dataOutputStream);
                        i2 += h(jVar, 2);
                    }
                    dataOutputStream.writeInt(i2);
                    dataOutputStream.close();
                    aVar.b.delete();
                    int i3 = g0.a;
                    this.f = false;
                } catch (Throwable th) {
                    th = th;
                    g0.g(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void f(j jVar) {
            this.f = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        @Override // com.amazon.aps.iva.x5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(java.util.HashMap<java.lang.String, com.amazon.aps.iva.x5.j> r13, android.util.SparseArray<java.lang.String> r14) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.x5.k.b.g(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // com.amazon.aps.iva.x5.k.c
        public final void c(long j) {
        }
    }
}
