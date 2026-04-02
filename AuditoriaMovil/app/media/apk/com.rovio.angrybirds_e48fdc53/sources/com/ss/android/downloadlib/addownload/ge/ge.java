package com.ss.android.downloadlib.addownload.ge;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ge {
    public String bn;
    public long dr;
    public String g;
    public long ge;
    public String ll;
    public String o;
    public String q;
    public String rb;
    public final List<Pair<String, String>> xu = new ArrayList();

    public long dr() {
        return dr(this.dr, this.ge);
    }

    public static long dr(long j, long j2) {
        return j > 0 ? j : j2;
    }
}
