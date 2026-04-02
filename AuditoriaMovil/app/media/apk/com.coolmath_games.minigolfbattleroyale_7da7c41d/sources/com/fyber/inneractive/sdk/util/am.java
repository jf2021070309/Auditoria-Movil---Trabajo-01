package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;
/* loaded from: classes.dex */
public final class am implements Comparable<am> {
    Uri a;
    List<String> b;
    private a c;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(am amVar) {
        return this.c.c.compareTo(amVar.c.c);
    }

    public am(a aVar, Uri uri, List<String> list) {
        this.c = aVar;
        this.a = uri;
        this.b = list;
    }

    /* loaded from: classes.dex */
    public enum a {
        Primary(1),
        FallBack(2);
        
        Integer c;

        a(Integer num) {
            this.c = num;
        }
    }
}
