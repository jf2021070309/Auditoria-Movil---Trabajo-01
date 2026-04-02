package c.u.b;

import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
/* loaded from: classes.dex */
public class f0 {
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public a f2620b = new a();

    /* loaded from: classes.dex */
    public static class a {
        public int a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2621b;

        /* renamed from: c  reason: collision with root package name */
        public int f2622c;

        /* renamed from: d  reason: collision with root package name */
        public int f2623d;

        /* renamed from: e  reason: collision with root package name */
        public int f2624e;

        public boolean a() {
            int i2 = this.a;
            if ((i2 & 7) == 0 || (i2 & (b(this.f2623d, this.f2621b) << 0)) != 0) {
                int i3 = this.a;
                if ((i3 & SyslogConstants.LOG_ALERT) == 0 || (i3 & (b(this.f2623d, this.f2622c) << 4)) != 0) {
                    int i4 = this.a;
                    if ((i4 & 1792) == 0 || (i4 & (b(this.f2624e, this.f2621b) << 8)) != 0) {
                        int i5 = this.a;
                        return (i5 & 28672) == 0 || (i5 & (b(this.f2624e, this.f2622c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int b(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i2);

        int e(View view);
    }

    public f0(b bVar) {
        this.a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int b2 = this.a.b();
        int c2 = this.a.c();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View d2 = this.a.d(i2);
            int a2 = this.a.a(d2);
            int e2 = this.a.e(d2);
            a aVar = this.f2620b;
            aVar.f2621b = b2;
            aVar.f2622c = c2;
            aVar.f2623d = a2;
            aVar.f2624e = e2;
            if (i4 != 0) {
                aVar.a = 0;
                aVar.a = i4 | 0;
                if (aVar.a()) {
                    return d2;
                }
            }
            if (i5 != 0) {
                a aVar2 = this.f2620b;
                aVar2.a = 0;
                aVar2.a = i5 | 0;
                if (aVar2.a()) {
                    view = d2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        a aVar = this.f2620b;
        int b2 = this.a.b();
        int c2 = this.a.c();
        int a2 = this.a.a(view);
        int e2 = this.a.e(view);
        aVar.f2621b = b2;
        aVar.f2622c = c2;
        aVar.f2623d = a2;
        aVar.f2624e = e2;
        if (i2 != 0) {
            a aVar2 = this.f2620b;
            aVar2.a = 0;
            aVar2.a = 0 | i2;
            return aVar2.a();
        }
        return false;
    }
}
