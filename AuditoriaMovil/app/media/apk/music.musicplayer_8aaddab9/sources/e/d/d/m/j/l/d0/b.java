package e.d.d.m.j.l.d0;

import android.util.JsonReader;
import ch.qos.logback.core.joran.action.Action;
import e.d.d.m.j.l.d0.g;
import e.d.d.m.j.l.r;
import java.util.Objects;
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements g.a {
    public static final /* synthetic */ b a = new b();

    @Override // e.d.d.m.j.l.d0.g.a
    public final Object a(JsonReader jsonReader) {
        e.d.d.p.a aVar = g.a;
        r.b bVar = new r.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c2 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(Action.FILE_ATTRIBUTE)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    bVar.f7465d = Long.valueOf(jsonReader.nextLong());
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    Objects.requireNonNull(nextString, "Null symbol");
                    bVar.f7463b = nextString;
                    break;
                case 2:
                    bVar.a = Long.valueOf(jsonReader.nextLong());
                    break;
                case 3:
                    bVar.f7464c = jsonReader.nextString();
                    break;
                case 4:
                    bVar.f7466e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }
}
