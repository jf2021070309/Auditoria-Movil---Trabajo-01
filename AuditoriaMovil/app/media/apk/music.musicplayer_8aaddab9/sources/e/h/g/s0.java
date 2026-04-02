package e.h.g;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import e.h.g.p1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
/* loaded from: classes.dex */
public class s0 {
    public static String a = "last_sync.txt";

    /* renamed from: c  reason: collision with root package name */
    public Context f8377c;

    /* renamed from: h  reason: collision with root package name */
    public File f8382h;

    /* renamed from: j  reason: collision with root package name */
    public r0 f8384j;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f8376b = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    public Date f8378d = new Date();

    /* renamed from: e  reason: collision with root package name */
    public DateFormat f8379e = DateFormat.getDateTimeInstance();

    /* renamed from: f  reason: collision with root package name */
    public String f8380f = "";

    /* renamed from: g  reason: collision with root package name */
    public a f8381g = new a();

    /* renamed from: i  reason: collision with root package name */
    public BufferedOutputStream f8383i = null;

    /* loaded from: classes2.dex */
    public class a extends v1 {
        public a() {
            super("lou");
        }

        @Override // e.h.g.v1
        public void b(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                s0.e(s0.this);
            } else if (i2 == 1) {
                s0.this.d((String) message.obj);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                Long l2 = (Long) message.obj;
                File file = s0.this.f8382h;
                if (file == null || !file.exists() || q0.q(s0.this.f8382h) <= l2.longValue()) {
                    return;
                }
                s0.e(s0.this);
            } else {
                try {
                    BufferedOutputStream bufferedOutputStream = s0.this.f8383i;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        s0.this.f8383i = null;
                    }
                    s0.this.f8382h = null;
                } catch (IOException unused) {
                } catch (Throwable th) {
                    d();
                    throw th;
                }
                d();
            }
        }
    }

    public s0(Context context, File file, boolean z) {
        this.f8377c = null;
        this.f8382h = null;
        r0 r0Var = new r0();
        r0Var.a(5000L);
        this.f8384j = r0Var;
        this.f8382h = file;
        this.f8377c = context;
        if (z) {
            b();
        }
    }

    public static File a(Context context, String str) {
        File c2 = j1.c();
        if (c2 == null) {
            p1.b c3 = p1.c(context, false);
            if (c3.d()) {
                c2 = new File(c3.b());
            } else if (!c3.e()) {
                return null;
            } else {
                c2 = new File(c3.c());
            }
        }
        return new File(c2 + str + a);
    }

    public static void e(s0 s0Var) {
        BufferedOutputStream bufferedOutputStream = s0Var.f8383i;
        if (bufferedOutputStream != null) {
            try {
                bufferedOutputStream.close();
            } catch (IOException unused) {
            }
        }
        File file = s0Var.f8382h;
        if (file == null) {
            File a2 = a(s0Var.f8377c, s0Var.f8380f);
            if (a2 != null && a2.exists()) {
                a2.delete();
            }
        } else {
            file.delete();
        }
        s0Var.f8383i = null;
    }

    public final void b() {
        this.f8381g.g(0);
    }

    public final boolean c() {
        if (this.f8382h == null) {
            File a2 = a(this.f8377c, this.f8380f);
            this.f8382h = a2;
            a2.getParentFile().mkdirs();
        }
        if (this.f8383i == null) {
            try {
                this.f8383i = new BufferedOutputStream(t0.b(this.f8382h, 1));
            } catch (Exception unused) {
                Log.e("JRTStudio", "Failed to create logging class. Is the SD card available?");
                return false;
            }
        }
        return true;
    }

    public final void d(String str) {
        if (c()) {
            try {
                this.f8378d.setTime(System.currentTimeMillis());
                this.f8376b.setLength(0);
                this.f8376b.append(this.f8379e.format(this.f8378d));
                this.f8376b.append(": ");
                this.f8376b.append(str);
                this.f8383i.write(this.f8376b.toString().getBytes());
                this.f8383i.write("\n".getBytes());
                if (this.f8384j.c() > 5) {
                    this.f8383i.flush();
                    this.f8384j.g();
                }
            } catch (Exception unused) {
            }
        }
    }

    public void f(long j2) {
        this.f8381g.f(this.f8381g.c(3, Long.valueOf(j2)));
    }

    public void g() {
        this.f8381g.g(2);
    }

    public void h() {
        try {
            this.f8383i.close();
            this.f8383i = null;
            this.f8382h = null;
        } catch (IOException unused) {
        } catch (Throwable th) {
            this.f8381g.d();
            this.f8381g = null;
            throw th;
        }
        this.f8381g.d();
        this.f8381g = null;
    }

    public void i(String str) {
        this.f8381g.c(1, str).sendToTarget();
    }
}
