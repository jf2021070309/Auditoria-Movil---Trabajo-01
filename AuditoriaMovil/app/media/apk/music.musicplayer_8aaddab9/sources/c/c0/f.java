package c.c0;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class f {
    public static final String a = r.e("Data");

    /* renamed from: b  reason: collision with root package name */
    public static final f f1599b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Object> f1600c;

    /* loaded from: classes.dex */
    public static final class a {
        public Map<String, Object> a = new HashMap();

        public f a() {
            f fVar = new f(this.a);
            f.c(fVar);
            return fVar;
        }

        public a b(String str, Object obj) {
            if (obj == null) {
                this.a.put(str, null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.a.put(str, obj);
                } else {
                    int i2 = 0;
                    if (cls == boolean[].class) {
                        Map<String, Object> map = this.a;
                        boolean[] zArr = (boolean[]) obj;
                        String str2 = f.a;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i2 < zArr.length) {
                            boolArr[i2] = Boolean.valueOf(zArr[i2]);
                            i2++;
                        }
                        map.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        Map<String, Object> map2 = this.a;
                        byte[] bArr = (byte[]) obj;
                        String str3 = f.a;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i2 < bArr.length) {
                            bArr2[i2] = Byte.valueOf(bArr[i2]);
                            i2++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        Map<String, Object> map3 = this.a;
                        int[] iArr = (int[]) obj;
                        String str4 = f.a;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i2 < iArr.length) {
                            numArr[i2] = Integer.valueOf(iArr[i2]);
                            i2++;
                        }
                        map3.put(str, numArr);
                    } else if (cls == long[].class) {
                        Map<String, Object> map4 = this.a;
                        long[] jArr = (long[]) obj;
                        String str5 = f.a;
                        Long[] lArr = new Long[jArr.length];
                        while (i2 < jArr.length) {
                            lArr[i2] = Long.valueOf(jArr[i2]);
                            i2++;
                        }
                        map4.put(str, lArr);
                    } else if (cls == float[].class) {
                        Map<String, Object> map5 = this.a;
                        float[] fArr = (float[]) obj;
                        String str6 = f.a;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i2 < fArr.length) {
                            fArr2[i2] = Float.valueOf(fArr[i2]);
                            i2++;
                        }
                        map5.put(str, fArr2);
                    } else if (cls != double[].class) {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                    } else {
                        Map<String, Object> map6 = this.a;
                        double[] dArr = (double[]) obj;
                        String str7 = f.a;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i2 < dArr.length) {
                            dArr2[i2] = Double.valueOf(dArr[i2]);
                            i2++;
                        }
                        map6.put(str, dArr2);
                    }
                }
            }
            return this;
        }

        public a c(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }
    }

    static {
        f fVar = new f(new HashMap());
        c(fVar);
        f1599b = fVar;
    }

    public f() {
    }

    public f(f fVar) {
        this.f1600c = new HashMap(fVar.f1600c);
    }

    public f(Map<String, ?> map) {
        this.f1600c = new HashMap(map);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:3|(2:4|5)|(5:7|8|(2:10|11)|13|14)|15|16|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        android.util.Log.e(c.c0.f.a, "Error in Data#fromByteArray: ", r7);
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c0.f a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L7f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = c.c0.f.a
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L60
        L39:
            r7 = move-exception
            goto L5b
        L3b:
            r7 = move-exception
            goto L66
        L3d:
            r7 = move-exception
            goto L49
        L3f:
            r7 = move-exception
            goto L49
        L41:
            r1 = move-exception
            goto L68
        L43:
            r3 = move-exception
            goto L46
        L45:
            r3 = move-exception
        L46:
            r6 = r3
            r3 = r7
            r7 = r6
        L49:
            java.lang.String r4 = c.c0.f.a     // Catch: java.lang.Throwable -> L3b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L54
            goto L35
        L54:
            r7 = move-exception
            java.lang.String r3 = c.c0.f.a
            android.util.Log.e(r3, r0, r7)
            goto L35
        L5b:
            java.lang.String r2 = c.c0.f.a
            android.util.Log.e(r2, r0, r7)
        L60:
            c.c0.f r7 = new c.c0.f
            r7.<init>(r1)
            return r7
        L66:
            r1 = r7
            r7 = r3
        L68:
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.io.IOException -> L6e
            goto L74
        L6e:
            r7 = move-exception
            java.lang.String r3 = c.c0.f.a
            android.util.Log.e(r3, r0, r7)
        L74:
            r2.close()     // Catch: java.io.IOException -> L78
            goto L7e
        L78:
            r7 = move-exception
            java.lang.String r2 = c.c0.f.a
            android.util.Log.e(r2, r0, r7)
        L7e:
            throw r1
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            goto L88
        L87:
            throw r7
        L88:
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.f.a(byte[]):c.c0.f");
    }

    public static byte[] c(f fVar) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            objectOutputStream.writeInt(fVar.f1600c.size());
            for (Map.Entry<String, Object> entry : fVar.f1600c.entrySet()) {
                objectOutputStream.writeUTF(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e3) {
                Log.e(a, "Error in Data#toByteArray: ", e3);
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                Log.e(a, "Error in Data#toByteArray: ", e4);
            }
            if (byteArrayOutputStream.size() <= 10240) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e5) {
            e = e5;
            objectOutputStream2 = objectOutputStream;
            Log.e(a, "Error in Data#toByteArray: ", e);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e6) {
                    Log.e(a, "Error in Data#toByteArray: ", e6);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                Log.e(a, "Error in Data#toByteArray: ", e7);
            }
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e8) {
                    Log.e(a, "Error in Data#toByteArray: ", e8);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e9) {
                Log.e(a, "Error in Data#toByteArray: ", e9);
            }
            throw th;
        }
    }

    public String b(String str) {
        Object obj = this.f1600c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        Set<String> keySet = this.f1600c.keySet();
        if (keySet.equals(fVar.f1600c.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.f1600c.get(str);
                Object obj3 = fVar.f1600c.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f1600c.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f1600c.isEmpty()) {
            for (String str : this.f1600c.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f1600c.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
