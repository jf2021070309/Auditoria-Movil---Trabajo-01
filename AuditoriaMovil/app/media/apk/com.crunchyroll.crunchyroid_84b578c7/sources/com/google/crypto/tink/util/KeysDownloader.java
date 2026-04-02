package com.google.crypto.tink.util;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.binary.Hex;
import org.joda.time.Instant;
/* loaded from: classes4.dex */
public class KeysDownloader {
    private final Executor backgroundExecutor;
    private long cacheExpirationDurationInMillis;
    private String cachedData;
    private long cachedTimeInMillis;
    private final Object fetchDataLock;
    private final HttpTransport httpTransport;
    private final Object instanceStateLock;
    private Runnable pendingRefreshRunnable;
    private final String url;
    private static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);
    private static final NetHttpTransport DEFAULT_HTTP_TRANSPORT = new NetHttpTransport.Builder().build();
    private static final Executor DEFAULT_BACKGROUND_EXECUTOR = Executors.newCachedThreadPool();
    private static final Pattern MAX_AGE_PATTERN = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* loaded from: classes4.dex */
    public static class Builder {
        private String url;
        private HttpTransport httpTransport = KeysDownloader.DEFAULT_HTTP_TRANSPORT;
        private Executor executor = KeysDownloader.DEFAULT_BACKGROUND_EXECUTOR;

        public KeysDownloader build() {
            if (this.url != null) {
                return new KeysDownloader(this.executor, this.httpTransport, this.url);
            }
            throw new IllegalArgumentException("must provide a url with {#setUrl}");
        }

        @CanIgnoreReturnValue
        public Builder setExecutor(Executor executor) {
            this.executor = executor;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransport(HttpTransport httpTransport) {
            this.httpTransport = httpTransport;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUrl(String str) {
            this.url = str;
            return this;
        }
    }

    public KeysDownloader(Executor executor, HttpTransport httpTransport, String str) {
        validate(str);
        this.backgroundExecutor = executor;
        this.httpTransport = httpTransport;
        this.instanceStateLock = new Object();
        this.fetchDataLock = new Object();
        this.url = str;
        this.cachedTimeInMillis = Long.MIN_VALUE;
        this.cacheExpirationDurationInMillis = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public String fetchAndCacheData() throws IOException {
        long currentTimeInMillis = getCurrentTimeInMillis();
        HttpResponse execute = this.httpTransport.createRequestFactory().buildGetRequest(new GenericUrl(this.url)).execute();
        if (execute.getStatusCode() == 200) {
            InputStream content = execute.getContent();
            try {
                String readerToString = readerToString(new InputStreamReader(content, UTF_8));
                content.close();
                synchronized (this.instanceStateLock) {
                    this.cachedTimeInMillis = currentTimeInMillis;
                    this.cacheExpirationDurationInMillis = getExpirationDurationInSeconds(execute.getHeaders()) * 1000;
                    this.cachedData = readerToString;
                }
                return readerToString;
            } catch (Throwable th) {
                content.close();
                throw th;
            }
        }
        throw new IOException("Unexpected status code = " + execute.getStatusCode());
    }

    private boolean hasNonExpiredDataCached() {
        boolean z;
        boolean z2;
        long currentTimeInMillis = getCurrentTimeInMillis();
        long j = this.cachedTimeInMillis;
        if (j > currentTimeInMillis) {
            z = true;
        } else {
            z = false;
        }
        if (j + this.cacheExpirationDurationInMillis <= currentTimeInMillis) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && !z) {
            return true;
        }
        return false;
    }

    private Runnable newRefreshRunnable() {
        return new Runnable() { // from class: com.google.crypto.tink.util.KeysDownloader.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (KeysDownloader.this.fetchDataLock) {
                    try {
                        KeysDownloader.this.fetchAndCacheData();
                        synchronized (KeysDownloader.this.instanceStateLock) {
                            if (KeysDownloader.this.pendingRefreshRunnable == this) {
                                KeysDownloader.this.pendingRefreshRunnable = null;
                            }
                        }
                    } catch (IOException unused) {
                        synchronized (KeysDownloader.this.instanceStateLock) {
                            if (KeysDownloader.this.pendingRefreshRunnable == this) {
                                KeysDownloader.this.pendingRefreshRunnable = null;
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (KeysDownloader.this.instanceStateLock) {
                            if (KeysDownloader.this.pendingRefreshRunnable == this) {
                                KeysDownloader.this.pendingRefreshRunnable = null;
                            }
                            throw th;
                        }
                    }
                }
            }
        };
    }

    private static String readerToString(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return sb.toString();
            }
        }
    }

    private boolean shouldProactivelyRefreshDataInBackground() {
        if ((this.cacheExpirationDurationInMillis / 2) + this.cachedTimeInMillis <= getCurrentTimeInMillis()) {
            return true;
        }
        return false;
    }

    private static void validate(String str) {
        try {
            if (new URL(str).getProtocol().toLowerCase(Locale.US).equals("https")) {
                return;
            }
            throw new IllegalArgumentException("url must point to a HTTPS server");
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public String download() throws IOException {
        synchronized (this.instanceStateLock) {
            if (hasNonExpiredDataCached()) {
                if (shouldProactivelyRefreshDataInBackground()) {
                    refreshInBackground();
                }
                return this.cachedData;
            }
            synchronized (this.fetchDataLock) {
                synchronized (this.instanceStateLock) {
                    if (hasNonExpiredDataCached()) {
                        return this.cachedData;
                    }
                    return fetchAndCacheData();
                }
            }
        }
    }

    public long getCurrentTimeInMillis() {
        return Instant.now().getMillis();
    }

    public long getExpirationDurationInSeconds(HttpHeaders httpHeaders) {
        long j;
        if (httpHeaders.getCacheControl() != null) {
            for (String str : httpHeaders.getCacheControl().split(",")) {
                Matcher matcher = MAX_AGE_PATTERN.matcher(str);
                if (matcher.matches()) {
                    j = Long.valueOf(matcher.group(1)).longValue();
                    break;
                }
            }
        }
        j = 0;
        if (httpHeaders.getAge() != null) {
            j -= httpHeaders.getAge().longValue();
        }
        return Math.max(0L, j);
    }

    public HttpTransport getHttpTransport() {
        return this.httpTransport;
    }

    public String getUrl() {
        return this.url;
    }

    public void refreshInBackground() {
        Runnable newRefreshRunnable = newRefreshRunnable();
        synchronized (this.instanceStateLock) {
            if (this.pendingRefreshRunnable != null) {
                return;
            }
            this.pendingRefreshRunnable = newRefreshRunnable;
            try {
                this.backgroundExecutor.execute(newRefreshRunnable);
            } catch (Throwable th) {
                synchronized (this.instanceStateLock) {
                    if (this.pendingRefreshRunnable == newRefreshRunnable) {
                        this.pendingRefreshRunnable = null;
                    }
                    throw th;
                }
            }
        }
    }
}
