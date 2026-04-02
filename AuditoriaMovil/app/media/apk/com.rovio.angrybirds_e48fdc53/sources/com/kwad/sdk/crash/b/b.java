package com.kwad.sdk.crash.b;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public final class b {
    private Set<String> aAj = new HashSet();
    private Set<String> aAk = new HashSet();

    public final synchronized String[] ED() {
        Set<String> set;
        set = this.aAk;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public final synchronized String[] EP() {
        Set<String> set;
        set = this.aAj;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public final synchronized void a(String[] strArr, String[] strArr2) {
        if (strArr != null) {
            try {
                if (strArr.length > 0) {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            this.aAj.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            for (String str2 : strArr2) {
                if (!TextUtils.isEmpty(str2)) {
                    this.aAk.add(str2);
                }
            }
        }
    }
}
