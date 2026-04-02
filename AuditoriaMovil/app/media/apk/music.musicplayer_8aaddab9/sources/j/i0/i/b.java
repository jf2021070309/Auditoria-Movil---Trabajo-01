package j.i0.i;
/* loaded from: classes2.dex */
public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int httpCode;

    b(int i2) {
        this.httpCode = i2;
    }

    public static b fromHttp2(int i2) {
        b[] values = values();
        for (int i3 = 0; i3 < 11; i3++) {
            b bVar = values[i3];
            if (bVar.httpCode == i2) {
                return bVar;
            }
        }
        return null;
    }
}
