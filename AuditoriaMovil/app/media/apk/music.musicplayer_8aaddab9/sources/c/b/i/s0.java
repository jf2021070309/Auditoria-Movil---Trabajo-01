package c.b.i;

import ch.qos.logback.classic.Level;
/* loaded from: classes.dex */
public class s0 {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1230b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1231c = Level.ALL_INT;

    /* renamed from: d  reason: collision with root package name */
    public int f1232d = Level.ALL_INT;

    /* renamed from: e  reason: collision with root package name */
    public int f1233e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1234f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1235g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1236h = false;

    public void a(int i2, int i3) {
        this.f1231c = i2;
        this.f1232d = i3;
        this.f1236h = true;
        if (this.f1235g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1230b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1230b = i3;
        }
    }
}
