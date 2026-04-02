package com.bytedance.pangle.a;

import com.bytedance.pangle.d.e;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
public final class a {
    final CountDownLatch a;
    Throwable b;

    /* renamed from: com.bytedance.pangle.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0088a {
        void a();
    }

    private a(InterfaceC0088a[] interfaceC0088aArr) {
        this.a = new CountDownLatch(interfaceC0088aArr.length);
        for (final InterfaceC0088a interfaceC0088a : interfaceC0088aArr) {
            e.a(new Runnable() { // from class: com.bytedance.pangle.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        interfaceC0088a.a();
                    } catch (Throwable th) {
                        a.this.b = th;
                    }
                    a.this.a.countDown();
                }
            });
        }
    }

    public static void a(InterfaceC0088a... interfaceC0088aArr) {
        a aVar = new a(interfaceC0088aArr);
        try {
            aVar.a.await();
            Throwable th = aVar.b;
            if (th == null) {
                return;
            }
            throw th;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
