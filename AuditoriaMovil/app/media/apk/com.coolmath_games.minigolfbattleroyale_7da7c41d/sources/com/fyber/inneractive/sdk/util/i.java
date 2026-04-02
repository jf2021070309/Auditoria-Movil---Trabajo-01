package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import com.fyber.inneractive.sdk.util.am;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
/* loaded from: classes.dex */
public final class i {
    Queue<am> a = new PriorityQueue();

    private static Uri a(String str) {
        try {
            return Uri.parse(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void a(am.a aVar, String str, List<String> list) {
        Uri a = a(str);
        if (a != null) {
            this.a.offer(new am(aVar, a, list));
        }
    }
}
