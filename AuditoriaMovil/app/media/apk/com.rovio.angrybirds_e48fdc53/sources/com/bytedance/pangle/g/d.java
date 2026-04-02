package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.os.Build;
import com.bytedance.pangle.g.c;
import com.kuaishou.weapon.p0.t;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;
/* loaded from: classes.dex */
public final class d {
    public static o a(String str) {
        RandomAccessFile randomAccessFile;
        int[] iArr;
        RandomAccessFile randomAccessFile2 = null;
        Signature[] signatureArr = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(str, t.k);
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    f.a(str, randomAccessFile, -262969152, 1896449818);
                    try {
                        m mVar = f.a.get(str).get(-262969152);
                        if (mVar != null) {
                            c.C0092c a = c.a(randomAccessFile, mVar);
                            Signature[] a2 = a(new Certificate[][]{a.a});
                            if (a.b != null) {
                                int size = a.b.a.size();
                                Signature[] signatureArr2 = new Signature[size];
                                iArr = new int[a.b.b.size()];
                                for (int i = 0; i < size; i++) {
                                    signatureArr2[i] = new Signature(a.b.a.get(i).getEncoded());
                                    iArr[i] = a.b.b.get(i).intValue();
                                }
                                signatureArr = signatureArr2;
                            } else {
                                iArr = null;
                            }
                            o oVar = new o(a2, 3, signatureArr, iArr);
                            try {
                                randomAccessFile.close();
                            } catch (Exception e) {
                            }
                            return oVar;
                        }
                        throw new n("findVerifiedSigner, No APK Signature Scheme v3 signature in package");
                    } catch (n e2) {
                        try {
                            try {
                                m mVar2 = f.a.get(str).get(1896449818);
                                if (mVar2 != null) {
                                    o oVar2 = new o(a(b.a(randomAccessFile, mVar2).a));
                                    try {
                                        randomAccessFile.close();
                                    } catch (Exception e3) {
                                    }
                                    return oVar2;
                                }
                                throw new n("findVerifiedSigner, No APK Signature Scheme v2 signature in package");
                            } catch (Exception e4) {
                                throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v2", e4);
                            }
                        } catch (n e5) {
                            o a3 = a.a(str);
                            try {
                                randomAccessFile.close();
                            } catch (Exception e6) {
                            }
                            return a3;
                        }
                    } catch (Exception e7) {
                        throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v3", e7);
                    }
                } catch (Exception e8) {
                    throw new q(4, "Failed to collect certificates from " + str + " when findSignatureInfo at once", e8);
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (Exception e9) {
                    }
                }
                throw th;
            }
        } catch (Exception e10) {
            throw new q(6, "failed to read apk file, minSignatureSchemeVersion : 1, apkPath : ".concat(String.valueOf(str)));
        }
    }

    public static Signature[] a(Certificate[][] certificateArr) {
        Signature[] signatureArr = new Signature[certificateArr.length];
        for (int i = 0; i < certificateArr.length; i++) {
            if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 28) {
                Constructor a = com.bytedance.pangle.b.b.a.a(Signature.class, Certificate[].class);
                if (a != null) {
                    a.setAccessible(true);
                }
                if (a != null && a.isAccessible()) {
                    try {
                        signatureArr[i] = (Signature) a.newInstance(certificateArr[i]);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InstantiationException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e3) {
                        e3.printStackTrace();
                    }
                }
            } else {
                signatureArr[i] = new Signature(certificateArr[i][0].getEncoded());
            }
        }
        return signatureArr;
    }
}
