package com.fyber.inneractive.sdk.player.c.k;

import java.util.ArrayList;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class p {
    public static final Comparator<a> a = new Comparator<a>() { // from class: com.fyber.inneractive.sdk.player.c.k.p.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.a - aVar2.a;
        }
    };
    public static final Comparator<a> b = new Comparator<a>() { // from class: com.fyber.inneractive.sdk.player.c.k.p.2
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(a aVar, a aVar2) {
            a aVar3 = aVar;
            a aVar4 = aVar2;
            if (aVar3.c < aVar4.c) {
                return -1;
            }
            return aVar4.c < aVar3.c ? 1 : 0;
        }
    };
    public int g;
    public int h;
    public int i;
    public final int c = 2000;
    public final a[] e = new a[5];
    public final ArrayList<a> d = new ArrayList<>();
    public int f = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public int b;
        public float c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
