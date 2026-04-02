package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.CallAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class c extends CallAdapter.Factory {
    final Executor a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Executor executor) {
        this.a = executor;
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter<?, ?> get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (getRawType(type) != Call.class) {
            return null;
        }
        final Type e = i.e(type);
        return new CallAdapter<Object, Call<?>>() { // from class: retrofit2.c.1
            @Override // retrofit2.CallAdapter
            public Type responseType() {
                return e;
            }

            @Override // retrofit2.CallAdapter
            /* renamed from: a */
            public Call<Object> adapt(Call<Object> call) {
                return new a(c.this.a, call);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Call<T> {
        final Executor a;
        final Call<T> b;

        a(Executor executor, Call<T> call) {
            this.a = executor;
            this.b = call;
        }

        @Override // retrofit2.Call
        public void enqueue(final Callback<T> callback) {
            if (callback == null) {
                throw new NullPointerException("callback == null");
            }
            this.b.enqueue(new Callback<T>() { // from class: retrofit2.c.a.1
                @Override // retrofit2.Callback
                public void onResponse(Call<T> call, final Response<T> response) {
                    a.this.a.execute(new Runnable() { // from class: retrofit2.c.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a.this.b.isCanceled()) {
                                callback.onFailure(a.this, new IOException("Canceled"));
                            } else {
                                callback.onResponse(a.this, response);
                            }
                        }
                    });
                }

                @Override // retrofit2.Callback
                public void onFailure(Call<T> call, final Throwable th) {
                    a.this.a.execute(new Runnable() { // from class: retrofit2.c.a.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            callback.onFailure(a.this, th);
                        }
                    });
                }
            });
        }

        @Override // retrofit2.Call
        public boolean isExecuted() {
            return this.b.isExecuted();
        }

        @Override // retrofit2.Call
        public Response<T> execute() {
            return this.b.execute();
        }

        @Override // retrofit2.Call
        public void cancel() {
            this.b.cancel();
        }

        @Override // retrofit2.Call
        public boolean isCanceled() {
            return this.b.isCanceled();
        }

        @Override // retrofit2.Call
        public Call<T> clone() {
            return new a(this.a, this.b.mo25clone());
        }

        @Override // retrofit2.Call
        public Request request() {
            return this.b.request();
        }
    }
}
