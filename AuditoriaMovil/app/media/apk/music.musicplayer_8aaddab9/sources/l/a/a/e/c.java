package l.a.a.e;
/* loaded from: classes2.dex */
public class c extends Exception {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int f9656b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9657c;

    public c(int i2, int i3, Object obj) {
        this.f9656b = i2;
        this.a = i3;
        this.f9657c = obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = this.a;
        if (i2 == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.f9657c);
            stringBuffer.append(") at position ");
            stringBuffer.append(this.f9656b);
            stringBuffer.append(".");
        } else if (i2 == 1) {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.f9657c);
            stringBuffer.append(" at position ");
            stringBuffer.append(this.f9656b);
            stringBuffer.append(".");
        } else if (i2 != 2) {
            stringBuffer.append("Unkown error at position ");
            stringBuffer.append(this.f9656b);
            stringBuffer.append(".");
        } else {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.f9656b);
            stringBuffer.append(": ");
            stringBuffer.append(this.f9657c);
        }
        return stringBuffer.toString();
    }
}
