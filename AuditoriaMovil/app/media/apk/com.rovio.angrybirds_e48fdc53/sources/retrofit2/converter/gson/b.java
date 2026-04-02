package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import okhttp3.ResponseBody;
import retrofit2.Converter;
/* loaded from: classes4.dex */
final class b<T> implements Converter<ResponseBody, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    @Override // retrofit2.Converter
    /* renamed from: a */
    public T convert(ResponseBody responseBody) {
        try {
            return this.b.read(this.a.newJsonReader(responseBody.charStream()));
        } finally {
            responseBody.close();
        }
    }
}
