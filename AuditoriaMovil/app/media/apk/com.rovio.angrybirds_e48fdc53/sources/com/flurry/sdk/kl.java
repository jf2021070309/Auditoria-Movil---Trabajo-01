package com.flurry.sdk;

import java.util.Comparator;
/* loaded from: classes2.dex */
public class kl implements Comparator<Runnable> {
    private static final String a = kl.class.getSimpleName();

    @Override // java.util.Comparator
    public /* synthetic */ int compare(Runnable runnable, Runnable runnable2) {
        int a2 = a(runnable);
        int a3 = a(runnable2);
        if (a2 < a3) {
            return -1;
        }
        if (a2 > a3) {
            return 1;
        }
        return 0;
    }

    private static int a(Runnable runnable) {
        int i;
        if (runnable == null) {
            return Integer.MAX_VALUE;
        }
        if (runnable instanceof km) {
            md mdVar = (md) ((km) runnable).a();
            if (mdVar == null) {
                i = Integer.MAX_VALUE;
            } else {
                i = mdVar.u;
            }
            return i;
        } else if (!(runnable instanceof md)) {
            ko.a(6, a, "Unknown runnable class: " + runnable.getClass().getName());
            return Integer.MAX_VALUE;
        } else {
            return ((md) runnable).u;
        }
    }
}
