package e.d.d.r;
/* loaded from: classes2.dex */
public interface f {

    /* loaded from: classes2.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        a(int i2) {
            this.code = i2;
        }

        public int getCode() {
            return this.code;
        }
    }

    a a(String str);
}
