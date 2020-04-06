/**
 * Copyright © 2016-2020 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.queue.common;

import com.google.gson.annotations.Expose;
import lombok.Data;
import org.thingsboard.server.queue.TbQueueMsg;
import org.thingsboard.server.queue.TbQueueMsgHeaders;

import java.util.UUID;

@Data
public class DefaultTbQueueMsg implements TbQueueMsg {
    private final UUID key;
    private final byte[] data;

    public DefaultTbQueueMsg(UUID key, byte[] data) {
        this.key = key;
        this.data = data;
    }

    @Expose(serialize = false, deserialize = false)
    private TbQueueMsgHeaders headers;
}