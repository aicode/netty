/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.netty.channel.udt.nio;

import io.netty.buffer.BufType;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class NioUdtMessageConnectorChannelTest extends AbstractUdtTest {

    protected static final Logger log = LoggerFactory.getLogger(NioUdtByteAcceptorChannelTest.class);

    /**
     * verify channel meta data
     */
    @Test
    public void metadata() throws Exception {

        assertEquals(BufType.MESSAGE, new NioUdtMessageConnectorChannel()
                .metadata().bufferType());

    }

}
