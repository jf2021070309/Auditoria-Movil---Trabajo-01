package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_if122;

import android.content.Context;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class d extends c {
    private int i0;
    private int j0;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Context context, String str) {
        super(context, str);
        this.i0 = 0;
        this.j0 = -1;
    }

    private void k(int i) {
        Integer num;
        Map<Integer, List<k>> map;
        List<k> list;
        if (i > this.j0) {
            this.j0 = i;
            List<Integer> list2 = this.n;
            if (list2 == null || i >= list2.size() || (num = this.n.get(i)) == null || (map = this.e) == null || !map.containsKey(num) || (list = this.e.get(num)) == null) {
                return;
            }
            this.i0 = list.size() + this.i0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.f, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.e
    public void a(int i, boolean z) {
        try {
            k(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        super.a(i, z);
    }

    public int f0() {
        int i = this.i0;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c2) {
                    case '\\':
                        switch (c) {
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case ']':
                        while (true) {
                            switch (c) {
                                case '[':
                                case ']':
                                    break;
                                case '\\':
                                    break;
                                default:
                                    c = '[';
                            }
                        }
                        c2 = '^';
                        c = 'K';
                        break;
                    case '^':
                        if (c <= 4) {
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return i;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_try19.c
    public int h() {
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                if (c == '\\') {
                    switch (c2) {
                        case 21:
                            return 2;
                        case 22:
                        case 23:
                            c = ']';
                            c2 = ']';
                    }
                } else if (c != ']') {
                    c = ']';
                    c2 = ']';
                }
            }
            while (true) {
                switch (c2) {
                    case '[':
                        break;
                    case '\\':
                    case ']':
                        return 2;
                    default:
                        c2 = '[';
                }
            }
        }
    }
}
