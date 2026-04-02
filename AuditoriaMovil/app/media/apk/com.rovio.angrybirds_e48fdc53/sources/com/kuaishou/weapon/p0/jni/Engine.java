package com.kuaishou.weapon.p0.jni;

import android.content.Context;
import android.text.TextUtils;
import com.kuaishou.weapon.p0.bo;
import com.kuaishou.weapon.p0.bp;
import com.kuaishou.weapon.p0.de;
import com.kuaishou.weapon.p0.h;
import java.lang.reflect.Member;
/* loaded from: classes.dex */
public class Engine {
    public static volatile String soPath;
    public static volatile String soVersion;
    private static volatile Engine instance = null;
    public static volatile boolean loadSuccess = false;
    public static volatile int loadSoCount = 0;

    public static native String abc();

    public static native String bcd();

    public static Engine getInstance(Context context) {
        if (!TextUtils.isEmpty(soVersion) && !loadSuccess && instance == null) {
            synchronized (Engine.class) {
                if (instance == null) {
                    instance = new Engine();
                }
                h a = h.a(context, "re_po_rt");
                if (!bo.a(context, bp.d + soVersion.replace(".", "") + ".so")) {
                    loadSuccess = false;
                    return instance;
                }
                String b = a.b(de.f, "");
                if (TextUtils.isEmpty(b)) {
                    b = soVersion;
                    a.c(de.f, b, false);
                }
                loadSoCount = a.c(de.ba);
                if (!TextUtils.equals(b, soVersion)) {
                    String str = soVersion;
                    loadSoCount = 0;
                    a.c(de.f, str, false);
                }
                if (loadSoCount + 1 < 10) {
                    loadSoCount++;
                    a.d(de.ba, loadSoCount);
                    System.loadLibrary(bp.d + soVersion.replace(".", ""));
                    bcd();
                    loadSoCount = 0;
                    loadSuccess = true;
                }
                a.d(de.ba, loadSoCount);
            }
        }
        return instance;
    }

    public static native int mmo(Member member, int i, int i2);

    public static native int mqc(Member member, int i);

    public static native int off();

    public static native String tao(int i, long j, Object obj);

    public native byte[] ac(byte[] bArr, byte[] bArr2);

    public native byte[] ar(byte[] bArr, byte[] bArr2);

    public native String cde();

    public native byte[] dc(byte[] bArr, byte[] bArr2);

    public native String def();

    public native byte[] dr(byte[] bArr, byte[] bArr2);

    public native String efg();

    public native String eopq(int i, int i2, int i3, String str);

    public native String fgh();

    public native String ghi();

    public native String hij();

    public native String klm(int i, String str);

    public native String nop();

    public native String pqr(int i, int i2, int i3, String str);

    public native String qrs();

    public native String stu(int i, int i2, int i3, int i4, String str);
}
