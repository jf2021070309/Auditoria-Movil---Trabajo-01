package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public final class Objects {
    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }

    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        private final List<String> zzer;
        private final Object zzes;

        private ToStringHelper(Object obj) {
            this.zzes = Preconditions.checkNotNull(obj);
            this.zzer = new ArrayList();
        }

        public final ToStringHelper add(String str, Object obj) {
            List<String> list = this.zzer;
            String str2 = (String) Preconditions.checkNotNull(str);
            String valueOf = String.valueOf(obj);
            list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
            return this;
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(100).append(this.zzes.getClass().getSimpleName()).append('{');
            int size = this.zzer.size();
            for (int i = 0; i < size; i++) {
                append.append(this.zzer.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }
}
