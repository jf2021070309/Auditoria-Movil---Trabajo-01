package com.fyber.inneractive.sdk.player.c.j.a;

import android.util.Log;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.c.j.a.a;
import com.fyber.inneractive.sdk.player.c.k.o;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
final class i {
    final com.fyber.inneractive.sdk.player.c.k.b c;
    boolean d;
    private o g;
    private final Cipher e = null;
    private final SecretKeySpec f = null;
    final HashMap<String, h> a = new HashMap<>();
    final SparseArray<String> b = new SparseArray<>();

    public i(File file) {
        this.c = new com.fyber.inneractive.sdk.player.c.k.b(new File(file, "cached_content_index.exi"));
    }

    public final void a() throws a.C0064a {
        DataOutputStream dataOutputStream;
        if (this.d) {
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    OutputStream a = this.c.a();
                    if (this.g == null) {
                        this.g = new o(a);
                    } else {
                        this.g.a(a);
                    }
                    dataOutputStream = new DataOutputStream(this.g);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                dataOutputStream.writeInt(1);
                dataOutputStream.writeInt(this.e != null ? 1 : 0);
                if (this.e != null) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.e.init(1, this.f, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        dataOutputStream = new DataOutputStream(new CipherOutputStream(this.g, this.e));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.a.size());
                int i = 0;
                for (h hVar : this.a.values()) {
                    dataOutputStream.writeInt(hVar.a);
                    dataOutputStream.writeUTF(hVar.b);
                    dataOutputStream.writeLong(hVar.d);
                    i += hVar.a();
                }
                dataOutputStream.writeInt(i);
                com.fyber.inneractive.sdk.player.c.k.b bVar = this.c;
                dataOutputStream.close();
                bVar.b.delete();
                t.a((Closeable) null);
                this.d = false;
            } catch (IOException e4) {
                e = e4;
                throw new a.C0064a(e);
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream2 = dataOutputStream;
                t.a(dataOutputStream2);
                throw th;
            }
        }
    }

    public final h a(String str) {
        h hVar = this.a.get(str);
        return hVar == null ? a(str, -1L) : hVar;
    }

    public final h b(String str) {
        return this.a.get(str);
    }

    public final int c(String str) {
        return a(str).a;
    }

    public final void d(String str) {
        h remove = this.a.remove(str);
        if (remove != null) {
            com.fyber.inneractive.sdk.player.c.k.a.b(remove.c.isEmpty());
            this.b.remove(remove.a);
            this.d = true;
        }
    }

    public final void b() {
        LinkedList linkedList = new LinkedList();
        for (h hVar : this.a.values()) {
            if (hVar.c.isEmpty()) {
                linkedList.add(hVar.b);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            d((String) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            try {
                com.fyber.inneractive.sdk.player.c.k.b bVar = this.c;
                if (bVar.b.exists()) {
                    bVar.a.delete();
                    bVar.b.renameTo(bVar.a);
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(bVar.a));
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (Throwable th) {
                th = th;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException e) {
            e = e;
        }
        try {
            if (dataInputStream.readInt() != 1) {
                t.a(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) == 0) {
                if (this.e != null) {
                    this.d = true;
                }
                dataInputStream2 = dataInputStream;
            } else if (this.e == null) {
                t.a(dataInputStream);
                return false;
            } else {
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.e.init(2, this.f, new IvParameterSpec(bArr));
                    dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.e));
                } catch (InvalidAlgorithmParameterException e2) {
                    e = e2;
                    throw new IllegalStateException(e);
                } catch (InvalidKeyException e3) {
                    e = e3;
                    throw new IllegalStateException(e);
                }
            }
            int readInt = dataInputStream2.readInt();
            int i = 0;
            for (int i2 = 0; i2 < readInt; i2++) {
                h hVar = new h(dataInputStream2);
                a(hVar);
                i += hVar.a();
            }
            if (dataInputStream2.readInt() != i) {
                t.a(dataInputStream2);
                return false;
            }
            t.a(dataInputStream2);
            return true;
        } catch (FileNotFoundException unused2) {
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                t.a(dataInputStream2);
            }
            return false;
        } catch (IOException e4) {
            e = e4;
            dataInputStream2 = dataInputStream;
            Log.e("CachedContentIndex", "Error reading cache content index file.", e);
            if (dataInputStream2 != null) {
                t.a(dataInputStream2);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            if (dataInputStream2 != null) {
                t.a(dataInputStream2);
            }
            throw th;
        }
    }

    private void a(h hVar) {
        this.a.put(hVar.b, hVar);
        this.b.put(hVar.a, hVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h a(String str, long j) {
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        h hVar = new h(keyAt, str, j);
        a(hVar);
        this.d = true;
        return hVar;
    }
}
