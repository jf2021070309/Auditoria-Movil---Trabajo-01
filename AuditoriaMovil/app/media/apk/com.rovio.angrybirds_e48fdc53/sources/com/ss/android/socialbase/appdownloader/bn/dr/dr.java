package com.ss.android.socialbase.appdownloader.bn.dr;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
class dr implements ll {
    private int cu;
    private bn g;
    private g ge;
    private int il;
    private int ll;
    private int[] q;
    private boolean rb;
    private int t;
    private int v;
    private int wb;
    private int xu;
    private int[] yk;
    private boolean o = false;
    private C0305dr bn = new C0305dr();

    public dr() {
        rb();
    }

    public void dr(InputStream inputStream) {
        dr();
        if (inputStream != null) {
            this.ge = new g(inputStream, false);
        }
    }

    public void dr() {
        if (this.o) {
            this.o = false;
            this.ge.dr();
            this.ge = null;
            this.g = null;
            this.q = null;
            this.bn.dr();
            rb();
        }
    }

    public int ge() throws xu, IOException {
        if (this.ge == null) {
            throw new xu("Parser is not opened.", this, null);
        }
        try {
            xu();
            return this.xu;
        } catch (IOException e) {
            dr();
            throw e;
        }
    }

    @Override // com.ss.android.socialbase.appdownloader.bn.dr.rb
    public int o() {
        return this.ll;
    }

    @Override // com.ss.android.socialbase.appdownloader.bn.dr.rb
    public String g() {
        return "XML line #" + o();
    }

    public int q() {
        if (this.xu != 2) {
            return -1;
        }
        return this.yk.length / 5;
    }

    public String dr(int i) {
        int i2 = this.yk[q(i) + 1];
        return i2 == -1 ? "" : this.g.dr(i2);
    }

    public int ge(int i) {
        return this.yk[q(i) + 3];
    }

    public int o(int i) {
        return this.yk[q(i) + 4];
    }

    public String g(int i) {
        int q = q(i);
        int[] iArr = this.yk;
        if (iArr[q + 3] == 3) {
            return this.g.dr(iArr[q + 2]);
        }
        int i2 = iArr[q + 4];
        return "";
    }

    @Override // com.ss.android.socialbase.appdownloader.bn.dr.rb
    public int bn() {
        return -1;
    }

    private final int q(int i) {
        if (this.xu != 2) {
            throw new IndexOutOfBoundsException("Current event is not START_TAG.");
        }
        int i2 = i * 5;
        if (i2 >= this.yk.length) {
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i + ").");
        }
        return i2;
    }

    private final void rb() {
        this.xu = -1;
        this.ll = -1;
        this.wb = -1;
        this.t = -1;
        this.yk = null;
        this.cu = -1;
        this.v = -1;
        this.il = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x018e, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r5 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void xu() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.bn.dr.dr.xu():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.appdownloader.bn.dr.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0305dr {
        private int[] dr = new int[32];
        private int ge;
        private int o;

        public final void dr() {
            this.ge = 0;
            this.o = 0;
        }

        public final int ge() {
            int i = this.ge;
            if (i == 0) {
                return 0;
            }
            return this.dr[i - 1];
        }

        public final void dr(int i, int i2) {
            if (this.o == 0) {
                q();
            }
            dr(2);
            int i3 = this.ge;
            int i4 = i3 - 1;
            int[] iArr = this.dr;
            int i5 = iArr[i4];
            int i6 = i5 + 1;
            iArr[(i4 - 1) - (i5 * 2)] = i6;
            iArr[i4] = i;
            iArr[i4 + 1] = i2;
            iArr[i4 + 2] = i6;
            this.ge = i3 + 2;
        }

        public final boolean o() {
            int i;
            int[] iArr;
            int i2;
            int i3 = this.ge;
            if (i3 == 0 || (i2 = (iArr = this.dr)[i3 - 1]) == 0) {
                return false;
            }
            int i4 = i2 - 1;
            int i5 = i - 2;
            iArr[i5] = i4;
            iArr[i5 - ((i4 * 2) + 1)] = i4;
            this.ge = i3 - 2;
            return true;
        }

        public final int g() {
            return this.o;
        }

        public final void q() {
            dr(2);
            int i = this.ge;
            int[] iArr = this.dr;
            iArr[i] = 0;
            iArr[i + 1] = 0;
            this.ge = i + 2;
            this.o++;
        }

        public final void bn() {
            int i = this.ge;
            if (i != 0) {
                int i2 = i - 1;
                int i3 = this.dr[i2] * 2;
                if ((i2 - 1) - i3 != 0) {
                    this.ge = i - (i3 + 2);
                    this.o--;
                }
            }
        }

        private void dr(int i) {
            int[] iArr = this.dr;
            int length = iArr.length;
            int i2 = this.ge;
            int i3 = length - i2;
            if (i3 <= i) {
                int[] iArr2 = new int[(iArr.length + i3) * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                this.dr = iArr2;
            }
        }
    }
}
