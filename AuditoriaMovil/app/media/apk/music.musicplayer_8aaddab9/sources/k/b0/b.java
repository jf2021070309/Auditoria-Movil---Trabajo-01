package k.b0;

import h.o.c.j;
/* loaded from: classes2.dex */
public final class b {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c2) {
        boolean z = false;
        if ('0' <= c2 && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (!('a' <= c2 && c2 <= 'f')) {
            c3 = 'A';
            if ('A' <= c2 && c2 <= 'F') {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException(j.i("Unexpected hex digit: ", Character.valueOf(c2)));
            }
        }
        return (c2 - c3) + 10;
    }
}
