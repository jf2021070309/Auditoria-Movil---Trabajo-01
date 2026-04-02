package okhttp3.internal.cache2;

import com.amazon.aps.iva.ef0.d0;
import com.amazon.aps.iva.ef0.e;
import com.amazon.aps.iva.ef0.e0;
import com.amazon.aps.iva.ef0.i;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import okhttp3.internal.Util;
/* compiled from: Relay.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u00107\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0011\u0010@\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b@\u00104¨\u0006E"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lcom/amazon/aps/iva/ef0/i;", "prefix", "", "upstreamSize", "metadataSize", "Lcom/amazon/aps/iva/kb0/q;", "writeHeader", "writeMetadata", "commit", "metadata", "Lcom/amazon/aps/iva/ef0/d0;", "newSource", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lcom/amazon/aps/iva/ef0/d0;", "getUpstream", "()Lcom/amazon/aps/iva/ef0/d0;", "setUpstream", "(Lcom/amazon/aps/iva/ef0/d0;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lcom/amazon/aps/iva/ef0/i;", "bufferMaxSize", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lcom/amazon/aps/iva/ef0/e;", "upstreamBuffer", "Lcom/amazon/aps/iva/ef0/e;", "getUpstreamBuffer", "()Lcom/amazon/aps/iva/ef0/e;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lcom/amazon/aps/iva/ef0/d0;JLcom/amazon/aps/iva/ef0/i;J)V", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Relay {
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;
    public static final i PREFIX_CLEAN;
    public static final i PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    private final e buffer;
    private final long bufferMaxSize;
    private boolean complete;
    private RandomAccessFile file;
    private final i metadata;
    private int sourceCount;
    private d0 upstream;
    private final e upstreamBuffer;
    private long upstreamPos;
    private Thread upstreamReader;

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lcom/amazon/aps/iva/ef0/d0;", "upstream", "Lcom/amazon/aps/iva/ef0/i;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lcom/amazon/aps/iva/ef0/i;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final Relay edit(File file, d0 d0Var, i iVar, long j) throws IOException {
            j.f(file, "file");
            j.f(d0Var, "upstream");
            j.f(iVar, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, d0Var, 0L, iVar, j, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        public final Relay read(File file) throws IOException {
            j.f(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            j.e(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            e eVar = new e();
            fileOperator.read(0L, eVar, 32L);
            i iVar = Relay.PREFIX_CLEAN;
            if (j.a(eVar.T(iVar.c()), iVar)) {
                long readLong = eVar.readLong();
                long readLong2 = eVar.readLong();
                e eVar2 = new e();
                fileOperator.read(readLong + 32, eVar2, readLong2);
                return new Relay(randomAccessFile, null, readLong, eVar2.h0(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    /* compiled from: Relay.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lcom/amazon/aps/iva/ef0/d0;", "Lcom/amazon/aps/iva/ef0/e;", "sink", "", "byteCount", "read", "Lcom/amazon/aps/iva/ef0/e0;", "timeout", "Lcom/amazon/aps/iva/kb0/q;", "close", "Lcom/amazon/aps/iva/ef0/e0;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class RelaySource implements d0 {
        private FileOperator fileOperator;
        private long sourcePos;
        private final e0 timeout = new e0();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            j.c(file);
            FileChannel channel = file.getChannel();
            j.e(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                q qVar = q.a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
            if (r4 != true) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
            r8 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            com.amazon.aps.iva.yb0.j.c(r2);
            r2.read(r19.sourcePos + 32, r20, r8);
            r19.sourcePos += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
            r0 = r19.this$0.getUpstream();
            com.amazon.aps.iva.yb0.j.c(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
            if (r14 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r0 = com.amazon.aps.iva.kb0.q.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
            r9 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().h(0, r20, r9);
            r19.sourcePos += r9;
            r13 = r19.fileOperator;
            com.amazon.aps.iva.yb0.j.c(r13);
            r13.write(r19.this$0.getUpstreamPos() + 32, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
            r2.getBuffer().write(r2.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
            if (r2.getBuffer().c <= r2.getBufferMaxSize()) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
            r2.getBuffer().e(r2.getBuffer().c - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0112, code lost:
            r2.setUpstreamPos(r2.getUpstreamPos() + r14);
            r0 = com.amazon.aps.iva.kb0.q.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x011c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
            r2.setUpstreamReader(null);
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0126, code lost:
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0127, code lost:
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012f, code lost:
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0131, code lost:
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
            r2.setUpstreamReader(null);
            r2.notifyAll();
            r3 = com.amazon.aps.iva.kb0.q.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
            throw r0;
         */
        @Override // com.amazon.aps.iva.ef0.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(com.amazon.aps.iva.ef0.e r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(com.amazon.aps.iva.ef0.e, long):long");
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public e0 timeout() {
            return this.timeout;
        }
    }

    static {
        i iVar = i.e;
        PREFIX_CLEAN = i.a.c("OkHttp cache v1\n");
        PREFIX_DIRTY = i.a.c("OkHttp DIRTY :(\n");
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, d0 d0Var, long j, i iVar, long j2, com.amazon.aps.iva.yb0.e eVar) {
        this(randomAccessFile, d0Var, j, iVar, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(i iVar, long j, long j2) throws IOException {
        boolean z;
        e eVar = new e();
        eVar.I(iVar);
        eVar.R(j);
        eVar.R(j2);
        if (eVar.c == 32) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RandomAccessFile randomAccessFile = this.file;
            j.c(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            j.e(channel, "file!!.channel");
            new FileOperator(channel).write(0L, eVar, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j) throws IOException {
        e eVar = new e();
        eVar.I(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        j.c(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        j.e(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j, eVar, this.metadata.c());
    }

    public final void commit(long j) throws IOException {
        writeMetadata(j);
        RandomAccessFile randomAccessFile = this.file;
        j.c(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j, this.metadata.c());
        RandomAccessFile randomAccessFile2 = this.file;
        j.c(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            q qVar = q.a;
        }
        d0 d0Var = this.upstream;
        if (d0Var != null) {
            Util.closeQuietly(d0Var);
        }
        this.upstream = null;
    }

    public final e getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    public final d0 getUpstream() {
        return this.upstream;
    }

    public final e getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        if (this.file == null) {
            return true;
        }
        return false;
    }

    public final i metadata() {
        return this.metadata;
    }

    public final d0 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final void setFile(RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i) {
        this.sourceCount = i;
    }

    public final void setUpstream(d0 d0Var) {
        this.upstream = d0Var;
    }

    public final void setUpstreamPos(long j) {
        this.upstreamPos = j;
    }

    public final void setUpstreamReader(Thread thread) {
        this.upstreamReader = thread;
    }

    private Relay(RandomAccessFile randomAccessFile, d0 d0Var, long j, i iVar, long j2) {
        this.file = randomAccessFile;
        this.upstream = d0Var;
        this.upstreamPos = j;
        this.metadata = iVar;
        this.bufferMaxSize = j2;
        this.upstreamBuffer = new e();
        this.complete = this.upstream == null;
        this.buffer = new e();
    }
}
