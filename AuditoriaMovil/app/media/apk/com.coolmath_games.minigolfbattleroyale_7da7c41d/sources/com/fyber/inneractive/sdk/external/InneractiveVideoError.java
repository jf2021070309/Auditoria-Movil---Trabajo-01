package com.fyber.inneractive.sdk.external;
/* loaded from: classes.dex */
public class InneractiveVideoError extends InneractiveError {
    private final Error a;
    private Throwable b;

    public InneractiveVideoError(Error error) {
        this.a = error;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.b = th;
    }

    public Error getPlayerError() {
        return this.a;
    }

    public Throwable getCause() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveError
    public String description() {
        if (this.b != null) {
            return this.a.getErrorString() + ": " + this.b;
        }
        return this.a.getErrorString();
    }

    /* loaded from: classes.dex */
    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        
        private String a;
        private boolean b;

        Error(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String getErrorString() {
            return this.a;
        }

        public final boolean isFatal() {
            return this.b;
        }
    }
}
