package l.a.a.e;
/* loaded from: classes2.dex */
public class e {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Object f9671b;

    public e(int i2, Object obj) {
        this.a = 0;
        this.f9671b = null;
        this.a = i2;
        this.f9671b = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        switch (this.a) {
            case -1:
                stringBuffer.append("END OF FILE");
                break;
            case 0:
                stringBuffer.append("VALUE(");
                stringBuffer.append(this.f9671b);
                stringBuffer.append(")");
                break;
            case 1:
                stringBuffer.append("LEFT BRACE({)");
                break;
            case 2:
                stringBuffer.append("RIGHT BRACE(})");
                break;
            case 3:
                stringBuffer.append("LEFT SQUARE([)");
                break;
            case 4:
                stringBuffer.append("RIGHT SQUARE(])");
                break;
            case 5:
                stringBuffer.append("COMMA(,)");
                break;
            case 6:
                stringBuffer.append("COLON(:)");
                break;
        }
        return stringBuffer.toString();
    }
}
