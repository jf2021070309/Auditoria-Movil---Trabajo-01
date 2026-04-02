package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;
/* loaded from: classes4.dex */
final class a<T> implements Converter<T, RequestBody> {
    private static final MediaType a = MediaType.parse("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final TypeAdapter<T> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Gson gson, TypeAdapter<T> typeAdapter) {
        this.c = gson;
        this.d = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public RequestBody convert(T t) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.c.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), b));
        this.d.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(a, buffer.readByteString());
    }
}
