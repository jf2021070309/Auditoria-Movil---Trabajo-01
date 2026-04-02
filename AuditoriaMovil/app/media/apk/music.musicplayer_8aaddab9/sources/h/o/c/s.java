package h.o.c;
/* loaded from: classes2.dex */
public class s {
    public String a(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
