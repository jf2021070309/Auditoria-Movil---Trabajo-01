package com.ironsource.sdk.controller;

import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class b {
    private int a = a.a;
    private ArrayList b = new ArrayList();
    private String c;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes2.dex */
    static final class a {
        public static final int a = 1;
        public static final int b = 2;
        private static final /* synthetic */ int[] c = {1, 2};
    }

    public b(String str) {
        this.c = str;
    }

    public final synchronized void a() {
        this.a = a.b;
    }

    public final synchronized void a(Runnable runnable) {
        if (this.a != a.b) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public final synchronized void b() {
        Object[] array = this.b.toArray();
        for (int i = 0; i < array.length; i++) {
            ((Runnable) array[i]).run();
            array[i] = null;
        }
        this.b.clear();
    }
}
