package com.amazon.aps.iva.t8;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.subtle.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: EncryptedSharedPreferences.java */
/* loaded from: classes.dex */
public final class a implements SharedPreferences {
    public final SharedPreferences a;
    public final Aead d;
    public final DeterministicAead e;
    public final String c = "rt_store_secure";
    public final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> b = new CopyOnWriteArrayList<>();

    /* compiled from: EncryptedSharedPreferences.java */
    /* renamed from: com.amazon.aps.iva.t8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0736a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* loaded from: classes.dex */
    public static final class b implements SharedPreferences.Editor {
        public final a a;
        public final SharedPreferences.Editor b;
        public final AtomicBoolean d = new AtomicBoolean(false);
        public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

        public b(a aVar, SharedPreferences.Editor editor) {
            this.a = aVar;
            this.b = editor;
        }

        public final void a() {
            if (this.d.getAndSet(false)) {
                a aVar = this.a;
                for (String str : ((HashMap) aVar.getAll()).keySet()) {
                    if (!this.c.contains(str) && !a.c(str)) {
                        this.b.remove(aVar.a(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            a();
            this.b.apply();
            b();
            this.c.clear();
        }

        public final void b() {
            a aVar = this.a;
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = aVar.b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator it2 = this.c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(aVar, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            a aVar = this.a;
            aVar.getClass();
            if (!a.c(str)) {
                this.c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    String a = aVar.a(str);
                    Pair pair = new Pair(a, Base64.encode(aVar.d.encrypt(bArr, a.getBytes(StandardCharsets.UTF_8))));
                    this.b.putString((String) pair.first, (String) pair.second);
                    return;
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not encrypt data: " + e.getMessage(), e);
                }
            }
            throw new SecurityException(com.amazon.aps.iva.c80.a.f(str, " is a reserved key for the encryption keyset."));
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            a();
            try {
                return this.b.commit();
            } finally {
                b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.getId());
            allocate.put(z ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.getId());
            allocate.putFloat(f);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.getId());
            allocate.putInt(i);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.getId());
            allocate.putLong(j);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.getId());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new com.amazon.aps.iva.x.b<>();
                set.add("__NULL__");
            }
            ArrayList arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            for (String str2 : set) {
                byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.getId());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr = (byte[]) it.next();
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final SharedPreferences.Editor remove(String str) {
            a aVar = this.a;
            aVar.getClass();
            if (!a.c(str)) {
                this.b.remove(aVar.a(str));
                this.c.add(str);
                return this;
            }
            throw new SecurityException(com.amazon.aps.iva.c80.a.f(str, " is a reserved key for the encryption keyset."));
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        private final int mId;

        c(int i) {
            this.mId = i;
        }

        public static c fromId(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    return null;
                                }
                                return BOOLEAN;
                            }
                            return FLOAT;
                        }
                        return LONG;
                    }
                    return INT;
                }
                return STRING_SET;
            }
            return STRING;
        }

        public int getId() {
            return this.mId;
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");
        
        private final String mDeterministicAeadKeyTemplateName;

        d(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        public KeyTemplate getKeyTemplate() throws GeneralSecurityException {
            return KeyTemplates.get(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* compiled from: EncryptedSharedPreferences.java */
    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");
        
        private final String mAeadKeyTemplateName;

        e(String str) {
            this.mAeadKeyTemplateName = str;
        }

        public KeyTemplate getKeyTemplate() throws GeneralSecurityException {
            return KeyTemplates.get(this.mAeadKeyTemplateName);
        }
    }

    public a(SharedPreferences sharedPreferences, Aead aead, DeterministicAead deterministicAead) {
        this.a = sharedPreferences;
        this.d = aead;
        this.e = deterministicAead;
    }

    public static boolean c(String str) {
        if (!"__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) && !"__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str)) {
            return false;
        }
        return true;
    }

    public final String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return Base64.encode(this.e.encryptDeterministically(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    public final Object b(String str) throws SecurityException {
        if (!c(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a = a(str);
                String string = this.a.getString(a, null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.d.decrypt(Base64.decode(string, 0), a.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int i = wrap.getInt();
                c fromId = c.fromId(i);
                if (fromId != null) {
                    switch (C0736a.a[fromId.ordinal()]) {
                        case 1:
                            int i2 = wrap.getInt();
                            ByteBuffer slice = wrap.slice();
                            wrap.limit(i2);
                            String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                            if (charBuffer.equals("__NULL__")) {
                                return null;
                            }
                            return charBuffer;
                        case 2:
                            return Integer.valueOf(wrap.getInt());
                        case 3:
                            return Long.valueOf(wrap.getLong());
                        case 4:
                            return Float.valueOf(wrap.getFloat());
                        case 5:
                            if (wrap.get() != 0) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        case 6:
                            com.amazon.aps.iva.x.b bVar = new com.amazon.aps.iva.x.b();
                            while (wrap.hasRemaining()) {
                                int i3 = wrap.getInt();
                                ByteBuffer slice2 = wrap.slice();
                                slice2.limit(i3);
                                wrap.position(wrap.position() + i3);
                                bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                            }
                            if (bVar.d == 1 && "__NULL__".equals(bVar.c[0])) {
                                return null;
                            }
                            return bVar;
                        default:
                            throw new SecurityException("Unhandled type for encrypted pref value: " + fromId);
                    }
                }
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i);
            } catch (GeneralSecurityException e2) {
                throw new SecurityException("Could not decrypt value. " + e2.getMessage(), e2);
            }
        }
        throw new SecurityException(com.amazon.aps.iva.c80.a.f(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        if (!c(str)) {
            return this.a.contains(a(str));
        }
        throw new SecurityException(com.amazon.aps.iva.c80.a.f(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new b(this, this.a.edit());
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.a.getAll().entrySet()) {
            if (!c(entry.getKey())) {
                try {
                    String str = new String(this.e.decryptDeterministically(Base64.decode(entry.getKey(), 0), this.c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not decrypt key. " + e2.getMessage(), e2);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        Object b2 = b(str);
        if (b2 instanceof Boolean) {
            return ((Boolean) b2).booleanValue();
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        Object b2 = b(str);
        if (b2 instanceof Float) {
            return ((Float) b2).floatValue();
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        Object b2 = b(str);
        if (b2 instanceof Integer) {
            return ((Integer) b2).intValue();
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        Object b2 = b(str);
        if (b2 instanceof Long) {
            return ((Long) b2).longValue();
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        Object b2 = b(str);
        if (b2 instanceof String) {
            return (String) b2;
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> bVar;
        Object b2 = b(str);
        if (b2 instanceof Set) {
            bVar = (Set) b2;
        } else {
            bVar = new com.amazon.aps.iva.x.b<>();
        }
        if (bVar.size() > 0) {
            return bVar;
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.remove(onSharedPreferenceChangeListener);
    }
}
