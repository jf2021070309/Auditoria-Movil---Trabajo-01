package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.Deque;
/* loaded from: classes4.dex */
final class SeekableByteChannelDecrypter implements SeekableByteChannel {
    byte[] associatedData;
    long cachedPosition;
    SeekableByteChannel ciphertextChannel;
    long startingPosition;
    SeekableByteChannel attemptingChannel = null;
    SeekableByteChannel matchingChannel = null;
    Deque<StreamingAead> remainingPrimitives = new ArrayDeque();

    public SeekableByteChannelDecrypter(PrimitiveSet<StreamingAead> primitiveSet, SeekableByteChannel seekableByteChannel, byte[] bArr) throws IOException {
        for (PrimitiveSet.Entry<StreamingAead> entry : primitiveSet.getRawPrimitives()) {
            this.remainingPrimitives.add(entry.getPrimitive());
        }
        this.ciphertextChannel = seekableByteChannel;
        this.cachedPosition = -1L;
        this.startingPosition = seekableByteChannel.position();
        this.associatedData = (byte[]) bArr.clone();
    }

    private synchronized SeekableByteChannel nextAttemptingChannel() throws IOException {
        SeekableByteChannel newSeekableDecryptingChannel;
        while (!this.remainingPrimitives.isEmpty()) {
            this.ciphertextChannel.position(this.startingPosition);
            try {
                newSeekableDecryptingChannel = this.remainingPrimitives.removeFirst().newSeekableDecryptingChannel(this.ciphertextChannel, this.associatedData);
                long j = this.cachedPosition;
                if (j >= 0) {
                    newSeekableDecryptingChannel.position(j);
                }
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
        return newSeekableDecryptingChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextChannel.close();
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.ciphertextChannel.isOpen();
    }

    @Override // java.nio.channels.SeekableByteChannel
    @CanIgnoreReturnValue
    public synchronized SeekableByteChannel position(long j) throws IOException {
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            seekableByteChannel.position(j);
        } else if (j >= 0) {
            this.cachedPosition = j;
            SeekableByteChannel seekableByteChannel2 = this.attemptingChannel;
            if (seekableByteChannel2 != null) {
                seekableByteChannel2.position(j);
            }
        } else {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        return this;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() == 0) {
            return 0;
        }
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            return seekableByteChannel.read(byteBuffer);
        }
        if (this.attemptingChannel == null) {
            this.attemptingChannel = nextAttemptingChannel();
        }
        while (true) {
            try {
                int read = this.attemptingChannel.read(byteBuffer);
                if (read == 0) {
                    return 0;
                }
                this.matchingChannel = this.attemptingChannel;
                this.attemptingChannel = null;
                return read;
            } catch (IOException unused) {
                this.attemptingChannel = nextAttemptingChannel();
            }
        }
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long size() throws IOException {
        SeekableByteChannel seekableByteChannel;
        seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
        } else {
            throw new IOException("Cannot determine size before first read()-call.");
        }
        return seekableByteChannel.size();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() throws IOException {
        SeekableByteChannel seekableByteChannel = this.matchingChannel;
        if (seekableByteChannel != null) {
            return seekableByteChannel.position();
        }
        return this.cachedPosition;
    }
}
