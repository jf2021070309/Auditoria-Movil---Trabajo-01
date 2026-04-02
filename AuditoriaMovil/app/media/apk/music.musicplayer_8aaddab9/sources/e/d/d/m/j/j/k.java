package e.d.d.m.j.j;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class k {
    public static final AtomicLong a = new AtomicLong(0);

    /* renamed from: b  reason: collision with root package name */
    public static String f7183b;

    public k(i0 i0Var) {
        long time = new Date().getTime();
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) (time / 1000));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte[] a2 = a(time % 1000);
        byte[] a3 = a(a.incrementAndGet());
        byte[] a4 = a(Integer.valueOf(Process.myPid()).shortValue());
        byte[] bArr = {array[0], array[1], array[2], array[3], a2[0], a2[1], a3[0], a3[1], a4[0], a4[1]};
        String m2 = l.m(i0Var.c());
        String j2 = l.j(bArr);
        Locale locale = Locale.US;
        f7183b = String.format(locale, "%s%s%s%s", j2.substring(0, 12), j2.substring(12, 16), j2.subSequence(16, 20), m2.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j2);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public String toString() {
        return f7183b;
    }
}
