/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.handler.codec.http;

import io.netty.buffer.ByteBuf;

/**
 * The default {@link HttpContent} implementation.
 */
public class DefaultHttpContent extends DefaultHttpObject implements HttpContent {

    private final ByteBuf content;

    /**
     * Creates a new instance with the specified chunk content.
     */
    public DefaultHttpContent(ByteBuf content) {
        if (content == null) {
            throw new NullPointerException("content");
        }
        this.content = content;
    }

    @Override
    public ByteBuf content() {
        return content;
    }

    @Override
    public boolean isFreed() {
        return content.isFreed();
    }

    @Override
    public void free() {
        content.free();
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append(getClass().getSimpleName());

        buf.append(" size: ");
        buf.append(content().readableBytes());

        buf.append(", decodeResult: ");
        buf.append(getDecoderResult());
        buf.append(')');

        return buf.toString();
    }
}
