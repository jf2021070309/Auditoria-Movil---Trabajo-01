package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;
/* loaded from: classes2.dex */
public abstract class mc implements Runnable {
    private static final String a = mc.class.getSimpleName();
    private PrintStream b;
    private PrintWriter c;

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable th) {
            if (this.b != null) {
                th.printStackTrace(this.b);
            } else if (this.c != null) {
                th.printStackTrace(this.c);
            } else {
                th.printStackTrace();
            }
            ko.a(6, a, "", th);
        }
    }
}
